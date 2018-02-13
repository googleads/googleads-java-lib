// Copyright 2018 Google Inc. All Rights Reserved.
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
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public interface ForecastServiceInterface extends java.rmi.Remote {

    /**
     * Gets the availability forecast for a {@link ProspectiveLineItem}.
     * An availability forecast
     *         reports the maximum number of available units that the line
     * item can book, and the total number
     *         of units matching the line item's targeting.
     *         
     *         
     * @param lineItem the prospective line item (new or existing) to be
     * forecasted for availability
     *         
     * @param forecastOptions options controlling the forecast
     */
    public com.google.api.ads.dfp.axis.v201802.AvailabilityForecast getAvailabilityForecast(com.google.api.ads.dfp.axis.v201802.ProspectiveLineItem lineItem, com.google.api.ads.dfp.axis.v201802.AvailabilityForecastOptions forecastOptions) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

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
     * 
     *         
     * @param lineItemId the ID of a {@link LineItem} to run the forecast
     * on.
     *         
     * @param forecastOptions options controlling the forecast
     */
    public com.google.api.ads.dfp.axis.v201802.AvailabilityForecast getAvailabilityForecastById(java.lang.Long lineItemId, com.google.api.ads.dfp.axis.v201802.AvailabilityForecastOptions forecastOptions) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Gets the delivery forecast for a list of {@link ProspectiveLineItem}
     * objects in a single
     *         delivery simulation with line items potentially contending
     * with each other. A delivery forecast
     *         reports the number of units that will be delivered to each
     * line item given the line item goals
     *         and contentions from other line items.
     *         
     *         
     * @param lineItems line items to be forecasted for delivery
     *         
     * @param forecastOptions options controlling the forecast
     */
    public com.google.api.ads.dfp.axis.v201802.DeliveryForecast getDeliveryForecast(com.google.api.ads.dfp.axis.v201802.ProspectiveLineItem[] lineItems, com.google.api.ads.dfp.axis.v201802.DeliveryForecastOptions forecastOptions) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Gets the delivery forecast for a list of existing {@link LineItem}
     * objects in a single
     *         delivery simulation. A delivery forecast reports the number
     * of units that will be delivered
     *         to each line item given the line item goals and contentions
     * from other line items.
     *         
     *         
     * @param lineItemIds the IDs of line items to be forecasted for delivery
     * 
     * @param forecastOptions options controlling the forecast
     */
    public com.google.api.ads.dfp.axis.v201802.DeliveryForecast getDeliveryForecastByIds(long[] lineItemIds, com.google.api.ads.dfp.axis.v201802.DeliveryForecastOptions forecastOptions) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;
}
