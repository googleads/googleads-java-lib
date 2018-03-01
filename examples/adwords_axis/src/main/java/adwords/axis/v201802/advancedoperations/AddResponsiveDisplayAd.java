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

package adwords.axis.v201802.advancedoperations;

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
import com.google.api.ads.adwords.axis.v201802.cm.DynamicSettings;
import com.google.api.ads.adwords.axis.v201802.cm.Image;
import com.google.api.ads.adwords.axis.v201802.cm.Media;
import com.google.api.ads.adwords.axis.v201802.cm.MediaMediaType;
import com.google.api.ads.adwords.axis.v201802.cm.MediaServiceInterface;
import com.google.api.ads.adwords.axis.v201802.cm.Operator;
import com.google.api.ads.adwords.axis.v201802.cm.ResponsiveDisplayAd;
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
import java.io.IOException;
import java.rmi.RemoteException;

/**
 * This example adds an image representing the ad using the MediaService and then adds a responsive
 * display ad to a given ad group. To get ad groups, run GetAdGroups.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class AddResponsiveDisplayAd {

  private static class AddResponsiveDisplayAdParams extends CodeSampleParams {
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

    AddResponsiveDisplayAdParams params = new AddResponsiveDisplayAdParams();
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
      System.err.printf("Request failed unexpectedly due to RemoteException: %s%n", re);
    } catch (IOException ioe) {
      System.err.printf("Example failed due to IOException: %s%n", ioe);
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
   * @throws IOException if uploading an image failed.
   */
  public static void runExample(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, long adGroupId)
      throws IOException {
    // Get the MediaService.
    MediaServiceInterface mediaService = adWordsServices.get(session, MediaServiceInterface.class);

    // Get the AdGroupAdService.
    AdGroupAdServiceInterface adGroupAdService =
        adWordsServices.get(session, AdGroupAdServiceInterface.class);

    // Create a responsive display ad.
    ResponsiveDisplayAd responsiveDisplayAd = new ResponsiveDisplayAd();

    // This ad format does not allow the creation of an image using the
    // Image.data field. An image must first be created using the MediaService,
    // and Image.mediaId must be populated when creating the ad.
    long marketingImageMediaId = uploadImage(mediaService, "https://goo.gl/3b9Wfh");
    Image marketingImage = new Image();
    marketingImage.setMediaId(marketingImageMediaId);
    responsiveDisplayAd.setMarketingImage(marketingImage);

    responsiveDisplayAd.setShortHeadline("Travel");
    responsiveDisplayAd.setLongHeadline("Travel the World");
    responsiveDisplayAd.setDescription("Take to the air!");
    responsiveDisplayAd.setBusinessName("Interplanetary Cruises");
    responsiveDisplayAd.setFinalUrls(new String[] {"http://www.example.com/"});

    // Optional: Create a square marketing image using MediaService, and set it
    // to the ad.
    long squareMarketingImageMediaId = uploadImage(mediaService, "https://goo.gl/mtt54n");
    Image squareMarketingImage = new Image();
    squareMarketingImage.setMediaId(squareMarketingImageMediaId);
    responsiveDisplayAd.setSquareMarketingImage(squareMarketingImage);

    // Optional: set call to action text.
    responsiveDisplayAd.setCallToActionText("Shop Now");

    // Optional: Set dynamic display ad settings, composed of landscape logo
    // image, promotion text, and price prefix.
    DynamicSettings dynamicDisplayAdSettings = createDynamicDisplayAdSettings(mediaService);
    responsiveDisplayAd.setDynamicDisplayAdSettings(dynamicDisplayAdSettings);

    // Whitelisted accounts only: Set color settings using hexadecimal values.
    // Set allowFlexibleColor to false if you want your ads to render by always
    // using your colors strictly.
    /*
    responsiveDisplayAd.setMainColor("#0000ff");
    responsiveDisplayAd.setAccentColor("#ffff00");
    responsiveDisplayAd.setAllowFlexibleColor(false);
    */

    // Whitelisted accounts only: Set the format setting that the ad will be
    // served in.
    /*
    responsiveDisplayAd.setFormatSetting(
        com.google.api.ads.adwords.axis.v201802.cm.DisplayAdFormatSetting.NON_NATIVE);
    */

    // Create ad group ad for the responsive display ad.
    AdGroupAd adGroupAd = new AdGroupAd();
    adGroupAd.setAdGroupId(adGroupId);
    adGroupAd.setAd(responsiveDisplayAd);

    // Optional: set the status.
    adGroupAd.setStatus(AdGroupAdStatus.PAUSED);

    // Create the operation.
    AdGroupAdOperation adGroupAdOperation = new AdGroupAdOperation();
    adGroupAdOperation.setOperand(adGroupAd);
    adGroupAdOperation.setOperator(Operator.ADD);

    // Make the mutate request.
    AdGroupAdReturnValue result =
        adGroupAdService.mutate(new AdGroupAdOperation[] {adGroupAdOperation});

    // Display ads.
    for (AdGroupAd adGroupAdResult : result.getValue()) {
      ResponsiveDisplayAd newAd = (ResponsiveDisplayAd) adGroupAdResult.getAd();
      System.out.printf(
          "Responsive display ad with ID %d and short headline '%s' was added.%n",
          newAd.getId(), newAd.getShortHeadline());
    }
  }

  private static DynamicSettings createDynamicDisplayAdSettings(MediaServiceInterface mediaService)
      throws IOException {
    long logoImageMediaId = uploadImage(mediaService, "https://goo.gl/dEvQeF");
    Image logo = new Image();
    logo.setMediaId(logoImageMediaId);

    DynamicSettings dynamicSettings = new DynamicSettings();
    dynamicSettings.setLandscapeLogoImage(logo);
    dynamicSettings.setPricePrefix("as low as");
    dynamicSettings.setPromoText("Free shipping!");
    return dynamicSettings;
  }

  /**
   * Uploads the image from the specified {@code url} via {@code MediaService}.
   *
   * @return the {@code mediaId} of the uploaded image.
   */
  private static long uploadImage(MediaServiceInterface mediaService, String url)
      throws IOException {
    // Create image.
    Image image = new Image();
    image.setType(MediaMediaType.IMAGE);
    image.setData(com.google.api.ads.common.lib.utils.Media.getMediaDataFromUrl(url));

    // Upload image.
    Image uploadedImage = (Image) mediaService.upload(new Media[] {image})[0];
    return uploadedImage.getMediaId();
  }
}
