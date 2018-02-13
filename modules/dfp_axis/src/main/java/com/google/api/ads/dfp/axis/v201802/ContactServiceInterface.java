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
 * ContactServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public interface ContactServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link Contact} objects.
     *         
     *         
     * @param contacts the contacts to create
     *         
     * @return the created contacts with their IDs filled in
     */
    public com.google.api.ads.dfp.axis.v201802.Contact[] createContacts(com.google.api.ads.dfp.axis.v201802.Contact[] contacts) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Gets a {@link ContactPage} of {@link Contact} objects that
     * satisfy the given
     *         {@link Statement#query}. The following fields are supported
     * for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Contact#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code email}</td>
     *         <td>{@link Contact#email}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Contact#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code comment}</td>
     *         <td>{@link Contact#comment}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code companyId}</td>
     *         <td>{@link Contact#companyId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code title}</td>
     *         <td>{@link Contact#title}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code cellPhone}</td>
     *         <td>{@link Contact#cellPhone}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code workPhone}</td>
     *         <td>{@link Contact#workPhone}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code faxPhone}</td>
     *         <td>{@link Contact#faxPhone}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link Contact#status}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of contacts
     *         
     * @return the contacts that match the given filter
     */
    public com.google.api.ads.dfp.axis.v201802.ContactPage getContactsByStatement(com.google.api.ads.dfp.axis.v201802.Statement statement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Updates the specified {@link Contact} objects.
     *         
     *         
     * @param contacts the contacts to update
     *         
     * @return the updated contacts
     */
    public com.google.api.ads.dfp.axis.v201802.Contact[] updateContacts(com.google.api.ads.dfp.axis.v201802.Contact[] contacts) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;
}
