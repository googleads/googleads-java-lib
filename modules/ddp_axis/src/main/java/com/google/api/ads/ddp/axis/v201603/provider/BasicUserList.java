/**
 * BasicUserList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.ddp.axis.v201603.provider;


/**
 * User list targeting as a collection of conversion types.
 */
public class BasicUserList  extends com.google.api.ads.ddp.axis.v201603.provider.UserList  implements java.io.Serializable {
    /* Conversion types associated with this user list.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ConversionTypes".</span> */
    private com.google.api.ads.ddp.axis.v201603.provider.UserListConversionType[] conversionTypes;

    public BasicUserList() {
    }

    public BasicUserList(
           java.lang.Long id,
           java.lang.Boolean isReadOnly,
           java.lang.String name,
           java.lang.String description,
           com.google.api.ads.ddp.axis.v201603.provider.UserListMembershipStatus status,
           java.lang.String integrationCode,
           com.google.api.ads.ddp.axis.v201603.provider.AccessReason accessReason,
           com.google.api.ads.ddp.axis.v201603.provider.AccountUserListStatus accountUserListStatus,
           java.lang.Long membershipLifeSpan,
           java.lang.Long size,
           com.google.api.ads.ddp.axis.v201603.provider.SizeRange sizeRange,
           java.lang.Long sizeForSearch,
           com.google.api.ads.ddp.axis.v201603.provider.SizeRange sizeRangeForSearch,
           com.google.api.ads.ddp.axis.v201603.provider.UserListType listType,
           java.lang.Boolean isEligibleForSearch,
           java.lang.Boolean isEligibleForDisplay,
           java.lang.String userListType,
           com.google.api.ads.ddp.axis.v201603.provider.UserListConversionType[] conversionTypes) {
        super(
            id,
            isReadOnly,
            name,
            description,
            status,
            integrationCode,
            accessReason,
            accountUserListStatus,
            membershipLifeSpan,
            size,
            sizeRange,
            sizeForSearch,
            sizeRangeForSearch,
            listType,
            isEligibleForSearch,
            isEligibleForDisplay,
            userListType);
        this.conversionTypes = conversionTypes;
    }


    /**
     * Gets the conversionTypes value for this BasicUserList.
     * 
     * @return conversionTypes   * Conversion types associated with this user list.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ConversionTypes".</span>
     */
    public com.google.api.ads.ddp.axis.v201603.provider.UserListConversionType[] getConversionTypes() {
        return conversionTypes;
    }


    /**
     * Sets the conversionTypes value for this BasicUserList.
     * 
     * @param conversionTypes   * Conversion types associated with this user list.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ConversionTypes".</span>
     */
    public void setConversionTypes(com.google.api.ads.ddp.axis.v201603.provider.UserListConversionType[] conversionTypes) {
        this.conversionTypes = conversionTypes;
    }

    public com.google.api.ads.ddp.axis.v201603.provider.UserListConversionType getConversionTypes(int i) {
        return this.conversionTypes[i];
    }

    public void setConversionTypes(int i, com.google.api.ads.ddp.axis.v201603.provider.UserListConversionType _value) {
        this.conversionTypes[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BasicUserList)) return false;
        BasicUserList other = (BasicUserList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.conversionTypes==null && other.getConversionTypes()==null) || 
             (this.conversionTypes!=null &&
              java.util.Arrays.equals(this.conversionTypes, other.getConversionTypes())));
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
        if (getConversionTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConversionTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConversionTypes(), i);
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
        new org.apache.axis.description.TypeDesc(BasicUserList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201603", "BasicUserList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201603", "conversionTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201603", "UserListConversionType"));
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
