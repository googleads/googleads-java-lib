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


package com.google.api.ads.adwords.jaxws.v201802.o;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201802.cm.ComparableValue;


/**
 * 
 *             Represents a range of values that has either an upper or a lower bound.
 *           
 * 
 * <p>Java class for Range complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Range">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="min" type="{https://adwords.google.com/api/adwords/cm/v201802}ComparableValue" minOccurs="0"/>
 *         &lt;element name="max" type="{https://adwords.google.com/api/adwords/cm/v201802}ComparableValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Range", propOrder = {
    "min",
    "max"
})
public class Range {

    protected ComparableValue min;
    protected ComparableValue max;

    /**
     * Gets the value of the min property.
     * 
     * @return
     *     possible object is
     *     {@link ComparableValue }
     *     
     */
    public ComparableValue getMin() {
        return min;
    }

    /**
     * Sets the value of the min property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparableValue }
     *     
     */
    public void setMin(ComparableValue value) {
        this.min = value;
    }

    /**
     * Gets the value of the max property.
     * 
     * @return
     *     possible object is
     *     {@link ComparableValue }
     *     
     */
    public ComparableValue getMax() {
        return max;
    }

    /**
     * Sets the value of the max property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparableValue }
     *     
     */
    public void setMax(ComparableValue value) {
        this.max = value;
    }

}
