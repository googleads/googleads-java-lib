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

package dfp.axis.v201505.contactservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201505.Contact;
import com.google.api.ads.dfp.axis.v201505.ContactServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

import java.util.Random;

/**
 * This example creates new contacts. To determine which contacts exist, run
 * GetAllContacts.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateContacts {

  // Set the ID of the advertiser to create a contact for.
  private static final String ADVERTISER_ID = "INSERT_ADVERTISER_COMPANY_ID_HERE";

  // Set the ID of the agency to create a contact for.
  private static final String AGENCY_ID = "INSERT_AGENCY_COMPANY_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session,
      long advertiserCompanyId, long agencyCompanyId) throws Exception {
    // Get the ContactService.
    ContactServiceInterface contactService =
        dfpServices.get(session, ContactServiceInterface.class);

    // Create an advertiser contact.
    Contact advertiserContact = new Contact();
    advertiserContact.setName("Mr. Advertiser #" + new Random().nextInt(Integer.MAX_VALUE));
    advertiserContact.setEmail("advertiser@advertising.com");
    advertiserContact.setCompanyId(advertiserCompanyId);

    // Create an agency contact.
    Contact agencyContact = new Contact();
    agencyContact.setName("Ms. Agency #" + new Random().nextInt(Integer.MAX_VALUE));
    agencyContact.setEmail("agency@agencies.com");
    agencyContact.setCompanyId(agencyCompanyId);

    // Create the contacts on the server.
    Contact[] contacts =
        contactService.createContacts(new Contact[] {advertiserContact, agencyContact});

    for (Contact createdContact : contacts) {
      System.out.printf("A contact with ID \"%d\" and name \"%s\" was created.\n",
          createdContact.getId(), createdContact.getName());
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

    runExample(dfpServices, session, Long.parseLong(ADVERTISER_ID),
        Long.parseLong(AGENCY_ID));
  }
}
