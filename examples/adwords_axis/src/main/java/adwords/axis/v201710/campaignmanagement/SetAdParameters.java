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

package adwords.axis.v201710.campaignmanagement;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201710.cm.AdParam;
import com.google.api.ads.adwords.axis.v201710.cm.AdParamOperation;
import com.google.api.ads.adwords.axis.v201710.cm.AdParamServiceInterface;
import com.google.api.ads.adwords.axis.v201710.cm.ApiError;
import com.google.api.ads.adwords.axis.v201710.cm.ApiException;
import com.google.api.ads.adwords.axis.v201710.cm.Operator;
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

/**
 * This example sets ad parameters for a keyword ad group criterion. To get ad
 * group criteria, run GetKeywords.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class SetAdParameters {

  private static class SetAdParametersParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private Long adGroupId;

    @Parameter(names = ArgumentNames.KEYWORD_ID, required = true)
    private Long keywordId;
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

    SetAdParametersParams params = new SetAdParametersParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");
      params.keywordId = Long.parseLong("INSERT_KEYWORD_ID_HERE");
    }

    try {
      runExample(adWordsServices, session, params.adGroupId, params.keywordId);
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
   * @param adGroupId the ID of the ad group of the keyword.
   * @param keywordId the ID of the keyword.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(
      AdWordsServicesInterface adWordsServices,
      AdWordsSession session,
      Long adGroupId,
      Long keywordId)
      throws RemoteException {
    // Get the AdParamService.
    AdParamServiceInterface adParamService =
        adWordsServices.get(session, AdParamServiceInterface.class);

    // Create ad params.
    AdParam adParam1 = new AdParam();
    adParam1.setAdGroupId(adGroupId);
    adParam1.setCriterionId(keywordId);
    adParam1.setInsertionText("100");
    adParam1.setParamIndex(1);

    AdParam adParam2 = new AdParam();
    adParam2.setAdGroupId(adGroupId);
    adParam2.setCriterionId(keywordId);
    adParam2.setInsertionText("$40");
    adParam2.setParamIndex(2);

    // Create operations.
    AdParamOperation adParamOperation1 = new AdParamOperation();
    adParamOperation1.setOperand(adParam1);
    adParamOperation1.setOperator(Operator.SET);

    AdParamOperation adParamOperation2 = new AdParamOperation();
    adParamOperation2.setOperand(adParam2);
    adParamOperation2.setOperator(Operator.SET);

    AdParamOperation[] operations = new AdParamOperation[] {adParamOperation1, adParamOperation2};

    // Set ad parameters.
    AdParam[] adParams = adParamService.mutate(operations);

    // Display ad parameters.
    for (AdParam adParam : adParams) {
      System.out.printf("Ad parameter with ad group ID %d, criterion ID %d, insertion text "
          + "'%s', and parameter index %d was set.%n", adParam.getAdGroupId(), 
          adParam.getCriterionId(), adParam.getInsertionText(), adParam.getParamIndex());
    }
  }
}
