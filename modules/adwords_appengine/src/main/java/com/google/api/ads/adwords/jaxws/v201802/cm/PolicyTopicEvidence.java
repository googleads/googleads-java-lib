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
 *             Evidence that caused this policy topic to be reported.
 *           
 * 
 * <p>Java class for PolicyTopicEvidence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyTopicEvidence">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="policyTopicEvidenceType" type="{https://adwords.google.com/api/adwords/cm/v201802}PolicyTopicEvidenceType" minOccurs="0"/>
 *         &lt;element name="evidenceTextList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyTopicEvidence", propOrder = {
    "policyTopicEvidenceType",
    "evidenceTextList"
})
public class PolicyTopicEvidence {

    @XmlSchemaType(name = "string")
    protected PolicyTopicEvidenceType policyTopicEvidenceType;
    protected List<String> evidenceTextList;

    /**
     * Gets the value of the policyTopicEvidenceType property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyTopicEvidenceType }
     *     
     */
    public PolicyTopicEvidenceType getPolicyTopicEvidenceType() {
        return policyTopicEvidenceType;
    }

    /**
     * Sets the value of the policyTopicEvidenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyTopicEvidenceType }
     *     
     */
    public void setPolicyTopicEvidenceType(PolicyTopicEvidenceType value) {
        this.policyTopicEvidenceType = value;
    }

    /**
     * Gets the value of the evidenceTextList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evidenceTextList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvidenceTextList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEvidenceTextList() {
        if (evidenceTextList == null) {
            evidenceTextList = new ArrayList<String>();
        }
        return this.evidenceTextList;
    }

}
