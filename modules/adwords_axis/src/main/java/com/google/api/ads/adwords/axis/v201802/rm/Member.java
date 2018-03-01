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
 * Member.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.rm;


/**
 * Class that holds user list member identifiers. The following types
 * of member
 *             identifier are supported:
 *             
 *             <ul>
 *             <li>Contact info (email, phone number, address)
 *             <li>Mobile advertising ID
 *             <li>User IDs generated and assigned by advertiser
 *             </ul>
 *             
 *             A list can be uploaded with only one type of data and
 * once uploaded will not
 *             accept any other ID types.
 */
public class Member  implements java.io.Serializable {
    /* Hashed email address using SHA-256 hash function after normalization. */
    private java.lang.String hashedEmail;

    /* Mobile device ID (advertising ID/IDFA). */
    private java.lang.String mobileId;

    /* Hashed phone number using SHA-256 hash function after normalization. */
    private java.lang.String hashedPhoneNumber;

    /* Address info. */
    private com.google.api.ads.adwords.axis.v201802.rm.AddressInfo addressInfo;

    /* Advertiser generated and assigned user ID. Accessible to whitelisted
     * US customers only.
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 512, inclusive.</span> */
    private java.lang.String userId;

    public Member() {
    }

    public Member(
           java.lang.String hashedEmail,
           java.lang.String mobileId,
           java.lang.String hashedPhoneNumber,
           com.google.api.ads.adwords.axis.v201802.rm.AddressInfo addressInfo,
           java.lang.String userId) {
           this.hashedEmail = hashedEmail;
           this.mobileId = mobileId;
           this.hashedPhoneNumber = hashedPhoneNumber;
           this.addressInfo = addressInfo;
           this.userId = userId;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("addressInfo", getAddressInfo())
            .add("hashedEmail", getHashedEmail())
            .add("hashedPhoneNumber", getHashedPhoneNumber())
            .add("mobileId", getMobileId())
            .add("userId", getUserId())
            .toString();
    }

    /**
     * Gets the hashedEmail value for this Member.
     * 
     * @return hashedEmail   * Hashed email address using SHA-256 hash function after normalization.
     */
    public java.lang.String getHashedEmail() {
        return hashedEmail;
    }


    /**
     * Sets the hashedEmail value for this Member.
     * 
     * @param hashedEmail   * Hashed email address using SHA-256 hash function after normalization.
     */
    public void setHashedEmail(java.lang.String hashedEmail) {
        this.hashedEmail = hashedEmail;
    }


    /**
     * Gets the mobileId value for this Member.
     * 
     * @return mobileId   * Mobile device ID (advertising ID/IDFA).
     */
    public java.lang.String getMobileId() {
        return mobileId;
    }


    /**
     * Sets the mobileId value for this Member.
     * 
     * @param mobileId   * Mobile device ID (advertising ID/IDFA).
     */
    public void setMobileId(java.lang.String mobileId) {
        this.mobileId = mobileId;
    }


    /**
     * Gets the hashedPhoneNumber value for this Member.
     * 
     * @return hashedPhoneNumber   * Hashed phone number using SHA-256 hash function after normalization.
     */
    public java.lang.String getHashedPhoneNumber() {
        return hashedPhoneNumber;
    }


    /**
     * Sets the hashedPhoneNumber value for this Member.
     * 
     * @param hashedPhoneNumber   * Hashed phone number using SHA-256 hash function after normalization.
     */
    public void setHashedPhoneNumber(java.lang.String hashedPhoneNumber) {
        this.hashedPhoneNumber = hashedPhoneNumber;
    }


    /**
     * Gets the addressInfo value for this Member.
     * 
     * @return addressInfo   * Address info.
     */
    public com.google.api.ads.adwords.axis.v201802.rm.AddressInfo getAddressInfo() {
        return addressInfo;
    }


    /**
     * Sets the addressInfo value for this Member.
     * 
     * @param addressInfo   * Address info.
     */
    public void setAddressInfo(com.google.api.ads.adwords.axis.v201802.rm.AddressInfo addressInfo) {
        this.addressInfo = addressInfo;
    }


    /**
     * Gets the userId value for this Member.
     * 
     * @return userId   * Advertiser generated and assigned user ID. Accessible to whitelisted
     * US customers only.
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 512, inclusive.</span>
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this Member.
     * 
     * @param userId   * Advertiser generated and assigned user ID. Accessible to whitelisted
     * US customers only.
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 512, inclusive.</span>
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Member)) return false;
        Member other = (Member) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hashedEmail==null && other.getHashedEmail()==null) || 
             (this.hashedEmail!=null &&
              this.hashedEmail.equals(other.getHashedEmail()))) &&
            ((this.mobileId==null && other.getMobileId()==null) || 
             (this.mobileId!=null &&
              this.mobileId.equals(other.getMobileId()))) &&
            ((this.hashedPhoneNumber==null && other.getHashedPhoneNumber()==null) || 
             (this.hashedPhoneNumber!=null &&
              this.hashedPhoneNumber.equals(other.getHashedPhoneNumber()))) &&
            ((this.addressInfo==null && other.getAddressInfo()==null) || 
             (this.addressInfo!=null &&
              this.addressInfo.equals(other.getAddressInfo()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId())));
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
        if (getHashedEmail() != null) {
            _hashCode += getHashedEmail().hashCode();
        }
        if (getMobileId() != null) {
            _hashCode += getMobileId().hashCode();
        }
        if (getHashedPhoneNumber() != null) {
            _hashCode += getHashedPhoneNumber().hashCode();
        }
        if (getAddressInfo() != null) {
            _hashCode += getAddressInfo().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Member.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "Member"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hashedEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "hashedEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "mobileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hashedPhoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "hashedPhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "addressInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "AddressInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "userId"));
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
