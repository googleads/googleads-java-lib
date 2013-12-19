/**
 * AdRecordSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class AdRecordSet  extends com.google.api.ads.dfa.axis.v1_19.PagedRecordSet  implements java.io.Serializable {
    private com.google.api.ads.dfa.axis.v1_19.AdBase[] records;

    public AdRecordSet() {
    }

    public AdRecordSet(
           int pageNumber,
           int totalNumberOfPages,
           int totalNumberOfRecords,
           com.google.api.ads.dfa.axis.v1_19.AdBase[] records) {
        super(
            pageNumber,
            totalNumberOfPages,
            totalNumberOfRecords);
        this.records = records;
    }


    /**
     * Gets the records value for this AdRecordSet.
     * 
     * @return records
     */
    public com.google.api.ads.dfa.axis.v1_19.AdBase[] getRecords() {
        return records;
    }


    /**
     * Sets the records value for this AdRecordSet.
     * 
     * @param records
     */
    public void setRecords(com.google.api.ads.dfa.axis.v1_19.AdBase[] records) {
        this.records = records;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdRecordSet)) return false;
        AdRecordSet other = (AdRecordSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.records==null && other.getRecords()==null) || 
             (this.records!=null &&
              java.util.Arrays.equals(this.records, other.getRecords())));
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
        if (getRecords() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecords());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecords(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdRecordSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "AdRecordSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("records");
        elemField.setXmlName(new javax.xml.namespace.QName("", "records"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "AdBase"));
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
