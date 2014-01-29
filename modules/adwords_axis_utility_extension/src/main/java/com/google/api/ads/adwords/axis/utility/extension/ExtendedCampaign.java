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

import com.google.api.ads.adwords.axis.v201309.ch.CampaignChangeData;
import com.google.api.ads.adwords.axis.v201309.cm.AdExtension;
import com.google.api.ads.adwords.axis.v201309.cm.AdGroup;
import com.google.api.ads.adwords.axis.v201309.cm.AdGroupBidLandscape;
import com.google.api.ads.adwords.axis.v201309.cm.Campaign;
import com.google.api.ads.adwords.axis.v201309.cm.CampaignAdExtension;
import com.google.api.ads.adwords.axis.v201309.cm.CampaignCriterion;
import com.google.api.ads.adwords.axis.v201309.cm.CampaignFeed;
import com.google.api.ads.adwords.axis.v201309.cm.Criterion;
import com.google.api.ads.adwords.axis.v201309.cm.CriterionBidLandscape;
import com.google.api.ads.adwords.axis.v201309.cm.Experiment;
import com.google.api.ads.adwords.axis.v201309.cm.NegativeCampaignCriterion;
import com.google.common.base.Function;
import com.google.common.collect.Lists;

import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;

/**
 * ExtendedCampaign, encapsulates the {@link Campaign} level operations.
 *
 * @author Julian Toledo
 */
public final class ExtendedCampaign {

  private final DelegateLocator delegateLocator;

  private final Campaign campaign;

  /**
   * Default Constructor.
   *
   * @param campaign the Campaign to encapsulate
   * @param delegateLocator the DelegateLocator for the Account (ManagedCustomer)
   */
  public ExtendedCampaign(Campaign campaign, DelegateLocator delegateLocator) {
    this.campaign = campaign;
    this.delegateLocator = delegateLocator;
  }

  /**
   * Transforms a regular list of Campaigns into a list of ExtendedCampaigns.
   *
   * @param campaigns a list of Campaigns to convert
   * @param delegateLocator the DelegateLocator for the Account (ManagedCustomer)
   * @return the converted list of ExtendedCampaigns
   */
  public static List<ExtendedCampaign> as(List<Campaign> campaigns,
      final DelegateLocator delegateLocator) {
    if (campaigns == null || campaigns.isEmpty()) {
     return Lists.newArrayList(); 
    }
    return Lists.transform(campaigns, new Function<Campaign, ExtendedCampaign>() {
      public ExtendedCampaign apply(Campaign campaign) {
        return new ExtendedCampaign(campaign, delegateLocator);
      }
    });
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
   * Retrieves the encapsulated Campaign
   *
   * @return the encapsulated Campaign
   */
  public Campaign getCampaign() {
    return campaign;
  }

  /**
   * Updates the ExtendedCampaign's Campaign.
   *
   * <p class="note"><b>Note:</b> remove is not supported,
   * instead, set its status to {@code DELETED} and then {@code update()}.
   * See {@link com.google.api.ads.adwords.axis.v201309.cm.CampaignServiceInterface}.</p>
   *
   * @return the updated ExtendedCampaign
   * @throws RemoteException for communication-related exceptions
   */
  public ExtendedCampaign update() throws RemoteException {
    return new ExtendedCampaign(delegateLocator.getCampaignDelegate().update(campaign),
        delegateLocator);
  }

  /**
   * Gets the ExtendedAdGroups for the ExtendedCampaign's Campaign.
   *
   * @return all the ExtendedAdGroups for the ExtendedCampaign's Campaign
   * @throws RemoteException for communication-related exceptions
   */
  public List<ExtendedAdGroup> getExtendedAdGroups() throws RemoteException {
    return ExtendedAdGroup.as(
        delegateLocator.getAdGroupDelegate().getByCampaignId(campaign.getId()), delegateLocator);
  }

  /**
   * Gets the AdGroups for the ExtendedCampaign's Campaign.
   *
   * @return all the AdGroups for the ExtendedCampaign's Campaign
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroup> getAdGroups() throws RemoteException {
    return delegateLocator.getAdGroupDelegate().getByCampaignId(campaign.getId());
  }

  /**
   * Inserts the AdGroups into the ExtendedCampaign's Campaign.
   *
   * @param adGroups the list of AdGroups to insert
   * @return the updated List of ExtendedAdGroups
   * @throws RemoteException for communication-related exceptions
   */
  public List<ExtendedAdGroup> insertAdGroups(List<AdGroup> adGroups) throws RemoteException {
    for (AdGroup adGroup : adGroups) {
      if (adGroup.getCampaignId() == null) {
        adGroup.setCampaignId(campaign.getId());
      }
    }
    return ExtendedAdGroup.as(delegateLocator.getAdGroupDelegate().insert(adGroups),
        delegateLocator);
  }

  /**
   * Inserts the AdGroup into the ExtendedCampaign's Campaign.
   *
   * @param adGroup the AdGroup to insert
   * @return the updated ExtendedAdGroup
   * @throws RemoteException for communication-related exceptions
   */
  public ExtendedAdGroup insertAdGroup(AdGroup adGroup) throws RemoteException {
    if (adGroup.getCampaignId() == null) {
      adGroup.setCampaignId(campaign.getId());
    }
    return new ExtendedAdGroup(
        delegateLocator.getAdGroupDelegate().insert(adGroup), delegateLocator);
  }

  /**
   * Uptades the AdGroups for the ExtendedCampaign's Campaign.
   *
   * @param adGroups the list of AdGroups to update
   * @return the updated list of ExtendedAdGroups
   * @throws RemoteException for communication-related exceptions
   */
  public List<ExtendedAdGroup> updateAdGroups(List<AdGroup> adGroups) throws RemoteException {
    for (AdGroup adGroup : adGroups) {
      if (adGroup.getCampaignId() == null) {
        adGroup.setCampaignId(campaign.getId());
      }
    }
    return ExtendedAdGroup.as(delegateLocator.getAdGroupDelegate().update(adGroups),
        delegateLocator);
  }

  /**
   * Gets the CampaignCriterions for the ExtendedCampaign's Campaign.
   *
   * @return all the CampaignCriterions for the ExtendedCampaign's Campaign
   * @throws RemoteException for communication-related exceptions
   */
  public List<CampaignCriterion> getCampaignCriterions() throws RemoteException {
    return delegateLocator.getCampaignCriterionDelegate().getByCampaignId(campaign.getId());
  }

  /**
   * Inserts the CampaignCriterions into the ExtendedCampaign's Campaign.
   *
   * @param campaignCriterions the list of CampaignCriterions to insert
   * @return the updated list of CampaignCriterions
   * @throws RemoteException for communication-related exceptions
   */
  public List<CampaignCriterion> insertCampaignCriterions(
      List<CampaignCriterion> campaignCriterions) throws RemoteException {
    return delegateLocator.getCampaignCriterionDelegate().insert(campaignCriterions);
  }

  /**
   * Inserts the CampaignCriterion into the ExtendedCampaign's Campaign.
   *
   * @param campaignCriterion the CampaignCriterion to insert
   * @return the updated CampaignCriterion
   * @throws RemoteException for communication-related exceptions
   */
  public CampaignCriterion insertCampaignCriterion(CampaignCriterion campaignCriterion)
      throws RemoteException {
    return delegateLocator.getCampaignCriterionDelegate().insert(campaignCriterion);
  }

  /**
   * Inserts the Criterion into the ExtendedCampaign's Campaign.
   * 
   * <p class="note"><b>Note:</b> this method creates the
   * necessary CampaignCriterion implicitly.</p>
   *
   * @param criterion the Criterion to insert
   * @return the updated CampaignCriterion
   * @throws RemoteException for communication-related exceptions
   */
  public CampaignCriterion insertCampaignCriterion(Criterion criterion) throws RemoteException {
    CampaignCriterion campaignCriterion = new CampaignCriterion();
    campaignCriterion.setCampaignId(getCampaign().getId());
    campaignCriterion.setCriterion(criterion);
    return delegateLocator.getCampaignCriterionDelegate().insert(campaignCriterion);
  }
  
  /**
   * Inserts the Criterion as negative into the ExtendedCampaign's Campaign.
   * 
   * <p class="note"><b>Note:</b> this method creates the
   * necessary NegativeCampaignCriterion implicitly.</p>
   *
   * @param criterion the Criterion to insert
   * @return the updated CampaignCriterion
   * @throws RemoteException for communication-related exceptions
   */
  public CampaignCriterion insertNegativeCampaignCriterion(Criterion criterion)
      throws RemoteException {
    NegativeCampaignCriterion negativeCampaignCriterion = new NegativeCampaignCriterion();
    negativeCampaignCriterion.setCampaignId(getCampaign().getId());
    negativeCampaignCriterion.setCriterion(criterion);
    return delegateLocator.getCampaignCriterionDelegate().insert(negativeCampaignCriterion);
  }

  /**
   * Updates the CampaignCriterions for the ExtendedCampaign's Campaign.
   *
   * @param campaignCriterions the list of CampaignCriterions to update
   * @return the updated list of CampaignCriterions
   * @throws RemoteException for communication-related exceptions
   */
  public List<CampaignCriterion> updateCampaignCriterions(
      List<CampaignCriterion> campaignCriterions) throws RemoteException {
    return delegateLocator.getCampaignCriterionDelegate().update(campaignCriterions);
  }

  /**
   * Updates the CampaignCriterion for the ExtendedCampaign's Campaign.
   *
   * @param campaignCriterion the CampaignCriterion to update
   * @return the updated CampaignCriterion
   * @throws RemoteException for communication-related exceptions
   */
  public CampaignCriterion updateCampaignCriterion(CampaignCriterion campaignCriterion)
      throws RemoteException {
    return delegateLocator.getCampaignCriterionDelegate().update(campaignCriterion);
  }

  /**
   * Removes the CampaignCriterions from the ExtendedCampaign's Campaign.
   *
   * @param campaignCriterions the list of CampaignCriterions to remove
   * @return the updated list of CampaignCriterions
   * @throws RemoteException for communication-related exceptions
   */
  public List<CampaignCriterion> removeCampaignCriterions(
      List<CampaignCriterion> campaignCriterions) throws RemoteException {
    return delegateLocator.getCampaignCriterionDelegate().remove(campaignCriterions);
  }

  /**
   * Removes the CampaignCriterion from the ExtendedCampaign's Campaign.
   *
   * @param campaignCriterion the CampaignCriterion to remove
   * @return the updated CampaignCriterion
   * @throws RemoteException for communication-related exceptions
   */
  public CampaignCriterion removeCampaignCriterion(CampaignCriterion campaignCriterion)
      throws RemoteException {
    return delegateLocator.getCampaignCriterionDelegate().remove(campaignCriterion);
  }

  /**
   * Gets the CampaignAdExtensions for the ExtendedCampaign's Campaign.
   *
   * @return all the CampaignAdExtensions for the ExtendedCampaign's Campaign
   * @throws RemoteException for communication-related exceptions
   */
  public List<CampaignAdExtension> getCampaignAdExtensions() throws RemoteException {
    return delegateLocator.getCampaignAdExtensionDelegate().getByCampaignId(campaign.getId());
  }

  /**
   * Inserts the CampaignAdExtensions into the ExtendedCampaign's Campaign.
   *
   * @param campaignAdExtensions the list of CampaignAdExtension to insert
   * @return the updated list of CampaignAdExtensions
   * @throws RemoteException for communication-related exceptions
   */
  public List<CampaignAdExtension> insertCampaignAdExtensions(
      List<CampaignAdExtension> campaignAdExtensions) throws RemoteException {
    return delegateLocator.getCampaignAdExtensionDelegate().insert(campaignAdExtensions);
  }

  /**
   * Inserts the CampaignAdExtension into the ExtendedCampaign's Campaign.
   *
   * @param campaignAdExtension the CampaignAdExtension to insert
   * @return the updated CampaignAdExtension
   * @throws RemoteException for communication-related exceptions
   */
  public CampaignAdExtension insertCampaignAdExtension(CampaignAdExtension campaignAdExtension)
      throws RemoteException {
    return delegateLocator.getCampaignAdExtensionDelegate().insert(campaignAdExtension);
  }
  
  /**
   * Inserts the AdExtension into the ExtendedCampaign's Campaign.
   *
   * <p class="note"><b>Note:</b> this method creates the
   * necessary CampaignAdExtension implicitly.</p>
   *
   * @param adExtension the AdExtension to insert
   * @return the updated CampaignAdExtension
   * @throws RemoteException for communication-related exceptions
   */
  public CampaignAdExtension insertCampaignAdExtension(AdExtension adExtension)
      throws RemoteException {
    CampaignAdExtension campaignAdExtension = new CampaignAdExtension();
    campaignAdExtension.setCampaignId(getCampaign().getId());
    campaignAdExtension.setAdExtension(adExtension);
    return delegateLocator.getCampaignAdExtensionDelegate().insert(campaignAdExtension);
  }

  /**
   * Removes the CampaignAdExtensions from the ExtendedCampaign's Campaign.
   *
   * @param campaignAdExtensions the list of CampaignAdExtensions to remove
   * @return the updated list of CampaignAdExtensions
   * @throws RemoteException for communication-related exceptions
   */
  public List<CampaignAdExtension> removeCampaignAdExtensions(
      List<CampaignAdExtension> campaignAdExtensions) throws RemoteException {
    return delegateLocator.getCampaignAdExtensionDelegate().remove(campaignAdExtensions);
  }

  /**
   * Removes the CampaignAdExtension from the ExtendedCampaign's Campaign.
   *
   * @param campaignAdExtension the CampaignAdExtension to remove
   * @return the updated CampaignAdExtension
   * @throws RemoteException for communication-related exceptions
   */
  public CampaignAdExtension removeCampaignAdExtension(CampaignAdExtension campaignAdExtension)
      throws RemoteException {
    return delegateLocator.getCampaignAdExtensionDelegate().remove(campaignAdExtension);
  }

  /**
   * Gets the Experiments for the ExtendedCampaign's Campaign.
   *
   * @return all the Experiments for the ExtendedCampaign's Campaign
   * @throws RemoteException for communication-related exceptions
   */
  public List<Experiment> getExperiments() throws RemoteException {
    return delegateLocator.getExperimentDelegate().getByCampaignId(campaign.getId());
  }

  /**
   * Inserts the Experiments into the ExtendedCampaign's Campaign.
   *
   * @param experiments the list of Experiments to insert
   * @return the updated list of Experiments
   * @throws RemoteException for communication-related exceptions
   */
  public List<Experiment> insertExperiments(List<Experiment> experiments) throws RemoteException {
    return delegateLocator.getExperimentDelegate().insert(experiments);
  }

  /**
   * Inserts the Experiment into the ExtendedCampaign's Campaign.
   *
   * @param experiment the Experiment to insert
   * @return the updated Experiment
   * @throws RemoteException for communication-related exceptions
   */
  public Experiment insertExperiment(Experiment experiment) throws RemoteException {
    return delegateLocator.getExperimentDelegate().insert(experiment);
  }

  /**
   * Updates the Experiments into the ExtendedCampaign's Campaign.
   *
   * <p class="note"><b>Note:</b> removeExperiments is not supported,
   * instead, set its status to {@code DELETED} and then {@code update()}.
   * See {@link com.google.api.ads.adwords.axis.v201309.cm.ExperimentServiceInterface}.</p>
   *
   * @param experiments the list of Experiments to update
   * @return the updated list of Experiments
   * @throws RemoteException for communication-related exceptions
   */
  public List<Experiment> updateExperiments(List<Experiment> experiments) throws RemoteException {
    return delegateLocator.getExperimentDelegate().update(experiments);
  }

  /**
   * Updates the Experiment into the ExtendedCampaign's Campaign.
   *
   * <p class="note"><b>Note:</b> removeExperiments is not supported,
   * instead, set its status to {@code DELETED} and then {@code update()}.
   * See {@link com.google.api.ads.adwords.axis.v201309.cm.ExperimentServiceInterface}.</p>
   *
   * @param experiment the Experiment to update
   * @return the updated Experiment
   * @throws RemoteException for communication-related exceptions
   */
  public Experiment updateExperiment(Experiment experiment) throws RemoteException {
    return delegateLocator.getExperimentDelegate().update(experiment);
  }

  /**
   * Gets the AdGroupBidLandscapes for the ExtendedCampaign's Campaign.
   *
   * @return all the AdGroupBidLandscapes for the ExtendedCampaign's Campaign
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroupBidLandscape> getAdGroupBidLandscapes() throws RemoteException {
    return delegateLocator.getDataAdGroupBidLandscapeDelegate().getByCampaignId(campaign.getId());
  }

  /**
   * Gets the CriterionBidLandscapes for the ExtendedCampaign's Campaign.
   *
   * @return all the CriterionBidLandscapes for the ExtendedCampaign's Campaign
   * @throws RemoteException for communication-related exceptions
   */
  public List<CriterionBidLandscape> getCriterionBidLandscape() throws RemoteException {
    return delegateLocator.getDataCriterionBidLandscapeDelegate().getByCampaignId(campaign.getId());
  }

  /**
   * Gets the CampaignChangeDatas for the ExtendedCampaign's Campaign.
   *
   * @return all the CampaignChangeData for the ExtendedCampaign's Campaign
   * @throws RemoteException for communication-related exceptions
   */
  public List<CampaignChangeData> getCampaignChangeData(Date dateStart, Date dateEnd)
      throws RemoteException {
    return delegateLocator.getCustomerSyncDelegate().getCampaignChangeData(campaign.getId(),
        dateStart, dateEnd);
  }

  /**
   * Gets the CampaignFeeds for the ExtendedCampaign's Campaign.
   *
   * @return all the CampaignFeeds for the ExtendedManagedCustomer's ManagedCustomer
   * @throws RemoteException for communication-related exceptions
   */
  public List<CampaignFeed> getCampaignFeeds() throws RemoteException {
    return delegateLocator.getCampaignFeedDelegate().getByCampaignId(campaign.getId());
  }
}
