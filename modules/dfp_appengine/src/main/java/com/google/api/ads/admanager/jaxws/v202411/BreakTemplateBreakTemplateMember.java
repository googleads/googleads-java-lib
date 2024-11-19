// Copyright 2024 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202411;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A building block of a pod template.
 *           
 * 
 * <p>Java class for BreakTemplate.BreakTemplateMember complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BreakTemplate.BreakTemplateMember"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adSpotId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="adSpotFillType" type="{https://www.google.com/apis/ads/publisher/v202411}AdSpotFillType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BreakTemplate.BreakTemplateMember", propOrder = {
    "adSpotId",
    "adSpotFillType"
})
public class BreakTemplateBreakTemplateMember {

    protected Long adSpotId;
    @XmlSchemaType(name = "string")
    protected AdSpotFillType adSpotFillType;

    /**
     * Gets the value of the adSpotId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdSpotId() {
        return adSpotId;
    }

    /**
     * Sets the value of the adSpotId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdSpotId(Long value) {
        this.adSpotId = value;
    }

    /**
     * Gets the value of the adSpotFillType property.
     * 
     * @return
     *     possible object is
     *     {@link AdSpotFillType }
     *     
     */
    public AdSpotFillType getAdSpotFillType() {
        return adSpotFillType;
    }

    /**
     * Sets the value of the adSpotFillType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdSpotFillType }
     *     
     */
    public void setAdSpotFillType(AdSpotFillType value) {
        this.adSpotFillType = value;
    }

}
