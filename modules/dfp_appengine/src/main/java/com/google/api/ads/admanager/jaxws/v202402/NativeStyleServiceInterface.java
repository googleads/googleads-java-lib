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


package com.google.api.ads.admanager.jaxws.v202402;

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
 *       Provides methods for creating and retrieving {@link NativeStyle} objects.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0.2
 * Generated source version: 2.1
 * 
 */
@WebService(name = "NativeStyleServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v202402")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface NativeStyleServiceInterface {


    /**
     * 
     *         Creates new {@link NativeStyle} objects.
     *       
     * 
     * @param nativeStyles
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202402.NativeStyle>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202402")
    @RequestWrapper(localName = "createNativeStyles", targetNamespace = "https://www.google.com/apis/ads/publisher/v202402", className = "com.google.api.ads.admanager.jaxws.v202402.NativeStyleServiceInterfacecreateNativeStyles")
    @ResponseWrapper(localName = "createNativeStylesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202402", className = "com.google.api.ads.admanager.jaxws.v202402.NativeStyleServiceInterfacecreateNativeStylesResponse")
    public List<NativeStyle> createNativeStyles(
        @WebParam(name = "nativeStyles", targetNamespace = "https://www.google.com/apis/ads/publisher/v202402")
        List<NativeStyle> nativeStyles)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link NativeStylePage NativeStylePage} of {@link NativeStyle} objects that satisfy the
     *         given {@link Statement}. The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th>
     *         <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link NativeStyle#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link NativeStyle#name}</td>
     *         </tr>
     *         </table>
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202402.NativeStylePage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202402")
    @RequestWrapper(localName = "getNativeStylesByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202402", className = "com.google.api.ads.admanager.jaxws.v202402.NativeStyleServiceInterfacegetNativeStylesByStatement")
    @ResponseWrapper(localName = "getNativeStylesByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202402", className = "com.google.api.ads.admanager.jaxws.v202402.NativeStyleServiceInterfacegetNativeStylesByStatementResponse")
    public NativeStylePage getNativeStylesByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202402")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link NativeStyle native styles} that match the given {@link Statement}.
     *       
     * 
     * @param filterStatement
     * @param nativeStyleAction
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202402.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202402")
    @RequestWrapper(localName = "performNativeStyleAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202402", className = "com.google.api.ads.admanager.jaxws.v202402.NativeStyleServiceInterfaceperformNativeStyleAction")
    @ResponseWrapper(localName = "performNativeStyleActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202402", className = "com.google.api.ads.admanager.jaxws.v202402.NativeStyleServiceInterfaceperformNativeStyleActionResponse")
    public UpdateResult performNativeStyleAction(
        @WebParam(name = "nativeStyleAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202402")
        NativeStyleAction nativeStyleAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202402")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link NativeStyle} objects.
     *       
     * 
     * @param nativeStyles
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202402.NativeStyle>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202402")
    @RequestWrapper(localName = "updateNativeStyles", targetNamespace = "https://www.google.com/apis/ads/publisher/v202402", className = "com.google.api.ads.admanager.jaxws.v202402.NativeStyleServiceInterfaceupdateNativeStyles")
    @ResponseWrapper(localName = "updateNativeStylesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202402", className = "com.google.api.ads.admanager.jaxws.v202402.NativeStyleServiceInterfaceupdateNativeStylesResponse")
    public List<NativeStyle> updateNativeStyles(
        @WebParam(name = "nativeStyles", targetNamespace = "https://www.google.com/apis/ads/publisher/v202402")
        List<NativeStyle> nativeStyles)
        throws ApiException_Exception
    ;

}
