/**
 * JobResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201306.cm;


/**
 * Represents the result data of a job. This contains both the results
 * of
 *             successfully processed operations as well as errors returned
 * by failed
 *             operations.
 */
public class JobResult  implements java.io.Serializable {
    private com.google.api.ads.adwords.axis.v201306.cm.BulkMutateResult bulkMutateResult;

    private com.google.api.ads.adwords.axis.v201306.cm.SimpleMutateResult simpleMutateResult;

    public JobResult() {
    }

    public JobResult(
           com.google.api.ads.adwords.axis.v201306.cm.BulkMutateResult bulkMutateResult,
           com.google.api.ads.adwords.axis.v201306.cm.SimpleMutateResult simpleMutateResult) {
           this.bulkMutateResult = bulkMutateResult;
           this.simpleMutateResult = simpleMutateResult;
    }


    /**
     * Gets the bulkMutateResult value for this JobResult.
     * 
     * @return bulkMutateResult
     */
    public com.google.api.ads.adwords.axis.v201306.cm.BulkMutateResult getBulkMutateResult() {
        return bulkMutateResult;
    }


    /**
     * Sets the bulkMutateResult value for this JobResult.
     * 
     * @param bulkMutateResult
     */
    public void setBulkMutateResult(com.google.api.ads.adwords.axis.v201306.cm.BulkMutateResult bulkMutateResult) {
        this.bulkMutateResult = bulkMutateResult;
    }


    /**
     * Gets the simpleMutateResult value for this JobResult.
     * 
     * @return simpleMutateResult
     */
    public com.google.api.ads.adwords.axis.v201306.cm.SimpleMutateResult getSimpleMutateResult() {
        return simpleMutateResult;
    }


    /**
     * Sets the simpleMutateResult value for this JobResult.
     * 
     * @param simpleMutateResult
     */
    public void setSimpleMutateResult(com.google.api.ads.adwords.axis.v201306.cm.SimpleMutateResult simpleMutateResult) {
        this.simpleMutateResult = simpleMutateResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JobResult)) return false;
        JobResult other = (JobResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bulkMutateResult==null && other.getBulkMutateResult()==null) || 
             (this.bulkMutateResult!=null &&
              this.bulkMutateResult.equals(other.getBulkMutateResult()))) &&
            ((this.simpleMutateResult==null && other.getSimpleMutateResult()==null) || 
             (this.simpleMutateResult!=null &&
              this.simpleMutateResult.equals(other.getSimpleMutateResult())));
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
        if (getBulkMutateResult() != null) {
            _hashCode += getBulkMutateResult().hashCode();
        }
        if (getSimpleMutateResult() != null) {
            _hashCode += getSimpleMutateResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(JobResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "JobResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bulkMutateResult");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "BulkMutateResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "BulkMutateResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("simpleMutateResult");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "SimpleMutateResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "SimpleMutateResult"));
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
