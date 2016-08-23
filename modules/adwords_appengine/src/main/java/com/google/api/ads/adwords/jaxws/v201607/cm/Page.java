// Copyright 2016 Google Inc. All Rights Reserved.
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


package com.google.api.ads.adwords.jaxws.v201607.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201607.billing.BudgetOrderPage;
import com.google.api.ads.adwords.jaxws.v201607.mcm.ManagedCustomerPage;
import com.google.api.ads.adwords.jaxws.v201607.rm.UserListPage;


/**
 * 
 *             Contains the results from a get call.
 *           
 * 
 * <p>Java class for Page complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Page">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="totalNumEntries" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Page.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Page", propOrder = {
    "totalNumEntries",
    "pageType"
})
@XmlSeeAlso({
    CampaignExtensionSettingPage.class,
    BatchJobPage.class,
    TrialPage.class,
    AdGroupExtensionSettingPage.class,
    TrialAsyncErrorPage.class,
    DraftAsyncErrorPage.class,
    AdCustomizerFeedPage.class,
    DomainCategoryPage.class,
    AdGroupCriterionPage.class,
    CustomerExtensionSettingPage.class,
    AdGroupPage.class,
    AdGroupAdPage.class,
    BudgetPage.class,
    ExperimentPage.class,
    SharedCriterionPage.class,
    CampaignCriterionPage.class,
    AdGroupBidModifierPage.class,
    com.google.api.ads.adwords.jaxws.v201607.cm.NoStatsPage.class,
    CampaignPage.class,
    NullStatsPage.class,
    BiddingStrategyPage.class,
    BudgetOrderPage.class,
    com.google.api.ads.adwords.jaxws.v201607.express.NoStatsPage.class,
    ManagedCustomerPage.class,
    UserListPage.class
})
public abstract class Page {

    protected Integer totalNumEntries;
    @XmlElement(name = "Page.Type")
    protected String pageType;

    /**
     * Gets the value of the totalNumEntries property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalNumEntries() {
        return totalNumEntries;
    }

    /**
     * Sets the value of the totalNumEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalNumEntries(Integer value) {
        this.totalNumEntries = value;
    }

    /**
     * Gets the value of the pageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageType() {
        return pageType;
    }

    /**
     * Sets the value of the pageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageType(String value) {
        this.pageType = value;
    }

}
