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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a large mutation job.
 *           
 * 
 * <p>Java class for BatchJob complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchJob">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="status" type="{https://adwords.google.com/api/adwords/cm/v201802}BatchJobStatus" minOccurs="0"/>
 *         &lt;element name="progressStats" type="{https://adwords.google.com/api/adwords/cm/v201802}ProgressStats" minOccurs="0"/>
 *         &lt;element name="uploadUrl" type="{https://adwords.google.com/api/adwords/cm/v201802}TemporaryUrl" minOccurs="0"/>
 *         &lt;element name="downloadUrl" type="{https://adwords.google.com/api/adwords/cm/v201802}TemporaryUrl" minOccurs="0"/>
 *         &lt;element name="processingErrors" type="{https://adwords.google.com/api/adwords/cm/v201802}BatchJobProcessingError" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="diskUsageQuotaBalance" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchJob", propOrder = {
    "id",
    "status",
    "progressStats",
    "uploadUrl",
    "downloadUrl",
    "processingErrors",
    "diskUsageQuotaBalance"
})
public class BatchJob {

    protected Long id;
    @XmlSchemaType(name = "string")
    protected BatchJobStatus status;
    protected ProgressStats progressStats;
    protected TemporaryUrl uploadUrl;
    protected TemporaryUrl downloadUrl;
    protected List<BatchJobProcessingError> processingErrors;
    protected Long diskUsageQuotaBalance;

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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link BatchJobStatus }
     *     
     */
    public BatchJobStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchJobStatus }
     *     
     */
    public void setStatus(BatchJobStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the progressStats property.
     * 
     * @return
     *     possible object is
     *     {@link ProgressStats }
     *     
     */
    public ProgressStats getProgressStats() {
        return progressStats;
    }

    /**
     * Sets the value of the progressStats property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgressStats }
     *     
     */
    public void setProgressStats(ProgressStats value) {
        this.progressStats = value;
    }

    /**
     * Gets the value of the uploadUrl property.
     * 
     * @return
     *     possible object is
     *     {@link TemporaryUrl }
     *     
     */
    public TemporaryUrl getUploadUrl() {
        return uploadUrl;
    }

    /**
     * Sets the value of the uploadUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemporaryUrl }
     *     
     */
    public void setUploadUrl(TemporaryUrl value) {
        this.uploadUrl = value;
    }

    /**
     * Gets the value of the downloadUrl property.
     * 
     * @return
     *     possible object is
     *     {@link TemporaryUrl }
     *     
     */
    public TemporaryUrl getDownloadUrl() {
        return downloadUrl;
    }

    /**
     * Sets the value of the downloadUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemporaryUrl }
     *     
     */
    public void setDownloadUrl(TemporaryUrl value) {
        this.downloadUrl = value;
    }

    /**
     * Gets the value of the processingErrors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processingErrors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessingErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchJobProcessingError }
     * 
     * 
     */
    public List<BatchJobProcessingError> getProcessingErrors() {
        if (processingErrors == null) {
            processingErrors = new ArrayList<BatchJobProcessingError>();
        }
        return this.processingErrors;
    }

    /**
     * Gets the value of the diskUsageQuotaBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDiskUsageQuotaBalance() {
        return diskUsageQuotaBalance;
    }

    /**
     * Sets the value of the diskUsageQuotaBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDiskUsageQuotaBalance(Long value) {
        this.diskUsageQuotaBalance = value;
    }

}
