/**
 * VideoAdServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.video;

public interface VideoAdServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of VideoAds that satisfy the filters of the
     * given selector.
     *         
     *         
     * @param selector Selector specifying filters for the desired ads.
     *         
     * @return The list of VideoAds that satisfy the selector.
     */
    public com.google.api.ads.adwords.axis.v201402.video.VideoAdPage get(com.google.api.ads.adwords.axis.v201402.video.VideoAdSelector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201402.cm.ApiException;

    /**
     * Applies the given list operations, i.e. Add or Set.
     *         ADD - Creates the given VideoAds.  Each VideoAd must reference
     * the campaignId of
     *         an existing campaign.  Associations with one or more TargetingGroups
     * must be
     *         specified before the ad can serve, but these can be optionally
     * omitted and applied later.
     *         SET - Updates the VideoAds. Attributes of VideoAds are immutable,
     * only statuses
     *         and TargetingGroupAssocations can be modified.
     *         
     *         
     * @param operations The operations to apply.
     *         
     * @return The VideoAds as they appear after the operations have been
     * applied.
     */
    public com.google.api.ads.adwords.axis.v201402.video.VideoAdReturnValue mutate(com.google.api.ads.adwords.axis.v201402.video.VideoAdOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201402.cm.ApiException;
}
