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

package dfp.axis.v201802.placementservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201802.StatementBuilder;
import com.google.api.ads.dfp.axis.v201802.AdUnit;
import com.google.api.ads.dfp.axis.v201802.AdUnitPage;
import com.google.api.ads.dfp.axis.v201802.AdUnitSize;
import com.google.api.ads.dfp.axis.v201802.ApiError;
import com.google.api.ads.dfp.axis.v201802.ApiException;
import com.google.api.ads.dfp.axis.v201802.InventoryServiceInterface;
import com.google.api.ads.dfp.axis.v201802.Placement;
import com.google.api.ads.dfp.axis.v201802.PlacementServiceInterface;
import com.google.api.ads.dfp.axis.v201802.Size;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.base.Joiner;
import com.google.common.collect.Sets;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * This example creates new placements for various ad unit sizes. To determine
 * which placements exist, run GetAllPlacements.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreatePlacements {

  /**
   * Runs the example.
   *
   * @param dfpServices the services factory.
   * @param session the session.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(DfpServices dfpServices, DfpSession session)
      throws RemoteException {
    // Get the PlacementService.
    PlacementServiceInterface placementService =
        dfpServices.get(session, PlacementServiceInterface.class);

    // Get all ad units.
    List<AdUnit> adUnits = getAllAdUnits(dfpServices, session);

    // Partition ad units by their size.
    Set<String> mediumSquareAdUnitIds = Sets.newHashSet();
    Set<String> skyscraperAdUnitIds = Sets.newHashSet();
    Set<String> bannerAdUnitIds = Sets.newHashSet();

    for (AdUnit adUnit : adUnits) {
      if (adUnit.getParentId() != null && adUnit.getAdUnitSizes() != null) {
        for (AdUnitSize adUnitSize : adUnit.getAdUnitSizes()) {
          Size size = adUnitSize.getSize();
          if (size.getWidth() == 300 && size.getHeight() == 250) {
            mediumSquareAdUnitIds.add(adUnit.getId());
          } else if (size.getWidth() == 120 && size.getHeight() == 600) {
            skyscraperAdUnitIds.add(adUnit.getId());
          } else if (size.getWidth() == 468 && size.getHeight() == 60) {
            bannerAdUnitIds.add(adUnit.getId());
          }
        }
      }
    }

    List<Placement> placementsToCreate = new ArrayList<>();

    // Only create placements with one or more ad unit.
    if (!mediumSquareAdUnitIds.isEmpty()) {
      // Create medium square placement.
      Placement mediumSquareAdUnitPlacement = new Placement();
      mediumSquareAdUnitPlacement.setName("Medium Square AdUnit Placement #"
          + new Random().nextInt(Integer.MAX_VALUE));
      mediumSquareAdUnitPlacement.setDescription(
          "Contains ad units that can hold creatives of size 300x250");
      mediumSquareAdUnitPlacement.setTargetedAdUnitIds(
          mediumSquareAdUnitIds.toArray(new String[] {}));

      placementsToCreate.add(mediumSquareAdUnitPlacement);
    }

    if (!skyscraperAdUnitIds.isEmpty()) {
      // Create skyscraper placement.
      Placement skyscraperAdUnitPlacement = new Placement();
      skyscraperAdUnitPlacement.setName(
          "Skyscraper AdUnit Placement #" + new Random().nextInt(Integer.MAX_VALUE));
      skyscraperAdUnitPlacement.setDescription(
          "Contains ad units that can hold creatives of size 120x600");
      skyscraperAdUnitPlacement.setTargetedAdUnitIds(skyscraperAdUnitIds.toArray(new String[] {}));
      placementsToCreate.add(skyscraperAdUnitPlacement);
    }

    if (!bannerAdUnitIds.isEmpty()) {
      // Create banner placement.
      Placement bannerAdUnitPlacement = new Placement();
      bannerAdUnitPlacement.setName(
          "Banner AdUnit Placement #" + new Random().nextInt(Integer.MAX_VALUE));
      bannerAdUnitPlacement.setDescription(
          "Contains ad units that can hold creatives of size 468x60");
      bannerAdUnitPlacement.setTargetedAdUnitIds(bannerAdUnitIds.toArray(new String[] {}));
      placementsToCreate.add(bannerAdUnitPlacement);
    }

    if (!placementsToCreate.isEmpty()) {
      // Create the placements on the server.
      Placement[] placements =
          placementService.createPlacements(placementsToCreate.toArray(new Placement[] {}));

      for (Placement createdPlacement : placements) {
        System.out.printf(
            "A placement with ID %d, name '%s', and containing ad units [%s] was created.%n",
            createdPlacement.getId(), createdPlacement.getName(),
            Joiner.on(", ").join(createdPlacement.getTargetedAdUnitIds()));
      }
    } else {
      System.out.println("No placements were created.");
    }
  }

  /** Gets all ad units. */
  public static List<AdUnit> getAllAdUnits(DfpServices dfpServices, DfpSession session)
      throws RemoteException {
    List<AdUnit> adUnits = new ArrayList<>();

    // Get the InventoryService.
    InventoryServiceInterface inventoryService =
        dfpServices.get(session, InventoryServiceInterface.class);

    // Create a statement to select all ad units.
    StatementBuilder statementBuilder = new StatementBuilder()
        .orderBy("id ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT);

    // Default for total result set size.
    int totalResultSetSize = 0;

    do {
      // Get ad units by statement.
      AdUnitPage page = inventoryService.getAdUnitsByStatement(statementBuilder.toStatement());

      if (page.getResults() != null) {
        totalResultSetSize = page.getTotalResultSetSize();
        Collections.addAll(adUnits, page.getResults());
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);
    return adUnits;
  }

  public static void main(String[] args) {
    DfpSession session;
    try {
      // Generate a refreshable OAuth2 credential.
      Credential oAuth2Credential =
          new OfflineCredentials.Builder().forApi(Api.DFP).fromFile().build().generateCredential();

      // Construct a DfpSession.
      session = new DfpSession.Builder().fromFile().withOAuth2Credential(oAuth2Credential).build();
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

    try {
      runExample(dfpServices, session);
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
