// Copyright 2013 Google Inc. All Rights Reserved.
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

package dfa.axis.v1_20;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfa.axis.factory.DfaServices;
import com.google.api.ads.dfa.axis.v1_20.CreativeRemote;
import com.google.api.ads.dfa.axis.v1_20.CreativeSaveResult;
import com.google.api.ads.dfa.axis.v1_20.HTMLCreativeAsset;
import com.google.api.ads.dfa.axis.v1_20.MobileDisplayCreative;
import com.google.api.ads.dfa.axis.v1_20.MobileDisplayCreativeAsset;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example creates a mobile display creative for a given advertiser or
 * campaign. If no campaign is specified then the creative is created at the
 * advertiser level. To get asset file names, run CreateHTMLAsset.java and
 * CreateImageAsset.java. To get a size ID, run GetSize.java. To get a creative
 * type ID, run GetCreativeType.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: creative.saveCreative
 *
 * @author Joseph DiLallo
 */
public class CreateMobileCreative {

  // Set the parameters for the new mobile creative.
  private static final String CREATIVE_NAME = "INSERT_CREATIVE_NAME_HERE";
  private static final String ASSET_FILE_NAME = "INSERT_ASSET_FILE_NAME_HERE";
  private static final String ADVERTISER_ID = "INSERT_ADVERTISER_ID_HERE";
  // You may optionally set a campaign ID. If the campaign ID is set to 0, then
  // the creative will be associated only with the advertiser.
  private static final String CAMPAIGN_ID = "INSERT_CAMPAIGN_ID_HERE";

  public static void runExample(
      DfaServices dfaServices, DfaSession session, String creativeName, String mobileAssetFileName,
      long advertiserId, long campaignId) throws Exception {
    // Request the service.
    CreativeRemote service = dfaServices.get(session, CreativeRemote.class);

    // Create the mobile display creative.
    MobileDisplayCreative mobileDisplayCreative = new MobileDisplayCreative();
    mobileDisplayCreative.setAdvertiserId(advertiserId);
    mobileDisplayCreative.setName(creativeName);
    mobileDisplayCreative.setArchived(false);
    // The type ID for mobile creatives is 30. See GetCreativeTypes.java
    mobileDisplayCreative.setTypeId(30);

    // Set the mobile creative asset.
    HTMLCreativeAsset htmlCreativeAsset = new MobileDisplayCreativeAsset();
    htmlCreativeAsset.setAssetFilename(mobileAssetFileName);
    mobileDisplayCreative.setCreativeAssets(new HTMLCreativeAsset[]{htmlCreativeAsset});

    // Save the mobile display creative.
    CreativeSaveResult creativeSaveResult = service.saveCreative(mobileDisplayCreative,
        campaignId);

    // Display the new creative ID.
    System.out.printf("Mobile display creative with ID \"%s\" was created.%n",
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
    long campaignId = Long.parseLong(CAMPAIGN_ID);

    runExample(dfaServices, session, CREATIVE_NAME, ASSET_FILE_NAME, advertiserId, campaignId);
  }
}
