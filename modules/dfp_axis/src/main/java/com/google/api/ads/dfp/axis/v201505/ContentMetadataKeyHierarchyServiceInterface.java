/**
 * ContentMetadataKeyHierarchyServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201505;

public interface ContentMetadataKeyHierarchyServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link ContentMetadataKeyHierarchy} objects.
     *         
     *         The following fields are required:
     *         <ul>
     *         <li>{@link ContentMetadataKeyHierarchy#id}</li>
     *         <li>{@link ContentMetadataKeyHierarchy#name}</li>
     *         <li>{@link ContentMetadataKeyHierarchy#hierarchyLevels}</li>
     * </ul>
     *         
     *         
     * @param contentMetadataKeyHierarchies the hierarchies to create
     *         
     * @return the created hierarchies with their IDs filled in
     */
    public com.google.api.ads.dfp.axis.v201505.ContentMetadataKeyHierarchy[] createContentMetadataKeyHierarchies(com.google.api.ads.dfp.axis.v201505.ContentMetadataKeyHierarchy[] contentMetadataKeyHierarchies) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201505.ApiException;

    /**
     * Gets a {@link ContentMetadataKeyHierarchyPage} of {@link ContentMetadataKeyHierarchy}
     * objects that satisfy the given {@link Statement#query}. The following
     * fields are supported
     *         for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link ContentMetadataKeyHierarchy#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link ContentMetadataKeyHierarchy#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link ContentMetadataKeyHierarchy#status}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter a set of
     *         content metadata key hierarchies
     *         
     * @return the content metadata key hierarchies that match the given
     * filter
     *         
     * @throws ApiException if the ID of the active network does not exist
     * or there is a
     *         backend error
     */
    public com.google.api.ads.dfp.axis.v201505.ContentMetadataKeyHierarchyPage getContentMetadataKeyHierarchiesByStatement(com.google.api.ads.dfp.axis.v201505.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201505.ApiException;

    /**
     * Performs actions on {@link ContentMetadataKeyHierarchy} objects
     * that match the given
     *         {@link Statement#query}.
     *         
     *         
     * @param contentMetadataKeyHierarchyAction the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of hierarchies
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.dfp.axis.v201505.UpdateResult performContentMetadataKeyHierarchyAction(com.google.api.ads.dfp.axis.v201505.ContentMetadataKeyHierarchyAction contentMetadataKeyHierarchyAction, com.google.api.ads.dfp.axis.v201505.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201505.ApiException;

    /**
     * Updates the specified {@link ContentMetadataKeyHierarchy} objects.
     * 
     *         
     * @param contentMetadataKeyHierarchies the hierarchies to update
     *         
     * @return the updated hierarchies
     *         
     * @throws ApiException if there is an error updating the one of the
     * hierarchies
     */
    public com.google.api.ads.dfp.axis.v201505.ContentMetadataKeyHierarchy[] updateContentMetadataKeyHierarchies(com.google.api.ads.dfp.axis.v201505.ContentMetadataKeyHierarchy[] contentMetadataKeyHierarchies) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201505.ApiException;
}
