// Copyright 2018 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * BasicUserList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.rm;


/**
 * User list targeting as a collection of conversion types.
 */
public class BasicUserList  extends com.google.api.ads.adwords.axis.v201802.rm.UserList  implements java.io.Serializable {
    /* Conversion types associated with this user list.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ConversionTypes".</span> */
    private com.google.api.ads.adwords.axis.v201802.rm.UserListConversionType[] conversionTypes;

    public BasicUserList() {
    }

    public BasicUserList(
           java.lang.Long id,
           java.lang.Boolean isReadOnly,
           java.lang.String name,
           java.lang.String description,
           com.google.api.ads.adwords.axis.v201802.rm.UserListMembershipStatus status,
           java.lang.String integrationCode,
           com.google.api.ads.adwords.axis.v201802.rm.AccessReason accessReason,
           com.google.api.ads.adwords.axis.v201802.rm.AccountUserListStatus accountUserListStatus,
           java.lang.Long membershipLifeSpan,
           java.lang.Long size,
           com.google.api.ads.adwords.axis.v201802.rm.SizeRange sizeRange,
           java.lang.Long sizeForSearch,
           com.google.api.ads.adwords.axis.v201802.rm.SizeRange sizeRangeForSearch,
           com.google.api.ads.adwords.axis.v201802.rm.UserListType listType,
           java.lang.Boolean isEligibleForSearch,
           java.lang.Boolean isEligibleForDisplay,
           com.google.api.ads.adwords.axis.v201802.rm.UserListClosingReason closingReason,
           java.lang.String userListType,
           com.google.api.ads.adwords.axis.v201802.rm.UserListConversionType[] conversionTypes) {
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
            closingReason,
            userListType);
        this.conversionTypes = conversionTypes;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("accessReason", getAccessReason())
            .add("accountUserListStatus", getAccountUserListStatus())
            .add("closingReason", getClosingReason())
            .add("conversionTypes", getConversionTypes())
            .add("description", getDescription())
            .add("id", getId())
            .add("integrationCode", getIntegrationCode())
            .add("isEligibleForDisplay", getIsEligibleForDisplay())
            .add("isEligibleForSearch", getIsEligibleForSearch())
            .add("isReadOnly", getIsReadOnly())
            .add("listType", getListType())
            .add("membershipLifeSpan", getMembershipLifeSpan())
            .add("name", getName())
            .add("size", getSize())
            .add("sizeForSearch", getSizeForSearch())
            .add("sizeRange", getSizeRange())
            .add("sizeRangeForSearch", getSizeRangeForSearch())
            .add("status", getStatus())
            .add("userListType", getUserListType())
            .toString();
    }

    /**
     * Gets the conversionTypes value for this BasicUserList.
     * 
     * @return conversionTypes   * Conversion types associated with this user list.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ConversionTypes".</span>
     */
    public com.google.api.ads.adwords.axis.v201802.rm.UserListConversionType[] getConversionTypes() {
        return conversionTypes;
    }


    /**
     * Sets the conversionTypes value for this BasicUserList.
     * 
     * @param conversionTypes   * Conversion types associated with this user list.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ConversionTypes".</span>
     */
    public void setConversionTypes(com.google.api.ads.adwords.axis.v201802.rm.UserListConversionType[] conversionTypes) {
        this.conversionTypes = conversionTypes;
    }

    public com.google.api.ads.adwords.axis.v201802.rm.UserListConversionType getConversionTypes(int i) {
        return this.conversionTypes[i];
    }

    public void setConversionTypes(int i, com.google.api.ads.adwords.axis.v201802.rm.UserListConversionType _value) {
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
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "BasicUserList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "conversionTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "UserListConversionType"));
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
