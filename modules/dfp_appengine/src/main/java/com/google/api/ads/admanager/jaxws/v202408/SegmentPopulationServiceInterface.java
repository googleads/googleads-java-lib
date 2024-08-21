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
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0.2
 * Generated source version: 2.1
 * 
 */
@WebService(name = "SegmentPopulationServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SegmentPopulationServiceInterface {


    /**
     * 
     *         Returns a list of {@link SegmentPopulationResults} for the given {@code batchUploadIds}.
     *       
     * 
     * @param batchUploadIds
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202408.SegmentPopulationResults>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
    @RequestWrapper(localName = "getSegmentPopulationResultsByIds", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408", className = "com.google.api.ads.admanager.jaxws.v202408.SegmentPopulationServiceInterfacegetSegmentPopulationResultsByIds")
    @ResponseWrapper(localName = "getSegmentPopulationResultsByIdsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408", className = "com.google.api.ads.admanager.jaxws.v202408.SegmentPopulationServiceInterfacegetSegmentPopulationResultsByIdsResponse")
    public List<SegmentPopulationResults> getSegmentPopulationResultsByIds(
        @WebParam(name = "batchUploadIds", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
        List<Long> batchUploadIds)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs an action on the uploads denoted by {@code batchUploadIds}.
     *       
     * 
     * @param batchUploadIds
     * @param action
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202408.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
    @RequestWrapper(localName = "performSegmentPopulationAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408", className = "com.google.api.ads.admanager.jaxws.v202408.SegmentPopulationServiceInterfaceperformSegmentPopulationAction")
    @ResponseWrapper(localName = "performSegmentPopulationActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408", className = "com.google.api.ads.admanager.jaxws.v202408.SegmentPopulationServiceInterfaceperformSegmentPopulationActionResponse")
    public UpdateResult performSegmentPopulationAction(
        @WebParam(name = "action", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
        SegmentPopulationAction action,
        @WebParam(name = "batchUploadIds", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
        List<Long> batchUploadIds)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates identifiers in an audience segment.
     *         
     *         <p>The returned {@link SegmentPopulationRequest#batchUploadId} can be used in subsequent
     *         requests to group them together as part of the same batch. The identifiers associated with a
     *         batch will not be processed until {@link #performSegmentPopulationAction} is called with a
     *         ProcessAction. The batch will expire if ProcessAction is not called within the TTL of 5 days.
     *       
     * 
     * @param updateRequest
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202408.SegmentPopulationResponse
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
    @RequestWrapper(localName = "updateSegmentMemberships", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408", className = "com.google.api.ads.admanager.jaxws.v202408.SegmentPopulationServiceInterfaceupdateSegmentMemberships")
    @ResponseWrapper(localName = "updateSegmentMembershipsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408", className = "com.google.api.ads.admanager.jaxws.v202408.SegmentPopulationServiceInterfaceupdateSegmentMembershipsResponse")
    public SegmentPopulationResponse updateSegmentMemberships(
        @WebParam(name = "updateRequest", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
        SegmentPopulationRequest updateRequest)
        throws ApiException_Exception
    ;

}
