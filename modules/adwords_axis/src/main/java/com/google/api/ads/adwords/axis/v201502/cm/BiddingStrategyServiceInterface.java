/**
 * BiddingStrategyServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201502.cm;

public interface BiddingStrategyServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of bidding strategies that match the selector.
     * 
     *         
     * @return list of bidding strategies specified by the selector.
     *         
     * @throws com.google.ads.api.services.common.error.ApiException if problems
     * occurred while retrieving results.
     */
    public com.google.api.ads.adwords.axis.v201502.cm.BiddingStrategyPage get(com.google.api.ads.adwords.axis.v201502.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201502.cm.ApiException;

    /**
     * Applies the list of mutate operations.
     *         
     *         
     * @param operations the operations to apply
     *         
     * @return the modified list of BiddingStrategy
     *         
     * @throws ApiException
     */
    public com.google.api.ads.adwords.axis.v201502.cm.BiddingStrategyReturnValue mutate(com.google.api.ads.adwords.axis.v201502.cm.BiddingStrategyOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201502.cm.ApiException;

    /**
     * Returns a list of bidding strategies that match the query.
     *         
     *         
     * @param query The SQL-like AWQL query string.
     *         
     * @throws ApiException when there are one or more errors with the request.
     */
    public com.google.api.ads.adwords.axis.v201502.cm.BiddingStrategyPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201502.cm.ApiException;
}
