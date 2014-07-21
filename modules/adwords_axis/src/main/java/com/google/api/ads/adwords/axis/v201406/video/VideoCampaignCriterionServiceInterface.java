/**
 * VideoCampaignCriterionServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.video;

public interface VideoCampaignCriterionServiceInterface extends java.rmi.Remote {

    /**
     * Returns the list of campaign criteria that meet the selector
     * criteria.
     *         
     *         
     * @param selector Determines which campaign criteria to return.
     *         
     * @return A list of campaign criteria.
     *         
     * @throws ApiException if problems occurred while fetching data.
     */
    public com.google.api.ads.adwords.axis.v201406.video.VideoCampaignCriterionPage get(com.google.api.ads.adwords.axis.v201406.video.VideoCampaignCriterionSelector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201406.cm.ApiException;

    /**
     * Adds or removes campaign level criteria.
     *         NOTE: CampaignCriterionOperation does not support the SET/UPDATE
     * operator.
     *         
     *         
     * @param operations A list of unique operations.
     *         
     * @return List of updated campaign criteria, in the same order as mutated.
     * 
     * @throws ApiException if problems occurred while updating targeting
     * group criteria.
     */
    public com.google.api.ads.adwords.axis.v201406.video.VideoCampaignCriterionReturnValue mutate(com.google.api.ads.adwords.axis.v201406.video.VideoCampaignCriterionOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201406.cm.ApiException;
}
