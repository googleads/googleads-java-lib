// Copyright 2017 Google Inc. All Rights Reserved.
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


package com.google.api.ads.dfp.jaxws.v201711;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code WorkflowApprovalRequest} represents a workflow action unit that requires user approval.
 *           
 * 
 * <p>Java class for WorkflowApprovalRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkflowApprovalRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201711}WorkflowRequest">
 *       &lt;sequence>
 *         &lt;element name="status" type="{https://www.google.com/apis/ads/publisher/v201711}WorkflowApprovalRequestStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkflowApprovalRequest", propOrder = {
    "status"
})
public class WorkflowApprovalRequest
    extends WorkflowRequest
{

    @XmlSchemaType(name = "string")
    protected WorkflowApprovalRequestStatus status;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowApprovalRequestStatus }
     *     
     */
    public WorkflowApprovalRequestStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowApprovalRequestStatus }
     *     
     */
    public void setStatus(WorkflowApprovalRequestStatus value) {
        this.status = value;
    }

}
