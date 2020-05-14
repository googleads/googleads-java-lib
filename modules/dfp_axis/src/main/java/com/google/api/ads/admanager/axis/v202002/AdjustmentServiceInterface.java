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

package com.google.api.ads.admanager.axis.v202002;

public interface AdjustmentServiceInterface extends java.rmi.Remote {

    /**
     * Returns a {@link TrafficForecastAdjustmentPage} of all {@link
     * TrafficForecastAdjustment}s that
     *         satisfy the given {@link Statement#query}.
     *         
     *         <p>This method is incompatible with the use of traffic forecast
     * segments and forecast
     *         adjustments. It will throw an exception if that use is enabled
     * for this network.
     *         
     *         <p>The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link TrafficForecastAdjustment#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link TrafficForecastAdjustment#lastModifiedDateTime}</td>
     * </tr>
     *         </table>
     */
    public com.google.api.ads.admanager.axis.v202002.TrafficForecastAdjustmentPage getTrafficAdjustmentsByStatement(com.google.api.ads.admanager.axis.v202002.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202002.ApiException;

    /**
     * Saves all of the provided traffic adjustments.
     *         
     *         <p>If there is already a {@link TrafficForecastAdjustment}
     * saved for the same {@link
     *         TrafficTimeSeriesFilterCriteria}, the pre-existing {@link
     * TrafficForecastAdjustment} will be
     *         completely replaced with the submitted {@link TrafficForecastAdjustment}.
     * 
     *         <p>This method is only available when MAKE_TRAFFIC_FORECAST_ADJUSTMENTS_IN_BULK
     * is enabled in
     *         the global settings on your network.
     *         
     *         <p>This method is incompatible with the use of traffic forecast
     * segments and forecast
     *         adjustments. It will throw an exception if that use is enabled
     * for this network.
     */
    public com.google.api.ads.admanager.axis.v202002.TrafficForecastAdjustment[] updateTrafficAdjustments(com.google.api.ads.admanager.axis.v202002.TrafficForecastAdjustment[] adjustments) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202002.ApiException;
}
