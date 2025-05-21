// Copyright 2025 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202505;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code Creative} that has a destination url
 *           
 * 
 * <p>Java class for HasDestinationUrlCreative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HasDestinationUrlCreative"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v202505}Creative"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="destinationUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="destinationUrlType" type="{https://www.google.com/apis/ads/publisher/v202505}DestinationUrlType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HasDestinationUrlCreative", propOrder = {
    "destinationUrl",
    "destinationUrlType"
})
@XmlSeeAlso({
    AspectRatioImageCreative.class,
    BaseAudioCreative.class,
    CustomCreative.class,
    BaseImageCreative.class,
    BaseImageRedirectCreative.class,
    BaseVideoCreative.class
})
public abstract class HasDestinationUrlCreative
    extends Creative
{

    protected String destinationUrl;
    @XmlSchemaType(name = "string")
    protected DestinationUrlType destinationUrlType;

    /**
     * Gets the value of the destinationUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationUrl() {
        return destinationUrl;
    }

    /**
     * Sets the value of the destinationUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationUrl(String value) {
        this.destinationUrl = value;
    }

    /**
     * Gets the value of the destinationUrlType property.
     * 
     * @return
     *     possible object is
     *     {@link DestinationUrlType }
     *     
     */
    public DestinationUrlType getDestinationUrlType() {
        return destinationUrlType;
    }

    /**
     * Sets the value of the destinationUrlType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationUrlType }
     *     
     */
    public void setDestinationUrlType(DestinationUrlType value) {
        this.destinationUrlType = value;
    }

}
