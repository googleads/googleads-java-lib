// Copyright 2025 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202505;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A single targeting criteria breakdown result.
 *           
 * 
 * <p>Java class for TargetingCriteriaBreakdown complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetingCriteriaBreakdown"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="targetingDimension" type="{https://www.google.com/apis/ads/publisher/v202505}TargetingDimension" minOccurs="0"/&gt;
 *         &lt;element name="targetingCriteriaId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="targetingCriteriaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="excluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="availableUnits" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="matchedUnits" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetingCriteriaBreakdown", propOrder = {
    "targetingDimension",
    "targetingCriteriaId",
    "targetingCriteriaName",
    "excluded",
    "availableUnits",
    "matchedUnits"
})
public class TargetingCriteriaBreakdown {

    @XmlSchemaType(name = "string")
    protected TargetingDimension targetingDimension;
    protected Long targetingCriteriaId;
    protected String targetingCriteriaName;
    protected Boolean excluded;
    protected Long availableUnits;
    protected Long matchedUnits;

    /**
     * Gets the value of the targetingDimension property.
     * 
     * @return
     *     possible object is
     *     {@link TargetingDimension }
     *     
     */
    public TargetingDimension getTargetingDimension() {
        return targetingDimension;
    }

    /**
     * Sets the value of the targetingDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetingDimension }
     *     
     */
    public void setTargetingDimension(TargetingDimension value) {
        this.targetingDimension = value;
    }

    /**
     * Gets the value of the targetingCriteriaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTargetingCriteriaId() {
        return targetingCriteriaId;
    }

    /**
     * Sets the value of the targetingCriteriaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTargetingCriteriaId(Long value) {
        this.targetingCriteriaId = value;
    }

    /**
     * Gets the value of the targetingCriteriaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetingCriteriaName() {
        return targetingCriteriaName;
    }

    /**
     * Sets the value of the targetingCriteriaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetingCriteriaName(String value) {
        this.targetingCriteriaName = value;
    }

    /**
     * Gets the value of the excluded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcluded() {
        return excluded;
    }

    /**
     * Sets the value of the excluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcluded(Boolean value) {
        this.excluded = value;
    }

    /**
     * Gets the value of the availableUnits property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAvailableUnits() {
        return availableUnits;
    }

    /**
     * Sets the value of the availableUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAvailableUnits(Long value) {
        this.availableUnits = value;
    }

    /**
     * Gets the value of the matchedUnits property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMatchedUnits() {
        return matchedUnits;
    }

    /**
     * Sets the value of the matchedUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMatchedUnits(Long value) {
        this.matchedUnits = value;
    }

}
