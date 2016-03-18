
package com.google.api.ads.adwords.jaxws.v201601.billing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201601.cm.ApiError;


/**
 * 
 *             Error information for BudgetOrderService.
 *           
 * 
 * <p>Java class for BudgetOrderError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BudgetOrderError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201601}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://adwords.google.com/api/adwords/billing/v201601}BudgetOrderError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BudgetOrderError", propOrder = {
    "reason"
})
public class BudgetOrderError
    extends ApiError
{

    @XmlSchemaType(name = "string")
    protected BudgetOrderErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link BudgetOrderErrorReason }
     *     
     */
    public BudgetOrderErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link BudgetOrderErrorReason }
     *     
     */
    public void setReason(BudgetOrderErrorReason value) {
        this.reason = value;
    }

}
