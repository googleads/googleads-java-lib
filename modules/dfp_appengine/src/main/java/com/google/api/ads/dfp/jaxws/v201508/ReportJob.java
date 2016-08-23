// Copyright 2015 Google Inc. All Rights Reserved.
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


package com.google.api.ads.dfp.jaxws.v201508;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a report job that will be run to retrieve performance and
 *             statistics information about ad campaigns, networks, inventory and sales.
 *           
 * 
 * <p>Java class for ReportJob complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportJob">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="reportQuery" type="{https://www.google.com/apis/ads/publisher/v201508}ReportQuery" minOccurs="0"/>
 *         &lt;element name="reportJobStatus" type="{https://www.google.com/apis/ads/publisher/v201508}ReportJobStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportJob", propOrder = {
    "id",
    "reportQuery",
    "reportJobStatus"
})
public class ReportJob {

    protected Long id;
    protected ReportQuery reportQuery;
    @XmlSchemaType(name = "string")
    protected ReportJobStatus reportJobStatus;

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
     * Gets the value of the reportQuery property.
     * 
     * @return
     *     possible object is
     *     {@link ReportQuery }
     *     
     */
    public ReportQuery getReportQuery() {
        return reportQuery;
    }

    /**
     * Sets the value of the reportQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportQuery }
     *     
     */
    public void setReportQuery(ReportQuery value) {
        this.reportQuery = value;
    }

    /**
     * Gets the value of the reportJobStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ReportJobStatus }
     *     
     */
    public ReportJobStatus getReportJobStatus() {
        return reportJobStatus;
    }

    /**
     * Sets the value of the reportJobStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportJobStatus }
     *     
     */
    public void setReportJobStatus(ReportJobStatus value) {
        this.reportJobStatus = value;
    }

}
