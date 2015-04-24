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

package adwords.axis.v201409.migration;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.v201409.SelectorBuilder;
import com.google.api.ads.adwords.axis.v201409.cm.Ad;
import com.google.api.ads.adwords.axis.v201409.cm.AdGroupAd;
import com.google.api.ads.adwords.axis.v201409.cm.AdGroupAdPage;
import com.google.api.ads.adwords.axis.v201409.cm.AdGroupAdServiceInterface;
import com.google.api.ads.adwords.axis.v201409.cm.AdUrlUpgrade;
import com.google.api.ads.adwords.axis.v201409.cm.Selector;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.selectorfields.v201409.cm.AdGroupAdField;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This code example upgrades an ad to use upgraded URLs.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file. See
 * README for more info.
 *
 * Tags: AdGroupAdService.get, AdGroupAdService.upgradeUrl
 *
 * @author Josh Radcliff
 */
public class UpgradeAdUrl {

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

    Long adGroupId = Long.valueOf("INSERT_ADGROUP_ID_HERE");
    Long adId = Long.valueOf("INSERT_AD_ID_HERE");

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session, adGroupId, adId);
  }

  public static void runExample(AdWordsServices adWordsServices, AdWordsSession session,
      Long adGroupId, Long adId) throws Exception {
    // Retrieve the ad.
    AdGroupAdServiceInterface adGroupAdService =
        adWordsServices.get(session, AdGroupAdServiceInterface.class);

    AdGroupAd adGroupAd = getAdGroupAd(adGroupAdService, adGroupId, adId);
    if (adGroupAd == null) {
      System.out.println("Ad not found.");
      return;
    }

    // Copy the destination URL to the final URL.
    AdUrlUpgrade upgradeUrl = new AdUrlUpgrade();
    upgradeUrl.setAdId(adGroupAd.getAd().getId());
    upgradeUrl.setFinalUrl(adGroupAd.getAd().getUrl());

    // Upgrade the ad.
    Ad[] upgradedAds = adGroupAdService.upgradeUrl(new AdUrlUpgrade[] {upgradeUrl});

    // Display the results.
    if (upgradedAds != null && upgradedAds.length > 0) {
      for (Ad upgradedAd : upgradedAds) {
        System.out.printf("Ad with ID %d and destination URL '%s' was upgraded.%n",
            upgradedAd.getId(), upgradedAd.getFinalUrls(0));
      }
    } else {
      System.out.println("No ads were upgraded.");
    }
  }

  /**
   * Gets the ad group ad by ID.
   */
  private static AdGroupAd getAdGroupAd(AdGroupAdServiceInterface adGroupAdService, Long adGroupId,
      Long adId) throws Exception {
    Selector selector = new SelectorBuilder()
        .fields(AdGroupAdField.Id, AdGroupAdField.Url)
        .equals(AdGroupAdField.AdGroupId, adGroupId.toString())
        .equalsId(adId)
        .build();
    
    AdGroupAdPage adGroupAdPage = adGroupAdService.get(selector);
    if (adGroupAdPage != null && adGroupAdPage.getEntries() != null
        && adGroupAdPage.getEntries().length > 0) {
      return adGroupAdPage.getEntries(0);
    }
    return null;
  }
}
