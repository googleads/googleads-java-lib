
package com.google.api.ads.dfp.jaxws.v201306;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the actions that can be performed on products.
 *           
 * 
 * <p>Java class for ProductAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductAction.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductAction", propOrder = {
    "productActionType"
})
@XmlSeeAlso({
    ArchiveProducts.class,
    DeactivateProducts.class,
    ActivateProducts.class
})
public abstract class ProductAction {

    @XmlElement(name = "ProductAction.Type")
    protected String productActionType;

    /**
     * Gets the value of the productActionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductActionType() {
        return productActionType;
    }

    /**
     * Sets the value of the productActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductActionType(String value) {
        this.productActionType = value;
    }

}
