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

/**
 * NetworkServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202408;

public interface NetworkServiceInterface extends java.rmi.Remote {

    /**
     * Returns the list of {@link Network} objects to which the current
     * login has access.
     *         
     *         <p>Intended to be used without a network code in the SOAP
     * header when the login may have more
     *         than one network associated with it.
     */
    public com.google.api.ads.admanager.axis.v202408.Network[] getAllNetworks() throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202408.ApiException;

    /**
     * Returns the current network for which requests are being made.
     */
    public com.google.api.ads.admanager.axis.v202408.Network getCurrentNetwork() throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202408.ApiException;

    /**
     * Returns the default {@link ThirdPartyDataDeclaration} for this
     * network. If this setting has
     *         never been updated on your network, then this API response
     * will be empty.
     */
    public com.google.api.ads.admanager.axis.v202408.ThirdPartyDataDeclaration getDefaultThirdPartyDataDeclaration() throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202408.ApiException;

    /**
     * Creates a new blank network for testing purposes using the
     * current login.
     *         
     *         <p>Each login(i.e. email address) can only have one test network.
     * Data from any of your
     *         existing networks will not be transferred to the new test
     * network. Once the test network is
     *         created, the test network can be used in the API by supplying
     * the {@link Network#networkCode}
     *         in the SOAP header or by logging into the Ad Manager UI.
     *         
     *         <p>Test networks are limited in the following ways:
     *         
     *         <ul>
     *         <li>Test networks cannot serve ads.
     *         <li>Because test networks cannot serve ads, reports will always
     * come back without data.
     *         <li>Since forecasting requires serving history, forecast service
     * results will be faked. See
     *         {@link ForecastService} for more info.
     *         <li>Test networks are, by default, Ad Manager networks and
     * don't have any features from Ad
     *         Manager 360. To have additional features turned on, please
     * contact your account manager.
     *         <li>Test networks are limited to 10,000 objects per entity
     * type.
     *         </ul>
     */
    public com.google.api.ads.admanager.axis.v202408.Network makeTestNetwork() throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202408.ApiException;

    /**
     * Updates the specified network. Currently, only the network
     * display name can be updated.
     */
    public com.google.api.ads.admanager.axis.v202408.Network updateNetwork(com.google.api.ads.admanager.axis.v202408.Network network) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202408.ApiException;
}
