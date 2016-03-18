
package com.google.api.ads.adwords.jaxws.v201506.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Marker interface for ConstantDataService objects. This is primarily required for field
 *             catalog generation.
 *           
 * 
 * <p>Java class for ConstantData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConstantData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConstantData.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConstantData", propOrder = {
    "constantDataType"
})
@XmlSeeAlso({
    ProductBiddingCategoryData.class
})
public class ConstantData {

    @XmlElement(name = "ConstantData.Type")
    protected String constantDataType;

    /**
     * Gets the value of the constantDataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstantDataType() {
        return constantDataType;
    }

    /**
     * Sets the value of the constantDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstantDataType(String value) {
        this.constantDataType = value;
    }

}
