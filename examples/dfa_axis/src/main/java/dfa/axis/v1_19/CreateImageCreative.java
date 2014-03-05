// Copyright 2012 Google Inc. All Rights Reserved.
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

package dfa.axis.v1_19;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfa.axis.factory.DfaServices;
import com.google.api.ads.dfa.axis.v1_19.CreativeRemote;
import com.google.api.ads.dfa.axis.v1_19.CreativeSaveResult;
import com.google.api.ads.dfa.axis.v1_19.ImageCreative;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example creates an image creative associated with a given advertiser.
 * Since no campaign is specified, the creative is created at the advertiser
 * level. To create image assets, run CreateImageAsset.java. To get a size ID,
 * run GetSize.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: creative.saveCreative
 *
 * @author Joseph DiLallo
 */
public class CreateImageCreative {

  // Set the parameters for the new image creative.
  private static final String CREATIVE_NAME = "INSERT_CREATIVE_NAME_HERE";
  private static final String ASSET_FILE_NAME = "INSERT_ASSET_FILE_NAME_HERE";
  private static final String ADVERTISER_ID = "INSERT_ADVERTISER_ID_HERE";
  private static final String SIZE_ID = "INSERT_SIZE_ID_HERE";
  // You may optionally set a campaign ID. If the campaign ID is set to 0, then
  // the creative will be associated only with the advertiser.
  private static final String CAMPAIGN_ID = "INSERT_CAMPAIGN_ID_HERE";

  public static void runExample(
      DfaServices dfaServices, DfaSession session, String creativeName, String assetFileName,
      long advertiserId, long sizeId, long campaignId) throws Exception {

    // Request the creative service from the service client factory.
    CreativeRemote creativeService = dfaServices.get(session, CreativeRemote.class);

    // Create the image creative.
    ImageCreative imageCreative = new ImageCreative();
    imageCreative.setId(0);
    imageCreative.setName(creativeName);
    imageCreative.setActive(true);
    imageCreative.setAdvertiserId(advertiserId);
    imageCreative.setSizeId(sizeId);
    imageCreative.setAssetFilename(assetFileName);
    // The type ID for image creatives is 1. See GetCreativeTypes.java
    imageCreative.setTypeId(1);

    // Save the image creative.
    CreativeSaveResult creativeSaveResult = creativeService.saveCreative(imageCreative,
        campaignId);

    // Display the new creative ID.
    System.out.printf("Image creative with ID \"%s\" was created.%n",
        creativeSaveResult.getId());
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential, which replaces legacy passwords
    // and can be used in place of a service account.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.DFA)
        .fromFile()
        .build()
        .generateCredential();

    // Construct a DfaSession.
    DfaSession session = new DfaSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    DfaServices dfaServices = new DfaServices();

    long advertiserId = Long.parseLong(ADVERTISER_ID);
    long sizeId = Long.parseLong(SIZE_ID);
    long campaignId = Long.parseLong(CAMPAIGN_ID);

    runExample(dfaServices, session, CREATIVE_NAME, ASSET_FILE_NAME, advertiserId, sizeId,
        campaignId);
  }
}
