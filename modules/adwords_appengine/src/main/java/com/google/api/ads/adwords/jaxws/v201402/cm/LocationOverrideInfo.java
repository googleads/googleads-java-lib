
package com.google.api.ads.adwords.jaxws.v201402.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents override info for ad level LocationExtension overrides.
 *           
 * 
 * <p>Java class for LocationOverrideInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationOverrideInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="radius" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="radiusUnits" type="{https://adwords.google.com/api/adwords/cm/v201402}LocationOverrideInfo.RadiusUnits" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationOverrideInfo", propOrder = {
    "radius",
    "radiusUnits"
})
public class LocationOverrideInfo {

    protected Integer radius;
    protected LocationOverrideInfoRadiusUnits radiusUnits;

    /**
     * Gets the value of the radius property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRadius(Integer value) {
        this.radius = value;
    }

    /**
     * Gets the value of the radiusUnits property.
     * 
     * @return
     *     possible object is
     *     {@link LocationOverrideInfoRadiusUnits }
     *     
     */
    public LocationOverrideInfoRadiusUnits getRadiusUnits() {
        return radiusUnits;
    }

    /**
     * Sets the value of the radiusUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationOverrideInfoRadiusUnits }
     *     
     */
    public void setRadiusUnits(LocationOverrideInfoRadiusUnits value) {
        this.radiusUnits = value;
    }

}
