/**
 * VideoCampaignServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.video;

public interface VideoCampaignServiceInterface extends java.rmi.Remote {

    /**
     * Returns the list of campaigns that meet the selector criteria.
     * 
     *         
     * @param selector Determines which campaigns to return.
     *         If empty, all campaigns are returned.
     *         
     * @return A list of campaigns.
     *         
     * @throws ApiException if problems occurred while fetching campaign
     * information.
     */
    public com.google.api.ads.adwords.axis.v201402.video.VideoCampaignPage get(com.google.api.ads.adwords.axis.v201402.video.VideoCampaignSelector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201402.cm.ApiException;

    /**
     * Adds, updates, or deletes video campaigns.
     *         Note: VideoCampaignOperation does not support the REMOVE operator.
     * To
     *         delete a campaign, set its status to DELETED.
     *         
     * @param operations A list of unique operations.
     *         The same campaign cannot be specified in more than one operation.
     * 
     * @return The list of updated campaigns, returned in the same order
     * as the
     *         operations array.
     *         
     * @throws ApiException if problems occurred while updating campaign
     * information.
     */
    public com.google.api.ads.adwords.axis.v201402.video.VideoCampaignReturnValue mutate(com.google.api.ads.adwords.axis.v201402.video.VideoCampaignOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201402.cm.ApiException;
}
