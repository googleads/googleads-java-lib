
package com.google.api.ads.adwords.jaxws.v201603.billing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rval" type="{https://adwords.google.com/api/adwords/billing/v201603}BudgetOrderReturnValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rval"
})
@XmlRootElement(name = "mutateResponse")
public class MutateResponse {

    protected BudgetOrderReturnValue rval;

    /**
     * Gets the value of the rval property.
     * 
     * @return
     *     possible object is
     *     {@link BudgetOrderReturnValue }
     *     
     */
    public BudgetOrderReturnValue getRval() {
        return rval;
    }

    /**
     * Sets the value of the rval property.
     * 
     * @param value
     *     allowed object is
     *     {@link BudgetOrderReturnValue }
     *     
     */
    public void setRval(BudgetOrderReturnValue value) {
        this.rval = value;
    }

}
