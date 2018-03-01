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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Approval and policy information attached to an entity.
 *           
 * 
 * <p>Java class for PolicyData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="disapprovalReasons" type="{https://adwords.google.com/api/adwords/cm/v201802}DisapprovalReason" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PolicyData.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyData", propOrder = {
    "disapprovalReasons",
    "policyDataType"
})
@XmlSeeAlso({
    FeedItemPolicyData.class
})
public class PolicyData {

    protected List<DisapprovalReason> disapprovalReasons;
    @XmlElement(name = "PolicyData.Type")
    protected String policyDataType;

    /**
     * Gets the value of the disapprovalReasons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disapprovalReasons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisapprovalReasons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisapprovalReason }
     * 
     * 
     */
    public List<DisapprovalReason> getDisapprovalReasons() {
        if (disapprovalReasons == null) {
            disapprovalReasons = new ArrayList<DisapprovalReason>();
        }
        return this.disapprovalReasons;
    }

    /**
     * Gets the value of the policyDataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyDataType() {
        return policyDataType;
    }

    /**
     * Sets the value of the policyDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyDataType(String value) {
        this.policyDataType = value;
    }

}
