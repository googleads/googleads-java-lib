
package com.google.api.ads.adwords.jaxws.v201406.video;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201406.cm.Money;


/**
 * 
 *             Class representing the various summary budgets for a campaign page.
 *           
 * 
 * <p>Java class for SummaryBudgets complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SummaryBudgets">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="totalVideoBudget" type="{https://adwords.google.com/api/adwords/video/v201406}VideoBudget" minOccurs="0"/>
 *         &lt;element name="nonVideoBudget" type="{https://adwords.google.com/api/adwords/cm/v201406}Money" minOccurs="0"/>
 *         &lt;element name="combinedBudget" type="{https://adwords.google.com/api/adwords/cm/v201406}Money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SummaryBudgets", propOrder = {
    "totalVideoBudget",
    "nonVideoBudget",
    "combinedBudget"
})
public class SummaryBudgets {

    protected VideoBudget totalVideoBudget;
    protected Money nonVideoBudget;
    protected Money combinedBudget;

    /**
     * Gets the value of the totalVideoBudget property.
     * 
     * @return
     *     possible object is
     *     {@link VideoBudget }
     *     
     */
    public VideoBudget getTotalVideoBudget() {
        return totalVideoBudget;
    }

    /**
     * Sets the value of the totalVideoBudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoBudget }
     *     
     */
    public void setTotalVideoBudget(VideoBudget value) {
        this.totalVideoBudget = value;
    }

    /**
     * Gets the value of the nonVideoBudget property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getNonVideoBudget() {
        return nonVideoBudget;
    }

    /**
     * Sets the value of the nonVideoBudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setNonVideoBudget(Money value) {
        this.nonVideoBudget = value;
    }

    /**
     * Gets the value of the combinedBudget property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCombinedBudget() {
        return combinedBudget;
    }

    /**
     * Sets the value of the combinedBudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCombinedBudget(Money value) {
        this.combinedBudget = value;
    }

}
