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
 *             Abstract class representing a request to estimate stats.
 *           
 * 
 * <p>Java class for EstimateRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EstimateRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EstimateRequest.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstimateRequest", propOrder = {
    "estimateRequestType"
})
@XmlSeeAlso({
    KeywordEstimateRequest.class,
    CampaignEstimateRequest.class,
    AdGroupEstimateRequest.class
})
public abstract class EstimateRequest {

    @XmlElement(name = "EstimateRequest.Type")
    protected String estimateRequestType;

    /**
     * Gets the value of the estimateRequestType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimateRequestType() {
        return estimateRequestType;
    }

    /**
     * Sets the value of the estimateRequestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimateRequestType(String value) {
        this.estimateRequestType = value;
    }

}
