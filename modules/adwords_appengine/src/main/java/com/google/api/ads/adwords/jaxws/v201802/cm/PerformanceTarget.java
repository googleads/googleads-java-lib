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


package com.google.api.ads.adwords.jaxws.v201802.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             This class is used to configure various Performance Targets.
 *           
 * 
 * <p>Java class for PerformanceTarget complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PerformanceTarget">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="volumeGoalType" type="{https://adwords.google.com/api/adwords/cm/v201802}VolumeGoalType" minOccurs="0"/>
 *         &lt;element name="volumeTargetValue" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="efficiencyTargetType" type="{https://adwords.google.com/api/adwords/cm/v201802}EfficiencyTargetType" minOccurs="0"/>
 *         &lt;element name="efficiencyTargetValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="spendTarget" type="{https://adwords.google.com/api/adwords/cm/v201802}Money" minOccurs="0"/>
 *         &lt;element name="spendTargetType" type="{https://adwords.google.com/api/adwords/cm/v201802}SpendTargetType" minOccurs="0"/>
 *         &lt;element name="forecastStatus" type="{https://adwords.google.com/api/adwords/cm/v201802}PerformanceTargetStatus" minOccurs="0"/>
 *         &lt;element name="hasPromotedSuggestions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformanceTarget", propOrder = {
    "volumeGoalType",
    "volumeTargetValue",
    "efficiencyTargetType",
    "efficiencyTargetValue",
    "spendTarget",
    "spendTargetType",
    "forecastStatus",
    "hasPromotedSuggestions",
    "startDate",
    "endDate"
})
public class PerformanceTarget {

    @XmlSchemaType(name = "string")
    protected VolumeGoalType volumeGoalType;
    protected Long volumeTargetValue;
    @XmlSchemaType(name = "string")
    protected EfficiencyTargetType efficiencyTargetType;
    protected Double efficiencyTargetValue;
    protected Money spendTarget;
    @XmlSchemaType(name = "string")
    protected SpendTargetType spendTargetType;
    @XmlSchemaType(name = "string")
    protected PerformanceTargetStatus forecastStatus;
    protected Boolean hasPromotedSuggestions;
    protected String startDate;
    protected String endDate;

    /**
     * Gets the value of the volumeGoalType property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeGoalType }
     *     
     */
    public VolumeGoalType getVolumeGoalType() {
        return volumeGoalType;
    }

    /**
     * Sets the value of the volumeGoalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeGoalType }
     *     
     */
    public void setVolumeGoalType(VolumeGoalType value) {
        this.volumeGoalType = value;
    }

    /**
     * Gets the value of the volumeTargetValue property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVolumeTargetValue() {
        return volumeTargetValue;
    }

    /**
     * Sets the value of the volumeTargetValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVolumeTargetValue(Long value) {
        this.volumeTargetValue = value;
    }

    /**
     * Gets the value of the efficiencyTargetType property.
     * 
     * @return
     *     possible object is
     *     {@link EfficiencyTargetType }
     *     
     */
    public EfficiencyTargetType getEfficiencyTargetType() {
        return efficiencyTargetType;
    }

    /**
     * Sets the value of the efficiencyTargetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EfficiencyTargetType }
     *     
     */
    public void setEfficiencyTargetType(EfficiencyTargetType value) {
        this.efficiencyTargetType = value;
    }

    /**
     * Gets the value of the efficiencyTargetValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEfficiencyTargetValue() {
        return efficiencyTargetValue;
    }

    /**
     * Sets the value of the efficiencyTargetValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEfficiencyTargetValue(Double value) {
        this.efficiencyTargetValue = value;
    }

    /**
     * Gets the value of the spendTarget property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getSpendTarget() {
        return spendTarget;
    }

    /**
     * Sets the value of the spendTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setSpendTarget(Money value) {
        this.spendTarget = value;
    }

    /**
     * Gets the value of the spendTargetType property.
     * 
     * @return
     *     possible object is
     *     {@link SpendTargetType }
     *     
     */
    public SpendTargetType getSpendTargetType() {
        return spendTargetType;
    }

    /**
     * Sets the value of the spendTargetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpendTargetType }
     *     
     */
    public void setSpendTargetType(SpendTargetType value) {
        this.spendTargetType = value;
    }

    /**
     * Gets the value of the forecastStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PerformanceTargetStatus }
     *     
     */
    public PerformanceTargetStatus getForecastStatus() {
        return forecastStatus;
    }

    /**
     * Sets the value of the forecastStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceTargetStatus }
     *     
     */
    public void setForecastStatus(PerformanceTargetStatus value) {
        this.forecastStatus = value;
    }

    /**
     * Gets the value of the hasPromotedSuggestions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasPromotedSuggestions() {
        return hasPromotedSuggestions;
    }

    /**
     * Sets the value of the hasPromotedSuggestions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasPromotedSuggestions(Boolean value) {
        this.hasPromotedSuggestions = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

}
