/**
 * SharedAdUnitServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201505;

public interface SharedAdUnitServiceInterface extends java.rmi.Remote {

    /**
     * Gets a {@link SharedAdUnitPage} of {@link SharedAdUnit} objects
     * that satisfy the given
     *         {@link Statement#query}. The following fields are supported
     * for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link SharedAdUnit#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link SharedAdUnit#name}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of shared ad units
     *         
     * @return the shared ad units that match the given filter
     */
    public com.google.api.ads.dfp.axis.v201505.SharedAdUnitPage getSharedAdUnitsByStatement(com.google.api.ads.dfp.axis.v201505.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201505.ApiException;

    /**
     * Performs actions on shared ad unit objects that match the given
     * {@link Statement#query}.
     *         
     *         
     * @param sharedAdUnitAction the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of shared ad units
     *         
     * @return the result of the update action, which contains the number
     * of shared ad units
     *         on which the action was performed.
     */
    public com.google.api.ads.dfp.axis.v201505.UpdateResult performSharedAdUnitAction(com.google.api.ads.dfp.axis.v201505.SharedAdUnitAction sharedAdUnitAction, com.google.api.ads.dfp.axis.v201505.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201505.ApiException;
}
