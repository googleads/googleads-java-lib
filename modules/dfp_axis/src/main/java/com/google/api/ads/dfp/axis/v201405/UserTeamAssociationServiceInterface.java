/**
 * UserTeamAssociationServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201405;

public interface UserTeamAssociationServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link UserTeamAssociation} objects.
     *         
     *         
     * @param userTeamAssociations the user team associations to create
     *         
     * @return the created user team associations with their IDs filled in
     */
    public com.google.api.ads.dfp.axis.v201405.UserTeamAssociation[] createUserTeamAssociations(com.google.api.ads.dfp.axis.v201405.UserTeamAssociation[] userTeamAssociations) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201405.ApiException;

    /**
     * Gets a {@link UserTeamAssociationPage} of {@link UserTeamAssociation}
     * objects that satisfy the given {@link Statement#query}. The following
     * fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code userId}</td>
     *         <td>{@link UserTeamAssociation#userId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code teamId}</td>
     *         <td>{@link UserTeamAssociation#teamId}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of user team associations
     *         
     * @return the user team associations that match the given filter
     */
    public com.google.api.ads.dfp.axis.v201405.UserTeamAssociationPage getUserTeamAssociationsByStatement(com.google.api.ads.dfp.axis.v201405.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201405.ApiException;

    /**
     * Performs actions on {@link UserTeamAssociation} objects that
     * match the
     *         given {@link Statement#query}.
     *         
     *         
     * @param userTeamAssociationAction the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of user team associations
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.dfp.axis.v201405.UpdateResult performUserTeamAssociationAction(com.google.api.ads.dfp.axis.v201405.UserTeamAssociationAction userTeamAssociationAction, com.google.api.ads.dfp.axis.v201405.Statement statement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201405.ApiException;

    /**
     * Updates the specified {@link UserTeamAssociation} objects.
     *         
     *         
     * @param userTeamAssociations the user team associations to update
     *         
     * @return the updated user team associations
     */
    public com.google.api.ads.dfp.axis.v201405.UserTeamAssociation[] updateUserTeamAssociations(com.google.api.ads.dfp.axis.v201405.UserTeamAssociation[] userTeamAssociations) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201405.ApiException;
}
