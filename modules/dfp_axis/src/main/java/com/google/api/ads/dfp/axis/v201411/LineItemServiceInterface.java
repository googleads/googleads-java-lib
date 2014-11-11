/**
 * LineItemServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201411;

public interface LineItemServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link LineItem} objects.
     *         
     *         
     * @param lineItems the line items to create
     *         
     * @return the created line items with their IDs filled in
     */
    public com.google.api.ads.dfp.axis.v201411.LineItem[] createLineItems(com.google.api.ads.dfp.axis.v201411.LineItem[] lineItems) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201411.ApiException;

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
     * <tr><td><code>Targeting</code></td><td>{@link LineItem#targeting}</td></tr>
     * <tr><td><code>UnitsBought</code></td><td>{@link LineItem#unitsBought}</td></tr>
     * </table>
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of line items.
     *         
     * @return the line items that match the given filter
     */
    public com.google.api.ads.dfp.axis.v201411.LineItemPage getLineItemsByStatement(com.google.api.ads.dfp.axis.v201411.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201411.ApiException;

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
    public com.google.api.ads.dfp.axis.v201411.UpdateResult performLineItemAction(com.google.api.ads.dfp.axis.v201411.LineItemAction lineItemAction, com.google.api.ads.dfp.axis.v201411.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201411.ApiException;

    /**
     * Updates the specified {@link LineItem} objects.
     *         
     *         
     * @param lineItems the line items to update
     *         
     * @return the updated line items
     */
    public com.google.api.ads.dfp.axis.v201411.LineItem[] updateLineItems(com.google.api.ads.dfp.axis.v201411.LineItem[] lineItems) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201411.ApiException;
}
