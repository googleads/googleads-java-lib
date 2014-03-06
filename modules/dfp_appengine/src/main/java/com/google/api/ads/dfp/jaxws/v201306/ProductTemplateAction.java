
package com.google.api.ads.dfp.jaxws.v201306;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the actions that can be performed on product templates.
 *           
 * 
 * <p>Java class for ProductTemplateAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductTemplateAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductTemplateAction.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductTemplateAction", propOrder = {
    "productTemplateActionType"
})
@XmlSeeAlso({
    ArchiveProducTemplates.class,
    DeactivateProductTemplates.class,
    ActivateProductTemplates.class
})
public abstract class ProductTemplateAction {

    @XmlElement(name = "ProductTemplateAction.Type")
    protected String productTemplateActionType;

    /**
     * Gets the value of the productTemplateActionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductTemplateActionType() {
        return productTemplateActionType;
    }

    /**
     * Sets the value of the productTemplateActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductTemplateActionType(String value) {
        this.productTemplateActionType = value;
    }

}
