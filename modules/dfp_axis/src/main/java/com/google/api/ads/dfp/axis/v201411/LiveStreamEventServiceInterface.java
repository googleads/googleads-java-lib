/**
 * LiveStreamEventServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201411;

public interface LiveStreamEventServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link LiveStreamEvent} objects.
     *         
     *         The following fields are required:
     *         <ul>
     *         <li>{@link LiveStreamEvent#name}</li>
     *         <li>{@link LiveStreamEvent#startDateTime}</li>
     *         <li>{@link LiveStreamEvent#endDateTime}</li>
     *         <li>{@link LiveStreamEvent#contentUrls}</li>
     *         <li>{@link LiveStreamEvent#adTags}</li>
     *         </ul>
     *         
     *         
     * @param liveStreamEvents the live stream events to create
     *         
     * @return the created live stream events with their IDs filled in
     */
    public com.google.api.ads.dfp.axis.v201411.LiveStreamEvent[] createLiveStreamEvents(com.google.api.ads.dfp.axis.v201411.LiveStreamEvent[] liveStreamEvents) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201411.ApiException;

    /**
     * Gets a {@link LiveStreamEventPage} of {@link LiveStreamEvent}
     * objects that
     *         satisfy the given {@link Statement#query}. The following fields
     * are
     *         supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link LiveStreamEvent#id}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement to filter
     * a
     *         list of live stream events
     *         
     * @return the live stream events that match the filter
     */
    public com.google.api.ads.dfp.axis.v201411.LiveStreamEventPage getLiveStreamEventsByStatement(com.google.api.ads.dfp.axis.v201411.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201411.ApiException;

    /**
     * Performs actions on {@link LiveStreamEvent} objects that match
     * the given
     *         {@link Statement#query}.
     *         
     *         
     * @param liveStreamEventAction the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of live stream events
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.dfp.axis.v201411.UpdateResult performLiveStreamEventAction(com.google.api.ads.dfp.axis.v201411.LiveStreamEventAction liveStreamEventAction, com.google.api.ads.dfp.axis.v201411.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201411.ApiException;

    /**
     * Updates the specified {@link LiveStreamEvent} objects.
     *         
     *         
     * @param liveStreamEvents the live stream events to update
     *         
     * @return the updated live stream events
     *         
     * @throws ApiException if there is an error updating the live stream
     * events
     */
    public com.google.api.ads.dfp.axis.v201411.LiveStreamEvent[] updateLiveStreamEvents(com.google.api.ads.dfp.axis.v201411.LiveStreamEvent[] liveStreamEvents) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201411.ApiException;
}
