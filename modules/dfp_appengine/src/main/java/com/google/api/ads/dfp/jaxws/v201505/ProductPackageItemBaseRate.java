
package com.google.api.ads.dfp.jaxws.v201505;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A base rate applied to a {@link ProductPackageItem}.
 *           
 * 
 * <p>Java class for ProductPackageItemBaseRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductPackageItemBaseRate">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201505}BaseRate">
 *       &lt;sequence>
 *         &lt;element name="productPackageItemId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rate" type="{https://www.google.com/apis/ads/publisher/v201505}Money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductPackageItemBaseRate", propOrder = {
    "productPackageItemId",
    "rate"
})
public class ProductPackageItemBaseRate
    extends BaseRate
{

    protected Long productPackageItemId;
    protected Money rate;

    /**
     * Gets the value of the productPackageItemId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProductPackageItemId() {
        return productPackageItemId;
    }

    /**
     * Sets the value of the productPackageItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProductPackageItemId(Long value) {
        this.productPackageItemId = value;
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
