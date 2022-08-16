// Copyright 2022 Google LLC
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
 * StreamActivityMonitorServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202208;

public interface StreamActivityMonitorServiceInterface extends java.rmi.Remote {

    /**
     * Returns the logging information for a DAI session. A DAI session
     * can be identified by it's
     *         session id or debug key. The session ID must be registered
     * via the {@code
     *         registerSessionsForMonitoring} method before it can be accessed.
     * There may be some delay before
     *         the session is available.
     *         
     *         <p>The number of sessions requested is limited to 25. The
     * following fields are supported for
     *         filtering:
     *         
     *         <table>
     *         <tbody>
     *         <tr>
     *         <th>Entity property</th>
     *         <th>PQL filter</th>
     *         </tr>
     *         <tr>
     *         <td>
     *         Session id
     *         </td>
     *         <td>
     *         'sessionId'
     *         </td>
     *         </tr>
     *         <tr>
     *         <td>
     *         Debug key
     *         </td>
     *         <td>
     *         'debugKey"
     *         </td>
     *         </tr>
     *         </tbody>
     *         </table>
     *         
     *         
     * @param statement PQL specifying the sessionId or debugKey to fetch
     * logging information for.
     *         Only '=' and 'IN' expressions are supported.
     *         
     * @throws ApiException if there is an error while fetching the logging
     * information or if there is
     *         no SAM session is associated with any of the {@code sessionIds}.
     */
    public com.google.api.ads.admanager.axis.v202208.SamSession[] getSamSessionsByStatement(com.google.api.ads.admanager.axis.v202208.Statement statement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202208.ApiException;

    /**
     * Registers the specified list of {@code sessionIds} for monitoring.
     * Once the session IDs have
     *         been registered, all logged information about the sessions
     * will be persisted and can be viewed
     *         via the Ad Manager UI.
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
    public java.lang.String[] registerSessionsForMonitoring(java.lang.String[] sessionIds) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202208.ApiException;
}
