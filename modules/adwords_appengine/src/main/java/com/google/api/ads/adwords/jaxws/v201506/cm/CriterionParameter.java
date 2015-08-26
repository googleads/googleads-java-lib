
package com.google.api.ads.adwords.jaxws.v201506.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Base type of criterion parameters.
 *           
 * 
 * <p>Java class for CriterionParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CriterionParameter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CriterionParameter.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CriterionParameter", propOrder = {
    "criterionParameterType"
})
@XmlSeeAlso({
    WebpageParameter.class
})
public abstract class CriterionParameter {

    @XmlElement(name = "CriterionParameter.Type")
    protected String criterionParameterType;

    /**
     * Gets the value of the criterionParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriterionParameterType() {
        return criterionParameterType;
    }

    /**
     * Sets the value of the criterionParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriterionParameterType(String value) {
        this.criterionParameterType = value;
    }

}
