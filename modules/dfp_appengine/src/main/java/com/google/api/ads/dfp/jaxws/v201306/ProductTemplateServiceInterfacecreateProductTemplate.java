
package com.google.api.ads.dfp.jaxws.v201306;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Creates a new {@link ProductTemplate}.
 *             
 *             The following fields are required:
 *             <ul>
 *             <li>{@link ProductTemplate#name}</li>
 *             <li>{@link ProductTemplate#nameMacro}</li>
 *             <li>{@link ProductTemplate#productType}</li>
 *             <li>{@link ProductTemplate#rateType}</li>
 *             <li>{@link ProductTemplate#creativePlaceholders}
 *             (only when {@link ProductTemplate#productType} is {@link ProductType#DFP})</li>
 *             <li>{@link ProductTemplate#lineItemType}
 *             (only when {@link ProductTemplate#productType} is {@link ProductType#DFP})</li>
 *             <li>{@link ProductTemplate#targeting} (only if {@link ProductTemplate#productType} is
 *             {@link ProductType#DFP} and {@link ProductTemplate#productSegmentation}
 *             is not specified)</li>
 *             </ul>
 *             
 *             @param productTemplate the product template to create
 *             @return the persisted product template with tis ID filled in
 *           
 * 
 * <p>Java class for createProductTemplate element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="createProductTemplate">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="productTemplate" type="{https://www.google.com/apis/ads/publisher/v201306}ProductTemplate" minOccurs="0"/>
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
@XmlRootElement(name = "createProductTemplate")
public class ProductTemplateServiceInterfacecreateProductTemplate {

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
