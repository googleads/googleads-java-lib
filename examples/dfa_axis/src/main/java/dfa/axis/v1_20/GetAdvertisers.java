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
import com.google.api.ads.dfa.axis.v1_20.Advertiser;
import com.google.api.ads.dfa.axis.v1_20.AdvertiserRecordSet;
import com.google.api.ads.dfa.axis.v1_20.AdvertiserRemote;
import com.google.api.ads.dfa.axis.v1_20.AdvertiserSearchCriteria;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example displays the name, ID and spotlight configuration ID for every
 * advertiser your DFA user profile can see.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetAdvertisers {

  public static void runExample(DfaServices dfaServices, DfaSession session) throws Exception {
    // Request the advertiser service from the service client factory.
    AdvertiserRemote advertiserService = dfaServices.get(session, AdvertiserRemote.class);

    // Create advertiser search criteria structure.
    AdvertiserSearchCriteria advSearchCriteria = new AdvertiserSearchCriteria();
    advSearchCriteria.setPageSize(100);
    // When paging, start counting page numbers from 1 rather than 0.
    advSearchCriteria.setPageNumber(1);

    AdvertiserRecordSet advertiserRecordSet;
    int i = 1;

    do {
      // Get advertisers by criteria.
      advertiserRecordSet = advertiserService.getAdvertisers(
          advSearchCriteria);

      for (Advertiser result : advertiserRecordSet.getRecords()) {
        System.out.printf("%s) Advertiser with name \"%s\", ID \"%s\", and spotlight "
            + "configuration ID \"%s\" was found.%n", i++, result.getName(), result.getId(),
            result.getSpotId());
      }

      advSearchCriteria.setPageNumber(advSearchCriteria.getPageNumber() + 1);
    } while (advSearchCriteria.getPageNumber() <= advertiserRecordSet.getTotalNumberOfPages());

    System.out.printf("Number of results found: %s%n",
        advertiserRecordSet.getTotalNumberOfRecords());
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

    runExample(dfaServices, session);
  }
}
