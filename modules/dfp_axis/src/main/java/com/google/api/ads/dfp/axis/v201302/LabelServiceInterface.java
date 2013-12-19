/**
 * LabelServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201302;

public interface LabelServiceInterface extends java.rmi.Remote {

    /**
     * Creates a new {@link Label}.
     *         
     *         The following fields are required:
     *         <ul>
     *         <li>{@link Label#name}</li>
     *         <li>{@link Label#type}</li>
     *         </ul>
     *         
     *         
     * @param label the label to create
     *         
     * @return the label with its ID filled in
     */
    public com.google.api.ads.dfp.axis.v201302.Label createLabel(com.google.api.ads.dfp.axis.v201302.Label label) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201302.ApiException;

    /**
     * Creates new {@link Label} objects.
     *         
     *         
     * @param labels the labels to create
     *         
     * @return the created labels with their IDs filled in
     */
    public com.google.api.ads.dfp.axis.v201302.Label[] createLabels(com.google.api.ads.dfp.axis.v201302.Label[] labels) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201302.ApiException;

    /**
     * Returns the {@link Label} uniquely identified by the given
     * ID.
     *         
     *         
     * @param labelId the ID of the label, which must already exist
     *         
     * @return the {@code Label} uniquely identified by the given ID
     */
    public com.google.api.ads.dfp.axis.v201302.Label getLabel(java.lang.Long labelId) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201302.ApiException;

    /**
     * Gets a {@link LabelPage} of {@link Label} objects that satisfy
     * the
     *         given {@link Statement#query}. The following fields are supported
     * for
     *         filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Label#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code type}</td>
     *         <td>{@link Label#type}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Label#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code description}</td>
     *         <td>{@link Label#description}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code isActive}</td>
     *         <td>{@link Label#isActive}</td>
     *         </tr>
     *         </table>
     *         
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of labels.
     *         
     * @return the labels that match the given filter
     */
    public com.google.api.ads.dfp.axis.v201302.LabelPage getLabelsByStatement(com.google.api.ads.dfp.axis.v201302.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201302.ApiException;

    /**
     * Performs actions on {@link Label} objects that match the given
     * {@link Statement#query}.
     *         
     *         
     * @param labelAction the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of labels
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.dfp.axis.v201302.UpdateResult performLabelAction(com.google.api.ads.dfp.axis.v201302.LabelAction labelAction, com.google.api.ads.dfp.axis.v201302.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201302.ApiException;

    /**
     * Updates the specified {@link Label}.
     *         
     *         
     * @param label the label to update
     *         
     * @return the updated label
     */
    public com.google.api.ads.dfp.axis.v201302.Label updateLabel(com.google.api.ads.dfp.axis.v201302.Label label) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201302.ApiException;

    /**
     * Updates the specified {@link Label} objects.
     *         
     *         
     * @param labels the labels to update
     *         
     * @return the updated labels
     */
    public com.google.api.ads.dfp.axis.v201302.Label[] updateLabels(com.google.api.ads.dfp.axis.v201302.Label[] labels) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201302.ApiException;
}
