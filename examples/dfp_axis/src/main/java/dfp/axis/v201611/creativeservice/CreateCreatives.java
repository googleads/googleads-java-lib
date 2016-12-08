// Copyright 2015 Google Inc. All Rights Reserved.
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

package dfp.axis.v201611.creativeservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.Media;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201611.Creative;
import com.google.api.ads.dfp.axis.v201611.CreativeAsset;
import com.google.api.ads.dfp.axis.v201611.CreativeServiceInterface;
import com.google.api.ads.dfp.axis.v201611.ImageCreative;
import com.google.api.ads.dfp.axis.v201611.ImageRedirectCreative;
import com.google.api.ads.dfp.axis.v201611.Size;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;
import java.util.Random;

/**
 * This example creates new creatives. To determine which creatives exist, run
 * GetAllCreatives.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateCreatives {

  // Set the ID of the advertiser (company) that all creatives will be assigned
  // to.
  private static final String ADVERTISER_ID = "INSERT_ADVERTISER_COMPANY_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session, long advertiserId)
      throws Exception {
    // Get the CreativeService.
    CreativeServiceInterface creativeService =
        dfpServices.get(session, CreativeServiceInterface.class);

    // Create creative size.
    Size size = new Size();
    size.setWidth(300);
    size.setHeight(250);
    size.setIsAspectRatio(false);

    // Create an image creative.
    ImageCreative imageCreative = new ImageCreative();
    imageCreative.setName("Image creative #" + new Random().nextInt(Integer.MAX_VALUE));
    imageCreative.setAdvertiserId(advertiserId);
    imageCreative.setDestinationUrl("http://google.com");
    imageCreative.setSize(size);

    // Create image asset.
    CreativeAsset creativeAsset = new CreativeAsset();
    creativeAsset.setFileName("image.jpg");
    creativeAsset.setAssetByteArray(Media.getMediaDataFromUrl(
        "http://www.google.com/intl/en/adwords/select/images/samples/inline.jpg"));
    creativeAsset.setSize(size);
    imageCreative.setPrimaryImageAsset(creativeAsset);

    // Create an image redirect creative.
    ImageRedirectCreative imageRedirectCreative = new ImageRedirectCreative();
    imageRedirectCreative.setName(
        "Image redirect creative #" + new Random().nextInt(Integer.MAX_VALUE));
    imageRedirectCreative.setAdvertiserId(advertiserId);
    imageRedirectCreative.setDestinationUrl("http://google.com");
    imageRedirectCreative.setImageUrl(
        "http://www.google.com/intl/en/adwords/select/images/samples/inline.jpg");
    imageRedirectCreative.setSize(size);

    // Create the creatives on the server.
    Creative[] creatives =
        creativeService.createCreatives(new Creative[] {imageCreative, imageRedirectCreative});

    for (Creative createdCreative : creatives) {
      System.out.printf("A creative with ID %d, name '%s', and type '%s'"
          + " was created and can be previewed at: %s%n", createdCreative.getId(),
          createdCreative.getName(), createdCreative.getClass().getSimpleName(),
          createdCreative.getPreviewUrl());
    }
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.DFP)
        .fromFile()
        .build()
        .generateCredential();

    // Construct a DfpSession.
    DfpSession session = new DfpSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    DfpServices dfpServices = new DfpServices();

    runExample(dfpServices, session, Long.parseLong(ADVERTISER_ID));
  }
}
