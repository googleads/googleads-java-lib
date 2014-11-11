/**
 * CreativeServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201411;

public interface CreativeServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link Creative} objects.
     *         
     *         
     * @param creatives the creatives to create
     *         
     * @return the created creatives with their IDs filled in
     */
    public com.google.api.ads.dfp.axis.v201411.Creative[] createCreatives(com.google.api.ads.dfp.axis.v201411.Creative[] creatives) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201411.ApiException;

    /**
     * Gets a {@link CreativePage} of {@link Creative} objects that
     * satisfy the
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
     *         <td>{@link Creative#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Creative#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code advertiserId}</td>
     *         <td>{@link Creative#advertiserId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code width}</td>
     *         <td>{@link Creative#size}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code height}</td>
     *         <td>{@link Creative#size}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link Creative#lastModifiedDateTime}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of creatives
     *         
     * @return the creatives that match the given filter
     */
    public com.google.api.ads.dfp.axis.v201411.CreativePage getCreativesByStatement(com.google.api.ads.dfp.axis.v201411.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201411.ApiException;

    /**
     * Updates the specified {@link Creative} objects.
     *         
     *         
     * @param creatives the creatives to update
     *         
     * @return the updated creatives
     */
    public com.google.api.ads.dfp.axis.v201411.Creative[] updateCreatives(com.google.api.ads.dfp.axis.v201411.Creative[] creatives) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201411.ApiException;
}
