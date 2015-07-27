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

package com.google.api.ads.adwords.axis.utility.extension.delegates;

import com.google.api.ads.adwords.axis.utility.extension.util.ReflectionUtil;
import com.google.api.ads.adwords.axis.v201506.cm.AgeRange;
import com.google.api.ads.adwords.axis.v201506.cm.Carrier;
import com.google.api.ads.adwords.axis.v201506.cm.ConstantDataServiceInterface;
import com.google.api.ads.adwords.axis.v201506.cm.ConstantDataServiceUserInterestTaxonomyType;
import com.google.api.ads.adwords.axis.v201506.cm.CriterionUserInterest;
import com.google.api.ads.adwords.axis.v201506.cm.Gender;
import com.google.api.ads.adwords.axis.v201506.cm.Language;
import com.google.api.ads.adwords.axis.v201506.cm.MobileDevice;
import com.google.api.ads.adwords.axis.v201506.cm.OperatingSystemVersion;
import com.google.api.ads.adwords.axis.v201506.cm.ProductBiddingCategoryData;
import com.google.api.ads.adwords.axis.v201506.cm.Selector;
import com.google.api.ads.adwords.axis.v201506.cm.Vertical;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.common.annotations.VisibleForTesting;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

/**
 * Specific AbstractBaseDelegate for {@link ConstantDataServiceInterface}.
 *
 * @author Julian Toledo
 */
public final class ConstantDataDelegate
    extends AbstractBaseDelegate<ConstantDataServiceInterface> {

  /**
   * Default Constructor.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   */
  public ConstantDataDelegate(AdWordsSession adWordsSession) {
    super(adWordsSession, ConstantDataServiceInterface.class);
  }

  /**
   * Constructor with custom service.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param service the custom service class for the SOAP service
   */
  @VisibleForTesting
  ConstantDataDelegate(
      AdWordsSession adWordsSession, ConstantDataServiceInterface service) {
    super(adWordsSession, service);
  }

  /**
   * Retrieves all the AgeRanges.
   *
   * @return a list of all the AgeRanges
   * @throws RemoteException for communication-related exceptions
   */
  public List<AgeRange> getAgeRangeCriterion() throws RemoteException {
    // Using ReflectionUtil to execute getService().getAgeRangeCriterion() with retries
    AgeRange[] ageRanges = (AgeRange[]) ReflectionUtil.invokeCount(
        "getAgeRangeCriterion", getService(), classS, MAX_RETRY_COUNT);
    return Arrays.asList(ageRanges);
  }

  /**
   * Retrieves all the Carriers.
   *
   * @return a list of all the Carriers
   * @throws RemoteException for communication-related exceptions
   */
  public List<Carrier> getCarrierCriterion() throws RemoteException {
    // Using ReflectionUtil to execute getService().getCarrierCriterion() with retries
    Carrier[] carriers = (Carrier[]) ReflectionUtil.invokeCount(
        "getCarrierCriterion", getService(), classS, MAX_RETRY_COUNT);
    return Arrays.asList(carriers);
  }

  /**
   * Retrieves all the Genders.
   *
   * @return a list of all the Genders
   * @throws RemoteException for communication-related exceptions
   */
  public List<Gender> getGenderCriterion() throws RemoteException {
    // Using ReflectionUtil to execute getService().getGenderCriterion() with retries
    Gender[] genders = (Gender[]) ReflectionUtil.invokeCount(
        "getGenderCriterion", getService(), classS, MAX_RETRY_COUNT);
    return Arrays.asList(genders);
  }

  /**
   * Retrieves all the Languages.
   *
   * @return a list of all the Languages
   * @throws RemoteException for communication-related exceptions
   */
  public List<Language> getLanguageCriterion() throws RemoteException {
    // Using ReflectionUtil to execute getService().getLanguageCriterion() with retries
    Language[] languages = (Language[]) ReflectionUtil.invokeCount(
        "getLanguageCriterion", getService(), classS, MAX_RETRY_COUNT);
    return Arrays.asList(languages);
  }

  /**
   * Retrieves all the MobileDevices.
   *
   * @return a list of all the MobileDevices
   * @throws RemoteException for communication-related exceptions
   */
  public List<MobileDevice> getMobileDeviceCriterion() throws RemoteException {
    // Using ReflectionUtil to execute getService().getMobileDeviceCriterion() with retries
    MobileDevice[] mobileDevices = (MobileDevice[]) ReflectionUtil.invokeCount(
        "getMobileDeviceCriterion", getService(), classS, MAX_RETRY_COUNT);
    return Arrays.asList(mobileDevices);
  }

  /**
   * Retrieves all the OperatingSystemVersions.
   *
   * @return a list of all the OperatingSystemVersions
   * @throws RemoteException for communication-related exceptions
   */
  public List<OperatingSystemVersion> getOperatingSystemVersionCriterion() throws RemoteException {
    // Using ReflectionUtil to execute getService().getOperatingSystemVersionCriterion() with
    // retries
    OperatingSystemVersion[] operatingSystemVersions =
        (OperatingSystemVersion[]) ReflectionUtil.invokeCount(
            "getOperatingSystemVersionCriterion", getService(), classS, MAX_RETRY_COUNT);
    return Arrays.asList(operatingSystemVersions);
  }

  /**
   * Retrieves all the ProductBiddingCategoryDatas.
   *
   * @param selector should be a Generic Selector
   *        (com.google.api.adwords.v201506.cm.Selector) or a specific
   *        Selector appropriate to the ServiceInterface used that does not
   *        support Generic Selectors
   * @return a list of all the ProductBiddingCategoryDatas
   * @throws RemoteException for communication-related exceptions
   */
  public List<ProductBiddingCategoryData> getProductBiddingCategoryData(Selector selector)
          throws RemoteException {
    // Using ReflectionUtil to execute getService().getUserInterestCriterion() with retries
    ProductBiddingCategoryData[] productBiddingCategoryDatas =
        (ProductBiddingCategoryData[]) ReflectionUtil.invokeCount(
            "getProductBiddingCategoryData", getService(), classS,
            selector, MAX_RETRY_COUNT);
    return Arrays.asList(productBiddingCategoryDatas);
  }

  /**
   * Retrieves all the CriterionUserInterests.
   *
   * @return a list of all the CriterionUserInterests
   * @throws RemoteException for communication-related exceptions
   */
  public List<CriterionUserInterest> getUserInterestCriterion(
      ConstantDataServiceUserInterestTaxonomyType constantDataServiceUserInterestTaxonomyType)
          throws RemoteException {
    // Using ReflectionUtil to execute getService().getUserInterestCriterion() with retries
    CriterionUserInterest[] criterionUserInterests =
        (CriterionUserInterest[]) ReflectionUtil.invokeCount(
            "getUserInterestCriterion", getService(), classS,
            constantDataServiceUserInterestTaxonomyType, MAX_RETRY_COUNT);
    return Arrays.asList(criterionUserInterests);
  }

  /**
   * Retrieves all the Verticals.
   *
   * @return a list of all the Vertical
   * @throws RemoteException for communication-related exceptions
   */
  public List<Vertical> getVerticalCriterion() throws RemoteException {
    // Using ReflectionUtil to execute getService().getVerticalCriterion() with retries
    Vertical[] verticals = (Vertical[]) ReflectionUtil.invokeCount(
        "getVerticalCriterion", getService(), classS, MAX_RETRY_COUNT);
    return Arrays.asList(verticals);
  }
}
