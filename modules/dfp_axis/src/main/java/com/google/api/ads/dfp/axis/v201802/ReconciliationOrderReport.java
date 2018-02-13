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

/**
 * ReconciliationOrderReport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Contains reconciliation data of an {@link Order} and/or {@link
 * Proposal}.
 */
public class ReconciliationOrderReport  implements java.io.Serializable {
    /* Uniquely identifies the {@code ReconciliationOrderReport}.
     *                 This value is read-only and assigned by Google. */
    private java.lang.Long id;

    /* The ID of the {@link ReconciliationReport} this {@code ReconciliationOrderReport}
     * belongs to.
     *                 This value is read-only. */
    private java.lang.Long reconciliationReportId;

    /* If this reconciliation data is for an {@link Order}, then this
     * contains that order's ID.
     *                 Otherwise, this field will have a value of 0.
     *                 This value is read-only. */
    private java.lang.Long orderId;

    /* If this reconciliation data is for a {@link Proposal}, then
     * this contains that proposal's ID.
     *                 Otherwise, this field will have a value of 0. This
     * value is read-only. */
    private java.lang.Long proposalId;

    /* The status of this {@code ReconciliationOrderReport}.
     *                 This value is read-only. */
    private com.google.api.ads.dfp.axis.v201802.ReconciliationOrderReportStatus status;

    /* The time when this order report is submitted.
     *                 This value is read-only. */
    private com.google.api.ads.dfp.axis.v201802.DateTime submissionDateTime;

    /* The ID of the {@link User} who submitted this order report.
     * This value is read-only. */
    private java.lang.Long submitterId;

    /* If this reconciliation data is for a {@link Proposal}, then
     * this contains the net revenue
     *                 manual adjustment for that proposal. Otherwise, this
     * is {@code null}.
     *                 This value is read-only. */
    private com.google.api.ads.dfp.axis.v201802.Money proposalNetBillableRevenueManualAdjustment;

    /* If this reconciliation data is for a {@link Proposal}, then
     * this contains the gross revenue
     *                 manual adjustment for that proposal. Otherwise, this
     * is {@code null}.
     *                 This value is editable. */
    private com.google.api.ads.dfp.axis.v201802.Money proposalGrossBillableRevenueManualAdjustment;

    public ReconciliationOrderReport() {
    }

    public ReconciliationOrderReport(
           java.lang.Long id,
           java.lang.Long reconciliationReportId,
           java.lang.Long orderId,
           java.lang.Long proposalId,
           com.google.api.ads.dfp.axis.v201802.ReconciliationOrderReportStatus status,
           com.google.api.ads.dfp.axis.v201802.DateTime submissionDateTime,
           java.lang.Long submitterId,
           com.google.api.ads.dfp.axis.v201802.Money proposalNetBillableRevenueManualAdjustment,
           com.google.api.ads.dfp.axis.v201802.Money proposalGrossBillableRevenueManualAdjustment) {
           this.id = id;
           this.reconciliationReportId = reconciliationReportId;
           this.orderId = orderId;
           this.proposalId = proposalId;
           this.status = status;
           this.submissionDateTime = submissionDateTime;
           this.submitterId = submitterId;
           this.proposalNetBillableRevenueManualAdjustment = proposalNetBillableRevenueManualAdjustment;
           this.proposalGrossBillableRevenueManualAdjustment = proposalGrossBillableRevenueManualAdjustment;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("id", getId())
            .add("orderId", getOrderId())
            .add("proposalGrossBillableRevenueManualAdjustment", getProposalGrossBillableRevenueManualAdjustment())
            .add("proposalId", getProposalId())
            .add("proposalNetBillableRevenueManualAdjustment", getProposalNetBillableRevenueManualAdjustment())
            .add("reconciliationReportId", getReconciliationReportId())
            .add("status", getStatus())
            .add("submissionDateTime", getSubmissionDateTime())
            .add("submitterId", getSubmitterId())
            .toString();
    }

    /**
     * Gets the id value for this ReconciliationOrderReport.
     * 
     * @return id   * Uniquely identifies the {@code ReconciliationOrderReport}.
     *                 This value is read-only and assigned by Google.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this ReconciliationOrderReport.
     * 
     * @param id   * Uniquely identifies the {@code ReconciliationOrderReport}.
     *                 This value is read-only and assigned by Google.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the reconciliationReportId value for this ReconciliationOrderReport.
     * 
     * @return reconciliationReportId   * The ID of the {@link ReconciliationReport} this {@code ReconciliationOrderReport}
     * belongs to.
     *                 This value is read-only.
     */
    public java.lang.Long getReconciliationReportId() {
        return reconciliationReportId;
    }


    /**
     * Sets the reconciliationReportId value for this ReconciliationOrderReport.
     * 
     * @param reconciliationReportId   * The ID of the {@link ReconciliationReport} this {@code ReconciliationOrderReport}
     * belongs to.
     *                 This value is read-only.
     */
    public void setReconciliationReportId(java.lang.Long reconciliationReportId) {
        this.reconciliationReportId = reconciliationReportId;
    }


    /**
     * Gets the orderId value for this ReconciliationOrderReport.
     * 
     * @return orderId   * If this reconciliation data is for an {@link Order}, then this
     * contains that order's ID.
     *                 Otherwise, this field will have a value of 0.
     *                 This value is read-only.
     */
    public java.lang.Long getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this ReconciliationOrderReport.
     * 
     * @param orderId   * If this reconciliation data is for an {@link Order}, then this
     * contains that order's ID.
     *                 Otherwise, this field will have a value of 0.
     *                 This value is read-only.
     */
    public void setOrderId(java.lang.Long orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the proposalId value for this ReconciliationOrderReport.
     * 
     * @return proposalId   * If this reconciliation data is for a {@link Proposal}, then
     * this contains that proposal's ID.
     *                 Otherwise, this field will have a value of 0. This
     * value is read-only.
     */
    public java.lang.Long getProposalId() {
        return proposalId;
    }


    /**
     * Sets the proposalId value for this ReconciliationOrderReport.
     * 
     * @param proposalId   * If this reconciliation data is for a {@link Proposal}, then
     * this contains that proposal's ID.
     *                 Otherwise, this field will have a value of 0. This
     * value is read-only.
     */
    public void setProposalId(java.lang.Long proposalId) {
        this.proposalId = proposalId;
    }


    /**
     * Gets the status value for this ReconciliationOrderReport.
     * 
     * @return status   * The status of this {@code ReconciliationOrderReport}.
     *                 This value is read-only.
     */
    public com.google.api.ads.dfp.axis.v201802.ReconciliationOrderReportStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ReconciliationOrderReport.
     * 
     * @param status   * The status of this {@code ReconciliationOrderReport}.
     *                 This value is read-only.
     */
    public void setStatus(com.google.api.ads.dfp.axis.v201802.ReconciliationOrderReportStatus status) {
        this.status = status;
    }


    /**
     * Gets the submissionDateTime value for this ReconciliationOrderReport.
     * 
     * @return submissionDateTime   * The time when this order report is submitted.
     *                 This value is read-only.
     */
    public com.google.api.ads.dfp.axis.v201802.DateTime getSubmissionDateTime() {
        return submissionDateTime;
    }


    /**
     * Sets the submissionDateTime value for this ReconciliationOrderReport.
     * 
     * @param submissionDateTime   * The time when this order report is submitted.
     *                 This value is read-only.
     */
    public void setSubmissionDateTime(com.google.api.ads.dfp.axis.v201802.DateTime submissionDateTime) {
        this.submissionDateTime = submissionDateTime;
    }


    /**
     * Gets the submitterId value for this ReconciliationOrderReport.
     * 
     * @return submitterId   * The ID of the {@link User} who submitted this order report.
     * This value is read-only.
     */
    public java.lang.Long getSubmitterId() {
        return submitterId;
    }


    /**
     * Sets the submitterId value for this ReconciliationOrderReport.
     * 
     * @param submitterId   * The ID of the {@link User} who submitted this order report.
     * This value is read-only.
     */
    public void setSubmitterId(java.lang.Long submitterId) {
        this.submitterId = submitterId;
    }


    /**
     * Gets the proposalNetBillableRevenueManualAdjustment value for this ReconciliationOrderReport.
     * 
     * @return proposalNetBillableRevenueManualAdjustment   * If this reconciliation data is for a {@link Proposal}, then
     * this contains the net revenue
     *                 manual adjustment for that proposal. Otherwise, this
     * is {@code null}.
     *                 This value is read-only.
     */
    public com.google.api.ads.dfp.axis.v201802.Money getProposalNetBillableRevenueManualAdjustment() {
        return proposalNetBillableRevenueManualAdjustment;
    }


    /**
     * Sets the proposalNetBillableRevenueManualAdjustment value for this ReconciliationOrderReport.
     * 
     * @param proposalNetBillableRevenueManualAdjustment   * If this reconciliation data is for a {@link Proposal}, then
     * this contains the net revenue
     *                 manual adjustment for that proposal. Otherwise, this
     * is {@code null}.
     *                 This value is read-only.
     */
    public void setProposalNetBillableRevenueManualAdjustment(com.google.api.ads.dfp.axis.v201802.Money proposalNetBillableRevenueManualAdjustment) {
        this.proposalNetBillableRevenueManualAdjustment = proposalNetBillableRevenueManualAdjustment;
    }


    /**
     * Gets the proposalGrossBillableRevenueManualAdjustment value for this ReconciliationOrderReport.
     * 
     * @return proposalGrossBillableRevenueManualAdjustment   * If this reconciliation data is for a {@link Proposal}, then
     * this contains the gross revenue
     *                 manual adjustment for that proposal. Otherwise, this
     * is {@code null}.
     *                 This value is editable.
     */
    public com.google.api.ads.dfp.axis.v201802.Money getProposalGrossBillableRevenueManualAdjustment() {
        return proposalGrossBillableRevenueManualAdjustment;
    }


    /**
     * Sets the proposalGrossBillableRevenueManualAdjustment value for this ReconciliationOrderReport.
     * 
     * @param proposalGrossBillableRevenueManualAdjustment   * If this reconciliation data is for a {@link Proposal}, then
     * this contains the gross revenue
     *                 manual adjustment for that proposal. Otherwise, this
     * is {@code null}.
     *                 This value is editable.
     */
    public void setProposalGrossBillableRevenueManualAdjustment(com.google.api.ads.dfp.axis.v201802.Money proposalGrossBillableRevenueManualAdjustment) {
        this.proposalGrossBillableRevenueManualAdjustment = proposalGrossBillableRevenueManualAdjustment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReconciliationOrderReport)) return false;
        ReconciliationOrderReport other = (ReconciliationOrderReport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.reconciliationReportId==null && other.getReconciliationReportId()==null) || 
             (this.reconciliationReportId!=null &&
              this.reconciliationReportId.equals(other.getReconciliationReportId()))) &&
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.proposalId==null && other.getProposalId()==null) || 
             (this.proposalId!=null &&
              this.proposalId.equals(other.getProposalId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.submissionDateTime==null && other.getSubmissionDateTime()==null) || 
             (this.submissionDateTime!=null &&
              this.submissionDateTime.equals(other.getSubmissionDateTime()))) &&
            ((this.submitterId==null && other.getSubmitterId()==null) || 
             (this.submitterId!=null &&
              this.submitterId.equals(other.getSubmitterId()))) &&
            ((this.proposalNetBillableRevenueManualAdjustment==null && other.getProposalNetBillableRevenueManualAdjustment()==null) || 
             (this.proposalNetBillableRevenueManualAdjustment!=null &&
              this.proposalNetBillableRevenueManualAdjustment.equals(other.getProposalNetBillableRevenueManualAdjustment()))) &&
            ((this.proposalGrossBillableRevenueManualAdjustment==null && other.getProposalGrossBillableRevenueManualAdjustment()==null) || 
             (this.proposalGrossBillableRevenueManualAdjustment!=null &&
              this.proposalGrossBillableRevenueManualAdjustment.equals(other.getProposalGrossBillableRevenueManualAdjustment())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getReconciliationReportId() != null) {
            _hashCode += getReconciliationReportId().hashCode();
        }
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getProposalId() != null) {
            _hashCode += getProposalId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSubmissionDateTime() != null) {
            _hashCode += getSubmissionDateTime().hashCode();
        }
        if (getSubmitterId() != null) {
            _hashCode += getSubmitterId().hashCode();
        }
        if (getProposalNetBillableRevenueManualAdjustment() != null) {
            _hashCode += getProposalNetBillableRevenueManualAdjustment().hashCode();
        }
        if (getProposalGrossBillableRevenueManualAdjustment() != null) {
            _hashCode += getProposalGrossBillableRevenueManualAdjustment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReconciliationOrderReport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ReconciliationOrderReport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reconciliationReportId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "reconciliationReportId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "orderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proposalId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "proposalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ReconciliationOrderReportStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submissionDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "submissionDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitterId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "submitterId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proposalNetBillableRevenueManualAdjustment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "proposalNetBillableRevenueManualAdjustment"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proposalGrossBillableRevenueManualAdjustment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "proposalGrossBillableRevenueManualAdjustment"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
