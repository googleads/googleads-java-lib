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
import com.google.api.ads.dfa.axis.v1_20.CreativeField;
import com.google.api.ads.dfa.axis.v1_20.CreativeFieldRecordSet;
import com.google.api.ads.dfa.axis.v1_20.CreativeFieldRemote;
import com.google.api.ads.dfa.axis.v1_20.CreativeFieldSearchCriteria;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example retrieves available creative fields for a given string and
 * displays the name, ID, advertiser ID, and number of values. Results are
 * limited to the first 10.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetCreativeField {

  // Specify the search criteria.
  private static final String SEARCH_STRING = "INSERT_SEARCH_CRITERIA_HERE";

  public static void runExample(
      DfaServices dfaServices, DfaSession session, String searchString) throws Exception {
    // Request the service.
    CreativeFieldRemote service = dfaServices.get(session, CreativeFieldRemote.class);

    // Set up creative field search criteria structure.
    CreativeFieldSearchCriteria creativeFieldSearchCriteria = new CreativeFieldSearchCriteria();
    creativeFieldSearchCriteria.setPageSize(10);
    creativeFieldSearchCriteria.setSearchString(searchString);

    // Get creative fields for the selected criteria.
    CreativeFieldRecordSet creativeFields =
        service.getCreativeFields(creativeFieldSearchCriteria);

    // Display creative field names, IDs, advertiser IDs, and number of values.
    if (creativeFields.getRecords() != null) {
      for (CreativeField result : creativeFields.getRecords()) {
        System.out.println("Creative field with name \"" + result.getName()
            + "\", ID \"" + result.getId()
            + "\", Advertiser ID \"" + result.getAdvertiserId()
            + "\", and containing \"" + result.getTotalNumberOfValues()
            + "\" values was found.");
      }
    } else {
      System.out.print("No creative fields found for your criteria");
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
