/**
 * LineItemServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201308;

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
    public com.google.api.ads.dfp.axis.v201308.LineItem createLineItem(com.google.api.ads.dfp.axis.v201308.LineItem lineItem) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201308.ApiException;

    /**
     * Creates new {@link LineItem} objects.
     *         
     *         
     * @param lineItems the line items to create
     *         
     * @return the created line items with their IDs filled in
     */
    public com.google.api.ads.dfp.axis.v201308.LineItem[] createLineItems(com.google.api.ads.dfp.axis.v201308.LineItem[] lineItems) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201308.ApiException;

    /**
     * Returns the {@link LineItem} uniquely identified by the given
     * ID.
     *         
     *         
     * @param lineItemId the ID of the line item, which must already exist
     * 
     * @return the {@code LineItem} uniquely identified by the given ID
     */
    public com.google.api.ads.dfp.axis.v201308.LineItem getLineItem(java.lang.Long lineItemId) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201308.ApiException;

    /**
     * Gets a {@link LineItemPage} of {@link LineItem} objects that
     * satisfy the
     *         given {@link Statement#query}. The following fields are supported
     * for
     *         filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code costType}</td>
     *         <td>{@link LineItem#costType}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link LineItem#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lineItemType}</td>
     *         <td>{@link LineItem#lineItemType}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link LineItem#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code orderId}</td>
     *         <td>{@link LineItem#orderId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link LineItem#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code unitsBought}</td>
     *         <td>{@link LineItem#unitsBought}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code deliveryRateType}</td>
     *         <td>{@link LineItem#deliveryRateType}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link LineItem#lastModifiedDateTime}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code creationDateTime}</td>
     *         <td>{@link LineItem#creationDateTime}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code isMissingCreatives}</td>
     *         <td>{@link LineItem#isMissingCreatives}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of line items.
     *         
     * @return the line items that match the given filter
     */
    public com.google.api.ads.dfp.axis.v201308.LineItemPage getLineItemsByStatement(com.google.api.ads.dfp.axis.v201308.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201308.ApiException;

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
    public com.google.api.ads.dfp.axis.v201308.UpdateResult performLineItemAction(com.google.api.ads.dfp.axis.v201308.LineItemAction lineItemAction, com.google.api.ads.dfp.axis.v201308.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201308.ApiException;

    /**
     * Updates the specified {@link LineItem}.
     *         
     *         
     * @param lineItem the line item to update
     *         
     * @return the updated line item
     */
    public com.google.api.ads.dfp.axis.v201308.LineItem updateLineItem(com.google.api.ads.dfp.axis.v201308.LineItem lineItem) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201308.ApiException;

    /**
     * Updates the specified {@link LineItem} objects.
     *         
     *         
     * @param lineItems the line items to update
     *         
     * @return the updated line items
     */
    public com.google.api.ads.dfp.axis.v201308.LineItem[] updateLineItems(com.google.api.ads.dfp.axis.v201308.LineItem[] lineItems) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201308.ApiException;
}
