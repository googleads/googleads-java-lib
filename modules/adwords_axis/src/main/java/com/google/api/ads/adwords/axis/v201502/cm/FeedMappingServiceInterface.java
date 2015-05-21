/**
 * FeedMappingServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201502.cm;

public interface FeedMappingServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of FeedMappings that meet the selector criteria.
     * 
     *         
     * @param selector Determines which FeedMappings to return. If empty
     * all
     *         FeedMappings are returned.
     *         
     * @return The list of FeedMappings.
     *         
     * @throws ApiException indicates a problem with the request.
     */
    public com.google.api.ads.adwords.axis.v201502.cm.FeedMappingPage get(com.google.api.ads.adwords.axis.v201502.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201502.cm.ApiException;

    /**
     * Add and remove FeedMappings.
     *         The following {@link Operator}s are supported: ADD, REMOVE.
     * 
     *         
     * @param operations The operations to apply.
     *         
     * @return The resulting FeedMappings.
     *         
     * @throws ApiException indicates a problem with the request.
     */
    public com.google.api.ads.adwords.axis.v201502.cm.FeedMappingReturnValue mutate(com.google.api.ads.adwords.axis.v201502.cm.FeedMappingOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201502.cm.ApiException;

    /**
     * Returns the list of FeedMappings that match the query.
     *         
     *         
     * @param query The SQL-like AWQL query string
     *         
     * @returns The list of FeedMappings
     *         
     * @throws ApiException when the query is invalid or there are errors
     * processing the request.
     */
    public com.google.api.ads.adwords.axis.v201502.cm.FeedMappingPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201502.cm.ApiException;
}
