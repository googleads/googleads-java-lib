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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Data representing offline transactions.
 *           
 * 
 * <p>Java class for OfflineDataUpload complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfflineDataUpload">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="externalUploadId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="uploadType" type="{https://adwords.google.com/api/adwords/rm/v201802}OfflineDataUploadType" minOccurs="0"/>
 *         &lt;element name="uploadStatus" type="{https://adwords.google.com/api/adwords/rm/v201802}OfflineDataUploadStatus" minOccurs="0"/>
 *         &lt;element name="uploadMetadata" type="{https://adwords.google.com/api/adwords/rm/v201802}UploadMetadata" minOccurs="0"/>
 *         &lt;element name="offlineDataList" type="{https://adwords.google.com/api/adwords/rm/v201802}OfflineData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="failureReason" type="{https://adwords.google.com/api/adwords/rm/v201802}OfflineDataUploadFailureReason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfflineDataUpload", propOrder = {
    "externalUploadId",
    "uploadType",
    "uploadStatus",
    "uploadMetadata",
    "offlineDataList",
    "failureReason"
})
public class OfflineDataUpload {

    protected Long externalUploadId;
    @XmlSchemaType(name = "string")
    protected OfflineDataUploadType uploadType;
    @XmlSchemaType(name = "string")
    protected OfflineDataUploadStatus uploadStatus;
    protected UploadMetadata uploadMetadata;
    protected List<OfflineData> offlineDataList;
    @XmlSchemaType(name = "string")
    protected OfflineDataUploadFailureReason failureReason;

    /**
     * Gets the value of the externalUploadId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExternalUploadId() {
        return externalUploadId;
    }

    /**
     * Sets the value of the externalUploadId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExternalUploadId(Long value) {
        this.externalUploadId = value;
    }

    /**
     * Gets the value of the uploadType property.
     * 
     * @return
     *     possible object is
     *     {@link OfflineDataUploadType }
     *     
     */
    public OfflineDataUploadType getUploadType() {
        return uploadType;
    }

    /**
     * Sets the value of the uploadType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfflineDataUploadType }
     *     
     */
    public void setUploadType(OfflineDataUploadType value) {
        this.uploadType = value;
    }

    /**
     * Gets the value of the uploadStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OfflineDataUploadStatus }
     *     
     */
    public OfflineDataUploadStatus getUploadStatus() {
        return uploadStatus;
    }

    /**
     * Sets the value of the uploadStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfflineDataUploadStatus }
     *     
     */
    public void setUploadStatus(OfflineDataUploadStatus value) {
        this.uploadStatus = value;
    }

    /**
     * Gets the value of the uploadMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link UploadMetadata }
     *     
     */
    public UploadMetadata getUploadMetadata() {
        return uploadMetadata;
    }

    /**
     * Sets the value of the uploadMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadMetadata }
     *     
     */
    public void setUploadMetadata(UploadMetadata value) {
        this.uploadMetadata = value;
    }

    /**
     * Gets the value of the offlineDataList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offlineDataList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfflineDataList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfflineData }
     * 
     * 
     */
    public List<OfflineData> getOfflineDataList() {
        if (offlineDataList == null) {
            offlineDataList = new ArrayList<OfflineData>();
        }
        return this.offlineDataList;
    }

    /**
     * Gets the value of the failureReason property.
     * 
     * @return
     *     possible object is
     *     {@link OfflineDataUploadFailureReason }
     *     
     */
    public OfflineDataUploadFailureReason getFailureReason() {
        return failureReason;
    }

    /**
     * Sets the value of the failureReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfflineDataUploadFailureReason }
     *     
     */
    public void setFailureReason(OfflineDataUploadFailureReason value) {
        this.failureReason = value;
    }

}
