// Copyright 2018 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * LiveStreamEventServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

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
    public com.google.api.ads.dfp.axis.v201802.LiveStreamEvent[] createLiveStreamEvents(com.google.api.ads.dfp.axis.v201802.LiveStreamEvent[] liveStreamEvents) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

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
    public com.google.api.ads.dfp.axis.v201802.LiveStreamEventPage getLiveStreamEventsByStatement(com.google.api.ads.dfp.axis.v201802.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

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
    public com.google.api.ads.dfp.axis.v201802.UpdateResult performLiveStreamEventAction(com.google.api.ads.dfp.axis.v201802.LiveStreamEventAction liveStreamEventAction, com.google.api.ads.dfp.axis.v201802.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Registers the specified list of {@code sessionIds} for monitoring.
     * Once the session IDs have
     *         been registered, all logged information about the sessions
     * will be persisted and can be viewed
     *         via the DFP UI.
     *         
     *         <p>A session ID is a unique identifier of a single user watching
     * a live stream event.
     *         
     *         
     * @param sessionIds a list of session IDs to register for monitoring
     * 
     * @return the list of session IDs that were registered for monitoring
     * 
     * @throws ApiException if there is an error registering any of the session
     * IDs
     */
    public java.lang.String[] registerSessionsForMonitoring(java.lang.String[] sessionIds) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

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
    public com.google.api.ads.dfp.axis.v201802.LiveStreamEvent[] updateLiveStreamEvents(com.google.api.ads.dfp.axis.v201802.LiveStreamEvent[] liveStreamEvents) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;
}
