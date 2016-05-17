/**
 * ForecastServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201605;

public interface ForecastServiceInterface extends java.rmi.Remote {

    /**
     * Gets the availability forecast for a {@link ProspectiveLineItem}.
     * An availability forecast
     *         reports the maximum number of available units that the line
     * item can book, and the total
     *         number of units matching the line item's targeting.
     *         
     *         <p>Note: Beginning in v201502, this replaces the previous
     * getForecast method.
     *         
     *         
     * @param lineItem the prospective line item (new or existing) to be
     * forecasted for availability
     *         
     * @param forecastOptions options controlling the forecast
     */
    public com.google.api.ads.dfp.axis.v201605.AvailabilityForecast getAvailabilityForecast(com.google.api.ads.dfp.axis.v201605.ProspectiveLineItem lineItem, com.google.api.ads.dfp.axis.v201605.AvailabilityForecastOptions forecastOptions) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201605.ApiException;

    /**
     * Gets an {@link AvailabilityForecast} for an existing {@link
     * LineItem} object.
     *         An availability forecast reports the maximum number of available
     * units that the line item can
     *         be booked with, and also the total number of units matching
     * the line item's targeting.
     *         
     *         <p>Only line items having type {@link LineItemType#SPONSORSHIP}
     * or
     *         {@link LineItemType#STANDARD} are valid. Other types will
     * result in
     *         {@link ReservationDetailsError.Reason#LINE_ITEM_TYPE_NOT_ALLOWED}.
     * 
     *         <p>Note: Beginning in v201502, this replaces the previous
     * getForecastById method.
     *         
     *         
     * @param lineItemId the ID of a {@link LineItem} to run the forecast
     * on.
     *         
     * @param forecastOptions options controlling the forecast
     */
    public com.google.api.ads.dfp.axis.v201605.AvailabilityForecast getAvailabilityForecastById(java.lang.Long lineItemId, com.google.api.ads.dfp.axis.v201605.AvailabilityForecastOptions forecastOptions) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201605.ApiException;

    /**
     * Gets the delivery forecast for a list of {@link ProspectiveLineItem}
     * objects in a single
     *         delivery simulation with line items potentially contending
     * with each other. A delivery
     *         forecast reports the number of units that will be delivered
     * to each line item given the line
     *         item goals and contentions from other line items.
     *         
     *         
     * @param lineItems line items to be forecasted for delivery
     *         
     * @param forecastOptions options controlling the forecast
     */
    public com.google.api.ads.dfp.axis.v201605.DeliveryForecast getDeliveryForecast(com.google.api.ads.dfp.axis.v201605.ProspectiveLineItem[] lineItems, com.google.api.ads.dfp.axis.v201605.DeliveryForecastOptions forecastOptions) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201605.ApiException;

    /**
     * Gets the delivery forecast for a list of existing {@link LineItem}
     * objects in a single
     *         delivery simulation with line items potentially contending
     * with each other. A delivery
     *         forecast reports the number of units that will be delivered
     * to each line item given the line
     *         item goals and contentions from other line items.
     *         
     *         
     * @param lineItemIds the IDs of line items to be forecasted for delivery
     * 
     * @param forecastOptions options controlling the forecast
     */
    public com.google.api.ads.dfp.axis.v201605.DeliveryForecast getDeliveryForecastByIds(long[] lineItemIds, com.google.api.ads.dfp.axis.v201605.DeliveryForecastOptions forecastOptions) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201605.ApiException;
}
