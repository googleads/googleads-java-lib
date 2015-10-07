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

package adwords.axis.v201509.basicoperations;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201509.cm.Campaign;
import com.google.api.ads.adwords.axis.v201509.cm.CampaignPage;
import com.google.api.ads.adwords.axis.v201509.cm.CampaignServiceInterface;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example gets all campaigns with AWQL. To add a campaign, run
 * AddCampaign.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetCampaignsWithAwql {

  private static final int PAGE_SIZE = 100;

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

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session);
  }

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session) throws Exception {
    // Get the CampaignService.
    CampaignServiceInterface campaignService =
        adWordsServices.get(session, CampaignServiceInterface.class);

    int offset = 0;

    String query = "SELECT Id, Name, Status ORDER BY Name";


    CampaignPage page = null;
    do {
      String pageQuery = query + String.format(" LIMIT %d, %d", offset, PAGE_SIZE);
      // Get all campaigns.
      page = campaignService.query(pageQuery);

      // Display campaigns.
      if (page.getEntries() != null) {
        for (Campaign campaign : page.getEntries()) {
          System.out.println("Campaign with name \"" + campaign.getName() + "\" and id \""
              + campaign.getId() + "\" was found.");
        }
      } else {
        System.out.println("No campaigns were found.");
      }

      offset += PAGE_SIZE;
    } while (offset < page.getTotalNumEntries());
  }
}
