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

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Provides methods for querying CMS metadata keys and values.
 *       
 *       <p>A CMS metadata value corresponds to one key value pair ingested from a publisher's CMS and is
 *       used to target all the content with which it is associated in the CMS.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "CmsMetadataServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CmsMetadataServiceInterface {


    /**
     * 
     *         Returns a page of {@link CmsMetadataKey}s matching the specified {@link Statement}. The
     *         following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope = "col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link CmsMetadataKey#cmsMetadataKeyId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code cmsKey}</td>
     *         <td>{@link CmsMetadataKey#keyName}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link CmsMetadataKey#status}</td>
     *         </tr>
     *         </table>
     *       
     * 
     * @param statement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202305.CmsMetadataKeyPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305")
    @RequestWrapper(localName = "getCmsMetadataKeysByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305", className = "com.google.api.ads.admanager.jaxws.v202305.CmsMetadataServiceInterfacegetCmsMetadataKeysByStatement")
    @ResponseWrapper(localName = "getCmsMetadataKeysByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305", className = "com.google.api.ads.admanager.jaxws.v202305.CmsMetadataServiceInterfacegetCmsMetadataKeysByStatementResponse")
    public CmsMetadataKeyPage getCmsMetadataKeysByStatement(
        @WebParam(name = "statement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305")
        Statement statement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns a page of {@link CmsMetadataValue}s matching the specified {@link Statement}. The
     *         following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope = "col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link CmsMetadataValue#cmsMetadataValueId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code cmsValue}</td>
     *         <td>{@link CmsMetadataValue#valueName}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code cmsKey}</td>
     *         <td>{@link CmsMetadataValue#key#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code cmsKeyId}</td>
     *         <td>{@link CmsMetadataValue#key#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link CmsMetadataValue#status}</td>
     *         </tr>
     *         </table>
     *       
     * 
     * @param statement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202305.CmsMetadataValuePage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305")
    @RequestWrapper(localName = "getCmsMetadataValuesByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305", className = "com.google.api.ads.admanager.jaxws.v202305.CmsMetadataServiceInterfacegetCmsMetadataValuesByStatement")
    @ResponseWrapper(localName = "getCmsMetadataValuesByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305", className = "com.google.api.ads.admanager.jaxws.v202305.CmsMetadataServiceInterfacegetCmsMetadataValuesByStatementResponse")
    public CmsMetadataValuePage getCmsMetadataValuesByStatement(
        @WebParam(name = "statement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305")
        Statement statement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link CmsMetadataKey} objects that match the given {@link
     *         Statement#query}.
     *       
     * 
     * @param keyAction
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202305.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305")
    @RequestWrapper(localName = "performCmsMetadataKeyAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305", className = "com.google.api.ads.admanager.jaxws.v202305.CmsMetadataServiceInterfaceperformCmsMetadataKeyAction")
    @ResponseWrapper(localName = "performCmsMetadataKeyActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305", className = "com.google.api.ads.admanager.jaxws.v202305.CmsMetadataServiceInterfaceperformCmsMetadataKeyActionResponse")
    public UpdateResult performCmsMetadataKeyAction(
        @WebParam(name = "keyAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305")
        CmsMetadataKeyAction keyAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link CmsMetadataValue} objects that match the given {@link
     *         Statement#query}.
     *       
     * 
     * @param filterStatement
     * @param valueAction
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202305.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305")
    @RequestWrapper(localName = "performCmsMetadataValueAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305", className = "com.google.api.ads.admanager.jaxws.v202305.CmsMetadataServiceInterfaceperformCmsMetadataValueAction")
    @ResponseWrapper(localName = "performCmsMetadataValueActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305", className = "com.google.api.ads.admanager.jaxws.v202305.CmsMetadataServiceInterfaceperformCmsMetadataValueActionResponse")
    public UpdateResult performCmsMetadataValueAction(
        @WebParam(name = "valueAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305")
        CmsMetadataValueAction valueAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305")
        Statement filterStatement)
        throws ApiException_Exception
    ;

}
