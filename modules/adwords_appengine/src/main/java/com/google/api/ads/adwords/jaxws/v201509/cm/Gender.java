
package com.google.api.ads.adwords.jaxws.v201509.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a Gender criterion.
 *             <p>A criterion of this type can only be created using an ID. A criterion of this type can be either targeted or excluded.
 *             <span class="constraint AdxEnabled">This is disabled for AdX when it is contained within Operators: ADD, SET.</span>
 *           
 * 
 * <p>Java class for Gender complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Gender">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201509}Criterion">
 *       &lt;sequence>
 *         &lt;element name="genderType" type="{https://adwords.google.com/api/adwords/cm/v201509}Gender.GenderType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Gender", propOrder = {
    "genderType"
})
public class Gender
    extends Criterion
{

    @XmlSchemaType(name = "string")
    protected GenderGenderType genderType;

    /**
     * Gets the value of the genderType property.
     * 
     * @return
     *     possible object is
     *     {@link GenderGenderType }
     *     
     */
    public GenderGenderType getGenderType() {
        return genderType;
    }

    /**
     * Sets the value of the genderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderGenderType }
     *     
     */
    public void setGenderType(GenderGenderType value) {
        this.genderType = value;
    }

}
