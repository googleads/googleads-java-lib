
package com.google.api.ads.adwords.jaxws.v201306.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents stats specific to Ads.
 *           
 * 
 * <p>Java class for AdStats complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdStats">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201306}Stats">
 *       &lt;sequence>
 *         &lt;element name="percentServed" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdStats", propOrder = {
    "percentServed"
})
public class AdStats
    extends Stats
{

    protected Double percentServed;

    /**
     * Gets the value of the percentServed property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercentServed() {
        return percentServed;
    }

    /**
     * Sets the value of the percentServed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercentServed(Double value) {
        this.percentServed = value;
    }

}
