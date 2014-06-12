
package com.google.api.ads.dfp.jaxws.v201405;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The property of the AdUnit that specifies how and from where the
 *             AdSenseSettings are inherited.
 *           
 * 
 * <p>Java class for AdSenseSettingsInheritedProperty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdSenseSettingsInheritedProperty">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="value" type="{https://www.google.com/apis/ads/publisher/v201405}AdSenseSettings" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdSenseSettingsInheritedProperty", propOrder = {
    "value"
})
public class AdSenseSettingsInheritedProperty {

    protected AdSenseSettings value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link AdSenseSettings }
     *     
     */
    public AdSenseSettings getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdSenseSettings }
     *     
     */
    public void setValue(AdSenseSettings value) {
        this.value = value;
    }

}
