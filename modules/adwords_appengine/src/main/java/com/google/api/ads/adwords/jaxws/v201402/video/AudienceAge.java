
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents age criterion used for audience targeting.
 *             Age criterion is immutable.
 *           
 * 
 * <p>Java class for AudienceAge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AudienceAge">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/video/v201402}BaseCriterion">
 *       &lt;sequence>
 *         &lt;element name="ageRange" type="{https://adwords.google.com/api/adwords/video/v201402}AudienceAge.AgeRange" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudienceAge", propOrder = {
    "ageRange"
})
public class AudienceAge
    extends BaseCriterion
{

    protected AudienceAgeAgeRange ageRange;

    /**
     * Gets the value of the ageRange property.
     * 
     * @return
     *     possible object is
     *     {@link AudienceAgeAgeRange }
     *     
     */
    public AudienceAgeAgeRange getAgeRange() {
        return ageRange;
    }

    /**
     * Sets the value of the ageRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudienceAgeAgeRange }
     *     
     */
    public void setAgeRange(AudienceAgeAgeRange value) {
        this.ageRange = value;
    }

}
