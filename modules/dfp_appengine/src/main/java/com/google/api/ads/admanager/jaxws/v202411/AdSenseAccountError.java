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


package com.google.api.ads.admanager.jaxws.v202411;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Error for AdSense related API calls.
 *           
 * 
 * <p>Java class for AdSenseAccountError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdSenseAccountError"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v202411}ApiError"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reason" type="{https://www.google.com/apis/ads/publisher/v202411}AdSenseAccountError.Reason" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdSenseAccountError", propOrder = {
    "reason"
})
public class AdSenseAccountError
    extends ApiError
{

    @XmlSchemaType(name = "string")
    protected AdSenseAccountErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link AdSenseAccountErrorReason }
     *     
     */
    public AdSenseAccountErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdSenseAccountErrorReason }
     *     
     */
    public void setReason(AdSenseAccountErrorReason value) {
        this.reason = value;
    }

}
