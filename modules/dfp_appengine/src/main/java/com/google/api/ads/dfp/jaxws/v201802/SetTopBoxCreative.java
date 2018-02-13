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


package com.google.api.ads.dfp.jaxws.v201802;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code Creative} that will be served into cable set-top boxes. There are no assets for this
 *             creative type, as they are hosted by external cable systems.
 *           
 * 
 * <p>Java class for SetTopBoxCreative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetTopBoxCreative">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201802}BaseVideoCreative">
 *       &lt;sequence>
 *         &lt;element name="externalAssetId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="availabilityRegionIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="licenseWindowStartDateTime" type="{https://www.google.com/apis/ads/publisher/v201802}DateTime" minOccurs="0"/>
 *         &lt;element name="licenseWindowEndDateTime" type="{https://www.google.com/apis/ads/publisher/v201802}DateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetTopBoxCreative", propOrder = {
    "externalAssetId",
    "providerId",
    "availabilityRegionIds",
    "licenseWindowStartDateTime",
    "licenseWindowEndDateTime"
})
public class SetTopBoxCreative
    extends BaseVideoCreative
{

    protected String externalAssetId;
    protected String providerId;
    protected List<String> availabilityRegionIds;
    protected DateTime licenseWindowStartDateTime;
    protected DateTime licenseWindowEndDateTime;

    /**
     * Gets the value of the externalAssetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalAssetId() {
        return externalAssetId;
    }

    /**
     * Sets the value of the externalAssetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalAssetId(String value) {
        this.externalAssetId = value;
    }

    /**
     * Gets the value of the providerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderId() {
        return providerId;
    }

    /**
     * Sets the value of the providerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderId(String value) {
        this.providerId = value;
    }

    /**
     * Gets the value of the availabilityRegionIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availabilityRegionIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailabilityRegionIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAvailabilityRegionIds() {
        if (availabilityRegionIds == null) {
            availabilityRegionIds = new ArrayList<String>();
        }
        return this.availabilityRegionIds;
    }

    /**
     * Gets the value of the licenseWindowStartDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getLicenseWindowStartDateTime() {
        return licenseWindowStartDateTime;
    }

    /**
     * Sets the value of the licenseWindowStartDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setLicenseWindowStartDateTime(DateTime value) {
        this.licenseWindowStartDateTime = value;
    }

    /**
     * Gets the value of the licenseWindowEndDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getLicenseWindowEndDateTime() {
        return licenseWindowEndDateTime;
    }

    /**
     * Sets the value of the licenseWindowEndDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setLicenseWindowEndDateTime(DateTime value) {
        this.licenseWindowEndDateTime = value;
    }

}
