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
 *             A conversion type that receives conversions by having them uploaded
 *             through the OfflineConversionFeedService.
 *             
 *             After successfully creating a new UploadConversion, send the name of this conversion type
 *             along with your conversion details to the OfflineConversionFeedService
 *             to attribute those conversions to this conversion type.
 *           
 * 
 * <p>Java class for UploadConversion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UploadConversion">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}ConversionTracker">
 *       &lt;sequence>
 *         &lt;element name="isExternallyAttributed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadConversion", propOrder = {
    "isExternallyAttributed"
})
public class UploadConversion
    extends ConversionTracker
{

    protected Boolean isExternallyAttributed;

    /**
     * Gets the value of the isExternallyAttributed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExternallyAttributed() {
        return isExternallyAttributed;
    }

    /**
     * Sets the value of the isExternallyAttributed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExternallyAttributed(Boolean value) {
        this.isExternallyAttributed = value;
    }

}
