// Copyright 2023 Google LLC
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
 * UserServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202308;

public interface UserServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link User} objects.
     */
    public com.google.api.ads.admanager.axis.v202308.User[] createUsers(com.google.api.ads.admanager.axis.v202308.User[] users) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202308.ApiException;

    /**
     * Returns the {@link Role} objects that are defined for the users
     * of the network.
     */
    public com.google.api.ads.admanager.axis.v202308.Role[] getAllRoles() throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202308.ApiException;

    /**
     * Returns the current {@link User}.
     */
    public com.google.api.ads.admanager.axis.v202308.User getCurrentUser() throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202308.ApiException;

    /**
     * Gets a {@link UserPage} of {@link User} objects that satisfy
     * the given {@link Statement#query}.
     *         The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code email}</td>
     *         <td>{@link User#email}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link User#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link User#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code roleId}</td>
     *         <td>{@link User#roleId}
     *         </tr>
     *         <tr>
     *         <td>{@code rolename}</td>
     *         <td>{@link User#roleName}
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@code ACTIVE} if {@link User#isActive} is true; {@code
     * INACTIVE}
     *         otherwise</td>
     *         </tr>
     *         </table>
     */
    public com.google.api.ads.admanager.axis.v202308.UserPage getUsersByStatement(com.google.api.ads.admanager.axis.v202308.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202308.ApiException;

    /**
     * Performs actions on {@link User} objects that match the given
     * {@link Statement#query}.
     */
    public com.google.api.ads.admanager.axis.v202308.UpdateResult performUserAction(com.google.api.ads.admanager.axis.v202308.UserAction userAction, com.google.api.ads.admanager.axis.v202308.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202308.ApiException;

    /**
     * Updates the specified {@link User} objects.
     */
    public com.google.api.ads.admanager.axis.v202308.User[] updateUsers(com.google.api.ads.admanager.axis.v202308.User[] users) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202308.ApiException;
}
