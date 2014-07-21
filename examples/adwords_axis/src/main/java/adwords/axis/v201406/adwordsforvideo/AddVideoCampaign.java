// Copyright 2014 Google Inc. All Rights Reserved.
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

package adwords.axis.v201406.adwordsforvideo;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201406.cm.Budget;
import com.google.api.ads.adwords.axis.v201406.cm.BudgetBudgetDeliveryMethod;
import com.google.api.ads.adwords.axis.v201406.cm.BudgetBudgetPeriod;
import com.google.api.ads.adwords.axis.v201406.cm.BudgetOperation;
import com.google.api.ads.adwords.axis.v201406.cm.BudgetReturnValue;
import com.google.api.ads.adwords.axis.v201406.cm.BudgetServiceInterface;
import com.google.api.ads.adwords.axis.v201406.cm.Money;
import com.google.api.ads.adwords.axis.v201406.cm.Operator;
import com.google.api.ads.adwords.axis.v201406.video.VideoAdNetwork;
import com.google.api.ads.adwords.axis.v201406.video.VideoAdNetworks;
import com.google.api.ads.adwords.axis.v201406.video.VideoCampaign;
import com.google.api.ads.adwords.axis.v201406.video.VideoCampaignOperation;
import com.google.api.ads.adwords.axis.v201406.video.VideoCampaignReturnValue;
import com.google.api.ads.adwords.axis.v201406.video.VideoCampaignServiceInterface;
import com.google.api.ads.adwords.axis.v201406.video.VideoCampaignStatus;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

import org.joda.time.DateTime;

/**
 * This example illustrates how to create a video campaign.
 *
 * Note: AdWords for Video API is a Beta feature.
 * 
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: VideoCampaignService.mutate, BudgetService.mutate
 *
 * Category: adx-exclude
 *
 * @author Kevin Winter
 * @author Ray Tsang
 */
public class AddVideoCampaign {

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
    // Get the BudgetService.
    BudgetServiceInterface budgetService =
        adWordsServices.get(session, BudgetServiceInterface.class);

    // Create a budget, which can be shared by multiple video campaigns.
    Budget sharedBudget = new Budget();
    sharedBudget.setName("Interplanetary Cruise #" + System.currentTimeMillis());
    Money budgetAmount = new Money();
    budgetAmount.setMicroAmount(50000000L);
    sharedBudget.setAmount(budgetAmount);
    sharedBudget.setDeliveryMethod(BudgetBudgetDeliveryMethod.STANDARD);
    sharedBudget.setPeriod(BudgetBudgetPeriod.DAILY);

    BudgetOperation budgetOperation = new BudgetOperation();
    budgetOperation.setOperand(sharedBudget);
    budgetOperation.setOperator(Operator.ADD);

    // Add the budget and get the budget ID.
    BudgetReturnValue budgetResult = budgetService.mutate(
        new BudgetOperation[] {budgetOperation});
    Long budgetId = budgetResult.getValue(0).getBudgetId();

    // Get the VideoCampaignService.
    VideoCampaignServiceInterface videoCampaignService =
        adWordsServices.get(session, VideoCampaignServiceInterface.class);

    // Create video campaign.
    VideoCampaign videoCampaign = new VideoCampaign();
    videoCampaign.setName("Interplanetary Cruise #"
        + System.currentTimeMillis());
    videoCampaign.setStatus(VideoCampaignStatus.PAUSED);
    VideoAdNetworks networks = new VideoAdNetworks();
    networks.setNetworks(new VideoAdNetwork[] {
        VideoAdNetwork.GOOGLE_DISPLAY_NETWORK,
        VideoAdNetwork.YOUTUBE_WATCH});
    videoCampaign.setNetworks(networks);

    // You can optionally provide these field(s).
    videoCampaign.setStartDate(new DateTime().plusDays(1).toString("yyyyMMdd"));
    videoCampaign.setBudgetId(budgetId);

    // Create operations.
    VideoCampaignOperation operation = new VideoCampaignOperation();
    operation.setOperand(videoCampaign);
    operation.setOperator(Operator.ADD);
    
    VideoCampaignOperation[] operations = new VideoCampaignOperation[] {operation};

    // Add video campaigns.
    VideoCampaignReturnValue result = videoCampaignService.mutate(operations);

    // Display video campaigns.
    for (VideoCampaign videoCampaignResult : result.getValue()) {
      System.out.printf("Campaign with name '%s' and id %d was added.%n",
          videoCampaignResult.getName(),
          videoCampaignResult.getId());
    }
  }
}
