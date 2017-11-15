// Copyright 2017 Google Inc. All Rights Reserved.
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


package com.google.api.ads.dfp.jaxws.v201711;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@link CustomFieldValue} for a {@link CustomField} that has a {@link CustomField#dataType}
 *             of {@link CustomFieldDataType#DROP_DOWN}
 *           
 * 
 * <p>Java class for DropDownCustomFieldValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DropDownCustomFieldValue">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201711}BaseCustomFieldValue">
 *       &lt;sequence>
 *         &lt;element name="customFieldOptionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DropDownCustomFieldValue", propOrder = {
    "customFieldOptionId"
})
public class DropDownCustomFieldValue
    extends BaseCustomFieldValue
{

    protected Long customFieldOptionId;

    /**
     * Gets the value of the customFieldOptionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomFieldOptionId() {
        return customFieldOptionId;
    }

    /**
     * Sets the value of the customFieldOptionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomFieldOptionId(Long value) {
        this.customFieldOptionId = value;
    }

}
