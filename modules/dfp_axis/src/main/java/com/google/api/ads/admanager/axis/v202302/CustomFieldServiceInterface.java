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
 * CustomFieldServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202302;

public interface CustomFieldServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link CustomFieldOption} objects.
     *         
     *         <p>The following fields are required:
     *         
     *         <ul>
     *         <li>{@link CustomFieldOption#displayName}
     *         <li>{@link CustomFieldOption#customFieldId}
     *         </ul>
     */
    public com.google.api.ads.admanager.axis.v202302.CustomFieldOption[] createCustomFieldOptions(com.google.api.ads.admanager.axis.v202302.CustomFieldOption[] customFieldOptions) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202302.ApiException;

    /**
     * Creates new {@link CustomField} objects.
     *         
     *         <p>The following fields are required:
     *         
     *         <ul>
     *         <li>{@link CustomField#name}
     *         <li>{@link CustomField#entityType}
     *         <li>{@link CustomField#dataType}
     *         <li>{@link CustomField#visibility}
     *         </ul>
     */
    public com.google.api.ads.admanager.axis.v202302.CustomField[] createCustomFields(com.google.api.ads.admanager.axis.v202302.CustomField[] customFields) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202302.ApiException;

    /**
     * Returns the {@link CustomFieldOption} uniquely identified by
     * the given ID.
     */
    public com.google.api.ads.admanager.axis.v202302.CustomFieldOption getCustomFieldOption(java.lang.Long customFieldOptionId) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202302.ApiException;

    /**
     * Gets a {@link CustomFieldPage} of {@link CustomField} objects
     * that satisfy the given {@link
     *         Statement#query}. The following fields are supported for filtering:
     * 
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link CustomField#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code entityType}</td>
     *         <td>{@link CustomField#entityType}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link CustomField#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code isActive}</td>
     *         <td>{@link CustomField#isActive}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code visibility}</td>
     *         <td>{@link CustomField#visibility}</td>
     *         </tr>
     *         </table>
     */
    public com.google.api.ads.admanager.axis.v202302.CustomFieldPage getCustomFieldsByStatement(com.google.api.ads.admanager.axis.v202302.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202302.ApiException;

    /**
     * Performs actions on {@link CustomField} objects that match
     * the given {@link Statement#query}.
     */
    public com.google.api.ads.admanager.axis.v202302.UpdateResult performCustomFieldAction(com.google.api.ads.admanager.axis.v202302.CustomFieldAction customFieldAction, com.google.api.ads.admanager.axis.v202302.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202302.ApiException;

    /**
     * Updates the specified {@link CustomFieldOption} objects.
     */
    public com.google.api.ads.admanager.axis.v202302.CustomFieldOption[] updateCustomFieldOptions(com.google.api.ads.admanager.axis.v202302.CustomFieldOption[] customFieldOptions) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202302.ApiException;

    /**
     * Updates the specified {@link CustomField} objects.
     */
    public com.google.api.ads.admanager.axis.v202302.CustomField[] updateCustomFields(com.google.api.ads.admanager.axis.v202302.CustomField[] customFields) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202302.ApiException;
}
