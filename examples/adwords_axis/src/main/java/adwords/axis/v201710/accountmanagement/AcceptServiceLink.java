// Copyright 2017 Google Inc. All Rights Reserved.
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

package adwords.axis.v201710.accountmanagement;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201710.cm.ApiError;
import com.google.api.ads.adwords.axis.v201710.cm.ApiException;
import com.google.api.ads.adwords.axis.v201710.cm.Operator;
import com.google.api.ads.adwords.axis.v201710.mcm.CustomerServiceInterface;
import com.google.api.ads.adwords.axis.v201710.mcm.ServiceLink;
import com.google.api.ads.adwords.axis.v201710.mcm.ServiceLinkLinkStatus;
import com.google.api.ads.adwords.axis.v201710.mcm.ServiceLinkOperation;
import com.google.api.ads.adwords.axis.v201710.mcm.ServiceType;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.utils.examples.ArgumentNames;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;

/**
 * This example accepts a pending invitation to link your AdWords account to a Google Merchant
 * Center account.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class AcceptServiceLink {

  private static class AcceptServiceLinkParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.SERVICE_LINK_ID, required = true)
    private Long serviceLinkId;
  }

  public static void main(String[] args) {
    AdWordsSession session;
    try {
      // Generate a refreshable OAuth2 credential.
      Credential oAuth2Credential =
          new OfflineCredentials.Builder()
              .forApi(Api.ADWORDS)
              .fromFile()
              .build()
              .generateCredential();

      // Construct an AdWordsSession.
      session =
          new AdWordsSession.Builder().fromFile().withOAuth2Credential(oAuth2Credential).build();
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

    AdWordsServicesInterface adWordsServices = AdWordsServices.getInstance();

    AcceptServiceLinkParams params = new AcceptServiceLinkParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.serviceLinkId = Long.parseLong("INSERT_SERVICE_LINK_ID_HERE");
    }

    try {
      runExample(adWordsServices, session, params.serviceLinkId);
    } catch (ApiException apiException) {
      // ApiException is the base class for most exceptions thrown by an API request. Instances
      // of this exception have a message and a collection of ApiErrors that indicate the
      // type and underlying cause of the exception. Every exception object in the adwords.axis
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
      System.err.printf(
          "Request failed unexpectedly due to RemoteException: %s%n", re);
    }
  }

  /**
   * Runs the example.
   *
   * @param adWordsServices the services factory.
   * @param session the session.
   * @param serviceLinkId the ID of the service link to accept.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, long serviceLinkId)
      throws RemoteException {
    // Get the CustomerService.
    CustomerServiceInterface customerService =
        adWordsServices.get(session, CustomerServiceInterface.class);

    // Create the operation to set the status to ACTIVE.
    ServiceLinkOperation op = new ServiceLinkOperation();
    op.setOperator(Operator.SET);
    ServiceLink serviceLink = new ServiceLink();
    serviceLink.setServiceLinkId(serviceLinkId);
    serviceLink.setServiceType(ServiceType.MERCHANT_CENTER);
    serviceLink.setLinkStatus(ServiceLinkLinkStatus.ACTIVE);
    op.setOperand(serviceLink);

    // Update the service link.
    ServiceLink[] mutatedServiceLinks =
        customerService.mutateServiceLinks(new ServiceLinkOperation[] {op});

    // Display the results.
    for (ServiceLink mutatedServiceLink : mutatedServiceLinks) {
      System.out.printf(
          "Service link with service link ID %d, type '%s' updated to status: %s.%n",
          mutatedServiceLink.getServiceLinkId(),
          mutatedServiceLink.getServiceType(),
          mutatedServiceLink.getLinkStatus());
    }
  }
}
