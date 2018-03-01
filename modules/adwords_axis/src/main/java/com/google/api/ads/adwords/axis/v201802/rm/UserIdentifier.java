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
 * UserIdentifier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.rm;


/**
 * Hashed user identifying information.
 */
public class UserIdentifier  implements java.io.Serializable {
    /* Type of user identifier.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201802.rm.OfflineDataUploadUserIdentifierType userIdentifierType;

    /* Value of identifier. Hashed using SHA-256 if needed.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.String value;

    public UserIdentifier() {
    }

    public UserIdentifier(
           com.google.api.ads.adwords.axis.v201802.rm.OfflineDataUploadUserIdentifierType userIdentifierType,
           java.lang.String value) {
           this.userIdentifierType = userIdentifierType;
           this.value = value;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("userIdentifierType", getUserIdentifierType())
            .add("value", getValue())
            .toString();
    }

    /**
     * Gets the userIdentifierType value for this UserIdentifier.
     * 
     * @return userIdentifierType   * Type of user identifier.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.rm.OfflineDataUploadUserIdentifierType getUserIdentifierType() {
        return userIdentifierType;
    }


    /**
     * Sets the userIdentifierType value for this UserIdentifier.
     * 
     * @param userIdentifierType   * Type of user identifier.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setUserIdentifierType(com.google.api.ads.adwords.axis.v201802.rm.OfflineDataUploadUserIdentifierType userIdentifierType) {
        this.userIdentifierType = userIdentifierType;
    }


    /**
     * Gets the value value for this UserIdentifier.
     * 
     * @return value   * Value of identifier. Hashed using SHA-256 if needed.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this UserIdentifier.
     * 
     * @param value   * Value of identifier. Hashed using SHA-256 if needed.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserIdentifier)) return false;
        UserIdentifier other = (UserIdentifier) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userIdentifierType==null && other.getUserIdentifierType()==null) || 
             (this.userIdentifierType!=null &&
              this.userIdentifierType.equals(other.getUserIdentifierType()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getUserIdentifierType() != null) {
            _hashCode += getUserIdentifierType().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserIdentifier.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "UserIdentifier"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userIdentifierType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "userIdentifierType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "OfflineDataUploadUserIdentifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
