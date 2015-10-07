
package com.google.api.ads.adwords.jaxws.v201509.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Dimension by which to subdivide or filter products.
 *           
 * 
 * <p>Java class for ProductDimension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductDimension">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductDimension.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductDimension", propOrder = {
    "productDimensionType"
})
@XmlSeeAlso({
    ProductBiddingCategory.class,
    UnknownProductDimension.class,
    ProductChannel.class,
    ProductCanonicalCondition.class,
    ProductCustomAttribute.class,
    ProductTypeFull.class,
    ProductType.class,
    ProductChannelExclusivity.class,
    ProductAdwordsLabels.class,
    ProductLegacyCondition.class,
    ProductAdwordsGrouping.class,
    ProductOfferId.class,
    ProductBrand.class
})
public abstract class ProductDimension {

    @XmlElement(name = "ProductDimension.Type")
    protected String productDimensionType;

    /**
     * Gets the value of the productDimensionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDimensionType() {
        return productDimensionType;
    }

    /**
     * Sets the value of the productDimensionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDimensionType(String value) {
        this.productDimensionType = value;
    }

}
