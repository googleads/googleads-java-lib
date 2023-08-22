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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             {@code CustomTargetingKey} represents a key used for custom targeting.
 *           
 * 
 * <p>Java class for CustomTargetingKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomTargetingKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{https://www.google.com/apis/ads/publisher/v202308}CustomTargetingKey.Type" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{https://www.google.com/apis/ads/publisher/v202308}CustomTargetingKey.Status" minOccurs="0"/&gt;
 *         &lt;element name="reportableType" type="{https://www.google.com/apis/ads/publisher/v202308}ReportableType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomTargetingKey", propOrder = {
    "id",
    "name",
    "displayName",
    "type",
    "status",
    "reportableType"
})
public class CustomTargetingKey {

    protected Long id;
    protected String name;
    protected String displayName;
    @XmlSchemaType(name = "string")
    protected CustomTargetingKeyType type;
    @XmlSchemaType(name = "string")
    protected CustomTargetingKeyStatus status;
    @XmlSchemaType(name = "string")
    protected ReportableType reportableType;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

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
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CustomTargetingKeyType }
     *     
     */
    public CustomTargetingKeyType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomTargetingKeyType }
     *     
     */
    public void setType(CustomTargetingKeyType value) {
        this.type = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CustomTargetingKeyStatus }
     *     
     */
    public CustomTargetingKeyStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomTargetingKeyStatus }
     *     
     */
    public void setStatus(CustomTargetingKeyStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the reportableType property.
     * 
     * @return
     *     possible object is
     *     {@link ReportableType }
     *     
     */
    public ReportableType getReportableType() {
        return reportableType;
    }

    /**
     * Sets the value of the reportableType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportableType }
     *     
     */
    public void setReportableType(ReportableType value) {
        this.reportableType = value;
    }

}
