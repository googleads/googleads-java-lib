/**
 * BudgetServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201605.cm;

public interface BudgetServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of budgets that match the selector.
     *         
     *         
     * @return List of budgets specified by the selector.
     *         
     * @throws com.google.ads.api.services.common.error.ApiException if problems
     * occurred while retrieving results.
     */
    public com.google.api.ads.adwords.axis.v201605.cm.BudgetPage get(com.google.api.ads.adwords.axis.v201605.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201605.cm.ApiException;

    /**
     * Applies the list of mutate operations.
     *         
     *         
     * @param operations The operations to apply.
     *         
     * @return The modified list of Budgets, returned in the same order as
     * <code>operations</code>.
     *         
     * @throws ApiException
     */
    public com.google.api.ads.adwords.axis.v201605.cm.BudgetReturnValue mutate(com.google.api.ads.adwords.axis.v201605.cm.BudgetOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201605.cm.ApiException;

    /**
     * Returns the list of budgets that match the query.
     *         
     *         
     * @param query The SQL-like AWQL query string
     *         
     * @returns A list of Budget
     *         
     * @throws ApiException when the query is invalid or there are errors
     * processing the request.
     */
    public com.google.api.ads.adwords.axis.v201605.cm.BudgetPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201605.cm.ApiException;
}
