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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Action requiring approval before the workflow can continue.
 *           
 * 
 * <p>Java class for RequestApprovalProgressAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestApprovalProgressAction">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201802}ProgressAction">
 *       &lt;sequence>
 *         &lt;element name="approverId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="eligibleApproverUserIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="eligibleApproverTeamIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="approvalStatus" type="{https://www.google.com/apis/ads/publisher/v201802}WorkflowApprovalRequestStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestApprovalProgressAction", propOrder = {
    "approverId",
    "eligibleApproverUserIds",
    "eligibleApproverTeamIds",
    "comment",
    "approvalStatus"
})
public class RequestApprovalProgressAction
    extends ProgressAction
{

    protected Long approverId;
    @XmlElement(type = Long.class)
    protected List<Long> eligibleApproverUserIds;
    @XmlElement(type = Long.class)
    protected List<Long> eligibleApproverTeamIds;
    protected String comment;
    @XmlSchemaType(name = "string")
    protected WorkflowApprovalRequestStatus approvalStatus;

    /**
     * Gets the value of the approverId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApproverId() {
        return approverId;
    }

    /**
     * Sets the value of the approverId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApproverId(Long value) {
        this.approverId = value;
    }

    /**
     * Gets the value of the eligibleApproverUserIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eligibleApproverUserIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEligibleApproverUserIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getEligibleApproverUserIds() {
        if (eligibleApproverUserIds == null) {
            eligibleApproverUserIds = new ArrayList<Long>();
        }
        return this.eligibleApproverUserIds;
    }

    /**
     * Gets the value of the eligibleApproverTeamIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eligibleApproverTeamIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEligibleApproverTeamIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getEligibleApproverTeamIds() {
        if (eligibleApproverTeamIds == null) {
            eligibleApproverTeamIds = new ArrayList<Long>();
        }
        return this.eligibleApproverTeamIds;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the approvalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowApprovalRequestStatus }
     *     
     */
    public WorkflowApprovalRequestStatus getApprovalStatus() {
        return approvalStatus;
    }

    /**
     * Sets the value of the approvalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowApprovalRequestStatus }
     *     
     */
    public void setApprovalStatus(WorkflowApprovalRequestStatus value) {
        this.approvalStatus = value;
    }

}
