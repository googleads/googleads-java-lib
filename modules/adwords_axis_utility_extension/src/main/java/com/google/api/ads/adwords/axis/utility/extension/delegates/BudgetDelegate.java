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
import com.google.api.ads.adwords.axis.v201506.cm.Budget;
import com.google.api.ads.adwords.axis.v201506.cm.BudgetOperation;
import com.google.api.ads.adwords.axis.v201506.cm.BudgetServiceInterface;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.common.annotations.VisibleForTesting;

import java.rmi.RemoteException;
import java.util.List;

/**
 * Specific AbstractGetMutateDelegate for {@link BudgetDelegate}.
 *
 * @author Julian Toledo
 */
public final class BudgetDelegate extends
    AbstractGetMutateDelegate<Budget, BudgetOperation, BudgetServiceInterface> {

  /**
   * Default Constructor.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   */
  public BudgetDelegate(AdWordsSession adWordsSession) {
    super(adWordsSession, SelectorFields.Budget.all(), Budget.class, BudgetOperation.class,
        BudgetServiceInterface.class);
  }

  /**
   * Constructor with custom service.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param service the custom service class for the SOAP service
   */
  @VisibleForTesting
  BudgetDelegate(AdWordsSession adWordsSession, BudgetServiceInterface service) {
    super(adWordsSession, SelectorFields.Budget.all(), Budget.class, BudgetOperation.class,
        service);
  }

  /**
   * Constructor with custom fields.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param selectorFields for the Generic Selectors using the SelectorField class
   */
  public BudgetDelegate(AdWordsSession adWordsSession,
      List<SelectorFields.Budget> selectorFields) {
    super(adWordsSession, selectorFields, Budget.class, BudgetOperation.class,
        BudgetServiceInterface.class);
  }

  /**
   * Retrieves Budgets by id.
   *
   * @param id
   * @return a list of Budgets matching the id
   * @throws RemoteException for communication-related exceptions
   */
  public Budget getById(Long id) throws RemoteException {
    return getOneByField(SelectorFields.Budget.BUDGET_ID, id);
  }
}
