
package com.google.api.ads.adwords.jaxws.v201603.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A ConversionTracker for phone calls from conversion-tracked call extensions.
 *             A call made from the call extension is reported as a conversion if it lasts longer
 *             than N seconds. This duration is 60 seconds by default. Each call extension can
 *             specify the desired conversion configuration.
 *           
 * 
 * <p>Java class for AdCallMetricsConversion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdCallMetricsConversion">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201603}ConversionTracker">
 *       &lt;sequence>
 *         &lt;element name="phoneCallDuration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdCallMetricsConversion", propOrder = {
    "phoneCallDuration"
})
public class AdCallMetricsConversion
    extends ConversionTracker
{

    protected Long phoneCallDuration;

    /**
     * Gets the value of the phoneCallDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPhoneCallDuration() {
        return phoneCallDuration;
    }

    /**
     * Sets the value of the phoneCallDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPhoneCallDuration(Long value) {
        this.phoneCallDuration = value;
    }

}
