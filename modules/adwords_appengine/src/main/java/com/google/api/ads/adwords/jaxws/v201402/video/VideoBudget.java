
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201402.cm.Money;


/**
 * 
 *             Represents the budget data for a video campaign.
 *           
 * 
 * <p>Java class for VideoBudget complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoBudget">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="budgetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{https://adwords.google.com/api/adwords/cm/v201402}Money" minOccurs="0"/>
 *         &lt;element name="deliveryMethod" type="{https://adwords.google.com/api/adwords/video/v201402}VideoBudget.BudgetDeliveryMethod" minOccurs="0"/>
 *         &lt;element name="isExplicitlyShared" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoBudget", propOrder = {
    "budgetId",
    "name",
    "amount",
    "deliveryMethod",
    "isExplicitlyShared"
})
public class VideoBudget {

    protected Long budgetId;
    protected String name;
    protected Money amount;
    protected VideoBudgetBudgetDeliveryMethod deliveryMethod;
    protected Boolean isExplicitlyShared;

    /**
     * Gets the value of the budgetId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBudgetId() {
        return budgetId;
    }

    /**
     * Sets the value of the budgetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBudgetId(Long value) {
        this.budgetId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAmount(Money value) {
        this.amount = value;
    }

    /**
     * Gets the value of the deliveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link VideoBudgetBudgetDeliveryMethod }
     *     
     */
    public VideoBudgetBudgetDeliveryMethod getDeliveryMethod() {
        return deliveryMethod;
    }

    /**
     * Sets the value of the deliveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoBudgetBudgetDeliveryMethod }
     *     
     */
    public void setDeliveryMethod(VideoBudgetBudgetDeliveryMethod value) {
        this.deliveryMethod = value;
    }

    /**
     * Gets the value of the isExplicitlyShared property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExplicitlyShared() {
        return isExplicitlyShared;
    }

    /**
     * Sets the value of the isExplicitlyShared property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExplicitlyShared(Boolean value) {
        this.isExplicitlyShared = value;
    }

}
