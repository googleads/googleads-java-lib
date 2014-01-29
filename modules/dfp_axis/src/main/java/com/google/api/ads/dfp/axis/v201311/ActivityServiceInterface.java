/**
 * ActivityServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201311;

public interface ActivityServiceInterface extends java.rmi.Remote {

    /**
     * Creates a new {@link Activity} objects.
     *         
     *         
     * @param activities to be created.
     *         
     * @return the created activities with its IDs filled in.
     */
    public com.google.api.ads.dfp.axis.v201311.Activity[] createActivities(com.google.api.ads.dfp.axis.v201311.Activity[] activities) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201311.ApiException;

    /**
     * Creates a new {@link Activity}.
     *         
     *         
     * @param activity to be created
     *         
     * @return the created activity with its ID filled in.
     */
    public com.google.api.ads.dfp.axis.v201311.Activity createActivity(com.google.api.ads.dfp.axis.v201311.Activity activity) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201311.ApiException;

    /**
     * Gets an {@link ActivityPage} of {@link Activity} objects that
     * satisfy the given
     *         {@link Statement#query}. The following fields are supported
     * for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Activity#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Activity#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code expectedURL}</td>
     *         <td>{@link Activity#expectedURL}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link Activity#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code activityGroupId}</td>
     *         <td>{@link Activity#activityGroupId}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param filterStatement a statement used to filter a set of activities.
     * 
     * @return the activities that match the given filter.
     */
    public com.google.api.ads.dfp.axis.v201311.ActivityPage getActivitiesByStatement(com.google.api.ads.dfp.axis.v201311.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201311.ApiException;

    /**
     * Returns the {@link Activity} uniquely identified by the given
     * ID.
     *         
     *         
     * @param activityId the ID of the activity, which must already exist
     * 
     * @return the {@code Activity} uniquely identified by the given ID
     */
    public com.google.api.ads.dfp.axis.v201311.Activity getActivity(java.lang.Integer activityId) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201311.ApiException;

    /**
     * Updates the specified {@link Activity} objects.
     *         
     *         
     * @param activities to be updated.
     *         
     * @return the updated activities.
     */
    public com.google.api.ads.dfp.axis.v201311.Activity[] updateActivities(com.google.api.ads.dfp.axis.v201311.Activity[] activities) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201311.ApiException;

    /**
     * Updates the specified {@link Activity}.
     *         
     *         
     * @param activity to be updated.
     *         
     * @return the updated activity.
     */
    public com.google.api.ads.dfp.axis.v201311.Activity updateActivity(com.google.api.ads.dfp.axis.v201311.Activity activity) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201311.ApiException;
}
