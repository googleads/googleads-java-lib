/**
 * FeedServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201306.cm;

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
    public com.google.api.ads.adwords.axis.v201306.cm.FeedPage get(com.google.api.ads.adwords.axis.v201306.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201306.cm.ApiException;

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
    public com.google.api.ads.adwords.axis.v201306.cm.FeedReturnValue mutate(com.google.api.ads.adwords.axis.v201306.cm.FeedOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201306.cm.ApiException;
}
