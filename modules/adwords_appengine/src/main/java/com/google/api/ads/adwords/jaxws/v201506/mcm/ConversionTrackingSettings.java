
package com.google.api.ads.adwords.jaxws.v201506.mcm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201506.cm.ConversionDeduplicationMode;


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
 *         &lt;element name="conversionOptimizerMode" type="{https://adwords.google.com/api/adwords/cm/v201506}ConversionDeduplicationMode" minOccurs="0"/>
 *         &lt;element name="effectiveConversionTrackingId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="usesCrossAccountConversionTracking" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "conversionOptimizerMode",
    "effectiveConversionTrackingId",
    "usesCrossAccountConversionTracking"
})
public class ConversionTrackingSettings {

    @XmlSchemaType(name = "string")
    protected ConversionDeduplicationMode conversionOptimizerMode;
    protected Long effectiveConversionTrackingId;
    protected Boolean usesCrossAccountConversionTracking;

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

    /**
     * Gets the value of the effectiveConversionTrackingId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEffectiveConversionTrackingId() {
        return effectiveConversionTrackingId;
    }

    /**
     * Sets the value of the effectiveConversionTrackingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEffectiveConversionTrackingId(Long value) {
        this.effectiveConversionTrackingId = value;
    }

    /**
     * Gets the value of the usesCrossAccountConversionTracking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsesCrossAccountConversionTracking() {
        return usesCrossAccountConversionTracking;
    }

    /**
     * Sets the value of the usesCrossAccountConversionTracking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsesCrossAccountConversionTracking(Boolean value) {
        this.usesCrossAccountConversionTracking = value;
    }

}
