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
import com.google.api.ads.dfa.axis.v1_19.CreativeBase;
import com.google.api.ads.dfa.axis.v1_19.CreativeRemote;
import com.google.api.ads.dfa.axis.v1_19.CreativeSaveResult;
import com.google.api.ads.dfa.axis.v1_19.InStreamCompanionAd;
import com.google.api.ads.dfa.axis.v1_19.InStreamMediaFile;
import com.google.api.ads.dfa.axis.v1_19.InStreamNonLinearAd;
import com.google.api.ads.dfa.axis.v1_19.InStreamVideoCreative;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example retrieves an In-Stream video creative and modifies its media
 * files, companion ads, and non-linear ads. You are not given the opportunity
 * to set the fields on these components when they are created by uploading
 * creative assets. Therefore, you must upload the assets first and then set
 * any additional fields in a second request.
 *
 * To create an In-Stream video creative, run CreateInStreamVideoCreative.java.
 * To add an In-Stream asset to an In-Stream video creative, run
 * UploadInStreamAsset.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: creative.saveCreative
 *
 * @author Joseph DiLallo
 */
public class ModifyInStreamMediaFilesAndAds {

  // Set the ID of the In-Stream video creative whose components will be
  // updated.
  private static final String CREATIVE_ID = "INSERT_IN_STREAM_VIDEO_CREATIVE_ID_HERE";

  public static void runExample(DfaServices dfaServices, DfaSession session, long creativeId)
      throws Exception {
    // Request the creative service from the service client factory.
    CreativeRemote creativeService = dfaServices.get(session, CreativeRemote.class);

    // Fetch the In-Stream video creative which contains the asset to modify.
    CreativeBase rawCreative = creativeService.getCreative(creativeId);

    if (!(rawCreative instanceof InStreamVideoCreative)) {
      System.out.printf("Unable to update creative with ID \"%s\": not an In-Stream video "
          + "creative.", creativeId);
    } else {
      InStreamVideoCreative inStreamVideoCreative = (InStreamVideoCreative) rawCreative;

      // Modify the media files, companion ads, and/or non-linear ads.
      if (inStreamVideoCreative.getMediaFiles() != null) {
        for (InStreamMediaFile mediaFile : inStreamVideoCreative.getMediaFiles()) {
          mediaFile.setPickedToServe(!mediaFile.isPickedToServe());
        }
      }

      if (inStreamVideoCreative.getCompanionAds() != null) {
        for (InStreamCompanionAd companionAd : inStreamVideoCreative.getCompanionAds()) {
          companionAd.setAltText(companionAd.getAltText() + " Updated.");
        }
      }

      if (inStreamVideoCreative.getNonLinearAds() != null) {
        for (InStreamNonLinearAd nonLinearAd : inStreamVideoCreative.getNonLinearAds()) {
          nonLinearAd.setScalable(!nonLinearAd.isScalable());
        }
      }

      CreativeSaveResult creativeSaveResult =
          creativeService.saveCreative(inStreamVideoCreative, 0);

      System.out.printf("Updated the In-Stream assets of In-Stream video creative with ID "
          + "\"%s\".%n", creativeSaveResult.getId());
    }
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

    long creativeId = Long.parseLong(CREATIVE_ID);

    runExample(dfaServices, session, creativeId);
  }
}
