/**
 * CreativeTemplateServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201311;

public interface CreativeTemplateServiceInterface extends java.rmi.Remote {

    /**
     * Returns the {@link CreativeTemplate} uniquely identified by
     * the given ID.
     *         
     *         
     * @param creativeTemplateId the ID of the creative template, which must
     * already exist
     *         
     * @return the {@code CreativeTemplate} uniquely identified by the given
     * ID
     */
    public com.google.api.ads.dfp.axis.v201311.CreativeTemplate getCreativeTemplate(java.lang.Long creativeTemplateId) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201311.ApiException;

    /**
     * Gets a {@link CreativeTemplatePage} of {@link CreativeTemplate}
     * objects that satisfy the
     *         given {@link Statement#query}.  The following fields are supported
     * for
     *         filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link CreativeTemplate#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link CreativeTemplate#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code type}</td>
     *         <td>{@link CreativeTemplate#type}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link CreativeTemplate#status}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of creative templates.
     *         
     * @return the creative templates that match the given filter
     */
    public com.google.api.ads.dfp.axis.v201311.CreativeTemplatePage getCreativeTemplatesByStatement(com.google.api.ads.dfp.axis.v201311.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201311.ApiException;
}
