/**
 * UserRole.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class UserRole  extends com.google.api.ads.dfa.axis.v1_19.UserRoleBase  implements java.io.Serializable {
    private long parentUserRoleId;

    private com.google.api.ads.dfa.axis.v1_19.Permission[] permissions;

    private long totalAssignedUsers;

    public UserRole() {
    }

    public UserRole(
           long id,
           java.lang.String name,
           boolean defaultUserRole,
           long subnetworkId,
           long parentUserRoleId,
           com.google.api.ads.dfa.axis.v1_19.Permission[] permissions,
           long totalAssignedUsers) {
        super(
            id,
            name,
            defaultUserRole,
            subnetworkId);
        this.parentUserRoleId = parentUserRoleId;
        this.permissions = permissions;
        this.totalAssignedUsers = totalAssignedUsers;
    }


    /**
     * Gets the parentUserRoleId value for this UserRole.
     * 
     * @return parentUserRoleId
     */
    public long getParentUserRoleId() {
        return parentUserRoleId;
    }


    /**
     * Sets the parentUserRoleId value for this UserRole.
     * 
     * @param parentUserRoleId
     */
    public void setParentUserRoleId(long parentUserRoleId) {
        this.parentUserRoleId = parentUserRoleId;
    }


    /**
     * Gets the permissions value for this UserRole.
     * 
     * @return permissions
     */
    public com.google.api.ads.dfa.axis.v1_19.Permission[] getPermissions() {
        return permissions;
    }


    /**
     * Sets the permissions value for this UserRole.
     * 
     * @param permissions
     */
    public void setPermissions(com.google.api.ads.dfa.axis.v1_19.Permission[] permissions) {
        this.permissions = permissions;
    }


    /**
     * Gets the totalAssignedUsers value for this UserRole.
     * 
     * @return totalAssignedUsers
     */
    public long getTotalAssignedUsers() {
        return totalAssignedUsers;
    }


    /**
     * Sets the totalAssignedUsers value for this UserRole.
     * 
     * @param totalAssignedUsers
     */
    public void setTotalAssignedUsers(long totalAssignedUsers) {
        this.totalAssignedUsers = totalAssignedUsers;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserRole)) return false;
        UserRole other = (UserRole) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.parentUserRoleId == other.getParentUserRoleId() &&
            ((this.permissions==null && other.getPermissions()==null) || 
             (this.permissions!=null &&
              java.util.Arrays.equals(this.permissions, other.getPermissions()))) &&
            this.totalAssignedUsers == other.getTotalAssignedUsers();
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
        _hashCode += new Long(getParentUserRoleId()).hashCode();
        if (getPermissions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPermissions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPermissions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getTotalAssignedUsers()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserRole.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "UserRole"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentUserRoleId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentUserRoleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "permissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "Permission"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAssignedUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalAssignedUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
