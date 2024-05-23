// Copyright 2024 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * UserTeamAssociationServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202405;

public interface UserTeamAssociationServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link UserTeamAssociation} objects.
     */
    public com.google.api.ads.admanager.axis.v202405.UserTeamAssociation[] createUserTeamAssociations(com.google.api.ads.admanager.axis.v202405.UserTeamAssociation[] userTeamAssociations) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202405.ApiException;

    /**
     * Gets a {@link UserTeamAssociationPage} of {@link UserTeamAssociation}
     * objects that satisfy the
     *         given {@link Statement#query}. The following fields are supported
     * for filtering:
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
     */
    public com.google.api.ads.admanager.axis.v202405.UserTeamAssociationPage getUserTeamAssociationsByStatement(com.google.api.ads.admanager.axis.v202405.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202405.ApiException;

    /**
     * Performs actions on {@link UserTeamAssociation} objects that
     * match the given {@link
     *         Statement#query}.
     */
    public com.google.api.ads.admanager.axis.v202405.UpdateResult performUserTeamAssociationAction(com.google.api.ads.admanager.axis.v202405.UserTeamAssociationAction userTeamAssociationAction, com.google.api.ads.admanager.axis.v202405.Statement statement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202405.ApiException;

    /**
     * Updates the specified {@link UserTeamAssociation} objects.
     */
    public com.google.api.ads.admanager.axis.v202405.UserTeamAssociation[] updateUserTeamAssociations(com.google.api.ads.admanager.axis.v202405.UserTeamAssociation[] userTeamAssociations) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202405.ApiException;
}
