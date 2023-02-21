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
 * LineItemServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202302;

public interface LineItemServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link LineItem} objects.
     */
    public com.google.api.ads.admanager.axis.v202302.LineItem[] createLineItems(com.google.api.ads.admanager.axis.v202302.LineItem[] lineItems) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202302.ApiException;

    /**
     * Gets a {@link LineItemPage} of {@link LineItem} objects that
     * satisfy the given {@link
     *         Statement#query}. The following fields are supported for filtering:
     * 
     *         <table>
     *         <tbody>
     *         <tr>
     *         <th>PQL property</th>
     *         <th>Entity property</th>
     *         </tr>
     *         <tr>
     *         <td>
     *         {@code CostType}
     *         </td>
     *         <td>
     *         {@link LineItem#costType}
     *         </td>
     *         </tr>
     *         <tr>
     *         <td>
     *         {@code CreationDateTime}
     *         </td>
     *         <td>
     *         {@link LineItem#creationDateTime}
     *         </td>
     *         </tr>
     *         <tr>
     *         <td>
     *         {@code DeliveryRateType}
     *         </td>
     *         <td>
     *         {@link LineItem#deliveryRateType}
     *         </td>
     *         </tr>
     *         <tr>
     *         <td>
     *         {@code EndDateTime}
     *         </td>
     *         <td>
     *         {@link LineItem#endDateTime}
     *         </td>
     *         </tr>
     *         <tr>
     *         <td>
     *         {@code ExternalId}
     *         </td>
     *         <td>
     *         {@link LineItem#externalId}
     *         </td>
     *         </tr>
     *         <tr>
     *         <td>
     *         {@code Id}
     *         </td>
     *         <td>
     *         {@link LineItem#id}
     *         </td>
     *         </tr>
     *         <tr>
     *         <td>
     *         {@code IsMissingCreatives}
     *         </td>
     *         <td>
     *         {@link LineItem#isMissingCreatives}
     *         </td>
     *         </tr>
     *         <tr>
     *         <td>
     *         {@code IsSetTopBoxEnabled}
     *         </td>
     *         <td>
     *         {@link LineItem#isSetTopBoxEnabled}
     *         </td>
     *         </tr>
     *         <tr>
     *         <td>
     *         {@code LastModifiedDateTime}
     *         </td>
     *         <td>
     *         {@link LineItem#lastModifiedDateTime}
     *         </td>
     *         </tr>
     *         <tr>
     *         <td>
     *         {@code LineItemType}
     *         </td>
     *         <td>
     *         {@link LineItem#lineItemType}
     *         </td>
     *         </tr>
     *         <tr>
     *         <td>
     *         {@code Name}
     *         </td>
     *         <td>
     *         {@link LineItem#name}
     *         </td>
     *         </tr>
     *         <tr>
     *         <td>
     *         {@code OrderId}
     *         </td>
     *         <td>
     *         {@link LineItem#orderId}
     *         </td>
     *         </tr>
     *         <tr>
     *         <td>
     *         {@code StartDateTime}
     *         </td>
     *         <td>
     *         {@link LineItem#startDateTime}
     *         </td>
     *         </tr>
     *         <tr>
     *         <td>
     *         {@code Status}
     *         </td>
     *         <td>
     *         {@link LineItem#status}
     *         </td>
     *         </tr>
     *         <tr>
     *         <td>
     *         {@code UnitsBought}
     *         </td>
     *         <td>
     *         {@link LineItem#unitsBought}
     *         </td>
     *         </tr>
     *         </tbody>
     *         </table>
     */
    public com.google.api.ads.admanager.axis.v202302.LineItemPage getLineItemsByStatement(com.google.api.ads.admanager.axis.v202302.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202302.ApiException;

    /**
     * Performs actions on {@link LineItem} objects that match the
     * given {@link Statement#query}.
     */
    public com.google.api.ads.admanager.axis.v202302.UpdateResult performLineItemAction(com.google.api.ads.admanager.axis.v202302.LineItemAction lineItemAction, com.google.api.ads.admanager.axis.v202302.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202302.ApiException;

    /**
     * Updates the specified {@link LineItem} objects.
     */
    public com.google.api.ads.admanager.axis.v202302.LineItem[] updateLineItems(com.google.api.ads.admanager.axis.v202302.LineItem[] lineItems) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202302.ApiException;
}
