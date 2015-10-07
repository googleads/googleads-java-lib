
package com.google.api.ads.adwords.jaxws.v201509.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Contains how many changes were made associated with an experiment at
 *             the adgroup, critieria and creative levels
 *           
 * 
 * <p>Java class for ExperimentSummaryStats complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExperimentSummaryStats">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adGroupsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="adGroupCriteriaCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="adGroupAdsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExperimentSummaryStats", propOrder = {
    "adGroupsCount",
    "adGroupCriteriaCount",
    "adGroupAdsCount"
})
public class ExperimentSummaryStats {

    protected Integer adGroupsCount;
    protected Integer adGroupCriteriaCount;
    protected Integer adGroupAdsCount;

    /**
     * Gets the value of the adGroupsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdGroupsCount() {
        return adGroupsCount;
    }

    /**
     * Sets the value of the adGroupsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdGroupsCount(Integer value) {
        this.adGroupsCount = value;
    }

    /**
     * Gets the value of the adGroupCriteriaCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdGroupCriteriaCount() {
        return adGroupCriteriaCount;
    }

    /**
     * Sets the value of the adGroupCriteriaCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdGroupCriteriaCount(Integer value) {
        this.adGroupCriteriaCount = value;
    }

    /**
     * Gets the value of the adGroupAdsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdGroupAdsCount() {
        return adGroupAdsCount;
    }

    /**
     * Sets the value of the adGroupAdsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdGroupAdsCount(Integer value) {
        this.adGroupAdsCount = value;
    }

}
