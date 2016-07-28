/**
 * AdCustomizerFeedServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201607.cm;

public interface AdCustomizerFeedServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of AdCustomizerFeeds that meet the selector
     * criteria.
     *         
     *         
     * @param selector Determines which AdCustomizerFeeds to return. If empty,
     * all AdCustomizerFeeds
     *         are returned.
     *         
     * @return The list of AdCustomizerFeeds.
     *         
     * @throws ApiException Indicates a problem with the request.
     */
    public com.google.api.ads.adwords.axis.v201607.cm.AdCustomizerFeedPage get(com.google.api.ads.adwords.axis.v201607.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201607.cm.ApiException;

    /**
     * Adds, removes, or modifies AdCustomizerFeeds.
     *         
     *         
     * @param operations The operations to apply.
     *         
     * @return The resulting AdCustomizerFeeds.
     *         
     * @throws ApiException Indicates a problem with the request.
     */
    public com.google.api.ads.adwords.axis.v201607.cm.AdCustomizerFeedReturnValue mutate(com.google.api.ads.adwords.axis.v201607.cm.AdCustomizerFeedOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201607.cm.ApiException;
}
