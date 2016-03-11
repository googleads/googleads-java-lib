/**
 * BillingSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201509.cm;


/**
 * Represents the billing summary of the job that provides the overall
 * cost of
 *             the job's operations, i.e., for the work done <i>by</i>
 * the job. This
 *             therefore excludes the cost of operating on the job itself
 * - setting up the
 *             job, polling for its status, retrieving the result, etc.
 */
public class BillingSummary  implements java.io.Serializable {
    /* The number of billable operations performed by this job. */
    private java.lang.Integer numOperations;

    /* The cost of this job in number of billing quota units. */
    private java.lang.Long numUnits;

    public BillingSummary() {
    }

    public BillingSummary(
           java.lang.Integer numOperations,
           java.lang.Long numUnits) {
           this.numOperations = numOperations;
           this.numUnits = numUnits;
    }


    /**
     * Gets the numOperations value for this BillingSummary.
     * 
     * @return numOperations   * The number of billable operations performed by this job.
     */
    public java.lang.Integer getNumOperations() {
        return numOperations;
    }


    /**
     * Sets the numOperations value for this BillingSummary.
     * 
     * @param numOperations   * The number of billable operations performed by this job.
     */
    public void setNumOperations(java.lang.Integer numOperations) {
        this.numOperations = numOperations;
    }


    /**
     * Gets the numUnits value for this BillingSummary.
     * 
     * @return numUnits   * The cost of this job in number of billing quota units.
     */
    public java.lang.Long getNumUnits() {
        return numUnits;
    }


    /**
     * Sets the numUnits value for this BillingSummary.
     * 
     * @param numUnits   * The cost of this job in number of billing quota units.
     */
    public void setNumUnits(java.lang.Long numUnits) {
        this.numUnits = numUnits;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillingSummary)) return false;
        BillingSummary other = (BillingSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numOperations==null && other.getNumOperations()==null) || 
             (this.numOperations!=null &&
              this.numOperations.equals(other.getNumOperations()))) &&
            ((this.numUnits==null && other.getNumUnits()==null) || 
             (this.numUnits!=null &&
              this.numUnits.equals(other.getNumUnits())));
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
        if (getNumOperations() != null) {
            _hashCode += getNumOperations().hashCode();
        }
        if (getNumUnits() != null) {
            _hashCode += getNumUnits().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillingSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201509", "BillingSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numOperations");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201509", "numOperations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201509", "numUnits"));
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
