/**
 * Permission.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class Permission  extends com.google.api.ads.dfa.axis.v1_20.PermissionBase  implements java.io.Serializable {
    private long displayOrder;

    private com.google.api.ads.dfa.axis.v1_20.PermissionGroup permissionGroup;

    private java.lang.String permissionString;

    public Permission() {
    }

    public Permission(
           long id,
           java.lang.String name,
           long displayOrder,
           com.google.api.ads.dfa.axis.v1_20.PermissionGroup permissionGroup,
           java.lang.String permissionString) {
        super(
            id,
            name);
        this.displayOrder = displayOrder;
        this.permissionGroup = permissionGroup;
        this.permissionString = permissionString;
    }


    /**
     * Gets the displayOrder value for this Permission.
     * 
     * @return displayOrder
     */
    public long getDisplayOrder() {
        return displayOrder;
    }


    /**
     * Sets the displayOrder value for this Permission.
     * 
     * @param displayOrder
     */
    public void setDisplayOrder(long displayOrder) {
        this.displayOrder = displayOrder;
    }


    /**
     * Gets the permissionGroup value for this Permission.
     * 
     * @return permissionGroup
     */
    public com.google.api.ads.dfa.axis.v1_20.PermissionGroup getPermissionGroup() {
        return permissionGroup;
    }


    /**
     * Sets the permissionGroup value for this Permission.
     * 
     * @param permissionGroup
     */
    public void setPermissionGroup(com.google.api.ads.dfa.axis.v1_20.PermissionGroup permissionGroup) {
        this.permissionGroup = permissionGroup;
    }


    /**
     * Gets the permissionString value for this Permission.
     * 
     * @return permissionString
     */
    public java.lang.String getPermissionString() {
        return permissionString;
    }


    /**
     * Sets the permissionString value for this Permission.
     * 
     * @param permissionString
     */
    public void setPermissionString(java.lang.String permissionString) {
        this.permissionString = permissionString;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Permission)) return false;
        Permission other = (Permission) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.displayOrder == other.getDisplayOrder() &&
            ((this.permissionGroup==null && other.getPermissionGroup()==null) || 
             (this.permissionGroup!=null &&
              this.permissionGroup.equals(other.getPermissionGroup()))) &&
            ((this.permissionString==null && other.getPermissionString()==null) || 
             (this.permissionString!=null &&
              this.permissionString.equals(other.getPermissionString())));
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
        _hashCode += new Long(getDisplayOrder()).hashCode();
        if (getPermissionGroup() != null) {
            _hashCode += getPermissionGroup().hashCode();
        }
        if (getPermissionString() != null) {
            _hashCode += getPermissionString().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Permission.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "Permission"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "displayOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "permissionGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "PermissionGroup"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "permissionString"));
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
