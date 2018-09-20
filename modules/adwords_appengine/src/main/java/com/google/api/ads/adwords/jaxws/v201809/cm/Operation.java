// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.adwords.jaxws.v201809.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201809.billing.BudgetOrderOperation;
import com.google.api.ads.adwords.jaxws.v201809.mcm.AccountLabelOperation;
import com.google.api.ads.adwords.jaxws.v201809.mcm.LinkOperation;
import com.google.api.ads.adwords.jaxws.v201809.mcm.ManagedCustomerLabelOperation;
import com.google.api.ads.adwords.jaxws.v201809.mcm.ManagedCustomerOperation;
import com.google.api.ads.adwords.jaxws.v201809.mcm.MoveOperation;
import com.google.api.ads.adwords.jaxws.v201809.mcm.ServiceLinkOperation;
import com.google.api.ads.adwords.jaxws.v201809.rm.CustomAffinityOperation;
import com.google.api.ads.adwords.jaxws.v201809.rm.CustomAffinityTokenOperation;
import com.google.api.ads.adwords.jaxws.v201809.rm.MutateMembersOperation;
import com.google.api.ads.adwords.jaxws.v201809.rm.OfflineDataUploadOperation;
import com.google.api.ads.adwords.jaxws.v201809.rm.UserListOperation;


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
 *         &lt;element name="operator" type="{https://adwords.google.com/api/adwords/cm/v201809}Operator" minOccurs="0"/>
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
    ManagedCustomerLabelOperation.class,
    AccountLabelOperation.class,
    ServiceLinkOperation.class,
    MoveOperation.class,
    LinkOperation.class,
    ManagedCustomerOperation.class,
    BudgetOrderOperation.class,
    CustomerFeedOperation.class,
    AdCampaignAdSubProductTypeOperation.class,
    AdGroupAdOperation.class,
    ConversionTrackerOperation.class,
    CampaignSharedSetOperation.class,
    AdGroupBidModifierOperation.class,
    BiddingStrategyOperation.class,
    SharedSetOperation.class,
    AdGroupCriterionOperation.class,
    BudgetOperation.class,
    CampaignGroupPerformanceTargetOperation.class,
    AssetOperation.class,
    CampaignExtensionSettingOperation.class,
    FeedMappingOperation.class,
    AdGroupLabelOperation.class,
    DraftOperation.class,
    BatchJobOperation.class,
    OfflineConversionFeedOperation.class,
    FeedItemTargetOperation.class,
    LabelOperation.class,
    CampaignFeedOperation.class,
    CustomerNegativeCriterionOperation.class,
    AdParamOperation.class,
    TrialOperation.class,
    AdGroupCriterionLabelOperation.class,
    CustomerExtensionSettingOperation.class,
    AdOperation.class,
    FeedItemOperation.class,
    CampaignLabelOperation.class,
    SharedCriterionOperation.class,
    OfflineCallConversionFeedOperation.class,
    CampaignCriterionOperation.class,
    CampaignGroupOperation.class,
    AdCustomizerFeedOperation.class,
    OfflineConversionAdjustmentFeedOperation.class,
    AdGroupOperation.class,
    FeedOperation.class,
    AdGroupExtensionSettingOperation.class,
    AdGroupFeedOperation.class,
    CampaignBidModifierOperation.class,
    AdGroupAdLabelOperation.class,
    CampaignOperation.class,
    CustomAffinityTokenOperation.class,
    UserListOperation.class,
    OfflineDataUploadOperation.class,
    CustomAffinityOperation.class,
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
