
package com.google.api.ads.adwords.jaxws.v201409.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents information about enum values.
 *           
 * 
 * <p>Java class for EnumValuePair complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnumValuePair">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enumValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enumDisplayValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnumValuePair", propOrder = {
    "enumValue",
    "enumDisplayValue"
})
public class EnumValuePair {

    protected String enumValue;
    protected String enumDisplayValue;

    /**
     * Gets the value of the enumValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnumValue() {
        return enumValue;
    }

    /**
     * Sets the value of the enumValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnumValue(String value) {
        this.enumValue = value;
    }

    /**
     * Gets the value of the enumDisplayValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnumDisplayValue() {
        return enumDisplayValue;
    }

    /**
     * Sets the value of the enumDisplayValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnumDisplayValue(String value) {
        this.enumDisplayValue = value;
    }

}
