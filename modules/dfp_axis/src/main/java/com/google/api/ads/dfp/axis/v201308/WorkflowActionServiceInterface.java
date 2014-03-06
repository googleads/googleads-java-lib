/**
 * WorkflowActionServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201308;

public interface WorkflowActionServiceInterface extends java.rmi.Remote {

    /**
     * Returns the {@link WorkflowAction} uniquely identified by the
     * given ID.
     *         
     *         
     * @param workflowActionId the ID of the workflow action, which must
     * already exist
     *         
     * @return the {@code WorkflowAction} uniquely identified by the given
     * ID.
     */
    public com.google.api.ads.dfp.axis.v201308.WorkflowAction getWorkflowAction(java.lang.Long workflowActionId) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201308.ApiException;

    /**
     * Gets a {@link WorkflowActionPage} of {@link WorkflowAction}
     * objects that satisfy the given
     *         {@link Statement#query}. The following fields are supported
     * for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th>
     *         <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>id</td>
     *         <td>{@link WorkflowAction#id}</td>
     *         </tr>
     *         <tr>
     *         <td>name</td>
     *         <td>{@link WorkflowAction#name}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter a set of workflow
     *         actions
     *         
     * @return the {@link WorkflowAction workflow actions} that match the
     * given filter
     */
    public com.google.api.ads.dfp.axis.v201308.WorkflowActionPage getWorkflowActionsByStatement(com.google.api.ads.dfp.axis.v201308.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201308.ApiException;
}
