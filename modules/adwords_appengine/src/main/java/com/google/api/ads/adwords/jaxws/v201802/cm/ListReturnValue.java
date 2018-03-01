// Copyright 2018 Google Inc. All Rights Reserved.
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


package com.google.api.ads.adwords.jaxws.v201802.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201802.billing.BudgetOrderReturnValue;
import com.google.api.ads.adwords.jaxws.v201802.rm.OfflineDataUploadReturnValue;
import com.google.api.ads.adwords.jaxws.v201802.rm.UserListReturnValue;


/**
 * 
 *             Base list return value type.
 *           
 * 
 * <p>Java class for ListReturnValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListReturnValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListReturnValue.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListReturnValue", propOrder = {
    "listReturnValueType"
})
@XmlSeeAlso({
    OfflineDataUploadReturnValue.class,
    UserListReturnValue.class,
    BudgetOrderReturnValue.class,
    BatchJobReturnValue.class,
    CampaignBidModifierReturnValue.class,
    BudgetReturnValue.class,
    CampaignReturnValue.class,
    AdGroupLabelReturnValue.class,
    CampaignLabelReturnValue.class,
    CampaignGroupPerformanceTargetReturnValue.class,
    SharedSetReturnValue.class,
    SharedCriterionReturnValue.class,
    AdGroupAdReturnValue.class,
    TrialReturnValue.class,
    AdGroupCriterionLabelReturnValue.class,
    CustomerFeedReturnValue.class,
    CampaignExtensionSettingReturnValue.class,
    OfflineCallConversionFeedReturnValue.class,
    CampaignGroupReturnValue.class,
    AdGroupBidModifierReturnValue.class,
    AdGroupFeedReturnValue.class,
    FeedReturnValue.class,
    AdGroupExtensionSettingReturnValue.class,
    FeedItemTargetReturnValue.class,
    OfflineConversionFeedReturnValue.class,
    AdGroupCriterionReturnValue.class,
    AdGroupReturnValue.class,
    AdCustomizerFeedReturnValue.class,
    CustomerNegativeCriterionReturnValue.class,
    AdGroupAdLabelReturnValue.class,
    ConversionTrackerReturnValue.class,
    CampaignCriterionReturnValue.class,
    DraftReturnValue.class,
    FeedItemReturnValue.class,
    CampaignFeedReturnValue.class,
    FeedMappingReturnValue.class,
    CampaignSharedSetReturnValue.class,
    CustomerExtensionSettingReturnValue.class,
    LabelReturnValue.class,
    BiddingStrategyReturnValue.class
})
public abstract class ListReturnValue {

    @XmlElement(name = "ListReturnValue.Type")
    protected String listReturnValueType;

    /**
     * Gets the value of the listReturnValueType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListReturnValueType() {
        return listReturnValueType;
    }

    /**
     * Sets the value of the listReturnValueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListReturnValueType(String value) {
        this.listReturnValueType = value;
    }

}
