
package com.google.api.ads.dfp.jaxws.v201311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Updates the specified {@link ProductTemplate}.
 *             
 *             @param productTemplate the product template to update
 *             @return the updated product template
 *           
 * 
 * <p>Java class for updateProductTemplate element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="updateProductTemplate">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="productTemplate" type="{https://www.google.com/apis/ads/publisher/v201311}ProductTemplate" minOccurs="0"/>
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
    "productTemplate"
})
@XmlRootElement(name = "updateProductTemplate")
public class ProductTemplateServiceInterfaceupdateProductTemplate {

    protected ProductTemplate productTemplate;

    /**
     * Gets the value of the productTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link ProductTemplate }
     *     
     */
    public ProductTemplate getProductTemplate() {
        return productTemplate;
    }

    /**
     * Sets the value of the productTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductTemplate }
     *     
     */
    public void setProductTemplate(ProductTemplate value) {
        this.productTemplate = value;
    }

}
