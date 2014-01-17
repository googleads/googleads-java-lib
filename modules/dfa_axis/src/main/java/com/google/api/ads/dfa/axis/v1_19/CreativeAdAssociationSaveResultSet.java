/**
 * CreativeAdAssociationSaveResultSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class CreativeAdAssociationSaveResultSet  implements java.io.Serializable {
    private boolean inError;

    private com.google.api.ads.dfa.axis.v1_19.CreativeAdAssociationSaveResult[] saveResults;

    public CreativeAdAssociationSaveResultSet() {
    }

    public CreativeAdAssociationSaveResultSet(
           boolean inError,
           com.google.api.ads.dfa.axis.v1_19.CreativeAdAssociationSaveResult[] saveResults) {
           this.inError = inError;
           this.saveResults = saveResults;
    }


    /**
     * Gets the inError value for this CreativeAdAssociationSaveResultSet.
     * 
     * @return inError
     */
    public boolean isInError() {
        return inError;
    }


    /**
     * Sets the inError value for this CreativeAdAssociationSaveResultSet.
     * 
     * @param inError
     */
    public void setInError(boolean inError) {
        this.inError = inError;
    }


    /**
     * Gets the saveResults value for this CreativeAdAssociationSaveResultSet.
     * 
     * @return saveResults
     */
    public com.google.api.ads.dfa.axis.v1_19.CreativeAdAssociationSaveResult[] getSaveResults() {
        return saveResults;
    }


    /**
     * Sets the saveResults value for this CreativeAdAssociationSaveResultSet.
     * 
     * @param saveResults
     */
    public void setSaveResults(com.google.api.ads.dfa.axis.v1_19.CreativeAdAssociationSaveResult[] saveResults) {
        this.saveResults = saveResults;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreativeAdAssociationSaveResultSet)) return false;
        CreativeAdAssociationSaveResultSet other = (CreativeAdAssociationSaveResultSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.inError == other.isInError() &&
            ((this.saveResults==null && other.getSaveResults()==null) || 
             (this.saveResults!=null &&
              java.util.Arrays.equals(this.saveResults, other.getSaveResults())));
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
        if (getSaveResults() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSaveResults());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSaveResults(), i);
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
        new org.apache.axis.description.TypeDesc(CreativeAdAssociationSaveResultSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CreativeAdAssociationSaveResultSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inError");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saveResults");
        elemField.setXmlName(new javax.xml.namespace.QName("", "saveResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CreativeAdAssociationSaveResult"));
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
