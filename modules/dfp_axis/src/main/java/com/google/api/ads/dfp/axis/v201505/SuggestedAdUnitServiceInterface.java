/**
 * SuggestedAdUnitServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201505;

public interface SuggestedAdUnitServiceInterface extends java.rmi.Remote {

    /**
     * Gets a {@link SuggestedAdUnitPage} of {@link SuggestedAdUnit}
     * objects that
     *         satisfy the filter query.  There is a system-enforced limit
     * of 1000 on the number of suggested
     *         ad units that are suggested at any one time.
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link SuggestedAdUnit#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code numRequests}</td>
     *         <td>{@link SuggestedAdUnit#numRequests}</td>
     *         </tr>
     *         </table>
     *         
     *         <p><strong>Note:</strong> After API version 201311, the {@code
     * id} field will only be
     *         numerical.
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of suggested ad units
     *         
     * @return the suggested ad units that match the given filter
     */
    public com.google.api.ads.dfp.axis.v201505.SuggestedAdUnitPage getSuggestedAdUnitsByStatement(com.google.api.ads.dfp.axis.v201505.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201505.ApiException;

    /**
     * Performs actions on {@link SuggestedAdUnit} objects that match
     * the given
     *         {@link Statement#query}.  The following fields are supported
     * for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link SuggestedAdUnit#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code numRequests}</td>
     *         <td>{@link SuggestedAdUnit#numRequests}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param suggestedAdUnitAction the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of suggested ad units
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.dfp.axis.v201505.SuggestedAdUnitUpdateResult performSuggestedAdUnitAction(com.google.api.ads.dfp.axis.v201505.SuggestedAdUnitAction suggestedAdUnitAction, com.google.api.ads.dfp.axis.v201505.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201505.ApiException;
}
