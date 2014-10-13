/**
 * LineItemServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201311;

public interface LineItemServiceInterface extends java.rmi.Remote {

    /**
     * Creates a new {@link LineItem}.
     *         
     *         These fields are required:
     *         <ul>
     *         <li>{@link LineItem#costPerUnit}</li>
     *         <li>{@link LineItem#costType}<li>
     *         <li>{@link LineItem#endDateTime}</li>
     *         <li>{@link LineItem#lineItemType}</li>
     *         <li>{@link LineItem#name}</li>
     *         <li>{@link LineItem#orderId}</li>
     *         <li>{@link LineItem#startDateTime}</li>
     *         <li>{@link LineItem#unitsBought}</li>
     *         <li>{@link LineItem#creativePlaceholders}</li>
     *         <li>{@link LineItem#targeting}</li>
     *         </ul>
     *         
     *         
     * @param lineItem the line item to create
     *         
     * @return the line item with its ID filled in
     */
    public com.google.api.ads.dfp.axis.v201311.LineItem createLineItem(com.google.api.ads.dfp.axis.v201311.LineItem lineItem) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201311.ApiException;

    /**
     * Creates new {@link LineItem} objects.
     *         
     *         
     * @param lineItems the line items to create
     *         
     * @return the created line items with their IDs filled in
     */
    public com.google.api.ads.dfp.axis.v201311.LineItem[] createLineItems(com.google.api.ads.dfp.axis.v201311.LineItem[] lineItems) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201311.ApiException;

    /**
     * Returns the {@link LineItem} uniquely identified by the given
     * ID.
     *         
     *         
     * @param lineItemId the ID of the line item, which must already exist
     * 
     * @return the {@code LineItem} uniquely identified by the given ID
     */
    public com.google.api.ads.dfp.axis.v201311.LineItem getLineItem(java.lang.Long lineItemId) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201311.ApiException;

    /**
     * Gets a {@link LineItemPage} of {@link LineItem} objects that
     * satisfy the
     *         given {@link Statement#query}. The following fields are supported
     * for
     *         filtering:
     *         
     *         <table>
     * <tr><th scope="col">PQL property</th><th scope="col">Entity property</th>
     * </tr>
     * <tr><td><code>CostType</code></td><td>{@link LineItem#costType}</td></tr>
     * <tr><td><code>CreationDateTime</code></td><td>{@link LineItem#creationDateTime}</td></tr>
     * <tr><td><code>DeliveryRateType</code></td><td>{@link LineItem#deliveryRateType}</td></tr>
     * <tr><td><code>EndDateTime</code></td><td>{@link LineItem#endDateTime}</td></tr>
     * <tr><td><code>ExternalId</code></td><td>{@link LineItem#externalId}</td></tr>
     * <tr><td><code>Id</code></td><td>{@link LineItem#id}</td></tr>
     * <tr><td><code>IsMissingCreatives</code></td><td>{@link LineItem#isMissingCreatives}</td></tr>
     * <tr><td><code>LastModifiedDateTime</code></td><td>{@link LineItem#lastModifiedDateTime}</td></tr>
     * <tr><td><code>LineItemType</code></td><td>{@link LineItem#lineItemType}</td></tr>
     * <tr><td><code>Name</code></td><td>{@link LineItem#name}</td></tr>
     * <tr><td><code>OrderId</code></td><td>{@link LineItem#orderId}</td></tr>
     * <tr><td><code>StartDateTime</code></td><td>{@link LineItem#startDateTime}</td></tr>
     * <tr><td><code>Status</code></td><td>{@link LineItem#status}</td></tr>
     * <tr><td><code>UnitsBought</code></td><td>{@link LineItem#unitsBought}</td></tr>
     * </table>
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of line items.
     *         
     * @return the line items that match the given filter
     */
    public com.google.api.ads.dfp.axis.v201311.LineItemPage getLineItemsByStatement(com.google.api.ads.dfp.axis.v201311.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201311.ApiException;

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
    public com.google.api.ads.dfp.axis.v201311.UpdateResult performLineItemAction(com.google.api.ads.dfp.axis.v201311.LineItemAction lineItemAction, com.google.api.ads.dfp.axis.v201311.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201311.ApiException;

    /**
     * Updates the specified {@link LineItem}.
     *         
     *         
     * @param lineItem the line item to update
     *         
     * @return the updated line item
     */
    public com.google.api.ads.dfp.axis.v201311.LineItem updateLineItem(com.google.api.ads.dfp.axis.v201311.LineItem lineItem) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201311.ApiException;

    /**
     * Updates the specified {@link LineItem} objects.
     *         
     *         
     * @param lineItems the line items to update
     *         
     * @return the updated line items
     */
    public com.google.api.ads.dfp.axis.v201311.LineItem[] updateLineItems(com.google.api.ads.dfp.axis.v201311.LineItem[] lineItems) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201311.ApiException;
}
