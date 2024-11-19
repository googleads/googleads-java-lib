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
 *             A {@link ThirdPartyAudienceSegment} is an {@link AudienceSegment} owned by a data provider and
 *             licensed to the Ad Manager publisher.
 *           
 * 
 * <p>Java class for ThirdPartyAudienceSegment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThirdPartyAudienceSegment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v202411}AudienceSegment"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="approvalStatus" type="{https://www.google.com/apis/ads/publisher/v202411}AudienceSegmentApprovalStatus" minOccurs="0"/&gt;
 *         &lt;element name="cost" type="{https://www.google.com/apis/ads/publisher/v202411}Money" minOccurs="0"/&gt;
 *         &lt;element name="licenseType" type="{https://www.google.com/apis/ads/publisher/v202411}LicenseType" minOccurs="0"/&gt;
 *         &lt;element name="startDateTime" type="{https://www.google.com/apis/ads/publisher/v202411}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="endDateTime" type="{https://www.google.com/apis/ads/publisher/v202411}DateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThirdPartyAudienceSegment", propOrder = {
    "approvalStatus",
    "cost",
    "licenseType",
    "startDateTime",
    "endDateTime"
})
public class ThirdPartyAudienceSegment
    extends AudienceSegment
{

    @XmlSchemaType(name = "string")
    protected AudienceSegmentApprovalStatus approvalStatus;
    protected Money cost;
    @XmlSchemaType(name = "string")
    protected LicenseType licenseType;
    protected DateTime startDateTime;
    protected DateTime endDateTime;

    /**
     * Gets the value of the approvalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AudienceSegmentApprovalStatus }
     *     
     */
    public AudienceSegmentApprovalStatus getApprovalStatus() {
        return approvalStatus;
    }

    /**
     * Sets the value of the approvalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudienceSegmentApprovalStatus }
     *     
     */
    public void setApprovalStatus(AudienceSegmentApprovalStatus value) {
        this.approvalStatus = value;
    }

    /**
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCost(Money value) {
        this.cost = value;
    }

    /**
     * Gets the value of the licenseType property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseType }
     *     
     */
    public LicenseType getLicenseType() {
        return licenseType;
    }

    /**
     * Sets the value of the licenseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseType }
     *     
     */
    public void setLicenseType(LicenseType value) {
        this.licenseType = value;
    }

    /**
     * Gets the value of the startDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setStartDateTime(DateTime value) {
        this.startDateTime = value;
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setEndDateTime(DateTime value) {
        this.endDateTime = value;
    }

}
