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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Errors related using the AdGroupAdService to create an AdGroupAd
 *             with a reference to an existing AdId.
 *           
 * 
 * <p>Java class for AdSharingError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdSharingError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://adwords.google.com/api/adwords/cm/v201802}AdSharingError.Reason" minOccurs="0"/>
 *         &lt;element name="sharedAdError" type="{https://adwords.google.com/api/adwords/cm/v201802}ApiError" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdSharingError", propOrder = {
    "reason",
    "sharedAdError"
})
public class AdSharingError
    extends ApiError
{

    @XmlSchemaType(name = "string")
    protected AdSharingErrorReason reason;
    protected ApiError sharedAdError;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link AdSharingErrorReason }
     *     
     */
    public AdSharingErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdSharingErrorReason }
     *     
     */
    public void setReason(AdSharingErrorReason value) {
        this.reason = value;
    }

    /**
     * Gets the value of the sharedAdError property.
     * 
     * @return
     *     possible object is
     *     {@link ApiError }
     *     
     */
    public ApiError getSharedAdError() {
        return sharedAdError;
    }

    /**
     * Sets the value of the sharedAdError property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiError }
     *     
     */
    public void setSharedAdError(ApiError value) {
        this.sharedAdError = value;
    }

}
