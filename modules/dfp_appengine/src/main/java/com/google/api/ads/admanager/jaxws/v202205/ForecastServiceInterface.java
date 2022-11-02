// Copyright 2022 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202205;

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
 *       Provides methods for estimating traffic (clicks/impressions) for line items. Forecasts can be
 *       provided for {@link LineItem} objects that exist in the system or which have not had an ID set
 *       yet.
 *       
 *       <h4>Test network behavior</h4>
 *       
 *       <p>Test networks are unable to provide forecasts that would be comparable to the production
 *       environment because forecasts require traffic history. For test networks, a consistent behavior
 *       can be expected for forecast requests, according to the following rules:
 *       
 *       <table>
 *       <tr>
 *       <th colspan="2">Inputs<br/>({@link LineItem} Fields)</th>
 *       <th colspan="4">Outputs<br/>({@link Forecast} Fields)</th>
 *       </tr>
 *       <tr>
 *       <th>{@link LineItem#lineItemType lineItemType}</th>
 *       <th>{@link LineItem#unitsBought unitsBought}</th>
 *       <th>{@link Forecast#availableUnits availableUnits}</th>
 *       <th>{@link Forecast#forecastUnits forecastUnits (matchedUnits)}</th>
 *       <th>{@link Forecast#deliveredUnits deliveredUnits}</th>
 *       <th>Exception</td>
 *       </tr>
 *       <tr>
 *       <td>Sponsorship</td>
 *       <td>13</td>
 *       <td>&ndash;&ndash;</td>
 *       <td>&ndash;&ndash;</td>
 *       <td>&ndash;&ndash;</td>
 *       <td>
 *       {@link ForecastError.Reason#NO_FORECAST_YET NO_FORECAST_YET}
 *       </td>
 *       </tr>
 *       <tr>
 *       <td>Sponsorship</td>
 *       <td>20</td>
 *       <td>&ndash;&ndash;</td>
 *       <td>&ndash;&ndash;</td>
 *       <td>&ndash;&ndash;</td>
 *       <td>
 *       {@link ForecastError.Reason#SERVER_NOT_AVAILABLE SERVER_NOT_AVAILABLE}
 *       </td>
 *       </tr>
 *       <tr>
 *       <td>Sponsorship</td>
 *       <td>50</td>
 *       <td>1,200,000</td>
 *       <td>6,000,000</td>
 *       <td>600,000</td>
 *       <td>&ndash;&ndash;</td>
 *       </tr>
 *       <tr>
 *       <td>Sponsorship</td>
 *       <td>!= 20 and <br/> != 50</td>
 *       <td>1,200,000</td>
 *       <td>1,200,000</td>
 *       <td>600,000</td>
 *       <td>&ndash;&ndash;</td>
 *       </tr>
 *       <tr>
 *       <td>Not Sponsorship</td>
 *       <td>&lt;= 500,000</td>
 *       <td>3 * unitsBought / 2</td>
 *       <td>unitsBought * 6</td>
 *       <td>600,000</td>
 *       <td>&ndash;&ndash;</td>
 *       </tr>
 *       <tr>
 *       <td>Not Sponsorship</td>
 *       <td>&gt; 500,000 and &lt;= 1,000,000</td>
 *       <td>unitsBought / 2</td>
 *       <td>unitsBought * 6</td>
 *       <td>600,000</td>
 *       <td>&ndash;&ndash;</td>
 *       </tr>
 *       <tr>
 *       <td>Not Sponsorship</td>
 *       <td>&gt; 1,000,000 and &lt;= 1,500,000</td>
 *       <td>unitsBought / 2</td>
 *       <td>3 * unitsBought / 2</td>
 *       <td>600,000</td>
 *       <td>&ndash;&ndash;</td>
 *       </tr>
 *       <tr>
 *       <td>Not Sponsorship</td>
 *       <td>&gt; 1,500,000</td>
 *       <td>unitsBought / 4</td>
 *       <td>3 * unitsBought / 2</td>
 *       <td>600,000</td>
 *       <td>&ndash;&ndash;</td>
 *       </tr>
 *       </table>
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ForecastServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v202205")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ForecastServiceInterface {


    /**
     * 
     *         Gets the availability forecast for a {@link ProspectiveLineItem}. An availability forecast
     *         reports the maximum number of available units that the line item can book, and the total number
     *         of units matching the line item's targeting.
     *       
     * 
     * @param lineItem
     * @param forecastOptions
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202205.AvailabilityForecast
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202205")
    @RequestWrapper(localName = "getAvailabilityForecast", targetNamespace = "https://www.google.com/apis/ads/publisher/v202205", className = "com.google.api.ads.admanager.jaxws.v202205.ForecastServiceInterfacegetAvailabilityForecast")
    @ResponseWrapper(localName = "getAvailabilityForecastResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202205", className = "com.google.api.ads.admanager.jaxws.v202205.ForecastServiceInterfacegetAvailabilityForecastResponse")
    public AvailabilityForecast getAvailabilityForecast(
        @WebParam(name = "lineItem", targetNamespace = "https://www.google.com/apis/ads/publisher/v202205")
        ProspectiveLineItem lineItem,
        @WebParam(name = "forecastOptions", targetNamespace = "https://www.google.com/apis/ads/publisher/v202205")
        AvailabilityForecastOptions forecastOptions)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets an {@link AvailabilityForecast} for an existing {@link LineItem} object. An availability
     *         forecast reports the maximum number of available units that the line item can be booked with,
     *         and also the total number of units matching the line item's targeting.
     *         
     *         <p>Only line items having type {@link LineItemType#SPONSORSHIP} or {@link
     *         LineItemType#STANDARD} are valid. Other types will result in {@link
     *         ReservationDetailsError.Reason#LINE_ITEM_TYPE_NOT_ALLOWED}.
     *       
     * 
     * @param forecastOptions
     * @param lineItemId
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202205.AvailabilityForecast
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202205")
    @RequestWrapper(localName = "getAvailabilityForecastById", targetNamespace = "https://www.google.com/apis/ads/publisher/v202205", className = "com.google.api.ads.admanager.jaxws.v202205.ForecastServiceInterfacegetAvailabilityForecastById")
    @ResponseWrapper(localName = "getAvailabilityForecastByIdResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202205", className = "com.google.api.ads.admanager.jaxws.v202205.ForecastServiceInterfacegetAvailabilityForecastByIdResponse")
    public AvailabilityForecast getAvailabilityForecastById(
        @WebParam(name = "lineItemId", targetNamespace = "https://www.google.com/apis/ads/publisher/v202205")
        Long lineItemId,
        @WebParam(name = "forecastOptions", targetNamespace = "https://www.google.com/apis/ads/publisher/v202205")
        AvailabilityForecastOptions forecastOptions)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets the delivery forecast for a list of {@link ProspectiveLineItem} objects in a single
     *         delivery simulation with line items potentially contending with each other. A delivery forecast
     *         reports the number of units that will be delivered to each line item given the line item goals
     *         and contentions from other line items.
     *       
     * 
     * @param lineItems
     * @param forecastOptions
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202205.DeliveryForecast
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202205")
    @RequestWrapper(localName = "getDeliveryForecast", targetNamespace = "https://www.google.com/apis/ads/publisher/v202205", className = "com.google.api.ads.admanager.jaxws.v202205.ForecastServiceInterfacegetDeliveryForecast")
    @ResponseWrapper(localName = "getDeliveryForecastResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202205", className = "com.google.api.ads.admanager.jaxws.v202205.ForecastServiceInterfacegetDeliveryForecastResponse")
    public DeliveryForecast getDeliveryForecast(
        @WebParam(name = "lineItems", targetNamespace = "https://www.google.com/apis/ads/publisher/v202205")
        List<ProspectiveLineItem> lineItems,
        @WebParam(name = "forecastOptions", targetNamespace = "https://www.google.com/apis/ads/publisher/v202205")
        DeliveryForecastOptions forecastOptions)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets the delivery forecast for a list of existing {@link LineItem} objects in a single
     *         delivery simulation. A delivery forecast reports the number of units that will be delivered
     *         to each line item given the line item goals and contentions from other line items.
     *       
     * 
     * @param forecastOptions
     * @param lineItemIds
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202205.DeliveryForecast
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202205")
    @RequestWrapper(localName = "getDeliveryForecastByIds", targetNamespace = "https://www.google.com/apis/ads/publisher/v202205", className = "com.google.api.ads.admanager.jaxws.v202205.ForecastServiceInterfacegetDeliveryForecastByIds")
    @ResponseWrapper(localName = "getDeliveryForecastByIdsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202205", className = "com.google.api.ads.admanager.jaxws.v202205.ForecastServiceInterfacegetDeliveryForecastByIdsResponse")
    public DeliveryForecast getDeliveryForecastByIds(
        @WebParam(name = "lineItemIds", targetNamespace = "https://www.google.com/apis/ads/publisher/v202205")
        List<Long> lineItemIds,
        @WebParam(name = "forecastOptions", targetNamespace = "https://www.google.com/apis/ads/publisher/v202205")
        DeliveryForecastOptions forecastOptions)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns forecasted and historical traffic data for the segment of traffic specified by the
     *         provided request.
     *         
     *         <p>Calling this endpoint programmatically is only available for Ad Manager 360 networks.
     *       
     * 
     * @param trafficDataRequest
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202205.TrafficDataResponse
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202205")
    @RequestWrapper(localName = "getTrafficData", targetNamespace = "https://www.google.com/apis/ads/publisher/v202205", className = "com.google.api.ads.admanager.jaxws.v202205.ForecastServiceInterfacegetTrafficData")
    @ResponseWrapper(localName = "getTrafficDataResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202205", className = "com.google.api.ads.admanager.jaxws.v202205.ForecastServiceInterfacegetTrafficDataResponse")
    public TrafficDataResponse getTrafficData(
        @WebParam(name = "trafficDataRequest", targetNamespace = "https://www.google.com/apis/ads/publisher/v202205")
        TrafficDataRequest trafficDataRequest)
        throws ApiException_Exception
    ;

}
