
package com.google.api.ads.adwords.jaxws.v201509.express;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201509.cm.Money;


/**
 * 
 *             A budget suggestion and its associated data (all are estimates).
 *           
 * 
 * <p>Java class for BudgetSuggestion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BudgetSuggestion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cpc" type="{https://adwords.google.com/api/adwords/cm/v201509}Money" minOccurs="0"/>
 *         &lt;element name="minCpc" type="{https://adwords.google.com/api/adwords/cm/v201509}Money" minOccurs="0"/>
 *         &lt;element name="maxCpc" type="{https://adwords.google.com/api/adwords/cm/v201509}Money" minOccurs="0"/>
 *         &lt;element name="cpm" type="{https://adwords.google.com/api/adwords/cm/v201509}Money" minOccurs="0"/>
 *         &lt;element name="suggestedBudget" type="{https://adwords.google.com/api/adwords/cm/v201509}Money" minOccurs="0"/>
 *         &lt;element name="minBudget" type="{https://adwords.google.com/api/adwords/cm/v201509}Money" minOccurs="0"/>
 *         &lt;element name="maxBudget" type="{https://adwords.google.com/api/adwords/cm/v201509}Money" minOccurs="0"/>
 *         &lt;element name="budgetQuantiles" type="{https://adwords.google.com/api/adwords/cm/v201509}Money" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="impressions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="currencyCode" type="{https://adwords.google.com/api/adwords/express/v201509}CurrencyCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BudgetSuggestion", propOrder = {
    "cpc",
    "minCpc",
    "maxCpc",
    "cpm",
    "suggestedBudget",
    "minBudget",
    "maxBudget",
    "budgetQuantiles",
    "impressions",
    "currencyCode"
})
public class BudgetSuggestion {

    protected Money cpc;
    protected Money minCpc;
    protected Money maxCpc;
    protected Money cpm;
    protected Money suggestedBudget;
    protected Money minBudget;
    protected Money maxBudget;
    protected List<Money> budgetQuantiles;
    protected Long impressions;
    @XmlSchemaType(name = "string")
    protected CurrencyCode currencyCode;

    /**
     * Gets the value of the cpc property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCpc() {
        return cpc;
    }

    /**
     * Sets the value of the cpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCpc(Money value) {
        this.cpc = value;
    }

    /**
     * Gets the value of the minCpc property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getMinCpc() {
        return minCpc;
    }

    /**
     * Sets the value of the minCpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setMinCpc(Money value) {
        this.minCpc = value;
    }

    /**
     * Gets the value of the maxCpc property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getMaxCpc() {
        return maxCpc;
    }

    /**
     * Sets the value of the maxCpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setMaxCpc(Money value) {
        this.maxCpc = value;
    }

    /**
     * Gets the value of the cpm property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCpm() {
        return cpm;
    }

    /**
     * Sets the value of the cpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCpm(Money value) {
        this.cpm = value;
    }

    /**
     * Gets the value of the suggestedBudget property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getSuggestedBudget() {
        return suggestedBudget;
    }

    /**
     * Sets the value of the suggestedBudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setSuggestedBudget(Money value) {
        this.suggestedBudget = value;
    }

    /**
     * Gets the value of the minBudget property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getMinBudget() {
        return minBudget;
    }

    /**
     * Sets the value of the minBudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setMinBudget(Money value) {
        this.minBudget = value;
    }

    /**
     * Gets the value of the maxBudget property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getMaxBudget() {
        return maxBudget;
    }

    /**
     * Sets the value of the maxBudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setMaxBudget(Money value) {
        this.maxBudget = value;
    }

    /**
     * Gets the value of the budgetQuantiles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the budgetQuantiles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBudgetQuantiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Money }
     * 
     * 
     */
    public List<Money> getBudgetQuantiles() {
        if (budgetQuantiles == null) {
            budgetQuantiles = new ArrayList<Money>();
        }
        return this.budgetQuantiles;
    }

    /**
     * Gets the value of the impressions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getImpressions() {
        return impressions;
    }

    /**
     * Sets the value of the impressions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setImpressions(Long value) {
        this.impressions = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCode }
     *     
     */
    public CurrencyCode getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCode }
     *     
     */
    public void setCurrencyCode(CurrencyCode value) {
        this.currencyCode = value;
    }

}
