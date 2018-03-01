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


package com.google.api.ads.adwords.jaxws.v201802.rm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Interface for metadata associated with an offline data upload.
 *           
 * 
 * <p>Java class for UploadMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UploadMetadata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="StoreSalesUploadCommonMetadata" type="{https://adwords.google.com/api/adwords/rm/v201802}StoreSalesUploadCommonMetadata"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadMetadata", propOrder = {
    "storeSalesUploadCommonMetadata"
})
public class UploadMetadata {

    @XmlElement(name = "StoreSalesUploadCommonMetadata")
    protected StoreSalesUploadCommonMetadata storeSalesUploadCommonMetadata;

    /**
     * Gets the value of the storeSalesUploadCommonMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link StoreSalesUploadCommonMetadata }
     *     
     */
    public StoreSalesUploadCommonMetadata getStoreSalesUploadCommonMetadata() {
        return storeSalesUploadCommonMetadata;
    }

    /**
     * Sets the value of the storeSalesUploadCommonMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreSalesUploadCommonMetadata }
     *     
     */
    public void setStoreSalesUploadCommonMetadata(StoreSalesUploadCommonMetadata value) {
        this.storeSalesUploadCommonMetadata = value;
    }

}
