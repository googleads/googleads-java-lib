// Copyright 2023 Google LLC
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
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202311;

public interface AdjustmentServiceInterface extends java.rmi.Remote {

    /**
     * Takes a prospective forecast adjustment and calculates the
     * daily ad opportunity counts
     *         corresponding to its provided volume settings.
     */
    public com.google.api.ads.admanager.axis.v202311.ForecastAdjustment calculateDailyAdOpportunityCounts(com.google.api.ads.admanager.axis.v202311.ForecastAdjustment forecastAdjustment) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202311.ApiException;

    /**
     * Creates new {@link ForecastAdjustment} objects.
     */
    public com.google.api.ads.admanager.axis.v202311.ForecastAdjustment[] createForecastAdjustments(com.google.api.ads.admanager.axis.v202311.ForecastAdjustment[] forecastAdjustments) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202311.ApiException;

    /**
     * Creates new {@link TrafficForecastSegment} objects.
     */
    public com.google.api.ads.admanager.axis.v202311.TrafficForecastSegment[] createTrafficForecastSegments(com.google.api.ads.admanager.axis.v202311.TrafficForecastSegment[] trafficForecastSegments) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202311.ApiException;

    /**
     * Gets a {@link ForecastAdjustmentPage} of {@link ForecastAdjustment}
     * objects that satisfy the
     *         given {@link Statement#query}.
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
     */
    public com.google.api.ads.admanager.axis.v202311.ForecastAdjustmentPage getForecastAdjustmentsByStatement(com.google.api.ads.admanager.axis.v202311.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202311.ApiException;

    /**
     * Gets a {@link TrafficForecastSegmentPage} of {@link TrafficForecastSegment}
     * objects that
     *         satisfy the given {@link Statement#query}.
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
     */
    public com.google.api.ads.admanager.axis.v202311.TrafficForecastSegmentPage getTrafficForecastSegmentsByStatement(com.google.api.ads.admanager.axis.v202311.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202311.ApiException;

    /**
     * Performs actions on {@link ForecastAdjustment} objects that
     * match the given {@link
     *         Statement#query}.
     */
    public com.google.api.ads.admanager.axis.v202311.UpdateResult performForecastAdjustmentAction(com.google.api.ads.admanager.axis.v202311.ForecastAdjustmentAction forecastAdjustmentAction, com.google.api.ads.admanager.axis.v202311.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202311.ApiException;

    /**
     * Updates the specified {@link ForecastAdjustment} objects.
     */
    public com.google.api.ads.admanager.axis.v202311.ForecastAdjustment[] updateForecastAdjustments(com.google.api.ads.admanager.axis.v202311.ForecastAdjustment[] forecastAdjustments) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202311.ApiException;

    /**
     * Updates the specified {@link TrafficForecastSegment} objects.
     */
    public com.google.api.ads.admanager.axis.v202311.TrafficForecastSegment[] updateTrafficForecastSegments(com.google.api.ads.admanager.axis.v202311.TrafficForecastSegment[] trafficForecastSegments) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202311.ApiException;
}
