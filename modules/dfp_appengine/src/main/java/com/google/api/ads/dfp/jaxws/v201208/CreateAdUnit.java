
package com.google.api.ads.dfp.jaxws.v201208;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adUnit" type="{https://www.google.com/apis/ads/publisher/v201208}AdUnit" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "adUnit"
})
@XmlRootElement(name = "createAdUnit")
public class CreateAdUnit {

    protected AdUnit adUnit;

    /**
     * Gets the value of the adUnit property.
     * 
     * @return
     *     possible object is
     *     {@link AdUnit }
     *     
     */
    public AdUnit getAdUnit() {
        return adUnit;
    }

    /**
     * Sets the value of the adUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdUnit }
     *     
     */
    public void setAdUnit(AdUnit value) {
        this.adUnit = value;
    }

}
