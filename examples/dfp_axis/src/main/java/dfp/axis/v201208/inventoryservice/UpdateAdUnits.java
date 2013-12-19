// Copyright 2012 Google Inc. All Rights Reserved.
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

package dfp.axis.v201208.inventoryservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201208.AdUnit;
import com.google.api.ads.dfp.axis.v201208.AdUnitSize;
import com.google.api.ads.dfp.axis.v201208.EnvironmentType;
import com.google.api.ads.dfp.axis.v201208.InventoryServiceInterface;
import com.google.api.ads.dfp.axis.v201208.Size;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * This example updates ad unit sizes by adding a banner ad size. To determine
 * which ad units exist, run GetAllAdUnits.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: InventoryService.getAdUnit
 * Tags: InventoryService.updateAdUnits
 *
 * @author Adam Rogal
 */
public class UpdateAdUnits {

  // Set the ID of the ad unit to update.
  static final String AD_UNIT_ID = "INSERT_AD_UNIT_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session, String adUnitId)
      throws Exception {
    // Get the InventoryService.
    InventoryServiceInterface inventoryService =
        dfpServices.get(session, InventoryServiceInterface.class);

    // Get the ad unit.
    AdUnit adUnit = inventoryService.getAdUnit(adUnitId);

    // Add the size 468x60 to the ad unit.
    List<AdUnitSize> adUnitSizes = Lists.<AdUnitSize>newArrayList(adUnit.getAdUnitSizes());

    Size size = new Size();
    size.setWidth(468);
    size.setHeight(60);

    AdUnitSize adUnitSize = new AdUnitSize();
    adUnitSize.setSize(size);
    adUnitSize.setEnvironmentType(EnvironmentType.BROWSER);
    adUnitSizes.add(adUnitSize);

    adUnit.setAdUnitSizes(adUnitSizes.toArray(new AdUnitSize[] {}));

    // Update the ad units on the server.
    AdUnit[] adUnits = inventoryService.updateAdUnits(new AdUnit[] {adUnit});

    for (AdUnit updatedAdUnit : adUnits) {
      List<String> adUnitSizeStrings = Lists.newArrayList();
      for (AdUnitSize updatedAdUnitSize : updatedAdUnit.getAdUnitSizes()) {
        adUnitSizeStrings.add(String.format("{%s x %s}", updatedAdUnitSize.getSize().getWidth(),
            updatedAdUnitSize.getSize().getHeight()));
      }
      System.out.printf(
          "AdUnit with ID \"%s\", name \"%s\", and sizes [%s] was updated.\n",
          updatedAdUnit.getId(), updatedAdUnit.getName(), Joiner.on(',').join(adUnitSizeStrings));
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

    runExample(dfpServices, session, AD_UNIT_ID);
  }
}
