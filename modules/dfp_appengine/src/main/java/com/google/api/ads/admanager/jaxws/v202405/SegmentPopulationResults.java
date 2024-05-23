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


package com.google.api.ads.admanager.jaxws.v202405;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SegmentPopulationResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentPopulationResults"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="batchUploadId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="segmentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{https://www.google.com/apis/ads/publisher/v202405}SegmentPopulationStatus" minOccurs="0"/&gt;
 *         &lt;element name="numSuccessfulIdsProcessed" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="errors" type="{https://www.google.com/apis/ads/publisher/v202405}IdError" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentPopulationResults", propOrder = {
    "batchUploadId",
    "segmentId",
    "status",
    "numSuccessfulIdsProcessed",
    "errors"
})
public class SegmentPopulationResults {

    protected Long batchUploadId;
    protected Long segmentId;
    @XmlSchemaType(name = "string")
    protected SegmentPopulationStatus status;
    protected Long numSuccessfulIdsProcessed;
    protected List<IdError> errors;

    /**
     * Gets the value of the batchUploadId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBatchUploadId() {
        return batchUploadId;
    }

    /**
     * Sets the value of the batchUploadId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBatchUploadId(Long value) {
        this.batchUploadId = value;
    }

    /**
     * Gets the value of the segmentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSegmentId() {
        return segmentId;
    }

    /**
     * Sets the value of the segmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSegmentId(Long value) {
        this.segmentId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentPopulationStatus }
     *     
     */
    public SegmentPopulationStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentPopulationStatus }
     *     
     */
    public void setStatus(SegmentPopulationStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the numSuccessfulIdsProcessed property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumSuccessfulIdsProcessed() {
        return numSuccessfulIdsProcessed;
    }

    /**
     * Sets the value of the numSuccessfulIdsProcessed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumSuccessfulIdsProcessed(Long value) {
        this.numSuccessfulIdsProcessed = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdError }
     * 
     * 
     */
    public List<IdError> getErrors() {
        if (errors == null) {
            errors = new ArrayList<IdError>();
        }
        return this.errors;
    }

}
