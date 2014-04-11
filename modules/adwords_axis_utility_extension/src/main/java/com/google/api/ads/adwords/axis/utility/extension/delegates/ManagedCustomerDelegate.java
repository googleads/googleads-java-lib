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

import com.google.api.ads.adwords.axis.utility.extension.util.ListUtil;
import com.google.api.ads.adwords.axis.utility.extension.util.SelectorFields;
import com.google.api.ads.adwords.axis.utils.v201402.SelectorBuilder;
import com.google.api.ads.adwords.axis.v201402.cm.ApiException;
import com.google.api.ads.adwords.axis.v201402.cm.Operator;
import com.google.api.ads.adwords.axis.v201402.mcm.LinkOperation;
import com.google.api.ads.adwords.axis.v201402.mcm.LinkStatus;
import com.google.api.ads.adwords.axis.v201402.mcm.ManagedCustomer;
import com.google.api.ads.adwords.axis.v201402.mcm.ManagedCustomerLink;
import com.google.api.ads.adwords.axis.v201402.mcm.ManagedCustomerOperation;
import com.google.api.ads.adwords.axis.v201402.mcm.ManagedCustomerServiceInterface;
import com.google.api.ads.adwords.axis.v201402.mcm.MoveOperation;
import com.google.api.ads.adwords.axis.v201402.mcm.MutateLinkResults;
import com.google.api.ads.adwords.axis.v201402.mcm.MutateManagerResults;
import com.google.api.ads.adwords.axis.v201402.mcm.PendingInvitation;
import com.google.api.ads.adwords.axis.v201402.mcm.PendingInvitationSelector;
import com.google.api.ads.adwords.lib.client.AdWordsSession;

import java.rmi.RemoteException;
import java.util.List;

/**
 * Specific AbstractGetMutateDelegate for {@link ManagedCustomer}.
 *
 * <p>
 * Implementation is not thread-safe,
 * because AdWordsSession and Apache Axis service objects are not thread-safe.
 * </p>
 *
 * @author Julian Toledo
 */
public final class ManagedCustomerDelegate extends AbstractGetMutateDelegate
<ManagedCustomer, ManagedCustomerOperation, ManagedCustomerServiceInterface> {

  /**
   * Default Constructor.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   */
  public ManagedCustomerDelegate(AdWordsSession adWordsSession) {
    // Fields are not necessary for Services that do not use Generic Selectors
    super(adWordsSession, SelectorFields.ManagedCustomer.all(), ManagedCustomer.class,
        ManagedCustomerOperation.class, ManagedCustomerServiceInterface.class);
  }

  /**
   * Constructor with custom service.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param service the custom service class for the SOAP service
   */
  public ManagedCustomerDelegate(AdWordsSession adWordsSession,
      ManagedCustomerServiceInterface service) {
    // Fields are not necessary for Services that do not use Generic Selectors
    super(adWordsSession, SelectorFields.ManagedCustomer.all(), ManagedCustomer.class,
        ManagedCustomerOperation.class, service);
  }

  /**
   * Constructor with custom fields.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param selectorFields for the Generic Selectors using the SelectorField class
   */
  public ManagedCustomerDelegate(AdWordsSession adWordsSession,
      List<SelectorFields.ManagedCustomer> selectorFields) {
    super(adWordsSession, selectorFields, ManagedCustomer.class, ManagedCustomerOperation.class,
        ManagedCustomerServiceInterface.class);
  }

  /**
   * Retrieves ManagedCustomers by customerIds.
   *
   * @param customerIds
   * @return a list of ManagedCustomers matching the customerIds
   * @throws RemoteException for communication-related exceptions
   */
  public List<ManagedCustomer> getByCustomerId(List<Long> customerIds) throws RemoteException {
    return getByField(SelectorFields.ManagedCustomer.CUSTOMER_ID, customerIds);
  }

  /**
   * Retrieves ManagedCustomers by customerId.
   *
   * @param customerId
   * @return a list of ManagedCustomers matching the customerId
   * @throws RemoteException for communication-related exceptions
   */
  public ManagedCustomer getByCustomerId(Long customerId) throws RemoteException {
    return getByCustomerId(String.valueOf(customerId));
  }

  /**
   * Retrieves ManagedCustomers by customerId.
   *
   * @param customerId this String parameter is for support for the format 123-123-1234
   * @return a list of ManagedCustomers matching the customerId
   * @throws RemoteException for communication-related exceptions
   */
  public ManagedCustomer getByCustomerId(String customerId) throws RemoteException {
    return getOneByField(SelectorFields.ManagedCustomer.CUSTOMER_ID, customerId);
  }

  /**
   * Retrieves ManagedCustomers by canManageClients.
   *
   * @param canManageClients
   * @return a list of ManagedCustomers matching the canManageClients
   * @throws RemoteException for communication-related exceptions
   */
  public List<ManagedCustomer> getByCanManageClients(boolean canManageClients)
      throws RemoteException {
    return getByField(SelectorFields.ManagedCustomer.CAN_MANAGE_CLIENTS, canManageClients);
  }

  /**
   * Retrieves ManagedCustomers by customerIds and canManageClients.
   *
   * @param customerIds
   * @param canManageClients
   * @return a list of ManagedCustomers matching the customerIds and canManageClients
   * @throws RemoteException for communication-related exceptions
   */
  public List<ManagedCustomer> getByCustomerIdCanManageClients(List<Long> customerIds,
      boolean canManageClients) throws RemoteException {
    SelectorBuilder builder = createSelectorBuilder();
    if (customerIds != null && !customerIds.isEmpty()) {
      builder.in(SelectorFields.ManagedCustomer.CUSTOMER_ID.getField(),
          ListUtil.asStringArray(customerIds));
    }
    builder.equals(SelectorFields.ManagedCustomer.CAN_MANAGE_CLIENTS.getField(),
        String.valueOf(canManageClients));
    return get(builder.build());
  }

  /**
   * Retrieves PendingInvitations for the account.
   *
   * @param selector the manager customer id (inviter)
   *        or the client customer id (invitee)
   * @return a list of PendingInvitations matching the customerIds
   * @throws RemoteException for communication-related exceptions
   * @throws ApiException holding a list of service errors
   */
  public List<PendingInvitation> getPendingInvitations(PendingInvitationSelector selector)
      throws ApiException, RemoteException {
    return ListUtil.asList(getService().getPendingInvitations(selector));
  }

  /**
   * Retrieves PendingInvitations for the account.
   *
   * @return a list of PendingInvitations matching the customerIds
   * @throws RemoteException for communication-related exceptions
   * @throws ApiException holding a list of service errors
   */
  public List<PendingInvitation> getPendingInvitations()
      throws ApiException, RemoteException {
    return ListUtil.asList(getService().getPendingInvitations(new PendingInvitationSelector()));
  }

  /**
   * Modifies the ManagedCustomer forest.
   *
   * @return MutateLinkResults
   * @throws RemoteException for communication-related exceptions
   * @throws ApiException holding a list of service errors
   */
  public MutateLinkResults mutateLink(LinkOperation[] operations)
      throws ApiException, RemoteException {
    return getService().mutateLink(operations);
  }

  /**
   * Extends Invitations.
   * Sets operations to Operator.ADD and LinkStatus.PENDING as required.
   *
   * @param managedCustomerLinks a list of ManagedCustomerLink
   * @return the resulting List<ManagedCustomerLink> from the operations
   * @throws RemoteException for communication-related exceptions
   * @throws ApiException holding a list of service errors
   */
  public List<ManagedCustomerLink> invitationExtend(List<ManagedCustomerLink> managedCustomerLinks)
      throws ApiException, RemoteException {
    LinkOperation[] listOperations = new LinkOperation[managedCustomerLinks.size()];
    for (int i = 0; i < managedCustomerLinks.size(); i++) {
      managedCustomerLinks.get(i).setLinkStatus(LinkStatus.PENDING);
      listOperations[i] = new LinkOperation(Operator.ADD, null, managedCustomerLinks.get(i));
    }
    return ListUtil.asList(getService().mutateLink(listOperations).getLinks());
  }

  /**
   * Rescinds Invitations.
   * Sets operations to Operator.SET and LinkStatus.CANCELLED as required.
   *
   * @param managedCustomerLinks a list of ManagedCustomerLink
   * @return the resulting List<ManagedCustomerLink> from the operations
   * @throws RemoteException for communication-related exceptions
   * @throws ApiException holding a list of service errors
   */
  public List<ManagedCustomerLink> invitationRescind(
      List<ManagedCustomerLink> managedCustomerLinks) throws ApiException, RemoteException {
    LinkOperation[] listOperations = new LinkOperation[managedCustomerLinks.size()];
    for (int i = 0; i < managedCustomerLinks.size(); i++) {
      managedCustomerLinks.get(i).setLinkStatus(LinkStatus.CANCELLED);
      listOperations[i] = new LinkOperation(Operator.SET, null, managedCustomerLinks.get(i));
    }
    return ListUtil.asList(getService().mutateLink(listOperations).getLinks());
  }

  /**
   * Accepts Invitations.
   * Sets operations to Operator.SET and LinkStatus.ACTIVE as required.
   *
   * @param managedCustomerLinks a list of ManagedCustomerLink
   * @return the resulting List<ManagedCustomerLink> from the operations
   * @throws RemoteException for communication-related exceptions
   * @throws ApiException holding a list of service errors
   */
  public List<ManagedCustomerLink> invitationAccept(List<ManagedCustomerLink> managedCustomerLinks)
      throws ApiException, RemoteException {
    LinkOperation[] listOperations = new LinkOperation[managedCustomerLinks.size()];
    for (int i = 0; i < managedCustomerLinks.size(); i++) {
      managedCustomerLinks.get(i).setLinkStatus(LinkStatus.ACTIVE);
      listOperations[i] = new LinkOperation(Operator.SET, null, managedCustomerLinks.get(i));
    }
    return ListUtil.asList(getService().mutateLink(listOperations).getLinks());
  }

  /**
   * Declines Invitations.
   * Sets operations to Operator.SET and LinkStatus.REFUSED as required.
   *
   * @param managedCustomerLinks a list of ManagedCustomerLink
   * @return the resulting List<ManagedCustomerLink> from the operations
   * @throws RemoteException for communication-related exceptions
   * @throws ApiException holding a list of service errors
   */
  public List<ManagedCustomerLink> invitationDecline(
      List<ManagedCustomerLink> managedCustomerLinks) throws ApiException, RemoteException {
    LinkOperation[] listOperations = new LinkOperation[managedCustomerLinks.size()];
    for (int i = 0; i < managedCustomerLinks.size(); i++) {
      managedCustomerLinks.get(i).setLinkStatus(LinkStatus.REFUSED);
      listOperations[i] = new LinkOperation(Operator.SET, null, managedCustomerLinks.get(i));
    }
    return ListUtil.asList(getService().mutateLink(listOperations).getLinks());
  }

  /**
   * Terminates Links.
   * Sets operations to Operator.SET and LinkStatus.INACTIVE as required.
   *
   * @param managedCustomerLinks a list of ManagedCustomerLink
   * @return the resulting List<ManagedCustomerLink> from the operations
   * @throws RemoteException for communication-related exceptions
   * @throws ApiException holding a list of service errors
   */
  public List<ManagedCustomerLink> terminateLink(List<ManagedCustomerLink> managedCustomerLinks)
      throws ApiException, RemoteException {
    LinkOperation[] listOperations = new LinkOperation[managedCustomerLinks.size()];
    for (int i = 0; i < managedCustomerLinks.size(); i++) {
      managedCustomerLinks.get(i).setLinkStatus(LinkStatus.INACTIVE);
      listOperations[i] = new LinkOperation(Operator.SET, null, managedCustomerLinks.get(i));
    }
    return ListUtil.asList(getService().mutateLink(listOperations).getLinks());
  }

  /**
   * Moves client customers to new managers (moving links).
   *
   * @return MutateManagerResults
   * @throws RemoteException for communication-related exceptions
   * @throws ApiException holding a list of service errors
   */
  public MutateManagerResults mutateManager(MoveOperation[] operations)
      throws ApiException, RemoteException {
    return getService().mutateManager(operations);
  }

  /**
   * Moves client customers to new managers (moving links).
   * oldManagerCustomerId restricts the moves from a single MCC.
   *
   * @param oldManagerCustomerId from where the accounts are being moved
   * @return the resulting List<ManagedCustomerLink> from the operations
   * @throws RemoteException for communication-related exceptions
   * @throws ApiException holding a list of service errors
   */
  public List<ManagedCustomerLink> moveManager(List<ManagedCustomerLink> managedCustomerLinks,
      Long oldManagerCustomerId) throws ApiException, RemoteException {
    MoveOperation[] listOperations = new MoveOperation[managedCustomerLinks.size()];
    for (int i = 0; i < managedCustomerLinks.size(); i++) {
      managedCustomerLinks.get(i).setLinkStatus(LinkStatus.ACTIVE);
      listOperations[i] = new MoveOperation(
          Operator.SET, null, managedCustomerLinks.get(i), oldManagerCustomerId);
    }
    return ListUtil.asList(getService().mutateManager(listOperations).getLinks());
  }
}
