
package com.google.api.ads.adwords.jaxws.v201406.video;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents gender criterion used for audience targeting.
 *             Gender criterion is immutable.
 *           
 * 
 * <p>Java class for AudienceGender complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AudienceGender">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/video/v201406}BaseCriterion">
 *       &lt;sequence>
 *         &lt;element name="genderType" type="{https://adwords.google.com/api/adwords/video/v201406}AudienceGender.GenderType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudienceGender", propOrder = {
    "genderType"
})
public class AudienceGender
    extends BaseCriterion
{

    protected AudienceGenderGenderType genderType;

    /**
     * Gets the value of the genderType property.
     * 
     * @return
     *     possible object is
     *     {@link AudienceGenderGenderType }
     *     
     */
    public AudienceGenderGenderType getGenderType() {
        return genderType;
    }

    /**
     * Sets the value of the genderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudienceGenderGenderType }
     *     
     */
    public void setGenderType(AudienceGenderGenderType value) {
        this.genderType = value;
    }

}
