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
 * MessageFeedItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents a Message extension.
 */
public class MessageFeedItem  extends com.google.api.ads.adwords.axis.v201802.cm.ExtensionFeedItem  implements java.io.Serializable {
    /* The business name of the message. This will be prepended to
     * the message text.
     *                     <span class="constraint StringLength">The length
     * of this string should be between 1 and 25, inclusive, (trimmed).</span> */
    private java.lang.String messageBusinessName;

    /* Uppercase two-letter country code of the advertiser's phone
     * number to message.
     *                     <span class="constraint StringLength">This string
     * must not be empty, (trimmed).</span> */
    private java.lang.String messageCountryCode;

    /* The advertiser's phone number the message will be sent to.
     *                     <span class="constraint StringLength">This string
     * must not be empty, (trimmed).</span> */
    private java.lang.String messagePhoneNumber;

    /* The text to show in the ad.
     *                     <span class="constraint StringLength">The length
     * of this string should be between 5 and 35, inclusive, (trimmed).</span> */
    private java.lang.String messageExtensionText;

    /* The message text populated in the messaging app.
     *                     <span class="constraint StringLength">The length
     * of this string should be between 10 and 100, inclusive, (trimmed).</span> */
    private java.lang.String messageText;

    public MessageFeedItem() {
    }

    public MessageFeedItem(
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
           java.lang.String messageBusinessName,
           java.lang.String messageCountryCode,
           java.lang.String messagePhoneNumber,
           java.lang.String messageExtensionText,
           java.lang.String messageText) {
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
        this.messageBusinessName = messageBusinessName;
        this.messageCountryCode = messageCountryCode;
        this.messagePhoneNumber = messagePhoneNumber;
        this.messageExtensionText = messageExtensionText;
        this.messageText = messageText;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adGroupTargeting", getAdGroupTargeting())
            .add("campaignTargeting", getCampaignTargeting())
            .add("devicePreference", getDevicePreference())
            .add("endTime", getEndTime())
            .add("extensionFeedItemType", getExtensionFeedItemType())
            .add("feedId", getFeedId())
            .add("feedItemId", getFeedItemId())
            .add("feedType", getFeedType())
            .add("geoTargeting", getGeoTargeting())
            .add("geoTargetingRestriction", getGeoTargetingRestriction())
            .add("keywordTargeting", getKeywordTargeting())
            .add("messageBusinessName", getMessageBusinessName())
            .add("messageCountryCode", getMessageCountryCode())
            .add("messageExtensionText", getMessageExtensionText())
            .add("messagePhoneNumber", getMessagePhoneNumber())
            .add("messageText", getMessageText())
            .add("policyData", getPolicyData())
            .add("scheduling", getScheduling())
            .add("startTime", getStartTime())
            .add("status", getStatus())
            .toString();
    }

    /**
     * Gets the messageBusinessName value for this MessageFeedItem.
     * 
     * @return messageBusinessName   * The business name of the message. This will be prepended to
     * the message text.
     *                     <span class="constraint StringLength">The length
     * of this string should be between 1 and 25, inclusive, (trimmed).</span>
     */
    public java.lang.String getMessageBusinessName() {
        return messageBusinessName;
    }


    /**
     * Sets the messageBusinessName value for this MessageFeedItem.
     * 
     * @param messageBusinessName   * The business name of the message. This will be prepended to
     * the message text.
     *                     <span class="constraint StringLength">The length
     * of this string should be between 1 and 25, inclusive, (trimmed).</span>
     */
    public void setMessageBusinessName(java.lang.String messageBusinessName) {
        this.messageBusinessName = messageBusinessName;
    }


    /**
     * Gets the messageCountryCode value for this MessageFeedItem.
     * 
     * @return messageCountryCode   * Uppercase two-letter country code of the advertiser's phone
     * number to message.
     *                     <span class="constraint StringLength">This string
     * must not be empty, (trimmed).</span>
     */
    public java.lang.String getMessageCountryCode() {
        return messageCountryCode;
    }


    /**
     * Sets the messageCountryCode value for this MessageFeedItem.
     * 
     * @param messageCountryCode   * Uppercase two-letter country code of the advertiser's phone
     * number to message.
     *                     <span class="constraint StringLength">This string
     * must not be empty, (trimmed).</span>
     */
    public void setMessageCountryCode(java.lang.String messageCountryCode) {
        this.messageCountryCode = messageCountryCode;
    }


    /**
     * Gets the messagePhoneNumber value for this MessageFeedItem.
     * 
     * @return messagePhoneNumber   * The advertiser's phone number the message will be sent to.
     *                     <span class="constraint StringLength">This string
     * must not be empty, (trimmed).</span>
     */
    public java.lang.String getMessagePhoneNumber() {
        return messagePhoneNumber;
    }


    /**
     * Sets the messagePhoneNumber value for this MessageFeedItem.
     * 
     * @param messagePhoneNumber   * The advertiser's phone number the message will be sent to.
     *                     <span class="constraint StringLength">This string
     * must not be empty, (trimmed).</span>
     */
    public void setMessagePhoneNumber(java.lang.String messagePhoneNumber) {
        this.messagePhoneNumber = messagePhoneNumber;
    }


    /**
     * Gets the messageExtensionText value for this MessageFeedItem.
     * 
     * @return messageExtensionText   * The text to show in the ad.
     *                     <span class="constraint StringLength">The length
     * of this string should be between 5 and 35, inclusive, (trimmed).</span>
     */
    public java.lang.String getMessageExtensionText() {
        return messageExtensionText;
    }


    /**
     * Sets the messageExtensionText value for this MessageFeedItem.
     * 
     * @param messageExtensionText   * The text to show in the ad.
     *                     <span class="constraint StringLength">The length
     * of this string should be between 5 and 35, inclusive, (trimmed).</span>
     */
    public void setMessageExtensionText(java.lang.String messageExtensionText) {
        this.messageExtensionText = messageExtensionText;
    }


    /**
     * Gets the messageText value for this MessageFeedItem.
     * 
     * @return messageText   * The message text populated in the messaging app.
     *                     <span class="constraint StringLength">The length
     * of this string should be between 10 and 100, inclusive, (trimmed).</span>
     */
    public java.lang.String getMessageText() {
        return messageText;
    }


    /**
     * Sets the messageText value for this MessageFeedItem.
     * 
     * @param messageText   * The message text populated in the messaging app.
     *                     <span class="constraint StringLength">The length
     * of this string should be between 10 and 100, inclusive, (trimmed).</span>
     */
    public void setMessageText(java.lang.String messageText) {
        this.messageText = messageText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MessageFeedItem)) return false;
        MessageFeedItem other = (MessageFeedItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.messageBusinessName==null && other.getMessageBusinessName()==null) || 
             (this.messageBusinessName!=null &&
              this.messageBusinessName.equals(other.getMessageBusinessName()))) &&
            ((this.messageCountryCode==null && other.getMessageCountryCode()==null) || 
             (this.messageCountryCode!=null &&
              this.messageCountryCode.equals(other.getMessageCountryCode()))) &&
            ((this.messagePhoneNumber==null && other.getMessagePhoneNumber()==null) || 
             (this.messagePhoneNumber!=null &&
              this.messagePhoneNumber.equals(other.getMessagePhoneNumber()))) &&
            ((this.messageExtensionText==null && other.getMessageExtensionText()==null) || 
             (this.messageExtensionText!=null &&
              this.messageExtensionText.equals(other.getMessageExtensionText()))) &&
            ((this.messageText==null && other.getMessageText()==null) || 
             (this.messageText!=null &&
              this.messageText.equals(other.getMessageText())));
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
        if (getMessageBusinessName() != null) {
            _hashCode += getMessageBusinessName().hashCode();
        }
        if (getMessageCountryCode() != null) {
            _hashCode += getMessageCountryCode().hashCode();
        }
        if (getMessagePhoneNumber() != null) {
            _hashCode += getMessagePhoneNumber().hashCode();
        }
        if (getMessageExtensionText() != null) {
            _hashCode += getMessageExtensionText().hashCode();
        }
        if (getMessageText() != null) {
            _hashCode += getMessageText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MessageFeedItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "MessageFeedItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageBusinessName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "messageBusinessName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageCountryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "messageCountryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messagePhoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "messagePhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageExtensionText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "messageExtensionText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "messageText"));
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
