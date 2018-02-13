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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             An action that is being or was done to progress the workflow.
 *           
 * 
 * <p>Java class for ProgressAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProgressAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="evaluationTime" type="{https://www.google.com/apis/ads/publisher/v201802}DateTime" minOccurs="0"/>
 *         &lt;element name="evaluationStatus" type="{https://www.google.com/apis/ads/publisher/v201802}EvaluationStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgressAction", propOrder = {
    "evaluationTime",
    "evaluationStatus"
})
@XmlSeeAlso({
    ReserveInventoryProgressAction.class,
    RequestApprovalProgressAction.class,
    SendNotificationProgressAction.class
})
public abstract class ProgressAction {

    protected DateTime evaluationTime;
    @XmlSchemaType(name = "string")
    protected EvaluationStatus evaluationStatus;

    /**
     * Gets the value of the evaluationTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getEvaluationTime() {
        return evaluationTime;
    }

    /**
     * Sets the value of the evaluationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setEvaluationTime(DateTime value) {
        this.evaluationTime = value;
    }

    /**
     * Gets the value of the evaluationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EvaluationStatus }
     *     
     */
    public EvaluationStatus getEvaluationStatus() {
        return evaluationStatus;
    }

    /**
     * Sets the value of the evaluationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EvaluationStatus }
     *     
     */
    public void setEvaluationStatus(EvaluationStatus value) {
        this.evaluationStatus = value;
    }

}
