
package com.google.api.ads.dfp.jaxws.v201306;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Returns the {@link ProductTemplate} uniquely identified by the given ID.
 *             
 *             @param productTemplateId the ID of the product template, which must already
 *             exist
 *             @return the {@code ProductTemplate} uniquely identified by the given ID
 *           
 * 
 * <p>Java class for getProductTemplate element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getProductTemplate">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="productTemplateId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "productTemplateId"
})
@XmlRootElement(name = "getProductTemplate")
public class ProductTemplateServiceInterfacegetProductTemplate {

    protected Long productTemplateId;

    /**
     * Gets the value of the productTemplateId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProductTemplateId() {
        return productTemplateId;
    }

    /**
     * Sets the value of the productTemplateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProductTemplateId(Long value) {
        this.productTemplateId = value;
    }

}
