/**
 * LabelServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201509.cm;

public interface LabelServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of {@link Label}s.
     *         
     *         
     * @param serviceSelector The selector specifying the {@link Label}s
     * to return.
     *         
     * @return The page containing the {@link Label}s which meet the criteria
     * specified by the
     *         selector.
     *         
     * @throws ApiException when there is at least one error with the request
     */
    public com.google.api.ads.adwords.axis.v201509.cm.LabelPage get(com.google.api.ads.adwords.axis.v201509.cm.Selector serviceSelector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201509.cm.ApiException;

    /**
     * Applies the list of mutate operations.
     *         
     *         
     * @param operations The operations to apply. The same {@link Label}
     * cannot be specified in
     *         more than one operation.
     *         
     * @return The applied {@link Label}s.
     *         
     * @throws ApiException when there is at least one error with the request
     */
    public com.google.api.ads.adwords.axis.v201509.cm.LabelReturnValue mutate(com.google.api.ads.adwords.axis.v201509.cm.LabelOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201509.cm.ApiException;

    /**
     * Returns the list of {@link Label}s that match the query.
     *         
     *         
     * @param query The SQL-like AWQL query string
     *         
     * @returns  The page containing the {@link Label}s which match the query.
     * 
     * @throws ApiException when the query is invalid or there are errors
     * processing the request.
     */
    public com.google.api.ads.adwords.axis.v201509.cm.LabelPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201509.cm.ApiException;
}
