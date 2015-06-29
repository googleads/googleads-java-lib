
package com.google.api.ads.adwords.jaxws.v201506.o;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             {@link Attribute} type that contains an {@link InStreamAdInfo} value.
 *           
 * 
 * <p>Java class for InStreamAdInfoAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InStreamAdInfoAttribute">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/o/v201506}Attribute">
 *       &lt;sequence>
 *         &lt;element name="value" type="{https://adwords.google.com/api/adwords/o/v201506}InStreamAdInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InStreamAdInfoAttribute", propOrder = {
    "value"
})
public class InStreamAdInfoAttribute
    extends Attribute
{

    protected InStreamAdInfo value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link InStreamAdInfo }
     *     
     */
    public InStreamAdInfo getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link InStreamAdInfo }
     *     
     */
    public void setValue(InStreamAdInfo value) {
        this.value = value;
    }

}
