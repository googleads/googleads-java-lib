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


package com.google.api.ads.admanager.jaxws.v202305;

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
 *       Provides operations for creating, updating and retrieving {@link LineItemCreativeAssociation}
 *       objects.
 *       
 *       <p>A line item creative association (LICA) associates a {@link Creative} with a {@link LineItem}.
 *       When a line item is selected to serve, the LICAs specify which creatives can appear for the ad
 *       units that are targeted by the line item. In order to be associated with a line item, the
 *       creative must have a size that exists within the attribute {@link LineItem#creativePlaceholders}.
 *       
 *       <p>Each LICA has a start and end date and time that defines when the creative should be
 *       displayed.
 *       
 *       <p>To read more about associating creatives with line items, see this <a
 *       href="https://support.google.com/admanager/answer/3187916">Ad Manager Help Center</a> article.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0.2
 * Generated source version: 2.1
 * 
 */
@WebService(name = "LineItemCreativeAssociationServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LineItemCreativeAssociationServiceInterface {


    /**
     * 
     *         Creates new {@link LineItemCreativeAssociation} objects
     *       
     * 
     * @param lineItemCreativeAssociations
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202305.LineItemCreativeAssociation>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305")
    @RequestWrapper(localName = "createLineItemCreativeAssociations", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305", className = "com.google.api.ads.admanager.jaxws.v202305.LineItemCreativeAssociationServiceInterfacecreateLineItemCreativeAssociations")
    @ResponseWrapper(localName = "createLineItemCreativeAssociationsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305", className = "com.google.api.ads.admanager.jaxws.v202305.LineItemCreativeAssociationServiceInterfacecreateLineItemCreativeAssociationsResponse")
    public List<LineItemCreativeAssociation> createLineItemCreativeAssociations(
        @WebParam(name = "lineItemCreativeAssociations", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305")
        List<LineItemCreativeAssociation> lineItemCreativeAssociations)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link LineItemCreativeAssociationPage} of {@link LineItemCreativeAssociation} objects
     *         that satisfy the given {@link Statement#query}. The following fields are supported for
     *         filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code creativeId}</td>
     *         <td>{@link LineItemCreativeAssociation#creativeId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code manualCreativeRotationWeight}</td>
     *         <td>{@link LineItemCreativeAssociation#manualCreativeRotationWeight}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code destinationUrl}</td>
     *         <td>{@link LineItemCreativeAssociation#destinationUrl}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lineItemId}</td>
     *         <td>{@link LineItemCreativeAssociation#lineItemId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link LineItemCreativeAssociation#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link LineItemCreativeAssociation#lastModifiedDateTime}</td>
     *         </tr>
     *         </table>
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202305.LineItemCreativeAssociationPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305")
    @RequestWrapper(localName = "getLineItemCreativeAssociationsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305", className = "com.google.api.ads.admanager.jaxws.v202305.LineItemCreativeAssociationServiceInterfacegetLineItemCreativeAssociationsByStatement")
    @ResponseWrapper(localName = "getLineItemCreativeAssociationsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305", className = "com.google.api.ads.admanager.jaxws.v202305.LineItemCreativeAssociationServiceInterfacegetLineItemCreativeAssociationsByStatementResponse")
    public LineItemCreativeAssociationPage getLineItemCreativeAssociationsByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns an insite preview URL that references the specified site URL with the specified
     *         creative from the association served to it. For Creative Set previewing you may specify the
     *         master creative Id.
     *       
     * 
     * @param siteUrl
     * @param lineItemId
     * @param creativeId
     * @return
     *     returns java.lang.String
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305")
    @RequestWrapper(localName = "getPreviewUrl", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305", className = "com.google.api.ads.admanager.jaxws.v202305.LineItemCreativeAssociationServiceInterfacegetPreviewUrl")
    @ResponseWrapper(localName = "getPreviewUrlResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305", className = "com.google.api.ads.admanager.jaxws.v202305.LineItemCreativeAssociationServiceInterfacegetPreviewUrlResponse")
    public String getPreviewUrl(
        @WebParam(name = "lineItemId", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305")
        Long lineItemId,
        @WebParam(name = "creativeId", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305")
        Long creativeId,
        @WebParam(name = "siteUrl", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305")
        String siteUrl)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns a list of URLs that reference the specified site URL with the specified creative from
     *         the association served to it. For Creative Set previewing you may specify the master creative
     *         Id. Each URL corresponds to one available native style for previewing the specified creative.
     *       
     * 
     * @param siteUrl
     * @param lineItemId
     * @param creativeId
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202305.CreativeNativeStylePreview>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305")
    @RequestWrapper(localName = "getPreviewUrlsForNativeStyles", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305", className = "com.google.api.ads.admanager.jaxws.v202305.LineItemCreativeAssociationServiceInterfacegetPreviewUrlsForNativeStyles")
    @ResponseWrapper(localName = "getPreviewUrlsForNativeStylesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305", className = "com.google.api.ads.admanager.jaxws.v202305.LineItemCreativeAssociationServiceInterfacegetPreviewUrlsForNativeStylesResponse")
    public List<CreativeNativeStylePreview> getPreviewUrlsForNativeStyles(
        @WebParam(name = "lineItemId", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305")
        Long lineItemId,
        @WebParam(name = "creativeId", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305")
        Long creativeId,
        @WebParam(name = "siteUrl", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305")
        String siteUrl)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link LineItemCreativeAssociation} objects that match the given {@link
     *         Statement#query}.
     *       
     * 
     * @param lineItemCreativeAssociationAction
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202305.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305")
    @RequestWrapper(localName = "performLineItemCreativeAssociationAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305", className = "com.google.api.ads.admanager.jaxws.v202305.LineItemCreativeAssociationServiceInterfaceperformLineItemCreativeAssociationAction")
    @ResponseWrapper(localName = "performLineItemCreativeAssociationActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305", className = "com.google.api.ads.admanager.jaxws.v202305.LineItemCreativeAssociationServiceInterfaceperformLineItemCreativeAssociationActionResponse")
    public UpdateResult performLineItemCreativeAssociationAction(
        @WebParam(name = "lineItemCreativeAssociationAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305")
        LineItemCreativeAssociationAction lineItemCreativeAssociationAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Pushes a creative to devices that that satisfy the given {@link Statement#query}. *
     *       
     * 
     * @param filterStatement
     * @param options
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202305.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305")
    @RequestWrapper(localName = "pushCreativeToDevices", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305", className = "com.google.api.ads.admanager.jaxws.v202305.LineItemCreativeAssociationServiceInterfacepushCreativeToDevices")
    @ResponseWrapper(localName = "pushCreativeToDevicesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305", className = "com.google.api.ads.admanager.jaxws.v202305.LineItemCreativeAssociationServiceInterfacepushCreativeToDevicesResponse")
    public UpdateResult pushCreativeToDevices(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305")
        Statement filterStatement,
        @WebParam(name = "options", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305")
        CreativePushOptions options)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link LineItemCreativeAssociation} objects
     *       
     * 
     * @param lineItemCreativeAssociations
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202305.LineItemCreativeAssociation>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305")
    @RequestWrapper(localName = "updateLineItemCreativeAssociations", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305", className = "com.google.api.ads.admanager.jaxws.v202305.LineItemCreativeAssociationServiceInterfaceupdateLineItemCreativeAssociations")
    @ResponseWrapper(localName = "updateLineItemCreativeAssociationsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305", className = "com.google.api.ads.admanager.jaxws.v202305.LineItemCreativeAssociationServiceInterfaceupdateLineItemCreativeAssociationsResponse")
    public List<LineItemCreativeAssociation> updateLineItemCreativeAssociations(
        @WebParam(name = "lineItemCreativeAssociations", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305")
        List<LineItemCreativeAssociation> lineItemCreativeAssociations)
        throws ApiException_Exception
    ;

}
