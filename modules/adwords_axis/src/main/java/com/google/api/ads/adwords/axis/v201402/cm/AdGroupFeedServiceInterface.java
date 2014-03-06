/**
 * AdGroupFeedServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.cm;

public interface AdGroupFeedServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of AdGroupFeeds that meet the selector criteria.
     * 
     *         
     * @param selector Determines which AdGroupFeeds to return. If empty
     * all
     *         adgroup feeds are returned.
     *         
     * @return The list of AdgroupFeeds.
     *         
     * @throws ApiException Indicates a problem with the request.
     */
    public com.google.api.ads.adwords.axis.v201402.cm.AdGroupFeedPage get(com.google.api.ads.adwords.axis.v201402.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201402.cm.ApiException;

    /**
     * Adds, updates or removes AdGroupFeeds.
     *         
     *         
     * @param operations The operations to apply.
     *         
     * @return The resulting Feeds.
     *         
     * @throws ApiException Indicates a problem with the request.
     */
    public com.google.api.ads.adwords.axis.v201402.cm.AdGroupFeedReturnValue mutate(com.google.api.ads.adwords.axis.v201402.cm.AdGroupFeedOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201402.cm.ApiException;

    /**
     * Returns the list of AdGroupFeeds that match the query.
     *         
     *         
     * @param query The SQL-like AWQL query string.
     *         
     * @returns A list of AdGroupFeed.
     *         
     * @throws ApiException if problems occur while parsing the query or
     * fetching AdGroupFeed.
     */
    public com.google.api.ads.adwords.axis.v201402.cm.AdGroupFeedPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201402.cm.ApiException;
}
