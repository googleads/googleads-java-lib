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
 *             Describes how unbranded pharma ads will be displayed.
 *           
 * 
 * <p>Java class for VanityPharma complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VanityPharma">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vanityPharmaDisplayUrlMode" type="{https://adwords.google.com/api/adwords/cm/v201802}VanityPharmaDisplayUrlMode" minOccurs="0"/>
 *         &lt;element name="vanityPharmaText" type="{https://adwords.google.com/api/adwords/cm/v201802}VanityPharmaText" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VanityPharma", propOrder = {
    "vanityPharmaDisplayUrlMode",
    "vanityPharmaText"
})
public class VanityPharma {

    @XmlSchemaType(name = "string")
    protected VanityPharmaDisplayUrlMode vanityPharmaDisplayUrlMode;
    @XmlSchemaType(name = "string")
    protected VanityPharmaText vanityPharmaText;

    /**
     * Gets the value of the vanityPharmaDisplayUrlMode property.
     * 
     * @return
     *     possible object is
     *     {@link VanityPharmaDisplayUrlMode }
     *     
     */
    public VanityPharmaDisplayUrlMode getVanityPharmaDisplayUrlMode() {
        return vanityPharmaDisplayUrlMode;
    }

    /**
     * Sets the value of the vanityPharmaDisplayUrlMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link VanityPharmaDisplayUrlMode }
     *     
     */
    public void setVanityPharmaDisplayUrlMode(VanityPharmaDisplayUrlMode value) {
        this.vanityPharmaDisplayUrlMode = value;
    }

    /**
     * Gets the value of the vanityPharmaText property.
     * 
     * @return
     *     possible object is
     *     {@link VanityPharmaText }
     *     
     */
    public VanityPharmaText getVanityPharmaText() {
        return vanityPharmaText;
    }

    /**
     * Sets the value of the vanityPharmaText property.
     * 
     * @param value
     *     allowed object is
     *     {@link VanityPharmaText }
     *     
     */
    public void setVanityPharmaText(VanityPharmaText value) {
        this.vanityPharmaText = value;
    }

}
