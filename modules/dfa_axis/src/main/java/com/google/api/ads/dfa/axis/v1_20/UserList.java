/**
 * UserList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class UserList  extends com.google.api.ads.dfa.axis.v1_20.Base  implements java.io.Serializable {
    private java.lang.String description;

    private int estimatedUserCount;

    private java.util.Calendar modifiedTimestamp;

    public UserList() {
    }

    public UserList(
           long id,
           java.lang.String name,
           java.lang.String description,
           int estimatedUserCount,
           java.util.Calendar modifiedTimestamp) {
        super(
            id,
            name);
        this.description = description;
        this.estimatedUserCount = estimatedUserCount;
        this.modifiedTimestamp = modifiedTimestamp;
    }


    /**
     * Gets the description value for this UserList.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this UserList.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the estimatedUserCount value for this UserList.
     * 
     * @return estimatedUserCount
     */
    public int getEstimatedUserCount() {
        return estimatedUserCount;
    }


    /**
     * Sets the estimatedUserCount value for this UserList.
     * 
     * @param estimatedUserCount
     */
    public void setEstimatedUserCount(int estimatedUserCount) {
        this.estimatedUserCount = estimatedUserCount;
    }


    /**
     * Gets the modifiedTimestamp value for this UserList.
     * 
     * @return modifiedTimestamp
     */
    public java.util.Calendar getModifiedTimestamp() {
        return modifiedTimestamp;
    }


    /**
     * Sets the modifiedTimestamp value for this UserList.
     * 
     * @param modifiedTimestamp
     */
    public void setModifiedTimestamp(java.util.Calendar modifiedTimestamp) {
        this.modifiedTimestamp = modifiedTimestamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserList)) return false;
        UserList other = (UserList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.estimatedUserCount == other.getEstimatedUserCount() &&
            ((this.modifiedTimestamp==null && other.getModifiedTimestamp()==null) || 
             (this.modifiedTimestamp!=null &&
              this.modifiedTimestamp.equals(other.getModifiedTimestamp())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += getEstimatedUserCount();
        if (getModifiedTimestamp() != null) {
            _hashCode += getModifiedTimestamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "UserList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedUserCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estimatedUserCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modifiedTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
