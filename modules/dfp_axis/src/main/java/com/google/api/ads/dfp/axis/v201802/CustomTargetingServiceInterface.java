// Copyright 2018 Google Inc. All Rights Reserved.
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
 * CustomTargetingServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public interface CustomTargetingServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link CustomTargetingKey} objects.
     *         
     *         The following fields are required:
     *         <ul>
     *         <li>{@link CustomTargetingKey#name}</li>
     *         <li>{@link CustomTargetingKey#type}</li>
     *         </ul>
     *         
     *         
     * @param keys the custom targeting keys to update
     *         
     * @return the updated custom targeting keys
     */
    public com.google.api.ads.dfp.axis.v201802.CustomTargetingKey[] createCustomTargetingKeys(com.google.api.ads.dfp.axis.v201802.CustomTargetingKey[] keys) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Creates new {@link CustomTargetingValue} objects.
     *         
     *         The following fields are required:
     *         <ul>
     *         <li>{@link CustomTargetingValue#customTargetingKeyId}</li>
     * <li>{@link CustomTargetingValue#name}</li>
     *         </ul>
     *         
     *         
     * @param values the custom targeting values to update
     *         
     * @return the updated custom targeting keys
     */
    public com.google.api.ads.dfp.axis.v201802.CustomTargetingValue[] createCustomTargetingValues(com.google.api.ads.dfp.axis.v201802.CustomTargetingValue[] values) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Gets a {@link CustomTargetingKeyPage} of {@link CustomTargetingKey}
     * objects
     *         that satisfy the given {@link Statement#query}. The following
     * fields are
     *         supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link CustomTargetingKey#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link CustomTargetingKey#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code displayName}</td>
     *         <td>{@link CustomTargetingKey#displayName}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code type}</td>
     *         <td>{@link CustomTargetingKey#type}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of custom targeting keys
     *         
     * @return the custom targeting keys that match the given filter
     */
    public com.google.api.ads.dfp.axis.v201802.CustomTargetingKeyPage getCustomTargetingKeysByStatement(com.google.api.ads.dfp.axis.v201802.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Gets a {@link CustomTargetingValuePage} of {@link CustomTargetingValue}
     * objects that satisfy the given {@link Statement#query}.
     *         <p>
     *         The {@code WHERE} clause in the {@link Statement#query} must
     * always contain
     *         {@link CustomTargetingValue#customTargetingKeyId} as one of
     * its columns in
     *         a way that it is AND'ed with the rest of the query. So, if
     * you want to
     *         retrieve values for a known set of key ids, valid {@link Statement#query}
     * would look like:
     *         </p>
     *         <ol>
     *         <li>
     *         "WHERE customTargetingKeyId IN ('17','18','19')" retrieves
     * all values that
     *         are associated with keys having ids 17, 18, 19.
     *         </li>
     *         <li>
     *         "WHERE customTargetingKeyId = '17' AND name = 'red'" retrieves
     * values that
     *         are associated with keys having id 17 and value name is 'red'.
     * </li>
     *         </ol>
     *         </p>
     *         <p>
     *         The following fields are supported for filtering:
     *         </p>
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th>
     *         <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link CustomTargetingValue#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code customTargetingKeyId}</td>
     *         <td>{@link CustomTargetingValue#customTargetingKeyId}</td>
     * </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link CustomTargetingValue#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code displayName}</td>
     *         <td>{@link CustomTargetingValue#displayName}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code matchType}</td>
     *         <td>{@link CustomTargetingValue#matchType}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of custom targeting values
     *         
     * @return the custom targeting values that match the given filter
     */
    public com.google.api.ads.dfp.axis.v201802.CustomTargetingValuePage getCustomTargetingValuesByStatement(com.google.api.ads.dfp.axis.v201802.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Performs actions on {@link CustomTargetingKey} objects that
     * match the given
     *         {@link Statement#query}.
     *         
     *         
     * @param customTargetingKeyAction the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of custom targeting keys
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.dfp.axis.v201802.UpdateResult performCustomTargetingKeyAction(com.google.api.ads.dfp.axis.v201802.CustomTargetingKeyAction customTargetingKeyAction, com.google.api.ads.dfp.axis.v201802.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Performs actions on {@link CustomTargetingValue} objects that
     * match the
     *         given {@link Statement#query}.
     *         
     *         
     * @param customTargetingValueAction the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of ad units
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.dfp.axis.v201802.UpdateResult performCustomTargetingValueAction(com.google.api.ads.dfp.axis.v201802.CustomTargetingValueAction customTargetingValueAction, com.google.api.ads.dfp.axis.v201802.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Updates the specified {@link CustomTargetingKey} objects.
     *         
     *         
     * @param keys the custom targeting keys to update
     *         
     * @return the updated custom targeting keys
     */
    public com.google.api.ads.dfp.axis.v201802.CustomTargetingKey[] updateCustomTargetingKeys(com.google.api.ads.dfp.axis.v201802.CustomTargetingKey[] keys) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Updates the specified {@link CustomTargetingValue} objects.
     * 
     *         
     * @param values the custom targeting values to update
     *         
     * @return the updated custom targeting values
     */
    public com.google.api.ads.dfp.axis.v201802.CustomTargetingValue[] updateCustomTargetingValues(com.google.api.ads.dfp.axis.v201802.CustomTargetingValue[] values) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;
}
