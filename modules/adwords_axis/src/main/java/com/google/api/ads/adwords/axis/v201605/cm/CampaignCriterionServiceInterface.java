/**
 * CampaignCriterionServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201605.cm;

public interface CampaignCriterionServiceInterface extends java.rmi.Remote {

    /**
     * Gets campaign criteria.
     *         
     *         
     * @param serviceSelector The selector specifying the {@link CampaignCriterion}s
     * to return.
     *         
     * @return A list of campaign criteria.
     *         
     * @throws ApiException when there is at least one error with the request.
     */
    public com.google.api.ads.adwords.axis.v201605.cm.CampaignCriterionPage get(com.google.api.ads.adwords.axis.v201605.cm.Selector serviceSelector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201605.cm.ApiException;

    /**
     * Adds, removes or updates campaign criteria.
     *         
     *         
     * @param operations The operations to apply.
     *         
     * @return The added campaign criteria (without any optional parts).
     *         
     * @throws ApiException when there is at least one error with the request.
     */
    public com.google.api.ads.adwords.axis.v201605.cm.CampaignCriterionReturnValue mutate(com.google.api.ads.adwords.axis.v201605.cm.CampaignCriterionOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201605.cm.ApiException;

    /**
     * Returns the list of campaign criteria that match the query.
     * 
     *         
     * @param query The SQL-like AWQL query string.
     *         
     * @return A list of campaign criteria.
     *         
     * @throws ApiException if problems occur while parsing the query or
     * fetching campaign criteria.
     */
    public com.google.api.ads.adwords.axis.v201605.cm.CampaignCriterionPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201605.cm.ApiException;
}
