// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package adwords.axis.v201809.basicoperations;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201809.cm.AdOperation;
import com.google.api.ads.adwords.axis.v201809.cm.AdServiceInterface;
import com.google.api.ads.adwords.axis.v201809.cm.ApiError;
import com.google.api.ads.adwords.axis.v201809.cm.ApiException;
import com.google.api.ads.adwords.axis.v201809.cm.ExpandedTextAd;
import com.google.api.ads.adwords.axis.v201809.cm.Operator;
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
 * This example updates an expanded text ad. To get expanded text ads, run GetExpandedTextAds.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class UpdateExpandedTextAd {

  private static class UpdateAdGroupParams extends CodeSampleParams {
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

    UpdateAdGroupParams params = new UpdateAdGroupParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.adId = Long.parseLong("INSERT_AD_ID_HERE");
    }

    try {
      runExample(adWordsServices, session, params.adId);
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
      System.err.printf("Request failed unexpectedly due to RemoteException: %s%n", re);
    }
  }

  /**
   * Runs the example.
   *
   * @param adWordsServices the services factory.
   * @param session the session.
   * @param adId the ID of the ad to update.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, Long adId)
      throws RemoteException {
    // Get the AdService.
    AdServiceInterface adService = adWordsServices.get(session, AdServiceInterface.class);

    // Creates an expanded text ad using the provided ad ID.
    ExpandedTextAd expandedTextAd = new ExpandedTextAd();
    expandedTextAd.setId(adId);
    // Updates some properties of the expanded text ad.
    expandedTextAd.setHeadlinePart1("Cruise to Pluto #" + System.currentTimeMillis());
    expandedTextAd.setHeadlinePart2("Tickets on sale now");
    expandedTextAd.setDescription("Best space cruise ever.");
    expandedTextAd.setFinalUrls(new String[] {"http://www.example.com/"});
    expandedTextAd.setFinalMobileUrls(new String[] {"http://www.example.com/mobile"});

    // Creates ad group ad operation and adds it to the list.
    AdOperation operation = new AdOperation();
    operation.setOperator(Operator.SET);
    operation.setOperand(expandedTextAd);

    // Updates the ad on the server.
    ExpandedTextAd updatedAd =
        (ExpandedTextAd) adService.mutate(new AdOperation[] {operation}).getValue(0);

    // Prints out some information.
    System.out.printf("Expanded text ad with ID %d was updated.%n", updatedAd.getId());
    System.out.printf(
        "Headline part 1 is '%s'.%nHeadline part 2 is '%s'.%nDescription is '%s'.%n",
        updatedAd.getHeadlinePart1(), updatedAd.getHeadlinePart2(), updatedAd.getDescription());
    System.out.printf(
        "Final URL is '%s'.%nFinal mobile URL is '%s'.%n",
        updatedAd.getFinalUrls()[0], updatedAd.getFinalMobileUrls()[0]);
  }
}
