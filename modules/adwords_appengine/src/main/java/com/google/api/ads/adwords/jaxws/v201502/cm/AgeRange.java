
package com.google.api.ads.adwords.jaxws.v201502.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents an Age Range criterion.
 *             <p>A criterion of this type can only be created using an ID. A criterion of this type can be either targeted or excluded.
 *             <span class="constraint AdxEnabled">This is disabled for AdX when it is contained within Operators: ADD, SET.</span>
 *           
 * 
 * <p>Java class for AgeRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgeRange">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201502}Criterion">
 *       &lt;sequence>
 *         &lt;element name="ageRangeType" type="{https://adwords.google.com/api/adwords/cm/v201502}AgeRange.AgeRangeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgeRange", propOrder = {
    "ageRangeType"
})
public class AgeRange
    extends Criterion
{

    @XmlSchemaType(name = "string")
    protected AgeRangeAgeRangeType ageRangeType;

    /**
     * Gets the value of the ageRangeType property.
     * 
     * @return
     *     possible object is
     *     {@link AgeRangeAgeRangeType }
     *     
     */
    public AgeRangeAgeRangeType getAgeRangeType() {
        return ageRangeType;
    }

    /**
     * Sets the value of the ageRangeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgeRangeAgeRangeType }
     *     
     */
    public void setAgeRangeType(AgeRangeAgeRangeType value) {
        this.ageRangeType = value;
    }

}
