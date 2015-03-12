/**
 * JobStats.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201502.cm;


/**
 * Job-handling statistics.
 */
public class JobStats  implements java.io.Serializable {
    /* The percent of the job's total work that is completed. */
    private java.lang.Integer progressPercent;

    /* The time (in milliseconds) spent by the job in a pending state. */
    private java.lang.Long pendingTimeMillis;

    /* The time (in milliseconds) spent by the job in a processing
     * state. */
    private java.lang.Long processingTimeMillis;

    /* Indicates that this instance is a subtype of JobStats.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String jobStatsType;

    public JobStats() {
    }

    public JobStats(
           java.lang.Integer progressPercent,
           java.lang.Long pendingTimeMillis,
           java.lang.Long processingTimeMillis,
           java.lang.String jobStatsType) {
           this.progressPercent = progressPercent;
           this.pendingTimeMillis = pendingTimeMillis;
           this.processingTimeMillis = processingTimeMillis;
           this.jobStatsType = jobStatsType;
    }


    /**
     * Gets the progressPercent value for this JobStats.
     * 
     * @return progressPercent   * The percent of the job's total work that is completed.
     */
    public java.lang.Integer getProgressPercent() {
        return progressPercent;
    }


    /**
     * Sets the progressPercent value for this JobStats.
     * 
     * @param progressPercent   * The percent of the job's total work that is completed.
     */
    public void setProgressPercent(java.lang.Integer progressPercent) {
        this.progressPercent = progressPercent;
    }


    /**
     * Gets the pendingTimeMillis value for this JobStats.
     * 
     * @return pendingTimeMillis   * The time (in milliseconds) spent by the job in a pending state.
     */
    public java.lang.Long getPendingTimeMillis() {
        return pendingTimeMillis;
    }


    /**
     * Sets the pendingTimeMillis value for this JobStats.
     * 
     * @param pendingTimeMillis   * The time (in milliseconds) spent by the job in a pending state.
     */
    public void setPendingTimeMillis(java.lang.Long pendingTimeMillis) {
        this.pendingTimeMillis = pendingTimeMillis;
    }


    /**
     * Gets the processingTimeMillis value for this JobStats.
     * 
     * @return processingTimeMillis   * The time (in milliseconds) spent by the job in a processing
     * state.
     */
    public java.lang.Long getProcessingTimeMillis() {
        return processingTimeMillis;
    }


    /**
     * Sets the processingTimeMillis value for this JobStats.
     * 
     * @param processingTimeMillis   * The time (in milliseconds) spent by the job in a processing
     * state.
     */
    public void setProcessingTimeMillis(java.lang.Long processingTimeMillis) {
        this.processingTimeMillis = processingTimeMillis;
    }


    /**
     * Gets the jobStatsType value for this JobStats.
     * 
     * @return jobStatsType   * Indicates that this instance is a subtype of JobStats.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getJobStatsType() {
        return jobStatsType;
    }


    /**
     * Sets the jobStatsType value for this JobStats.
     * 
     * @param jobStatsType   * Indicates that this instance is a subtype of JobStats.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setJobStatsType(java.lang.String jobStatsType) {
        this.jobStatsType = jobStatsType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JobStats)) return false;
        JobStats other = (JobStats) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.progressPercent==null && other.getProgressPercent()==null) || 
             (this.progressPercent!=null &&
              this.progressPercent.equals(other.getProgressPercent()))) &&
            ((this.pendingTimeMillis==null && other.getPendingTimeMillis()==null) || 
             (this.pendingTimeMillis!=null &&
              this.pendingTimeMillis.equals(other.getPendingTimeMillis()))) &&
            ((this.processingTimeMillis==null && other.getProcessingTimeMillis()==null) || 
             (this.processingTimeMillis!=null &&
              this.processingTimeMillis.equals(other.getProcessingTimeMillis()))) &&
            ((this.jobStatsType==null && other.getJobStatsType()==null) || 
             (this.jobStatsType!=null &&
              this.jobStatsType.equals(other.getJobStatsType())));
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
        if (getProgressPercent() != null) {
            _hashCode += getProgressPercent().hashCode();
        }
        if (getPendingTimeMillis() != null) {
            _hashCode += getPendingTimeMillis().hashCode();
        }
        if (getProcessingTimeMillis() != null) {
            _hashCode += getProcessingTimeMillis().hashCode();
        }
        if (getJobStatsType() != null) {
            _hashCode += getJobStatsType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(JobStats.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "JobStats"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("progressPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "progressPercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pendingTimeMillis");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "pendingTimeMillis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processingTimeMillis");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "processingTimeMillis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobStatsType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "JobStats.Type"));
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
