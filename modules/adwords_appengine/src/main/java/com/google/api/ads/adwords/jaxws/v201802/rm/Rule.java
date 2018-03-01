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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A client defined rule based on custom parameters sent by web sites.
 *           
 * 
 * <p>Java class for Rule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Rule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="groups" type="{https://adwords.google.com/api/adwords/rm/v201802}RuleItemGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ruleType" type="{https://adwords.google.com/api/adwords/rm/v201802}UserListRuleTypeEnums.Enum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rule", propOrder = {
    "groups",
    "ruleType"
})
public class Rule {

    protected List<RuleItemGroup> groups;
    @XmlSchemaType(name = "string")
    protected UserListRuleTypeEnumsEnum ruleType;

    /**
     * Gets the value of the groups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RuleItemGroup }
     * 
     * 
     */
    public List<RuleItemGroup> getGroups() {
        if (groups == null) {
            groups = new ArrayList<RuleItemGroup>();
        }
        return this.groups;
    }

    /**
     * Gets the value of the ruleType property.
     * 
     * @return
     *     possible object is
     *     {@link UserListRuleTypeEnumsEnum }
     *     
     */
    public UserListRuleTypeEnumsEnum getRuleType() {
        return ruleType;
    }

    /**
     * Sets the value of the ruleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserListRuleTypeEnumsEnum }
     *     
     */
    public void setRuleType(UserListRuleTypeEnumsEnum value) {
        this.ruleType = value;
    }

}
