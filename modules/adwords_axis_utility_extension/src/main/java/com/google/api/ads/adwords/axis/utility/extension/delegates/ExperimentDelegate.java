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

import com.google.api.ads.adwords.axis.utility.extension.util.SelectorFields;
import com.google.api.ads.adwords.axis.v201309.cm.Experiment;
import com.google.api.ads.adwords.axis.v201309.cm.ExperimentOperation;
import com.google.api.ads.adwords.axis.v201309.cm.ExperimentServiceInterface;
import com.google.api.ads.adwords.lib.client.AdWordsSession;

import java.rmi.RemoteException;
import java.util.List;

/**
 * Specific AbstractGetMutateDelegate for {@link Experiment}.
 *
 * @author Julian Toledo
 */
public final class ExperimentDelegate extends
    AbstractGetMutateDelegate<Experiment, ExperimentOperation, ExperimentServiceInterface> {

  /**
   * Default Constructor.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   */
  public ExperimentDelegate(AdWordsSession adWordsSession) {
    super(adWordsSession, SelectorFields.Experiment.all(), Experiment.class,
        ExperimentOperation.class, ExperimentServiceInterface.class);
  }

  /**
   * Constructor with custom service.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param service the custom service class for the SOAP service
   */
  public ExperimentDelegate(AdWordsSession adWordsSession, ExperimentServiceInterface service) {
    super(adWordsSession, SelectorFields.Experiment.all(), Experiment.class,
        ExperimentOperation.class, service);
  }

  /**
   * Constructor with custom fields.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param selectorFields for the Generic Selectors using the SelectorField class
   */
  public ExperimentDelegate(AdWordsSession adWordsSession,
      List<SelectorFields.Experiment> selectorFields) {
    super(adWordsSession, selectorFields, Experiment.class, ExperimentOperation.class,
        ExperimentServiceInterface.class);
  }

  /**
   * Retrieves Experiments by id.
   *
   * @param id
   * @return a list of Experiments matching the id
   * @throws RemoteException for communication-related exceptions
   */
  public Experiment getById(long id) throws RemoteException {
    return getOneByField(SelectorFields.Experiment.ID, id);
  }

  /**
   * Retrieves Experiments by campaignId.
   *
   * @param campaignId
   * @return a list of Experiments matching the campaignId
   * @throws RemoteException for communication-related exceptions
   */
  public List<Experiment> getByCampaignId(long campaignId) throws RemoteException {
    return getByField(SelectorFields.Experiment.CAMPAIGN_ID, campaignId);
  }

  /**
   * Retrieves Experiments by controlId.
   *
   * @param controlId
   * @return a list of Experiments matching the controlId
   * @throws RemoteException for communication-related exceptions
   */
  public Experiment getByControlId(long controlId) throws RemoteException {
    return getOneByField(SelectorFields.Experiment.CONTROL_ID, controlId);
  }
}