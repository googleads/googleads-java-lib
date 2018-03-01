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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             This represents an entry in a map with a key of type Type
 *             and value of type Attribute.
 *           
 * 
 * <p>Java class for Type_AttributeMapEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type_AttributeMapEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{https://adwords.google.com/api/adwords/o/v201802}AttributeType" minOccurs="0"/>
 *         &lt;element name="value" type="{https://adwords.google.com/api/adwords/o/v201802}Attribute" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type_AttributeMapEntry", propOrder = {
    "key",
    "value"
})
public class TypeAttributeMapEntry {

    @XmlSchemaType(name = "string")
    protected AttributeType key;
    protected Attribute value;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeType }
     *     
     */
    public AttributeType getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeType }
     *     
     */
    public void setKey(AttributeType value) {
        this.key = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Attribute }
     *     
     */
    public Attribute getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attribute }
     *     
     */
    public void setValue(Attribute value) {
        this.value = value;
    }

}
