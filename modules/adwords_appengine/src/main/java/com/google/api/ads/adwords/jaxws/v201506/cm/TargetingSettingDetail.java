
package com.google.api.ads.adwords.jaxws.v201506.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Specifies if criteria of this type group should be used to restrict
 *             targeting, or if ads can serve anywhere and criteria are only used in
 *             determining the bid.
 *             <p>For more information, see
 *             <a href="https://support.google.com/adwords/answer/6056342">Targeting Settings</a>.</p>
 *           
 * 
 * <p>Java class for TargetingSettingDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetingSettingDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="criterionTypeGroup" type="{https://adwords.google.com/api/adwords/cm/v201506}CriterionTypeGroup" minOccurs="0"/>
 *         &lt;element name="targetAll" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetingSettingDetail", propOrder = {
    "criterionTypeGroup",
    "targetAll"
})
public class TargetingSettingDetail {

    @XmlSchemaType(name = "string")
    protected CriterionTypeGroup criterionTypeGroup;
    protected Boolean targetAll;

    /**
     * Gets the value of the criterionTypeGroup property.
     * 
     * @return
     *     possible object is
     *     {@link CriterionTypeGroup }
     *     
     */
    public CriterionTypeGroup getCriterionTypeGroup() {
        return criterionTypeGroup;
    }

    /**
     * Sets the value of the criterionTypeGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriterionTypeGroup }
     *     
     */
    public void setCriterionTypeGroup(CriterionTypeGroup value) {
        this.criterionTypeGroup = value;
    }

    /**
     * Gets the value of the targetAll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTargetAll() {
        return targetAll;
    }

    /**
     * Sets the value of the targetAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTargetAll(Boolean value) {
        this.targetAll = value;
    }

}
