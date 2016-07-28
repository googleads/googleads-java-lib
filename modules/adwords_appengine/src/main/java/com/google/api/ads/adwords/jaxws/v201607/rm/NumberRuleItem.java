
package com.google.api.ads.adwords.jaxws.v201607.rm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             An atomic rule fragment composing of number operation.
 *           
 * 
 * <p>Java class for NumberRuleItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumberRuleItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{https://adwords.google.com/api/adwords/rm/v201607}NumberKey" minOccurs="0"/>
 *         &lt;element name="op" type="{https://adwords.google.com/api/adwords/rm/v201607}NumberRuleItem.NumberOperator" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberRuleItem", propOrder = {
    "key",
    "op",
    "value"
})
public class NumberRuleItem {

    protected NumberKey key;
    @XmlSchemaType(name = "string")
    protected NumberRuleItemNumberOperator op;
    protected Double value;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link NumberKey }
     *     
     */
    public NumberKey getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberKey }
     *     
     */
    public void setKey(NumberKey value) {
        this.key = value;
    }

    /**
     * Gets the value of the op property.
     * 
     * @return
     *     possible object is
     *     {@link NumberRuleItemNumberOperator }
     *     
     */
    public NumberRuleItemNumberOperator getOp() {
        return op;
    }

    /**
     * Sets the value of the op property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberRuleItemNumberOperator }
     *     
     */
    public void setOp(NumberRuleItemNumberOperator value) {
        this.op = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValue(Double value) {
        this.value = value;
    }

}
