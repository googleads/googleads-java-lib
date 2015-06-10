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

import com.google.api.ads.adwords.axis.v201502.cm.Ad;
import com.google.api.ads.adwords.axis.v201502.cm.AdGroup;
import com.google.api.ads.adwords.axis.v201502.cm.AdGroupAd;
import com.google.api.ads.adwords.axis.v201502.cm.AdGroupAdLabel;
import com.google.api.ads.adwords.axis.v201502.cm.AdGroupBidLandscape;
import com.google.api.ads.adwords.axis.v201502.cm.AdGroupCriterion;
import com.google.api.ads.adwords.axis.v201502.cm.AdGroupCriterionLabel;
import com.google.api.ads.adwords.axis.v201502.cm.AdGroupFeed;
import com.google.api.ads.adwords.axis.v201502.cm.AdGroupLabel;
import com.google.api.ads.adwords.axis.v201502.cm.AdParam;
import com.google.api.ads.adwords.axis.v201502.cm.CriterionBidLandscape;
import com.google.api.ads.adwords.axis.v201502.cm.CriterionUse;
import com.google.common.base.Function;
import com.google.common.collect.Lists;

import java.rmi.RemoteException;
import java.util.List;

/**
 * ExtendedAdGroup, encapsulates the {@link AdGroup} level operations.
 * 
 * @author Julian Toledo
 */
public final class ExtendedAdGroup {

  private final DelegateLocator delegateLocator;

  private final AdGroup adGroup;

  /**
   * Default Constructor.
   *
   * @param delegateLocator the DelegateLocator for the Account (ManagedCustomer)
   * @param adGroup the AdGroup to encapsulate
   */
  public ExtendedAdGroup(AdGroup adGroup, DelegateLocator delegateLocator) {
    this.adGroup = adGroup;
    this.delegateLocator = delegateLocator;
  }

  /**
   * Transforms a regular list of AdGroups into a list of ExtendedAdGroups.
   *
   * @param adGroups a list of AdGroups to convert
   * @param delegateLocator the DelegateLocator for the Account (ManagedCustomer)
   * @return the converted list of ExtendedAdGroups
   */
  public static List<ExtendedAdGroup> as(List<AdGroup> adGroups,
      final DelegateLocator delegateLocator) {
    if (adGroups == null || adGroups.isEmpty()) {
      return Lists.newArrayList(); 
    }
    return Lists.transform(adGroups, new Function<AdGroup, ExtendedAdGroup>() {
      @Override
      public ExtendedAdGroup apply(AdGroup adGroup) {
        return new ExtendedAdGroup(adGroup, delegateLocator);
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
   * Retrieves the encapsulated AdGroup.
   *
   * @return the encapsulated AdGroup
   */
  public AdGroup getAdGroup() {
    return adGroup;
  }

  /**
   * Updates the ExtendedAdGroup's AdGroup.
   *
   * <p class="note"><b>Note:</b> remove is not supported,
   * instead, set its status to {@code REMOVED} and then {@code update()}.
   * See {@link com.google.api.ads.adwords.axis.v201502.cm.AdGroupServiceInterface}.</p>
   *
   * @return the updated ExtendedAdGroup
   * @throws RemoteException for communication-related exceptions
   */
  public ExtendedAdGroup update() throws RemoteException {
    return new ExtendedAdGroup(
        delegateLocator.getAdGroupDelegate().update(adGroup), delegateLocator);
  }

  /**
   * Gets the AdGroupCriterions for the ExtendedAdGroup's AdGroup.
   *
   * @return all the AdGroupCriterion for the AdGroup
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroupCriterion> getAdGroupCriterions() throws RemoteException {
    return delegateLocator.getAdGroupCriterionDelegate().getByAdGroupId(adGroup.getId());
  }

  /**
   * Gets the Negative AdGroupCriterions for the ExtendedAdGroup's AdGroup.
   *
   * @return all the Negative AdGroupCriterion for the AdGroup
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroupCriterion> getNegativeAdGroupCriterions() throws RemoteException {
    return delegateLocator.getAdGroupCriterionDelegate().getByAdGroupIdCriterionUse(
        adGroup.getId(), CriterionUse.NEGATIVE);
  }

  /**
   * Gets the Biddable (Positive) AdGroupCriterions for the ExtendedAdGroup's AdGroup.
   *
   * @return all the Biddable AdGroupCriterion for the AdGroup
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroupCriterion> getBiddableAdGroupCriterions() throws RemoteException {
    return delegateLocator.getAdGroupCriterionDelegate().getByAdGroupIdCriterionUse(
        adGroup.getId(), CriterionUse.BIDDABLE);
  }

  /**
   * Inserts the AdGroupCriterions into the ExtendedAdGroup's AdGroup.
   *
   * @param adGroupCriterions the list of AdGroupCriterions to insert
   * @return the updated list of AdGroupCriterions
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroupCriterion> insertAdGroupCriterions(List<AdGroupCriterion> adGroupCriterions)
      throws RemoteException {
    return delegateLocator.getAdGroupCriterionDelegate().insert(adGroupCriterions);
  }

  /**
   * Inserts the AdGroupCriterion into the ExtendedAdGroup's AdGroup.
   *
   * @param adGroupCriterion the AdGroupCriterion to insert
   * @return the updated AdGroupCriterion
   * @throws RemoteException for communication-related exceptions
   */
  public AdGroupCriterion insertAdGroupCriterion(AdGroupCriterion adGroupCriterion)
      throws RemoteException {
    return delegateLocator.getAdGroupCriterionDelegate().insert(adGroupCriterion);
  }

  /**
   * Updates the Biddable AdGroupCriterions for the ExtendedAdGroup's AdGroup.
   *
   * @param adGroupCriterions the list of AdGroupCriterions to update
   * @return the updated list of AdGroupCriterions
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroupCriterion> updateBiddableAdGroupCriterions(
      List<AdGroupCriterion> adGroupCriterions) throws RemoteException {
    return delegateLocator.getAdGroupCriterionDelegate().update(adGroupCriterions);
  }

  /**
   * Updates the Biddable AdGroupCriterion for the ExtendedAdGroup's AdGroup.
   *
   * @param adGroupCriterion the AdGroupCriterion to update
   * @return the updated list of AdGroupCriterions
   * @throws RemoteException for communication-related exceptions
   */
  public AdGroupCriterion updateBiddableAdGroupCriterion(AdGroupCriterion adGroupCriterion)
      throws RemoteException {
    return delegateLocator.getAdGroupCriterionDelegate().update(adGroupCriterion);
  }

  /**
   * Removes the AdGroupCriterions from the ExtendedAdGroup's AdGroup.
   *
   * @param adGroupCriterions the list of AdGroupCriterions to remove
   * @return the updated list of AdGroupCriterions
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroupCriterion> removeAdGroupCriterions(List<AdGroupCriterion> adGroupCriterions)
      throws RemoteException {
    return delegateLocator.getAdGroupCriterionDelegate().remove(adGroupCriterions);
  }

  /**
   * Removes the AdGroupCriterion from the ExtendedAdGroup's AdGroup.
   *
   * @param adGroupCriterion the AdGroupCriterion to remove
   * @return the updated AdGroupCriterion
   * @throws RemoteException for communication-related exceptions
   */
  public AdGroupCriterion removeAdGroupCriterion(AdGroupCriterion adGroupCriterion)
      throws RemoteException {
    return delegateLocator.getAdGroupCriterionDelegate().remove(adGroupCriterion);
  }

  /**
   * Gets the AdGroupAds for the ExtendedAdGroup's AdGroup.
   *
   * @return all the AdGroupAds for the AdGroup
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroupAd> getAdGroupAds() throws RemoteException {
    return delegateLocator.getAdGroupAdDelegate().getByAdGroupId(adGroup.getId());
  }

  /**
   * Inserts the AdGroupAds into the ExtendedAdGroup's AdGroup.
   *
   * @param adGroupAds the list of AdGroupAds to insert
   * @return the updated list of AdGroupAds
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroupAd> insertAdGroupAds(List<AdGroupAd> adGroupAds) throws RemoteException {
    return delegateLocator.getAdGroupAdDelegate().insert(adGroupAds);
  }

  /**
   * Inserts the AdGroupAd into the ExtendedAdGroup's AdGroup.
   *
   * @param adGroupAd the AdGroupAd to insert
   * @return the updated AdGroupAd
   * @throws RemoteException for communication-related exceptions
   */
  public AdGroupAd insertAdGroupAd(AdGroupAd adGroupAd) throws RemoteException {
    return delegateLocator.getAdGroupAdDelegate().insert(adGroupAd);
  }

  /**
   * Updates the AdGroupAds for the ExtendedAdGroup's AdGroup.
   *
   * @param adGroupAds the list of AdGroupAds to update
   * @return the updated list of AdGroupAds
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroupAd> updateAdGroupAds(List<AdGroupAd> adGroupAds) throws RemoteException {
    return delegateLocator.getAdGroupAdDelegate().update(adGroupAds);
  }

  /**
   * Updates the AdGroupAd for the ExtendedAdGroup's AdGroup.
   *
   * @param adGroupAd the AdGroupAd to update
   * @return the updated AdGroupAd
   * @throws RemoteException for communication-related exceptions
   */
  public AdGroupAd updateAdGroupAd(AdGroupAd adGroupAd) throws RemoteException {
    return delegateLocator.getAdGroupAdDelegate().update(adGroupAd);
  }

  /**
   * Removes the AdGroupAds from the ExtendedAdGroup's AdGroup.
   *
   * @param adGroupAds the list of AdGroupAds to remove
   * @return the updated list of AdGroupAds
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroupAd> removeAdGroupAds(List<AdGroupAd> adGroupAds) throws RemoteException {
    return delegateLocator.getAdGroupAdDelegate().remove(adGroupAds);
  }

  /**
   * Removes the AdGroupAd from the ExtendedAdGroup's AdGroup.
   *
   * @param adGroupAd the AdGroupAd to remove
   * @return the updated AdGroupAd
   * @throws RemoteException for communication-related exceptions
   */
  public AdGroupAd removeAdGroupAd(AdGroupAd adGroupAd) throws RemoteException {
    return delegateLocator.getAdGroupAdDelegate().remove(adGroupAd);
  }

  /**
   * Inserts the Ads into the ExtendedAdGroup's AdGroup.
   *
   * <p class="note"><b>Note:</b> this method creates the necessary AdGroupAd implicitly.</p>
   *
   * @param ads the list of Ads to insert
   * @return the updated list of AdGroupAds
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroupAd> insertAds(List<Ad> ads) throws RemoteException {
    return delegateLocator.getAdGroupAdDelegate().insert(
        Lists.transform(ads, new Function<Ad, AdGroupAd>() {
          @Override
          public AdGroupAd apply(Ad ad) {
            AdGroupAd adGroupAd = new AdGroupAd();
            adGroupAd.setAdGroupId(adGroup.getId());
            adGroupAd.setAd(ad);
            return adGroupAd;
          }
        }));
  }

  /**
   * Inserts the Ad into the ExtendedAdGroup's AdGroup.
   *
   * <p class="note"><b>Note:</b> this method creates the necessary AdGroupAd implicitly.</p>
   *
   * @param ad the Ad to insert
   * @return the updated AdGroupAd
   * @throws RemoteException for communication-related exceptions
   */
  public AdGroupAd insertAd(Ad ad) throws RemoteException {
    AdGroupAd adGroupAd = new AdGroupAd();
    adGroupAd.setAdGroupId(adGroup.getId());
    adGroupAd.setAd(ad);
    return delegateLocator.getAdGroupAdDelegate().insert(adGroupAd);
  }

  /**
   * Gets the AdParams for the ExtendedAdGroup's AdGroup.
   *
   * @return all the AdParams for the ExtendedAdGroup's AdGroup
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdParam> getAdParams() throws RemoteException {
    return delegateLocator.getAdParamDelegate().getByAdGroupId(adGroup.getId());
  }

  /**
   * Updates the AdParams for the ExtendedAdGroup's AdGroup.
   *
   * <p class="note"><b>Note:</b> insertAdParams is not supported, use update for new AdParams.
   * See {@link com.google.api.ads.adwords.axis.v201502.cm.AdParamServiceInterface}.</p>
   *
   * @param adParams the list of AdParams to update
   * @return the updated list of AdParams
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdParam> updateAdParams(List<AdParam> adParams) throws RemoteException {
    return delegateLocator.getAdParamDelegate().update(adParams);
  }

  /**
   * Updates the AdParam for the ExtendedAdGroup's AdGroup.
   *
   * <p class="note"><b>Note:</b> insertAdParams is not supported, use update for new AdParams.
   * See {@link com.google.api.ads.adwords.axis.v201502.cm.AdParamServiceInterface}.</p>
   *
   * @param adParam the AdParam to update
   * @return the updated AdParam
   * @throws RemoteException for communication-related exceptions
   */
  public AdParam updateAdParam(AdParam adParam) throws RemoteException {
    return delegateLocator.getAdParamDelegate().update(adParam);
  }

  /**
   * Removes the AdParams from the ExtendedAdGroup's AdGroup.
   *
   * @param adParams the list of AdParams to remove
   * @return the updated list of AdParams
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdParam> removeAdParams(List<AdParam> adParams) throws RemoteException {
    return delegateLocator.getAdParamDelegate().remove(adParams);
  }

  /**
   * Removes the AdParam from the ExtendedAdGroup's AdGroup.
   *
   * @param adParam the AdParam to remove
   * @return the updated AdParam
   * @throws RemoteException for communication-related exceptions
   */
  public AdParam removeAdParam(AdParam adParam) throws RemoteException {
    return delegateLocator.getAdParamDelegate().remove(adParam);
  }

  /**
   * Gets the AdGroupBidLandscapes for the ExtendedAdGroup's AdGroup.
   *
   * @return all the AdGroupBidLandscapes for the ExtendedAdGroup's AdGroup
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroupBidLandscape> getAdGroupBidLandscapes() throws RemoteException {
    return delegateLocator.getDataAdGroupBidLandscapeDelegate().getByAdGroupId(adGroup.getId());
  }

  /**
   * Gets the CriterionBidLandscapes for the ExtendedAdGroup's AdGroup.
   *
   * @return all the CriterionBidLandscapes for the ExtendedAdGroup's AdGroup
   * @throws RemoteException for communication-related exceptions
   */
  public List<CriterionBidLandscape> getCriterionBidLandscape() throws RemoteException {
    return delegateLocator.getDataCriterionBidLandscapeDelegate().getByAdGroupId(adGroup.getId());
  }

  /**
   * Gets the AdGroupFeeds for the ExtendedAdGroup's AdGroup.
   *
   * @return all the AdGroupFeeds for the ExtendedAdGroup's AdGroup
   * @throws RemoteException for communication-related exceptions
   */
  public List<AdGroupFeed> getAdGroupFeeds() throws RemoteException {
    return delegateLocator.getAdGroupFeedDelegate().getByAdGroupId(adGroup.getId());
  }

  /**
   * Inserts a AdGroupLabel into the ExtendedAdGroup's AdGroup.
   *
   * <p>(Creates a Label to AdGroup link).</p>
   *
   * @param labelId the Label to insert
   * @return the new AdGroupLabel
   * @throws RemoteException for communication-related exceptions
   */
  public AdGroupLabel insertAdGroupLabel(Long labelId) throws RemoteException {
    AdGroupLabel adGroupLabel = new AdGroupLabel(this.getAdGroup().getId(),  labelId);
    return delegateLocator.getAdGroupDelegate().insertAdGroupLabel(adGroupLabel);
  }

  /**
   * Removes a AdGroupLabel into the ExtendedAdGroup's AdGroup.
   *
   * <p>(Deletes a Label to AdGroup link).</p>
   *
   * @param labelId the Label to insert
   * @return the new AdGroupLabel
   * @throws RemoteException for communication-related exceptions
   */
  public AdGroupLabel removeAdGroupLabel(Long labelId) throws RemoteException {
    AdGroupLabel adGroupLabel = new AdGroupLabel(this.getAdGroup().getId(),  labelId);
    return delegateLocator.getAdGroupDelegate().removeAdGroupLabel(adGroupLabel);
  }

  /**
   * Inserts a AdGroupAdLabel into the ExtendedAdGroupAd's AdGroupAd.
   *
   * <p>(Creates a Label to AdGroupAd link).</p>
   *
   * @param labelId the Label to insert
   * @param adId the AdId to insert
   * @return the new AdGroupAdLabel
   * @throws RemoteException for communication-related exceptions
   */
  public AdGroupAdLabel insertAdGroupAdLabel(Long labelId, long adId) throws RemoteException {
    AdGroupAdLabel adGroupAdLabel = new AdGroupAdLabel(this.getAdGroup().getId(),  adId, labelId);
    return delegateLocator.getAdGroupAdDelegate().insertAdGroupAdLabel(adGroupAdLabel);
  }

  /**
   * Removes a AdGroupAdLabel into the ExtendedAdGroupAd's AdGroupAd.
   *
   * <p>(Deletes a Label to AdGroupAd link).</p>
   *
   * @param labelId the Label to insert
   * @param adId the AdId to insert
   * @return the new AdGroupAdLabel
   * @throws RemoteException for communication-related exceptions
   */
  public AdGroupAdLabel removeAdGroupAdLabel(Long labelId, long adId) throws RemoteException {
    AdGroupAdLabel adGroupAdLabel = new AdGroupAdLabel(this.getAdGroup().getId(), adId, labelId);
    return delegateLocator.getAdGroupAdDelegate().removeAdGroupAdLabel(adGroupAdLabel);
  }

  /**
   * Inserts a AdGroupCriterionLabel into the ExtendedAdGroupCriterion's AdGroupCriterion.
   *
   * <p>(Creates a Label to AdGroupCriterion link).</p>
   *
   * @param labelId the Label to insert
   * @param criterionId the CriterionId to insert
   * @return the new AdGroupCriterionLabel
   * @throws RemoteException for communication-related exceptions
   */
  public AdGroupCriterionLabel insertAdGroupCriterionLabel(Long labelId, long criterionId)
      throws RemoteException {
    AdGroupCriterionLabel adGroupCriterionLabel = new AdGroupCriterionLabel(
        this.getAdGroup().getId(),  criterionId, labelId);

    return delegateLocator.getAdGroupCriterionDelegate().insertAdGroupCriterionLabel(
        adGroupCriterionLabel);
  }

  /**
   * Removes a AdGroupCriterionLabel into the ExtendedAdGroupCriterion's AdGroupCriterion.
   *
   * <p>(Deletes a Label to AdGroupCriterion link).</p>
   *
   * @param labelId the Label to insert
   * @param criterionId the CriterionId to insert
   * @return the new AdGroupCriterionLabel
   * @throws RemoteException for communication-related exceptions
   */
  public AdGroupCriterionLabel removeAdGroupCriterionLabel(Long labelId, long criterionId)
      throws RemoteException {
    AdGroupCriterionLabel adGroupCriterionLabel = new AdGroupCriterionLabel(
        this.getAdGroup().getId(), criterionId, labelId);

    return delegateLocator.getAdGroupCriterionDelegate().removeAdGroupCriterionLabel(
        adGroupCriterionLabel);
  }
}
