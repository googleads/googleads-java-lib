/**
 * VideoTargetingGroupCriterionServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.video;

public interface VideoTargetingGroupCriterionServiceInterface extends java.rmi.Remote {

    /**
     * Returns the list of targeting group criteria that meet the
     * selector criteria.
     *         
     *         
     * @param selector Determines which targeting group criterions to return.
     * If empty, all targeting groups are returned.
     *         
     * @return A list of targeting group criteria.
     *         
     * @throws ApiException if problems occurred while fetching targeting
     * group information.
     */
    public com.google.api.ads.adwords.axis.v201402.video.TargetingGroupCriterionPage get(com.google.api.ads.adwords.axis.v201402.video.TargetingGroupCriterionSelector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201402.cm.ApiException;

    /**
     * Adds, updates, or deletes targeting group criteria.
     *         Note: TargetingGroupCriterionOperation does not support the
     * REMOVE operator. To
     *         delete a targeting group, set its status to DELETED.
     *         
     * @param operations A list of unique operations.
     *         
     * @return The list of updated targeting group criteria, returned in
     * the same order as the
     *         operations array.
     *         
     * @throws ApiException if problems occurred while updating targeting
     * group criteria.
     */
    public com.google.api.ads.adwords.axis.v201402.video.TargetingGroupCriterionReturnValue mutate(com.google.api.ads.adwords.axis.v201402.video.TargetingGroupCriterionOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201402.cm.ApiException;
}
