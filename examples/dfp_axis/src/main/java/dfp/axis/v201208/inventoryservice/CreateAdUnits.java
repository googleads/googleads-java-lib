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
import com.google.api.ads.dfp.axis.v201208.AdUnitTargetWindow;
import com.google.api.ads.dfp.axis.v201208.EnvironmentType;
import com.google.api.ads.dfp.axis.v201208.InventoryServiceInterface;
import com.google.api.ads.dfp.axis.v201208.MobilePlatform;
import com.google.api.ads.dfp.axis.v201208.NetworkServiceInterface;
import com.google.api.ads.dfp.axis.v201208.Size;
import com.google.api.ads.dfp.axis.v201208.TargetPlatform;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

import java.util.Random;

/**
 * This example creates new ad units. To determine which ad units exist, run
 * GetAllAdUnits.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: InventoryService.createAdUnits
 *
 * @author Adam Rogal
 */
public class CreateAdUnits {

  public static void runExample(DfpServices dfpServices, DfpSession session, String parentId)
      throws Exception {
    // Get the InventoryService.
    InventoryServiceInterface inventoryService =
        dfpServices.get(session, InventoryServiceInterface.class);

    // Create ad unit size.
    Size size = new Size();
    size.setWidth(300);
    size.setHeight(250);
    size.setIsAspectRatio(false);

    AdUnitSize adUnitSize = new AdUnitSize();
    adUnitSize.setSize(size);
    adUnitSize.setEnvironmentType(EnvironmentType.BROWSER);

    // Create a web ad unit.
    AdUnit webAdUnit = new AdUnit();
    webAdUnit.setName("Web_ad_unit_" + new Random().nextLong());
    webAdUnit.setDescription(webAdUnit.getName());
    webAdUnit.setTargetPlatform(TargetPlatform.WEB);
    webAdUnit.setParentId(parentId);
    webAdUnit.setTargetWindow(AdUnitTargetWindow.BLANK);
    webAdUnit.setAdUnitSizes(new AdUnitSize[]{adUnitSize});

    // Create a mobile ad unit.
    AdUnit mobileAdUnit = new AdUnit();
    mobileAdUnit.setName("Mobile_ad_unit_" + new Random().nextLong());
    mobileAdUnit.setDescription(webAdUnit.getName());
    mobileAdUnit.setTargetPlatform(TargetPlatform.MOBILE);
    mobileAdUnit.setParentId(parentId);
    mobileAdUnit.setTargetWindow(AdUnitTargetWindow.BLANK);
    mobileAdUnit.setMobilePlatform(MobilePlatform.APPLICATION);
    mobileAdUnit.setAdUnitSizes(new AdUnitSize[]{adUnitSize});

    // Create the ad units on the server.
    AdUnit[] adUnits = inventoryService.createAdUnits(new AdUnit[] {webAdUnit, mobileAdUnit});

    for (AdUnit adUnit : adUnits) {
      System.out.printf(
          "An ad unit with ID \"%s\", name \"%s\", and target platform \"%s\" was created.\n",
          adUnit.getId(), adUnit.getName(), adUnit.getTargetPlatform());
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

    // Get the NetworkService.
    NetworkServiceInterface networkService =
        dfpServices.get(session, NetworkServiceInterface.class);

    // Set the parent ad unit's ID for all ad units to be created under.
    String parentId = networkService.getCurrentNetwork().getEffectiveRootAdUnitId();

    runExample(dfpServices, session, parentId);
  }
}
