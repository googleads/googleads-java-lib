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
 *             Data representing a campaign group performance target. A campaign group performance target is an
 *             entity that specifies a time range for a campaign group and various metrics by which the
 *             performance of that campaign group can be measured for the time period that the performance
 *             target is active.
 *           
 * 
 * <p>Java class for CampaignGroupPerformanceTarget complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampaignGroupPerformanceTarget">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="campaignGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="performanceTarget" type="{https://adwords.google.com/api/adwords/cm/v201802}PerformanceTarget" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignGroupPerformanceTarget", propOrder = {
    "id",
    "campaignGroupId",
    "performanceTarget"
})
public class CampaignGroupPerformanceTarget {

    protected Long id;
    protected Long campaignGroupId;
    protected PerformanceTarget performanceTarget;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the campaignGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCampaignGroupId() {
        return campaignGroupId;
    }

    /**
     * Sets the value of the campaignGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCampaignGroupId(Long value) {
        this.campaignGroupId = value;
    }

    /**
     * Gets the value of the performanceTarget property.
     * 
     * @return
     *     possible object is
     *     {@link PerformanceTarget }
     *     
     */
    public PerformanceTarget getPerformanceTarget() {
        return performanceTarget;
    }

    /**
     * Sets the value of the performanceTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceTarget }
     *     
     */
    public void setPerformanceTarget(PerformanceTarget value) {
        this.performanceTarget = value;
    }

}
