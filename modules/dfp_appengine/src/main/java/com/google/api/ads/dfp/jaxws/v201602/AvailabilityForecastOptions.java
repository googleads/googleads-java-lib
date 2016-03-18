
package com.google.api.ads.dfp.jaxws.v201602;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Forecasting options for line item availability forecasts.
 *           
 * 
 * <p>Java class for AvailabilityForecastOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvailabilityForecastOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="includeTargetingCriteriaBreakdown" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="includeContendingLineItems" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailabilityForecastOptions", propOrder = {
    "includeTargetingCriteriaBreakdown",
    "includeContendingLineItems"
})
public class AvailabilityForecastOptions {

    protected Boolean includeTargetingCriteriaBreakdown;
    protected Boolean includeContendingLineItems;

    /**
     * Gets the value of the includeTargetingCriteriaBreakdown property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeTargetingCriteriaBreakdown() {
        return includeTargetingCriteriaBreakdown;
    }

    /**
     * Sets the value of the includeTargetingCriteriaBreakdown property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeTargetingCriteriaBreakdown(Boolean value) {
        this.includeTargetingCriteriaBreakdown = value;
    }

    /**
     * Gets the value of the includeContendingLineItems property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeContendingLineItems() {
        return includeContendingLineItems;
    }

    /**
     * Sets the value of the includeContendingLineItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeContendingLineItems(Boolean value) {
        this.includeContendingLineItems = value;
    }

}
