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
 * AddressInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.rm;


/**
 * Address identifier of a user list member. Accessible for whitelisted
 * customers only.
 */
public class AddressInfo  implements java.io.Serializable {
    /* First name of the member, which is hashed as SHA-256 after
     * normalized (Lowercase all
     *                 characters; Remove any extra spaces before, after,
     * and in between).
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.String hashedFirstName;

    /* Last name of the member, which is hashed as SHA-256 after normalized
     * (lower case only and no
     *                 punctuation).
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.String hashedLastName;

    /* 2-letter country code in ISO-3166-1 alpha-2 of the member's
     * address.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 2 and 2, inclusive.</span> */
    private java.lang.String countryCode;

    /* Zip code of the member's address.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span> */
    private java.lang.String zipCode;

    public AddressInfo() {
    }

    public AddressInfo(
           java.lang.String hashedFirstName,
           java.lang.String hashedLastName,
           java.lang.String countryCode,
           java.lang.String zipCode) {
           this.hashedFirstName = hashedFirstName;
           this.hashedLastName = hashedLastName;
           this.countryCode = countryCode;
           this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("countryCode", getCountryCode())
            .add("hashedFirstName", getHashedFirstName())
            .add("hashedLastName", getHashedLastName())
            .add("zipCode", getZipCode())
            .toString();
    }

    /**
     * Gets the hashedFirstName value for this AddressInfo.
     * 
     * @return hashedFirstName   * First name of the member, which is hashed as SHA-256 after
     * normalized (Lowercase all
     *                 characters; Remove any extra spaces before, after,
     * and in between).
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.String getHashedFirstName() {
        return hashedFirstName;
    }


    /**
     * Sets the hashedFirstName value for this AddressInfo.
     * 
     * @param hashedFirstName   * First name of the member, which is hashed as SHA-256 after
     * normalized (Lowercase all
     *                 characters; Remove any extra spaces before, after,
     * and in between).
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setHashedFirstName(java.lang.String hashedFirstName) {
        this.hashedFirstName = hashedFirstName;
    }


    /**
     * Gets the hashedLastName value for this AddressInfo.
     * 
     * @return hashedLastName   * Last name of the member, which is hashed as SHA-256 after normalized
     * (lower case only and no
     *                 punctuation).
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.String getHashedLastName() {
        return hashedLastName;
    }


    /**
     * Sets the hashedLastName value for this AddressInfo.
     * 
     * @param hashedLastName   * Last name of the member, which is hashed as SHA-256 after normalized
     * (lower case only and no
     *                 punctuation).
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setHashedLastName(java.lang.String hashedLastName) {
        this.hashedLastName = hashedLastName;
    }


    /**
     * Gets the countryCode value for this AddressInfo.
     * 
     * @return countryCode   * 2-letter country code in ISO-3166-1 alpha-2 of the member's
     * address.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 2 and 2, inclusive.</span>
     */
    public java.lang.String getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this AddressInfo.
     * 
     * @param countryCode   * 2-letter country code in ISO-3166-1 alpha-2 of the member's
     * address.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 2 and 2, inclusive.</span>
     */
    public void setCountryCode(java.lang.String countryCode) {
        this.countryCode = countryCode;
    }


    /**
     * Gets the zipCode value for this AddressInfo.
     * 
     * @return zipCode   * Zip code of the member's address.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public java.lang.String getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this AddressInfo.
     * 
     * @param zipCode   * Zip code of the member's address.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public void setZipCode(java.lang.String zipCode) {
        this.zipCode = zipCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddressInfo)) return false;
        AddressInfo other = (AddressInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hashedFirstName==null && other.getHashedFirstName()==null) || 
             (this.hashedFirstName!=null &&
              this.hashedFirstName.equals(other.getHashedFirstName()))) &&
            ((this.hashedLastName==null && other.getHashedLastName()==null) || 
             (this.hashedLastName!=null &&
              this.hashedLastName.equals(other.getHashedLastName()))) &&
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              this.countryCode.equals(other.getCountryCode()))) &&
            ((this.zipCode==null && other.getZipCode()==null) || 
             (this.zipCode!=null &&
              this.zipCode.equals(other.getZipCode())));
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
        if (getHashedFirstName() != null) {
            _hashCode += getHashedFirstName().hashCode();
        }
        if (getHashedLastName() != null) {
            _hashCode += getHashedLastName().hashCode();
        }
        if (getCountryCode() != null) {
            _hashCode += getCountryCode().hashCode();
        }
        if (getZipCode() != null) {
            _hashCode += getZipCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddressInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "AddressInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hashedFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "hashedFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hashedLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "hashedLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "countryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "zipCode"));
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
