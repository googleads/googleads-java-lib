
package com.google.api.ads.adwords.jaxws.v201603.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A custom attribute value. As a product can have multiple custom attributes, the user must specify
 *             a dimension type that indicates the index of the attribute by which to subdivide. All cases of
 *             the same subdivision must have the same dimension type (attribute index).
 *           
 * 
 * <p>Java class for ProductCustomAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductCustomAttribute">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201603}ProductDimension">
 *       &lt;sequence>
 *         &lt;element name="type" type="{https://adwords.google.com/api/adwords/cm/v201603}ProductDimensionType" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductCustomAttribute", propOrder = {
    "type",
    "value"
})
public class ProductCustomAttribute
    extends ProductDimension
{

    @XmlSchemaType(name = "string")
    protected ProductDimensionType type;
    protected String value;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDimensionType }
     *     
     */
    public ProductDimensionType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDimensionType }
     *     
     */
    public void setType(ProductDimensionType value) {
        this.type = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
