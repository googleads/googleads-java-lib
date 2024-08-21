// Copyright 2021 Google LLC
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

package admanager.axis.v202408.lineitemcreativeassociationservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.admanager.axis.factory.AdManagerServices;
import com.google.api.ads.admanager.axis.utils.v202408.StatementBuilder;
import com.google.api.ads.admanager.axis.v202408.ApiError;
import com.google.api.ads.admanager.axis.v202408.ApiException;
import com.google.api.ads.admanager.axis.v202408.CreativePushOptions;
import com.google.api.ads.admanager.axis.v202408.LineItemCreativeAssociationServiceInterface;
import com.google.api.ads.admanager.axis.v202408.UpdateResult;
import com.google.api.ads.admanager.lib.client.AdManagerSession;
import com.google.api.ads.admanager.lib.utils.examples.ArgumentNames;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;

/**
 * This example pushes a LICA to a linked device for preview. To determine which linked devices
 * exist, use the PublisherQueryLanguageService linked_device table.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class PushCreativeToDevices {

  private static class PushCreativeToDevicesParams extends CodeSampleParams {
    @Parameter(
        names = ArgumentNames.LINE_ITEM_ID,
        required = true,
        description = "The ID of the line item to push to a device.")
    private Long lineItemId;
    @Parameter(
        names = ArgumentNames.CREATIVE_ID,
        required = true,
        description = "The ID of the creative to push to a device.")
    private Long creativeId;
    @Parameter(
        names = ArgumentNames.LINKED_DEVICE_ID,
        required = true,
        description = "The ID of the linked device to push a LICA to.")
    private Long linkedDeviceId;

  }

  /**
   * Runs the example.
   *
   * @param adManagerServices the services factory.
   * @param session the session.
   * @param lineItemId the ID of the line item to push to a device.
   * @param creativeId the ID of the creative
       to push to a device.
   * @param linkedDeviceId the ID of the linked device to push the LICA to.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(
      AdManagerServices adManagerServices,
      AdManagerSession session,
      long lineItemId,
      long creativeId,
      long linkedDeviceId)
      throws RemoteException {
    // Get the LineItemCreativeAssociationService.
    LineItemCreativeAssociationServiceInterface licaService =
        adManagerServices.get(session, LineItemCreativeAssociationServiceInterface.class);

    // Create a statement to select a single linked device.
    // Linked devices can be read from the linked_device PQL table.
    StatementBuilder statementBuilder =
        new StatementBuilder()
            .where("WHERE id = :linkedDeviceId")
            .withBindVariableValue("linkedDeviceId", linkedDeviceId);

    CreativePushOptions options = new CreativePushOptions();
    options.setLineItemId(lineItemId);
    options.setCreativeId(creativeId);
    UpdateResult updateResult =
        licaService.pushCreativeToDevices(statementBuilder.toStatement(), options);
    System.out.printf("Pushed creative to %d devices%n", updateResult.getNumChanges());
  }

  public static void main(String[] args) {
    AdManagerSession session;
    try {
      // Generate a refreshable OAuth2 credential.
      Credential oAuth2Credential =
          new OfflineCredentials.Builder()
              .forApi(Api.AD_MANAGER)
              .fromFile()
              .build()
              .generateCredential();

      // Construct a AdManagerSession.
      session =
          new AdManagerSession.Builder().fromFile().withOAuth2Credential(oAuth2Credential).build();
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

    AdManagerServices adManagerServices = new AdManagerServices();

    PushCreativeToDevicesParams params = new PushCreativeToDevicesParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.lineItemId = Long.parseLong("INSERT_LINE_ITEM_ID_HERE");
      params.creativeId = Long.parseLong("INSERT_CREATIVE_ID_HERE");
      params.lineItemId = Long.parseLong("INSERT_LINKED_DEVICE_ID_HERE");
    }

    try {
      runExample(
          adManagerServices, session, params.lineItemId, params.creativeId, params.linkedDeviceId);
    } catch (ApiException apiException) {
      // ApiException is the base class for most exceptions thrown by an API request. Instances
      // of this exception have a message and a collection of ApiErrors that indicate the
      // type and underlying cause of the exception. Every exception object in the admanager.axis
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
