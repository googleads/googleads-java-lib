/**
 * BudgetOrderServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201306.billing;

public interface BudgetOrderServiceInterface extends java.rmi.Remote {

    /**
     * Gets a list of {@link BudgetOrder}s using the generic selector.
     * 
     * @param serviceSelector specifies which BudgetOrder to return.
     *         
     * @return A {@link BudgetOrderPage} of BudgetOrders of the client customer.
     * All BudgetOrder fields are returned. Stats are not yet supported.
     *         
     * @throws ApiException
     */
    public com.google.api.ads.adwords.axis.v201306.billing.BudgetOrderPage get(com.google.api.ads.adwords.axis.v201306.cm.Selector serviceSelector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201306.cm.ApiException;

    /**
     * Returns all the open/active BillingAccounts associated with
     * the current
     *         manager.
     *         
     * @return A list of {@link BillingAccount}s.
     *         
     * @throws ApiException
     */
    public com.google.api.ads.adwords.axis.v201306.billing.BillingAccount[] getBillingAccounts() throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201306.cm.ApiException;

    /**
     * Mutates BudgetOrders, supported operations are:
     *         <p><code>ADD</code>: Adds a {@link BudgetOrder} to the billing
     * account
     *         specified by the billing account ID.</p>
     *         <p><code>SET</code>: Sets the start/end date and amount of
     * the
     *         {@link BudgetOrder}.</p>
     *         <p><code>REMOVE</code>: Cancels the {@link BudgetOrder} (status
     * change).</p>
     *         <p class="warning"><b>Warning:</b> The <code>BudgetOrderService</code>
     * is limited to one operation per mutate request. Any attempt to make
     * more
     *         than one operation will result in an <code>ApiException</code>.</p>
     * 
     * @param operations A list of operations, <b>however currently we only
     * support one operation per mutate call</b>.
     *         
     * @return BudgetOrders affected by the mutate operation.
     *         
     * @throws ApiException
     */
    public com.google.api.ads.adwords.axis.v201306.billing.BudgetOrderReturnValue mutate(com.google.api.ads.adwords.axis.v201306.billing.BudgetOrderOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201306.cm.ApiException;
}
