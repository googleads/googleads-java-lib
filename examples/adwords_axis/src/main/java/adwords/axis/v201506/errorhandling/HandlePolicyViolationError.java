// Copyright 2015 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package adwords.axis.v201506.errorhandling;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201506.cm.AdGroupAd;
import com.google.api.ads.adwords.axis.v201506.cm.AdGroupAdOperation;
import com.google.api.ads.adwords.axis.v201506.cm.AdGroupAdReturnValue;
import com.google.api.ads.adwords.axis.v201506.cm.AdGroupAdServiceInterface;
import com.google.api.ads.adwords.axis.v201506.cm.ApiError;
import com.google.api.ads.adwords.axis.v201506.cm.ApiException;
import com.google.api.ads.adwords.axis.v201506.cm.ExemptionRequest;
import com.google.api.ads.adwords.axis.v201506.cm.Operator;
import com.google.api.ads.adwords.axis.v201506.cm.PolicyViolationError;
import com.google.api.ads.adwords.axis.v201506.cm.TextAd;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This example demonstrates how to handle policy violation errors.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class HandlePolicyViolationError {

  private static Pattern operationIndexPattern = Pattern.compile("^.*operations\\[(\\d+)\\].*$");

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.ADWORDS)
        .fromFile()
        .build()
        .generateCredential();

    // Construct an AdWordsSession.
    AdWordsSession session = new AdWordsSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    long adGroupId = Long.parseLong("INSERT_ADGROUP_ID_HERE");
    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session, adGroupId);
  }

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session, Long adGroupId) throws Exception {
    // Enable validateOnly mode.
    session.setValidateOnly(true);

    // Get the AdGroupAdService.
    AdGroupAdServiceInterface adGroupAdService =
        adWordsServices.get(session, AdGroupAdServiceInterface.class);

    // Create text ad that violates an exemptable policy. This ad will only
    // trigger an error in the production environment.
    TextAd exemptableTextAd = new TextAd();
    exemptableTextAd.setHeadline("Mars " + System.currentTimeMillis() + "!!!");
    exemptableTextAd.setDescription1("Visit the Red Planet in style.");
    exemptableTextAd.setDescription2("Low-gravity fun for everyone!");
    exemptableTextAd.setDisplayUrl("www.example.com");
    exemptableTextAd.setFinalUrls(new String[] {"http://www.example.com/"});

    // Create ad group ad.
    AdGroupAd exemptableAdGroupAd = new AdGroupAd();
    exemptableAdGroupAd.setAdGroupId(adGroupId);
    exemptableAdGroupAd.setAd(exemptableTextAd);

    // Create operations.
    AdGroupAdOperation exemptableOperation = new AdGroupAdOperation();
    exemptableOperation.setOperand(exemptableAdGroupAd);
    exemptableOperation.setOperator(Operator.ADD);

    // Create text ad that violates a non-exemptable policy.
    TextAd nonExemptableTextAd = new TextAd();
    nonExemptableTextAd.setHeadline("Mars Cruise with too long of a headline.");
    nonExemptableTextAd.setDescription1("Visit the Red Planet in style.");
    nonExemptableTextAd.setDescription2("Low-gravity fun for everyone.");
    nonExemptableTextAd.setDisplayUrl("www.example.com");
    nonExemptableTextAd.setFinalUrls(new String[] {"http://www.example.com/"});

    // Create ad group ad.
    AdGroupAd nonExemptableAdGroupAd = new AdGroupAd();
    nonExemptableAdGroupAd.setAdGroupId(adGroupId);
    nonExemptableAdGroupAd.setAd(nonExemptableTextAd);

    // Create operations.
    AdGroupAdOperation nonExemptableOperation = new AdGroupAdOperation();
    nonExemptableOperation.setOperand(nonExemptableAdGroupAd);
    nonExemptableOperation.setOperator(Operator.ADD);

    AdGroupAdOperation[] operations =
        new AdGroupAdOperation[] {exemptableOperation, nonExemptableOperation};

    boolean foundNonExemptableErrors;

    // Repeat the loop below with validateOnly = true until either no errors are found
    // or the only errors found have isExemptable == true.
    do {
      foundNonExemptableErrors = false;

      try {
        // Validate the ads.
        adGroupAdService.mutate(operations);
      } catch (ApiException e) {
        Set<Integer> indicesToRemove = new HashSet<Integer>();
        for (ApiError error : e.getErrors()) {
          if (error instanceof PolicyViolationError) {
            PolicyViolationError policyViolationError = (PolicyViolationError) error;
            Matcher matcher = operationIndexPattern.matcher(error.getFieldPath());
            if (matcher.matches()) {
              int operationIndex = Integer.parseInt(matcher.group(1));
              AdGroupAdOperation operation = operations[operationIndex];
              System.out.printf(
                  "Ad with headline '%s' violated %s policy '%s'.%n",
                  ((TextAd) operation.getOperand().getAd()).getHeadline(),
                  policyViolationError.getIsExemptable() ? "exemptable" : "non-exemptable",
                  policyViolationError.getExternalPolicyName());
              if (policyViolationError.getIsExemptable()) {
                // Add exemption request to the operation.
                System.out.printf(
                    "Adding exemption request for policy name '%s' on text '%s'.%n",
                    policyViolationError.getKey().getPolicyName(),
                    policyViolationError.getKey().getViolatingText());
                List<ExemptionRequest> exemptionRequests =
                    new ArrayList<ExemptionRequest>(
                        Arrays.asList(
                            operation.getExemptionRequests() == null
                                ? new ExemptionRequest[] {}
                                : operation.getExemptionRequests()));
                exemptionRequests.add(new ExemptionRequest(policyViolationError.getKey()));
                operation.setExemptionRequests(
                    exemptionRequests.toArray(new ExemptionRequest[] {}));
              } else {
                // Remove non-exemptable operation.
                System.out.printf(
                    "Removing non-exemptable operation at index %d.%n", operationIndex);
                indicesToRemove.add(operationIndex);
              }
            }
          } else {
            // Non-policy error returned.
            Matcher matcher = operationIndexPattern.matcher(error.getFieldPath());
            if (matcher.matches()) {
              int operationIndex = Integer.parseInt(matcher.group(1));
              AdGroupAdOperation operation = operations[operationIndex];
              System.out.printf(
                  "Ad with headline '%s' created non-policy error '%s'.%n",
                  ((TextAd) operation.getOperand().getAd()).getHeadline(),
                  error.getErrorString());
              System.out.printf(
                  "Removing non-exemptable operation at index %d.%n", operationIndex);
              indicesToRemove.add(operationIndex);
            }
          }
        }

        // Remove operations that cannot be exempted.
        List<AdGroupAdOperation> remainingOperations = new ArrayList<AdGroupAdOperation>();
        for (int i = 0; i < operations.length; i++) {
          if (!indicesToRemove.contains(i)) {
            foundNonExemptableErrors = true;
            remainingOperations.add(operations[i]);
          }
        }
        operations = remainingOperations.toArray(new AdGroupAdOperation[] {});
      }
    } while (foundNonExemptableErrors && operations.length > 0);

    if (operations.length > 0) {
      // Disable validateOnly so we can submit the AdGroupAds with exemptions.
      session.setValidateOnly(false);

      // Add ads with exemptions.
      AdGroupAdReturnValue result = adGroupAdService.mutate(operations);

      // Display ads.
      if (result != null && result.getValue() != null) {
        for (AdGroupAd adGroupAdResult : result.getValue()) {
          System.out.printf("Ad with ID %d and headline '%s' was added.%n", adGroupAdResult
              .getAd().getId(), ((TextAd) adGroupAdResult.getAd()).getHeadline());
        }
      }
    } else {
      System.out.println("No ads were added.");
    }
  }
}
