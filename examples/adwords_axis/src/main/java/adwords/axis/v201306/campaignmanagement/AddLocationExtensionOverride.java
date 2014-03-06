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

package adwords.axis.v201306.campaignmanagement;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201306.cm.AdExtension;
import com.google.api.ads.adwords.axis.v201306.cm.AdExtensionOverride;
import com.google.api.ads.adwords.axis.v201306.cm.AdExtensionOverrideOperation;
import com.google.api.ads.adwords.axis.v201306.cm.AdExtensionOverrideReturnValue;
import com.google.api.ads.adwords.axis.v201306.cm.AdExtensionOverrideServiceInterface;
import com.google.api.ads.adwords.axis.v201306.cm.LocationOverrideInfo;
import com.google.api.ads.adwords.axis.v201306.cm.LocationOverrideInfoRadiusUnits;
import com.google.api.ads.adwords.axis.v201306.cm.Operator;
import com.google.api.ads.adwords.axis.v201306.cm.OverrideInfo;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example ads an ad extension override to an ad using an existing campaign
 * ad extension. To get ads, run GetTextAds.java. To get campaign ad extensions,
 * run AddLocationExtension.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: AdExtensionOverrideService.mutate
 *
 * Category: adx-exclude
 *
 * @author Kevin Winter
 */
public class AddLocationExtensionOverride {

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential similar to a ClientLogin token
    // and can be used in place of a service account.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.ADWORDS)
        .fromFile()
        .build()
        .generateCredential();

    // Construct an AdWordsSession.
    AdWordsSession session = new AdWordsSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    long adId = Long.parseLong("INSERT_AD_ID_HERE");
    long campaignAdExtensionId = Long.parseLong("INSERT_CAMPAIGN_AD_EXTENSION_ID_HERE");

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session, adId, campaignAdExtensionId);
  }

  public static void runExample(AdWordsServices adWordsServices, AdWordsSession session, Long adId,
      Long campaignAdExtensionId) throws Exception {
    // Get the AdExtensionOverrideService.
    AdExtensionOverrideServiceInterface adExtensionOverrideService =
        adWordsServices.get(session, AdExtensionOverrideServiceInterface.class);

    // Create ad extension override.
    AdExtensionOverride adExtensionOverride = new AdExtensionOverride();
    adExtensionOverride.setAdId(adId);

    // Create ad extension using existing id.
    AdExtension adExtension = new AdExtension();
    adExtension.setId(campaignAdExtensionId);
    adExtensionOverride.setAdExtension(adExtension);
    adExtensionOverride.setOverrideInfo(new OverrideInfo(new LocationOverrideInfo(5,
        LocationOverrideInfoRadiusUnits.MILES)));

    // Create operations.
    AdExtensionOverrideOperation operation = new AdExtensionOverrideOperation();
    operation.setOperand(adExtensionOverride);
    operation.setOperator(Operator.ADD);

    AdExtensionOverrideOperation[] operations = new AdExtensionOverrideOperation[] {operation};

    // Add ad extension override.
    AdExtensionOverrideReturnValue result = adExtensionOverrideService.mutate(operations);

    // Display ad extension overrides.
    for (AdExtensionOverride adExtensionOverrideResult : result.getValue()) {
      System.out.println("Location ad extension override with ad id \""
          + adExtensionOverrideResult.getAdId() + "\" and ad extension id \""
          + adExtensionOverrideResult.getAdExtension().getId() + "\" was added.");
    }
  }
}
