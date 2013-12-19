/**
 * ContentMetadataKeyHierarchyServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201311;

public interface ContentMetadataKeyHierarchyServiceInterface extends java.rmi.Remote {

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
    public com.google.api.ads.dfp.axis.v201311.ContentMetadataKeyHierarchyPage getContentMetadataKeyHierarchiesByStatement(com.google.api.ads.dfp.axis.v201311.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201311.ApiException;
}
