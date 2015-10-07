/**
 * AdGroupBidModifierServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201509.cm;

public interface AdGroupBidModifierServiceInterface extends java.rmi.Remote {

    /**
     * Gets ad group level criterion bid modifiers.
     *         
     *         
     * @param selector The selector specifying the {@link AdGroupBidModifier}s
     * to return.
     *         
     * @return A list of ad group bid modifiers.
     *         
     * @throws ApiException when there is at least one error with the request.
     */
    public com.google.api.ads.adwords.axis.v201509.cm.AdGroupBidModifierPage get(com.google.api.ads.adwords.axis.v201509.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201509.cm.ApiException;

    /**
     * Adds, removes or updates ad group bid modifier overrides.
     *         
     *         
     * @param operations The operations to apply.
     *         
     * @return The added ad group bid modifier overrides.
     *         
     * @throws ApiException when there is at least one error with the request.
     */
    public com.google.api.ads.adwords.axis.v201509.cm.AdGroupBidModifierReturnValue mutate(com.google.api.ads.adwords.axis.v201509.cm.AdGroupBidModifierOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201509.cm.ApiException;

    /**
     * Returns a list of {@link AdGroupBidModifier}s that match the
     * query.
     *         
     *         
     * @param query The SQL-like AWQL query string.
     *         
     * @throws ApiException when there are one or more errors with the request.
     */
    public com.google.api.ads.adwords.axis.v201509.cm.AdGroupBidModifierPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201509.cm.ApiException;
}
