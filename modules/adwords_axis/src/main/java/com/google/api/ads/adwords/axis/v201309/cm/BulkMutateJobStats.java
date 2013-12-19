/**
 * BulkMutateJobStats.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.cm;


/**
 * Bulk mutate job-handling statistics.
 */
public class BulkMutateJobStats  extends com.google.api.ads.adwords.axis.v201309.cm.JobStats  implements java.io.Serializable {
    /* The total number of operations in this bulk mutate job. */
    private java.lang.Integer numOperations;

    /* The number of failed operations in this bulk mutate job. */
    private java.lang.Integer numFailedOperations;

    /* The number of operations in this bulk mutate job that have
     * not yet been
     *                     processed, or will not be processed. */
    private java.lang.Integer numUnprocessedOperations;

    public BulkMutateJobStats() {
    }

    public BulkMutateJobStats(
           java.lang.Integer progressPercent,
           java.lang.Long pendingTimeMillis,
           java.lang.Long processingTimeMillis,
           java.lang.String jobStatsType,
           java.lang.Integer numOperations,
           java.lang.Integer numFailedOperations,
           java.lang.Integer numUnprocessedOperations) {
        super(
            progressPercent,
            pendingTimeMillis,
            processingTimeMillis,
            jobStatsType);
        this.numOperations = numOperations;
        this.numFailedOperations = numFailedOperations;
        this.numUnprocessedOperations = numUnprocessedOperations;
    }


    /**
     * Gets the numOperations value for this BulkMutateJobStats.
     * 
     * @return numOperations   * The total number of operations in this bulk mutate job.
     */
    public java.lang.Integer getNumOperations() {
        return numOperations;
    }


    /**
     * Sets the numOperations value for this BulkMutateJobStats.
     * 
     * @param numOperations   * The total number of operations in this bulk mutate job.
     */
    public void setNumOperations(java.lang.Integer numOperations) {
        this.numOperations = numOperations;
    }


    /**
     * Gets the numFailedOperations value for this BulkMutateJobStats.
     * 
     * @return numFailedOperations   * The number of failed operations in this bulk mutate job.
     */
    public java.lang.Integer getNumFailedOperations() {
        return numFailedOperations;
    }


    /**
     * Sets the numFailedOperations value for this BulkMutateJobStats.
     * 
     * @param numFailedOperations   * The number of failed operations in this bulk mutate job.
     */
    public void setNumFailedOperations(java.lang.Integer numFailedOperations) {
        this.numFailedOperations = numFailedOperations;
    }


    /**
     * Gets the numUnprocessedOperations value for this BulkMutateJobStats.
     * 
     * @return numUnprocessedOperations   * The number of operations in this bulk mutate job that have
     * not yet been
     *                     processed, or will not be processed.
     */
    public java.lang.Integer getNumUnprocessedOperations() {
        return numUnprocessedOperations;
    }


    /**
     * Sets the numUnprocessedOperations value for this BulkMutateJobStats.
     * 
     * @param numUnprocessedOperations   * The number of operations in this bulk mutate job that have
     * not yet been
     *                     processed, or will not be processed.
     */
    public void setNumUnprocessedOperations(java.lang.Integer numUnprocessedOperations) {
        this.numUnprocessedOperations = numUnprocessedOperations;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BulkMutateJobStats)) return false;
        BulkMutateJobStats other = (BulkMutateJobStats) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.numOperations==null && other.getNumOperations()==null) || 
             (this.numOperations!=null &&
              this.numOperations.equals(other.getNumOperations()))) &&
            ((this.numFailedOperations==null && other.getNumFailedOperations()==null) || 
             (this.numFailedOperations!=null &&
              this.numFailedOperations.equals(other.getNumFailedOperations()))) &&
            ((this.numUnprocessedOperations==null && other.getNumUnprocessedOperations()==null) || 
             (this.numUnprocessedOperations!=null &&
              this.numUnprocessedOperations.equals(other.getNumUnprocessedOperations())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getNumOperations() != null) {
            _hashCode += getNumOperations().hashCode();
        }
        if (getNumFailedOperations() != null) {
            _hashCode += getNumFailedOperations().hashCode();
        }
        if (getNumUnprocessedOperations() != null) {
            _hashCode += getNumUnprocessedOperations().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BulkMutateJobStats.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "BulkMutateJobStats"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numOperations");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "numOperations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numFailedOperations");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "numFailedOperations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numUnprocessedOperations");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "numUnprocessedOperations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
