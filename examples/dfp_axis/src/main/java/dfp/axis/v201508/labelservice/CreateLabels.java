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

package dfp.axis.v201508.labelservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201508.Label;
import com.google.api.ads.dfp.axis.v201508.LabelServiceInterface;
import com.google.api.ads.dfp.axis.v201508.LabelType;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

import java.util.Random;

/**
 * This example creates new labels. To determine which labels exist, run
 * GetAllLabels.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateLabels {

  public static void runExample(DfpServices dfpServices, DfpSession session) throws Exception {
    // Get the LabelService.
    LabelServiceInterface labelService =
        dfpServices.get(session, LabelServiceInterface.class);

    // Create a competitive exclusion label.
    Label competitiveExclusionLabel = new Label();
    competitiveExclusionLabel.setName(
        "Car company label #" + new Random().nextInt(Integer.MAX_VALUE));
    competitiveExclusionLabel.setTypes(new LabelType[] {LabelType.COMPETITIVE_EXCLUSION});

    // Create an ad unit frequency cap label.
    Label adUnitFrequencyCapLabel = new Label();
    adUnitFrequencyCapLabel.setName(
        "Don't run too often label #" + new Random().nextInt(Integer.MAX_VALUE));
    adUnitFrequencyCapLabel.setTypes(new LabelType[] {LabelType.AD_UNIT_FREQUENCY_CAP});

    // Create the labels on the server.
    Label[] labels =
        labelService.createLabels(new Label[] {competitiveExclusionLabel, adUnitFrequencyCapLabel});

    for (Label createdLabel : labels) {
      System.out.printf("A label with ID %d and name '%s' was created.%n",
          createdLabel.getId(), createdLabel.getName());
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

    runExample(dfpServices, session);
  }
}
