/**
 * UserListSearchCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class UserListSearchCriteria  extends com.google.api.ads.dfa.axis.v1_20.SearchCriteriaBase  implements java.io.Serializable {
    private long advertiserId;

    private long[] userListGroupIds;

    public UserListSearchCriteria() {
    }

    public UserListSearchCriteria(
           long[] ids,
           java.lang.String searchString,
           long advertiserId,
           long[] userListGroupIds) {
        super(
            ids,
            searchString);
        this.advertiserId = advertiserId;
        this.userListGroupIds = userListGroupIds;
    }


    /**
     * Gets the advertiserId value for this UserListSearchCriteria.
     * 
     * @return advertiserId
     */
    public long getAdvertiserId() {
        return advertiserId;
    }


    /**
     * Sets the advertiserId value for this UserListSearchCriteria.
     * 
     * @param advertiserId
     */
    public void setAdvertiserId(long advertiserId) {
        this.advertiserId = advertiserId;
    }


    /**
     * Gets the userListGroupIds value for this UserListSearchCriteria.
     * 
     * @return userListGroupIds
     */
    public long[] getUserListGroupIds() {
        return userListGroupIds;
    }


    /**
     * Sets the userListGroupIds value for this UserListSearchCriteria.
     * 
     * @param userListGroupIds
     */
    public void setUserListGroupIds(long[] userListGroupIds) {
        this.userListGroupIds = userListGroupIds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserListSearchCriteria)) return false;
        UserListSearchCriteria other = (UserListSearchCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.advertiserId == other.getAdvertiserId() &&
            ((this.userListGroupIds==null && other.getUserListGroupIds()==null) || 
             (this.userListGroupIds!=null &&
              java.util.Arrays.equals(this.userListGroupIds, other.getUserListGroupIds())));
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
        _hashCode += new Long(getAdvertiserId()).hashCode();
        if (getUserListGroupIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserListGroupIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserListGroupIds(), i);
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
        new org.apache.axis.description.TypeDesc(UserListSearchCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "UserListSearchCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advertiserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "advertiserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userListGroupIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userListGroupIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
