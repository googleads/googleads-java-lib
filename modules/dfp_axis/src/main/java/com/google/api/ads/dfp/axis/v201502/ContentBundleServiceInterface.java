/**
 * ContentBundleServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201502;

public interface ContentBundleServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link ContentBundle} objects.
     *         
     *         
     * @param contentBundles the content bundles to create
     *         
     * @return the created content bundles with their IDs filled in
     */
    public com.google.api.ads.dfp.axis.v201502.ContentBundle[] createContentBundles(com.google.api.ads.dfp.axis.v201502.ContentBundle[] contentBundles) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201502.ApiException;

    /**
     * Gets a {@link ContentBundlePage} of {@link ContentBundle} objects
     * that satisfy the
     *         given {@link Statement#query}. The following fields are supported
     * for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link ContentBundle#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link ContentBundle#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link ContentBundle#status}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of content bundles
     *         
     * @return the content bundles that match the given filter
     */
    public com.google.api.ads.dfp.axis.v201502.ContentBundlePage getContentBundlesByStatement(com.google.api.ads.dfp.axis.v201502.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201502.ApiException;

    /**
     * Performs actions on {@link ContentBundle} objects that match
     * the given
     *         {@link Statement#query}.
     *         
     *         
     * @param contentBundleAction the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of content bundles
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.dfp.axis.v201502.UpdateResult performContentBundleAction(com.google.api.ads.dfp.axis.v201502.ContentBundleAction contentBundleAction, com.google.api.ads.dfp.axis.v201502.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201502.ApiException;

    /**
     * Updates the specified {@link ContentBundle} objects.
     *         
     *         
     * @param contentBundles the content bundles to update
     *         
     * @return the updated content bundles
     */
    public com.google.api.ads.dfp.axis.v201502.ContentBundle[] updateContentBundles(com.google.api.ads.dfp.axis.v201502.ContentBundle[] contentBundles) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201502.ApiException;
}
