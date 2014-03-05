
package com.google.api.ads.dfp.jaxws.v201311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A base rate applied to a {@link ProductTemplate}.
 *           
 * 
 * <p>Java class for ProductTemplateBaseRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductTemplateBaseRate">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201311}BaseRate">
 *       &lt;sequence>
 *         &lt;element name="productTemplateId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rate" type="{https://www.google.com/apis/ads/publisher/v201311}Money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductTemplateBaseRate", propOrder = {
    "productTemplateId",
    "rate"
})
public class ProductTemplateBaseRate
    extends BaseRate
{

    protected Long productTemplateId;
    protected Money rate;

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

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setRate(Money value) {
        this.rate = value;
    }

}
