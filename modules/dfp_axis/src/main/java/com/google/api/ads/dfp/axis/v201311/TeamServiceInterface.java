/**
 * TeamServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201311;

public interface TeamServiceInterface extends java.rmi.Remote {

    /**
     * Creates a new {@code Team}.
     *         
     *         The following fields are required:
     *         <ul>
     *         <li>{@link Team#name}</li>
     *         </ul>
     *         
     *         
     * @param team the team to create
     *         
     * @return the team with its ID filled in
     */
    public com.google.api.ads.dfp.axis.v201311.Team createTeam(com.google.api.ads.dfp.axis.v201311.Team team) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201311.ApiException;

    /**
     * Creates new {@link Team} objects.
     *         
     *         The following fields are required:
     *         <ul>
     *         <li>{@link Team#name}</li>
     *         </ul>
     *         
     *         
     * @param teams the teams to create
     *         
     * @return the created teams with their IDs filled in
     */
    public com.google.api.ads.dfp.axis.v201311.Team[] createTeams(com.google.api.ads.dfp.axis.v201311.Team[] teams) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201311.ApiException;

    /**
     * Returns the {@code Team} uniquely identified by the given ID.
     * 
     *         
     * @param teamId the ID of the team, which must already exist
     *         
     * @return the {@code Team} uniquely identified by the given ID
     */
    public com.google.api.ads.dfp.axis.v201311.Team getTeam(java.lang.Long teamId) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201311.ApiException;

    /**
     * Gets a {@code TeamPage} of {@code Team} objects that satisfy
     * the
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
     *         <td>{@link Team#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Team#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code description}</td>
     *         <td>{@link Team#description}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of teams.
     *         
     * @return the teams that match the given filter
     */
    public com.google.api.ads.dfp.axis.v201311.TeamPage getTeamsByStatement(com.google.api.ads.dfp.axis.v201311.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201311.ApiException;

    /**
     * Updates the specified {@code Team}.
     *         
     *         
     * @param team the team to update
     *         
     * @return the updated team
     */
    public com.google.api.ads.dfp.axis.v201311.Team updateTeam(com.google.api.ads.dfp.axis.v201311.Team team) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201311.ApiException;

    /**
     * Updates the specified {@link Team} objects.
     *         
     *         
     * @param teams the teams to update
     *         
     * @return the updated teams
     */
    public com.google.api.ads.dfp.axis.v201311.Team[] updateTeams(com.google.api.ads.dfp.axis.v201311.Team[] teams) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201311.ApiException;
}
