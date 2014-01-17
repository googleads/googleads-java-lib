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
import com.google.api.ads.dfa.axis.v1_19.ChangeLogRecord;
import com.google.api.ads.dfa.axis.v1_19.ChangeLogRecordSearchCriteria;
import com.google.api.ads.dfa.axis.v1_19.ChangeLogRecordSet;
import com.google.api.ads.dfa.axis.v1_19.ChangeLogRemote;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.client.auth.oauth2.Credential;

import java.text.SimpleDateFormat;

/**
 * This example displays the change logs of a specified advertiser object.
 * Results are limited to the first 10 records.
 *
 * A similar pattern can be applied to get change logs for many other object
 * types. Run GetChangeLogObjectTypes.java for a list of other supported object
 * types and their ID numbers.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: changelog.getChangeLogRecords
 *
 * @author Joseph DiLallo
 */
public class GetChangeLogForAdvertiser {

  // Provide the ID of the advertiser whose change logs will be displayed.
  private static final String ADVERTISER_ID = "INSERT_ADVERTISER_ID_HERE";

  public static void runExample(
      DfaServices dfaServices, DfaSession session, long advertiserId) throws Exception {
    // Request the service.
    ChangeLogRemote service = dfaServices.get(session, ChangeLogRemote.class);

    // Create change log search criteria structure.
    ChangeLogRecordSearchCriteria searchCriteria = new ChangeLogRecordSearchCriteria();
    searchCriteria.setPageSize(10);
    searchCriteria.setObjectId(advertiserId);
    // The following field has been filled in to choose advertiser change
    // logs. This values was determined using GetChangeLogObjectTypes.java.
    searchCriteria.setObjectTypeId(1L);

    // Get change log record set.
    ChangeLogRecordSet changeLogRecordSet = service.getChangeLogRecords(searchCriteria);

    // Set up a formatter to make the change log timestamps human-readable.
    SimpleDateFormat dateFormat = new SimpleDateFormat("d MMM yyyy HH:mm");

    // Display the contents of each change log record
    if (changeLogRecordSet.getRecords() != null) {
      for (ChangeLogRecord result : changeLogRecordSet.getRecords()) {
        System.out.println("Action \"" + result.getAction()
            + "\", Context \"" +  result.getContext()
            + "\", Change Date \"" + dateFormat.format(result.getChangeDate().getTime())
            + "\", New Value \"" + result.getNewValue()
            + "\", Old Value \"" + result.getOldValue()
            + "\", Profile Name \"" + result.getUsername()
            + "\" was found.");
      }
    } else {
      System.out.print("No change logs found for your criteria.");
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

    long advertiserId = Long.parseLong(ADVERTISER_ID);

    runExample(dfaServices, session, advertiserId);
  }
}
