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


package com.google.api.ads.adwords.jaxws.v201802.rm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Users defined by combining two rules, left operand and right operand. There are two operators:
 *             AND where left operand and right operand have to be true; AND_NOT where left operand is true but
 *             right operand is false.
 *           
 * 
 * <p>Java class for CombinedRuleUserList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CombinedRuleUserList">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/rm/v201802}RuleBasedUserList">
 *       &lt;sequence>
 *         &lt;element name="leftOperand" type="{https://adwords.google.com/api/adwords/rm/v201802}Rule" minOccurs="0"/>
 *         &lt;element name="rightOperand" type="{https://adwords.google.com/api/adwords/rm/v201802}Rule" minOccurs="0"/>
 *         &lt;element name="ruleOperator" type="{https://adwords.google.com/api/adwords/rm/v201802}CombinedRuleUserList.RuleOperator" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CombinedRuleUserList", propOrder = {
    "leftOperand",
    "rightOperand",
    "ruleOperator"
})
public class CombinedRuleUserList
    extends RuleBasedUserList
{

    protected Rule leftOperand;
    protected Rule rightOperand;
    @XmlSchemaType(name = "string")
    protected CombinedRuleUserListRuleOperator ruleOperator;

    /**
     * Gets the value of the leftOperand property.
     * 
     * @return
     *     possible object is
     *     {@link Rule }
     *     
     */
    public Rule getLeftOperand() {
        return leftOperand;
    }

    /**
     * Sets the value of the leftOperand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rule }
     *     
     */
    public void setLeftOperand(Rule value) {
        this.leftOperand = value;
    }

    /**
     * Gets the value of the rightOperand property.
     * 
     * @return
     *     possible object is
     *     {@link Rule }
     *     
     */
    public Rule getRightOperand() {
        return rightOperand;
    }

    /**
     * Sets the value of the rightOperand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rule }
     *     
     */
    public void setRightOperand(Rule value) {
        this.rightOperand = value;
    }

    /**
     * Gets the value of the ruleOperator property.
     * 
     * @return
     *     possible object is
     *     {@link CombinedRuleUserListRuleOperator }
     *     
     */
    public CombinedRuleUserListRuleOperator getRuleOperator() {
        return ruleOperator;
    }

    /**
     * Sets the value of the ruleOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link CombinedRuleUserListRuleOperator }
     *     
     */
    public void setRuleOperator(CombinedRuleUserListRuleOperator value) {
        this.ruleOperator = value;
    }

}
