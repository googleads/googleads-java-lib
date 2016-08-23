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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             In budget optimizer, Google automatically places bids for the user based on
 *             their daily/monthly budget.
 *             
 *             <p><b>Note:</b>
 *             This bidding strategy has been deprecated and replaced with
 *             {@linkplain TargetSpendBiddingScheme TargetSpend}. We no longer allow
 *             advertisers to opt into this strategy--{@code BudgetOptimizerBiddingScheme}
 *             solely exists so that advertisers can access campaigns that had specified
 *             this strategy.</p>
 *             <span class="constraint AdxEnabled">This is disabled for AdX.</span>
 *           
 * 
 * <p>Java class for BudgetOptimizerBiddingScheme complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BudgetOptimizerBiddingScheme">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201607}BiddingScheme">
 *       &lt;sequence>
 *         &lt;element name="bidCeiling" type="{https://adwords.google.com/api/adwords/cm/v201607}Money" minOccurs="0"/>
 *         &lt;element name="enhancedCpcEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BudgetOptimizerBiddingScheme", propOrder = {
    "bidCeiling",
    "enhancedCpcEnabled"
})
public class BudgetOptimizerBiddingScheme
    extends BiddingScheme
{

    protected Money bidCeiling;
    protected Boolean enhancedCpcEnabled;

    /**
     * Gets the value of the bidCeiling property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getBidCeiling() {
        return bidCeiling;
    }

    /**
     * Sets the value of the bidCeiling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setBidCeiling(Money value) {
        this.bidCeiling = value;
    }

    /**
     * Gets the value of the enhancedCpcEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnhancedCpcEnabled() {
        return enhancedCpcEnabled;
    }

    /**
     * Sets the value of the enhancedCpcEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnhancedCpcEnabled(Boolean value) {
        this.enhancedCpcEnabled = value;
    }

}
