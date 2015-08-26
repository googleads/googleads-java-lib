/**
 * PlacementUpdateResultSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class PlacementUpdateResultSet  implements java.io.Serializable {
    private boolean inError;

    private com.google.api.ads.dfa.axis.v1_20.PlacementUpdateResult[] result;

    public PlacementUpdateResultSet() {
    }

    public PlacementUpdateResultSet(
           boolean inError,
           com.google.api.ads.dfa.axis.v1_20.PlacementUpdateResult[] result) {
           this.inError = inError;
           this.result = result;
    }


    /**
     * Gets the inError value for this PlacementUpdateResultSet.
     * 
     * @return inError
     */
    public boolean isInError() {
        return inError;
    }


    /**
     * Sets the inError value for this PlacementUpdateResultSet.
     * 
     * @param inError
     */
    public void setInError(boolean inError) {
        this.inError = inError;
    }


    /**
     * Gets the result value for this PlacementUpdateResultSet.
     * 
     * @return result
     */
    public com.google.api.ads.dfa.axis.v1_20.PlacementUpdateResult[] getResult() {
        return result;
    }


    /**
     * Sets the result value for this PlacementUpdateResultSet.
     * 
     * @param result
     */
    public void setResult(com.google.api.ads.dfa.axis.v1_20.PlacementUpdateResult[] result) {
        this.result = result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlacementUpdateResultSet)) return false;
        PlacementUpdateResultSet other = (PlacementUpdateResultSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.inError == other.isInError() &&
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              java.util.Arrays.equals(this.result, other.getResult())));
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
        _hashCode += (isInError() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResult(), i);
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
        new org.apache.axis.description.TypeDesc(PlacementUpdateResultSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "PlacementUpdateResultSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inError");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "PlacementUpdateResult"));
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
