
package com.google.api.ads.dfp.jaxws.v201211;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a metropolitan area for geographical targeting. Currently,
 *             metropolitan areas only within the United States can be targeted.
 *             <p>
 *             Since {@code v201104}, fields of this class are ignored on input. Instead
 *             {@link Location} should be used and the {@link Location#id} field should be
 *             set.
 *             </p>
 *           
 * 
 * <p>Java class for MetroLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetroLocation">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201211}Location">
 *       &lt;sequence>
 *         &lt;element name="metroCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetroLocation", propOrder = {
    "metroCode",
    "countryCode"
})
public class MetroLocation
    extends Location
{

    protected String metroCode;
    protected String countryCode;

    /**
     * Gets the value of the metroCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetroCode() {
        return metroCode;
    }

    /**
     * Sets the value of the metroCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetroCode(String value) {
        this.metroCode = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

}
