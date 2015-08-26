
package com.google.api.ads.adwords.jaxws.v201502.rm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             An atomic rule fragment composing of date operation.
 *           
 * 
 * <p>Java class for DateRuleItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateRuleItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{https://adwords.google.com/api/adwords/rm/v201502}DateKey" minOccurs="0"/>
 *         &lt;element name="op" type="{https://adwords.google.com/api/adwords/rm/v201502}DateRuleItem.DateOperator" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateRuleItem", propOrder = {
    "key",
    "op",
    "value"
})
public class DateRuleItem {

    protected DateKey key;
    @XmlSchemaType(name = "string")
    protected DateRuleItemDateOperator op;
    protected String value;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link DateKey }
     *     
     */
    public DateKey getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateKey }
     *     
     */
    public void setKey(DateKey value) {
        this.key = value;
    }

    /**
     * Gets the value of the op property.
     * 
     * @return
     *     possible object is
     *     {@link DateRuleItemDateOperator }
     *     
     */
    public DateRuleItemDateOperator getOp() {
        return op;
    }

    /**
     * Sets the value of the op property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRuleItemDateOperator }
     *     
     */
    public void setOp(DateRuleItemDateOperator value) {
        this.op = value;
    }

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
