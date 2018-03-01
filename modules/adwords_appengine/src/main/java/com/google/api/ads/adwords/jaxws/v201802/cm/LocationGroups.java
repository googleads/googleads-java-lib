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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a criterion containing a function that when evaluated specifies how to target
 *             based on the type of the location. These "location groups" are custom, dynamic bundles of
 *             locations (for instance "High income areas in California" or "Airports in France").
 *             
 *             <p>Examples:</p>
 *             
 *             For income demographic targeting, we need to specify the income tier and the geo
 *             which it targets. Areas in California that are in the top national income tier can be
 *             represented by:
 *             <pre><code>
 *             Function function = new Function();
 *             function.setLhsOperand(Arrays.asList(
 *             (Operand) new IncomeOperand(IncomeTier.TIER_1));
 *             function.setOperator(Operator.AND);
 *             function.setRhsOperand(Arrays.asList(
 *             (Operand) new GeoTargetOperand(Lists.newArrayList(new CriterionId(21137L))));
 *             </code></pre>
 *             
 *             For place of interest targeting, we need to specify the place of interest category and the geo
 *             which it targets. Airports in France can be represented by:
 *             <pre><code>
 *             Function function = new Function();
 *             function.setLhsOperand(Arrays.asList(
 *             (Operand) new PlacesOfInterestOperand(PlacesOfInterestOperand.Category.AIRPORT));
 *             function.setOperator(Operator.AND);
 *             function.setRhsOperand(Arrays.asList(
 *             (Operand) new GeoTargetOperand(Lists.newArrayList(new CriterionId(2250L))));
 *             </code></pre>
 *             
 *             <p>NOTE: Places of interest and income targeting are read only. </p>
 *             <span class="constraint AdxEnabled">This is disabled for AdX when it is contained within Operators: ADD, SET.</span>
 *           
 * 
 * <p>Java class for LocationGroups complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationGroups">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}Criterion">
 *       &lt;sequence>
 *         &lt;element name="feedId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="matchingFunction" type="{https://adwords.google.com/api/adwords/cm/v201802}Function" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationGroups", propOrder = {
    "feedId",
    "matchingFunction"
})
public class LocationGroups
    extends Criterion
{

    protected Long feedId;
    protected Function matchingFunction;

    /**
     * Gets the value of the feedId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFeedId() {
        return feedId;
    }

    /**
     * Sets the value of the feedId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFeedId(Long value) {
        this.feedId = value;
    }

    /**
     * Gets the value of the matchingFunction property.
     * 
     * @return
     *     possible object is
     *     {@link Function }
     *     
     */
    public Function getMatchingFunction() {
        return matchingFunction;
    }

    /**
     * Sets the value of the matchingFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Function }
     *     
     */
    public void setMatchingFunction(Function value) {
        this.matchingFunction = value;
    }

}
