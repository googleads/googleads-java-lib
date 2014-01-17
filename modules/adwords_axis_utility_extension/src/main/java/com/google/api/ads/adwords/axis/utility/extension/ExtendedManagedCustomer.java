// Copyright 2012 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.adwords.axis.utility.extension;

import com.google.api.ads.adwords.axis.utility.extension.exception.UtilityLibraryException;
import com.google.api.ads.adwords.axis.utility.extension.util.AdWordsSessionUtil;
import com.google.api.ads.adwords.axis.v201306.billing.BillingAccount;
import com.google.api.ads.adwords.axis.v201306.billing.BudgetOrder;
import com.google.api.ads.adwords.axis.v201306.cm.AdExtensionOverride;
import com.google.api.ads.adwords.axis.v201306.cm.AdGroup;
import com.google.api.ads.adwords.axis.v201306.cm.AdGroupAd;
import com.google.api.ads.adwords.axis.v201306.cm.AdGroupCriterion;
import com.google.api.ads.adwords.axis.v201306.cm.AdGroupFeed;
import com.google.api.ads.adwords.axis.v201306.cm.AdParam;
import com.google.api.ads.adwords.axis.v201306.cm.Budget;
import com.google.api.ads.adwords.axis.v201306.cm.Campaign;
import com.google.api.ads.adwords.axis.v201306.cm.CampaignAdExtension;
import com.google.api.ads.adwords.axis.v201306.cm.CampaignCriterion;
import com.google.api.ads.adwords.axis.v201306.cm.CampaignFeed;
import com.google.api.ads.adwords.axis.v201306.cm.CampaignStatus;
import com.google.api.ads.adwords.axis.v201306.cm.Feed;
import com.google.api.ads.adwords.axis.v201306.cm.FeedItem;
import com.google.api.ads.adwords.axis.v201306.cm.FeedMapping;
import com.google.api.ads.adwords.axis.v201306.mcm.ManagedCustomer;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.common.collect.Lists;

import java.rmi.RemoteException;
import java.util.List;

/**
 * ExtendedManagedCustomer, encapsulates the {@link ManagedCustomer} level
 * operations.
 *
 * @author Julian Toledo
 */
public final class ExtendedManagedCustomer {

  private final DelegateLocator delegateLocator;

  private final ManagedCustomer managedCustomer;

  /**
   * Constructs an ExtendedManagedCustomer from a ManagedCustomer.
   *
   * @param managedCustomer a ManagedCustomer to convert
   * @param adWordsSession the AdWordsSession for the MCC
   */
  public ExtendedManagedCustomer(ManagedCustomer managedCustomer, AdWordsSession adWordsSession) {
    // Creating a specific DelegateLocator for the CustomerId
    this.managedCustomer = managedCustomer;
    this.delegateLocator = new DelegateLocator(adWordsSession, managedCustomer);
  }

  /**
   * Constructs an ExtendedManagedCustomer from a Session.
   *
   * @param adWordsSession the AdWordsSession for the MCC / with ClientCustomerId
   * @throws RemoteException for communication-related exceptions
   * @throws NumberFormatException for errors in the CustomerId
   */
  public ExtendedManagedCustomer(AdWordsSession adWordsSession)
      throws NumberFormatException, RemoteException {

    if (adWordsSession.getClientCustomerId() != null) {
      ExtendedMcc extendedMcc = new ExtendedMcc(adWordsSession);

      // Get the ClientCustomerId from the AdWordsSession
      ManagedCustomer managedCustomer = extendedMcc.getManagedCustomer(
          adWordsSession.getClientCustomerId());

      // Creating a specific DelegateLocator for the CustomerId
      this.managedCustomer = managedCustomer;

      this.delegateLocator = new DelegateLocator(adWordsSession, managedCustomer);
    } else {
      throw new UtilityLibraryException(
          "Please set api.adwords.clientCustomerId in ads.properties");
    }
  }

  /**
   * Constructs an ExtendedManagedCustomer from a ManagedCustomer.
   *
   * @param managedCustomer a ManagedCustomer to convert
   * @param delegateLocator the DelegateLocator for this account
   */
  public ExtendedManagedCustomer(
      ManagedCustomer managedCustomer, DelegateLocator delegateLocator) {
    // Creating a specific DelegateLocator for the CustomerId
    this.managedCustomer = managedCustomer;
    this.delegateLocator = delegateLocator;
  }

  /**
   * Creates a new ExtendedManagedCustomer using the ads.properties file and using OAuth2.
   *
   * @return the ExtendedManagedCustomer associated with the file
   * @throws OAuthException if problem with OAuth2
   * @throws ConfigurationLoadException if problems loading the ad.properties file
   * @throws ValidationException if the {@code AdWordsSession} did not validate
   * @throws RemoteException for communication-related exceptions
   * @throws NumberFormatException for errors in the CustomerId
   */
  public static ExtendedManagedCustomer withOAuth2FromFile() throws OAuthException,
      ValidationException, ConfigurationLoadException, NumberFormatException, RemoteException {
    return new ExtendedManagedCustomer(AdWordsSessionUtil.fromFileWithOAuth2());
  }

  /**
   * Transforms a regular list of ManagedCustomers into a list of
   * ExtendedManagedCustomers.
   *
   * @param managedCustomers a list of ManagedCustomer to convert
   * @param adWordsSession the AdWordsSession for the MCC
   * @return the converted list of ExtendedManagedCustomers
   */
  public static List<ExtendedManagedCustomer> as(List<ManagedCustomer> managedCustomers,
      AdWordsSession adWordsSession) {    
    List<ExtendedManagedCustomer> listExtended = Lists.newArrayListWithCapacity(managedCustomers
        .size());
    for (ManagedCustomer managedCustomer : managedCustomers) {
      // Creating a specific DelegateLocator for the CustomerId
      listExtended.add(new ExtendedManagedCustomer(managedCustomer, adWordsSession));
    }
    return listExtended;
  }

  /**
   * Retrieves the DelegateLocator for the Account (ManagedCustomer).
   *
   * @return the DelegateLocator for the Account (ManagedCustomer)
   */
  public DelegateLocator getDelegateLocator() {
    return delegateLocator;
  }

  /**
   * Retrieves the encapsulated ManagedCustomer.
   *
   * @return the encapsulated ManagedCustomer
   */
  public ManagedCustomer getManagedCustomer() {
    return managedCustomer;
  }

  /**
   * Gets the Campaigns for the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @return all the Campaigns for the ExtendedManagedCustomer's
   *         ManagedCustomer
   * @throws RemoteException for communication-related exceptions
   */
  public List<Campaign> getCampaigns() throws RemoteException {
    return delegateLocator.getCampaignDelegate().get();
  }

  /**
   * Gets one Campaign for the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @param campaignId
   * @return all the ExtendedCampaign for the ExtendedManagedCustomer's
   *         ManagedCustomer
   * @throws RemoteException for communication-related exceptions
   */
  public Campaign getCampaign(Long campaignId) throws RemoteException {
    return delegateLocator.getCampaignDelegate().getByCampaignId(campaignId);
  }

  /**
   * Gets the Campaigns for the ExtendedManagedCustomer's ManagedCustomer by campaignStatus
   *
   * @param campaignStatus
   * @return all the Campaigns for the ExtendedManagedCustomer's
   *         ManagedCustomer
   * @throws RemoteException for communication-related exceptions
   */
  public List<Campaign> getCampaignsByStatus(CampaignStatus campaignStatus)
      throws RemoteException {
    return delegateLocator.getCampaignDelegate().getByStatus(campaignStatus);
  }

  /**
   * Gets the ExtendedCampaigns for the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @return all the ExtendedCampaigns for the ExtendedManagedCustomer's
   *         ManagedCustomer
   * @throws RemoteException for communication-related exceptions
   */
  public List<ExtendedCampaign> getExtendedCampaigns() throws RemoteException {
    return ExtendedCampaign.as(delegateLocator.getCampaignDelegate().get(),
        delegateLocator);
  }

  /**
   * Gets one Campaign as Extended for the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @param campaignId
   * @return all the ExtendedCampaign for the ExtendedManagedCustomer's
   *         ManagedCustomer
   * @throws RemoteException for communication-related exceptions
   */
  public ExtendedCampaign getExtendedCampaign(Long campaignId) throws RemoteException {
    return new ExtendedCampaign(delegateLocator.getCampaignDelegate().getByCampaignId(campaignId),
        delegateLocator);
  }

  /**
   * Gets the ExtendedCampaigns for the ExtendedManagedCustomer's ManagedCustomer
   * by campaignStatus.
   *
   @param campaignStatus
   * @return all the ExtendedCampaigns for the ExtendedManagedCustomer's
   *         ManagedCustomer
   * @throws RemoteException for communication-related exceptions
   */
  public List<ExtendedCampaign> getExtendedCampaignsByStatus(CampaignStatus campaignStatus)
      throws RemoteException {
    return ExtendedCampaign.as(
        delegateLocator.getCampaignDelegate().getByStatus(campaignStatus), delegateLocator);
  }

  /**
   * Inserts the Campaigns into the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @param campaigns the list of Campaigns to insert
   * @return the updated list of ExtendedCampaign
   * @throws RemoteException for communication-related exceptions
   */
  public List<ExtendedCampaign> insertCampaigns(List<Campaign> campaigns) throws RemoteException {
    return ExtendedCampaign.as(delegateLocator.getCampaignDelegate().insert(campaigns),
        delegateLocator);
  }

  /**
   * Inserts the Campaign into the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @param campaign the Campaign to insert
   * @return the updated ExtendedCampaign
   * @throws RemoteException for communication-related exceptions
   */
  public ExtendedCampaign insertCampaign(Campaign campaign) throws RemoteException {
    return new ExtendedCampaign(delegateLocator.getCampaignDelegate().insert(campaign),
        delegateLocator);
  }

  /**
   * Updates the Campaigns for the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @param campaigns the Campaigns to update
   * @return the updated List<ExtendedCampaign>
   * @throws RemoteException for communication-related exceptions
   */
  public List<ExtendedCampaign> updateCampaigns(List<Campaign> campaigns) throws RemoteException {
    return ExtendedCampaign.as(delegateLocator.getCampaignDelegate().update(campaigns),
        delegateLocator);
  }

  /**
   * Updates the Campaign into the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @param campaign the Campaign to update
   * @return the updated ExtendedCampaign
   * @throws RemoteException for communication-related exceptions
   */
  public ExtendedCampaign updateCampaign(Campaign campaign) throws RemoteException {
    return new ExtendedCampaign(delegateLocator.getCampaignDelegate().update(campaign),
        delegateLocator);
  }

  /**
   * Gets the AdGroups as Extended for the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @return all the ExtendedAdGroups for the ExtendedManagedCustomer's
   *         ManagedCustomer
   * @throws RemoteException for communication-related exceptions
   */
  public List<ExtendedAdGroup> getExtendedAdGroups() throws RemoteException {
    return ExtendedAdGroup.as(delegateLocator.getAdGroupDelegate().get(), delegateLocator);
  }

  /**
   * Gets the AdGroups for the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @return all the AdGroup for the ExtendedManagedCustomer's
   *         ManagedCustomer
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroup> getAdGroups() throws RemoteException {
    return delegateLocator.getAdGroupDelegate().get();
  }

  /**
   * Gets the CampaignCriterions for the ExtendedManagedCustomer's
   * ManagedCustomer.
   *
   * @return all the CampaignCriterions for the ExtendedManagedCustomer's
   *         ManagedCustomer
   * @throws RemoteException for communication-related exceptions
   */
  public List<CampaignCriterion> getCampaignCriterions() throws RemoteException {
    return delegateLocator.getCampaignCriterionDelegate().get();
  }

  /**
   * Gets the AdGroupCriterions for the ExtendedManagedCustomer's
   * ManagedCustomer.
   *
   * @return all the AdGroupCriterions for the ExtendedManagedCustomer's
   *         ManagedCustomer
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroupCriterion> getAdGroupCriterions() throws RemoteException {
    return delegateLocator.getAdGroupCriterionDelegate().get();
  }

  /**
   * Gets the AdGroupAds for the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @return all the AdGroupAds for the ExtendedManagedCustomer's
   *         ManagedCustomer
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroupAd> getAdGroupAds() throws RemoteException {
    return delegateLocator.getAdGroupAdDelegate().get();
  }

  /**
   * Gets the CampaignAdExtensions for the ExtendedManagedCustomer's
   * ManagedCustomer.
   *
   * @return all the CampaignAdExtensions for the ExtendedManagedCustomer's
   *         ManagedCustomer
   * @throws RemoteException for communication-related exceptions
   */
  public List<CampaignAdExtension> getCampaignAdExtensions() throws RemoteException {
    return delegateLocator.getCampaignAdExtensionDelegate().get();
  }

  /**
   * Gets the AdExtensionOverrides for the ExtendedManagedCustomer's
   * ManagedCustomer.
   *
   * @return all the AdExtensionOverrides for the ExtendedManagedCustomer's
   *         ManagedCustomer
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdExtensionOverride> getAdExtensionOverrides() throws RemoteException {
    return delegateLocator.getAdExtensionOverrideDelegate().get();
  }

  /**
   * Gets the AdParams for the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @return all the AdParams for the ExtendedManagedCustomer's ManagedCustomer
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdParam> getAdParams() throws RemoteException {
    return delegateLocator.getAdParamDelegate().get();
  }

  /**
   * Gets the BudgetOrders for the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @return all the BudgetOrders for the ExtendedManagedCustomer's
   *         ManagedCustomer
   * @throws RemoteException for communication-related exceptions
   */
  public List<BudgetOrder> getBudgetOrders() throws RemoteException {
    return delegateLocator.getBudgetOrderDelegate().get();
  }

  /**
   * Inserts the BudgetOrder into the ExtendedManagedCustomer's ManagedCustomer.
   *
   * <p class="note"><b>Note:</b> insertBudgetOrder is limited to one operation per request.
   * See {@link com.google.api.ads.adwords.axis.v201306.billing.BudgetOrderServiceInterface}.</p>
   *
   * @param budgetOrder the BudgetOrder to insert
   * @return the updated BudgetOrder
   * @throws RemoteException for communication-related exceptions
   */
  public BudgetOrder insertBudgetOrder(BudgetOrder budgetOrder) throws RemoteException {
    return delegateLocator.getBudgetOrderDelegate().insert(budgetOrder);
  }

  /**
   * Updates the BudgetOrder for the ExtendedManagedCustomer's ManagedCustomer.
   *
   * <p class="note"><b>Note:</b> updateBudgetOrder is limited to one operation per request.
   * See {@link com.google.api.ads.adwords.axis.v201306.billing.BudgetOrderServiceInterface}.</p>
   *
   * @param budgetOrder the BudgetOrder to update
   * @return the updated BudgetOrder
   * @throws RemoteException for communication-related exceptions
   */
  public BudgetOrder updateBudgetOrder(BudgetOrder budgetOrder) throws RemoteException {
    return delegateLocator.getBudgetOrderDelegate().update(budgetOrder);
  }

  /**
   * Removes the BudgetOrder from the ExtendedManagedCustomer's ManagedCustomer.
   *
   * <p class="note"><b>Note:</b> removeBudgetOrder is limited to one operation per request.
   * See {@link com.google.api.ads.adwords.axis.v201306.billing.BudgetOrderServiceInterface}.</p>
   *
   * @param budgetOrder the BudgetOrder to remove
   * @return the updated BudgetOrder
   * @throws RemoteException for communication-related exceptions
   */
  public BudgetOrder removeBudgetOrder(BudgetOrder budgetOrder) throws RemoteException {
    return delegateLocator.getBudgetOrderDelegate().remove(budgetOrder);
  }

  /**
   * Gets the BillingAccounts for the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @return all the BillingAccounts for the ExtendedManagedCustomer's
   *         ManagedCustomer
   * @throws RemoteException for communication-related exceptions
   */
  public List<BillingAccount> getBillingAccounts() throws RemoteException {
    return delegateLocator.getBudgetOrderDelegate().getBillingAccounts();
  }

  /**
   * Gets the Budgets for the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @return all the Budgets for the ExtendedManagedCustomer's ManagedCustomer
   * @throws RemoteException for communication-related exceptions
   */
  public List<Budget> getBudgets() throws RemoteException {
    return delegateLocator.getBudgetDelegate().get();
  }

  /**
   * Inserts the Budgets into the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @param budget the Budget to insert
   * @return the updated Budget
   * @throws RemoteException for communication-related exceptions
   */
  public Budget insertBudget(Budget budget) throws RemoteException {
    return delegateLocator.getBudgetDelegate().insert(budget);
  }

  /**
   * Inserts the Budget into the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @param budgets the Budgets to insert
   * @return the updated Budget
   * @throws RemoteException for communication-related exceptions
   */
  public List<Budget> insertBudgets(List<Budget> budgets) throws RemoteException {
    return delegateLocator.getBudgetDelegate().insert(budgets);
  }

  /**
   * Updates the Budget for the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @param budget the Budget to insert
   * @return the updated Budget
   * @throws RemoteException for communication-related exceptions
   */
  public Budget updateBudget(Budget budget) throws RemoteException {
    return delegateLocator.getBudgetDelegate().update(budget);
  }

  /**
   * Updates the Budgets for the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @param budgets the Budgets to insert
   * @return the updated list of Budgets
   * @throws RemoteException for communication-related exceptions
   */
  public List<Budget> updateBudgets(List<Budget> budgets) throws RemoteException {
    return delegateLocator.getBudgetDelegate().update(budgets);
  }

  /**
   * Removes the Budgets from the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @param budget the Budget to remove
   * @return the updated Budget
   * @throws RemoteException for communication-related exceptions
   */
  public Budget removeBudget(Budget budget) throws RemoteException {
    return delegateLocator.getBudgetDelegate().remove(budget);
  }

  /**
   * Removes the Budgets from the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @param budgets the Budgets to remove
   * @return the updated list of Budgets
   * @throws RemoteException for communication-related exceptions
   */
  public List<Budget> removeBudgets(List<Budget> budgets) throws RemoteException {
    return delegateLocator.getBudgetDelegate().remove(budgets);
  }

  /**
   * Gets the Feeds for the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @return all the Feeds for the ExtendedManagedCustomer's ManagedCustomer
   * @throws RemoteException for communication-related exceptions
   */
  public List<Feed> getFeeds() throws RemoteException {
    return delegateLocator.getFeedDelegate().get();
  }

  /**
   * Gets the Feeds for the ExtendedManagedCustomer's ManagedCustomer by feedId.
   *
   * @param feedId
   * @return all the Feeds for the ExtendedManagedCustomer's ManagedCustomer
   * @throws RemoteException for communication-related exceptions
   */
  public List<Feed> getFeeds(Long feedId) throws RemoteException {
    return delegateLocator.getFeedDelegate().getByFeedId(feedId);
  }

  /**
   * Inserts the Feeds into the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @param feed the Feed to insert
   * @return the updated Feed
   * @throws RemoteException for communication-related exceptions
   */
  public Feed insertFeed(Feed feed) throws RemoteException {
    return delegateLocator.getFeedDelegate().insert(feed);
  }

  /**
   * Inserts the Feed into the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @param feeds the Feeds to insert
   * @return the updated Feed
   * @throws RemoteException for communication-related exceptions
   */
  public List<Feed> insertFeeds(List<Feed> feeds) throws RemoteException {
    return delegateLocator.getFeedDelegate().insert(feeds);
  }

  /**
   * Updates the Feed for the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @param feed the Feed to insert
   * @return the updated Feed
   * @throws RemoteException for communication-related exceptions
   */
  public Feed updateFeed(Feed feed) throws RemoteException {
    return delegateLocator.getFeedDelegate().update(feed);
  }

  /**
   * Updates the Feeds for the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @param feeds the Feeds to insert
   * @return the updated list of Feeds
   * @throws RemoteException for communication-related exceptions
   */
  public List<Feed> updateFeeds(List<Feed> feeds) throws RemoteException {
    return delegateLocator.getFeedDelegate().update(feeds);
  }

  /**
   * Removes the Feeds from the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @param feed the Feed to remove
   * @return the updated Feed
   * @throws RemoteException for communication-related exceptions
   */
  public Feed removeFeed(Feed feed) throws RemoteException {
    return delegateLocator.getFeedDelegate().remove(feed);
  }

  /**
   * Removes the Feeds from the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @param feeds the Feeds to remove
   * @return the updated list of Feeds
   * @throws RemoteException for communication-related exceptions
   */
  public List<Feed> removeFeeds(List<Feed> feeds) throws RemoteException {
    return delegateLocator.getFeedDelegate().remove(feeds);
  }

  /**
   * Gets the FeedItems for the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @return all the FeedItems for the ExtendedManagedCustomer's ManagedCustomer
   * @throws RemoteException for communication-related exceptions
   */
  public List<FeedItem> getFeedItems() throws RemoteException {
    return delegateLocator.getFeedItemDelegate().get();
  }

  /**
   * Gets the FeedItems for the ExtendedManagedCustomer's ManagedCustomer by feedId.
   *
   * @param feedId
   * @return all the FeedItems for the ExtendedManagedCustomer's ManagedCustomer
   * @throws RemoteException for communication-related exceptions
   */
  public List<FeedItem> getFeedItems(Long feedId) throws RemoteException {
    return delegateLocator.getFeedItemDelegate().getByFeedId(feedId);
  }

  /**
   * Inserts the FeedItems into the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @param feedItem the FeedItem to insert
   * @return the updated FeedItem
   * @throws RemoteException for communication-related exceptions
   */
  public FeedItem insertFeedItem(FeedItem feedItem) throws RemoteException {
    return delegateLocator.getFeedItemDelegate().insert(feedItem);
  }

  /**
   * Inserts the FeedItem into the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @param feedItems the FeedItems to insert
   * @return the updated FeedItem
   * @throws RemoteException for communication-related exceptions
   */
  public List<FeedItem> insertFeedItems(List<FeedItem> feedItems) throws RemoteException {
    return delegateLocator.getFeedItemDelegate().insert(feedItems);
  }

  /**
   * Updates the FeedItem for the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @param feedItem the FeedItem to insert
   * @return the updated FeedItem
   * @throws RemoteException for communication-related exceptions
   */
  public FeedItem updateFeedItem(FeedItem feedItem) throws RemoteException {
    return delegateLocator.getFeedItemDelegate().update(feedItem);
  }

  /**
   * Updates the FeedItems for the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @param feedItems the FeedItems to insert
   * @return the updated list of FeedItems
   * @throws RemoteException for communication-related exceptions
   */
  public List<FeedItem> updateFeedItems(List<FeedItem> feedItems) throws RemoteException {
    return delegateLocator.getFeedItemDelegate().update(feedItems);
  }

  /**
   * Removes the FeedItems from the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @param feedItem the FeedItem to remove
   * @return the updated FeedItem
   * @throws RemoteException for communication-related exceptions
   */
  public FeedItem removeFeedItem(FeedItem feedItem) throws RemoteException {
    return delegateLocator.getFeedItemDelegate().remove(feedItem);
  }

  /**
   * Removes the FeedItems from the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @param feedItems the FeedItems to remove
   * @return the updated list of FeedItems
   * @throws RemoteException for communication-related exceptions
   */
  public List<FeedItem> removeFeedItems(List<FeedItem> feedItems) throws RemoteException {
    return delegateLocator.getFeedItemDelegate().remove(feedItems);
  }

  /**
   * Gets the FeedMappings for the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @return all the FeedMappings for the ExtendedManagedCustomer's ManagedCustomer
   * @throws RemoteException for communication-related exceptions
   */
  public List<FeedMapping> getFeedMappings() throws RemoteException {
    return delegateLocator.getFeedMappingDelegate().get();
  }

  /**
   * Gets the FeedMappings for the ExtendedManagedCustomer's ManagedCustomer by feedId.
   *
   * @param feedId
   * @return all the FeedMappings for the ExtendedManagedCustomer's ManagedCustomer
   * @throws RemoteException for communication-related exceptions
   */
  public List<FeedMapping> getFeedMappings(Long feedId) throws RemoteException {
    return delegateLocator.getFeedMappingDelegate().getByFeedId(feedId);
  }

  /**
   * Inserts the FeedMappings into the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @param feedMapping the FeedMapping to insert
   * @return the updated FeedMapping
   * @throws RemoteException for communication-related exceptions
   */
  public FeedMapping insertFeedMapping(FeedMapping feedMapping) throws RemoteException {
    return delegateLocator.getFeedMappingDelegate().insert(feedMapping);
  }

  /**
   * Inserts the FeedMapping into the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @param feedMappings the FeedMappings to insert
   * @return the updated FeedMapping
   * @throws RemoteException for communication-related exceptions
   */
  public List<FeedMapping> insertFeedMappings(List<FeedMapping> feedMappings)
      throws RemoteException {
    return delegateLocator.getFeedMappingDelegate().insert(feedMappings);
  }

  /**
   * Updates the FeedMapping for the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @param feedMapping the FeedMapping to insert
   * @return the updated FeedMapping
   * @throws RemoteException for communication-related exceptions
   */
  public FeedMapping updateFeedMapping(FeedMapping feedMapping) throws RemoteException {
    return delegateLocator.getFeedMappingDelegate().update(feedMapping);
  }

  /**
   * Updates the FeedMappings for the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @param feedMappings the FeedMappings to insert
   * @return the updated list of FeedMappings
   * @throws RemoteException for communication-related exceptions
   */
  public List<FeedMapping> updateFeedMappings(List<FeedMapping> feedMappings)
      throws RemoteException {
    return delegateLocator.getFeedMappingDelegate().update(feedMappings);
  }

  /**
   * Removes the FeedMappings from the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @param feedMapping the FeedMapping to remove
   * @return the updated FeedMapping
   * @throws RemoteException for communication-related exceptions
   */
  public FeedMapping removeFeedMapping(FeedMapping feedMapping) throws RemoteException {
    return delegateLocator.getFeedMappingDelegate().remove(feedMapping);
  }

  /**
   * Removes the FeedMappings from the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @param feedMappings the FeedMappings to remove
   * @return the updated list of FeedMappings
   * @throws RemoteException for communication-related exceptions
   */
  public List<FeedMapping> removeFeedMappings(List<FeedMapping> feedMappings) 
      throws RemoteException {
    return delegateLocator.getFeedMappingDelegate().remove(feedMappings);
  }

  /**
   * Gets the CampaignFeeds for the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @return all the CampaignFeeds for the ExtendedManagedCustomer's ManagedCustomer
   * @throws RemoteException for communication-related exceptions
   */
  public List<CampaignFeed> getCampaignFeeds() throws RemoteException {
    return delegateLocator.getCampaignFeedDelegate().get();
  }

  /**
   * Gets the CampaignFeeds for the ExtendedManagedCustomer's ManagedCustomer by feedId.
   *
   * @param feedId
   * @return all the CampaignFeeds for the ExtendedManagedCustomer's ManagedCustomer
   * @throws RemoteException for communication-related exceptions
   */
  public List<CampaignFeed> getCampaignFeeds(Long feedId) throws RemoteException {
    return delegateLocator.getCampaignFeedDelegate().getByFeedId(feedId);
  }

  /**
   * Inserts the CampaignFeeds into the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @param campaignFeed the CampaignFeed to insert
   * @return the updated CampaignFeed
   * @throws RemoteException for communication-related exceptions
   */
  public CampaignFeed insertCampaignFeed(CampaignFeed campaignFeed) throws RemoteException {
    return delegateLocator.getCampaignFeedDelegate().insert(campaignFeed);
  }

  /**
   * Inserts the CampaignFeed into the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @param campaignFeeds the CampaignFeeds to insert
   * @return the updated CampaignFeed
   * @throws RemoteException for communication-related exceptions
   */
  public List<CampaignFeed> insertCampaignFeeds(List<CampaignFeed> campaignFeeds) 
      throws RemoteException {
    return delegateLocator.getCampaignFeedDelegate().insert(campaignFeeds);
  }

  /**
   * Updates the CampaignFeed for the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @param campaignFeed the CampaignFeed to insert
   * @return the updated CampaignFeed
   * @throws RemoteException for communication-related exceptions
   */
  public CampaignFeed updateCampaignFeed(CampaignFeed campaignFeed) throws RemoteException {
    return delegateLocator.getCampaignFeedDelegate().update(campaignFeed);
  }

  /**
   * Updates the CampaignFeeds for the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @param campaignFeeds the CampaignFeeds to insert
   * @return the updated list of CampaignFeeds
   * @throws RemoteException for communication-related exceptions
   */
  public List<CampaignFeed> updateCampaignFeeds(List<CampaignFeed> campaignFeeds)
      throws RemoteException {
    return delegateLocator.getCampaignFeedDelegate().update(campaignFeeds);
  }

  /**
   * Removes the CampaignFeeds from the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @param campaignFeed the CampaignFeed to remove
   * @return the updated CampaignFeed
   * @throws RemoteException for communication-related exceptions
   */
  public CampaignFeed removeCampaignFeed(CampaignFeed campaignFeed) throws RemoteException {
    return delegateLocator.getCampaignFeedDelegate().remove(campaignFeed);
  }

  /**
   * Removes the CampaignFeeds from the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @param campaignFeeds the CampaignFeeds to remove
   * @return the updated list of CampaignFeeds
   * @throws RemoteException for communication-related exceptions
   */
  public List<CampaignFeed> removeCampaignFeeds(List<CampaignFeed> campaignFeeds)
      throws RemoteException {
    return delegateLocator.getCampaignFeedDelegate().remove(campaignFeeds);
  }

  /**
   * Gets the AdGroupFeeds for the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @return all the AdGroupFeeds for the ExtendedManagedCustomer's ManagedCustomer
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroupFeed> getAdGroupFeeds() throws RemoteException {
    return delegateLocator.getAdGroupFeedDelegate().get();
  }

  /**
   * Gets the AdGroupFeeds for the ExtendedManagedCustomer's ManagedCustomer by feedId.
   *
   * @param feedId
   * @return all the AdGroupFeeds for the ExtendedManagedCustomer's ManagedCustomer
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroupFeed> getAdGroupFeeds(Long feedId) throws RemoteException {
    return delegateLocator.getAdGroupFeedDelegate().getByFeedId(feedId);
  }

  /**
   * Inserts the AdGroupFeeds into the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @param adGroupFeed the AdGroupFeed to insert
   * @return the updated AdGroupFeed
   * @throws RemoteException for communication-related exceptions
   */
  public AdGroupFeed insertAdGroupFeed(AdGroupFeed adGroupFeed) throws RemoteException {
    return delegateLocator.getAdGroupFeedDelegate().insert(adGroupFeed);
  }

  /**
   * Inserts the AdGroupFeed into the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @param adGroupFeeds the AdGroupFeeds to insert
   * @return the updated AdGroupFeed
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroupFeed> insertAdGroupFeeds(List<AdGroupFeed> adGroupFeeds)
      throws RemoteException {
    return delegateLocator.getAdGroupFeedDelegate().insert(adGroupFeeds);
  }

  /**
   * Updates the AdGroupFeed for the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @param adGroupFeed the AdGroupFeed to insert
   * @return the updated AdGroupFeed
   * @throws RemoteException for communication-related exceptions
   */
  public AdGroupFeed updateAdGroupFeed(AdGroupFeed adGroupFeed) throws RemoteException {
    return delegateLocator.getAdGroupFeedDelegate().update(adGroupFeed);
  }

  /**
   * Updates the AdGroupFeeds for the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @param adGroupFeeds the AdGroupFeeds to insert
   * @return the updated list of AdGroupFeeds
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroupFeed> updateAdGroupFeeds(List<AdGroupFeed> adGroupFeeds)
      throws RemoteException {
    return delegateLocator.getAdGroupFeedDelegate().update(adGroupFeeds);
  }

  /**
   * Removes the AdGroupFeeds from the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @param adGroupFeed the AdGroupFeed to remove
   * @return the updated AdGroupFeed
   * @throws RemoteException for communication-related exceptions
   */
  public AdGroupFeed removeAdGroupFeed(AdGroupFeed adGroupFeed) throws RemoteException {
    return delegateLocator.getAdGroupFeedDelegate().remove(adGroupFeed);
  }

  /**
   * Removes the AdGroupFeeds from the ExtendedManagedCustomer's ManagedCustomer.
   *
   * @param adGroupFeeds the AdGroupFeeds to remove
   * @return the updated list of AdGroupFeeds
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroupFeed> removeAdGroupFeeds(List<AdGroupFeed> adGroupFeeds)
      throws RemoteException {
    return delegateLocator.getAdGroupFeedDelegate().remove(adGroupFeeds);
  }
}