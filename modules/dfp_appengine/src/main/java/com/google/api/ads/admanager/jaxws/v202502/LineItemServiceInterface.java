// Copyright 2025 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202502;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Provides methods for creating, updating and retrieving {@link LineItem} objects.
 *       
 *       <p>Line items define the campaign. For example, line items define:
 *       
 *       <ul>
 *       <li>a budget
 *       <li>a span of time to run
 *       <li>ad unit targeting
 *       </ul>
 *       
 *       <p>In short, line items connect all of the elements of an ad campaign.
 *       
 *       <p>Line items and creatives can be associated with each other through {@link
 *       LineItemCreativeAssociation} objects. An ad unit will host a creative through both this
 *       association and the {@link LineItem#targeting} to it. The delivery of a line item depends on its
 *       priority. More information on line item priorities can be found on the <a
 *       href="https://support.google.com/admanager/answer/177279">Ad Manager Help Center</a>.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0.2
 * Generated source version: 2.1
 * 
 */
@WebService(name = "LineItemServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LineItemServiceInterface {


    /**
     * 
     *         Creates new {@link LineItem} objects.
     *       
     * 
     * @param lineItems
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202502.LineItem>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502")
    @RequestWrapper(localName = "createLineItems", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502", className = "com.google.api.ads.admanager.jaxws.v202502.LineItemServiceInterfacecreateLineItems")
    @ResponseWrapper(localName = "createLineItemsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502", className = "com.google.api.ads.admanager.jaxws.v202502.LineItemServiceInterfacecreateLineItemsResponse")
    public List<LineItem> createLineItems(
        @WebParam(name = "lineItems", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502")
        List<LineItem> lineItems)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link LineItemPage} of {@link LineItem} objects that satisfy the given {@link
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
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202502.LineItemPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502")
    @RequestWrapper(localName = "getLineItemsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502", className = "com.google.api.ads.admanager.jaxws.v202502.LineItemServiceInterfacegetLineItemsByStatement")
    @ResponseWrapper(localName = "getLineItemsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502", className = "com.google.api.ads.admanager.jaxws.v202502.LineItemServiceInterfacegetLineItemsByStatementResponse")
    public LineItemPage getLineItemsByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link LineItem} objects that match the given {@link Statement#query}.
     *       
     * 
     * @param filterStatement
     * @param lineItemAction
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202502.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502")
    @RequestWrapper(localName = "performLineItemAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502", className = "com.google.api.ads.admanager.jaxws.v202502.LineItemServiceInterfaceperformLineItemAction")
    @ResponseWrapper(localName = "performLineItemActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502", className = "com.google.api.ads.admanager.jaxws.v202502.LineItemServiceInterfaceperformLineItemActionResponse")
    public UpdateResult performLineItemAction(
        @WebParam(name = "lineItemAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502")
        LineItemAction lineItemAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link LineItem} objects.
     *       
     * 
     * @param lineItems
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202502.LineItem>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502")
    @RequestWrapper(localName = "updateLineItems", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502", className = "com.google.api.ads.admanager.jaxws.v202502.LineItemServiceInterfaceupdateLineItems")
    @ResponseWrapper(localName = "updateLineItemsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502", className = "com.google.api.ads.admanager.jaxws.v202502.LineItemServiceInterfaceupdateLineItemsResponse")
    public List<LineItem> updateLineItems(
        @WebParam(name = "lineItems", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502")
        List<LineItem> lineItems)
        throws ApiException_Exception
    ;

}
