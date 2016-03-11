
package com.google.api.ads.dfp.jaxws.v201511;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Billable revenue overrides for a {@link ReconciliationLineItemReport} to be
 *             used instead of the Google calculated ones.
 *           
 * 
 * <p>Java class for BillableRevenueOverrides complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillableRevenueOverrides">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="netBillableRevenueOverride" type="{https://www.google.com/apis/ads/publisher/v201511}Money" minOccurs="0"/>
 *         &lt;element name="grossBillableRevenueOverride" type="{https://www.google.com/apis/ads/publisher/v201511}Money" minOccurs="0"/>
 *         &lt;element name="billableRevenueOverride" type="{https://www.google.com/apis/ads/publisher/v201511}Money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillableRevenueOverrides", propOrder = {
    "netBillableRevenueOverride",
    "grossBillableRevenueOverride",
    "billableRevenueOverride"
})
public class BillableRevenueOverrides {

    protected Money netBillableRevenueOverride;
    protected Money grossBillableRevenueOverride;
    protected Money billableRevenueOverride;

    /**
     * Gets the value of the netBillableRevenueOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getNetBillableRevenueOverride() {
        return netBillableRevenueOverride;
    }

    /**
     * Sets the value of the netBillableRevenueOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setNetBillableRevenueOverride(Money value) {
        this.netBillableRevenueOverride = value;
    }

    /**
     * Gets the value of the grossBillableRevenueOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getGrossBillableRevenueOverride() {
        return grossBillableRevenueOverride;
    }

    /**
     * Sets the value of the grossBillableRevenueOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setGrossBillableRevenueOverride(Money value) {
        this.grossBillableRevenueOverride = value;
    }

    /**
     * Gets the value of the billableRevenueOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getBillableRevenueOverride() {
        return billableRevenueOverride;
    }

    /**
     * Sets the value of the billableRevenueOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setBillableRevenueOverride(Money value) {
        this.billableRevenueOverride = value;
    }

}
