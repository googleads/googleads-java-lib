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
 * ActivityGroupServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public interface ActivityGroupServiceInterface extends java.rmi.Remote {

    /**
     * Creates a new {@link ActivityGroup} objects.
     *         
     *         
     * @param activityGroups the activity groups to be created.
     *         
     * @return the created activity groups with their IDs filled in.
     */
    public com.google.api.ads.dfp.axis.v201802.ActivityGroup[] createActivityGroups(com.google.api.ads.dfp.axis.v201802.ActivityGroup[] activityGroups) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Gets an {@link ActivityGroupPage} of {@link ActivityGroup}
     * objects that satisfy the given
     *         {@link Statement#query}. The following fields are supported
     * for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link ActivityGroup#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link ActivityGroup#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code impressionsLookback}</td>
     *         <td>{@link ActivityGroup#impressionsLookback}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code clicksLookback}</td>
     *         <td>{@link ActivityGroup#clicksLookback}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link ActivityGroup#status}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param filterStatement a statement used to filter a set of activity
     * groups
     *         
     * @return the activity groups that match the given filter
     */
    public com.google.api.ads.dfp.axis.v201802.ActivityGroupPage getActivityGroupsByStatement(com.google.api.ads.dfp.axis.v201802.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Updates the specified {@link ActivityGroup} objects.
     *         
     *         
     * @param activityGroups the activity groups to update.
     *         
     * @return the updated activity groups.
     */
    public com.google.api.ads.dfp.axis.v201802.ActivityGroup[] updateActivityGroups(com.google.api.ads.dfp.axis.v201802.ActivityGroup[] activityGroups) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;
}
