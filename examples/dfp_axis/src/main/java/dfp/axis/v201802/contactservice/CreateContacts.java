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

package dfp.axis.v201802.contactservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201802.ApiError;
import com.google.api.ads.dfp.axis.v201802.ApiException;
import com.google.api.ads.dfp.axis.v201802.Contact;
import com.google.api.ads.dfp.axis.v201802.ContactServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;
import java.util.Random;

/**
 * This example creates new contacts. To determine which contacts exist, run
 * GetAllContacts.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateContacts {

  private static class CreateContactsParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.ADVERTISER_ID, required = true,
        description = "The ID of the advertiser to create a contact for.")
    private Long advertiserId;

    @Parameter(names = ArgumentNames.AGENCY_ID, required = true,
        description = "The ID of the agency to create a contact for.")
    private Long agencyId;
  }

  /**
   * Runs the example.
   *
   * @param dfpServices the services factory.
   * @param session the session.
   * @param advertiserCompanyId the ID of the advertiser to create a contact for.
   * @param agencyCompanyId the ID of the agency to create a contact for.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(DfpServices dfpServices, DfpSession session,
      long advertiserCompanyId, long agencyCompanyId) throws RemoteException {
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
      System.out.printf("A contact with ID %d and name '%s' was created.%n",
          createdContact.getId(), createdContact.getName());
    }
  }

  public static void main(String[] args) {
    DfpSession session;
    try {
      // Generate a refreshable OAuth2 credential.
      Credential oAuth2Credential =
          new OfflineCredentials.Builder()
              .forApi(Api.DFP)
              .fromFile()
              .build()
              .generateCredential();

      // Construct a DfpSession.
      session =
          new DfpSession.Builder().fromFile().withOAuth2Credential(oAuth2Credential).build();
    } catch (ConfigurationLoadException cle) {
      System.err.printf(
          "Failed to load configuration from the %s file. Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, cle);
      return;
    } catch (ValidationException ve) {
      System.err.printf(
          "Invalid configuration in the %s file. Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, ve);
      return;
    } catch (OAuthException oe) {
      System.err.printf(
          "Failed to create OAuth credentials. Check OAuth settings in the %s file. "
              + "Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, oe);
      return;
    }

    DfpServices dfpServices = new DfpServices();

    CreateContactsParams params = new CreateContactsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.advertiserId = Long.parseLong("INSERT_ADVERTISER_ID_HERE");
      params.agencyId = Long.parseLong("INSERT_AGENCY_ID_HERE");
    }

    try {
      runExample(dfpServices, session, params.advertiserId, params.agencyId);
    } catch (ApiException apiException) {
      // ApiException is the base class for most exceptions thrown by an API request. Instances
      // of this exception have a message and a collection of ApiErrors that indicate the
      // type and underlying cause of the exception. Every exception object in the dfp.axis
      // packages will return a meaningful value from toString
      //
      // ApiException extends RemoteException, so this catch block must appear before the
      // catch block for RemoteException.
      System.err.println("Request failed due to ApiException. Underlying ApiErrors:");
      if (apiException.getErrors() != null) {
        int i = 0;
        for (ApiError apiError : apiException.getErrors()) {
          System.err.printf("  Error %d: %s%n", i++, apiError);
        }
      }
    } catch (RemoteException re) {
      System.err.printf("Request failed unexpectedly due to RemoteException: %s%n", re);
    }
  }
}
