// Copyright 2014 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package adwords.axis.v201406.shoppingcampaigns;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201406.cm.CampaignCriterion;
import com.google.api.ads.adwords.axis.v201406.cm.CampaignCriterionOperation;
import com.google.api.ads.adwords.axis.v201406.cm.CampaignCriterionReturnValue;
import com.google.api.ads.adwords.axis.v201406.cm.CampaignCriterionServiceInterface;
import com.google.api.ads.adwords.axis.v201406.cm.Operator;
import com.google.api.ads.adwords.axis.v201406.cm.ProductSalesChannel;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example sets the product sales channel.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: CampaignCriterionService.mutate
 *
 * @author Josh Radcliff
 */
public class SetProductSalesChannel {
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

    Long campaignId = Long.valueOf("INSERT_CAMPAIGN_ID_HERE");
    
    runExample(adWordsServices, session, campaignId);
  }

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session, Long campaignId) throws Exception {
    // Get the campaign criterion service.
    CampaignCriterionServiceInterface campaignCriterionService = adWordsServices.get(session,
        CampaignCriterionServiceInterface.class);
    
    // ProductSalesChannel is a fixedId criterion, with the possible values of:
    // ONLINE = 200
    // LOCAL = 201
    ProductSalesChannel productSalesChannel = new ProductSalesChannel();
    productSalesChannel.setId(200L);

    CampaignCriterion campaignCriterion = new CampaignCriterion();
    campaignCriterion.setCampaignId(campaignId);
    campaignCriterion.setCriterion(productSalesChannel);

    // Create operation.
    CampaignCriterionOperation operation = new CampaignCriterionOperation();
    operation.setOperand(campaignCriterion);
    operation.setOperator(Operator.ADD);

    // Make the mutate request.
    CampaignCriterionReturnValue result = campaignCriterionService.mutate(
        new CampaignCriterionOperation[]{ operation });
    
    campaignCriterion = result.getValue(0);
    
    System.out.printf("Created a ProductSalesChannel criterion with ID %d.%n",
        campaignCriterion.getCriterion().getId());
  }
}
