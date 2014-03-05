/**
 * ReportInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class ReportInfo  implements java.io.Serializable {
    private long queryId;

    private long reportId;

    private com.google.api.ads.dfa.axis.v1_20.ReportStatusType status;

    private java.lang.String url;

    public ReportInfo() {
    }

    public ReportInfo(
           long queryId,
           long reportId,
           com.google.api.ads.dfa.axis.v1_20.ReportStatusType status,
           java.lang.String url) {
           this.queryId = queryId;
           this.reportId = reportId;
           this.status = status;
           this.url = url;
    }


    /**
     * Gets the queryId value for this ReportInfo.
     * 
     * @return queryId
     */
    public long getQueryId() {
        return queryId;
    }


    /**
     * Sets the queryId value for this ReportInfo.
     * 
     * @param queryId
     */
    public void setQueryId(long queryId) {
        this.queryId = queryId;
    }


    /**
     * Gets the reportId value for this ReportInfo.
     * 
     * @return reportId
     */
    public long getReportId() {
        return reportId;
    }


    /**
     * Sets the reportId value for this ReportInfo.
     * 
     * @param reportId
     */
    public void setReportId(long reportId) {
        this.reportId = reportId;
    }


    /**
     * Gets the status value for this ReportInfo.
     * 
     * @return status
     */
    public com.google.api.ads.dfa.axis.v1_20.ReportStatusType getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ReportInfo.
     * 
     * @param status
     */
    public void setStatus(com.google.api.ads.dfa.axis.v1_20.ReportStatusType status) {
        this.status = status;
    }


    /**
     * Gets the url value for this ReportInfo.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this ReportInfo.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportInfo)) return false;
        ReportInfo other = (ReportInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.queryId == other.getQueryId() &&
            this.reportId == other.getReportId() &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl())));
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
        _hashCode += new Long(getQueryId()).hashCode();
        _hashCode += new Long(getReportId()).hashCode();
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReportInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ReportInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "queryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reportId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ReportStatusType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
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
