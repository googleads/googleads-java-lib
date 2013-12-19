
package com.google.api.ads.dfp.jaxws.v201308;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Base class for a {@link Contact}.
 *           
 * 
 * <p>Java class for BaseContact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseContact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseContact.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseContact", propOrder = {
    "baseContactType"
})
@XmlSeeAlso({
    Contact.class
})
public class BaseContact {

    @XmlElement(name = "BaseContact.Type")
    protected String baseContactType;

    /**
     * Gets the value of the baseContactType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseContactType() {
        return baseContactType;
    }

    /**
     * Sets the value of the baseContactType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseContactType(String value) {
        this.baseContactType = value;
    }

}
