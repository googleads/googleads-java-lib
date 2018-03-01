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
 * CallFeedItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents a Call extension.
 */
public class CallFeedItem  extends com.google.api.ads.adwords.axis.v201802.cm.ExtensionFeedItem  implements java.io.Serializable {
    /* The advertiser's phone number to append to the ad.
     *                     <span class="constraint StringLength">This string
     * must not be empty, (trimmed).</span> */
    private java.lang.String callPhoneNumber;

    /* Uppercase two-letter country code of the advertiser's phone
     * number.
     *                     <span class="constraint StringLength">This string
     * must not be empty, (trimmed).</span> */
    private java.lang.String callCountryCode;

    /* Indicates whether call tracking is enabled. By default, call
     * tracking is not enabled. */
    private java.lang.Boolean callTracking;

    /* Call conversion type. To clear this field, set a CallConversionType
     * with a value of null in its
     *                     conversionTypeId field. This value should not
     * be set if
     *                     {@linkPlain CallFeedItem#disableCallConversionTracking}
     * is true. */
    private com.google.api.ads.adwords.axis.v201802.cm.CallConversionType callConversionType;

    /* If set, disable call conversion tracking. {@linkPlain CallFeedItem#callConversionType}
     * should
     *                     not be set if this value is true. */
    private java.lang.Boolean disableCallConversionTracking;

    public CallFeedItem() {
    }

    public CallFeedItem(
           java.lang.Long feedId,
           java.lang.Long feedItemId,
           com.google.api.ads.adwords.axis.v201802.cm.FeedItemStatus status,
           com.google.api.ads.adwords.axis.v201802.cm.FeedType feedType,
           java.lang.String startTime,
           java.lang.String endTime,
           com.google.api.ads.adwords.axis.v201802.cm.FeedItemDevicePreference devicePreference,
           com.google.api.ads.adwords.axis.v201802.cm.FeedItemScheduling scheduling,
           com.google.api.ads.adwords.axis.v201802.cm.FeedItemCampaignTargeting campaignTargeting,
           com.google.api.ads.adwords.axis.v201802.cm.FeedItemAdGroupTargeting adGroupTargeting,
           com.google.api.ads.adwords.axis.v201802.cm.Keyword keywordTargeting,
           com.google.api.ads.adwords.axis.v201802.cm.Location geoTargeting,
           com.google.api.ads.adwords.axis.v201802.cm.FeedItemGeoRestriction geoTargetingRestriction,
           com.google.api.ads.adwords.axis.v201802.cm.FeedItemPolicyData[] policyData,
           java.lang.String extensionFeedItemType,
           java.lang.String callPhoneNumber,
           java.lang.String callCountryCode,
           java.lang.Boolean callTracking,
           com.google.api.ads.adwords.axis.v201802.cm.CallConversionType callConversionType,
           java.lang.Boolean disableCallConversionTracking) {
        super(
            feedId,
            feedItemId,
            status,
            feedType,
            startTime,
            endTime,
            devicePreference,
            scheduling,
            campaignTargeting,
            adGroupTargeting,
            keywordTargeting,
            geoTargeting,
            geoTargetingRestriction,
            policyData,
            extensionFeedItemType);
        this.callPhoneNumber = callPhoneNumber;
        this.callCountryCode = callCountryCode;
        this.callTracking = callTracking;
        this.callConversionType = callConversionType;
        this.disableCallConversionTracking = disableCallConversionTracking;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adGroupTargeting", getAdGroupTargeting())
            .add("callConversionType", getCallConversionType())
            .add("callCountryCode", getCallCountryCode())
            .add("callPhoneNumber", getCallPhoneNumber())
            .add("callTracking", getCallTracking())
            .add("campaignTargeting", getCampaignTargeting())
            .add("devicePreference", getDevicePreference())
            .add("disableCallConversionTracking", getDisableCallConversionTracking())
            .add("endTime", getEndTime())
            .add("extensionFeedItemType", getExtensionFeedItemType())
            .add("feedId", getFeedId())
            .add("feedItemId", getFeedItemId())
            .add("feedType", getFeedType())
            .add("geoTargeting", getGeoTargeting())
            .add("geoTargetingRestriction", getGeoTargetingRestriction())
            .add("keywordTargeting", getKeywordTargeting())
            .add("policyData", getPolicyData())
            .add("scheduling", getScheduling())
            .add("startTime", getStartTime())
            .add("status", getStatus())
            .toString();
    }

    /**
     * Gets the callPhoneNumber value for this CallFeedItem.
     * 
     * @return callPhoneNumber   * The advertiser's phone number to append to the ad.
     *                     <span class="constraint StringLength">This string
     * must not be empty, (trimmed).</span>
     */
    public java.lang.String getCallPhoneNumber() {
        return callPhoneNumber;
    }


    /**
     * Sets the callPhoneNumber value for this CallFeedItem.
     * 
     * @param callPhoneNumber   * The advertiser's phone number to append to the ad.
     *                     <span class="constraint StringLength">This string
     * must not be empty, (trimmed).</span>
     */
    public void setCallPhoneNumber(java.lang.String callPhoneNumber) {
        this.callPhoneNumber = callPhoneNumber;
    }


    /**
     * Gets the callCountryCode value for this CallFeedItem.
     * 
     * @return callCountryCode   * Uppercase two-letter country code of the advertiser's phone
     * number.
     *                     <span class="constraint StringLength">This string
     * must not be empty, (trimmed).</span>
     */
    public java.lang.String getCallCountryCode() {
        return callCountryCode;
    }


    /**
     * Sets the callCountryCode value for this CallFeedItem.
     * 
     * @param callCountryCode   * Uppercase two-letter country code of the advertiser's phone
     * number.
     *                     <span class="constraint StringLength">This string
     * must not be empty, (trimmed).</span>
     */
    public void setCallCountryCode(java.lang.String callCountryCode) {
        this.callCountryCode = callCountryCode;
    }


    /**
     * Gets the callTracking value for this CallFeedItem.
     * 
     * @return callTracking   * Indicates whether call tracking is enabled. By default, call
     * tracking is not enabled.
     */
    public java.lang.Boolean getCallTracking() {
        return callTracking;
    }


    /**
     * Sets the callTracking value for this CallFeedItem.
     * 
     * @param callTracking   * Indicates whether call tracking is enabled. By default, call
     * tracking is not enabled.
     */
    public void setCallTracking(java.lang.Boolean callTracking) {
        this.callTracking = callTracking;
    }


    /**
     * Gets the callConversionType value for this CallFeedItem.
     * 
     * @return callConversionType   * Call conversion type. To clear this field, set a CallConversionType
     * with a value of null in its
     *                     conversionTypeId field. This value should not
     * be set if
     *                     {@linkPlain CallFeedItem#disableCallConversionTracking}
     * is true.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.CallConversionType getCallConversionType() {
        return callConversionType;
    }


    /**
     * Sets the callConversionType value for this CallFeedItem.
     * 
     * @param callConversionType   * Call conversion type. To clear this field, set a CallConversionType
     * with a value of null in its
     *                     conversionTypeId field. This value should not
     * be set if
     *                     {@linkPlain CallFeedItem#disableCallConversionTracking}
     * is true.
     */
    public void setCallConversionType(com.google.api.ads.adwords.axis.v201802.cm.CallConversionType callConversionType) {
        this.callConversionType = callConversionType;
    }


    /**
     * Gets the disableCallConversionTracking value for this CallFeedItem.
     * 
     * @return disableCallConversionTracking   * If set, disable call conversion tracking. {@linkPlain CallFeedItem#callConversionType}
     * should
     *                     not be set if this value is true.
     */
    public java.lang.Boolean getDisableCallConversionTracking() {
        return disableCallConversionTracking;
    }


    /**
     * Sets the disableCallConversionTracking value for this CallFeedItem.
     * 
     * @param disableCallConversionTracking   * If set, disable call conversion tracking. {@linkPlain CallFeedItem#callConversionType}
     * should
     *                     not be set if this value is true.
     */
    public void setDisableCallConversionTracking(java.lang.Boolean disableCallConversionTracking) {
        this.disableCallConversionTracking = disableCallConversionTracking;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CallFeedItem)) return false;
        CallFeedItem other = (CallFeedItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.callPhoneNumber==null && other.getCallPhoneNumber()==null) || 
             (this.callPhoneNumber!=null &&
              this.callPhoneNumber.equals(other.getCallPhoneNumber()))) &&
            ((this.callCountryCode==null && other.getCallCountryCode()==null) || 
             (this.callCountryCode!=null &&
              this.callCountryCode.equals(other.getCallCountryCode()))) &&
            ((this.callTracking==null && other.getCallTracking()==null) || 
             (this.callTracking!=null &&
              this.callTracking.equals(other.getCallTracking()))) &&
            ((this.callConversionType==null && other.getCallConversionType()==null) || 
             (this.callConversionType!=null &&
              this.callConversionType.equals(other.getCallConversionType()))) &&
            ((this.disableCallConversionTracking==null && other.getDisableCallConversionTracking()==null) || 
             (this.disableCallConversionTracking!=null &&
              this.disableCallConversionTracking.equals(other.getDisableCallConversionTracking())));
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
        if (getCallPhoneNumber() != null) {
            _hashCode += getCallPhoneNumber().hashCode();
        }
        if (getCallCountryCode() != null) {
            _hashCode += getCallCountryCode().hashCode();
        }
        if (getCallTracking() != null) {
            _hashCode += getCallTracking().hashCode();
        }
        if (getCallConversionType() != null) {
            _hashCode += getCallConversionType().hashCode();
        }
        if (getDisableCallConversionTracking() != null) {
            _hashCode += getDisableCallConversionTracking().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CallFeedItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CallFeedItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callPhoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "callPhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callCountryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "callCountryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callTracking");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "callTracking"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callConversionType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "callConversionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CallConversionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disableCallConversionTracking");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "disableCallConversionTracking"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
