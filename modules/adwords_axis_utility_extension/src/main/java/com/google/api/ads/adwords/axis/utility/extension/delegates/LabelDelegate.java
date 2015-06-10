// Copyright 2014 Google Inc. All Rights Reserved.
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
import com.google.api.ads.adwords.axis.v201502.cm.Label;
import com.google.api.ads.adwords.axis.v201502.cm.LabelOperation;
import com.google.api.ads.adwords.axis.v201502.cm.LabelServiceInterface;
import com.google.api.ads.adwords.axis.v201502.cm.LabelStatus;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.common.annotations.VisibleForTesting;

import java.rmi.RemoteException;
import java.util.List;

/**
 * Specific AbstractGetMutateDelegate for {@link Label}.
 *
 * <p>
 * Implementation is not thread-safe,
 * because AdWordsSession and Apache Axis service objects are not thread-safe.
 * </p>
 *
 * @author Julian Toledo
 */
public final class LabelDelegate extends
    AbstractGetMutateDelegate<Label, LabelOperation, LabelServiceInterface> {

  /**
   * Default Constructor.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   */
  public LabelDelegate(AdWordsSession adWordsSession) {
    super(adWordsSession, SelectorFields.Label.all(), Label.class, LabelOperation.class,
        LabelServiceInterface.class);
  }

  /**
   * Constructor with custom service.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param service the custom service class for the SOAP service
   */
  @VisibleForTesting
  LabelDelegate(AdWordsSession adWordsSession, LabelServiceInterface service) {
    super(adWordsSession, SelectorFields.Label.all(),
        Label.class, LabelOperation.class, service);
  }

  /**
   * Constructor with custom fields.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param selectorFields for the Generic Selectors using the SelectorField class
   */
  public LabelDelegate(AdWordsSession adWordsSession,
      List<SelectorFields.Label> selectorFields) {
    super(adWordsSession, selectorFields, Label.class, LabelOperation.class,
        LabelServiceInterface.class);
  }

  /**
   * Retrieves Labels by labelIds.
   *
   * @param labelIds
   * @return a list of Labels matching LabelIds
   * @throws RemoteException for communication-related exceptions
   */
  public List<Label> getByLabelId(List<Long> labelIds) throws RemoteException {
    return getByField(SelectorFields.Label.ID, labelIds);
  }

  /**
   * Retrieves a Label by labelId.
   *
   * @param labelId
   * @return a list of Labels matching LabelId
   * @throws RemoteException for communication-related exceptions
   */
  public Label getByLabelId(Long labelId) throws RemoteException {
    return getOneByField(SelectorFields.Label.ID, labelId);
  }

  /**
   * Retrieves Labels by status.
   *
   * @param status
   * @return a list of Labels matching status
   * @throws RemoteException for communication-related exceptions
   */
  public List<Label> getByStatus(LabelStatus status) throws RemoteException {
    return getByField(SelectorFields.Label.STATUS, status);
  }

  /**
   * Retrieves Labels by name.
   *
   * @param name
   * @return a list of Labels matching name
   * @throws RemoteException for communication-related exceptions
   */
  public List<Label> getByName(String name) throws RemoteException {
    return getByField(SelectorFields.Label.NAME, name);
  }
}
