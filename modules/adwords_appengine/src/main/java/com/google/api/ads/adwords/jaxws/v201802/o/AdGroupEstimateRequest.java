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


package com.google.api.ads.adwords.jaxws.v201802.o;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201802.cm.Money;


/**
 * 
 *             Represents an ad group that will be estimated. Ad groups may be all
 *             new or all existing, or a mixture of new and existing. Only existing
 *             campaigns can contain estimates for existing ad groups.<p>
 *             
 *             <p>To make a keyword estimates request in which estimates do not consider
 *             existing account information (e.g. historical ad group performance), set both
 *             {@link #adGroupId} and the enclosing {@link CampaignEstimateRequest}'s
 *             {@code campaignId} to {@code null}.
 *             
 *             <p>For more details on usage, refer to document at
 *             {@link CampaignEstimateRequest}.
 *           
 * 
 * <p>Java class for AdGroupEstimateRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdGroupEstimateRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/o/v201802}EstimateRequest">
 *       &lt;sequence>
 *         &lt;element name="adGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="keywordEstimateRequests" type="{https://adwords.google.com/api/adwords/o/v201802}KeywordEstimateRequest" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="maxCpc" type="{https://adwords.google.com/api/adwords/cm/v201802}Money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdGroupEstimateRequest", propOrder = {
    "adGroupId",
    "keywordEstimateRequests",
    "maxCpc"
})
public class AdGroupEstimateRequest
    extends EstimateRequest
{

    protected Long adGroupId;
    protected List<KeywordEstimateRequest> keywordEstimateRequests;
    protected Money maxCpc;

    /**
     * Gets the value of the adGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdGroupId() {
        return adGroupId;
    }

    /**
     * Sets the value of the adGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdGroupId(Long value) {
        this.adGroupId = value;
    }

    /**
     * Gets the value of the keywordEstimateRequests property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keywordEstimateRequests property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywordEstimateRequests().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeywordEstimateRequest }
     * 
     * 
     */
    public List<KeywordEstimateRequest> getKeywordEstimateRequests() {
        if (keywordEstimateRequests == null) {
            keywordEstimateRequests = new ArrayList<KeywordEstimateRequest>();
        }
        return this.keywordEstimateRequests;
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

}
