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


package com.google.api.ads.admanager.jaxws.v202411;

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
 *       Service for interacting with Targeting Presets.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0.2
 * Generated source version: 2.1
 * 
 */
@WebService(name = "TargetingPresetServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TargetingPresetServiceInterface {


    /**
     * 
     *         Creates new {@link TargetingPreset} objects.
     *       
     * 
     * @param targetingPresets
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202411.TargetingPreset>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411")
    @RequestWrapper(localName = "createTargetingPresets", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411", className = "com.google.api.ads.admanager.jaxws.v202411.TargetingPresetServiceInterfacecreateTargetingPresets")
    @ResponseWrapper(localName = "createTargetingPresetsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411", className = "com.google.api.ads.admanager.jaxws.v202411.TargetingPresetServiceInterfacecreateTargetingPresetsResponse")
    public List<TargetingPreset> createTargetingPresets(
        @WebParam(name = "targetingPresets", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411")
        List<TargetingPreset> targetingPresets)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link TargetingPresetPage} of {@link TargetingPreset} objects that satisfy the given
     *         {@link Statement#query}. The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link TargetingPreset#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link TargetingPreset#name}</td>
     *         </tr>
     *         </table>
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202411.TargetingPresetPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411")
    @RequestWrapper(localName = "getTargetingPresetsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411", className = "com.google.api.ads.admanager.jaxws.v202411.TargetingPresetServiceInterfacegetTargetingPresetsByStatement")
    @ResponseWrapper(localName = "getTargetingPresetsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411", className = "com.google.api.ads.admanager.jaxws.v202411.TargetingPresetServiceInterfacegetTargetingPresetsByStatementResponse")
    public TargetingPresetPage getTargetingPresetsByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on the saved targeting objects that match the given {@code filterStatement}.
     *       
     * 
     * @param targetingPresetAction
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202411.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411")
    @RequestWrapper(localName = "performTargetingPresetAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411", className = "com.google.api.ads.admanager.jaxws.v202411.TargetingPresetServiceInterfaceperformTargetingPresetAction")
    @ResponseWrapper(localName = "performTargetingPresetActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411", className = "com.google.api.ads.admanager.jaxws.v202411.TargetingPresetServiceInterfaceperformTargetingPresetActionResponse")
    public UpdateResult performTargetingPresetAction(
        @WebParam(name = "targetingPresetAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411")
        TargetingPresetAction targetingPresetAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link TargetingPreset} objects.
     *       
     * 
     * @param targetingPresets
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202411.TargetingPreset>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411")
    @RequestWrapper(localName = "updateTargetingPresets", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411", className = "com.google.api.ads.admanager.jaxws.v202411.TargetingPresetServiceInterfaceupdateTargetingPresets")
    @ResponseWrapper(localName = "updateTargetingPresetsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411", className = "com.google.api.ads.admanager.jaxws.v202411.TargetingPresetServiceInterfaceupdateTargetingPresetsResponse")
    public List<TargetingPreset> updateTargetingPresets(
        @WebParam(name = "targetingPresets", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411")
        List<TargetingPreset> targetingPresets)
        throws ApiException_Exception
    ;

}
