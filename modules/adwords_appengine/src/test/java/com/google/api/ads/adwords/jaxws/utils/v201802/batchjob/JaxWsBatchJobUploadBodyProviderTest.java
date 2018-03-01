// Copyright 2015 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.jaxws.utils.v201802.batchjob;

import com.google.api.ads.adwords.jaxws.utils.JaxWsBatchJobUploadBodyProvider;
import com.google.api.ads.adwords.jaxws.v201802.cm.AdvertisingChannelType;
import com.google.api.ads.adwords.jaxws.v201802.cm.BiddingStrategyConfiguration;
import com.google.api.ads.adwords.jaxws.v201802.cm.BiddingStrategyType;
import com.google.api.ads.adwords.jaxws.v201802.cm.Budget;
import com.google.api.ads.adwords.jaxws.v201802.cm.BudgetBudgetDeliveryMethod;
import com.google.api.ads.adwords.jaxws.v201802.cm.BudgetOperation;
import com.google.api.ads.adwords.jaxws.v201802.cm.Campaign;
import com.google.api.ads.adwords.jaxws.v201802.cm.CampaignCriterionOperation;
import com.google.api.ads.adwords.jaxws.v201802.cm.CampaignOperation;
import com.google.api.ads.adwords.jaxws.v201802.cm.CampaignStatus;
import com.google.api.ads.adwords.jaxws.v201802.cm.Keyword;
import com.google.api.ads.adwords.jaxws.v201802.cm.KeywordMatchType;
import com.google.api.ads.adwords.jaxws.v201802.cm.ManualCpcBiddingScheme;
import com.google.api.ads.adwords.jaxws.v201802.cm.Money;
import com.google.api.ads.adwords.jaxws.v201802.cm.NegativeCampaignCriterion;
import com.google.api.ads.adwords.jaxws.v201802.cm.Operator;
import com.google.api.ads.adwords.lib.utils.testing.BatchJobUploadBodyProviderTest;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests for {@link JaxWsBatchJobUploadBodyProvider}.
 */
@RunWith(JUnit4.class)
public class JaxWsBatchJobUploadBodyProviderTest
    extends BatchJobUploadBodyProviderTest<BatchJobMutateRequest> {

  @Override
  protected String getApiVersion() {
    return "v201802";
  }

  @Override
  protected BatchJobMutateRequest createMutateRequest() {
    return new BatchJobMutateRequest();
  }

  @Override
  protected void addBudgetOperation(
      BatchJobMutateRequest request,
      long budgetId,
      String budgetName,
      long budgetAmountInMicros,
      String deliveryMethod) {
    Budget budget = new Budget();
    budget.setBudgetId(budgetId);
    budget.setName(budgetName);
    Money budgetAmount = new Money();
    budgetAmount.setMicroAmount(budgetAmountInMicros);
    budget.setAmount(budgetAmount);
    budget.setDeliveryMethod(BudgetBudgetDeliveryMethod.valueOf(deliveryMethod));

    BudgetOperation budgetOperation = new BudgetOperation();
    budgetOperation.setOperand(budget);
    budgetOperation.setOperator(Operator.ADD);
    request.addOperation(budgetOperation);
  }

  @Override
  protected void addCampaignOperation(
      BatchJobMutateRequest request,
      long campaignId,
      String campaignName,
      String status,
      String advertisingChannelType,
      long budgetId,
      String biddingStrategyType,
      boolean enhancedCpcEnabled) {
    Campaign campaign = new Campaign();
    campaign.setId(campaignId);
    campaign.setName(campaignName);
    campaign.setStatus(CampaignStatus.valueOf(status));
    campaign.setAdvertisingChannelType(AdvertisingChannelType.valueOf(advertisingChannelType));
    Budget budget = new Budget();
    budget.setBudgetId(budgetId);
    campaign.setBudget(budget);
    BiddingStrategyConfiguration biddingStrategyConfiguration = new BiddingStrategyConfiguration();
    biddingStrategyConfiguration.setBiddingStrategyType(
        BiddingStrategyType.valueOf(biddingStrategyType));

    ManualCpcBiddingScheme cpcBiddingScheme = new ManualCpcBiddingScheme();
    cpcBiddingScheme.setEnhancedCpcEnabled(enhancedCpcEnabled);
    biddingStrategyConfiguration.setBiddingScheme(cpcBiddingScheme);

    campaign.setBiddingStrategyConfiguration(biddingStrategyConfiguration);

    CampaignOperation operation = new CampaignOperation();
    operation.setOperand(campaign);
    operation.setOperator(Operator.ADD);

    request.addOperation(operation);
  }

  @Override
  protected void addCampaignNegativeKeywordOperation(
      BatchJobMutateRequest request, long campaignId, String keywordText, String keywordMatchType) {
    Keyword keyword = new Keyword();
    keyword.setText(keywordText);
    keyword.setMatchType(KeywordMatchType.valueOf(keywordMatchType));

    NegativeCampaignCriterion negativeCriterion = new NegativeCampaignCriterion();
    negativeCriterion.setCampaignId(campaignId);
    negativeCriterion.setCriterion(keyword);

    CampaignCriterionOperation operation = new CampaignCriterionOperation();
    operation.setOperand(negativeCriterion);
    operation.setOperator(Operator.ADD);

    request.addOperation(operation);
  }
}
