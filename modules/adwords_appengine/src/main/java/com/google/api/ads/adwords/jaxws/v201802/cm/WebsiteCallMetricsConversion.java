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


package com.google.api.ads.adwords.jaxws.v201802.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A conversion that happens when a user performs the following sequence of actions:
 *             <ul>
 *             <li>Clicks on an advertiser's ad</li>
 *             <li>
 *             Proceeds to the advertiser's website, where special javascript installed on the page
 *             produces a dynamically-generated phone number,
 *             </li>
 *             <li>Calls that number from their home (or other) phone</li>
 *             </ul>
 *           
 * 
 * <p>Java class for WebsiteCallMetricsConversion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebsiteCallMetricsConversion">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}ConversionTracker">
 *       &lt;sequence>
 *         &lt;element name="phoneCallDuration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebsiteCallMetricsConversion", propOrder = {
    "phoneCallDuration"
})
public class WebsiteCallMetricsConversion
    extends ConversionTracker
{

    protected Long phoneCallDuration;

    /**
     * Gets the value of the phoneCallDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPhoneCallDuration() {
        return phoneCallDuration;
    }

    /**
     * Sets the value of the phoneCallDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPhoneCallDuration(Long value) {
        this.phoneCallDuration = value;
    }

}
