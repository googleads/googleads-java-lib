// Copyright 2017 Google Inc. All Rights Reserved.
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

package adwords.axis.v201802.errorhandling;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupAd;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupAdOperation;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupAdReturnValue;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupAdServiceInterface;
import com.google.api.ads.adwords.axis.v201802.cm.ApiError;
import com.google.api.ads.adwords.axis.v201802.cm.ApiException;
import com.google.api.ads.adwords.axis.v201802.cm.ExemptionRequest;
import com.google.api.ads.adwords.axis.v201802.cm.ExpandedTextAd;
import com.google.api.ads.adwords.axis.v201802.cm.FieldPathElement;
import com.google.api.ads.adwords.axis.v201802.cm.Operator;
import com.google.api.ads.adwords.axis.v201802.cm.PolicyViolationError;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.utils.examples.ArgumentNames;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Sets;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * This example demonstrates how to handle policy violation errors.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class HandlePolicyViolationError {

  private static class HandlePolicyViolationErrorParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private Long adGroupId;
  }

  public static void main(String[] args) {
    AdWordsSession session;
    try {
      // Generate a refreshable OAuth2 credential.
      Credential oAuth2Credential =
          new OfflineCredentials.Builder()
              .forApi(Api.ADWORDS)
              .fromFile()
              .build()
              .generateCredential();

      // Construct an AdWordsSession.
      session =
          new AdWordsSession.Builder().fromFile().withOAuth2Credential(oAuth2Credential).build();
    } catch (ConfigurationLoadException cle) {
      System.err.printf(
          "Failed to load configuration from the %s file. Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, cle);
      return;
    } catch (ValidationException ve) {
      System.err.printf(
          "Invalid configuration in the %s file. Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, ve);
      return;
    } catch (OAuthException oe) {
      System.err.printf(
          "Failed to create OAuth credentials. Check OAuth settings in the %s file. "
              + "Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, oe);
      return;
    }

    AdWordsServicesInterface adWordsServices = AdWordsServices.getInstance();

    HandlePolicyViolationErrorParams params = new HandlePolicyViolationErrorParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");
    }

    try {
      runExample(adWordsServices, session, params.adGroupId);
    } catch (ApiException apiException) {
      // ApiException is the base class for most exceptions thrown by an API request. Instances
      // of this exception have a message and a collection of ApiErrors that indicate the
      // type and underlying cause of the exception. Every exception object in the adwords.axis
      // packages will return a meaningful value from toString
      //
      // ApiException extends RemoteException, so this catch block must appear before the
      // catch block for RemoteException.
      System.err.println("Request failed due to ApiException. Underlying ApiErrors:");
      if (apiException.getErrors() != null) {
        int i = 0;
        for (ApiError apiError : apiException.getErrors()) {
          System.err.printf("  Error %d: %s%n", i++, apiError);
        }
      }
    } catch (RemoteException re) {
      System.err.printf(
          "Request failed unexpectedly due to RemoteException: %s%n", re);
    }
  }

  /**
   * Runs the example.
   *
   * @param adWordsServices the services factory.
   * @param session the session.
   * @param adGroupId the ID of the ad group.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, Long adGroupId)
      throws RemoteException {
    // Enable validateOnly mode.
    session.setValidateOnly(true);

    // Get the AdGroupAdService.
    AdGroupAdServiceInterface adGroupAdService =
        adWordsServices.get(session, AdGroupAdServiceInterface.class);

    // Create text ad that violates an exemptable policy.
    ExpandedTextAd exemptableExpandedTextAd = new ExpandedTextAd();
    exemptableExpandedTextAd.setHeadlinePart1("Mars " + System.currentTimeMillis() + "!!!");
    exemptableExpandedTextAd.setHeadlinePart2("Best space cruise line.");
    exemptableExpandedTextAd.setDescription("Visit the Red Planet in style.");
    exemptableExpandedTextAd.setFinalUrls(new String[] {"http://www.example.com/"});

    // Create ad group ad.
    AdGroupAd exemptableAdGroupAd = new AdGroupAd();
    exemptableAdGroupAd.setAdGroupId(adGroupId);
    exemptableAdGroupAd.setAd(exemptableExpandedTextAd);

    // Create operations.
    AdGroupAdOperation exemptableOperation = new AdGroupAdOperation();
    exemptableOperation.setOperand(exemptableAdGroupAd);
    exemptableOperation.setOperator(Operator.ADD);

    // Create text ad that violates a non-exemptable policy.
    ExpandedTextAd nonExemptableExpandedTextAd = new ExpandedTextAd();
    nonExemptableExpandedTextAd.setHeadlinePart1("Mars Cruise with too long of a headline.");
    nonExemptableExpandedTextAd.setHeadlinePart2("Best space cruise line.");
    nonExemptableExpandedTextAd.setDescription("Visit the Red Planet in style.");
    nonExemptableExpandedTextAd.setFinalUrls(new String[] {"http://www.example.com/"});

    // Create ad group ad.
    AdGroupAd nonExemptableAdGroupAd = new AdGroupAd();
    nonExemptableAdGroupAd.setAdGroupId(adGroupId);
    nonExemptableAdGroupAd.setAd(nonExemptableExpandedTextAd);

    // Create operations.
    AdGroupAdOperation nonExemptableOperation = new AdGroupAdOperation();
    nonExemptableOperation.setOperand(nonExemptableAdGroupAd);
    nonExemptableOperation.setOperator(Operator.ADD);

    AdGroupAdOperation[] operations =
        new AdGroupAdOperation[] {exemptableOperation, nonExemptableOperation};

    // Use a LinkedHashSet to store each operation index to retry only once and in
    // the same order as the original array of operations.
    Set<Integer> operationIndicesToRetry = Sets.newLinkedHashSet();
    try {
      // Validate the ads.
      adGroupAdService.mutate(operations);
    } catch (ApiException e) {
      for (ApiError error : e.getErrors()) {
        // Get the index of the failed operation from the error's field path elements.
        FieldPathElement[] fieldPathElements = error.getFieldPathElements();
        FieldPathElement firstFieldPathElement = null;
        if (fieldPathElements != null && fieldPathElements.length > 0) {
          firstFieldPathElement = fieldPathElements[0];
        }
        if (firstFieldPathElement == null
            || !"operations".equals(firstFieldPathElement.getField())
            || firstFieldPathElement.getIndex() == null) {
          // If the operation index is not present on the first error field path element, then
          // there's no way to determine which operation to remove, so simply throw the exception.
          throw e;
        }
        int operationIndex = firstFieldPathElement.getIndex();
        AdGroupAdOperation operation = operations[operationIndex];
        if (handleApiError(error, operationIndex, operation)) {
          operationIndicesToRetry.add(operationIndex);
        } else {
          System.out.printf(
              "Removing operation with non-exemptable error at index %d.%n", operationIndex);
        }
      }
    }

    // Create a new list of operations consisting of only the operations that should be retried.
    List<AdGroupAdOperation> operationsToRetry = new ArrayList<>();
    for (Integer operationIndexToRetry : operationIndicesToRetry) {
      operationsToRetry.add(operations[operationIndexToRetry]);
    }

    if (!operationsToRetry.isEmpty()) {
      // Disable validateOnly so we can submit the AdGroupAds with exemptions.
      session.setValidateOnly(false);

      // Add ads with exemptions.
      AdGroupAdReturnValue result =
          adGroupAdService.mutate(
              operationsToRetry.toArray(new AdGroupAdOperation[operationsToRetry.size()]));

      // Display ads.
      if (result != null && result.getValue() != null) {
        for (AdGroupAd adGroupAdResult : result.getValue()) {
          ExpandedTextAd expandedTextAd = (ExpandedTextAd) adGroupAdResult.getAd();
          System.out.printf(
              "Ad with ID %d and headline '%s - %s' was added.%n",
              expandedTextAd.getId(),
              expandedTextAd.getHeadlinePart1(),
              expandedTextAd.getHeadlinePart2());
        }
      }
    } else {
      System.out.println("No ads were added.");
    }
  }

  /**
   * Checks the given error and performs the appropriate action based on whether it is an exemptable
   * policy violation error.
   *
   * @param error the error to handle.
   * @param operationIndex the index of the operation that led to the error.
   * @param operation the operation that led to the error.
   * @return true if the error is an exemptable policy violation error.
   */
  private static boolean handleApiError(
      ApiError error, int operationIndex, AdGroupAdOperation operation) {
    // Determine if the operation can be resubmitted with an exemption request.
    boolean isExemptableError = false;
    PolicyViolationError policyViolationError = null;
    if (error instanceof PolicyViolationError) {
      policyViolationError = (PolicyViolationError) error;
      ExpandedTextAd expandedTextAd = (ExpandedTextAd) operation.getOperand().getAd();
      System.out.printf(
          "Ad with headline '%s - %s' violated %s policy '%s'.%n",
          expandedTextAd.getHeadlinePart1(),
          expandedTextAd.getHeadlinePart2(),
          policyViolationError.getIsExemptable() ? "exemptable" : "non-exemptable",
          policyViolationError.getExternalPolicyName());
      isExemptableError = policyViolationError.getIsExemptable();
    }

    if (isExemptableError) {
      // Add exemption request to the operation.
      System.out.printf(
          "Adding exemption request for policy name '%s' on text '%s' to operation at index %d.%n",
          policyViolationError.getKey().getPolicyName(),
          policyViolationError.getKey().getViolatingText(),
          operationIndex);
      ExemptionRequest exemptionRequest = new ExemptionRequest();
      exemptionRequest.setKey(policyViolationError.getKey());

      List<ExemptionRequest> exemptionRequests =
          (operation.getExemptionRequests() == null)
              ? new ArrayList<ExemptionRequest>()
              : new ArrayList<>(Arrays.asList(operation.getExemptionRequests()));
      exemptionRequests.add(exemptionRequest);
      operation.setExemptionRequests(
          exemptionRequests.toArray(new ExemptionRequest[exemptionRequests.size()]));
    }
    return isExemptableError;
  }
}
