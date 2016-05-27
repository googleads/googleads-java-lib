/**
 * TrialAsyncErrorServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201605.cm;

public interface TrialAsyncErrorServiceInterface extends java.rmi.Remote {

    /**
     * Returns a TrialAsyncErrorPage that contains a list of TrialAsyncErrors
     * matching the selector.
     *         
     *         
     * @throws {#link com.google.ads.api.services.common.error.ApiException}
     * if problems occurred
     *         while retrieving the results.
     */
    public com.google.api.ads.adwords.axis.v201605.cm.TrialAsyncErrorPage get(com.google.api.ads.adwords.axis.v201605.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201605.cm.ApiException;

    /**
     * Returns a TrialAsyncErrorPage that contains a list of TrialAsyncError
     * matching the query.
     *         
     *         
     * @throws {#link com.google.ads.api.services.common.error.ApiException}
     * if problems occurred
     *         while retrieving the results.
     */
    public com.google.api.ads.adwords.axis.v201605.cm.TrialAsyncErrorPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201605.cm.ApiException;
}
