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


/**
 * 
 *             Object representing integer comparison operations. This is usually used within
 *             a particular {@link SearchParameter} to specify the valid values requested for the specific
 *             {@link Attribute}.
 *           
 * 
 * <p>Java class for LongComparisonOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LongComparisonOperation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="minimum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="maximum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LongComparisonOperation", propOrder = {
    "minimum",
    "maximum"
})
public class LongComparisonOperation {

    protected Long minimum;
    protected Long maximum;

    /**
     * Gets the value of the minimum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMinimum() {
        return minimum;
    }

    /**
     * Sets the value of the minimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMinimum(Long value) {
        this.minimum = value;
    }

    /**
     * Gets the value of the maximum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaximum() {
        return maximum;
    }

    /**
     * Sets the value of the maximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaximum(Long value) {
        this.maximum = value;
    }

}
