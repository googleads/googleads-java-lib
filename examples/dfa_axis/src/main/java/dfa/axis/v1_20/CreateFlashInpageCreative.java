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
import com.google.api.ads.dfa.axis.v1_20.FlashInpageCreative;
import com.google.api.ads.dfa.axis.v1_20.HTMLCreativeAsset;
import com.google.api.ads.dfa.axis.v1_20.HTMLCreativeFlashAsset;
import com.google.api.ads.dfa.axis.v1_20.TargetWindow;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example creates a Flash in-page creative for a given advertiser or
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
public class CreateFlashInpageCreative {

  // Set the parameters for the new Flash in-page creative.
  private static final String CREATIVE_NAME = "INSERT_CREATIVE_NAME_HERE";
  private static final String SWF_ASSET_FILE_NAME = "INSERT_SWF_ASSET_FILE_NAME_HERE";
  private static final String IMG_ASSET_FILE_NAME = "INSERT_IMG_ASSET_FILE_NAME_HERE";
  private static final String ADVERTISER_ID = "INSERT_ADVERTISER_ID_HERE";
  private static final String SIZE_ID = "INSERT_SIZE_ID_HERE";
  // You may optionally set a campaign ID. If the campaign ID is set to 0, then
  // the creative will be associated only with the advertiser.
  private static final String CAMPAIGN_ID = "INSERT_CAMPAIGN_ID_HERE";

  public static void runExample(
      DfaServices dfaServices, DfaSession session, String creativeName, String swfAssetFileName,
      String imgAssetFileName, long advertiserId, long sizeId, long campaignId) throws Exception {
    // Request the service.
    CreativeRemote service = dfaServices.get(session, CreativeRemote.class);

    // Create the Flash in-page creative.
    FlashInpageCreative flashInpage = new FlashInpageCreative();
    flashInpage.setId(0);
    flashInpage.setName(creativeName);
    flashInpage.setAdvertiserId(advertiserId);
    flashInpage.setActive(true);
    flashInpage.setCodeLocked(true);
    flashInpage.setSizeId(sizeId);
    // The type ID for FlashInpageCreative is 24. See GetCreativeTypes.java
    flashInpage.setTypeId(24);

    // Set the parent flash asset structure.
    HTMLCreativeFlashAsset parentFlashAsset = new HTMLCreativeFlashAsset();
    parentFlashAsset.setAssetFilename(swfAssetFileName);
    flashInpage.setParentFlashAsset(parentFlashAsset);
    flashInpage.setWmode("opaque");

    // Set the backup image asset.
    HTMLCreativeAsset backupImageAsset = new HTMLCreativeAsset();
    backupImageAsset.setAssetFilename(imgAssetFileName);
    flashInpage.setBackupImageAsset(backupImageAsset);

    // Set the target window for backup image.
    TargetWindow backupImageTargetWindow = new TargetWindow();
    backupImageTargetWindow.setOption("_blank");
    flashInpage.setBackupImageTargetWindow(backupImageTargetWindow);

    // Save the Flash in-page creative.
    CreativeSaveResult creativeSaveResult = service.saveCreative(flashInpage, campaignId);

    // Display the new creative ID.
    System.out.printf("Flash inpage creative with ID \"%s\" was created.%n",
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

    runExample(dfaServices, session, CREATIVE_NAME, SWF_ASSET_FILE_NAME, IMG_ASSET_FILE_NAME,
        advertiserId, sizeId, campaignId);
  }
}
