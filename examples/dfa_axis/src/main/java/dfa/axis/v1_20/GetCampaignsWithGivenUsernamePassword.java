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

import com.google.api.ads.dfa.axis.factory.DfaServices;
import com.google.api.ads.dfa.axis.v1_20.Campaign;
import com.google.api.ads.dfa.axis.v1_20.CampaignRecordSet;
import com.google.api.ads.dfa.axis.v1_20.CampaignRemote;
import com.google.api.ads.dfa.axis.v1_20.CampaignSearchCriteria;
import com.google.api.ads.dfa.lib.client.DfaSession;

/**
 * This example gets existing campaigns based on a given search criteria.
 * Results are limited to the first 10.
 *
 * It also shows how to specify the username, password, and application name for
 * the client library to use, rather than having it read it in from a
 * configuration file.
 *
 * Tags: campaign.getCampaignsByCriteria
 *
 * @author Joseph DiLallo
 */
public class GetCampaignsWithGivenUsernamePassword {

  // Specify the search criteria.
  private static final String SEARCH_STRING = "INSERT_SEARCH_CRITERIA_HERE";
  // Specify credentials in code instead of using a properties file.
  private static final String USERNAME = "INSERT_USERNAME_HERE";
  private static final String PASSWORD = "INSERT_PASSWORD_HERE";
  private static final String APPLICATION_NAME = "INSERT_APPLICATION_NAME_HERE";

  public static void runExample(
      DfaServices dfaServices, DfaSession session, String searchString) throws Exception {
    // Request the campaign service from the service client factory.
    CampaignRemote campaignService = dfaServices.get(session, CampaignRemote.class);

    // Create campaign search criteria structure.
    CampaignSearchCriteria searchCriteria = new CampaignSearchCriteria();
    searchCriteria.setPageSize(10);
    searchCriteria.setSearchString(searchString);

    // Get the campaigns.
    CampaignRecordSet campaignRecordSet = campaignService.getCampaignsByCriteria(searchCriteria);

    // Display campaign names and IDs.
    if (campaignRecordSet.getRecords().length > 0) {
      for (Campaign result : campaignRecordSet.getRecords()) {
        System.out.printf("Campaign with name \"%s\" and ID \"%s\" was found.%n",
            result.getName(), result.getId());
      }
    } else {
      System.out.print("No campaigns found for your search criteria.");
    }
  }

  public static void main(String[] args) throws Exception {
    // Construct a DfaSession.
    DfaSession session = new DfaSession.Builder()
        .withUsernameAndPassword(USERNAME, PASSWORD)
        .withApplicationName(APPLICATION_NAME)
        .withEnvironment(DfaSession.Environment.TEST)
        .build();

    DfaServices dfaServices = new DfaServices();

    runExample(dfaServices, session, SEARCH_STRING);
  }
}
