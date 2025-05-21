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
 *             Defines the criteria a {@link LineItem} needs to satisfy to meet its delivery goal.
 *           
 * 
 * <p>Java class for Goal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Goal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="goalType" type="{https://www.google.com/apis/ads/publisher/v202505}GoalType" minOccurs="0"/&gt;
 *         &lt;element name="unitType" type="{https://www.google.com/apis/ads/publisher/v202505}UnitType" minOccurs="0"/&gt;
 *         &lt;element name="units" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Goal", propOrder = {
    "goalType",
    "unitType",
    "units"
})
public class Goal {

    @XmlSchemaType(name = "string")
    protected GoalType goalType;
    @XmlSchemaType(name = "string")
    protected UnitType unitType;
    protected Long units;

    /**
     * Gets the value of the goalType property.
     * 
     * @return
     *     possible object is
     *     {@link GoalType }
     *     
     */
    public GoalType getGoalType() {
        return goalType;
    }

    /**
     * Sets the value of the goalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoalType }
     *     
     */
    public void setGoalType(GoalType value) {
        this.goalType = value;
    }

    /**
     * Gets the value of the unitType property.
     * 
     * @return
     *     possible object is
     *     {@link UnitType }
     *     
     */
    public UnitType getUnitType() {
        return unitType;
    }

    /**
     * Sets the value of the unitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitType }
     *     
     */
    public void setUnitType(UnitType value) {
        this.unitType = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUnits(Long value) {
        this.units = value;
    }

}
