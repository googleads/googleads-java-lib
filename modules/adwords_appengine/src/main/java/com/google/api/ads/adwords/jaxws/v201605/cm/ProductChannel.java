
package com.google.api.ads.adwords.jaxws.v201605.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The product channel dimension, which specifies the locality of an offer. Only supported by
 *             campaigns of {@link AdvertisingChannelType#SHOPPING}.
 *           
 * 
 * <p>Java class for ProductChannel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductChannel">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201605}ProductDimension">
 *       &lt;sequence>
 *         &lt;element name="channel" type="{https://adwords.google.com/api/adwords/cm/v201605}ShoppingProductChannel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductChannel", propOrder = {
    "channel"
})
public class ProductChannel
    extends ProductDimension
{

    @XmlSchemaType(name = "string")
    protected ShoppingProductChannel channel;

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingProductChannel }
     *     
     */
    public ShoppingProductChannel getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingProductChannel }
     *     
     */
    public void setChannel(ShoppingProductChannel value) {
        this.channel = value;
    }

}
