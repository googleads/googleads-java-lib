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
 *             Key value pair associated with a piece of content from a publisher's CMS.
 *           
 * 
 * <p>Java class for CmsMetadataValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CmsMetadataValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cmsMetadataValueId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="valueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="key" type="{https://www.google.com/apis/ads/publisher/v202411}CmsMetadataKey" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{https://www.google.com/apis/ads/publisher/v202411}CmsMetadataValueStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CmsMetadataValue", propOrder = {
    "cmsMetadataValueId",
    "valueName",
    "key",
    "status"
})
public class CmsMetadataValue {

    protected Long cmsMetadataValueId;
    protected String valueName;
    protected CmsMetadataKey key;
    @XmlSchemaType(name = "string")
    protected CmsMetadataValueStatus status;

    /**
     * Gets the value of the cmsMetadataValueId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCmsMetadataValueId() {
        return cmsMetadataValueId;
    }

    /**
     * Sets the value of the cmsMetadataValueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCmsMetadataValueId(Long value) {
        this.cmsMetadataValueId = value;
    }

    /**
     * Gets the value of the valueName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueName() {
        return valueName;
    }

    /**
     * Sets the value of the valueName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueName(String value) {
        this.valueName = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link CmsMetadataKey }
     *     
     */
    public CmsMetadataKey getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmsMetadataKey }
     *     
     */
    public void setKey(CmsMetadataKey value) {
        this.key = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CmsMetadataValueStatus }
     *     
     */
    public CmsMetadataValueStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmsMetadataValueStatus }
     *     
     */
    public void setStatus(CmsMetadataValueStatus value) {
        this.status = value;
    }

}
