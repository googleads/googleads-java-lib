/**
 * VideoTargetingGroupServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.video;

public interface VideoTargetingGroupServiceInterface extends java.rmi.Remote {

    /**
     * Returns the list of targeting groups that meet the selector
     * criteria.
     *         
     *         
     * @param selector Determines which targeting groups to return.
     *         If empty, all targeting groups are returned.
     *         
     * @return The list of targeting groups that satisfy the selector.
     *         
     * @throws ApiException if problems occurred while fetching targeting
     * group information.
     */
    public com.google.api.ads.adwords.axis.v201406.video.TargetingGroupPage get(com.google.api.ads.adwords.axis.v201406.video.TargetingGroupSelector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201406.cm.ApiException;

    /**
     * Applies the given list of operations, i.e. Add or Set.
     *         ADD - Creates the given TargetingGroup. Each TargetingGroup
     * must reference the campaignId of
     *         an existing campaign.
     *         SET - Updates the given TargetingGroup.
     *         <p>
     *         Note: TargetingGroupOperation does not support the REMOVE
     * operator. To
     *         remove a targeting group, set its status to REMOVED.
     *         
     * @param operations A list of unique operations.
     *         The same targeting group name cannot be specified in more
     * than one operation.
     *         
     * @return The list of updated targeting groups, returned in the same
     * order as the
     *         operations list.
     *         
     * @throws ApiException if problems occurred while updating targeting
     * group information.
     */
    public com.google.api.ads.adwords.axis.v201406.video.TargetingGroupReturnValue mutate(com.google.api.ads.adwords.axis.v201406.video.TargetingGroupOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201406.cm.ApiException;
}
