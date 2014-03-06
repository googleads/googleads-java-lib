
package com.google.api.ads.adwords.jaxws.v201306.o;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             {@link Attribute} type that contains a {@link Range} of {@link LongValue}
 *             values.
 *           
 * 
 * <p>Java class for LongRangeAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LongRangeAttribute">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/o/v201306}Attribute">
 *       &lt;sequence>
 *         &lt;element name="value" type="{https://adwords.google.com/api/adwords/o/v201306}Range" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LongRangeAttribute", propOrder = {
    "value"
})
public class LongRangeAttribute
    extends Attribute
{

    protected Range value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Range }
     *     
     */
    public Range getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Range }
     *     
     */
    public void setValue(Range value) {
        this.value = value;
    }

}
