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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             An {@code AdUnitSize} represents the size of an ad in an ad unit. This also represents
 *             the environment and companions of a particular ad in an ad unit. In most cases, it is
 *             a simple size with just a width and a height (sometimes representing an aspect ratio).
 *           
 * 
 * <p>Java class for AdUnitSize complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdUnitSize">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="size" type="{https://www.google.com/apis/ads/publisher/v201711}Size" minOccurs="0"/>
 *         &lt;element name="environmentType" type="{https://www.google.com/apis/ads/publisher/v201711}EnvironmentType" minOccurs="0"/>
 *         &lt;element name="companions" type="{https://www.google.com/apis/ads/publisher/v201711}AdUnitSize" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fullDisplayString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdUnitSize", propOrder = {
    "size",
    "environmentType",
    "companions",
    "fullDisplayString"
})
public class AdUnitSize {

    protected Size size;
    @XmlSchemaType(name = "string")
    protected EnvironmentType environmentType;
    protected List<AdUnitSize> companions;
    protected String fullDisplayString;

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link Size }
     *     
     */
    public Size getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link Size }
     *     
     */
    public void setSize(Size value) {
        this.size = value;
    }

    /**
     * Gets the value of the environmentType property.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentType }
     *     
     */
    public EnvironmentType getEnvironmentType() {
        return environmentType;
    }

    /**
     * Sets the value of the environmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentType }
     *     
     */
    public void setEnvironmentType(EnvironmentType value) {
        this.environmentType = value;
    }

    /**
     * Gets the value of the companions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the companions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompanions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdUnitSize }
     * 
     * 
     */
    public List<AdUnitSize> getCompanions() {
        if (companions == null) {
            companions = new ArrayList<AdUnitSize>();
        }
        return this.companions;
    }

    /**
     * Gets the value of the fullDisplayString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullDisplayString() {
        return fullDisplayString;
    }

    /**
     * Sets the value of the fullDisplayString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullDisplayString(String value) {
        this.fullDisplayString = value;
    }

}
