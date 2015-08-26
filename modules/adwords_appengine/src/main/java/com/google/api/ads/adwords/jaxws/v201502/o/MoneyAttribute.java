
package com.google.api.ads.adwords.jaxws.v201502.o;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201502.cm.Money;


/**
 * 
 *             {@link Attribute} type that contains a {@link Money} value.
 *           
 * 
 * <p>Java class for MoneyAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MoneyAttribute">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/o/v201502}Attribute">
 *       &lt;sequence>
 *         &lt;element name="value" type="{https://adwords.google.com/api/adwords/cm/v201502}Money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoneyAttribute", propOrder = {
    "value"
})
public class MoneyAttribute
    extends Attribute
{

    protected Money value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setValue(Money value) {
        this.value = value;
    }

}
