
package com.google.api.ads.adwords.jaxws.v201306.o;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201306.cm.ComparableValue;


/**
 * 
 *             Represents a range of values that has either an upper or a lower bound.
 *           
 * 
 * <p>Java class for Range complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Range">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="min" type="{https://adwords.google.com/api/adwords/cm/v201306}ComparableValue" minOccurs="0"/>
 *         &lt;element name="max" type="{https://adwords.google.com/api/adwords/cm/v201306}ComparableValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Range", propOrder = {
    "min",
    "max"
})
public class Range {

    protected ComparableValue min;
    protected ComparableValue max;

    /**
     * Gets the value of the min property.
     * 
     * @return
     *     possible object is
     *     {@link ComparableValue }
     *     
     */
    public ComparableValue getMin() {
        return min;
    }

    /**
     * Sets the value of the min property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparableValue }
     *     
     */
    public void setMin(ComparableValue value) {
        this.min = value;
    }

    /**
     * Gets the value of the max property.
     * 
     * @return
     *     possible object is
     *     {@link ComparableValue }
     *     
     */
    public ComparableValue getMax() {
        return max;
    }

    /**
     * Sets the value of the max property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparableValue }
     *     
     */
    public void setMax(ComparableValue value) {
        this.max = value;
    }

}
