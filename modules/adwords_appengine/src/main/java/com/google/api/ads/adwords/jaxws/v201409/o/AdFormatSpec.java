
package com.google.api.ads.adwords.jaxws.v201409.o;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A placement response object which provides information about one of the ad formats
 *             supported by a placement.
 *           
 * 
 * <p>Java class for AdFormatSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdFormatSpec">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="format" type="{https://adwords.google.com/api/adwords/o/v201409}SiteConstants.AdFormat" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdFormatSpec", propOrder = {
    "format"
})
public class AdFormatSpec {

    protected SiteConstantsAdFormat format;

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link SiteConstantsAdFormat }
     *     
     */
    public SiteConstantsAdFormat getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteConstantsAdFormat }
     *     
     */
    public void setFormat(SiteConstantsAdFormat value) {
        this.format = value;
    }

}
