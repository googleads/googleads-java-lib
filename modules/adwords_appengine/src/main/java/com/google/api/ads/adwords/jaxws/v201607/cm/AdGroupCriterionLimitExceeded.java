
package com.google.api.ads.adwords.jaxws.v201607.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Signals that too many criteria were added to some ad group.
 *           
 * 
 * <p>Java class for AdGroupCriterionLimitExceeded complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdGroupCriterionLimitExceeded">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201607}EntityCountLimitExceeded">
 *       &lt;sequence>
 *         &lt;element name="limitType" type="{https://adwords.google.com/api/adwords/cm/v201607}AdGroupCriterionLimitExceeded.CriteriaLimitType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdGroupCriterionLimitExceeded", propOrder = {
    "limitType"
})
public class AdGroupCriterionLimitExceeded
    extends EntityCountLimitExceeded
{

    @XmlSchemaType(name = "string")
    protected AdGroupCriterionLimitExceededCriteriaLimitType limitType;

    /**
     * Gets the value of the limitType property.
     * 
     * @return
     *     possible object is
     *     {@link AdGroupCriterionLimitExceededCriteriaLimitType }
     *     
     */
    public AdGroupCriterionLimitExceededCriteriaLimitType getLimitType() {
        return limitType;
    }

    /**
     * Sets the value of the limitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdGroupCriterionLimitExceededCriteriaLimitType }
     *     
     */
    public void setLimitType(AdGroupCriterionLimitExceededCriteriaLimitType value) {
        this.limitType = value;
    }

}
