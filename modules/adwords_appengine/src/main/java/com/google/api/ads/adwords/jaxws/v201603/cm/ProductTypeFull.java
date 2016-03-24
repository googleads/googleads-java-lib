
package com.google.api.ads.adwords.jaxws.v201603.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A full product type string. Category of the product according to the merchant's own
 *             classification. Example:
 *             
 *             <pre>{@code "Home & Garden > Kitchen & Dining > Kitchen Appliances > Refrigerators"}</pre>
 *             
 *             <p>Not supported by campaigns of {@link AdvertisingChannelType#SHOPPING}.
 *           
 * 
 * <p>Java class for ProductTypeFull complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductTypeFull">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201603}ProductDimension">
 *       &lt;sequence>
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
@XmlType(name = "ProductTypeFull", propOrder = {
    "value"
})
public class ProductTypeFull
    extends ProductDimension
{

    protected String value;

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
