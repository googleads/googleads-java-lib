/**
 * NetworkPermission.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class NetworkPermission  extends com.google.api.ads.dfa.axis.v1_19.NetworkPermissionBase  implements java.io.Serializable {
    private com.google.api.ads.dfa.axis.v1_19.NetworkPermissionGroup permissionGroup;

    private java.lang.String shortName;

    public NetworkPermission() {
    }

    public NetworkPermission(
           long id,
           java.lang.String name,
           com.google.api.ads.dfa.axis.v1_19.NetworkPermissionGroup permissionGroup,
           java.lang.String shortName) {
        super(
            id,
            name);
        this.permissionGroup = permissionGroup;
        this.shortName = shortName;
    }


    /**
     * Gets the permissionGroup value for this NetworkPermission.
     * 
     * @return permissionGroup
     */
    public com.google.api.ads.dfa.axis.v1_19.NetworkPermissionGroup getPermissionGroup() {
        return permissionGroup;
    }


    /**
     * Sets the permissionGroup value for this NetworkPermission.
     * 
     * @param permissionGroup
     */
    public void setPermissionGroup(com.google.api.ads.dfa.axis.v1_19.NetworkPermissionGroup permissionGroup) {
        this.permissionGroup = permissionGroup;
    }


    /**
     * Gets the shortName value for this NetworkPermission.
     * 
     * @return shortName
     */
    public java.lang.String getShortName() {
        return shortName;
    }


    /**
     * Sets the shortName value for this NetworkPermission.
     * 
     * @param shortName
     */
    public void setShortName(java.lang.String shortName) {
        this.shortName = shortName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetworkPermission)) return false;
        NetworkPermission other = (NetworkPermission) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.permissionGroup==null && other.getPermissionGroup()==null) || 
             (this.permissionGroup!=null &&
              this.permissionGroup.equals(other.getPermissionGroup()))) &&
            ((this.shortName==null && other.getShortName()==null) || 
             (this.shortName!=null &&
              this.shortName.equals(other.getShortName())));
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
        if (getPermissionGroup() != null) {
            _hashCode += getPermissionGroup().hashCode();
        }
        if (getShortName() != null) {
            _hashCode += getShortName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NetworkPermission.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "NetworkPermission"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "permissionGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "NetworkPermissionGroup"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shortName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shortName"));
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
