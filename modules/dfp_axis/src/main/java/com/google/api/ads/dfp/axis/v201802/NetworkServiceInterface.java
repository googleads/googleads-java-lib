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
 * NetworkServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public interface NetworkServiceInterface extends java.rmi.Remote {

    /**
     * Returns the list of {@link Network} objects to which the current
     * login has
     *         access.
     *         <p>
     *         Intended to be used without a network code in the SOAP header
     * when the
     *         login may have more than one network associated with it.
     *         </p>
     *         
     *         
     * @return the networks to which the current login has access
     */
    public com.google.api.ads.dfp.axis.v201802.Network[] getAllNetworks() throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Returns the current network for which requests are being made.
     * 
     *         
     * @return the network for which the user is currently making the request
     */
    public com.google.api.ads.dfp.axis.v201802.Network getCurrentNetwork() throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Creates a new blank network for testing purposes using the
     * current login.
     *         <p>
     *         Each login(i.e. email address) can only have one test network.
     * Data from
     *         any of your existing networks will not be transferred to the
     * new test network.
     *         Once the test network is created, the test network can be
     * used in the API
     *         by supplying the {@link Network#networkCode} in the SOAP header
     * or by
     *         logging into the DFP UI.
     *         <p>
     *         Test networks are limited in the following ways:
     *         <ul>
     *         <li>Test networks cannot serve ads.</li>
     *         <li>Because test networks cannot serve ads, reports will always
     * come
     *         back without data.</li>
     *         <li>Since forecasting requires serving history, forecast service
     * results
     *         will be faked. See {@link ForecastService} for more info.</li>
     * <li>Test networks are, by default, small business networks and do
     * not have any
     *         premium features. To have additional features turned on, please
     * contact your
     *         account manager. </li>
     *         <li>Test networks are limited to 10,000 objects per entity
     * type.</li>
     *         </ul>
     *         </p>
     */
    public com.google.api.ads.dfp.axis.v201802.Network makeTestNetwork() throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Updates the specified network. Currently, only the network
     * display name can
     *         be updated.
     *         
     *         
     * @param network the network that needs to be updated
     *         
     * @return the updated network
     */
    public com.google.api.ads.dfp.axis.v201802.Network updateNetwork(com.google.api.ads.dfp.axis.v201802.Network network) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;
}
