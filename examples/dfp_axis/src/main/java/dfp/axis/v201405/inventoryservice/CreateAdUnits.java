// Copyright 2013 Google Inc. All Rights Reserved.
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

package dfp.axis.v201405.inventoryservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201405.AdUnit;
import com.google.api.ads.dfp.axis.v201405.AdUnitSize;
import com.google.api.ads.dfp.axis.v201405.AdUnitTargetWindow;
import com.google.api.ads.dfp.axis.v201405.EnvironmentType;
import com.google.api.ads.dfp.axis.v201405.InventoryServiceInterface;
import com.google.api.ads.dfp.axis.v201405.NetworkServiceInterface;
import com.google.api.ads.dfp.axis.v201405.Size;
import com.google.api.ads.dfp.axis.v201405.TargetPlatform;
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

  public static void runExample(DfpServices dfpServices, DfpSession session)
      throws Exception {
    // Get the InventoryService.
    InventoryServiceInterface inventoryService =
        dfpServices.get(session, InventoryServiceInterface.class);

    // Get the NetworkService.
    NetworkServiceInterface networkService =
        dfpServices.get(session, NetworkServiceInterface.class);

    // Set the parent ad unit's ID for all ad units to be created under.
    String parentAdUnitId = networkService.getCurrentNetwork().getEffectiveRootAdUnitId();

    // Create a 300x250 web ad unit size.
    Size webSize = new Size();
    webSize.setWidth(300);
    webSize.setHeight(250);
    webSize.setIsAspectRatio(false);

    AdUnitSize webAdUnitSize = new AdUnitSize();
    webAdUnitSize.setSize(webSize);
    webAdUnitSize.setEnvironmentType(EnvironmentType.BROWSER);

    // Create a 640x360v video ad unit size with a companion.
    Size videoSize = new Size();
    videoSize.setWidth(640);
    videoSize.setHeight(360);
    videoSize.setIsAspectRatio(false);

    AdUnitSize videoAdUnitSize = new AdUnitSize();
    videoAdUnitSize.setSize(videoSize);
    videoAdUnitSize.setCompanions(new AdUnitSize[] {webAdUnitSize});
    videoAdUnitSize.setEnvironmentType(EnvironmentType.VIDEO_PLAYER);

    // Create a web ad unit.
    AdUnit webAdUnit = new AdUnit();
    webAdUnit.setName("web_ad_unit_" + new Random().nextInt(Integer.MAX_VALUE));
    webAdUnit.setDescription(webAdUnit.getName());
    webAdUnit.setTargetPlatform(TargetPlatform.WEB);
    webAdUnit.setParentId(parentAdUnitId);
    webAdUnit.setTargetWindow(AdUnitTargetWindow.BLANK);
    webAdUnit.setAdUnitSizes(new AdUnitSize[]{webAdUnitSize});

    // Create a video ad unit.
    AdUnit videoAdUnit = new AdUnit();
    videoAdUnit.setName("video_ad_unit_" + new Random().nextInt(Integer.MAX_VALUE));
    videoAdUnit.setDescription(videoAdUnit.getName());
    videoAdUnit.setTargetPlatform(TargetPlatform.WEB);
    videoAdUnit.setParentId(parentAdUnitId);
    videoAdUnit.setTargetWindow(AdUnitTargetWindow.BLANK);
    videoAdUnit.setAdUnitSizes(new AdUnitSize[]{videoAdUnitSize});

    // Create the ad units on the server.
    AdUnit[] adUnits = inventoryService.createAdUnits(new AdUnit[] {webAdUnit, videoAdUnit});

    for (AdUnit adUnit : adUnits) {
      System.out.printf("An ad unit with ID \"%s\", name \"%s\" was created.\n", adUnit.getId(),
          adUnit.getName());
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

    runExample(dfpServices, session);
  }
}
