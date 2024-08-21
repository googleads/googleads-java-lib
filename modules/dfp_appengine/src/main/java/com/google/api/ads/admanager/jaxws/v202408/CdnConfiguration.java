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


package com.google.api.ads.admanager.jaxws.v202408;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@link CdnConfiguration} encapsulates information about where and how to ingest and deliver
 *             content enabled for DAI (Dynamic Ad Insertion).
 *           
 * 
 * <p>Java class for CdnConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CdnConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cdnConfigurationType" type="{https://www.google.com/apis/ads/publisher/v202408}CdnConfigurationType" minOccurs="0"/&gt;
 *         &lt;element name="sourceContentConfiguration" type="{https://www.google.com/apis/ads/publisher/v202408}SourceContentConfiguration" minOccurs="0"/&gt;
 *         &lt;element name="cdnConfigurationStatus" type="{https://www.google.com/apis/ads/publisher/v202408}CdnConfigurationStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CdnConfiguration", propOrder = {
    "id",
    "name",
    "cdnConfigurationType",
    "sourceContentConfiguration",
    "cdnConfigurationStatus"
})
public class CdnConfiguration {

    protected Long id;
    protected String name;
    @XmlSchemaType(name = "string")
    protected CdnConfigurationType cdnConfigurationType;
    protected SourceContentConfiguration sourceContentConfiguration;
    @XmlSchemaType(name = "string")
    protected CdnConfigurationStatus cdnConfigurationStatus;

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
     * Gets the value of the cdnConfigurationType property.
     * 
     * @return
     *     possible object is
     *     {@link CdnConfigurationType }
     *     
     */
    public CdnConfigurationType getCdnConfigurationType() {
        return cdnConfigurationType;
    }

    /**
     * Sets the value of the cdnConfigurationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CdnConfigurationType }
     *     
     */
    public void setCdnConfigurationType(CdnConfigurationType value) {
        this.cdnConfigurationType = value;
    }

    /**
     * Gets the value of the sourceContentConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link SourceContentConfiguration }
     *     
     */
    public SourceContentConfiguration getSourceContentConfiguration() {
        return sourceContentConfiguration;
    }

    /**
     * Sets the value of the sourceContentConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceContentConfiguration }
     *     
     */
    public void setSourceContentConfiguration(SourceContentConfiguration value) {
        this.sourceContentConfiguration = value;
    }

    /**
     * Gets the value of the cdnConfigurationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CdnConfigurationStatus }
     *     
     */
    public CdnConfigurationStatus getCdnConfigurationStatus() {
        return cdnConfigurationStatus;
    }

    /**
     * Sets the value of the cdnConfigurationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CdnConfigurationStatus }
     *     
     */
    public void setCdnConfigurationStatus(CdnConfigurationStatus value) {
        this.cdnConfigurationStatus = value;
    }

}
