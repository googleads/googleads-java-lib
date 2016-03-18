/**
 * ActivityGroupServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201602;

public interface ActivityGroupServiceInterface extends java.rmi.Remote {

    /**
     * Creates a new {@link ActivityGroup} objects.
     *         
     *         
     * @param activityGroups the activity groups to be created.
     *         
     * @return the created activity groups with their IDs filled in.
     */
    public com.google.api.ads.dfp.axis.v201602.ActivityGroup[] createActivityGroups(com.google.api.ads.dfp.axis.v201602.ActivityGroup[] activityGroups) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201602.ApiException;

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
    public com.google.api.ads.dfp.axis.v201602.ActivityGroupPage getActivityGroupsByStatement(com.google.api.ads.dfp.axis.v201602.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201602.ApiException;

    /**
     * Updates the specified {@link ActivityGroup} objects.
     *         
     *         
     * @param activityGroups the activity groups to update.
     *         
     * @return the updated activity groups.
     */
    public com.google.api.ads.dfp.axis.v201602.ActivityGroup[] updateActivityGroups(com.google.api.ads.dfp.axis.v201602.ActivityGroup[] activityGroups) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201602.ApiException;
}
