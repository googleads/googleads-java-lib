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
import com.google.api.ads.dfa.axis.v1_20.CreativeBase;
import com.google.api.ads.dfa.axis.v1_20.CreativeRecordSet;
import com.google.api.ads.dfa.axis.v1_20.CreativeRemote;
import com.google.api.ads.dfa.axis.v1_20.CreativeSearchCriteria;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example retrieves all available creatives for a given advertiser and
 * displays their names and IDs. To create an advertiser, run
 * CreateAdvertiser.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetCreatives {

  // Set the ID of the advertiser whose creatives will be fetched.
  private static final String ADVERTISER_ID = "INSERT_ADVERTISER_ID_HERE";

  public static void runExample(DfaServices dfaServices, DfaSession session, long advertiserId)
      throws Exception {
    // Request the creative service from the service client factory.
    CreativeRemote creativeService = dfaServices.get(session, CreativeRemote.class);

    // Set up creative search criteria structure.
    CreativeSearchCriteria creativeSearchCriteria = new CreativeSearchCriteria();
    creativeSearchCriteria.setPageSize(100);
    creativeSearchCriteria.setAdvertiserId(advertiserId);
    // When paging, start counting page numbers from 1 rather than 0.
    creativeSearchCriteria.setPageNumber(1);

    CreativeRecordSet creatives;
    int i = 1;

    do {
      // Get creatives for the selected criteria.
      creatives = creativeService.getCreatives(creativeSearchCriteria);

      for (CreativeBase result : creatives.getRecords()) {
        System.out.printf("%s) Creative with name \"%s\" and ID \"%s\" was found.%n",
            i++, result.getName(), result.getId());
      }

      creativeSearchCriteria.setPageNumber(creativeSearchCriteria.getPageNumber() + 1);
    } while (creativeSearchCriteria.getPageNumber() <= creatives.getTotalNumberOfPages());

    System.out.printf("Number of results found: %s%n",
        creatives.getTotalNumberOfRecords());
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

    runExample(dfaServices, session, advertiserId);
  }
}
