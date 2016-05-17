
package com.google.api.ads.dfp.jaxws.v201605;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Contains a date value.
 *           
 * 
 * <p>Java class for DateValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateValue">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201605}Value">
 *       &lt;sequence>
 *         &lt;element name="value" type="{https://www.google.com/apis/ads/publisher/v201605}Date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateValue", propOrder = {
    "value"
})
public class DateValue
    extends Value
{

    protected Date value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setValue(Date value) {
        this.value = value;
    }

}
