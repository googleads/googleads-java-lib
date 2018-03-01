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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Operation (add, remove and set) on adgroup criteria.
 *             
 *             <p>If you try to ADD a criterion that already exists, it will be treated as a SET operation
 *             on the existing criterion.
 *           
 * 
 * <p>Java class for AdGroupCriterionOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdGroupCriterionOperation">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}Operation">
 *       &lt;sequence>
 *         &lt;element name="operand" type="{https://adwords.google.com/api/adwords/cm/v201802}AdGroupCriterion" minOccurs="0"/>
 *         &lt;element name="exemptionRequests" type="{https://adwords.google.com/api/adwords/cm/v201802}ExemptionRequest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdGroupCriterionOperation", propOrder = {
    "operand",
    "exemptionRequests"
})
public class AdGroupCriterionOperation
    extends Operation
{

    protected AdGroupCriterion operand;
    protected List<ExemptionRequest> exemptionRequests;

    /**
     * Gets the value of the operand property.
     * 
     * @return
     *     possible object is
     *     {@link AdGroupCriterion }
     *     
     */
    public AdGroupCriterion getOperand() {
        return operand;
    }

    /**
     * Sets the value of the operand property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdGroupCriterion }
     *     
     */
    public void setOperand(AdGroupCriterion value) {
        this.operand = value;
    }

    /**
     * Gets the value of the exemptionRequests property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exemptionRequests property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExemptionRequests().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExemptionRequest }
     * 
     * 
     */
    public List<ExemptionRequest> getExemptionRequests() {
        if (exemptionRequests == null) {
            exemptionRequests = new ArrayList<ExemptionRequest>();
        }
        return this.exemptionRequests;
    }

}
