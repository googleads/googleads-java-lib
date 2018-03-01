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
import com.google.api.ads.adwords.jaxws.v201802.cm.Criterion;


/**
 * 
 *             {@link Attribute} type that contains a {@link Criterion} value.
 *           
 * 
 * <p>Java class for CriterionAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CriterionAttribute">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/o/v201802}Attribute">
 *       &lt;sequence>
 *         &lt;element name="value" type="{https://adwords.google.com/api/adwords/cm/v201802}Criterion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CriterionAttribute", propOrder = {
    "value"
})
public class CriterionAttribute
    extends Attribute
{

    protected Criterion value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Criterion }
     *     
     */
    public Criterion getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Criterion }
     *     
     */
    public void setValue(Criterion value) {
        this.value = value;
    }

}
