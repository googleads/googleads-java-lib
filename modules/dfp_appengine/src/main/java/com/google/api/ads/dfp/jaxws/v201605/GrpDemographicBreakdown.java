
package com.google.api.ads.dfp.jaxws.v201605;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             GRP forecast breakdown counts associated with a gender and age demographic.
 *           
 * 
 * <p>Java class for GrpDemographicBreakdown complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrpDemographicBreakdown">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="availableUnits" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="matchedUnits" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="unitType" type="{https://www.google.com/apis/ads/publisher/v201605}GrpUnitType" minOccurs="0"/>
 *         &lt;element name="gender" type="{https://www.google.com/apis/ads/publisher/v201605}GrpGender" minOccurs="0"/>
 *         &lt;element name="age" type="{https://www.google.com/apis/ads/publisher/v201605}GrpAge" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrpDemographicBreakdown", propOrder = {
    "availableUnits",
    "matchedUnits",
    "unitType",
    "gender",
    "age"
})
public class GrpDemographicBreakdown {

    protected Long availableUnits;
    protected Long matchedUnits;
    @XmlSchemaType(name = "string")
    protected GrpUnitType unitType;
    @XmlSchemaType(name = "string")
    protected GrpGender gender;
    @XmlSchemaType(name = "string")
    protected GrpAge age;

    /**
     * Gets the value of the availableUnits property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAvailableUnits() {
        return availableUnits;
    }

    /**
     * Sets the value of the availableUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAvailableUnits(Long value) {
        this.availableUnits = value;
    }

    /**
     * Gets the value of the matchedUnits property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMatchedUnits() {
        return matchedUnits;
    }

    /**
     * Sets the value of the matchedUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMatchedUnits(Long value) {
        this.matchedUnits = value;
    }

    /**
     * Gets the value of the unitType property.
     * 
     * @return
     *     possible object is
     *     {@link GrpUnitType }
     *     
     */
    public GrpUnitType getUnitType() {
        return unitType;
    }

    /**
     * Sets the value of the unitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrpUnitType }
     *     
     */
    public void setUnitType(GrpUnitType value) {
        this.unitType = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link GrpGender }
     *     
     */
    public GrpGender getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrpGender }
     *     
     */
    public void setGender(GrpGender value) {
        this.gender = value;
    }

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link GrpAge }
     *     
     */
    public GrpAge getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrpAge }
     *     
     */
    public void setAge(GrpAge value) {
        this.age = value;
    }

}
