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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The progress indicator of a {@link Proposal proposal's} workflow.
 *           
 * 
 * <p>Java class for WorkflowProgress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkflowProgress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="steps" type="{https://www.google.com/apis/ads/publisher/v201711}ProgressStep" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="submitterId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="evaluationStatus" type="{https://www.google.com/apis/ads/publisher/v201711}EvaluationStatus" minOccurs="0"/>
 *         &lt;element name="submissionTime" type="{https://www.google.com/apis/ads/publisher/v201711}DateTime" minOccurs="0"/>
 *         &lt;element name="evaluationTime" type="{https://www.google.com/apis/ads/publisher/v201711}DateTime" minOccurs="0"/>
 *         &lt;element name="isProcessing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkflowProgress", propOrder = {
    "steps",
    "submitterId",
    "evaluationStatus",
    "submissionTime",
    "evaluationTime",
    "isProcessing"
})
public class WorkflowProgress {

    protected List<ProgressStep> steps;
    protected Long submitterId;
    @XmlSchemaType(name = "string")
    protected EvaluationStatus evaluationStatus;
    protected DateTime submissionTime;
    protected DateTime evaluationTime;
    protected Boolean isProcessing;

    /**
     * Gets the value of the steps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the steps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSteps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProgressStep }
     * 
     * 
     */
    public List<ProgressStep> getSteps() {
        if (steps == null) {
            steps = new ArrayList<ProgressStep>();
        }
        return this.steps;
    }

    /**
     * Gets the value of the submitterId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSubmitterId() {
        return submitterId;
    }

    /**
     * Sets the value of the submitterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSubmitterId(Long value) {
        this.submitterId = value;
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

    /**
     * Gets the value of the submissionTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getSubmissionTime() {
        return submissionTime;
    }

    /**
     * Sets the value of the submissionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setSubmissionTime(DateTime value) {
        this.submissionTime = value;
    }

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
     * Gets the value of the isProcessing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsProcessing() {
        return isProcessing;
    }

    /**
     * Sets the value of the isProcessing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsProcessing(Boolean value) {
        this.isProcessing = value;
    }

}
