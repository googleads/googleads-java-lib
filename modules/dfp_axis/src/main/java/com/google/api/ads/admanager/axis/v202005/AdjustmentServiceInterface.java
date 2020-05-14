// Copyright 2020 Google LLC
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
 * AdjustmentServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202005;

public interface AdjustmentServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link ForecastAdjustment} objects.
     *         
     *         <p>This method requires that use of traffic forecast segments
     * and forecast adjustments is
     *         enabled for this network, and will throw an exception if it
     * is not enabled.
     *         
     *         
     * @param forecastAdjustments the forecast adjustments to create
     *         
     * @return the created forecast adjustments with their IDs filled in
     *         
     * @throws ApiException if there is an error creating the forecast adjustments
     */
    public com.google.api.ads.admanager.axis.v202005.ForecastAdjustment[] createForecastAdjustments(com.google.api.ads.admanager.axis.v202005.ForecastAdjustment[] forecastAdjustments) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202005.ApiException;

    /**
     * Creates new {@link TrafficForecastSegment} objects.
     *         
     *         <p>This method requires that use of traffic forecast segments
     * and forecast adjustments is
     *         enabled for this network, and will throw an exception if it
     * is not enabled.
     *         
     *         
     * @param trafficForecastSegments the traffic forecast segments to create
     * 
     * @return the created traffic forecast segments with their IDs filled
     * in
     *         
     * @throws ApiException if there is an error creating the traffic forecast
     * segments
     */
    public com.google.api.ads.admanager.axis.v202005.TrafficForecastSegment[] createTrafficForecastSegments(com.google.api.ads.admanager.axis.v202005.TrafficForecastSegment[] trafficForecastSegments) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202005.ApiException;

    /**
     * Gets a {@link ForecastAdjustmentPage} of {@link ForecastAdjustment}
     * objects that satisfy the
     *         given {@link Statement#query}.
     *         
     *         <p>This method requires that use of traffic forecast segments
     * and forecast adjustments is
     *         enabled for this network, and will throw an exception if it
     * is not enabled.
     *         
     *         <p>The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link ForecastAdjustment#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code trafficForecastSegmentId}</td>
     *         <td>{@link ForecastAdjustment#trafficForecastSegmentId}</td>
     * </tr>
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
     * @param filterStatement a Publisher Query Language statement to filter
     * a list of traffic
     *         forecast segments
     *         
     * @return the forecast adjustments that match the filter
     */
    public com.google.api.ads.admanager.axis.v202005.ForecastAdjustmentPage getForecastAdjustmentsByStatement(com.google.api.ads.admanager.axis.v202005.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202005.ApiException;

    /**
     * Gets a {@link TrafficForecastSegmentPage} of {@link TrafficForecastSegment}
     * objects that
     *         satisfy the given {@link Statement#query}.
     *         
     *         <p>This method requires that use of traffic forecast segments
     * and forecast adjustments is
     *         enabled for this network, and will throw an exception if it
     * is not enabled.
     *         
     *         <p>The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
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
     * @param filterStatement a Publisher Query Language statement to filter
     * a list of traffic
     *         forecast segments
     *         
     * @return the traffic forecast segments that match the filter
     */
    public com.google.api.ads.admanager.axis.v202005.TrafficForecastSegmentPage getTrafficForecastSegmentsByStatement(com.google.api.ads.admanager.axis.v202005.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202005.ApiException;

    /**
     * Performs actions on {@link ForecastAdjustment} objects that
     * match the given {@link
     *         Statement#query}.
     *         
     *         <p>This method requires that use of traffic forecast segments
     * and forecast adjustments is
     *         enabled for this network, and will throw an exception if it
     * is not enabled.
     *         
     *         
     * @param forecastAdjustmentAction the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter a set of forecast
     *         adjustments
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.admanager.axis.v202005.UpdateResult performForecastAdjustmentAction(com.google.api.ads.admanager.axis.v202005.ForecastAdjustmentAction forecastAdjustmentAction, com.google.api.ads.admanager.axis.v202005.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202005.ApiException;

    /**
     * Updates the specified {@link ForecastAdjustment} objects.
     *         
     *         <p>This method requires that use of traffic forecast segments
     * and forecast adjustments is
     *         enabled for this network, and will throw an exception if it
     * is not enabled.
     *         
     *         
     * @param forecastAdjustments the forecast adjustments to update
     *         
     * @return the updated forecast adjustments
     *         
     * @throws ApiException if there is an error updating the forecast adjustments
     */
    public com.google.api.ads.admanager.axis.v202005.ForecastAdjustment[] updateForecastAdjustments(com.google.api.ads.admanager.axis.v202005.ForecastAdjustment[] forecastAdjustments) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202005.ApiException;

    /**
     * Updates the specified {@link TrafficForecastSegment} objects.
     * 
     *         <p>This method requires that use of traffic forecast segments
     * and forecast adjustments is
     *         enabled for this network, and will throw an exception if it
     * is not enabled.
     *         
     *         
     * @param trafficForecastSegments the traffic forecast segments to update
     * 
     * @return the updated traffic forecast segments
     *         
     * @throws ApiException if there is an error updating the traffic forecast
     * segments
     */
    public com.google.api.ads.admanager.axis.v202005.TrafficForecastSegment[] updateTrafficForecastSegments(com.google.api.ads.admanager.axis.v202005.TrafficForecastSegment[] trafficForecastSegments) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202005.ApiException;
}
