/**
 * ReconciliationReport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201311;


/**
 * A {@code ReconciliationReport} represents a report that can be
 * reconciled.
 */
public class ReconciliationReport  implements java.io.Serializable {
    /* The unique ID of the {@code ReconciliationReport}.
     *                 This attribute is read-only. */
    private java.lang.Long id;

    /* The reconciliation state of the {@code ReconciliationReport}.
     * This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201311.ReconciliationReportStatus status;

    /* The start date of a billing period. Billing period is monthly.
     * This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201311.Date startDate;

    /* The reconciliation report notes.
     *                 This attribute is optional and has a maximum length
     * of 65535. */
    private java.lang.String notes;

    public ReconciliationReport() {
    }

    public ReconciliationReport(
           java.lang.Long id,
           com.google.api.ads.dfp.axis.v201311.ReconciliationReportStatus status,
           com.google.api.ads.dfp.axis.v201311.Date startDate,
           java.lang.String notes) {
           this.id = id;
           this.status = status;
           this.startDate = startDate;
           this.notes = notes;
    }


    /**
     * Gets the id value for this ReconciliationReport.
     * 
     * @return id   * The unique ID of the {@code ReconciliationReport}.
     *                 This attribute is read-only.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this ReconciliationReport.
     * 
     * @param id   * The unique ID of the {@code ReconciliationReport}.
     *                 This attribute is read-only.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the status value for this ReconciliationReport.
     * 
     * @return status   * The reconciliation state of the {@code ReconciliationReport}.
     * This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201311.ReconciliationReportStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ReconciliationReport.
     * 
     * @param status   * The reconciliation state of the {@code ReconciliationReport}.
     * This attribute is read-only.
     */
    public void setStatus(com.google.api.ads.dfp.axis.v201311.ReconciliationReportStatus status) {
        this.status = status;
    }


    /**
     * Gets the startDate value for this ReconciliationReport.
     * 
     * @return startDate   * The start date of a billing period. Billing period is monthly.
     * This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201311.Date getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this ReconciliationReport.
     * 
     * @param startDate   * The start date of a billing period. Billing period is monthly.
     * This attribute is read-only.
     */
    public void setStartDate(com.google.api.ads.dfp.axis.v201311.Date startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the notes value for this ReconciliationReport.
     * 
     * @return notes   * The reconciliation report notes.
     *                 This attribute is optional and has a maximum length
     * of 65535.
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this ReconciliationReport.
     * 
     * @param notes   * The reconciliation report notes.
     *                 This attribute is optional and has a maximum length
     * of 65535.
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReconciliationReport)) return false;
        ReconciliationReport other = (ReconciliationReport) obj;
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
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReconciliationReport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "ReconciliationReport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "ReconciliationReportStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "Date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
