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

package dfp.axis.v201311.contactservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201311.Contact;
import com.google.api.ads.dfp.axis.v201311.ContactServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example updates contact addresses. To determine which contacts exist,
 * run GetAllContacts.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: ContactService.getContact
 * Tags: ContactService.updateContacts
 *
 * @author Adam Rogal
 */
public class UpdateContacts {

  // Set the ID of the contact to update.
  private static final String CONTACT_ID = "INSERT_CONTACT_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session, long contactId)
      throws Exception {
    // Get the ContactService.
    ContactServiceInterface contactService =
        dfpServices.get(session, ContactServiceInterface.class);

    // Get the contact.
    Contact contact = contactService.getContact(contactId);

    // Update the address of the contact.
    contact.setAddress("123 New Street, New York, NY, 10011");

    // Update the contact on the server.
    Contact[] contacts = contactService.updateContacts(new Contact[] {contact});

    for (Contact updatedContact : contacts) {
      System.out.printf(
          "Contact with ID \"%d\", name \"%s\", and address \"%s\" was updated.\n",
          updatedContact.getId(), updatedContact.getName(), updatedContact.getAddress());
    }
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential similar to a ClientLogin token
    // and can be used in place of a service account.
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

    runExample(dfpServices, session, Long.parseLong(CONTACT_ID));
  }
}
