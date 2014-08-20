
package com.google.api.ads.adwords.jaxws.v201406.mcm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201406.cm.ConversionDeduplicationMode;


/**
 * 
 *             A collection of customer-wide settings related to AdWords Conversion Tracking. Settings
 *             that apply at the conversion type level can be accessed and modified though
 *             {@code ConversionTrackerService}.
 *           
 * 
 * <p>Java class for ConversionTrackingSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConversionTrackingSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conversionOptimizerMode" type="{https://adwords.google.com/api/adwords/cm/v201406}ConversionDeduplicationMode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversionTrackingSettings", propOrder = {
    "conversionOptimizerMode"
})
public class ConversionTrackingSettings {

    protected ConversionDeduplicationMode conversionOptimizerMode;

    /**
     * Gets the value of the conversionOptimizerMode property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionDeduplicationMode }
     *     
     */
    public ConversionDeduplicationMode getConversionOptimizerMode() {
        return conversionOptimizerMode;
    }

    /**
     * Sets the value of the conversionOptimizerMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionDeduplicationMode }
     *     
     */
    public void setConversionOptimizerMode(ConversionDeduplicationMode value) {
        this.conversionOptimizerMode = value;
    }

}
