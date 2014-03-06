
package com.google.api.ads.adwords.jaxws.v201402.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents additional override info with which to augment the override
 *             extension.
 *           
 * 
 * <p>Java class for OverrideInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OverrideInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="LocationOverrideInfo" type="{https://adwords.google.com/api/adwords/cm/v201402}LocationOverrideInfo"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverrideInfo", propOrder = {
    "locationOverrideInfo"
})
public class OverrideInfo {

    @XmlElement(name = "LocationOverrideInfo")
    protected LocationOverrideInfo locationOverrideInfo;

    /**
     * Gets the value of the locationOverrideInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LocationOverrideInfo }
     *     
     */
    public LocationOverrideInfo getLocationOverrideInfo() {
        return locationOverrideInfo;
    }

    /**
     * Sets the value of the locationOverrideInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationOverrideInfo }
     *     
     */
    public void setLocationOverrideInfo(LocationOverrideInfo value) {
        this.locationOverrideInfo = value;
    }

}
