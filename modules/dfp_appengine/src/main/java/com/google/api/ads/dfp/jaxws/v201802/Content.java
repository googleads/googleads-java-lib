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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code Content} represents video metadata from a publisher's
 *             Content Management System (CMS) that has been synced to DFP.
 *             <p>
 *             Video line items can be targeted to {@code Content}
 *             to indicate what ads should match when the {@code Content} is being played.
 *           
 * 
 * <p>Java class for Content complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Content">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{https://www.google.com/apis/ads/publisher/v201802}ContentStatus" minOccurs="0"/>
 *         &lt;element name="statusDefinedBy" type="{https://www.google.com/apis/ads/publisher/v201802}ContentStatusDefinedBy" minOccurs="0"/>
 *         &lt;element name="hlsIngestStatus" type="{https://www.google.com/apis/ads/publisher/v201802}DaiIngestStatus" minOccurs="0"/>
 *         &lt;element name="hlsIngestErrors" type="{https://www.google.com/apis/ads/publisher/v201802}DaiIngestError" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lastHlsIngestDateTime" type="{https://www.google.com/apis/ads/publisher/v201802}DateTime" minOccurs="0"/>
 *         &lt;element name="dashIngestStatus" type="{https://www.google.com/apis/ads/publisher/v201802}DaiIngestStatus" minOccurs="0"/>
 *         &lt;element name="dashIngestErrors" type="{https://www.google.com/apis/ads/publisher/v201802}DaiIngestError" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lastDashIngestDateTime" type="{https://www.google.com/apis/ads/publisher/v201802}DateTime" minOccurs="0"/>
 *         &lt;element name="importDateTime" type="{https://www.google.com/apis/ads/publisher/v201802}DateTime" minOccurs="0"/>
 *         &lt;element name="lastModifiedDateTime" type="{https://www.google.com/apis/ads/publisher/v201802}DateTime" minOccurs="0"/>
 *         &lt;element name="userDefinedCustomTargetingValueIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="mappingRuleDefinedCustomTargetingValueIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cmsSources" type="{https://www.google.com/apis/ads/publisher/v201802}CmsContent" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Content", propOrder = {
    "id",
    "name",
    "status",
    "statusDefinedBy",
    "hlsIngestStatus",
    "hlsIngestErrors",
    "lastHlsIngestDateTime",
    "dashIngestStatus",
    "dashIngestErrors",
    "lastDashIngestDateTime",
    "importDateTime",
    "lastModifiedDateTime",
    "userDefinedCustomTargetingValueIds",
    "mappingRuleDefinedCustomTargetingValueIds",
    "cmsSources"
})
public class Content {

    protected Long id;
    protected String name;
    @XmlSchemaType(name = "string")
    protected ContentStatus status;
    @XmlSchemaType(name = "string")
    protected ContentStatusDefinedBy statusDefinedBy;
    @XmlSchemaType(name = "string")
    protected DaiIngestStatus hlsIngestStatus;
    protected List<DaiIngestError> hlsIngestErrors;
    protected DateTime lastHlsIngestDateTime;
    @XmlSchemaType(name = "string")
    protected DaiIngestStatus dashIngestStatus;
    protected List<DaiIngestError> dashIngestErrors;
    protected DateTime lastDashIngestDateTime;
    protected DateTime importDateTime;
    protected DateTime lastModifiedDateTime;
    @XmlElement(type = Long.class)
    protected List<Long> userDefinedCustomTargetingValueIds;
    @XmlElement(type = Long.class)
    protected List<Long> mappingRuleDefinedCustomTargetingValueIds;
    protected List<CmsContent> cmsSources;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ContentStatus }
     *     
     */
    public ContentStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentStatus }
     *     
     */
    public void setStatus(ContentStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusDefinedBy property.
     * 
     * @return
     *     possible object is
     *     {@link ContentStatusDefinedBy }
     *     
     */
    public ContentStatusDefinedBy getStatusDefinedBy() {
        return statusDefinedBy;
    }

    /**
     * Sets the value of the statusDefinedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentStatusDefinedBy }
     *     
     */
    public void setStatusDefinedBy(ContentStatusDefinedBy value) {
        this.statusDefinedBy = value;
    }

    /**
     * Gets the value of the hlsIngestStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DaiIngestStatus }
     *     
     */
    public DaiIngestStatus getHlsIngestStatus() {
        return hlsIngestStatus;
    }

    /**
     * Sets the value of the hlsIngestStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DaiIngestStatus }
     *     
     */
    public void setHlsIngestStatus(DaiIngestStatus value) {
        this.hlsIngestStatus = value;
    }

    /**
     * Gets the value of the hlsIngestErrors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hlsIngestErrors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHlsIngestErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DaiIngestError }
     * 
     * 
     */
    public List<DaiIngestError> getHlsIngestErrors() {
        if (hlsIngestErrors == null) {
            hlsIngestErrors = new ArrayList<DaiIngestError>();
        }
        return this.hlsIngestErrors;
    }

    /**
     * Gets the value of the lastHlsIngestDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getLastHlsIngestDateTime() {
        return lastHlsIngestDateTime;
    }

    /**
     * Sets the value of the lastHlsIngestDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setLastHlsIngestDateTime(DateTime value) {
        this.lastHlsIngestDateTime = value;
    }

    /**
     * Gets the value of the dashIngestStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DaiIngestStatus }
     *     
     */
    public DaiIngestStatus getDashIngestStatus() {
        return dashIngestStatus;
    }

    /**
     * Sets the value of the dashIngestStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DaiIngestStatus }
     *     
     */
    public void setDashIngestStatus(DaiIngestStatus value) {
        this.dashIngestStatus = value;
    }

    /**
     * Gets the value of the dashIngestErrors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dashIngestErrors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDashIngestErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DaiIngestError }
     * 
     * 
     */
    public List<DaiIngestError> getDashIngestErrors() {
        if (dashIngestErrors == null) {
            dashIngestErrors = new ArrayList<DaiIngestError>();
        }
        return this.dashIngestErrors;
    }

    /**
     * Gets the value of the lastDashIngestDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getLastDashIngestDateTime() {
        return lastDashIngestDateTime;
    }

    /**
     * Sets the value of the lastDashIngestDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setLastDashIngestDateTime(DateTime value) {
        this.lastDashIngestDateTime = value;
    }

    /**
     * Gets the value of the importDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getImportDateTime() {
        return importDateTime;
    }

    /**
     * Sets the value of the importDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setImportDateTime(DateTime value) {
        this.importDateTime = value;
    }

    /**
     * Gets the value of the lastModifiedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }

    /**
     * Sets the value of the lastModifiedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setLastModifiedDateTime(DateTime value) {
        this.lastModifiedDateTime = value;
    }

    /**
     * Gets the value of the userDefinedCustomTargetingValueIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userDefinedCustomTargetingValueIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserDefinedCustomTargetingValueIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getUserDefinedCustomTargetingValueIds() {
        if (userDefinedCustomTargetingValueIds == null) {
            userDefinedCustomTargetingValueIds = new ArrayList<Long>();
        }
        return this.userDefinedCustomTargetingValueIds;
    }

    /**
     * Gets the value of the mappingRuleDefinedCustomTargetingValueIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mappingRuleDefinedCustomTargetingValueIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMappingRuleDefinedCustomTargetingValueIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getMappingRuleDefinedCustomTargetingValueIds() {
        if (mappingRuleDefinedCustomTargetingValueIds == null) {
            mappingRuleDefinedCustomTargetingValueIds = new ArrayList<Long>();
        }
        return this.mappingRuleDefinedCustomTargetingValueIds;
    }

    /**
     * Gets the value of the cmsSources property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cmsSources property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCmsSources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CmsContent }
     * 
     * 
     */
    public List<CmsContent> getCmsSources() {
        if (cmsSources == null) {
            cmsSources = new ArrayList<CmsContent>();
        }
        return this.cmsSources;
    }

}
