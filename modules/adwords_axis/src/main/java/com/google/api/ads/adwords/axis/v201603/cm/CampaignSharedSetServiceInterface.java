/**
 * CampaignSharedSetServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201603.cm;

public interface CampaignSharedSetServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of CampaignSharedSets based on the given selector.
     * 
     * @param selector the selector specifying the query
     *         
     * @return a list of CampaignSharedSet entities that meet the criterion
     * specified
     *         by the selector
     *         
     * @throws ApiException
     */
    public com.google.api.ads.adwords.axis.v201603.cm.CampaignSharedSetPage get(com.google.api.ads.adwords.axis.v201603.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201603.cm.ApiException;

    /**
     * Applies the list of mutate operations.
     *         
     * @param operations the operations to apply
     *         
     * @return the modified list of CampaignSharedSet associations
     *         
     * @throws ApiException
     */
    public com.google.api.ads.adwords.axis.v201603.cm.CampaignSharedSetReturnValue mutate(com.google.api.ads.adwords.axis.v201603.cm.CampaignSharedSetOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201603.cm.ApiException;

    /**
     * Returns the list of CampaignSharedSets that match the query.
     * 
     *         
     * @param query The SQL-like AWQL query string
     *         
     * @returns A list of CampaignSharedSets
     *         
     * @throws ApiException when the query is invalid or there are errors
     * processing the request.
     */
    public com.google.api.ads.adwords.axis.v201603.cm.CampaignSharedSetPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201603.cm.ApiException;
}
