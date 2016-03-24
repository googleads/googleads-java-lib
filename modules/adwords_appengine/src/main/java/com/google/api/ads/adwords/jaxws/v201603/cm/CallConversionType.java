
package com.google.api.ads.adwords.jaxws.v201603.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Conversion type for a call extension.
 *           
 * 
 * <p>Java class for CallConversionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CallConversionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conversionTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallConversionType", propOrder = {
    "conversionTypeId"
})
public class CallConversionType {

    protected Long conversionTypeId;

    /**
     * Gets the value of the conversionTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConversionTypeId() {
        return conversionTypeId;
    }

    /**
     * Sets the value of the conversionTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConversionTypeId(Long value) {
        this.conversionTypeId = value;
    }

}
