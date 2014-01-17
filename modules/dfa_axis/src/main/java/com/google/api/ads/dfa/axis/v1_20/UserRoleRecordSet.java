/**
 * UserRoleRecordSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class UserRoleRecordSet  extends com.google.api.ads.dfa.axis.v1_20.PagedRecordSet  implements java.io.Serializable {
    private com.google.api.ads.dfa.axis.v1_20.UserRole[] userRoles;

    public UserRoleRecordSet() {
    }

    public UserRoleRecordSet(
           int pageNumber,
           int totalNumberOfPages,
           int totalNumberOfRecords,
           com.google.api.ads.dfa.axis.v1_20.UserRole[] userRoles) {
        super(
            pageNumber,
            totalNumberOfPages,
            totalNumberOfRecords);
        this.userRoles = userRoles;
    }


    /**
     * Gets the userRoles value for this UserRoleRecordSet.
     * 
     * @return userRoles
     */
    public com.google.api.ads.dfa.axis.v1_20.UserRole[] getUserRoles() {
        return userRoles;
    }


    /**
     * Sets the userRoles value for this UserRoleRecordSet.
     * 
     * @param userRoles
     */
    public void setUserRoles(com.google.api.ads.dfa.axis.v1_20.UserRole[] userRoles) {
        this.userRoles = userRoles;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserRoleRecordSet)) return false;
        UserRoleRecordSet other = (UserRoleRecordSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.userRoles==null && other.getUserRoles()==null) || 
             (this.userRoles!=null &&
              java.util.Arrays.equals(this.userRoles, other.getUserRoles())));
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
        if (getUserRoles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserRoles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserRoles(), i);
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
        new org.apache.axis.description.TypeDesc(UserRoleRecordSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "UserRoleRecordSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userRoles");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userRoles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "UserRole"));
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
