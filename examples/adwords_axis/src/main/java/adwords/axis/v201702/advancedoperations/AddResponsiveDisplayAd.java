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

package adwords.axis.v201702.advancedoperations;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201702.cm.AdGroupAd;
import com.google.api.ads.adwords.axis.v201702.cm.AdGroupAdOperation;
import com.google.api.ads.adwords.axis.v201702.cm.AdGroupAdReturnValue;
import com.google.api.ads.adwords.axis.v201702.cm.AdGroupAdServiceInterface;
import com.google.api.ads.adwords.axis.v201702.cm.AdGroupAdStatus;
import com.google.api.ads.adwords.axis.v201702.cm.Image;
import com.google.api.ads.adwords.axis.v201702.cm.Media;
import com.google.api.ads.adwords.axis.v201702.cm.MediaMediaType;
import com.google.api.ads.adwords.axis.v201702.cm.MediaServiceInterface;
import com.google.api.ads.adwords.axis.v201702.cm.Operator;
import com.google.api.ads.adwords.axis.v201702.cm.ResponsiveDisplayAd;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example adds an image representing the ad using the MediaService and then adds a responsive
 * display ad to a given ad group. To get ad groups, run GetAdGroups.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class AddResponsiveDisplayAd {

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

    long adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");

    AdWordsServicesInterface adWordsServices = AdWordsServices.getInstance();

    runExample(adWordsServices, session, adGroupId);
  }

  public static void runExample(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, long adGroupId)
      throws Exception {
    // Get the MediaService.
    MediaServiceInterface mediaService = adWordsServices.get(session, MediaServiceInterface.class);

    // Create image.
    Image image = new Image();
    image.setType(MediaMediaType.IMAGE);
    image.setData(
        com.google.api.ads.common.lib.utils.Media.getMediaDataFromUrl("https://goo.gl/3b9Wfh"));

    // Upload image.
    image = (Image) mediaService.upload(new Media[] {image})[0];

    // Get the AdGroupAdService.
    AdGroupAdServiceInterface adGroupAdService =
        adWordsServices.get(session, AdGroupAdServiceInterface.class);

    // Create a responsive display ad.
    ResponsiveDisplayAd responsiveDisplayAd = new ResponsiveDisplayAd();

    // This ad format does not allow the creation of an image using the
    // Image.data field. An image must first be created using the MediaService,
    // and Image.mediaId must be populated when creating the ad.
    Image marketingImage = new Image();
    marketingImage.setMediaId(image.getMediaId());
    responsiveDisplayAd.setMarketingImage(marketingImage);

    responsiveDisplayAd.setShortHeadline("Travel");
    responsiveDisplayAd.setLongHeadline("Travel the World");
    responsiveDisplayAd.setDescription("Take to the air!");
    responsiveDisplayAd.setBusinessName("Interplanetary Cruises");
    responsiveDisplayAd.setFinalUrls(new String[] {"http://www.example.com/"});

    // Create ad group ad for the responsive display ad.
    AdGroupAd expandedTextAdGroupAd = new AdGroupAd();
    expandedTextAdGroupAd.setAdGroupId(adGroupId);
    expandedTextAdGroupAd.setAd(responsiveDisplayAd);

    // Optional: set the status.
    expandedTextAdGroupAd.setStatus(AdGroupAdStatus.PAUSED);

    // Create the operation.
    AdGroupAdOperation adGroupAdOperation = new AdGroupAdOperation();
    adGroupAdOperation.setOperand(expandedTextAdGroupAd);
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
}
