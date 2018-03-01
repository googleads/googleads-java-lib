// Copyright 2018 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * ManagedCustomerServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.mcm;

public interface ManagedCustomerServiceInterface extends java.rmi.Remote {

    /**
     * Returns the list of customers that meet the selector criteria.
     * 
     *         
     * @param selector The selector specifying the {@link ManagedCustomer}s
     * to return.
     *         
     * @return List of customers identified by the selector.
     *         
     * @throws ApiException When there is at least one error with the request.
     */
    public com.google.api.ads.adwords.axis.v201802.mcm.ManagedCustomerPage get(com.google.api.ads.adwords.axis.v201802.cm.Selector serviceSelector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Returns the pending invitations for the customer IDs in the
     * selector.
     *         
     * @param selector the manager customer ids (inviters) or the client
     * customer ids (invitees)
     *         
     * @throws ApiException when there is at least one error with the request
     */
    public com.google.api.ads.adwords.axis.v201802.mcm.PendingInvitation[] getPendingInvitations(com.google.api.ads.adwords.axis.v201802.mcm.PendingInvitationSelector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Modifies or creates new {@link ManagedCustomer}s.
     *         
     *         <p class="note"><b>Note:</b> See {@link ManagedCustomerOperation}
     * for available operators.</p>
     *         
     *         
     * @param operations List of unique operations.
     *         
     * @return The list of updated managed customers, returned in the same
     * order as the
     *         <code>operations</code> array.
     */
    public com.google.api.ads.adwords.axis.v201802.mcm.ManagedCustomerReturnValue mutate(com.google.api.ads.adwords.axis.v201802.mcm.ManagedCustomerOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Adds {@linkplain AccountLabel}s to, and removes
     *         {@linkplain AccountLabel}s from, {@linkplain ManagedCustomer}s.
     * 
     *         <p>To add an {@linkplain AccountLabel} to a {@linkplain ManagedCustomer},
     * use {@link Operator#ADD}.
     *         To remove an {@linkplain AccountLabel} from a {@linkplain
     * ManagedCustomer},
     *         use {@link Operator#REMOVE}.</p>
     *         <p>The label must already exist (see {@link AccountLabelService#mutate}
     * for
     *         how to create them) and be owned by the authenticated user.</p>
     * <p>The {@linkplain ManagedCustomer} must already exist and be managed
     * by
     *         the customer making the request (either directly or indirectly).</p>
     * <p>An AccountLabel may be applied to at most 1000 customers.</p>
     *         <p>This method does not support partial failures, and will
     * fail if any
     *         operation is invalid.</p>
     */
    public com.google.api.ads.adwords.axis.v201802.mcm.ManagedCustomerLabelReturnValue mutateLabel(com.google.api.ads.adwords.axis.v201802.mcm.ManagedCustomerLabelOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Modifies the ManagedCustomer forest. These actions are possible
     * (categorized by
     *         Operator + Link Status):
     *         
     *         <ul>
     *         <li>ADD + PENDING:   manager extends invitations</li>
     *         <li>SET + CANCELLED: manager rescinds invitations</li>
     *         <li>SET + INACTIVE:  manager/client terminates links</li>
     *         <li>SET + ACTIVE:    client accepts invitations</li>
     *         <li>SET + REFUSED:   client declines invitations</li>
     *         </ul>
     *         
     *         In addition to these, active links can also be marked hidden
     * / unhidden.
     *         <ul>
     *         <li> An ACTIVE link can be marked hidden with SET + ACTIVE
     * along with setting the
     *         isHidden bit to true. </li>
     *         <li> An ACTIVE link can be marked unhidden with SET + ACTIVE
     * along with setting the
     *         isHidden bit to false. </li>
     *         </ul>
     *         
     *         
     * @param operations the list of operations
     *         
     * @return results for the given operations
     *         
     * @throws ApiException with a {@link ManagedCustomerServiceError}
     */
    public com.google.api.ads.adwords.axis.v201802.mcm.MutateLinkResults mutateLink(com.google.api.ads.adwords.axis.v201802.mcm.LinkOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Moves client customers to new managers (moving links). Only
     * the following action is possible:
     *         
     *         <ul>
     *         <li>SET + ACTIVE: manager moves client customers to new managers
     * within the same manager
     *         account hierarchy</li>
     *         </ul>
     *         
     *         
     * @param operations List of unique operations.
     *         
     * @return results for the given operations
     *         
     * @throws ApiException with a {@link ManagedCustomerServiceError}
     */
    public com.google.api.ads.adwords.axis.v201802.mcm.MutateManagerResults mutateManager(com.google.api.ads.adwords.axis.v201802.mcm.MoveOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;
}
