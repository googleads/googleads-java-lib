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
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupAd;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupAdOperation;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupAdReturnValue;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupAdServiceInterface;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupAdStatus;
import com.google.api.ads.adwords.axis.v201802.cm.ApiError;
import com.google.api.ads.adwords.axis.v201802.cm.ApiException;
import com.google.api.ads.adwords.axis.v201802.cm.ExpandedTextAd;
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
 * This example adds several expanded text ads to a given ad group. To get ad groups, run
 * GetAdGroups.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class AddExpandedTextAds {

  private static final int NUMBER_OF_ADS = 5;

  private static class AddExpandedTextAdsParams extends CodeSampleParams {
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

    AddExpandedTextAdsParams params = new AddExpandedTextAdsParams();
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
   * @param adGroupId the ID of the ad group where the ad will be created.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, long adGroupId)
      throws RemoteException {
    // Get the AdGroupAdService.
    AdGroupAdServiceInterface adGroupAdService =
        adWordsServices.get(session, AdGroupAdServiceInterface.class);

    List<AdGroupAdOperation> operations = new ArrayList<>();

    for (int i = 0; i < NUMBER_OF_ADS; i++) {
      // Create expanded text ad.
      ExpandedTextAd expandedTextAd = new ExpandedTextAd();
      expandedTextAd.setHeadlinePart1(String.format("Cruise #%d to Mars", i));
      expandedTextAd.setHeadlinePart2("Best Space Cruise Line");
      expandedTextAd.setDescription("Buy your tickets now!");
      expandedTextAd.setFinalUrls(new String[] {"http://www.example.com/" + i});

      // Create ad group ad.
      AdGroupAd expandedTextAdGroupAd = new AdGroupAd();
      expandedTextAdGroupAd.setAdGroupId(adGroupId);
      expandedTextAdGroupAd.setAd(expandedTextAd);

      // Optional: set the status.
      expandedTextAdGroupAd.setStatus(AdGroupAdStatus.PAUSED);

      // Create the operation.
      AdGroupAdOperation adGroupAdOperation = new AdGroupAdOperation();
      adGroupAdOperation.setOperand(expandedTextAdGroupAd);
      adGroupAdOperation.setOperator(Operator.ADD);

      operations.add(adGroupAdOperation);
    }

    // Add ads.
    AdGroupAdReturnValue result =
        adGroupAdService.mutate(operations.toArray(new AdGroupAdOperation[operations.size()]));

    // Display ads.
    for (AdGroupAd adGroupAdResult : result.getValue()) {
      ExpandedTextAd newAd = (ExpandedTextAd) adGroupAdResult.getAd();
      System.out.printf("Expanded text ad with ID %d and headline '%s - %s' was added.%n",
          newAd.getId(), newAd.getHeadlinePart1(), newAd.getHeadlinePart2());
    }
  }
}
