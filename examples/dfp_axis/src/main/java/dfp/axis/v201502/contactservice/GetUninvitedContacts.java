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

package dfp.axis.v201502.contactservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201502.StatementBuilder;
import com.google.api.ads.dfp.axis.v201502.Contact;
import com.google.api.ads.dfp.axis.v201502.ContactPage;
import com.google.api.ads.dfp.axis.v201502.ContactServiceInterface;
import com.google.api.ads.dfp.axis.v201502.ContactStatus;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example gets all contacts that aren't invited yet. To create contacts,
 * run CreateContacts.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetUninvitedContacts {

  public static void runExample(DfpServices dfpServices, DfpSession session) throws Exception {
    // Get the ContactService.
    ContactServiceInterface contactService =
        dfpServices.get(session, ContactServiceInterface.class);

    // Create a statement to only select contacts that aren't invited yet.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("status = :status")
        .orderBy("id ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("status", ContactStatus.UNINVITED.toString());

    // Default for total result set size.
    int totalResultSetSize = 0;

    do {
      // Get contacts by statement.
      ContactPage page = contactService.getContactsByStatement(statementBuilder.toStatement());

      if (page.getResults() != null) {
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (Contact contact : page.getResults()) {
          System.out.printf(
              "%d) Contact with ID \"%d\" and name \"%s\" was found.\n", i++,
              contact.getId(), contact.getName());
        }
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);

    System.out.printf("Number of results found: %d\n", totalResultSetSize);
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
