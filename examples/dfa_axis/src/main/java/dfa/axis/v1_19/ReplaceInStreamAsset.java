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
import com.google.api.ads.dfa.axis.v1_19.CreativeRemote;
import com.google.api.ads.dfa.axis.v1_19.InStreamAssetUploadRequest;
import com.google.api.ads.dfa.axis.v1_19.InStreamVideoCreative;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example replaces an In-Stream asset in an existing In-Stream video
 * creative with a new In-Stream asset. To create an In-Stream video creative,
 * run CreateInStreamVideoCreative.java. To add an In-Stream asset to an
 * In-Stream video creative, run UploadInStreamAsset.java.
 *
 * This example replaces a companion ad asset in the target creative because the
 * <code>companion<code> flag on the <code>InStreamAssetUploadRequest</code> was
 * set to <code>true</code>. You can use the same workflow to replace
 * a non-linear ad by setting the <code>nonLinear</code> flag instead. You may
 * not use this method to swap out media files (a.k.a. video assets).
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: creative.replaceInStreamAsset
 *
 * @author Joseph DiLallo
 */
public class ReplaceInStreamAsset {

  // Set the parameters for the In-Stream video asset.
  private static final String ASSET_NAME = "INSERT_ASSET_NAME_HERE";
  private static final String PATH_TO_FILE = "INSERT_PATH_TO_FILE_HERE";
  private static final String IN_STREAM_VIDEO_CREATIVE_ID =
      "INSERT_IN_STREAM_VIDEO_CREATIVE_ID_HERE";
  private static final String ASSET_TO_REPLACE = "INSERT_ASSET_TO_REPLACE_HERE";

  public static void runExample(
      DfaServices dfaServices, DfaSession session, String assetName, String pathToFile,
      long creativeId, String assetToReplace) throws Exception {
    // Request the creative service from the service client factory.
    CreativeRemote creativeService = dfaServices.get(session, CreativeRemote.class);

    // Create the In-Stream creative asset.
    CreativeAsset inStreamVideoAsset = new CreativeAsset();
    inStreamVideoAsset.setName(assetName);
    inStreamVideoAsset.setContent(Media.getMediaDataFromFile(pathToFile));

    // Create an upload request to make this asset a companion ad file for an
    // existing In-Stream video creative.
    InStreamAssetUploadRequest inStreamAssetUploadRequest = new InStreamAssetUploadRequest();
    inStreamAssetUploadRequest.setCompanion(true);
    inStreamAssetUploadRequest.setInStreamAsset(inStreamVideoAsset);
    inStreamAssetUploadRequest.setCreativeId(creativeId);

    // Replace the existing asset with a newly uploaded asset.
    InStreamVideoCreative inStreamVideoCreative =
        creativeService.replaceInStreamAsset(assetToReplace, inStreamAssetUploadRequest);

    // Display a success message.
    System.out.printf("Replaced companion ad asset \"%s\" in In-Stream video creative "
        + "with ID \"%s\".%n", assetToReplace, inStreamVideoCreative.getId());
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

    long creativeId = Long.parseLong(IN_STREAM_VIDEO_CREATIVE_ID);

    runExample(dfaServices, session, ASSET_NAME, PATH_TO_FILE, creativeId, ASSET_TO_REPLACE);
  }
}
