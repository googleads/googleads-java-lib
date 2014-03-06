
package com.google.api.ads.adwords.jaxws.v201402.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Class representing a experiment for the ExperimentService.
 *           
 * 
 * <p>Java class for Experiment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Experiment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="controlId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{https://adwords.google.com/api/adwords/cm/v201402}ExperimentStatus" minOccurs="0"/>
 *         &lt;element name="servingStatus" type="{https://adwords.google.com/api/adwords/cm/v201402}ExperimentServingStatus" minOccurs="0"/>
 *         &lt;element name="queryPercentage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="startDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastModifiedDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="experimentSummaryStats" type="{https://adwords.google.com/api/adwords/cm/v201402}ExperimentSummaryStats" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Experiment", propOrder = {
    "id",
    "controlId",
    "campaignId",
    "name",
    "status",
    "servingStatus",
    "queryPercentage",
    "startDateTime",
    "endDateTime",
    "lastModifiedDateTime",
    "experimentSummaryStats"
})
public class Experiment {

    protected Long id;
    protected Long controlId;
    protected Long campaignId;
    protected String name;
    protected ExperimentStatus status;
    protected ExperimentServingStatus servingStatus;
    protected Integer queryPercentage;
    protected String startDateTime;
    protected String endDateTime;
    protected String lastModifiedDateTime;
    protected ExperimentSummaryStats experimentSummaryStats;

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
     * Gets the value of the controlId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getControlId() {
        return controlId;
    }

    /**
     * Sets the value of the controlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setControlId(Long value) {
        this.controlId = value;
    }

    /**
     * Gets the value of the campaignId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCampaignId() {
        return campaignId;
    }

    /**
     * Sets the value of the campaignId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCampaignId(Long value) {
        this.campaignId = value;
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
     *     {@link ExperimentStatus }
     *     
     */
    public ExperimentStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperimentStatus }
     *     
     */
    public void setStatus(ExperimentStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the servingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ExperimentServingStatus }
     *     
     */
    public ExperimentServingStatus getServingStatus() {
        return servingStatus;
    }

    /**
     * Sets the value of the servingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperimentServingStatus }
     *     
     */
    public void setServingStatus(ExperimentServingStatus value) {
        this.servingStatus = value;
    }

    /**
     * Gets the value of the queryPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQueryPercentage() {
        return queryPercentage;
    }

    /**
     * Sets the value of the queryPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQueryPercentage(Integer value) {
        this.queryPercentage = value;
    }

    /**
     * Gets the value of the startDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDateTime(String value) {
        this.startDateTime = value;
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDateTime(String value) {
        this.endDateTime = value;
    }

    /**
     * Gets the value of the lastModifiedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }

    /**
     * Sets the value of the lastModifiedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifiedDateTime(String value) {
        this.lastModifiedDateTime = value;
    }

    /**
     * Gets the value of the experimentSummaryStats property.
     * 
     * @return
     *     possible object is
     *     {@link ExperimentSummaryStats }
     *     
     */
    public ExperimentSummaryStats getExperimentSummaryStats() {
        return experimentSummaryStats;
    }

    /**
     * Sets the value of the experimentSummaryStats property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperimentSummaryStats }
     *     
     */
    public void setExperimentSummaryStats(ExperimentSummaryStats value) {
        this.experimentSummaryStats = value;
    }

}
