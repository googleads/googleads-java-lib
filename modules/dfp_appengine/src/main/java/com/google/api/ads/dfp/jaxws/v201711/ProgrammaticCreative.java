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
 *             A {@code Creative} used for programmatic trafficking. This creative will be auto-created with
 *             the right approval from the buyer. This creative cannot be created through
 *             the API. This creative can be updated.
 *           
 * 
 * <p>Java class for ProgrammaticCreative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProgrammaticCreative">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201711}Creative">
 *       &lt;sequence>
 *         &lt;element name="isSafeFrameCompatible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgrammaticCreative", propOrder = {
    "isSafeFrameCompatible"
})
public class ProgrammaticCreative
    extends Creative
{

    protected Boolean isSafeFrameCompatible;

    /**
     * Gets the value of the isSafeFrameCompatible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSafeFrameCompatible() {
        return isSafeFrameCompatible;
    }

    /**
     * Sets the value of the isSafeFrameCompatible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSafeFrameCompatible(Boolean value) {
        this.isSafeFrameCompatible = value;
    }

}
