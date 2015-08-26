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
import com.google.api.ads.dfa.axis.v1_20.Placement;
import com.google.api.ads.dfa.axis.v1_20.PlacementRemote;
import com.google.api.ads.dfa.axis.v1_20.PlacementSaveResult;
import com.google.api.ads.dfa.axis.v1_20.PlacementTagOption;
import com.google.api.ads.dfa.axis.v1_20.PricingSchedule;
import com.google.api.ads.dfa.axis.v1_20.TagSettings;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.client.auth.oauth2.Credential;

import java.util.Calendar;

/**
 * This example creates a placement in a given campaign. Requires a DFA site ID
 * and ID of the campaign in which the placement will be created. To create a
 * campaign, run CreateCampaign.java. To get a DFA site ID, run GetDfaSite.java.
 * To get a size ID, run GetSize.java. To get placement types, run
 * GetPlacementTypes.java. To get pricing types, run GetPricingTypes.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreatePlacement {

  private static final String PLACEMENT_NAME = "INSERT_PLACEMENT_NAME_HERE";
  private static final String DFA_SITE_ID = "INSERT_DFA_SITE_ID_HERE";
  private static final String CAMPAIGN_ID = "INSERT_CAMPAIGN_ID_HERE";
  private static final String PRICING_TYPE = "INSERT_PRICING_TYPE_HERE";
  private static final String SIZE_ID = "INSERT_SIZE_ID_HERE";

  public static void runExample(DfaServices dfaServices, DfaSession session, String placementName,
      long dfaSiteId, long campaignId, int pricingType, long sizeId) throws Exception {
    // Request the placement service from the service client factory.
    PlacementRemote placementService = dfaServices.get(session, PlacementRemote.class);

    // Create the placement.
    Placement placement = new Placement();
    placement.setId(0);
    placement.setName(placementName);
    placement.setCampaignId(campaignId);
    placement.setDfaSiteId(dfaSiteId);
    placement.setSizeId(sizeId);
    // The type ID for regular agency paid placements is 3. See
    // GetPlacementTypes.java
    placement.setPlacementType(3);

    // Set the pricing schedule for the placement.
    PricingSchedule pricingSchedule = new PricingSchedule();
    Calendar startDate = Calendar.getInstance();
    Calendar endDate = Calendar.getInstance();
    endDate.add(Calendar.MONTH, 1);
    pricingSchedule.setStartDate(startDate);
    pricingSchedule.setEndDate(endDate);
    pricingSchedule.setPricingType(pricingType);
    placement.setPricingSchedule(pricingSchedule);

    // Set the placement tag settings.
    TagSettings tagSettings = new TagSettings();
    PlacementTagOption[] placementTagOptions = placementService.getRegularPlacementTagOptions();
    int[] tagTypes = new int[placementTagOptions.length];

    for (int i = 0; i < placementTagOptions.length; i++) {
      tagTypes[i] = (int) placementTagOptions[i].getId();
    }

    tagSettings.setTagTypes(tagTypes);
    placement.setTagSettings(tagSettings);

    // Save the placement.
    PlacementSaveResult placementSaveResult = placementService.savePlacement(placement);

    // Display the new placement ID.
    System.out.printf("Placement with ID \"%s\" was created.%n", placementSaveResult.getId());
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

    long dfaSiteId = Long.parseLong(DFA_SITE_ID);
    long campaignId = Long.parseLong(CAMPAIGN_ID);
    int pricingType = Integer.parseInt(PRICING_TYPE);
    long sizeId = Long.parseLong(SIZE_ID);

    runExample(dfaServices, session, PLACEMENT_NAME, dfaSiteId, campaignId, pricingType, sizeId);
  }
}
