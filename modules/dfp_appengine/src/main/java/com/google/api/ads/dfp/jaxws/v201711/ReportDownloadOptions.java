// Copyright 2017 Google Inc. All Rights Reserved.
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


package com.google.api.ads.dfp.jaxws.v201711;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the options for an API report download request.
 *             See {@link ReportService#getReportDownloadUrlWithOptions}.
 *           
 * 
 * <p>Java class for ReportDownloadOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportDownloadOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exportFormat" type="{https://www.google.com/apis/ads/publisher/v201711}ExportFormat" minOccurs="0"/>
 *         &lt;element name="includeReportProperties" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="includeTotalsRow" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="useGzipCompression" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportDownloadOptions", propOrder = {
    "exportFormat",
    "includeReportProperties",
    "includeTotalsRow",
    "useGzipCompression"
})
public class ReportDownloadOptions {

    @XmlSchemaType(name = "string")
    protected ExportFormat exportFormat;
    protected Boolean includeReportProperties;
    protected Boolean includeTotalsRow;
    protected Boolean useGzipCompression;

    /**
     * Gets the value of the exportFormat property.
     * 
     * @return
     *     possible object is
     *     {@link ExportFormat }
     *     
     */
    public ExportFormat getExportFormat() {
        return exportFormat;
    }

    /**
     * Sets the value of the exportFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportFormat }
     *     
     */
    public void setExportFormat(ExportFormat value) {
        this.exportFormat = value;
    }

    /**
     * Gets the value of the includeReportProperties property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeReportProperties() {
        return includeReportProperties;
    }

    /**
     * Sets the value of the includeReportProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeReportProperties(Boolean value) {
        this.includeReportProperties = value;
    }

    /**
     * Gets the value of the includeTotalsRow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeTotalsRow() {
        return includeTotalsRow;
    }

    /**
     * Sets the value of the includeTotalsRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeTotalsRow(Boolean value) {
        this.includeTotalsRow = value;
    }

    /**
     * Gets the value of the useGzipCompression property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseGzipCompression() {
        return useGzipCompression;
    }

    /**
     * Sets the value of the useGzipCompression property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseGzipCompression(Boolean value) {
        this.useGzipCompression = value;
    }

}
