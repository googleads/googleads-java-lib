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
 * OrderServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public interface OrderServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link Order} objects.
     *         
     *         
     * @param orders the orders to create
     *         
     * @return the created orders with their IDs filled in
     */
    public com.google.api.ads.dfp.axis.v201802.Order[] createOrders(com.google.api.ads.dfp.axis.v201802.Order[] orders) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Gets an {@link OrderPage} of {@link Order} objects that satisfy
     * the given
     *         {@link Statement#query}. The following fields are supported
     * for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code advertiserId}</td>
     *         <td>{@link Order#advertiserId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code endDateTime}</td>
     *         <td>{@link Order#endDateTime}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Order#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Order#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code salespersonId}</td>
     *         <td>{@link Order#salespersonId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code startDateTime}</td>
     *         <td>{@link Order#startDateTime}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link Order#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code traffickerId}</td>
     *         <td>{@link Order#traffickerId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link Order#lastModifiedDateTime}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of orders
     *         
     * @return the orders that match the given filter
     */
    public com.google.api.ads.dfp.axis.v201802.OrderPage getOrdersByStatement(com.google.api.ads.dfp.axis.v201802.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Performs actions on {@link Order} objects that match the given
     * {@link Statement#query}.
     *         
     *         
     * @param orderAction the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of orders
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.dfp.axis.v201802.UpdateResult performOrderAction(com.google.api.ads.dfp.axis.v201802.OrderAction orderAction, com.google.api.ads.dfp.axis.v201802.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Updates the specified {@link Order} objects.
     *         
     *         
     * @param orders the orders to update
     *         
     * @return the updated orders
     */
    public com.google.api.ads.dfp.axis.v201802.Order[] updateOrders(com.google.api.ads.dfp.axis.v201802.Order[] orders) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;
}
