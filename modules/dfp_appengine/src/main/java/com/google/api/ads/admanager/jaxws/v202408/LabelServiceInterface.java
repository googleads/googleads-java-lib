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
 *       Provides methods for the creation and management of Labels.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0.2
 * Generated source version: 2.1
 * 
 */
@WebService(name = "LabelServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LabelServiceInterface {


    /**
     * 
     *         Creates new {@link Label} objects.
     *       
     * 
     * @param labels
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202408.Label>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
    @RequestWrapper(localName = "createLabels", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408", className = "com.google.api.ads.admanager.jaxws.v202408.LabelServiceInterfacecreateLabels")
    @ResponseWrapper(localName = "createLabelsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408", className = "com.google.api.ads.admanager.jaxws.v202408.LabelServiceInterfacecreateLabelsResponse")
    public List<Label> createLabels(
        @WebParam(name = "labels", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
        List<Label> labels)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link LabelPage} of {@link Label} objects that satisfy the given {@link
     *         Statement#query}. The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Label#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code type}</td>
     *         <td>{@link Label#type}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Label#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code description}</td>
     *         <td>{@link Label#description}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code isActive}</td>
     *         <td>{@link Label#isActive}</td>
     *         </tr>
     *         </table>
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202408.LabelPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
    @RequestWrapper(localName = "getLabelsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408", className = "com.google.api.ads.admanager.jaxws.v202408.LabelServiceInterfacegetLabelsByStatement")
    @ResponseWrapper(localName = "getLabelsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408", className = "com.google.api.ads.admanager.jaxws.v202408.LabelServiceInterfacegetLabelsByStatementResponse")
    public LabelPage getLabelsByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link Label} objects that match the given {@link Statement#query}.
     *       
     * 
     * @param filterStatement
     * @param labelAction
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202408.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
    @RequestWrapper(localName = "performLabelAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408", className = "com.google.api.ads.admanager.jaxws.v202408.LabelServiceInterfaceperformLabelAction")
    @ResponseWrapper(localName = "performLabelActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408", className = "com.google.api.ads.admanager.jaxws.v202408.LabelServiceInterfaceperformLabelActionResponse")
    public UpdateResult performLabelAction(
        @WebParam(name = "labelAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
        LabelAction labelAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link Label} objects.
     *       
     * 
     * @param labels
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202408.Label>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
    @RequestWrapper(localName = "updateLabels", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408", className = "com.google.api.ads.admanager.jaxws.v202408.LabelServiceInterfaceupdateLabels")
    @ResponseWrapper(localName = "updateLabelsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408", className = "com.google.api.ads.admanager.jaxws.v202408.LabelServiceInterfaceupdateLabelsResponse")
    public List<Label> updateLabels(
        @WebParam(name = "labels", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
        List<Label> labels)
        throws ApiException_Exception
    ;

}
