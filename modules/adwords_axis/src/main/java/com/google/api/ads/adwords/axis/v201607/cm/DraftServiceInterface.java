/**
 * DraftServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201607.cm;

public interface DraftServiceInterface extends java.rmi.Remote {

    /**
     * Returns a DraftPage that contains a list of Draft objects matching
     * the selector.
     *         
     *         
     * @throws {#link com.google.ads.api.services.common.error.ApiException}
     * if problems occurred
     *         while retrieving the results.
     */
    public com.google.api.ads.adwords.axis.v201607.cm.DraftPage get(com.google.api.ads.adwords.axis.v201607.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201607.cm.ApiException;

    /**
     * The mutate action is used for creating new Drafts and controlling
     * the life cycle of Drafts,
     *         such as abandoning or promoting Drafts.
     *         
     *         
     * @return The list of updated Drafts, in the same order as the {@code
     * operations} list.
     *         
     * @throws {#link com.google.ads.api.services.common.error.ApiException}
     * if problems occurred
     *         while processing the request.
     */
    public com.google.api.ads.adwords.axis.v201607.cm.DraftReturnValue mutate(com.google.api.ads.adwords.axis.v201607.cm.DraftOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201607.cm.ApiException;

    /**
     * Returns a DraftPage that contains a list of Draft objects matching
     * the query.
     *         
     *         
     * @throws {#link com.google.ads.api.services.common.error.ApiException}
     * if problems occurred
     *         while retrieving the results.
     */
    public com.google.api.ads.adwords.axis.v201607.cm.DraftPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201607.cm.ApiException;
}
