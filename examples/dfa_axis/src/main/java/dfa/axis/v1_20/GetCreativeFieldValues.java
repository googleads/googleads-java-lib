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
import com.google.api.ads.dfa.axis.v1_20.CreativeFieldValueRecordSet;
import com.google.api.ads.dfa.axis.v1_20.CreativeFieldValueSearchCriteria;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example retrieves available creative field values for a given string and
 * displays the names and IDs.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: creativefield.getCreativeFieldValues
 *
 * @author Joseph DiLallo
 */
public class GetCreativeFieldValues {

  // Specify the search criteria.
  private static final String SEARCH_STRING = "INSERT_SEARCH_CRITERIA_HERE";

  public static void runExample(
      DfaServices dfaServices, DfaSession session, String searchString) throws Exception {

    // Request the service.
    CreativeFieldRemote service = dfaServices.get(session, CreativeFieldRemote.class);

    // Set up creative field value search criteria structure.
    CreativeFieldValueSearchCriteria creativeValueSearchCriteria =
        new CreativeFieldValueSearchCriteria();
    creativeValueSearchCriteria.setPageSize(10);
    creativeValueSearchCriteria.setSearchString(searchString);

    // Get creative field values for the selected criteria.
    CreativeFieldValueRecordSet creativeFieldValues =
        service.getCreativeFieldValues(creativeValueSearchCriteria);

    // Display creative field value names and IDs.
    if (creativeFieldValues.getRecords() != null) {
      for (CreativeFieldValue result : creativeFieldValues.getRecords()) {
        System.out.println("Creative field value with name \"" + result.getName()
            + "\" and ID \"" + result.getId() + "\" was found.");
      }
    } else {
      System.out.print("No creative field values found for your criteria");
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

    runExample(dfaServices, session, SEARCH_STRING);
  }
}
