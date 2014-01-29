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

package adwords.axis.v201309.campaignmanagement;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.v201309.SelectorBuilder;
import com.google.api.ads.adwords.axis.v201309.cm.AdGroupAd;
import com.google.api.ads.adwords.axis.v201309.cm.AdGroupAdPage;
import com.google.api.ads.adwords.axis.v201309.cm.AdGroupAdServiceInterface;
import com.google.api.ads.adwords.axis.v201309.cm.Selector;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example gets all disapproved ads in an ad group. To add ads, run
 * AddTextAds.java. To get ad groups, run GetAdGroups.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: AdGroupAdService.get
 *
 * @author Kevin Winter
 */
public class GetAllDisapprovedAds {

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

    long adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session, adGroupId);
  }

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session, Long adGroupId) throws Exception {
    // Get the AdGroupAdService.
    AdGroupAdServiceInterface adGroupAdService =
        adWordsServices.get(session, AdGroupAdServiceInterface.class);

    // Create selector.
    Selector selector = new SelectorBuilder()
        .fields("Id", "AdGroupAdDisapprovalReasons")
        .orderAscBy("Id")
        .equals("AdGroupId", adGroupId.toString())
        .equals("AdGroupCreativeApprovalStatus", "DISAPPROVED")
        .build();

    // Get all disapproved ads.
    AdGroupAdPage page = adGroupAdService.get(selector);

    // Display ads.
    if (page.getEntries() != null && page.getEntries().length > 0) {
      for (AdGroupAd adGroupAd : page.getEntries()) {
        System.out.println("Ad with id \"" + adGroupAd.getAd().getId() + "\"" + " and type \""
            + adGroupAd.getAd().getAdType() + "\" was disapproved for the following reasons:");
        for (String reason : adGroupAd.getDisapprovalReasons()) {
          System.out.println("  \"" + reason + "\"");
        }
      }
    } else {
      System.out.println("No ads were found.");
    }
  }
}
