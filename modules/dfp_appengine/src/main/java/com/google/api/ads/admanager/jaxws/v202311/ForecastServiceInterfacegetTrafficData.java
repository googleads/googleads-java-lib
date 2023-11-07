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


package com.google.api.ads.admanager.jaxws.v202311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Returns forecasted and historical traffic data for the segment of traffic specified by the
 *             provided request.
 *             
 *             <p>Calling this endpoint programmatically is only available for Ad Manager 360 networks.
 *           
 * 
 * <p>Java class for getTrafficData element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getTrafficData"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="trafficDataRequest" type="{https://www.google.com/apis/ads/publisher/v202311}TrafficDataRequest" minOccurs="0"/&gt;
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
@XmlType(name = "", propOrder = {
    "trafficDataRequest"
})
@XmlRootElement(name = "getTrafficData")
public class ForecastServiceInterfacegetTrafficData {

    protected TrafficDataRequest trafficDataRequest;

    /**
     * Gets the value of the trafficDataRequest property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficDataRequest }
     *     
     */
    public TrafficDataRequest getTrafficDataRequest() {
        return trafficDataRequest;
    }

    /**
     * Sets the value of the trafficDataRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficDataRequest }
     *     
     */
    public void setTrafficDataRequest(TrafficDataRequest value) {
        this.trafficDataRequest = value;
    }

}
