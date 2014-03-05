/**
 * ReportJob.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201311;


/**
 * Represents a report job that will be run to retrieve performance
 * and
 *             statistics information about ad campaigns, networks, inventory
 * and sales.
 */
public class ReportJob  implements java.io.Serializable {
    /* The unique ID of the {@code ReportJob}. This value is read-only
     * and is
     *                 assigned by Google. */
    private java.lang.Long id;

    /* Holds the filtering criteria. */
    private com.google.api.ads.dfp.axis.v201311.ReportQuery reportQuery;

    /* The status of the {@code ReportJob}. This attribute is read-only
     * and is
     *                 assigned by Google. */
    private com.google.api.ads.dfp.axis.v201311.ReportJobStatus reportJobStatus;

    public ReportJob() {
    }

    public ReportJob(
           java.lang.Long id,
           com.google.api.ads.dfp.axis.v201311.ReportQuery reportQuery,
           com.google.api.ads.dfp.axis.v201311.ReportJobStatus reportJobStatus) {
           this.id = id;
           this.reportQuery = reportQuery;
           this.reportJobStatus = reportJobStatus;
    }


    /**
     * Gets the id value for this ReportJob.
     * 
     * @return id   * The unique ID of the {@code ReportJob}. This value is read-only
     * and is
     *                 assigned by Google.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this ReportJob.
     * 
     * @param id   * The unique ID of the {@code ReportJob}. This value is read-only
     * and is
     *                 assigned by Google.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the reportQuery value for this ReportJob.
     * 
     * @return reportQuery   * Holds the filtering criteria.
     */
    public com.google.api.ads.dfp.axis.v201311.ReportQuery getReportQuery() {
        return reportQuery;
    }


    /**
     * Sets the reportQuery value for this ReportJob.
     * 
     * @param reportQuery   * Holds the filtering criteria.
     */
    public void setReportQuery(com.google.api.ads.dfp.axis.v201311.ReportQuery reportQuery) {
        this.reportQuery = reportQuery;
    }


    /**
     * Gets the reportJobStatus value for this ReportJob.
     * 
     * @return reportJobStatus   * The status of the {@code ReportJob}. This attribute is read-only
     * and is
     *                 assigned by Google.
     */
    public com.google.api.ads.dfp.axis.v201311.ReportJobStatus getReportJobStatus() {
        return reportJobStatus;
    }


    /**
     * Sets the reportJobStatus value for this ReportJob.
     * 
     * @param reportJobStatus   * The status of the {@code ReportJob}. This attribute is read-only
     * and is
     *                 assigned by Google.
     */
    public void setReportJobStatus(com.google.api.ads.dfp.axis.v201311.ReportJobStatus reportJobStatus) {
        this.reportJobStatus = reportJobStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportJob)) return false;
        ReportJob other = (ReportJob) obj;
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
            ((this.reportQuery==null && other.getReportQuery()==null) || 
             (this.reportQuery!=null &&
              this.reportQuery.equals(other.getReportQuery()))) &&
            ((this.reportJobStatus==null && other.getReportJobStatus()==null) || 
             (this.reportJobStatus!=null &&
              this.reportJobStatus.equals(other.getReportJobStatus())));
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
        if (getReportQuery() != null) {
            _hashCode += getReportQuery().hashCode();
        }
        if (getReportJobStatus() != null) {
            _hashCode += getReportJobStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReportJob.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "ReportJob"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "reportQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "ReportQuery"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportJobStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "reportJobStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "ReportJobStatus"));
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
