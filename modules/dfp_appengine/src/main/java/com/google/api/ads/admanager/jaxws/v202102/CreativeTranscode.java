// Copyright 2021 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202102;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreativeTranscode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreativeTranscode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adServer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creativeIdType" type="{https://www.google.com/apis/ads/publisher/v202102}CreativeTranscode.IdType" minOccurs="0"/>
 *         &lt;element name="creativeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreativeTranscode", propOrder = {
    "adServer",
    "creativeIdType",
    "creativeId"
})
public class CreativeTranscode {

    protected String adServer;
    @XmlSchemaType(name = "string")
    protected CreativeTranscodeIdType creativeIdType;
    protected String creativeId;

    /**
     * Gets the value of the adServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdServer() {
        return adServer;
    }

    /**
     * Sets the value of the adServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdServer(String value) {
        this.adServer = value;
    }

    /**
     * Gets the value of the creativeIdType property.
     * 
     * @return
     *     possible object is
     *     {@link CreativeTranscodeIdType }
     *     
     */
    public CreativeTranscodeIdType getCreativeIdType() {
        return creativeIdType;
    }

    /**
     * Sets the value of the creativeIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreativeTranscodeIdType }
     *     
     */
    public void setCreativeIdType(CreativeTranscodeIdType value) {
        this.creativeIdType = value;
    }

    /**
     * Gets the value of the creativeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreativeId() {
        return creativeId;
    }

    /**
     * Sets the value of the creativeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreativeId(String value) {
        this.creativeId = value;
    }

}
