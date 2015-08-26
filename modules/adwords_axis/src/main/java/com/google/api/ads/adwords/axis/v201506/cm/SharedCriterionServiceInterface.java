/**
 * SharedCriterionServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201506.cm;

public interface SharedCriterionServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of SharedCriterion that meets the selector criteria.
     * 
     *         
     * @param selector filters the criteria returned
     *         
     * @return The list of SharedCriterion
     *         
     * @throws ApiException
     */
    public com.google.api.ads.adwords.axis.v201506.cm.SharedCriterionPage get(com.google.api.ads.adwords.axis.v201506.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201506.cm.ApiException;

    /**
     * Adds, removes criteria in a shared set.
     *         
     *         
     * @param operations A list of unique operations
     *         
     * @return The list of updated SharedCriterion, returned in the same
     * order as the
     *         {@code operations} array.
     *         
     * @throws ApiException
     */
    public com.google.api.ads.adwords.axis.v201506.cm.SharedCriterionReturnValue mutate(com.google.api.ads.adwords.axis.v201506.cm.SharedCriterionOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201506.cm.ApiException;

    /**
     * Returns the list of SharedCriterion that match the query.
     *         
     *         
     * @param query The SQL-like AWQL query string.
     *         
     * @return A list of SharedCriterion.
     *         
     * @throws ApiException
     */
    public com.google.api.ads.adwords.axis.v201506.cm.SharedCriterionPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201506.cm.ApiException;
}
