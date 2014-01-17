/**
 * AdGroupCriterionServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.cm;

public interface AdGroupCriterionServiceInterface extends java.rmi.Remote {

    /**
     * Gets adgroup criteria.
     *         
     *         
     * @param serviceSelector filters the adgroup criteria to be returned.
     * 
     * @return a page (subset) view of the criteria selected
     *         
     * @throws ApiException when there is at least one error with the request
     */
    public com.google.api.ads.adwords.axis.v201309.cm.AdGroupCriterionPage get(com.google.api.ads.adwords.axis.v201309.cm.Selector serviceSelector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201309.cm.ApiException;

    /**
     * Adds, removes or updates adgroup criteria.
     *         
     *         
     * @param operations operations to do
     *         during checks on keywords to be added.
     *         
     * @return added and updated adgroup criteria (without optional parts)
     * 
     * @throws ApiException when there is at least one error with the request
     */
    public com.google.api.ads.adwords.axis.v201309.cm.AdGroupCriterionReturnValue mutate(com.google.api.ads.adwords.axis.v201309.cm.AdGroupCriterionOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201309.cm.ApiException;

    /**
     * Returns the list of AdGroupCriterion that match the query.
     *         
     *         
     * @param query The SQL-like AWQL query string
     *         
     * @returns A list of AdGroupCriterion
     *         
     * @throws ApiException when the query is invalid or there are errors
     * processing the request.
     */
    public com.google.api.ads.adwords.axis.v201309.cm.AdGroupCriterionPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201309.cm.ApiException;
}
