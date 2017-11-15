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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code ReportQuery} object allows you to specify the selection criteria for
 *             generating a report. Only reports with at least one {@link Column} are supported.
 *           
 * 
 * <p>Java class for ReportQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dimensions" type="{https://www.google.com/apis/ads/publisher/v201711}Dimension" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="adUnitView" type="{https://www.google.com/apis/ads/publisher/v201711}ReportQuery.AdUnitView" minOccurs="0"/>
 *         &lt;element name="columns" type="{https://www.google.com/apis/ads/publisher/v201711}Column" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dimensionAttributes" type="{https://www.google.com/apis/ads/publisher/v201711}DimensionAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="customFieldIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contentMetadataKeyHierarchyCustomTargetingKeyIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="startDate" type="{https://www.google.com/apis/ads/publisher/v201711}Date" minOccurs="0"/>
 *         &lt;element name="endDate" type="{https://www.google.com/apis/ads/publisher/v201711}Date" minOccurs="0"/>
 *         &lt;element name="dateRangeType" type="{https://www.google.com/apis/ads/publisher/v201711}DateRangeType" minOccurs="0"/>
 *         &lt;element name="statement" type="{https://www.google.com/apis/ads/publisher/v201711}Statement" minOccurs="0"/>
 *         &lt;element name="useSalesLocalTimeZone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="includeZeroSalesRows" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportQuery", propOrder = {
    "dimensions",
    "adUnitView",
    "columns",
    "dimensionAttributes",
    "customFieldIds",
    "contentMetadataKeyHierarchyCustomTargetingKeyIds",
    "startDate",
    "endDate",
    "dateRangeType",
    "statement",
    "useSalesLocalTimeZone",
    "includeZeroSalesRows"
})
public class ReportQuery {

    @XmlSchemaType(name = "string")
    protected List<Dimension> dimensions;
    @XmlSchemaType(name = "string")
    protected ReportQueryAdUnitView adUnitView;
    @XmlSchemaType(name = "string")
    protected List<Column> columns;
    @XmlSchemaType(name = "string")
    protected List<DimensionAttribute> dimensionAttributes;
    @XmlElement(type = Long.class)
    protected List<Long> customFieldIds;
    @XmlElement(type = Long.class)
    protected List<Long> contentMetadataKeyHierarchyCustomTargetingKeyIds;
    protected Date startDate;
    protected Date endDate;
    @XmlSchemaType(name = "string")
    protected DateRangeType dateRangeType;
    protected Statement statement;
    protected Boolean useSalesLocalTimeZone;
    protected Boolean includeZeroSalesRows;

    /**
     * Gets the value of the dimensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dimensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDimensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dimension }
     * 
     * 
     */
    public List<Dimension> getDimensions() {
        if (dimensions == null) {
            dimensions = new ArrayList<Dimension>();
        }
        return this.dimensions;
    }

    /**
     * Gets the value of the adUnitView property.
     * 
     * @return
     *     possible object is
     *     {@link ReportQueryAdUnitView }
     *     
     */
    public ReportQueryAdUnitView getAdUnitView() {
        return adUnitView;
    }

    /**
     * Sets the value of the adUnitView property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportQueryAdUnitView }
     *     
     */
    public void setAdUnitView(ReportQueryAdUnitView value) {
        this.adUnitView = value;
    }

    /**
     * Gets the value of the columns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the columns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Column }
     * 
     * 
     */
    public List<Column> getColumns() {
        if (columns == null) {
            columns = new ArrayList<Column>();
        }
        return this.columns;
    }

    /**
     * Gets the value of the dimensionAttributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dimensionAttributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDimensionAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DimensionAttribute }
     * 
     * 
     */
    public List<DimensionAttribute> getDimensionAttributes() {
        if (dimensionAttributes == null) {
            dimensionAttributes = new ArrayList<DimensionAttribute>();
        }
        return this.dimensionAttributes;
    }

    /**
     * Gets the value of the customFieldIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customFieldIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomFieldIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getCustomFieldIds() {
        if (customFieldIds == null) {
            customFieldIds = new ArrayList<Long>();
        }
        return this.customFieldIds;
    }

    /**
     * Gets the value of the contentMetadataKeyHierarchyCustomTargetingKeyIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentMetadataKeyHierarchyCustomTargetingKeyIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentMetadataKeyHierarchyCustomTargetingKeyIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getContentMetadataKeyHierarchyCustomTargetingKeyIds() {
        if (contentMetadataKeyHierarchyCustomTargetingKeyIds == null) {
            contentMetadataKeyHierarchyCustomTargetingKeyIds = new ArrayList<Long>();
        }
        return this.contentMetadataKeyHierarchyCustomTargetingKeyIds;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setStartDate(Date value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the dateRangeType property.
     * 
     * @return
     *     possible object is
     *     {@link DateRangeType }
     *     
     */
    public DateRangeType getDateRangeType() {
        return dateRangeType;
    }

    /**
     * Sets the value of the dateRangeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRangeType }
     *     
     */
    public void setDateRangeType(DateRangeType value) {
        this.dateRangeType = value;
    }

    /**
     * Gets the value of the statement property.
     * 
     * @return
     *     possible object is
     *     {@link Statement }
     *     
     */
    public Statement getStatement() {
        return statement;
    }

    /**
     * Sets the value of the statement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement }
     *     
     */
    public void setStatement(Statement value) {
        this.statement = value;
    }

    /**
     * Gets the value of the useSalesLocalTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseSalesLocalTimeZone() {
        return useSalesLocalTimeZone;
    }

    /**
     * Sets the value of the useSalesLocalTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseSalesLocalTimeZone(Boolean value) {
        this.useSalesLocalTimeZone = value;
    }

    /**
     * Gets the value of the includeZeroSalesRows property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeZeroSalesRows() {
        return includeZeroSalesRows;
    }

    /**
     * Sets the value of the includeZeroSalesRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeZeroSalesRows(Boolean value) {
        this.includeZeroSalesRows = value;
    }

}
