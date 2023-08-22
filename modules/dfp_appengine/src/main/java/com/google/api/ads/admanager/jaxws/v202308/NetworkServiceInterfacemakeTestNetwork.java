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


package com.google.api.ads.admanager.jaxws.v202308;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Creates a new blank network for testing purposes using the current login.
 *             
 *             <p>Each login(i.e. email address) can only have one test network. Data from any of your
 *             existing networks will not be transferred to the new test network. Once the test network is
 *             created, the test network can be used in the API by supplying the {@link Network#networkCode}
 *             in the SOAP header or by logging into the Ad Manager UI.
 *             
 *             <p>Test networks are limited in the following ways:
 *             
 *             <ul>
 *             <li>Test networks cannot serve ads.
 *             <li>Because test networks cannot serve ads, reports will always come back without data.
 *             <li>Since forecasting requires serving history, forecast service results will be faked. See
 *             {@link ForecastService} for more info.
 *             <li>Test networks are, by default, Ad Manager networks and don't have any features from Ad
 *             Manager 360. To have additional features turned on, please contact your account manager.
 *             <li>Test networks are limited to 10,000 objects per entity type.
 *             </ul>
 *           
 * 
 * <p>Java class for makeTestNetwork element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="makeTestNetwork"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *         &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *     &lt;/complexContent&gt;
 *   &lt;/complexType&gt;
 * &lt;/element&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "makeTestNetwork")
public class NetworkServiceInterfacemakeTestNetwork {


}
