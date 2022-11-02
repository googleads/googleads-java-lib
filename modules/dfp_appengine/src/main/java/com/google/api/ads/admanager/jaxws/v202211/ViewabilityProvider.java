// Copyright 2022 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202211;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Information required for {@link Company} of Type VIEWABILITY_PROVIDER. It contains all of the
 *             data needed to capture viewability metrics.
 *           
 * 
 * <p>Java class for ViewabilityProvider complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewabilityProvider">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vendorKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="verificationScriptUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="verificationParameters" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="verificationRejectionTrackerUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewabilityProvider", propOrder = {
    "vendorKey",
    "verificationScriptUrl",
    "verificationParameters",
    "verificationRejectionTrackerUrl"
})
public class ViewabilityProvider {

    protected String vendorKey;
    protected String verificationScriptUrl;
    protected String verificationParameters;
    protected String verificationRejectionTrackerUrl;

    /**
     * Gets the value of the vendorKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorKey() {
        return vendorKey;
    }

    /**
     * Sets the value of the vendorKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorKey(String value) {
        this.vendorKey = value;
    }

    /**
     * Gets the value of the verificationScriptUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerificationScriptUrl() {
        return verificationScriptUrl;
    }

    /**
     * Sets the value of the verificationScriptUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerificationScriptUrl(String value) {
        this.verificationScriptUrl = value;
    }

    /**
     * Gets the value of the verificationParameters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerificationParameters() {
        return verificationParameters;
    }

    /**
     * Sets the value of the verificationParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerificationParameters(String value) {
        this.verificationParameters = value;
    }

    /**
     * Gets the value of the verificationRejectionTrackerUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerificationRejectionTrackerUrl() {
        return verificationRejectionTrackerUrl;
    }

    /**
     * Sets the value of the verificationRejectionTrackerUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerificationRejectionTrackerUrl(String value) {
        this.verificationRejectionTrackerUrl = value;
    }

}
