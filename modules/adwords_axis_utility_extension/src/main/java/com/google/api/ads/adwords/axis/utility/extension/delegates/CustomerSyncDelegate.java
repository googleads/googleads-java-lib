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

import com.google.api.ads.adwords.axis.v201502.ch.CampaignChangeData;
import com.google.api.ads.adwords.axis.v201502.ch.CustomerSyncSelector;
import com.google.api.ads.adwords.axis.v201502.ch.CustomerSyncServiceInterface;
import com.google.api.ads.adwords.axis.v201502.cm.DateTimeRange;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Longs;

import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Specific AbstractBaseDelegate for {@link CustomerSyncServiceInterface}.
 *
 * <p>
 * Implementation is not thread-safe,
 * because AdWordsSession and Apache Axis service objects are not thread-safe.
 * </p>
 *
 * @author Julian Toledo
 */
public final class CustomerSyncDelegate extends AbstractBaseDelegate<CustomerSyncServiceInterface> {

  private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd hhmmss");

  /**
   * Default Constructor.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   */
  public CustomerSyncDelegate(AdWordsSession adWordsSession) {
    super(adWordsSession, CustomerSyncServiceInterface.class);
  }

  /**
   * Constructor with custom service.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param service the custom service class for the SOAP service
   */
  @VisibleForTesting
  CustomerSyncDelegate(AdWordsSession adWordsSession, CustomerSyncServiceInterface service) {
    super(adWordsSession, service);
  }

  /**
   * Retrieves CampaignChangeDatas by campaignIds and dates.
   *
   * @param campaignIds
   * @param dateStart the start {@code Date}
   * @param dateEnd the end {@code Date}
   * @return a list of CampaignChangeDatas matching the campaignIds and dates
   * @throws RemoteException for communication-related exceptions
   */
  public List<CampaignChangeData> getCampaignChangeData(List<Long> campaignIds, Date dateStart,
      Date dateEnd) throws RemoteException {
    DateTimeRange dateTimeRange = new DateTimeRange();
    dateTimeRange.setMin(simpleDateFormat.format(dateStart));
    dateTimeRange.setMax(simpleDateFormat.format(dateEnd));
    CustomerSyncSelector customerSyncSelector = new CustomerSyncSelector();
    customerSyncSelector.setDateTimeRange(dateTimeRange);
    customerSyncSelector.setCampaignIds(Longs.toArray(campaignIds));
    return Arrays.asList(getService().get(customerSyncSelector).getChangedCampaigns());
  }

  /**
   * Retrieves CampaignChangeDatas by campaignId and dates.
   *
   * @param campaignId
   * @param dateStart the start {@code Date}
   * @param dateEnd the end {@code Date}
   * @return a list of CampaignChangeDatas matching the campaignId and dates
   * @throws RemoteException for communication-related exceptions
   */
  public List<CampaignChangeData> getCampaignChangeData(Long campaignId, Date dateStart,
      Date dateEnd) throws RemoteException {
    return getCampaignChangeData(ImmutableList.of(campaignId), dateStart, dateEnd);
  }
}
