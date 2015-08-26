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

package dfa.axis.v1_20;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfa.axis.factory.DfaServices;
import com.google.api.ads.dfa.axis.v1_20.Campaign;
import com.google.api.ads.dfa.axis.v1_20.CampaignRemote;
import com.google.api.ads.dfa.axis.v1_20.CampaignSaveResult;
import com.google.api.ads.dfa.axis.v1_20.LandingPage;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.client.auth.oauth2.Credential;

import java.util.Calendar;

/**
 * This example creates a campaign associated with a given advertiser. To create
 * an advertiser, run CreateAdvertiser.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateCampaign {

  // Set some parameters for the new campaign.
  private static final String CAMPAIGN_NAME = "INSERT_CAMPAIGN_NAME_HERE";
  private static final String ADVERTISER_ID = "INSERT_ADVERTISER_ID_HERE";
  private static final String URL = "INSERT_LANDING_PAGE_URL_HERE";
  private static final String LANDING_PAGE_NAME = "INSERT_LANDING_PAGE_NAME_HERE";

  public static void runExample(
      DfaServices dfaServices, DfaSession session, String campaignName, long advertiserId,
      String url, String landingPageName) throws Exception {
    // Request the campaign service from the service client factory.
    CampaignRemote campaignService = dfaServices.get(session, CampaignRemote.class);

    // Create the campaign structure.
    Campaign campaign = new Campaign();
    campaign.setId(0);
    campaign.setName(campaignName);
    campaign.setAdvertiserId(advertiserId);

    // Create and set a default landing page.
    LandingPage defaultLandingPage = new LandingPage();
    defaultLandingPage.setId(0);
    defaultLandingPage.setName(landingPageName);
    defaultLandingPage.setUrl(url);
    campaign.setDefaultLandingPageId(campaignService.saveLandingPage(
        defaultLandingPage).getId());

    // Set the campaign start date. This example uses today's date.
    Calendar startDate = Calendar.getInstance();
    campaign.setStartDate(startDate);

    // Set the campaign end date. This example uses one month from today's date.
    Calendar endDate = Calendar.getInstance();
    endDate.add(Calendar.MONTH, 1);
    campaign.setEndDate(endDate);

    // Save the campaign.
    CampaignSaveResult campaignSaveResult = campaignService.saveCampaign(campaign);

    // Display the new campaign ID.
    System.out.printf("Campaign with ID \"%s\" was created.%n", campaignSaveResult.getId());
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential, which replaces legacy passwords
    // and can be used in place of a service account.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.DFA)
        .fromFile()
        .build()
        .generateCredential();

    // Construct a DfaSession.
    DfaSession session = new DfaSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    DfaServices dfaServices = new DfaServices();

    long advertiserId = Long.parseLong(ADVERTISER_ID);

    runExample(dfaServices, session, CAMPAIGN_NAME, advertiserId, URL, LANDING_PAGE_NAME);
  }
}
