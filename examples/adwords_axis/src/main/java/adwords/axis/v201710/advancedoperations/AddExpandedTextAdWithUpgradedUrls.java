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

package adwords.axis.v201710.advancedoperations;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupAd;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupAdOperation;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupAdServiceInterface;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupAdStatus;
import com.google.api.ads.adwords.axis.v201710.cm.ApiError;
import com.google.api.ads.adwords.axis.v201710.cm.ApiException;
import com.google.api.ads.adwords.axis.v201710.cm.CustomParameter;
import com.google.api.ads.adwords.axis.v201710.cm.CustomParameters;
import com.google.api.ads.adwords.axis.v201710.cm.ExpandedTextAd;
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
 * This example adds an expanded text ad that uses advanced features of upgraded URLs.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class AddExpandedTextAdWithUpgradedUrls {

  private static class AddExpandedTextAdWithUpgradedUrlsParams extends CodeSampleParams {
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

    AddExpandedTextAdWithUpgradedUrlsParams params = new AddExpandedTextAdWithUpgradedUrlsParams();
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

    // Create expanded text ad with a tracking template and custom parameters.
    ExpandedTextAd expandedTextAd = new ExpandedTextAd();
    expandedTextAd.setHeadlinePart1("Luxury Cruise to Mars");
    expandedTextAd.setHeadlinePart2("Visit the Red Planet in style.");
    expandedTextAd.setDescription("Low-gravity fun for everyone!");

    // Specify a tracking url for 3rd party tracking provider. You may
    // specify one at customer, campaign, ad group, ad, criterion or
    // feed item levels.
    expandedTextAd.setTrackingUrlTemplate(
        "http://tracker.example.com/?season={_season}&promocode={_promocode}&u={lpurl}");

    // Since your tracking url has two custom parameters, provide their
    // values too. This can be provided at campaign, ad group, ad, criterion
    // or feed item levels.
    CustomParameter seasonParameter = new CustomParameter();
    seasonParameter.setKey("season");
    seasonParameter.setValue("christmas");

    CustomParameter promoCodeParameter = new CustomParameter();
    promoCodeParameter.setKey("promocode");
    promoCodeParameter.setValue("NYC123");

    CustomParameters trackingUrlParameters = new CustomParameters();
    trackingUrlParameters.setParameters(
        new CustomParameter[] {seasonParameter, promoCodeParameter});
    expandedTextAd.setUrlCustomParameters(trackingUrlParameters);

    // Specify a list of final urls. This field cannot be set if url field is
    // set. This may be specified at ad, criterion, and feed item levels.
    expandedTextAd.setFinalUrls(new String[] {"http://www.example.com/cruise/space/",
        "http://www.example.com/locations/mars/"});

    // Specify a list of final mobile urls. This field cannot be set if url field is
    // set or finalUrls is not set. This may be specified at ad, criterion, and feed
    // item levels.
    expandedTextAd.setFinalMobileUrls(new String[] {"http://mobile.example.com/cruise/space/",
        "http://mobile.example.com/locations/mars/"});

    // Create ad group ad.
    AdGroupAd textAdGroupAd = new AdGroupAd();
    textAdGroupAd.setAdGroupId(adGroupId);
    textAdGroupAd.setAd(expandedTextAd);

    // Optional: Set status.
    textAdGroupAd.setStatus(AdGroupAdStatus.PAUSED);

    // Create operation.
    AdGroupAdOperation textAdGroupAdOperation = new AdGroupAdOperation();
    textAdGroupAdOperation.setOperand(textAdGroupAd);
    textAdGroupAdOperation.setOperator(Operator.ADD);

    AdGroupAdOperation[] operations =
        new AdGroupAdOperation[] {textAdGroupAdOperation};

    // Add ad.
    AdGroupAd adGroupAdResult = adGroupAdService.mutate(operations).getValue(0);

    // Display ad.
    System.out.printf("Ad with ID %d and tracking URL template '%s' was added.",
        adGroupAdResult.getAd().getId(), adGroupAdResult.getAd().getTrackingUrlTemplate());
  }
}
