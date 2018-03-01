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

package adwords.axis.v201802.basicoperations;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201802.cm.Ad;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupAd;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupAdOperation;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupAdReturnValue;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupAdServiceInterface;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupAdStatus;
import com.google.api.ads.adwords.axis.v201802.cm.ApiError;
import com.google.api.ads.adwords.axis.v201802.cm.ApiException;
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

/**
 * This example updates status for a given ad. To get ads, run GetExpandedTextAds.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class PauseAd {

  private static class PauseAdParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private Long adGroupId;

    @Parameter(names = ArgumentNames.AD_ID, required = true)
    private Long adId;
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

    PauseAdParams params = new PauseAdParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");
      params.adId = Long.parseLong("INSERT_AD_ID_HERE");
    }

    try {
      runExample(adWordsServices, session, params.adGroupId, params.adId);
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
   * @param adGroupId the ID of the ad group for the ad.
   * @param adId the ID of the ad to pause.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, Long adGroupId, Long adId)
      throws RemoteException {
    // Get the AdGroupAdService.
    AdGroupAdServiceInterface adGroupAdService =
        adWordsServices.get(session, AdGroupAdServiceInterface.class);

    // Create ad with updated status.
    Ad ad = new Ad();
    ad.setId(adId);

    AdGroupAd adGroupAd = new AdGroupAd();
    adGroupAd.setAdGroupId(adGroupId);
    adGroupAd.setAd(ad);
    adGroupAd.setStatus(AdGroupAdStatus.PAUSED);

    // Create operations.
    AdGroupAdOperation operation = new AdGroupAdOperation();
    operation.setOperand(adGroupAd);
    operation.setOperator(Operator.SET);

    AdGroupAdOperation[] operations = new AdGroupAdOperation[] {operation};

    // Update ad.
    AdGroupAdReturnValue result = adGroupAdService.mutate(operations);

    // Display ads.
    for (AdGroupAd adGroupAdResult : result.getValue()) {
      System.out.printf("Ad with ID %d, type '%s', and status '%s' was updated.%n",
          adGroupAdResult.getAd().getId(), adGroupAdResult.getAd().getAdType(), 
          adGroupAdResult.getStatus());
    }
  }
}
