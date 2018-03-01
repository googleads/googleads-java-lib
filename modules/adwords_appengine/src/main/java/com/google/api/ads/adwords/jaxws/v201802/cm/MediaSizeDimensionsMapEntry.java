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
 *             This represents an entry in a map with a key of type Size
 *             and value of type Dimensions.
 *           
 * 
 * <p>Java class for Media_Size_DimensionsMapEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Media_Size_DimensionsMapEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{https://adwords.google.com/api/adwords/cm/v201802}Media.Size" minOccurs="0"/>
 *         &lt;element name="value" type="{https://adwords.google.com/api/adwords/cm/v201802}Dimensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Media_Size_DimensionsMapEntry", propOrder = {
    "key",
    "value"
})
public class MediaSizeDimensionsMapEntry {

    @XmlSchemaType(name = "string")
    protected MediaSize key;
    protected Dimensions value;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link MediaSize }
     *     
     */
    public MediaSize getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaSize }
     *     
     */
    public void setKey(MediaSize value) {
        this.key = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Dimensions }
     *     
     */
    public Dimensions getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dimensions }
     *     
     */
    public void setValue(Dimensions value) {
        this.value = value;
    }

}
