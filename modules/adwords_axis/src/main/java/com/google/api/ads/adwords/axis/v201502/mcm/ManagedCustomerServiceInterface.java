/**
 * ManagedCustomerServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201502.mcm;

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
    public com.google.api.ads.adwords.axis.v201502.mcm.ManagedCustomerPage get(com.google.api.ads.adwords.axis.v201502.cm.Selector serviceSelector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201502.cm.ApiException;

    /**
     * Returns the pending invitations for the customer IDs in the
     * selector.
     *         
     * @param selector the manager customer ids (inviters) or the client
     * customer ids (invitees)
     *         
     * @throws ApiException when there is at least one error with the request
     */
    public com.google.api.ads.adwords.axis.v201502.mcm.PendingInvitation[] getPendingInvitations(com.google.api.ads.adwords.axis.v201502.mcm.PendingInvitationSelector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201502.cm.ApiException;

    /**
     * Adds managed customers.
     *         
     *         <p class="note"><b>Note:</b> {@link ManagedCustomerOperation}
     * only supports
     *         {@code ADD} operator. </p>
     *         
     *         
     * @param operations List of unique operations.
     *         
     * @return The list of updated managed customers, returned in the same
     * order as the
     *         <code>operations</code> array.
     */
    public com.google.api.ads.adwords.axis.v201502.mcm.ManagedCustomerReturnValue mutate(com.google.api.ads.adwords.axis.v201502.mcm.ManagedCustomerOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201502.cm.ApiException;

    /**
     * Adds {@link com.google.ads.api.services.mcm.common.labels.Label}s
     * to, and removes
     *         {@linkplain Label}s from, {@link ManagedCustomer}s.
     *         
     *         <p>To add a {@linkplain Label} to a {@linkplain ManagedCustomer},
     * use
     *         {@link Operator#ADD}.
     *         To remove a {@linkplain Label} from a {@linkplain ManagedCustomer},
     * use
     *         {@link Operator#REMOVE}.
     *         <p>The label must already exist (see
     *         {@link com.google.ads.api.services.mcm.labels.AccountLabelService.mutate}
     * for how to
     *         create them) and be owned by the authenticated user.
     *         <p>The {@linkplain ManagedCustomer} must already exist and
     * be managed by the customer
     *         making the request (either directly or indirectly).
     *         <p>A label may be applied to at most 1000 customers.
     *         <p>This method does not support partial failures, and will
     * fail if any operation is invalid.
     */
    public com.google.api.ads.adwords.axis.v201502.mcm.ManagedCustomerLabelReturnValue mutateLabel(com.google.api.ads.adwords.axis.v201502.mcm.ManagedCustomerLabelOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201502.cm.ApiException;

    /**
     * Modifies the ManagedCustomer forest. These actions are possible
     * (categorized by
     *         Operator + Link Status):
     *         
     *         <ul>
     *         <li>ADD + PENDING:   manager extends invitations
     *         <li>SET + CANCELLED: manager rescinds invitations
     *         <li>SET + INACTIVE:  manager/client terminates links
     *         <li>SET + ACTIVE:    client accepts invitations
     *         <li>SET + REFUSED:   client declines invitations
     *         </ul>
     *         
     *         
     * @param operations the list of operations
     *         
     * @return results for the given operations
     *         
     * @throws ApiException with a {@link ManagedCustomerServiceError}
     */
    public com.google.api.ads.adwords.axis.v201502.mcm.MutateLinkResults mutateLink(com.google.api.ads.adwords.axis.v201502.mcm.LinkOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201502.cm.ApiException;

    /**
     * Moves client customers to new managers (moving links). Only
     * the following action is possible:
     *         
     *         <ul>
     *         <li>SET + ACTIVE: manager moves client customers to new managers
     * within the same MCC
     *         hierarchy
     *         </ul>
     *         
     *         
     * @param operations List of unique operations.
     *         
     * @return results for the given operations
     *         
     * @throws ApiException with a {@link ManagedCustomerServiceError}
     */
    public com.google.api.ads.adwords.axis.v201502.mcm.MutateManagerResults mutateManager(com.google.api.ads.adwords.axis.v201502.mcm.MoveOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201502.cm.ApiException;
}
