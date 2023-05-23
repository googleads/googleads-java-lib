// Copyright 2023 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202305;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Provides information about the expected volume and composition of traffic over a date range for a
 *             traffic forecast segment.
 *           
 * 
 * <p>Java class for ForecastAdjustment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForecastAdjustment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="trafficForecastSegmentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateRange" type="{https://www.google.com/apis/ads/publisher/v202305}DateRange" minOccurs="0"/>
 *         &lt;element name="status" type="{https://www.google.com/apis/ads/publisher/v202305}ForecastAdjustmentStatus" minOccurs="0"/>
 *         &lt;element name="volumeType" type="{https://www.google.com/apis/ads/publisher/v202305}ForecastAdjustmentVolumeType" minOccurs="0"/>
 *         &lt;element name="allowAdjustingForecastAboveRecommendedLimit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="dailyVolumeSettings" type="{https://www.google.com/apis/ads/publisher/v202305}DailyVolumeSettings" minOccurs="0"/>
 *         &lt;element name="totalVolumeSettings" type="{https://www.google.com/apis/ads/publisher/v202305}TotalVolumeSettings" minOccurs="0"/>
 *         &lt;element name="historicalBasisVolumeSettings" type="{https://www.google.com/apis/ads/publisher/v202305}HistoricalBasisVolumeSettings" minOccurs="0"/>
 *         &lt;element name="calculatedDailyAdOpportunityCounts" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForecastAdjustment", propOrder = {
    "id",
    "trafficForecastSegmentId",
    "name",
    "dateRange",
    "status",
    "volumeType",
    "allowAdjustingForecastAboveRecommendedLimit",
    "dailyVolumeSettings",
    "totalVolumeSettings",
    "historicalBasisVolumeSettings",
    "calculatedDailyAdOpportunityCounts"
})
public class ForecastAdjustment {

    protected Long id;
    protected Long trafficForecastSegmentId;
    protected String name;
    protected DateRange dateRange;
    @XmlSchemaType(name = "string")
    protected ForecastAdjustmentStatus status;
    @XmlSchemaType(name = "string")
    protected ForecastAdjustmentVolumeType volumeType;
    protected Boolean allowAdjustingForecastAboveRecommendedLimit;
    protected DailyVolumeSettings dailyVolumeSettings;
    protected TotalVolumeSettings totalVolumeSettings;
    protected HistoricalBasisVolumeSettings historicalBasisVolumeSettings;
    @XmlElement(type = Long.class)
    protected List<Long> calculatedDailyAdOpportunityCounts;

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
     * Gets the value of the trafficForecastSegmentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTrafficForecastSegmentId() {
        return trafficForecastSegmentId;
    }

    /**
     * Sets the value of the trafficForecastSegmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTrafficForecastSegmentId(Long value) {
        this.trafficForecastSegmentId = value;
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
     * Gets the value of the dateRange property.
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    public DateRange getDateRange() {
        return dateRange;
    }

    /**
     * Sets the value of the dateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    public void setDateRange(DateRange value) {
        this.dateRange = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ForecastAdjustmentStatus }
     *     
     */
    public ForecastAdjustmentStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastAdjustmentStatus }
     *     
     */
    public void setStatus(ForecastAdjustmentStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the volumeType property.
     * 
     * @return
     *     possible object is
     *     {@link ForecastAdjustmentVolumeType }
     *     
     */
    public ForecastAdjustmentVolumeType getVolumeType() {
        return volumeType;
    }

    /**
     * Sets the value of the volumeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastAdjustmentVolumeType }
     *     
     */
    public void setVolumeType(ForecastAdjustmentVolumeType value) {
        this.volumeType = value;
    }

    /**
     * Gets the value of the allowAdjustingForecastAboveRecommendedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowAdjustingForecastAboveRecommendedLimit() {
        return allowAdjustingForecastAboveRecommendedLimit;
    }

    /**
     * Sets the value of the allowAdjustingForecastAboveRecommendedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowAdjustingForecastAboveRecommendedLimit(Boolean value) {
        this.allowAdjustingForecastAboveRecommendedLimit = value;
    }

    /**
     * Gets the value of the dailyVolumeSettings property.
     * 
     * @return
     *     possible object is
     *     {@link DailyVolumeSettings }
     *     
     */
    public DailyVolumeSettings getDailyVolumeSettings() {
        return dailyVolumeSettings;
    }

    /**
     * Sets the value of the dailyVolumeSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link DailyVolumeSettings }
     *     
     */
    public void setDailyVolumeSettings(DailyVolumeSettings value) {
        this.dailyVolumeSettings = value;
    }

    /**
     * Gets the value of the totalVolumeSettings property.
     * 
     * @return
     *     possible object is
     *     {@link TotalVolumeSettings }
     *     
     */
    public TotalVolumeSettings getTotalVolumeSettings() {
        return totalVolumeSettings;
    }

    /**
     * Sets the value of the totalVolumeSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalVolumeSettings }
     *     
     */
    public void setTotalVolumeSettings(TotalVolumeSettings value) {
        this.totalVolumeSettings = value;
    }

    /**
     * Gets the value of the historicalBasisVolumeSettings property.
     * 
     * @return
     *     possible object is
     *     {@link HistoricalBasisVolumeSettings }
     *     
     */
    public HistoricalBasisVolumeSettings getHistoricalBasisVolumeSettings() {
        return historicalBasisVolumeSettings;
    }

    /**
     * Sets the value of the historicalBasisVolumeSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoricalBasisVolumeSettings }
     *     
     */
    public void setHistoricalBasisVolumeSettings(HistoricalBasisVolumeSettings value) {
        this.historicalBasisVolumeSettings = value;
    }

    /**
     * Gets the value of the calculatedDailyAdOpportunityCounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calculatedDailyAdOpportunityCounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalculatedDailyAdOpportunityCounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getCalculatedDailyAdOpportunityCounts() {
        if (calculatedDailyAdOpportunityCounts == null) {
            calculatedDailyAdOpportunityCounts = new ArrayList<Long>();
        }
        return this.calculatedDailyAdOpportunityCounts;
    }

}
