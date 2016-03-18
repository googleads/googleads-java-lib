
package com.google.api.ads.adwords.jaxws.v201601.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Base type for AdWords label attributes.
 *           
 * 
 * <p>Java class for LabelAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LabelAttribute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LabelAttribute.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabelAttribute", propOrder = {
    "labelAttributeType"
})
@XmlSeeAlso({
    DisplayAttribute.class
})
public class LabelAttribute {

    @XmlElement(name = "LabelAttribute.Type")
    protected String labelAttributeType;

    /**
     * Gets the value of the labelAttributeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelAttributeType() {
        return labelAttributeType;
    }

    /**
     * Sets the value of the labelAttributeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelAttributeType(String value) {
        this.labelAttributeType = value;
    }

}
