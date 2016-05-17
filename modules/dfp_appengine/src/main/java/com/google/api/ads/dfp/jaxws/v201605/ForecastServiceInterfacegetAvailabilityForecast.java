
package com.google.api.ads.dfp.jaxws.v201605;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Gets the availability forecast for a {@link ProspectiveLineItem}. An availability forecast
 *             reports the maximum number of available units that the line item can book, and the total
 *             number of units matching the line item's targeting.
 *             
 *             <p>Note: Beginning in v201502, this replaces the previous getForecast method.
 *             
 *             @param lineItem the prospective line item (new or existing) to be forecasted for availability
 *             @param forecastOptions options controlling the forecast
 *           
 * 
 * <p>Java class for getAvailabilityForecast element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getAvailabilityForecast">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="lineItem" type="{https://www.google.com/apis/ads/publisher/v201605}ProspectiveLineItem" minOccurs="0"/>
 *           &lt;element name="forecastOptions" type="{https://www.google.com/apis/ads/publisher/v201605}AvailabilityForecastOptions" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "lineItem",
    "forecastOptions"
})
@XmlRootElement(name = "getAvailabilityForecast")
public class ForecastServiceInterfacegetAvailabilityForecast {

    protected ProspectiveLineItem lineItem;
    protected AvailabilityForecastOptions forecastOptions;

    /**
     * Gets the value of the lineItem property.
     * 
     * @return
     *     possible object is
     *     {@link ProspectiveLineItem }
     *     
     */
    public ProspectiveLineItem getLineItem() {
        return lineItem;
    }

    /**
     * Sets the value of the lineItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProspectiveLineItem }
     *     
     */
    public void setLineItem(ProspectiveLineItem value) {
        this.lineItem = value;
    }

    /**
     * Gets the value of the forecastOptions property.
     * 
     * @return
     *     possible object is
     *     {@link AvailabilityForecastOptions }
     *     
     */
    public AvailabilityForecastOptions getForecastOptions() {
        return forecastOptions;
    }

    /**
     * Sets the value of the forecastOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailabilityForecastOptions }
     *     
     */
    public void setForecastOptions(AvailabilityForecastOptions value) {
        this.forecastOptions = value;
    }

}
