// Copyright 2018 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.lib.selectorfields.v201802.cm;

import com.google.api.ads.adwords.lib.selectorfields.EntityField;
import com.google.api.ads.adwords.lib.selectorfields.Filterable;

/**
 * A {@code Enum} to facilitate the selection of fields for {@code BiddingStrategy}.
 */
public enum BiddingStrategyField implements EntityField {

  // Fields constants definitions

  /**
   * Specifies the type of bidding scheme and the metadata associated with it.
   */
  BiddingScheme(false),

  /**
   * Id of the flexible bidding strategy.
   * The bidding strategy id is used to associate the bidding strategy with the campaign, ad group or ad group criterion.
   */
  @Filterable
  Id(true),

  /**
   * The target return on ad spend (ROAS).
   * This is optional.
   * If set, the bid strategy will maximize revenue while averaging the target return on ad spend.
   * If the target ROAS is high, the bid strategy may not be able to spend the full budget.
   * If the target ROAS is not set, the bid strategy will aim to achieve the highest possible ROAS for the budget.
   */
  @Filterable
  MaximizeConversionValueTargetRoas(true),

  /**
   * Name of the bidding strategy.
   * Every bidding strategy must have a non-null non-empty name.
   * In addition, all bidding strategies within an account must be named distinctly.
   */
  @Filterable
  Name(true),

  /**
   * Strategy maximum bid limit in advertiser local currency micro units.
   * This upper limit applies to all keywords managed by the strategy.
   */
  PageOnePromotedBidCeiling(false),

  /**
   * Controls whether the strategy always follows bid estimate changes, or only increases.
   * If false, always set a keyword's new bid to the current bid estimate.
   * If true, only updates a keyword's bid if the current bid estimate is greater than the current bid.
   */
  PageOnePromotedBidChangesForRaisesOnly(false),

  /**
   * Bid Multiplier to be applied to the relevant bid estimate (depending on the strategyGoal) in determining a keyword's new max cpc bid.
   */
  PageOnePromotedBidModifier(false),

  /**
   * Controls whether the strategy is allowed to raise bids when the throttling rate of the budget it is serving out of rises above a threshold.
   */
  PageOnePromotedRaiseBidWhenBudgetConstrained(false),

  /**
   * Controls whether the strategy is allowed to raise bids on keywords with lower-range quality scores.
   */
  PageOnePromotedRaiseBidWhenLowQualityScore(false),

  /**
   * Specifies the strategy goal: where impressions are desired to be shown on search result pages.
   */
  PageOnePromotedStrategyGoal(false),

  /**
   * 
   */
  @Filterable
  Status(true),

  /**
   * Average cost per acquisition (CPA) target.
   * This target should be greater than or equal to minimum billable unit based on the currency for the account.
   */
  TargetCpa(false),

  /**
   * Maximum cpc bid limit that applies to all keywords managed by the strategy.
   */
  @Filterable
  TargetCpaMaxCpcBidCeiling(true),

  /**
   * Minimum cpc bid limit that applies to all keywords managed by the strategy.
   */
  @Filterable
  TargetCpaMaxCpcBidFloor(true),

  /**
   * Specifies the target fraction (in micros) of auctions where the advertiser should outrank the competitor.
   * The advertiser outranks the competitor in an auction if either the advertiser appears above the competitor in the search results, or appears in the search results when the competitor does not.
   */
  @Filterable
  TargetOutrankShare(true),

  /**
   * Controls whether the strategy always follows bid estimate changes, or only increases.
   * If false, always sets a keyword's new bid to the estimate that will meet the target.
   * If true, only updates a keyword's bid if the current bid estimate is greater than the current bid.
   */
  @Filterable
  TargetOutrankShareBidChangesForRaisesOnly(true),

  /**
   * Competitor's visible domain URL.
   */
  @Filterable
  TargetOutrankShareCompetitorDomain(true),

  /**
   * Ceiling on max CPC bids.
   */
  @Filterable
  TargetOutrankShareMaxCpcBidCeiling(true),

  /**
   * Controls whether the strategy is allowed to raise bids on keywords with lower-range quality scores.
   */
  @Filterable
  TargetOutrankShareRaiseBidWhenLowQualityScore(true),

  /**
   * The target return on average spend (ROAS).
   */
  TargetRoas(false),

  /**
   * Maximum bid limit that applies to all keywords managed by the strategy.
   */
  TargetRoasBidCeiling(false),

  /**
   * Minimum bid limit that applies to all keywords managed by the strategy.
   */
  TargetRoasBidFloor(false),

  /**
   * The largest max CPC bid that can be set by the TargetSpend bidder.
   */
  TargetSpendBidCeiling(false),

  /**
   * A spend target under which to maximize clicks.
   * The TargetSpend bidder will attempt to spend the smaller of this value or the natural throttling spend amount.
   * If not specified, the budget is used as the spend target.
   */
  TargetSpendSpendTarget(false),

  /**
   * 
   */
  @Filterable
  Type(true),

  ;

  private final boolean isFilterable;

  private BiddingStrategyField(boolean isFilterable) {
    this.isFilterable = isFilterable;
  }

  @Override
  public boolean isFilterable() {
    return this.isFilterable;
  }

}
