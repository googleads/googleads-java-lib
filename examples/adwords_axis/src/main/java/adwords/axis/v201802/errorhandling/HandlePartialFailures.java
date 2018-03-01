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
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupCriterion;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupCriterionOperation;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupCriterionReturnValue;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupCriterionServiceInterface;
import com.google.api.ads.adwords.axis.v201802.cm.ApiError;
import com.google.api.ads.adwords.axis.v201802.cm.ApiException;
import com.google.api.ads.adwords.axis.v201802.cm.BiddableAdGroupCriterion;
import com.google.api.ads.adwords.axis.v201802.cm.FieldPathElement;
import com.google.api.ads.adwords.axis.v201802.cm.Keyword;
import com.google.api.ads.adwords.axis.v201802.cm.KeywordMatchType;
import com.google.api.ads.adwords.axis.v201802.cm.Operator;
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
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

/**
 * This example demonstrates how to handle partial failures.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class HandlePartialFailures {

  private static class HandlePartialFailuresParams extends CodeSampleParams {
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

    HandlePartialFailuresParams params = new HandlePartialFailuresParams();
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
    // Enable partial failure.
    session.setPartialFailure(true);

    // Get the AdGroupCriterionService.
    AdGroupCriterionServiceInterface adGroupCriterionService =
        adWordsServices.get(session, AdGroupCriterionServiceInterface.class);

    List<AdGroupCriterionOperation> operations = new ArrayList<AdGroupCriterionOperation>();

    // Create keywords.
    String[] keywords =
        new String[] {"mars cruise", "inv@lid cruise", "venus cruise", "b(a)d keyword cruise"};
    for (String keywordText : keywords) {
      // Create keyword
      Keyword keyword = new Keyword();
      keyword.setText(keywordText);
      keyword.setMatchType(KeywordMatchType.BROAD);

      // Create biddable ad group criterion.
      BiddableAdGroupCriterion keywordBiddableAdGroupCriterion = new BiddableAdGroupCriterion();
      keywordBiddableAdGroupCriterion.setAdGroupId(adGroupId);
      keywordBiddableAdGroupCriterion.setCriterion(keyword);

      // Create operation.
      AdGroupCriterionOperation keywordAdGroupCriterionOperation =
          new AdGroupCriterionOperation();
      keywordAdGroupCriterionOperation.setOperand(keywordBiddableAdGroupCriterion);
      keywordAdGroupCriterionOperation.setOperator(Operator.ADD);
      operations.add(keywordAdGroupCriterionOperation);
    }

    // Add ad group criteria.
    AdGroupCriterionReturnValue result =
        adGroupCriterionService.mutate(operations.toArray(new AdGroupCriterionOperation[] {}));

    // Display results.
    for (AdGroupCriterion adGroupCriterionResult : result.getValue()) {
      if (adGroupCriterionResult.getCriterion() != null) {
        System.out.printf("Ad group criterion with ad group ID %d, and criterion ID %d, "
            + "and keyword '%s' was added.%n", adGroupCriterionResult.getAdGroupId(),
            adGroupCriterionResult.getCriterion().getId(),
            ((Keyword) adGroupCriterionResult.getCriterion()).getText());
      }
    }

    for (ApiError apiError : result.getPartialFailureErrors()) {
      // Get the index of the failed operation from the error's field path elements.
      FieldPathElement[] fieldPathElements = apiError.getFieldPathElements();
      FieldPathElement firstFieldPathElement = null;
      if (fieldPathElements != null && fieldPathElements.length > 0) {
        firstFieldPathElement = fieldPathElements[0];
      }
      if (firstFieldPathElement != null
          && "operations".equals(firstFieldPathElement.getField())
          && firstFieldPathElement.getIndex() != null) {
        int operationIndex = firstFieldPathElement.getIndex();
        AdGroupCriterion adGroupCriterion = operations.get(operationIndex).getOperand();
        System.out.printf(
            "Ad group criterion with ad group ID %d and keyword '%s' "
                + "triggered a failure for the following reason: %s.%n",
            adGroupCriterion.getAdGroupId(),
            ((Keyword) adGroupCriterion.getCriterion()).getText(),
            apiError.getErrorString());
      } else {
        System.out.printf(
            "A failure has occurred for the following reason: %s%n", apiError.getErrorString());
      }
    }
  }
}
