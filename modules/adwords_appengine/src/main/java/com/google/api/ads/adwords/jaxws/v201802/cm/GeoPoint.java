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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Specifies a geo location with the supplied latitude/longitude.
 *           
 * 
 * <p>Java class for GeoPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeoPoint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="latitudeInMicroDegrees" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="longitudeInMicroDegrees" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoPoint", propOrder = {
    "latitudeInMicroDegrees",
    "longitudeInMicroDegrees"
})
public class GeoPoint {

    protected Integer latitudeInMicroDegrees;
    protected Integer longitudeInMicroDegrees;

    /**
     * Gets the value of the latitudeInMicroDegrees property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLatitudeInMicroDegrees() {
        return latitudeInMicroDegrees;
    }

    /**
     * Sets the value of the latitudeInMicroDegrees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLatitudeInMicroDegrees(Integer value) {
        this.latitudeInMicroDegrees = value;
    }

    /**
     * Gets the value of the longitudeInMicroDegrees property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLongitudeInMicroDegrees() {
        return longitudeInMicroDegrees;
    }

    /**
     * Sets the value of the longitudeInMicroDegrees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLongitudeInMicroDegrees(Integer value) {
        this.longitudeInMicroDegrees = value;
    }

}
