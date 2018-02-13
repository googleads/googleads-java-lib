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


package com.google.api.ads.dfp.jaxws.v201802;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@link RuleBasedFirstPartyAudienceSegment} is a {@link FirstPartyAudienceSegment} owned by the
 *             publisher network. It contains a rule.
 *           
 * 
 * <p>Java class for RuleBasedFirstPartyAudienceSegment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuleBasedFirstPartyAudienceSegment">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201802}RuleBasedFirstPartyAudienceSegmentSummary">
 *       &lt;sequence>
 *         &lt;element name="rule" type="{https://www.google.com/apis/ads/publisher/v201802}FirstPartyAudienceSegmentRule" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuleBasedFirstPartyAudienceSegment", propOrder = {
    "rule"
})
public class RuleBasedFirstPartyAudienceSegment
    extends RuleBasedFirstPartyAudienceSegmentSummary
{

    protected FirstPartyAudienceSegmentRule rule;

    /**
     * Gets the value of the rule property.
     * 
     * @return
     *     possible object is
     *     {@link FirstPartyAudienceSegmentRule }
     *     
     */
    public FirstPartyAudienceSegmentRule getRule() {
        return rule;
    }

    /**
     * Sets the value of the rule property.
     * 
     * @param value
     *     allowed object is
     *     {@link FirstPartyAudienceSegmentRule }
     *     
     */
    public void setRule(FirstPartyAudienceSegmentRule value) {
        this.rule = value;
    }

}
