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

package dfp.axis.v201702.creativeservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.Media;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201702.Creative;
import com.google.api.ads.dfp.axis.v201702.CreativeAsset;
import com.google.api.ads.dfp.axis.v201702.CreativeServiceInterface;
import com.google.api.ads.dfp.axis.v201702.CustomCreative;
import com.google.api.ads.dfp.axis.v201702.CustomCreativeAsset;
import com.google.api.ads.dfp.axis.v201702.Size;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;
import java.util.Random;

/**
 * This example creates a custom creative for a given advertiser. This feature
 * is only available to DFP premium solution networks. To determine which
 * creatives already exist, run GetAllCreatives.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateCustomCreatives {

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
    size.setWidth(600);
    size.setHeight(315);
    size.setIsAspectRatio(false);

    // Create a custom creative.
    CustomCreative customCreative = new CustomCreative();
    customCreative.setName("Custom creative #" + new Random().nextInt(Integer.MAX_VALUE));
    customCreative.setAdvertiserId(advertiserId);
    customCreative.setDestinationUrl("http://google.com");
    customCreative.setSize(size);

    // Set the custom creative image asset.
    CustomCreativeAsset customCreativeAsset = new CustomCreativeAsset();
    customCreativeAsset.setMacroName("IMAGE_ASSET");
    CreativeAsset asset = new CreativeAsset();
    asset.setAssetByteArray(Media.getMediaDataFromUrl("https://goo.gl/3b9Wfh"));
    // Filenames must be unique.
    asset.setFileName(
        String.format("image%s.jpg", new Random().nextInt(Integer.MAX_VALUE)));
    customCreativeAsset.setAsset(asset);
    customCreative.setCustomCreativeAssets(new CustomCreativeAsset[] {customCreativeAsset});

    // Set the HTML snippet using the custom creative asset macro.
    customCreative.setHtmlSnippet("<a href='%%CLICK_URL_UNESC%%%%DEST_URL%%'>"
        + "<img src='%%FILE:" + customCreativeAsset.getMacroName() + "%%'/>"
        + "</a><br>Click above for great deals!");

    // Create the creative on the server.
    Creative[] creatives =
        creativeService.createCreatives(new Creative[] {customCreative});

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
