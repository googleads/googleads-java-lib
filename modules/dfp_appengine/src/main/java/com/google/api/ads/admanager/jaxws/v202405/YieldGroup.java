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


package com.google.api.ads.admanager.jaxws.v202405;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for YieldGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="YieldGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="yieldGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="yieldGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exchangeStatus" type="{https://www.google.com/apis/ads/publisher/v202405}YieldEntityStatus" minOccurs="0"/&gt;
 *         &lt;element name="format" type="{https://www.google.com/apis/ads/publisher/v202405}YieldFormat" minOccurs="0"/&gt;
 *         &lt;element name="environmentType" type="{https://www.google.com/apis/ads/publisher/v202405}YieldEnvironmentType" minOccurs="0"/&gt;
 *         &lt;element name="targeting" type="{https://www.google.com/apis/ads/publisher/v202405}Targeting" minOccurs="0"/&gt;
 *         &lt;element name="adSources" type="{https://www.google.com/apis/ads/publisher/v202405}YieldAdSource" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "YieldGroup", propOrder = {
    "yieldGroupId",
    "yieldGroupName",
    "exchangeStatus",
    "format",
    "environmentType",
    "targeting",
    "adSources"
})
public class YieldGroup {

    protected Long yieldGroupId;
    protected String yieldGroupName;
    @XmlSchemaType(name = "string")
    protected YieldEntityStatus exchangeStatus;
    @XmlSchemaType(name = "string")
    protected YieldFormat format;
    @XmlSchemaType(name = "string")
    protected YieldEnvironmentType environmentType;
    protected Targeting targeting;
    protected List<YieldAdSource> adSources;

    /**
     * Gets the value of the yieldGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getYieldGroupId() {
        return yieldGroupId;
    }

    /**
     * Sets the value of the yieldGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setYieldGroupId(Long value) {
        this.yieldGroupId = value;
    }

    /**
     * Gets the value of the yieldGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYieldGroupName() {
        return yieldGroupName;
    }

    /**
     * Sets the value of the yieldGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYieldGroupName(String value) {
        this.yieldGroupName = value;
    }

    /**
     * Gets the value of the exchangeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link YieldEntityStatus }
     *     
     */
    public YieldEntityStatus getExchangeStatus() {
        return exchangeStatus;
    }

    /**
     * Sets the value of the exchangeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link YieldEntityStatus }
     *     
     */
    public void setExchangeStatus(YieldEntityStatus value) {
        this.exchangeStatus = value;
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
     * Gets the value of the environmentType property.
     * 
     * @return
     *     possible object is
     *     {@link YieldEnvironmentType }
     *     
     */
    public YieldEnvironmentType getEnvironmentType() {
        return environmentType;
    }

    /**
     * Sets the value of the environmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link YieldEnvironmentType }
     *     
     */
    public void setEnvironmentType(YieldEnvironmentType value) {
        this.environmentType = value;
    }

    /**
     * Gets the value of the targeting property.
     * 
     * @return
     *     possible object is
     *     {@link Targeting }
     *     
     */
    public Targeting getTargeting() {
        return targeting;
    }

    /**
     * Sets the value of the targeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Targeting }
     *     
     */
    public void setTargeting(Targeting value) {
        this.targeting = value;
    }

    /**
     * Gets the value of the adSources property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adSources property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdSources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link YieldAdSource }
     * 
     * 
     */
    public List<YieldAdSource> getAdSources() {
        if (adSources == null) {
            adSources = new ArrayList<YieldAdSource>();
        }
        return this.adSources;
    }

}
