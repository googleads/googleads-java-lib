// Copyright 2016 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.axis.utils.v201603;

import com.google.api.ads.adwords.axis.utils.AxisBatchJobUploadBodyProvider;
import com.google.api.ads.adwords.axis.utils.v201603.batchjob.BatchJobMutateRequest;
import com.google.api.ads.adwords.axis.v201603.cm.AdvertisingChannelType;
import com.google.api.ads.adwords.axis.v201603.cm.BiddingStrategyConfiguration;
import com.google.api.ads.adwords.axis.v201603.cm.BiddingStrategyType;
import com.google.api.ads.adwords.axis.v201603.cm.Budget;
import com.google.api.ads.adwords.axis.v201603.cm.BudgetBudgetDeliveryMethod;
import com.google.api.ads.adwords.axis.v201603.cm.BudgetOperation;
import com.google.api.ads.adwords.axis.v201603.cm.Campaign;
import com.google.api.ads.adwords.axis.v201603.cm.CampaignCriterionOperation;
import com.google.api.ads.adwords.axis.v201603.cm.CampaignOperation;
import com.google.api.ads.adwords.axis.v201603.cm.CampaignStatus;
import com.google.api.ads.adwords.axis.v201603.cm.Keyword;
import com.google.api.ads.adwords.axis.v201603.cm.KeywordMatchType;
import com.google.api.ads.adwords.axis.v201603.cm.ManualCpcBiddingScheme;
import com.google.api.ads.adwords.axis.v201603.cm.Money;
import com.google.api.ads.adwords.axis.v201603.cm.NegativeCampaignCriterion;
import com.google.api.ads.adwords.axis.v201603.cm.Operator;
import com.google.api.ads.adwords.lib.utils.testing.BatchJobUploadBodyProviderTest;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests for {@link AxisBatchJobUploadBodyProvider}.
 */
@RunWith(JUnit4.class)
public class AxisBatchJobUploadBodyProviderTest
    extends BatchJobUploadBodyProviderTest<BatchJobMutateRequest> {

  @Override
  protected String getApiVersion() {
    return "v201603";
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
    budget.setDeliveryMethod(BudgetBudgetDeliveryMethod.fromString(deliveryMethod));

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
    campaign.setStatus(CampaignStatus.fromString(status));
    campaign.setAdvertisingChannelType(AdvertisingChannelType.fromString(advertisingChannelType));
    Budget budget = new Budget();
    budget.setBudgetId(budgetId);
    campaign.setBudget(budget);
    BiddingStrategyConfiguration biddingStrategyConfiguration = new BiddingStrategyConfiguration();
    biddingStrategyConfiguration.setBiddingStrategyType(
        BiddingStrategyType.fromString(biddingStrategyType));

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
    keyword.setMatchType(KeywordMatchType.fromString(keywordMatchType));

    NegativeCampaignCriterion negativeCriterion = new NegativeCampaignCriterion();
    negativeCriterion.setCampaignId(campaignId);
    negativeCriterion.setCriterion(keyword);

    CampaignCriterionOperation operation = new CampaignCriterionOperation();
    operation.setOperand(negativeCriterion);
    operation.setOperator(Operator.ADD);

    request.addOperation(operation);
  }
}
