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


package com.google.api.ads.admanager.jaxws.v202305;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for YieldAdSource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="YieldAdSource"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adSourceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="companyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="displaySettings" type="{https://www.google.com/apis/ads/publisher/v202305}AbstractDisplaySettings" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{https://www.google.com/apis/ads/publisher/v202305}YieldEntityStatus" minOccurs="0"/&gt;
 *         &lt;element name="manualCpm" type="{https://www.google.com/apis/ads/publisher/v202305}Money" minOccurs="0"/&gt;
 *         &lt;element name="overrideDynamicCpm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "YieldAdSource", propOrder = {
    "adSourceId",
    "companyId",
    "displaySettings",
    "status",
    "manualCpm",
    "overrideDynamicCpm"
})
public class YieldAdSource {

    protected Long adSourceId;
    protected Long companyId;
    protected AbstractDisplaySettings displaySettings;
    @XmlSchemaType(name = "string")
    protected YieldEntityStatus status;
    protected Money manualCpm;
    protected Boolean overrideDynamicCpm;

    /**
     * Gets the value of the adSourceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdSourceId() {
        return adSourceId;
    }

    /**
     * Sets the value of the adSourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdSourceId(Long value) {
        this.adSourceId = value;
    }

    /**
     * Gets the value of the companyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCompanyId() {
        return companyId;
    }

    /**
     * Sets the value of the companyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCompanyId(Long value) {
        this.companyId = value;
    }

    /**
     * Gets the value of the displaySettings property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractDisplaySettings }
     *     
     */
    public AbstractDisplaySettings getDisplaySettings() {
        return displaySettings;
    }

    /**
     * Sets the value of the displaySettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractDisplaySettings }
     *     
     */
    public void setDisplaySettings(AbstractDisplaySettings value) {
        this.displaySettings = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link YieldEntityStatus }
     *     
     */
    public YieldEntityStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link YieldEntityStatus }
     *     
     */
    public void setStatus(YieldEntityStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the manualCpm property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getManualCpm() {
        return manualCpm;
    }

    /**
     * Sets the value of the manualCpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setManualCpm(Money value) {
        this.manualCpm = value;
    }

    /**
     * Gets the value of the overrideDynamicCpm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverrideDynamicCpm() {
        return overrideDynamicCpm;
    }

    /**
     * Sets the value of the overrideDynamicCpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverrideDynamicCpm(Boolean value) {
        this.overrideDynamicCpm = value;
    }

}
