
package com.google.api.ads.adwords.jaxws.v201409.o;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201409.cm.BidLandscape;


/**
 * 
 *             {@link Attribute} type that contains a {@link BidLandscape} value.
 *           
 * 
 * <p>Java class for BidLandscapeAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BidLandscapeAttribute">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/o/v201409}Attribute">
 *       &lt;sequence>
 *         &lt;element name="value" type="{https://adwords.google.com/api/adwords/cm/v201409}BidLandscape" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BidLandscapeAttribute", propOrder = {
    "value"
})
public class BidLandscapeAttribute
    extends Attribute
{

    protected BidLandscape value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BidLandscape }
     *     
     */
    public BidLandscape getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BidLandscape }
     *     
     */
    public void setValue(BidLandscape value) {
        this.value = value;
    }

}
