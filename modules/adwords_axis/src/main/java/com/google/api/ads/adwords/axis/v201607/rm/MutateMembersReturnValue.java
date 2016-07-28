/**
 * MutateMembersReturnValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201607.rm;


/**
 * A container for return value from {@code UserListService#mutateMembers}
 * method.
 */
public class MutateMembersReturnValue  implements java.io.Serializable {
    /* The user lists associated in mutate members operations. */
    private com.google.api.ads.adwords.axis.v201607.rm.UserList[] userLists;

    public MutateMembersReturnValue() {
    }

    public MutateMembersReturnValue(
           com.google.api.ads.adwords.axis.v201607.rm.UserList[] userLists) {
           this.userLists = userLists;
    }


    /**
     * Gets the userLists value for this MutateMembersReturnValue.
     * 
     * @return userLists   * The user lists associated in mutate members operations.
     */
    public com.google.api.ads.adwords.axis.v201607.rm.UserList[] getUserLists() {
        return userLists;
    }


    /**
     * Sets the userLists value for this MutateMembersReturnValue.
     * 
     * @param userLists   * The user lists associated in mutate members operations.
     */
    public void setUserLists(com.google.api.ads.adwords.axis.v201607.rm.UserList[] userLists) {
        this.userLists = userLists;
    }

    public com.google.api.ads.adwords.axis.v201607.rm.UserList getUserLists(int i) {
        return this.userLists[i];
    }

    public void setUserLists(int i, com.google.api.ads.adwords.axis.v201607.rm.UserList _value) {
        this.userLists[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MutateMembersReturnValue)) return false;
        MutateMembersReturnValue other = (MutateMembersReturnValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userLists==null && other.getUserLists()==null) || 
             (this.userLists!=null &&
              java.util.Arrays.equals(this.userLists, other.getUserLists())));
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
        if (getUserLists() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserLists());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserLists(), i);
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
        new org.apache.axis.description.TypeDesc(MutateMembersReturnValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201607", "MutateMembersReturnValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userLists");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201607", "userLists"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201607", "UserList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
