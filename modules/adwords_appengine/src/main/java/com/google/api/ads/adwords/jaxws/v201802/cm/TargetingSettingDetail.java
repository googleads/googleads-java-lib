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
 *             Specifies if criteria of this type group should be used to restrict
 *             targeting, or if ads can serve anywhere and criteria are only used in
 *             determining the bid.
 *             <p>For more information, see
 *             <a href="https://support.google.com/adwords/answer/6056342">Targeting Settings</a>.</p>
 *           
 * 
 * <p>Java class for TargetingSettingDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetingSettingDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="criterionTypeGroup" type="{https://adwords.google.com/api/adwords/cm/v201802}CriterionTypeGroup" minOccurs="0"/>
 *         &lt;element name="targetAll" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetingSettingDetail", propOrder = {
    "criterionTypeGroup",
    "targetAll"
})
public class TargetingSettingDetail {

    @XmlSchemaType(name = "string")
    protected CriterionTypeGroup criterionTypeGroup;
    protected Boolean targetAll;

    /**
     * Gets the value of the criterionTypeGroup property.
     * 
     * @return
     *     possible object is
     *     {@link CriterionTypeGroup }
     *     
     */
    public CriterionTypeGroup getCriterionTypeGroup() {
        return criterionTypeGroup;
    }

    /**
     * Sets the value of the criterionTypeGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriterionTypeGroup }
     *     
     */
    public void setCriterionTypeGroup(CriterionTypeGroup value) {
        this.criterionTypeGroup = value;
    }

    /**
     * Gets the value of the targetAll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTargetAll() {
        return targetAll;
    }

    /**
     * Sets the value of the targetAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTargetAll(Boolean value) {
        this.targetAll = value;
    }

}
