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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Contains Ads Policy decisions.
 *           
 * 
 * <p>Java class for PolicyTopicEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyTopicEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="policyTopicEntryType" type="{https://adwords.google.com/api/adwords/cm/v201802}PolicyTopicEntryType" minOccurs="0"/>
 *         &lt;element name="policyTopicEvidences" type="{https://adwords.google.com/api/adwords/cm/v201802}PolicyTopicEvidence" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="policyTopicConstraints" type="{https://adwords.google.com/api/adwords/cm/v201802}PolicyTopicConstraint" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="policyTopicId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policyTopicName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policyTopicHelpCenterUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyTopicEntry", propOrder = {
    "policyTopicEntryType",
    "policyTopicEvidences",
    "policyTopicConstraints",
    "policyTopicId",
    "policyTopicName",
    "policyTopicHelpCenterUrl"
})
public class PolicyTopicEntry {

    @XmlSchemaType(name = "string")
    protected PolicyTopicEntryType policyTopicEntryType;
    protected List<PolicyTopicEvidence> policyTopicEvidences;
    protected List<PolicyTopicConstraint> policyTopicConstraints;
    protected String policyTopicId;
    protected String policyTopicName;
    protected String policyTopicHelpCenterUrl;

    /**
     * Gets the value of the policyTopicEntryType property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyTopicEntryType }
     *     
     */
    public PolicyTopicEntryType getPolicyTopicEntryType() {
        return policyTopicEntryType;
    }

    /**
     * Sets the value of the policyTopicEntryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyTopicEntryType }
     *     
     */
    public void setPolicyTopicEntryType(PolicyTopicEntryType value) {
        this.policyTopicEntryType = value;
    }

    /**
     * Gets the value of the policyTopicEvidences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policyTopicEvidences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicyTopicEvidences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolicyTopicEvidence }
     * 
     * 
     */
    public List<PolicyTopicEvidence> getPolicyTopicEvidences() {
        if (policyTopicEvidences == null) {
            policyTopicEvidences = new ArrayList<PolicyTopicEvidence>();
        }
        return this.policyTopicEvidences;
    }

    /**
     * Gets the value of the policyTopicConstraints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policyTopicConstraints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicyTopicConstraints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolicyTopicConstraint }
     * 
     * 
     */
    public List<PolicyTopicConstraint> getPolicyTopicConstraints() {
        if (policyTopicConstraints == null) {
            policyTopicConstraints = new ArrayList<PolicyTopicConstraint>();
        }
        return this.policyTopicConstraints;
    }

    /**
     * Gets the value of the policyTopicId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyTopicId() {
        return policyTopicId;
    }

    /**
     * Sets the value of the policyTopicId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyTopicId(String value) {
        this.policyTopicId = value;
    }

    /**
     * Gets the value of the policyTopicName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyTopicName() {
        return policyTopicName;
    }

    /**
     * Sets the value of the policyTopicName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyTopicName(String value) {
        this.policyTopicName = value;
    }

    /**
     * Gets the value of the policyTopicHelpCenterUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyTopicHelpCenterUrl() {
        return policyTopicHelpCenterUrl;
    }

    /**
     * Sets the value of the policyTopicHelpCenterUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyTopicHelpCenterUrl(String value) {
        this.policyTopicHelpCenterUrl = value;
    }

}
