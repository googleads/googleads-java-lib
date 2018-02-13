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

package dfp.axis.v201802.lineitemcreativeassociationservice;

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
import com.google.api.ads.dfp.axis.v201802.LineItemCreativeAssociation;
import com.google.api.ads.dfp.axis.v201802.LineItemCreativeAssociationServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;

/**
 * This example creates a new line item creative association (LICA). For small
 * business networks, creative IDs must represent new or copied creatives since
 * creatives cannot be used for more than one line item. For premium solution
 * networks, any creative can be used. To copy creatives, run
 * CopyImageCreatives.java. To determine which LICAs exist, run
 * GetAllLicas.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateLicas {

  private static class CreateLicasParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.LINE_ITEM_ID, required = true,
        description = "The line item ID of the LICA.")
    private Long lineItemId;

    @Parameter(names = ArgumentNames.CREATIVE_ID, required = true,
        description = "The master creative or creatvie set ID of the LICA. For creative sets,"
            + " set the creativeSetId field instead.")
    private Long creativeId;
  }

  /**
   * Runs the example.
   *
   * @param dfpServices the services factory.
   * @param session the session.
   * @param lineItemId the line item ID of the LICA.
   * @param creativeId the master creative or creatvie set ID of the LICA. For creative sets, set
   *     the creativeSetId field instead.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(
      DfpServices dfpServices, DfpSession session, long lineItemId, long creativeId)
      throws RemoteException {
    // Get the LineItemCreativeAssociationService.
    LineItemCreativeAssociationServiceInterface licaService =
        dfpServices.get(session, LineItemCreativeAssociationServiceInterface.class);

    // Create a line item creative association.
    LineItemCreativeAssociation lica = new LineItemCreativeAssociation();
    lica.setLineItemId(lineItemId);
    lica.setCreativeId(creativeId);

    // Create the line item creative association on the server.
    LineItemCreativeAssociation[] licas =
        licaService.createLineItemCreativeAssociations(
            new LineItemCreativeAssociation[] {lica});

    for (LineItemCreativeAssociation createdLica : licas) {
      System.out.printf("A LICA with line item ID %d and creative ID %d was created.%n",
          createdLica.getLineItemId(), createdLica.getCreativeId());
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

    CreateLicasParams params = new CreateLicasParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.lineItemId = Long.parseLong("INSERT_LINE_ITEM_ID_HERE");
      params.creativeId = Long.parseLong("INSERT_CREATIVE_ID_HERE");
    }

    try {
      runExample(dfpServices, session, params.lineItemId, params.creativeId);
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
