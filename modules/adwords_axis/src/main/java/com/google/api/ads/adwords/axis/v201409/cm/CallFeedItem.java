/**
 * CallFeedItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201409.cm;


/**
 * Represents a Call extension.
 */
public class CallFeedItem  extends com.google.api.ads.adwords.axis.v201409.cm.ExtensionFeedItem  implements java.io.Serializable {
    /* The advertiser's phone number to append to the ad.
     *                     <span class="constraint StringLength">This string
     * must not be empty.</span> */
    private java.lang.String callPhoneNumber;

    /* Uppercase two-letter country code of the advertiser's phone
     * number.
     *                     <span class="constraint StringLength">This string
     * must not be empty.</span> */
    private java.lang.String callCountryCode;

    /* Indicates whether call tracking is enabled. By default, call
     * tracking is not enabled. */
    private java.lang.Boolean callTracking;

    /* Indicates whether the ad is call only, where the phone number
     * is displayed and the URL is not.
     *                     By default, an ad is not call only. */
    private java.lang.Boolean callOnly;

    /* Call conversion type. To clear this field, set a CallConversionType
     * with a value of null in its
     *                     conversionTypeId field. */
    private com.google.api.ads.adwords.axis.v201409.cm.CallConversionType callConversionType;

    public CallFeedItem() {
    }

    public CallFeedItem(
           java.lang.Long feedId,
           java.lang.Long feedItemId,
           com.google.api.ads.adwords.axis.v201409.cm.FeedItemStatus status,
           com.google.api.ads.adwords.axis.v201409.cm.FeedType feedType,
           java.lang.String startTime,
           java.lang.String endTime,
           com.google.api.ads.adwords.axis.v201409.cm.FeedItemDevicePreference devicePreference,
           com.google.api.ads.adwords.axis.v201409.cm.FeedItemScheduling scheduling,
           java.lang.String extensionFeedItemType,
           java.lang.String callPhoneNumber,
           java.lang.String callCountryCode,
           java.lang.Boolean callTracking,
           java.lang.Boolean callOnly,
           com.google.api.ads.adwords.axis.v201409.cm.CallConversionType callConversionType) {
        super(
            feedId,
            feedItemId,
            status,
            feedType,
            startTime,
            endTime,
            devicePreference,
            scheduling,
            extensionFeedItemType);
        this.callPhoneNumber = callPhoneNumber;
        this.callCountryCode = callCountryCode;
        this.callTracking = callTracking;
        this.callOnly = callOnly;
        this.callConversionType = callConversionType;
    }


    /**
     * Gets the callPhoneNumber value for this CallFeedItem.
     * 
     * @return callPhoneNumber   * The advertiser's phone number to append to the ad.
     *                     <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public java.lang.String getCallPhoneNumber() {
        return callPhoneNumber;
    }


    /**
     * Sets the callPhoneNumber value for this CallFeedItem.
     * 
     * @param callPhoneNumber   * The advertiser's phone number to append to the ad.
     *                     <span class="constraint StringLength">This string
     * must not be empty.</span>
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
     * must not be empty.</span>
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
     * must not be empty.</span>
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
     * Gets the callOnly value for this CallFeedItem.
     * 
     * @return callOnly   * Indicates whether the ad is call only, where the phone number
     * is displayed and the URL is not.
     *                     By default, an ad is not call only.
     */
    public java.lang.Boolean getCallOnly() {
        return callOnly;
    }


    /**
     * Sets the callOnly value for this CallFeedItem.
     * 
     * @param callOnly   * Indicates whether the ad is call only, where the phone number
     * is displayed and the URL is not.
     *                     By default, an ad is not call only.
     */
    public void setCallOnly(java.lang.Boolean callOnly) {
        this.callOnly = callOnly;
    }


    /**
     * Gets the callConversionType value for this CallFeedItem.
     * 
     * @return callConversionType   * Call conversion type. To clear this field, set a CallConversionType
     * with a value of null in its
     *                     conversionTypeId field.
     */
    public com.google.api.ads.adwords.axis.v201409.cm.CallConversionType getCallConversionType() {
        return callConversionType;
    }


    /**
     * Sets the callConversionType value for this CallFeedItem.
     * 
     * @param callConversionType   * Call conversion type. To clear this field, set a CallConversionType
     * with a value of null in its
     *                     conversionTypeId field.
     */
    public void setCallConversionType(com.google.api.ads.adwords.axis.v201409.cm.CallConversionType callConversionType) {
        this.callConversionType = callConversionType;
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
            ((this.callOnly==null && other.getCallOnly()==null) || 
             (this.callOnly!=null &&
              this.callOnly.equals(other.getCallOnly()))) &&
            ((this.callConversionType==null && other.getCallConversionType()==null) || 
             (this.callConversionType!=null &&
              this.callConversionType.equals(other.getCallConversionType())));
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
        if (getCallOnly() != null) {
            _hashCode += getCallOnly().hashCode();
        }
        if (getCallConversionType() != null) {
            _hashCode += getCallConversionType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CallFeedItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "CallFeedItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callPhoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "callPhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callCountryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "callCountryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callTracking");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "callTracking"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "callOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callConversionType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "callConversionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "CallConversionType"));
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
