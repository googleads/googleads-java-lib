/**
 * VideoServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.video;

public interface VideoServiceInterface extends java.rmi.Remote {

    /**
     * Returns the list of videos that have been used in ads by the
     * current
     *         customer, the match the filters given by the selector.
     *         
     *         
     * @param selector Determines which videos to return.
     *         
     * @return A list of videos.
     *         
     * @throws ApiException if problems occurred while fetching videos.
     */
    public com.google.api.ads.adwords.axis.v201406.video.VideoPage get(com.google.api.ads.adwords.axis.v201406.video.VideoSelector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201406.cm.ApiException;

    /**
     * Updates existing call-to-action overlays.
     */
    public com.google.api.ads.adwords.axis.v201406.video.VideoReturnValue mutateCallToAction(com.google.api.ads.adwords.axis.v201406.video.VideoCallToActionOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201406.cm.ApiException;

    /**
     * Searches YouTube for videos that match the given query.
     *         
     *         
     * @param selector Determines which videos to search for.
     *         
     * @return A list of videos.
     *         
     * @throws ApiException if problems occurred while searching for videos.
     */
    public com.google.api.ads.adwords.axis.v201406.video.VideoSearchPage search(com.google.api.ads.adwords.axis.v201406.video.VideoSearchSelector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201406.cm.ApiException;
}
