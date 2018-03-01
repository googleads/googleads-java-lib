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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             {@link Attribute}s encompass the core information about a particular {@link TargetingIdea}. Some
 *             attributes are for {@code KEYWORD} {@link IdeaType}s, some are for {@code PLACEMENT}
 *             {@link IdeaType}s, and some are for both. Ultimately, an {@link Attribute} instance simply wraps
 *             an actual value of interest. For example, {@link KeywordAttribute} wraps the keyword itself,
 *             while a {@link BooleanAttribute} simply wraps a boolean describing some information about the
 *             keyword idea.
 *           
 * 
 * <p>Java class for Attribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Attribute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Attribute.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Attribute", propOrder = {
    "attributeType"
})
@XmlSeeAlso({
    KeywordAttribute.class,
    StringAttribute.class,
    MonthlySearchVolumeAttribute.class,
    IdeaTypeAttribute.class,
    LongAttribute.class,
    CriterionAttribute.class,
    IntegerSetAttribute.class,
    IntegerAttribute.class,
    DoubleAttribute.class,
    LongRangeAttribute.class,
    BooleanAttribute.class,
    WebpageDescriptorAttribute.class,
    MoneyAttribute.class
})
public abstract class Attribute {

    @XmlElement(name = "Attribute.Type")
    protected String attributeType;

    /**
     * Gets the value of the attributeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeType() {
        return attributeType;
    }

    /**
     * Sets the value of the attributeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeType(String value) {
        this.attributeType = value;
    }

}
