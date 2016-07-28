/**
 * FeedServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201607.cm;

public interface FeedServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of Feeds that meet the selector criteria.
     *         
     *         
     * @param selector Determines which Feeds to return. If empty all
     *         Feeds are returned.
     *         
     * @return The list of Feeds.
     *         
     * @throws ApiException Indicates a problem with the request.
     */
    public com.google.api.ads.adwords.axis.v201607.cm.FeedPage get(com.google.api.ads.adwords.axis.v201607.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201607.cm.ApiException;

    /**
     * Add, remove, and set Feeds.
     *         
     *         
     * @param operations The operations to apply.
     *         
     * @return The resulting Feeds.
     *         
     * @throws ApiException Indicates a problem with the request.
     */
    public com.google.api.ads.adwords.axis.v201607.cm.FeedReturnValue mutate(com.google.api.ads.adwords.axis.v201607.cm.FeedOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201607.cm.ApiException;

    /**
     * Returns the list of Feed that match the query.
     *         
     *         
     * @param query The SQL-like AWQL query string.
     *         
     * @returns A list of Feed.
     *         
     * @throws ApiException if problems occur while parsing the query or
     * fetching Feed.
     */
    public com.google.api.ads.adwords.axis.v201607.cm.FeedPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201607.cm.ApiException;
}
