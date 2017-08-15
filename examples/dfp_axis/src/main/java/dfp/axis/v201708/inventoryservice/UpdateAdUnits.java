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

package dfp.axis.v201708.inventoryservice;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201708.StatementBuilder;
import com.google.api.ads.dfp.axis.v201708.AdUnit;
import com.google.api.ads.dfp.axis.v201708.AdUnitPage;
import com.google.api.ads.dfp.axis.v201708.AdUnitSize;
import com.google.api.ads.dfp.axis.v201708.EnvironmentType;
import com.google.api.ads.dfp.axis.v201708.InventoryServiceInterface;
import com.google.api.ads.dfp.axis.v201708.Size;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.base.Joiner;
import com.google.common.collect.Iterables;
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

  public static void runExample(DfpServices dfpServices, DfpSession session, String adUnitId)
      throws Exception {
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

    UpdateAdUnitsParams params = new UpdateAdUnitsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.adUnitId = "INSERT_AD_UNIT_ID_HERE";
    }

    runExample(dfpServices, session, params.adUnitId);
  }
}
