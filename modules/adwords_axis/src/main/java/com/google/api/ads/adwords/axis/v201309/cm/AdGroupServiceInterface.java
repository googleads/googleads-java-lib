/**
 * AdGroupServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.cm;

public interface AdGroupServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of all the ad groups specified by the selector
     * from the target customer's account.
     *         
     *         
     * @param serviceSelector The selector specifying the {@link AdGroup}s
     * to return.
     *         
     * @return List of adgroups identified by the selector.
     *         
     * @throws ApiException when there is at least one error with the request.
     */
    public com.google.api.ads.adwords.axis.v201309.cm.AdGroupPage get(com.google.api.ads.adwords.axis.v201309.cm.Selector serviceSelector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201309.cm.ApiException;

    /**
     * Adds, updates, or deletes ad groups.
     *         <p class="note"><b>Note:</b> {@link AdGroupOperation} does
     * not support the
     *         {@code REMOVE} operator. To delete an ad group, set its
     *         {@link AdGroup#status status} to {@code DELETED}.</p>
     *         
     *         
     * @param operations List of unique operations. The same ad group cannot
     * be
     *         specified in more than one operation.
     *         
     * @return The updated adgroups.
     */
    public com.google.api.ads.adwords.axis.v201309.cm.AdGroupReturnValue mutate(com.google.api.ads.adwords.axis.v201309.cm.AdGroupOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201309.cm.ApiException;

    /**
     * Returns the list of ad groups that match the query.
     *         
     *         
     * @param query The SQL-like AWQL query string
     *         
     * @return A list of adgroups
     *         
     * @throws ApiException
     */
    public com.google.api.ads.adwords.axis.v201309.cm.AdGroupPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201309.cm.ApiException;
}
