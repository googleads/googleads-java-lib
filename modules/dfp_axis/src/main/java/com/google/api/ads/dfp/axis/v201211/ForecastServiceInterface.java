/**
 * ForecastServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201211;

public interface ForecastServiceInterface extends java.rmi.Remote {

    /**
     * Gets a {@link Forecast} on a prospective {@link LineItem} object.
     * Valid
     *         values for {@link LineItem#lineItemType} are
     *         {@link LineItemType#SPONSORSHIP} and {@link LineItemType#STANDARD}.
     * Other
     *         values will result in
     *         {@link ReservationDetailsError.Reason#LINE_ITEM_TYPE_NOT_ALLOWED}.
     * 
     *         
     * @param lineItem the target of the forecast. If {@link LineItem#id}
     * is null
     *         or no line item exists with that ID, a forecast is computed
     * for the
     *         the subject, predicting what would happen if it were added
     * to the
     *         system. If a line item already exists with {@link LineItem#id},
     * the
     *         forecast is computed for the subject, predicting what would
     * happen
     *         if the existing line item's settings were modified to match
     * the
     *         subject.
     *         
     * @return the forecasted traffic estimates
     */
    public com.google.api.ads.dfp.axis.v201211.Forecast getForecast(com.google.api.ads.dfp.axis.v201211.LineItem lineItem) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201211.ApiException;

    /**
     * Gets a {@link Forecast} for an existing {@link LineItem} object.
     * Only
     *         line items having type {@link LineItemType#SPONSORSHIP} or
     * {@link LineItemType#STANDARD} are valid. Other types will result in
     * {@link ReservationDetailsError.Reason#LINE_ITEM_TYPE_NOT_ALLOWED}.
     * 
     *         
     * @param lineItemId the ID of a {@link LineItem} to run the forecast
     * on.
     *         
     * @return the forecasted traffic estimates
     */
    public com.google.api.ads.dfp.axis.v201211.Forecast getForecastById(java.lang.Long lineItemId) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201211.ApiException;
}
