/**
 * CustomerFeedServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201607.cm;

public interface CustomerFeedServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of customer feeds that meet the selector criteria.
     * 
     *         
     * @param selector Determines which customer feeds to return. If empty,
     * all
     *         customer feeds are returned.
     *         
     * @return The list of customer feeds.
     *         
     * @throws ApiException Indicates a problem with the request.
     */
    public com.google.api.ads.adwords.axis.v201607.cm.CustomerFeedPage get(com.google.api.ads.adwords.axis.v201607.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201607.cm.ApiException;

    /**
     * Adds, sets, or removes customer feeds.
     *         
     *         
     * @param operations The operations to apply.
     *         
     * @return The resulting feeds.
     *         
     * @throws ApiException Indicates a problem with the request.
     */
    public com.google.api.ads.adwords.axis.v201607.cm.CustomerFeedReturnValue mutate(com.google.api.ads.adwords.axis.v201607.cm.CustomerFeedOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201607.cm.ApiException;

    /**
     * Returns the list of customer feeds that match the query.
     *         
     *         
     * @param query The SQL-like AWQL query string.
     *         
     * @return A list of CustomerFeed.
     *         
     * @throws ApiException If problems occur while parsing the query or
     * fetching CustomerFeed.
     */
    public com.google.api.ads.adwords.axis.v201607.cm.CustomerFeedPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201607.cm.ApiException;
}
