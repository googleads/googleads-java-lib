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


package com.google.api.ads.dfp.jaxws.v201802;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A set of security requirements to authenticate against in order to access video content.
 *             Different locations (e.g. different CDNs) can have different security policies.
 *           
 * 
 * <p>Java class for SecurityPolicySettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityPolicySettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="securityPolicyType" type="{https://www.google.com/apis/ads/publisher/v201802}SecurityPolicyType" minOccurs="0"/>
 *         &lt;element name="tokenAuthenticationKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disableServerSideUrlSigning" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="originForwardingType" type="{https://www.google.com/apis/ads/publisher/v201802}OriginForwardingType" minOccurs="0"/>
 *         &lt;element name="originPathPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityPolicySettings", propOrder = {
    "securityPolicyType",
    "tokenAuthenticationKey",
    "disableServerSideUrlSigning",
    "originForwardingType",
    "originPathPrefix"
})
public class SecurityPolicySettings {

    @XmlSchemaType(name = "string")
    protected SecurityPolicyType securityPolicyType;
    protected String tokenAuthenticationKey;
    protected Boolean disableServerSideUrlSigning;
    @XmlSchemaType(name = "string")
    protected OriginForwardingType originForwardingType;
    protected String originPathPrefix;

    /**
     * Gets the value of the securityPolicyType property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityPolicyType }
     *     
     */
    public SecurityPolicyType getSecurityPolicyType() {
        return securityPolicyType;
    }

    /**
     * Sets the value of the securityPolicyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityPolicyType }
     *     
     */
    public void setSecurityPolicyType(SecurityPolicyType value) {
        this.securityPolicyType = value;
    }

    /**
     * Gets the value of the tokenAuthenticationKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenAuthenticationKey() {
        return tokenAuthenticationKey;
    }

    /**
     * Sets the value of the tokenAuthenticationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenAuthenticationKey(String value) {
        this.tokenAuthenticationKey = value;
    }

    /**
     * Gets the value of the disableServerSideUrlSigning property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableServerSideUrlSigning() {
        return disableServerSideUrlSigning;
    }

    /**
     * Sets the value of the disableServerSideUrlSigning property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableServerSideUrlSigning(Boolean value) {
        this.disableServerSideUrlSigning = value;
    }

    /**
     * Gets the value of the originForwardingType property.
     * 
     * @return
     *     possible object is
     *     {@link OriginForwardingType }
     *     
     */
    public OriginForwardingType getOriginForwardingType() {
        return originForwardingType;
    }

    /**
     * Sets the value of the originForwardingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginForwardingType }
     *     
     */
    public void setOriginForwardingType(OriginForwardingType value) {
        this.originForwardingType = value;
    }

    /**
     * Gets the value of the originPathPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginPathPrefix() {
        return originPathPrefix;
    }

    /**
     * Sets the value of the originPathPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginPathPrefix(String value) {
        this.originPathPrefix = value;
    }

}
