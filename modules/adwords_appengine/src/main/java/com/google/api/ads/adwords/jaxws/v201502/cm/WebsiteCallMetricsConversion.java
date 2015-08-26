
package com.google.api.ads.adwords.jaxws.v201502.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A conversion that happens when a user performs the following sequence of actions:
 *             <ul>
 *             <li>Clicks on an advertiser's ad</li>
 *             <li>
 *             Proceeds to the advertiser's website, where special javascript installed on the page
 *             produces a dynamically-generated phone number,
 *             </li>
 *             <li>Calls that number from their home (or other) phone</li>
 *             </ul>
 *           
 * 
 * <p>Java class for WebsiteCallMetricsConversion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebsiteCallMetricsConversion">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201502}ConversionTracker">
 *       &lt;sequence>
 *         &lt;element name="phoneCallDuration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="snippet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebsiteCallMetricsConversion", propOrder = {
    "phoneCallDuration",
    "snippet"
})
public class WebsiteCallMetricsConversion
    extends ConversionTracker
{

    protected Long phoneCallDuration;
    protected String snippet;

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

    /**
     * Gets the value of the snippet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnippet() {
        return snippet;
    }

    /**
     * Sets the value of the snippet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnippet(String value) {
        this.snippet = value;
    }

}
