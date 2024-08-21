// Copyright 2024 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202408;

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
 *       Provides methods for creating, updating and retrieving {@link ContentBundle} objects.
 *       
 *       <p>A {@code ContentBundle} is a grouping of {@link Content} that match filter rules as well as
 *       taking into account explicitly included or excluded {@code Content}.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0.2
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ContentBundleServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ContentBundleServiceInterface {


    /**
     * 
     *         Creates new {@link ContentBundle} objects.
     *       
     * 
     * @param contentBundles
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202408.ContentBundle>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
    @RequestWrapper(localName = "createContentBundles", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408", className = "com.google.api.ads.admanager.jaxws.v202408.ContentBundleServiceInterfacecreateContentBundles")
    @ResponseWrapper(localName = "createContentBundlesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408", className = "com.google.api.ads.admanager.jaxws.v202408.ContentBundleServiceInterfacecreateContentBundlesResponse")
    public List<ContentBundle> createContentBundles(
        @WebParam(name = "contentBundles", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
        List<ContentBundle> contentBundles)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link ContentBundlePage} of {@link ContentBundle} objects that satisfy the given {@link
     *         Statement#query}. The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link ContentBundle#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link ContentBundle#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link ContentBundle#status}</td>
     *         </tr>
     *         </table>
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202408.ContentBundlePage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
    @RequestWrapper(localName = "getContentBundlesByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408", className = "com.google.api.ads.admanager.jaxws.v202408.ContentBundleServiceInterfacegetContentBundlesByStatement")
    @ResponseWrapper(localName = "getContentBundlesByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408", className = "com.google.api.ads.admanager.jaxws.v202408.ContentBundleServiceInterfacegetContentBundlesByStatementResponse")
    public ContentBundlePage getContentBundlesByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link ContentBundle} objects that match the given {@link Statement#query}.
     *       
     * 
     * @param filterStatement
     * @param contentBundleAction
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202408.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
    @RequestWrapper(localName = "performContentBundleAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408", className = "com.google.api.ads.admanager.jaxws.v202408.ContentBundleServiceInterfaceperformContentBundleAction")
    @ResponseWrapper(localName = "performContentBundleActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408", className = "com.google.api.ads.admanager.jaxws.v202408.ContentBundleServiceInterfaceperformContentBundleActionResponse")
    public UpdateResult performContentBundleAction(
        @WebParam(name = "contentBundleAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
        ContentBundleAction contentBundleAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link ContentBundle} objects.
     *       
     * 
     * @param contentBundles
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202408.ContentBundle>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
    @RequestWrapper(localName = "updateContentBundles", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408", className = "com.google.api.ads.admanager.jaxws.v202408.ContentBundleServiceInterfaceupdateContentBundles")
    @ResponseWrapper(localName = "updateContentBundlesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408", className = "com.google.api.ads.admanager.jaxws.v202408.ContentBundleServiceInterfaceupdateContentBundlesResponse")
    public List<ContentBundle> updateContentBundles(
        @WebParam(name = "contentBundles", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
        List<ContentBundle> contentBundles)
        throws ApiException_Exception
    ;

}
