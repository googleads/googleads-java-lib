/**
 * FeedItemServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201306.cm;

public interface FeedItemServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of FeedItems that meet the selector criteria.
     * 
     *         
     * @param selector Determines which FeedItems to return. If empty all
     * FeedItems are returned.
     *         
     * @return The list of FeedItems.
     *         
     * @throws ApiException Indicates a problem with the request.
     */
    public com.google.api.ads.adwords.axis.v201306.cm.FeedItemPage get(com.google.api.ads.adwords.axis.v201306.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201306.cm.ApiException;

    /**
     * Add, remove, and set FeedItems.
     *         
     *         
     * @param operations The operations to apply.
     *         
     * @return The resulting FeedItems.
     *         
     * @throws ApiException Indicates a problem with the request.
     */
    public com.google.api.ads.adwords.axis.v201306.cm.FeedItemReturnValue mutate(com.google.api.ads.adwords.axis.v201306.cm.FeedItemOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201306.cm.ApiException;
}
