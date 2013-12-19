/**
 * UserTeamAssociationServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201308;

public interface UserTeamAssociationServiceInterface extends java.rmi.Remote {

    /**
     * Creates a new {@code UserTeamAssociation}.
     *         
     *         The following fields are required:
     *         <ul>
     *         <li>{@link UserTeamAssociation#teamId}</li>
     *         <li>{@link UserTeamAssociation#userId}</li>
     *         </ul>
     *         
     *         
     * @param userTeamAssociation the user team association to create
     *         
     * @return the user team association with its ID filled in
     */
    public com.google.api.ads.dfp.axis.v201308.UserTeamAssociation createUserTeamAssociation(com.google.api.ads.dfp.axis.v201308.UserTeamAssociation userTeamAssociation) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201308.ApiException;

    /**
     * Creates new {@link UserTeamAssociation} objects.
     *         
     *         
     * @param userTeamAssociations the user team associations to create
     *         
     * @return the created user team associations with their IDs filled in
     */
    public com.google.api.ads.dfp.axis.v201308.UserTeamAssociation[] createUserTeamAssociations(com.google.api.ads.dfp.axis.v201308.UserTeamAssociation[] userTeamAssociations) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201308.ApiException;

    /**
     * Returns the {@link UserTeamAssociation} uniquely identified
     * by the given
     *         user and team IDs.
     *         
     *         
     * @param teamId the ID of the team, which must already exist
     *         
     * @param userId the ID of the user, which must already exist
     *         
     * @return the {@code UserTeamAssociation} uniquely identified by the
     * user and team IDs
     */
    public com.google.api.ads.dfp.axis.v201308.UserTeamAssociation getUserTeamAssociation(java.lang.Long teamId, java.lang.Long userId) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201308.ApiException;

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
    public com.google.api.ads.dfp.axis.v201308.UserTeamAssociationPage getUserTeamAssociationsByStatement(com.google.api.ads.dfp.axis.v201308.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201308.ApiException;

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
    public com.google.api.ads.dfp.axis.v201308.UpdateResult performUserTeamAssociationAction(com.google.api.ads.dfp.axis.v201308.UserTeamAssociationAction userTeamAssociationAction, com.google.api.ads.dfp.axis.v201308.Statement statement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201308.ApiException;

    /**
     * Updates the specified {@link UserTeamAssociation}.
     *         
     *         
     * @param userTeamAssociation the user team association to update
     *         
     * @return the updated user team association
     */
    public com.google.api.ads.dfp.axis.v201308.UserTeamAssociation updateUserTeamAssociation(com.google.api.ads.dfp.axis.v201308.UserTeamAssociation userTeamAssociation) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201308.ApiException;

    /**
     * Updates the specified {@link UserTeamAssociation} objects.
     *         
     *         
     * @param userTeamAssociations the user team associations to update
     *         
     * @return the updated user team associations
     */
    public com.google.api.ads.dfp.axis.v201308.UserTeamAssociation[] updateUserTeamAssociations(com.google.api.ads.dfp.axis.v201308.UserTeamAssociation[] userTeamAssociations) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201308.ApiException;
}
