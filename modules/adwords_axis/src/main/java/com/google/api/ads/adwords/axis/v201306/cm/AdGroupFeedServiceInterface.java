/**
 * AdGroupFeedServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201306.cm;

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
    public com.google.api.ads.adwords.axis.v201306.cm.AdGroupFeedPage get(com.google.api.ads.adwords.axis.v201306.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201306.cm.ApiException;

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
    public com.google.api.ads.adwords.axis.v201306.cm.AdGroupFeedReturnValue mutate(com.google.api.ads.adwords.axis.v201306.cm.AdGroupFeedOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201306.cm.ApiException;
}
