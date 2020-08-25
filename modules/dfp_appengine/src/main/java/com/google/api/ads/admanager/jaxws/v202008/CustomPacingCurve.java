// Copyright 2020 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202008;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A curve consisting of {@link CustomPacingGoal} objects that is used to pace line item delivery.
 *           
 * 
 * <p>Java class for CustomPacingCurve complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomPacingCurve">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customPacingGoalUnit" type="{https://www.google.com/apis/ads/publisher/v202008}CustomPacingGoalUnit" minOccurs="0"/>
 *         &lt;element name="customPacingGoals" type="{https://www.google.com/apis/ads/publisher/v202008}CustomPacingGoal" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomPacingCurve", propOrder = {
    "customPacingGoalUnit",
    "customPacingGoals"
})
public class CustomPacingCurve {

    @XmlSchemaType(name = "string")
    protected CustomPacingGoalUnit customPacingGoalUnit;
    protected List<CustomPacingGoal> customPacingGoals;

    /**
     * Gets the value of the customPacingGoalUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CustomPacingGoalUnit }
     *     
     */
    public CustomPacingGoalUnit getCustomPacingGoalUnit() {
        return customPacingGoalUnit;
    }

    /**
     * Sets the value of the customPacingGoalUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomPacingGoalUnit }
     *     
     */
    public void setCustomPacingGoalUnit(CustomPacingGoalUnit value) {
        this.customPacingGoalUnit = value;
    }

    /**
     * Gets the value of the customPacingGoals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customPacingGoals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomPacingGoals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomPacingGoal }
     * 
     * 
     */
    public List<CustomPacingGoal> getCustomPacingGoals() {
        if (customPacingGoals == null) {
            customPacingGoals = new ArrayList<CustomPacingGoal>();
        }
        return this.customPacingGoals;
    }

}
