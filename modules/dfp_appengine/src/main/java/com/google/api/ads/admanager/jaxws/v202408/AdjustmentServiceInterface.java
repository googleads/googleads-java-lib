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
 *       Provides methods for creating, updating, and retrieving {@link ForecastAdjustment}s and {@link
 *       TrafficForecastSegment}s.
 *       
 *       <p>Forecast adjustments allow editing the volume and traffic composition of forecasted inventory.
 *       Traffic forecast segments divide forecasted inventory into segments to which forecast adjustments
 *       can be applied.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0.2
 * Generated source version: 2.1
 * 
 */
@WebService(name = "AdjustmentServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AdjustmentServiceInterface {


    /**
     * 
     *         Takes a prospective forecast adjustment and calculates the daily ad opportunity counts
     *         corresponding to its provided volume settings.
     *       
     * 
     * @param forecastAdjustment
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202408.ForecastAdjustment
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
    @RequestWrapper(localName = "calculateDailyAdOpportunityCounts", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408", className = "com.google.api.ads.admanager.jaxws.v202408.AdjustmentServiceInterfacecalculateDailyAdOpportunityCounts")
    @ResponseWrapper(localName = "calculateDailyAdOpportunityCountsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408", className = "com.google.api.ads.admanager.jaxws.v202408.AdjustmentServiceInterfacecalculateDailyAdOpportunityCountsResponse")
    public ForecastAdjustment calculateDailyAdOpportunityCounts(
        @WebParam(name = "forecastAdjustment", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
        ForecastAdjustment forecastAdjustment)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Creates new {@link ForecastAdjustment} objects.
     *       
     * 
     * @param forecastAdjustments
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202408.ForecastAdjustment>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
    @RequestWrapper(localName = "createForecastAdjustments", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408", className = "com.google.api.ads.admanager.jaxws.v202408.AdjustmentServiceInterfacecreateForecastAdjustments")
    @ResponseWrapper(localName = "createForecastAdjustmentsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408", className = "com.google.api.ads.admanager.jaxws.v202408.AdjustmentServiceInterfacecreateForecastAdjustmentsResponse")
    public List<ForecastAdjustment> createForecastAdjustments(
        @WebParam(name = "forecastAdjustments", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
        List<ForecastAdjustment> forecastAdjustments)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Creates new {@link TrafficForecastSegment} objects.
     *       
     * 
     * @param trafficForecastSegments
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202408.TrafficForecastSegment>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
    @RequestWrapper(localName = "createTrafficForecastSegments", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408", className = "com.google.api.ads.admanager.jaxws.v202408.AdjustmentServiceInterfacecreateTrafficForecastSegments")
    @ResponseWrapper(localName = "createTrafficForecastSegmentsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408", className = "com.google.api.ads.admanager.jaxws.v202408.AdjustmentServiceInterfacecreateTrafficForecastSegmentsResponse")
    public List<TrafficForecastSegment> createTrafficForecastSegments(
        @WebParam(name = "trafficForecastSegments", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
        List<TrafficForecastSegment> trafficForecastSegments)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link ForecastAdjustmentPage} of {@link ForecastAdjustment} objects that satisfy the
     *         given {@link Statement#query}.
     *         
     *         <p>The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link ForecastAdjustment#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code trafficForecastSegmentId}</td>
     *         <td>{@link ForecastAdjustment#trafficForecastSegmentId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link ForecastAdjustment#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code startDate}</td>
     *         <td>{@link ForecastAdjustment#startDate}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code endDate}</td>
     *         <td>{@link ForecastAdjustment#endDate}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link ForecastAdjustment#status}</td>
     *         </tr>
     *         </table>
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202408.ForecastAdjustmentPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
    @RequestWrapper(localName = "getForecastAdjustmentsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408", className = "com.google.api.ads.admanager.jaxws.v202408.AdjustmentServiceInterfacegetForecastAdjustmentsByStatement")
    @ResponseWrapper(localName = "getForecastAdjustmentsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408", className = "com.google.api.ads.admanager.jaxws.v202408.AdjustmentServiceInterfacegetForecastAdjustmentsByStatementResponse")
    public ForecastAdjustmentPage getForecastAdjustmentsByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link TrafficForecastSegmentPage} of {@link TrafficForecastSegment} objects that
     *         satisfy the given {@link Statement#query}.
     *         
     *         <p>The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link TrafficForecastSegment#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link TrafficForecastSegment#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code creationTime}</td>
     *         <td>{@link TrafficForecastSegment#creationTime}</td>
     *         </tr>
     *         </table>
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202408.TrafficForecastSegmentPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
    @RequestWrapper(localName = "getTrafficForecastSegmentsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408", className = "com.google.api.ads.admanager.jaxws.v202408.AdjustmentServiceInterfacegetTrafficForecastSegmentsByStatement")
    @ResponseWrapper(localName = "getTrafficForecastSegmentsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408", className = "com.google.api.ads.admanager.jaxws.v202408.AdjustmentServiceInterfacegetTrafficForecastSegmentsByStatementResponse")
    public TrafficForecastSegmentPage getTrafficForecastSegmentsByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link ForecastAdjustment} objects that match the given {@link
     *         Statement#query}.
     *       
     * 
     * @param forecastAdjustmentAction
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202408.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
    @RequestWrapper(localName = "performForecastAdjustmentAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408", className = "com.google.api.ads.admanager.jaxws.v202408.AdjustmentServiceInterfaceperformForecastAdjustmentAction")
    @ResponseWrapper(localName = "performForecastAdjustmentActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408", className = "com.google.api.ads.admanager.jaxws.v202408.AdjustmentServiceInterfaceperformForecastAdjustmentActionResponse")
    public UpdateResult performForecastAdjustmentAction(
        @WebParam(name = "forecastAdjustmentAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
        ForecastAdjustmentAction forecastAdjustmentAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link ForecastAdjustment} objects.
     *       
     * 
     * @param forecastAdjustments
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202408.ForecastAdjustment>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
    @RequestWrapper(localName = "updateForecastAdjustments", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408", className = "com.google.api.ads.admanager.jaxws.v202408.AdjustmentServiceInterfaceupdateForecastAdjustments")
    @ResponseWrapper(localName = "updateForecastAdjustmentsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408", className = "com.google.api.ads.admanager.jaxws.v202408.AdjustmentServiceInterfaceupdateForecastAdjustmentsResponse")
    public List<ForecastAdjustment> updateForecastAdjustments(
        @WebParam(name = "forecastAdjustments", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
        List<ForecastAdjustment> forecastAdjustments)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link TrafficForecastSegment} objects.
     *       
     * 
     * @param trafficForecastSegments
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202408.TrafficForecastSegment>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
    @RequestWrapper(localName = "updateTrafficForecastSegments", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408", className = "com.google.api.ads.admanager.jaxws.v202408.AdjustmentServiceInterfaceupdateTrafficForecastSegments")
    @ResponseWrapper(localName = "updateTrafficForecastSegmentsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408", className = "com.google.api.ads.admanager.jaxws.v202408.AdjustmentServiceInterfaceupdateTrafficForecastSegmentsResponse")
    public List<TrafficForecastSegment> updateTrafficForecastSegments(
        @WebParam(name = "trafficForecastSegments", targetNamespace = "https://www.google.com/apis/ads/publisher/v202408")
        List<TrafficForecastSegment> trafficForecastSegments)
        throws ApiException_Exception
    ;

}
