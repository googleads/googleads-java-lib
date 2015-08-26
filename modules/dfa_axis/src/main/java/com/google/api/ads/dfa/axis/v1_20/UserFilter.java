/**
 * UserFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class UserFilter  implements java.io.Serializable {
    private com.google.api.ads.dfa.axis.v1_20.ObjectFilter[] objectFilters;

    private int userFilterCriteriaId;

    public UserFilter() {
    }

    public UserFilter(
           com.google.api.ads.dfa.axis.v1_20.ObjectFilter[] objectFilters,
           int userFilterCriteriaId) {
           this.objectFilters = objectFilters;
           this.userFilterCriteriaId = userFilterCriteriaId;
    }


    /**
     * Gets the objectFilters value for this UserFilter.
     * 
     * @return objectFilters
     */
    public com.google.api.ads.dfa.axis.v1_20.ObjectFilter[] getObjectFilters() {
        return objectFilters;
    }


    /**
     * Sets the objectFilters value for this UserFilter.
     * 
     * @param objectFilters
     */
    public void setObjectFilters(com.google.api.ads.dfa.axis.v1_20.ObjectFilter[] objectFilters) {
        this.objectFilters = objectFilters;
    }


    /**
     * Gets the userFilterCriteriaId value for this UserFilter.
     * 
     * @return userFilterCriteriaId
     */
    public int getUserFilterCriteriaId() {
        return userFilterCriteriaId;
    }


    /**
     * Sets the userFilterCriteriaId value for this UserFilter.
     * 
     * @param userFilterCriteriaId
     */
    public void setUserFilterCriteriaId(int userFilterCriteriaId) {
        this.userFilterCriteriaId = userFilterCriteriaId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserFilter)) return false;
        UserFilter other = (UserFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.objectFilters==null && other.getObjectFilters()==null) || 
             (this.objectFilters!=null &&
              java.util.Arrays.equals(this.objectFilters, other.getObjectFilters()))) &&
            this.userFilterCriteriaId == other.getUserFilterCriteriaId();
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
        if (getObjectFilters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getObjectFilters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getObjectFilters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getUserFilterCriteriaId();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "UserFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectFilters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "objectFilters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ObjectFilter"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userFilterCriteriaId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userFilterCriteriaId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
