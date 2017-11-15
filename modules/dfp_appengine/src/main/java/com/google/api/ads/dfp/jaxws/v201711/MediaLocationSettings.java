// Copyright 2017 Google Inc. All Rights Reserved.
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


package com.google.api.ads.dfp.jaxws.v201711;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Configuration that associates a media location with a security policy and the authentication
 *             credentials needed to access the content.
 *           
 * 
 * <p>Java class for MediaLocationSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaLocationSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="securityPolicy" type="{https://www.google.com/apis/ads/publisher/v201711}SecurityPolicySettings" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaLocationSettings", propOrder = {
    "name",
    "urlPrefix",
    "securityPolicy"
})
public class MediaLocationSettings {

    protected String name;
    protected String urlPrefix;
    protected SecurityPolicySettings securityPolicy;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the urlPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlPrefix() {
        return urlPrefix;
    }

    /**
     * Sets the value of the urlPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlPrefix(String value) {
        this.urlPrefix = value;
    }

    /**
     * Gets the value of the securityPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityPolicySettings }
     *     
     */
    public SecurityPolicySettings getSecurityPolicy() {
        return securityPolicy;
    }

    /**
     * Sets the value of the securityPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityPolicySettings }
     *     
     */
    public void setSecurityPolicy(SecurityPolicySettings value) {
        this.securityPolicy = value;
    }

}
