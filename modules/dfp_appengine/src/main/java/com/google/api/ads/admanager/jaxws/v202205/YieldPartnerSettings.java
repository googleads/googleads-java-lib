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


package com.google.api.ads.admanager.jaxws.v202205;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for YieldPartnerSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="YieldPartnerSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{https://www.google.com/apis/ads/publisher/v202205}PartnerSettingStatus" minOccurs="0"/>
 *         &lt;element name="environment" type="{https://www.google.com/apis/ads/publisher/v202205}YieldEnvironmentType" minOccurs="0"/>
 *         &lt;element name="format" type="{https://www.google.com/apis/ads/publisher/v202205}YieldFormat" minOccurs="0"/>
 *         &lt;element name="integrationType" type="{https://www.google.com/apis/ads/publisher/v202205}YieldIntegrationType" minOccurs="0"/>
 *         &lt;element name="platform" type="{https://www.google.com/apis/ads/publisher/v202205}YieldPlatform" minOccurs="0"/>
 *         &lt;element name="parameters" type="{https://www.google.com/apis/ads/publisher/v202205}YieldParameter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "YieldPartnerSettings", propOrder = {
    "status",
    "environment",
    "format",
    "integrationType",
    "platform",
    "parameters"
})
public class YieldPartnerSettings {

    @XmlSchemaType(name = "string")
    protected PartnerSettingStatus status;
    @XmlSchemaType(name = "string")
    protected YieldEnvironmentType environment;
    @XmlSchemaType(name = "string")
    protected YieldFormat format;
    @XmlSchemaType(name = "string")
    protected YieldIntegrationType integrationType;
    @XmlSchemaType(name = "string")
    protected YieldPlatform platform;
    protected List<YieldParameter> parameters;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerSettingStatus }
     *     
     */
    public PartnerSettingStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerSettingStatus }
     *     
     */
    public void setStatus(PartnerSettingStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the environment property.
     * 
     * @return
     *     possible object is
     *     {@link YieldEnvironmentType }
     *     
     */
    public YieldEnvironmentType getEnvironment() {
        return environment;
    }

    /**
     * Sets the value of the environment property.
     * 
     * @param value
     *     allowed object is
     *     {@link YieldEnvironmentType }
     *     
     */
    public void setEnvironment(YieldEnvironmentType value) {
        this.environment = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link YieldFormat }
     *     
     */
    public YieldFormat getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link YieldFormat }
     *     
     */
    public void setFormat(YieldFormat value) {
        this.format = value;
    }

    /**
     * Gets the value of the integrationType property.
     * 
     * @return
     *     possible object is
     *     {@link YieldIntegrationType }
     *     
     */
    public YieldIntegrationType getIntegrationType() {
        return integrationType;
    }

    /**
     * Sets the value of the integrationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link YieldIntegrationType }
     *     
     */
    public void setIntegrationType(YieldIntegrationType value) {
        this.integrationType = value;
    }

    /**
     * Gets the value of the platform property.
     * 
     * @return
     *     possible object is
     *     {@link YieldPlatform }
     *     
     */
    public YieldPlatform getPlatform() {
        return platform;
    }

    /**
     * Sets the value of the platform property.
     * 
     * @param value
     *     allowed object is
     *     {@link YieldPlatform }
     *     
     */
    public void setPlatform(YieldPlatform value) {
        this.platform = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link YieldParameter }
     * 
     * 
     */
    public List<YieldParameter> getParameters() {
        if (parameters == null) {
            parameters = new ArrayList<YieldParameter>();
        }
        return this.parameters;
    }

}
