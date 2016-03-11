
package com.google.api.ads.adwords.jaxws.v201601.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201601.billing.BudgetOrderOperation;
import com.google.api.ads.adwords.jaxws.v201601.express.ExpressBusinessOperation;
import com.google.api.ads.adwords.jaxws.v201601.express.PromotionOperation;
import com.google.api.ads.adwords.jaxws.v201601.mcm.AccountLabelOperation;
import com.google.api.ads.adwords.jaxws.v201601.mcm.LinkOperation;
import com.google.api.ads.adwords.jaxws.v201601.mcm.ManagedCustomerLabelOperation;
import com.google.api.ads.adwords.jaxws.v201601.mcm.ManagedCustomerOperation;
import com.google.api.ads.adwords.jaxws.v201601.mcm.MoveOperation;
import com.google.api.ads.adwords.jaxws.v201601.rm.MutateMembersOperation;
import com.google.api.ads.adwords.jaxws.v201601.rm.UserListOperation;


/**
 * 
 *             This represents an operation that includes an operator and an operand
 *             specified type.
 *           
 * 
 * <p>Java class for Operation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Operation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operator" type="{https://adwords.google.com/api/adwords/cm/v201601}Operator" minOccurs="0"/>
 *         &lt;element name="Operation.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Operation", propOrder = {
    "operator",
    "operationType"
})
@XmlSeeAlso({
    CustomerFeedOperation.class,
    AdParamOperation.class,
    AdGroupAdOperation.class,
    AdGroupCriterionLabelOperation.class,
    ConversionTrackerOperation.class,
    CampaignSharedSetOperation.class,
    AdGroupBidModifierOperation.class,
    BiddingStrategyOperation.class,
    CustomerExtensionSettingOperation.class,
    SharedSetOperation.class,
    AdGroupCriterionOperation.class,
    ExperimentOperation.class,
    BudgetOperation.class,
    FeedItemOperation.class,
    CampaignLabelOperation.class,
    SharedCriterionOperation.class,
    CampaignExtensionSettingOperation.class,
    FeedMappingOperation.class,
    AdGroupLabelOperation.class,
    CampaignCriterionOperation.class,
    CampaignAdExtensionOperation.class,
    AdCustomizerFeedOperation.class,
    BatchJobOperation.class,
    AdGroupOperation.class,
    FeedOperation.class,
    OfflineConversionFeedOperation.class,
    AdGroupExtensionSettingOperation.class,
    AdGroupFeedOperation.class,
    LabelOperation.class,
    AdGroupAdLabelOperation.class,
    CampaignOperation.class,
    CampaignFeedOperation.class,
    BudgetOrderOperation.class,
    ManagedCustomerLabelOperation.class,
    AccountLabelOperation.class,
    MoveOperation.class,
    LinkOperation.class,
    ManagedCustomerOperation.class,
    ExpressBusinessOperation.class,
    PromotionOperation.class,
    UserListOperation.class,
    MutateMembersOperation.class
})
public abstract class Operation {

    @XmlSchemaType(name = "string")
    protected Operator operator;
    @XmlElement(name = "Operation.Type")
    protected String operationType;

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link Operator }
     *     
     */
    public Operator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operator }
     *     
     */
    public void setOperator(Operator value) {
        this.operator = value;
    }

    /**
     * Gets the value of the operationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationType() {
        return operationType;
    }

    /**
     * Sets the value of the operationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationType(String value) {
        this.operationType = value;
    }

}
