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
import com.google.api.ads.adwords.axis.v201402.rm.AdwordsUserListServiceInterface;
import com.google.api.ads.adwords.axis.v201402.rm.UserList;
import com.google.api.ads.adwords.axis.v201402.rm.UserListOperation;
import com.google.api.ads.adwords.lib.client.AdWordsSession;

import java.rmi.RemoteException;
import java.util.List;

/**
 * Specific AbstractGetMutateDelegate for {@link UserList}.
 *
 * @author Julian Toledo
 */
public final class UserListDelegate extends
    AbstractGetMutateDelegate<UserList, UserListOperation, AdwordsUserListServiceInterface> {

  /**
   * Default Constructor.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   */
  public UserListDelegate(AdWordsSession adWordsSession) {
    super(adWordsSession, SelectorFields.UserList.all(), UserList.class, UserListOperation.class,
        AdwordsUserListServiceInterface.class);
  }

  /**
   * Constructor with custom service.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param service the custom service class for the SOAP service
   */
  public UserListDelegate(AdWordsSession adWordsSession, AdwordsUserListServiceInterface service) {
    super(adWordsSession, SelectorFields.UserList.all(), UserList.class, UserListOperation.class,
        service);
  }

  /**
   * Constructor with custom fields.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param selectorFields for the Generic Selectors using the SelectorField class
   */
  public UserListDelegate(AdWordsSession adWordsSession,
      List<SelectorFields.UserList> selectorFields) {
    super(adWordsSession, selectorFields, UserList.class, UserListOperation.class,
        AdwordsUserListServiceInterface.class);
  }

  /**
   * Retrieves UserLists by id.
   *
   * @param id
   * @return a list of UserLists matching the id
   * @throws RemoteException for communication-related exceptions
   */
  public List<UserList> getById(long id) throws RemoteException {
    return getByField(SelectorFields.UserList.ID, id);
  }
}
