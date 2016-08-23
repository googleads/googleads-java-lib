// Copyright 2016 Google Inc. All Rights Reserved.
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


package com.google.api.ads.adwords.jaxws.v201601.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Job-handling statistics.
 *           
 * 
 * <p>Java class for JobStats complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobStats">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="progressPercent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pendingTimeMillis" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="processingTimeMillis" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="JobStats.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobStats", propOrder = {
    "progressPercent",
    "pendingTimeMillis",
    "processingTimeMillis",
    "jobStatsType"
})
public class JobStats {

    protected Integer progressPercent;
    protected Long pendingTimeMillis;
    protected Long processingTimeMillis;
    @XmlElement(name = "JobStats.Type")
    protected String jobStatsType;

    /**
     * Gets the value of the progressPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProgressPercent() {
        return progressPercent;
    }

    /**
     * Sets the value of the progressPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProgressPercent(Integer value) {
        this.progressPercent = value;
    }

    /**
     * Gets the value of the pendingTimeMillis property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPendingTimeMillis() {
        return pendingTimeMillis;
    }

    /**
     * Sets the value of the pendingTimeMillis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPendingTimeMillis(Long value) {
        this.pendingTimeMillis = value;
    }

    /**
     * Gets the value of the processingTimeMillis property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProcessingTimeMillis() {
        return processingTimeMillis;
    }

    /**
     * Sets the value of the processingTimeMillis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProcessingTimeMillis(Long value) {
        this.processingTimeMillis = value;
    }

    /**
     * Gets the value of the jobStatsType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobStatsType() {
        return jobStatsType;
    }

    /**
     * Sets the value of the jobStatsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobStatsType(String value) {
        this.jobStatsType = value;
    }

}
