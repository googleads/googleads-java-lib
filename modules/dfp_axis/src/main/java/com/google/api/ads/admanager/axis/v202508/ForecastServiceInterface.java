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

/**
 * ForecastServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202508;

public interface ForecastServiceInterface extends java.rmi.Remote {

    /**
     * Gets the availability forecast for a {@link ProspectiveLineItem}.
     * An availability forecast
     *         reports the maximum number of available units that the line
     * item can book, and the total number
     *         of units matching the line item's targeting.
     */
    public com.google.api.ads.admanager.axis.v202508.AvailabilityForecast getAvailabilityForecast(com.google.api.ads.admanager.axis.v202508.ProspectiveLineItem lineItem, com.google.api.ads.admanager.axis.v202508.AvailabilityForecastOptions forecastOptions) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202508.ApiException;

    /**
     * Gets an {@link AvailabilityForecast} for an existing {@link
     * LineItem} object. An availability
     *         forecast reports the maximum number of available units that
     * the line item can be booked with,
     *         and also the total number of units matching the line item's
     * targeting.
     *         
     *         <p>Only line items having type {@link LineItemType#SPONSORSHIP}
     * or {@link
     *         LineItemType#STANDARD} are valid. Other types will result
     * in {@link
     *         ReservationDetailsError.Reason#LINE_ITEM_TYPE_NOT_ALLOWED}.
     */
    public com.google.api.ads.admanager.axis.v202508.AvailabilityForecast getAvailabilityForecastById(java.lang.Long lineItemId, com.google.api.ads.admanager.axis.v202508.AvailabilityForecastOptions forecastOptions) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202508.ApiException;

    /**
     * Gets the delivery forecast for a list of {@link ProspectiveLineItem}
     * objects in a single
     *         delivery simulation with line items potentially contending
     * with each other. A delivery forecast
     *         reports the number of units that will be delivered to each
     * line item given the line item goals
     *         and contentions from other line items.
     */
    public com.google.api.ads.admanager.axis.v202508.DeliveryForecast getDeliveryForecast(com.google.api.ads.admanager.axis.v202508.ProspectiveLineItem[] lineItems, com.google.api.ads.admanager.axis.v202508.DeliveryForecastOptions forecastOptions) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202508.ApiException;

    /**
     * Gets the delivery forecast for a list of existing {@link LineItem}
     * objects in a single delivery
     *         simulation. A delivery forecast reports the number of units
     * that will be delivered to each line
     *         item given the line item goals and contentions from other
     * line items.
     */
    public com.google.api.ads.admanager.axis.v202508.DeliveryForecast getDeliveryForecastByIds(long[] lineItemIds, com.google.api.ads.admanager.axis.v202508.DeliveryForecastOptions forecastOptions) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202508.ApiException;

    /**
     * Returns forecasted and historical traffic data for the segment
     * of traffic specified by the
     *         provided request.
     *         
     *         <p>Calling this endpoint programmatically is only available
     * for Ad Manager 360 networks.
     */
    public com.google.api.ads.admanager.axis.v202508.TrafficDataResponse getTrafficData(com.google.api.ads.admanager.axis.v202508.TrafficDataRequest trafficDataRequest) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202508.ApiException;
}
