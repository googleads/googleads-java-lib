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
 * LineItemServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public interface LineItemServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link LineItem} objects.
     *         
     *         
     * @param lineItems the line items to create
     *         
     * @return the created line items with their IDs filled in
     */
    public com.google.api.ads.dfp.axis.v201802.LineItem[] createLineItems(com.google.api.ads.dfp.axis.v201802.LineItem[] lineItems) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Gets a {@link LineItemPage} of {@link LineItem} objects that
     * satisfy the
     *         given {@link Statement#query}. The following fields are supported
     * for
     *         filtering:
     *         
     *         <table><tr><th>PQL property</th><th>Entity property</th></tr><tr><td><code>CostType</code></td><td>{@link
     * LineItem#costType}</td></tr><tr><td><code>CreationDateTime</code></td><td>{@link
     * LineItem#creationDateTime}</td></tr><tr><td><code>DeliveryRateType</code></td><td>{@link
     * LineItem#deliveryRateType}</td></tr><tr><td><code>EndDateTime</code></td><td>{@link
     * LineItem#endDateTime}</td></tr><tr><td><code>ExternalId</code></td><td>{@link
     * LineItem#externalId}</td></tr><tr><td><code>Id</code></td><td>{@link
     * LineItem#id}</td></tr><tr><td><code>IsMissingCreatives</code></td><td>{@link
     * LineItem#isMissingCreatives}</td></tr><tr><td><code>IsSetTopBoxEnabled</code></td><td>{@link
     * LineItem#isSetTopBoxEnabled}</td></tr><tr><td><code>LastModifiedDateTime</code></td><td>{@link
     * LineItem#lastModifiedDateTime}</td></tr><tr><td><code>LineItemType</code></td><td>{@link
     * LineItem#lineItemType}</td></tr><tr><td><code>Name</code></td><td>{@link
     * LineItem#name}</td></tr><tr><td><code>OrderId</code></td><td>{@link
     * LineItem#orderId}</td></tr><tr><td><code>StartDateTime</code></td><td>{@link
     * LineItem#startDateTime}</td></tr><tr><td><code>Status</code></td><td>{@link
     * LineItem#status}</td></tr><tr><td><code>Targeting</code></td><td>{@link
     * LineItem#targeting}</td></tr><tr><td><code>UnitsBought</code></td><td>{@link
     * LineItem#unitsBought}</td></tr></table>
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of line items.
     *         
     * @return the line items that match the given filter
     */
    public com.google.api.ads.dfp.axis.v201802.LineItemPage getLineItemsByStatement(com.google.api.ads.dfp.axis.v201802.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Performs actions on {@link LineItem} objects that match the
     * given
     *         {@link Statement#query}.
     *         
     *         
     * @param lineItemAction the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of line items
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.dfp.axis.v201802.UpdateResult performLineItemAction(com.google.api.ads.dfp.axis.v201802.LineItemAction lineItemAction, com.google.api.ads.dfp.axis.v201802.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Updates the specified {@link LineItem} objects.
     *         
     *         
     * @param lineItems the line items to update
     *         
     * @return the updated line items
     */
    public com.google.api.ads.dfp.axis.v201802.LineItem[] updateLineItems(com.google.api.ads.dfp.axis.v201802.LineItem[] lineItems) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;
}
