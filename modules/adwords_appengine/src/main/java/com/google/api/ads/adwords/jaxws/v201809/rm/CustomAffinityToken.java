// Copyright 2018 Google LLC
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


package com.google.api.ads.adwords.jaxws.v201809.rm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A token of custom affinity audience. A token can be a keyword or placement. It is immutable, that
 *             is, it can only be created or removed but not changed.
 *           
 * 
 * <p>Java class for CustomAffinityToken complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomAffinityToken">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customAffinityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="customAffinityTokenId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="tokenType" type="{https://adwords.google.com/api/adwords/rm/v201809}CustomAffinityToken.TokenType" minOccurs="0"/>
 *         &lt;element name="parameter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomAffinityToken", propOrder = {
    "customAffinityId",
    "customAffinityTokenId",
    "tokenType",
    "parameter"
})
public class CustomAffinityToken {

    protected Long customAffinityId;
    protected Long customAffinityTokenId;
    @XmlSchemaType(name = "string")
    protected CustomAffinityTokenTokenType tokenType;
    protected String parameter;

    /**
     * Gets the value of the customAffinityId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomAffinityId() {
        return customAffinityId;
    }

    /**
     * Sets the value of the customAffinityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomAffinityId(Long value) {
        this.customAffinityId = value;
    }

    /**
     * Gets the value of the customAffinityTokenId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomAffinityTokenId() {
        return customAffinityTokenId;
    }

    /**
     * Sets the value of the customAffinityTokenId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomAffinityTokenId(Long value) {
        this.customAffinityTokenId = value;
    }

    /**
     * Gets the value of the tokenType property.
     * 
     * @return
     *     possible object is
     *     {@link CustomAffinityTokenTokenType }
     *     
     */
    public CustomAffinityTokenTokenType getTokenType() {
        return tokenType;
    }

    /**
     * Sets the value of the tokenType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomAffinityTokenTokenType }
     *     
     */
    public void setTokenType(CustomAffinityTokenTokenType value) {
        this.tokenType = value;
    }

    /**
     * Gets the value of the parameter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameter() {
        return parameter;
    }

    /**
     * Sets the value of the parameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameter(String value) {
        this.parameter = value;
    }

}
