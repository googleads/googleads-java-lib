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
import com.google.api.ads.dfa.axis.v1_20.CreativeFieldRemote;
import com.google.api.ads.dfa.axis.v1_20.CreativeFieldValue;
import com.google.api.ads.dfa.axis.v1_20.CreativeFieldValueSaveResult;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example creates a creative field value associated with a given creative
 * field. To get the creative field ID, run GetCreativeFields.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: creativefield.saveCreativeFieldValue
 *
 * @author Joseph DiLallo
 */
public class CreateCreativeFieldValue {

  // Set the name and associated field ID for the new creative field value.
  private static final String CREATIVE_FIELD_VALUE_NAME = "INSERT_CREATIVE_FIELD_VALUE_NAME_HERE";
  private static final String CREATIVE_FIELD_ID = "INSERT_CREATIVE_FIELD_ID_HERE";

  public static void runExample(
      DfaServices dfaServices, DfaSession session, String creativeFieldValueName,
      long creativeFieldId) throws Exception {
    // Request the service.
    CreativeFieldRemote service = dfaServices.get(session, CreativeFieldRemote.class);

    // Create the creative field value.
    CreativeFieldValue creativeFieldValue = new CreativeFieldValue();
    creativeFieldValue.setId(-1);
    creativeFieldValue.setName(creativeFieldValueName);
    creativeFieldValue.setCreativeFieldId(creativeFieldId);

    // Save the creative field value.
    CreativeFieldValueSaveResult creativeFieldValueSaveResult =
        service.saveCreativeFieldValue(creativeFieldValue);

    // Display the new creative field value ID.
    System.out.printf("Creative field value with ID \"%s\" was created.%n",
        creativeFieldValueSaveResult.getId());
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

    long creativeFieldId = Long.parseLong(CREATIVE_FIELD_ID);

    runExample(dfaServices, session, CREATIVE_FIELD_VALUE_NAME, creativeFieldId);
  }
}
