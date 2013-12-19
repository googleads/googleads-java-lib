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
import com.google.api.ads.common.lib.utils.Media;
import com.google.api.ads.dfa.axis.factory.DfaServices;
import com.google.api.ads.dfa.axis.v1_19.CreativeAsset;
import com.google.api.ads.dfa.axis.v1_19.CreativeAssetSaveResult;
import com.google.api.ads.dfa.axis.v1_19.CreativeRemote;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example creates a HTML creative asset in a given advertiser. To create
 * an advertiser, run CreateAdvertiser.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: creative.saveCreativeAsset
 *
 * @author Joseph DiLallo
 */
public class CreateHTMLAsset {

  // Set the parameters of the new HTML asset.
  private static final String ASSET_NAME = "INSERT_SWF_ASSET_NAME_HERE";
  private static final String PATH_TO_FILE = "INSERT_PATH_TO_SWF_FILE_HERE";
  private static final String ADVERTISER_ID = "INSERT_ADVERTISER_ID_HERE";

  public static void runExample(
      DfaServices dfaServices, DfaSession session, String assetName, String pathToFile,
      long advertiserId) throws Exception {
    // Request the service.
    CreativeRemote service = dfaServices.get(session, CreativeRemote.class);

    // Create the HTML asset.
    CreativeAsset swfAsset = new CreativeAsset();
    swfAsset.setForHTMLCreatives(true);
    swfAsset.setName(assetName);
    swfAsset.setContent(Media.getMediaDataFromFile(pathToFile));
    swfAsset.setAdvertiserId(advertiserId);

    // Save the asset.
    CreativeAssetSaveResult creativeAssetSaveResult = service.saveCreativeAsset(swfAsset);

    // Display the new asset file name.
    System.out.printf("Asset was saved with file name of \"%s\".%n",
        creativeAssetSaveResult.getSavedFilename());
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

    runExample(dfaServices, session, ASSET_NAME, PATH_TO_FILE, advertiserId);
  }
}
