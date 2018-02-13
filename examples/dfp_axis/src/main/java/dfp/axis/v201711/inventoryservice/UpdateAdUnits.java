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

package dfp.axis.v201711.inventoryservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201711.StatementBuilder;
import com.google.api.ads.dfp.axis.v201711.AdUnit;
import com.google.api.ads.dfp.axis.v201711.AdUnitPage;
import com.google.api.ads.dfp.axis.v201711.AdUnitSize;
import com.google.api.ads.dfp.axis.v201711.ApiError;
import com.google.api.ads.dfp.axis.v201711.ApiException;
import com.google.api.ads.dfp.axis.v201711.EnvironmentType;
import com.google.api.ads.dfp.axis.v201711.InventoryServiceInterface;
import com.google.api.ads.dfp.axis.v201711.Size;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.base.Joiner;
import com.google.common.collect.Iterables;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This example updates ad unit sizes by adding a banner ad size. To determine
 * which ad units exist, run GetAllAdUnits.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class UpdateAdUnits {

  private static class UpdateAdUnitsParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.AD_UNIT_ID, required = true,
        description = "The ID of the ad unit to update.")
    private String adUnitId;
  }

  /**
   * Runs the example.
   *
   * @param dfpServices the services factory.
   * @param session the session.
   * @param adUnitId the ID of the ad unit to update.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(DfpServices dfpServices, DfpSession session, String adUnitId)
      throws RemoteException {
    // Get the InventoryService.
    InventoryServiceInterface inventoryService =
        dfpServices.get(session, InventoryServiceInterface.class);

    // Create a statement to only select a single ad unit by ID.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("id = :id")
        .orderBy("id ASC")
        .limit(1)
        .withBindVariableValue("id", adUnitId);

    // Get the ad unit.
    AdUnitPage page =
        inventoryService.getAdUnitsByStatement(statementBuilder.toStatement());

    AdUnit adUnit = Iterables.getOnlyElement(Arrays.asList(page.getResults()));

    List<AdUnitSize> adUnitSizes = new ArrayList<>(Arrays.asList(adUnit.getAdUnitSizes()));

    // Create a 480x60 web ad unit size.
    Size size = new Size();
    size.setWidth(468);
    size.setHeight(60);

    AdUnitSize adUnitSize = new AdUnitSize();
    adUnitSize.setSize(size);
    adUnitSize.setEnvironmentType(EnvironmentType.BROWSER);
    adUnitSizes.add(adUnitSize);

    // Update the ad unit sizes.
    adUnit.setAdUnitSizes(adUnitSizes.toArray(new AdUnitSize[] {}));

    // Update the ad unit on the server.
    AdUnit[] adUnits = inventoryService.updateAdUnits(new AdUnit[] {adUnit});

    for (AdUnit updatedAdUnit : adUnits) {
      List<String> adUnitSizeStrings = new ArrayList<>();
      for (AdUnitSize updatedAdUnitSize : updatedAdUnit.getAdUnitSizes()) {
        adUnitSizeStrings.add(String.format("%dx%d", updatedAdUnitSize.getSize().getWidth(),
            updatedAdUnitSize.getSize().getHeight()));
      }
      System.out.printf("Ad unit with ID '%s', name '%s', and sizes [%s] was updated.%n",
          updatedAdUnit.getId(), updatedAdUnit.getName(), Joiner.on(", ").join(adUnitSizeStrings));
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

    UpdateAdUnitsParams params = new UpdateAdUnitsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.adUnitId = "INSERT_AD_UNIT_ID_HERE";
    }

    try {
      runExample(dfpServices, session, params.adUnitId);
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
