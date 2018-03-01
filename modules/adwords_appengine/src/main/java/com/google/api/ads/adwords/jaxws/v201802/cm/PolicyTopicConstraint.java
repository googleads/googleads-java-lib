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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A target which caused a policy finding.
 *           
 * 
 * <p>Java class for PolicyTopicConstraint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyTopicConstraint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="constraintType" type="{https://adwords.google.com/api/adwords/cm/v201802}PolicyTopicConstraint.PolicyTopicConstraintType" minOccurs="0"/>
 *         &lt;element name="PolicyTopicConstraint.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyTopicConstraint", propOrder = {
    "constraintType",
    "policyTopicConstraintType"
})
@XmlSeeAlso({
    ResellerConstraint.class,
    CertificateMissingConstraint.class,
    CountryConstraint.class
})
public abstract class PolicyTopicConstraint {

    @XmlSchemaType(name = "string")
    protected PolicyTopicConstraintPolicyTopicConstraintType constraintType;
    @XmlElement(name = "PolicyTopicConstraint.Type")
    protected String policyTopicConstraintType;

    /**
     * Gets the value of the constraintType property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyTopicConstraintPolicyTopicConstraintType }
     *     
     */
    public PolicyTopicConstraintPolicyTopicConstraintType getConstraintType() {
        return constraintType;
    }

    /**
     * Sets the value of the constraintType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyTopicConstraintPolicyTopicConstraintType }
     *     
     */
    public void setConstraintType(PolicyTopicConstraintPolicyTopicConstraintType value) {
        this.constraintType = value;
    }

    /**
     * Gets the value of the policyTopicConstraintType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyTopicConstraintType() {
        return policyTopicConstraintType;
    }

    /**
     * Sets the value of the policyTopicConstraintType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyTopicConstraintType(String value) {
        this.policyTopicConstraintType = value;
    }

}
