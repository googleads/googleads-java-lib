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

package adwords.axis.v201708.advancedoperations;

import com.beust.jcommander.Parameter;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201708.cm.AdGroupAd;
import com.google.api.ads.adwords.axis.v201708.cm.AdGroupAdOperation;
import com.google.api.ads.adwords.axis.v201708.cm.AdGroupAdReturnValue;
import com.google.api.ads.adwords.axis.v201708.cm.AdGroupAdServiceInterface;
import com.google.api.ads.adwords.axis.v201708.cm.AdGroupAdStatus;
import com.google.api.ads.adwords.axis.v201708.cm.DynamicSettings;
import com.google.api.ads.adwords.axis.v201708.cm.Image;
import com.google.api.ads.adwords.axis.v201708.cm.Media;
import com.google.api.ads.adwords.axis.v201708.cm.MediaMediaType;
import com.google.api.ads.adwords.axis.v201708.cm.MediaServiceInterface;
import com.google.api.ads.adwords.axis.v201708.cm.Operator;
import com.google.api.ads.adwords.axis.v201708.cm.ResponsiveDisplayAd;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.utils.examples.ArgumentNames;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.client.auth.oauth2.Credential;
import java.io.IOException;

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

    AdWordsServicesInterface adWordsServices = AdWordsServices.getInstance();

    AddResponsiveDisplayAdParams params = new AddResponsiveDisplayAdParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");
    }

    runExample(adWordsServices, session, params.adGroupId);
  }

  public static void runExample(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, long adGroupId)
      throws Exception {
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
        com.google.api.ads.adwords.axis.v201708.cm.DisplayAdFormatSetting.NON_NATIVE);
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
