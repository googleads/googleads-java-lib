/**
 * ReconciliationOrderReport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201505;


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
     *                 Otherwise, this field will have a value of 0.
     *                 This value is read-only. */
    private java.lang.Long proposalId;

    /* The status of this {@code ReconciliationOrderReport}.
     *                 This value is read-only. */
    private com.google.api.ads.dfp.axis.v201505.ReconciliationOrderReportStatus status;

    /* The time when this order report is submitted.
     *                 This value is read-only. */
    private com.google.api.ads.dfp.axis.v201505.DateTime submissionDateTime;

    /* The ID of the {@link User} who submitted this order report.
     * This value is read-only. */
    private java.lang.Long submitterId;

    public ReconciliationOrderReport() {
    }

    public ReconciliationOrderReport(
           java.lang.Long id,
           java.lang.Long reconciliationReportId,
           java.lang.Long orderId,
           java.lang.Long proposalId,
           com.google.api.ads.dfp.axis.v201505.ReconciliationOrderReportStatus status,
           com.google.api.ads.dfp.axis.v201505.DateTime submissionDateTime,
           java.lang.Long submitterId) {
           this.id = id;
           this.reconciliationReportId = reconciliationReportId;
           this.orderId = orderId;
           this.proposalId = proposalId;
           this.status = status;
           this.submissionDateTime = submissionDateTime;
           this.submitterId = submitterId;
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
     *                 Otherwise, this field will have a value of 0.
     *                 This value is read-only.
     */
    public java.lang.Long getProposalId() {
        return proposalId;
    }


    /**
     * Sets the proposalId value for this ReconciliationOrderReport.
     * 
     * @param proposalId   * If this reconciliation data is for a {@link Proposal}, then
     * this contains that proposal's ID.
     *                 Otherwise, this field will have a value of 0.
     *                 This value is read-only.
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
    public com.google.api.ads.dfp.axis.v201505.ReconciliationOrderReportStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ReconciliationOrderReport.
     * 
     * @param status   * The status of this {@code ReconciliationOrderReport}.
     *                 This value is read-only.
     */
    public void setStatus(com.google.api.ads.dfp.axis.v201505.ReconciliationOrderReportStatus status) {
        this.status = status;
    }


    /**
     * Gets the submissionDateTime value for this ReconciliationOrderReport.
     * 
     * @return submissionDateTime   * The time when this order report is submitted.
     *                 This value is read-only.
     */
    public com.google.api.ads.dfp.axis.v201505.DateTime getSubmissionDateTime() {
        return submissionDateTime;
    }


    /**
     * Sets the submissionDateTime value for this ReconciliationOrderReport.
     * 
     * @param submissionDateTime   * The time when this order report is submitted.
     *                 This value is read-only.
     */
    public void setSubmissionDateTime(com.google.api.ads.dfp.axis.v201505.DateTime submissionDateTime) {
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
              this.submitterId.equals(other.getSubmitterId())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReconciliationOrderReport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201505", "ReconciliationOrderReport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201505", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reconciliationReportId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201505", "reconciliationReportId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201505", "orderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proposalId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201505", "proposalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201505", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201505", "ReconciliationOrderReportStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submissionDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201505", "submissionDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201505", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitterId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201505", "submitterId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
