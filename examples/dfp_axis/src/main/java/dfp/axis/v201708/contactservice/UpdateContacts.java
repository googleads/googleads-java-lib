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

package dfp.axis.v201708.contactservice;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201708.StatementBuilder;
import com.google.api.ads.dfp.axis.v201708.Contact;
import com.google.api.ads.dfp.axis.v201708.ContactPage;
import com.google.api.ads.dfp.axis.v201708.ContactServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Iterables;
import java.util.Arrays;

/**
 * This example updates contact addresses. To determine which contacts exist,
 * run GetAllContacts.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class UpdateContacts {

  private static class UpdateContactsParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.CONTACT_ID, required = true,
        description = "The ID of the contact to update.")
    private Long contactId;
  }

  public static void runExample(DfpServices dfpServices, DfpSession session, long contactId)
      throws Exception {
    // Get the ContactService.
    ContactServiceInterface contactService =
        dfpServices.get(session, ContactServiceInterface.class);

    // Create a statement to only select a single contact by ID.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("id = :id")
        .orderBy("id ASC")
        .limit(1)
        .withBindVariableValue("id", contactId);
    
    // Get the contact.
    ContactPage page =
        contactService.getContactsByStatement(statementBuilder.toStatement());
    
    Contact contact = Iterables.getOnlyElement(Arrays.asList(page.getResults()));

    // Update the address of the contact.
    contact.setAddress("123 New Street, New York, NY, 10011");

    // Update the contact on the server.
    Contact[] contacts = contactService.updateContacts(new Contact[] {contact});

    for (Contact updatedContact : contacts) {
      System.out.printf(
          "Contact with ID %d, name '%s', and address '%s' was updated.%n",
          updatedContact.getId(), updatedContact.getName(), updatedContact.getAddress());
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

    UpdateContactsParams params = new UpdateContactsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.contactId = Long.parseLong("INSERT_CONTACT_ID_HERE");
    }

    runExample(dfpServices, session, params.contactId);
  }
}
