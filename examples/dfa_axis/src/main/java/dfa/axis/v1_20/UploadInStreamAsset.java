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
import com.google.api.ads.common.lib.utils.Media;
import com.google.api.ads.dfa.axis.factory.DfaServices;
import com.google.api.ads.dfa.axis.v1_20.CreativeAsset;
import com.google.api.ads.dfa.axis.v1_20.CreativeRemote;
import com.google.api.ads.dfa.axis.v1_20.InStreamAssetUploadRequest;
import com.google.api.ads.dfa.axis.v1_20.InStreamVideoCreative;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example uploads an In-Stream video asset into an existing In-Stream
 * video creative. To create an In-Stream video creative, run
 * CreateInStreamVideoCreative.java.
 *
 * This example creates a media file in the target creative because the
 * <code>mediaFile<code> flag on the <code>InStreamAssetUploadRequest</code> was
 * set to <code>true</code>. You can use the same workflow to upload companion
 * ads or non-linear ads to your creative by setting the <code>companion</code>
 * or <code>nonLinear</code> flags instead, respectively. Only one flag may be
 * set per upload request.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: creative.uploadInStreamAsset
 *
 * @author Joseph DiLallo
 */
public class UploadInStreamAsset {

  // Set the parameters for the In-Stream video asset.
  private static final String ASSET_NAME = "INSERT_ASSET_NAME_HERE";
  private static final String PATH_TO_FILE = "INSERT_PATH_TO_FILE_HERE";
  private static final String IN_STREAM_VIDEO_CREATIVE_ID =
      "INSERT_IN_STREAM_VIDEO_CREATIVE_ID_HERE";

  public static void runExample(
      DfaServices dfaServices, DfaSession session, String assetName, String pathToFile,
      long creativeId) throws Exception {
    // Request the creative service from the service client factory.
    CreativeRemote creativeService = dfaServices.get(session, CreativeRemote.class);

    // Create the In-Stream video creative asset.
    CreativeAsset inStreamVideoAsset = new CreativeAsset();
    inStreamVideoAsset.setName(assetName);
    inStreamVideoAsset.setContent(Media.getMediaDataFromFile(pathToFile));

    // Create an upload request to make this asset a media file for an existing
    // In-Stream creative.
    InStreamAssetUploadRequest inStreamAssetUploadRequest = new InStreamAssetUploadRequest();
    inStreamAssetUploadRequest.setMediaFile(true);
    inStreamAssetUploadRequest.setInStreamAsset(inStreamVideoAsset);
    inStreamAssetUploadRequest.setCreativeId(creativeId);

    // Save the media file.
    InStreamVideoCreative inStreamVideoCreative =
        creativeService.uploadInStreamAsset(inStreamAssetUploadRequest);

    // Display a success message.
    System.out.printf("Added a media file to In-Stream video creative with ID \"%s\".%n",
        inStreamVideoCreative.getId());
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

    runExample(dfaServices, session, ASSET_NAME, PATH_TO_FILE, creativeId);
  }
}
