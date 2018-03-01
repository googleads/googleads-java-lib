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
 * ConversionTrackingErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class ConversionTrackingErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ConversionTrackingErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ALREADY_CREATED_CUSTOM_CONVERSION_TYPE = "ALREADY_CREATED_CUSTOM_CONVERSION_TYPE";
    public static final java.lang.String _ANALYTICS_NOT_ALLOWED = "ANALYTICS_NOT_ALLOWED";
    public static final java.lang.String _CANNOT_ADD_CONVERSION_TYPE_SUBCLASS = "CANNOT_ADD_CONVERSION_TYPE_SUBCLASS";
    public static final java.lang.String _CANNOT_ADD_EXTERNALLY_ATTRIBUTED_SALESFORCE_CONVERSION = "CANNOT_ADD_EXTERNALLY_ATTRIBUTED_SALESFORCE_CONVERSION";
    public static final java.lang.String _CANNOT_CHANGE_APP_CONVERSION_TYPE = "CANNOT_CHANGE_APP_CONVERSION_TYPE";
    public static final java.lang.String _CANNOT_CHANGE_APP_PLATFORM = "CANNOT_CHANGE_APP_PLATFORM";
    public static final java.lang.String _CANNNOT_CHANGE_CONVERSION_SUBCLASS = "CANNNOT_CHANGE_CONVERSION_SUBCLASS";
    public static final java.lang.String _CANNOT_SET_HIDDEN_STATUS = "CANNOT_SET_HIDDEN_STATUS";
    public static final java.lang.String _CATEGORY_IS_UNEDITABLE = "CATEGORY_IS_UNEDITABLE";
    public static final java.lang.String _ATTRIBUTION_MODEL_IS_UNEDITABLE = "ATTRIBUTION_MODEL_IS_UNEDITABLE";
    public static final java.lang.String _ATTRIBUTION_MODEL_CANNOT_BE_UNKNOWN = "ATTRIBUTION_MODEL_CANNOT_BE_UNKNOWN";
    public static final java.lang.String _DATA_DRIVEN_MODEL_WAS_NEVER_GENERATED = "DATA_DRIVEN_MODEL_WAS_NEVER_GENERATED";
    public static final java.lang.String _DATA_DRIVEN_MODEL_IS_EXPIRED = "DATA_DRIVEN_MODEL_IS_EXPIRED";
    public static final java.lang.String _DATA_DRIVEN_MODEL_IS_STALE = "DATA_DRIVEN_MODEL_IS_STALE";
    public static final java.lang.String _DATA_DRIVEN_MODEL_IS_UNKNOWN = "DATA_DRIVEN_MODEL_IS_UNKNOWN";
    public static final java.lang.String _CONVERSION_TYPE_NOT_FOUND = "CONVERSION_TYPE_NOT_FOUND";
    public static final java.lang.String _CTC_LOOKBACK_WINDOW_IS_UNEDITABLE = "CTC_LOOKBACK_WINDOW_IS_UNEDITABLE";
    public static final java.lang.String _DOMAIN_EXCEPTION = "DOMAIN_EXCEPTION";
    public static final java.lang.String _INCONSISTENT_COUNTING_TYPE = "INCONSISTENT_COUNTING_TYPE";
    public static final java.lang.String _DUPLICATE_APP_ID = "DUPLICATE_APP_ID";
    public static final java.lang.String _TWO_CONVERSION_TYPES_BIDDING_ON_SAME_APP_DOWNLOAD = "TWO_CONVERSION_TYPES_BIDDING_ON_SAME_APP_DOWNLOAD";
    public static final java.lang.String _CONVERSION_TYPE_BIDDING_ON_SAME_APP_DOWNLOAD_AS_GLOBAL_TYPE = "CONVERSION_TYPE_BIDDING_ON_SAME_APP_DOWNLOAD_AS_GLOBAL_TYPE";
    public static final java.lang.String _DUPLICATE_NAME = "DUPLICATE_NAME";
    public static final java.lang.String _EMAIL_FAILED = "EMAIL_FAILED";
    public static final java.lang.String _EXCEEDED_CONVERSION_TYPE_LIMIT = "EXCEEDED_CONVERSION_TYPE_LIMIT";
    public static final java.lang.String _ID_IS_NULL = "ID_IS_NULL";
    public static final java.lang.String _INVALID_APP_ID = "INVALID_APP_ID";
    public static final java.lang.String _CANNOT_SET_APP_ID = "CANNOT_SET_APP_ID";
    public static final java.lang.String _INVALID_CATEGORY = "INVALID_CATEGORY";
    public static final java.lang.String _INVALID_COLOR = "INVALID_COLOR";
    public static final java.lang.String _INVALID_DATE_RANGE = "INVALID_DATE_RANGE";
    public static final java.lang.String _INVALID_EMAIL_ADDRESS = "INVALID_EMAIL_ADDRESS";
    public static final java.lang.String _INVALID_ORIGINAL_CONVERSION_TYPE_ID = "INVALID_ORIGINAL_CONVERSION_TYPE_ID";
    public static final java.lang.String _MUST_SET_APP_PLATFORM_AND_APP_CONVERSION_TYPE_TOGETHER = "MUST_SET_APP_PLATFORM_AND_APP_CONVERSION_TYPE_TOGETHER";
    public static final java.lang.String _NAME_ALREADY_EXISTS = "NAME_ALREADY_EXISTS";
    public static final java.lang.String _NO_RECIPIENTS = "NO_RECIPIENTS";
    public static final java.lang.String _NO_SNIPPET = "NO_SNIPPET";
    public static final java.lang.String _TOO_MANY_WEBPAGES = "TOO_MANY_WEBPAGES";
    public static final java.lang.String _UNKNOWN_SORTING_TYPE = "UNKNOWN_SORTING_TYPE";
    public static final java.lang.String _UNSUPPORTED_APP_CONVERSION_TYPE = "UNSUPPORTED_APP_CONVERSION_TYPE";
    public static final ConversionTrackingErrorReason ALREADY_CREATED_CUSTOM_CONVERSION_TYPE = new ConversionTrackingErrorReason(_ALREADY_CREATED_CUSTOM_CONVERSION_TYPE);
    public static final ConversionTrackingErrorReason ANALYTICS_NOT_ALLOWED = new ConversionTrackingErrorReason(_ANALYTICS_NOT_ALLOWED);
    public static final ConversionTrackingErrorReason CANNOT_ADD_CONVERSION_TYPE_SUBCLASS = new ConversionTrackingErrorReason(_CANNOT_ADD_CONVERSION_TYPE_SUBCLASS);
    public static final ConversionTrackingErrorReason CANNOT_ADD_EXTERNALLY_ATTRIBUTED_SALESFORCE_CONVERSION = new ConversionTrackingErrorReason(_CANNOT_ADD_EXTERNALLY_ATTRIBUTED_SALESFORCE_CONVERSION);
    public static final ConversionTrackingErrorReason CANNOT_CHANGE_APP_CONVERSION_TYPE = new ConversionTrackingErrorReason(_CANNOT_CHANGE_APP_CONVERSION_TYPE);
    public static final ConversionTrackingErrorReason CANNOT_CHANGE_APP_PLATFORM = new ConversionTrackingErrorReason(_CANNOT_CHANGE_APP_PLATFORM);
    public static final ConversionTrackingErrorReason CANNNOT_CHANGE_CONVERSION_SUBCLASS = new ConversionTrackingErrorReason(_CANNNOT_CHANGE_CONVERSION_SUBCLASS);
    public static final ConversionTrackingErrorReason CANNOT_SET_HIDDEN_STATUS = new ConversionTrackingErrorReason(_CANNOT_SET_HIDDEN_STATUS);
    public static final ConversionTrackingErrorReason CATEGORY_IS_UNEDITABLE = new ConversionTrackingErrorReason(_CATEGORY_IS_UNEDITABLE);
    public static final ConversionTrackingErrorReason ATTRIBUTION_MODEL_IS_UNEDITABLE = new ConversionTrackingErrorReason(_ATTRIBUTION_MODEL_IS_UNEDITABLE);
    public static final ConversionTrackingErrorReason ATTRIBUTION_MODEL_CANNOT_BE_UNKNOWN = new ConversionTrackingErrorReason(_ATTRIBUTION_MODEL_CANNOT_BE_UNKNOWN);
    public static final ConversionTrackingErrorReason DATA_DRIVEN_MODEL_WAS_NEVER_GENERATED = new ConversionTrackingErrorReason(_DATA_DRIVEN_MODEL_WAS_NEVER_GENERATED);
    public static final ConversionTrackingErrorReason DATA_DRIVEN_MODEL_IS_EXPIRED = new ConversionTrackingErrorReason(_DATA_DRIVEN_MODEL_IS_EXPIRED);
    public static final ConversionTrackingErrorReason DATA_DRIVEN_MODEL_IS_STALE = new ConversionTrackingErrorReason(_DATA_DRIVEN_MODEL_IS_STALE);
    public static final ConversionTrackingErrorReason DATA_DRIVEN_MODEL_IS_UNKNOWN = new ConversionTrackingErrorReason(_DATA_DRIVEN_MODEL_IS_UNKNOWN);
    public static final ConversionTrackingErrorReason CONVERSION_TYPE_NOT_FOUND = new ConversionTrackingErrorReason(_CONVERSION_TYPE_NOT_FOUND);
    public static final ConversionTrackingErrorReason CTC_LOOKBACK_WINDOW_IS_UNEDITABLE = new ConversionTrackingErrorReason(_CTC_LOOKBACK_WINDOW_IS_UNEDITABLE);
    public static final ConversionTrackingErrorReason DOMAIN_EXCEPTION = new ConversionTrackingErrorReason(_DOMAIN_EXCEPTION);
    public static final ConversionTrackingErrorReason INCONSISTENT_COUNTING_TYPE = new ConversionTrackingErrorReason(_INCONSISTENT_COUNTING_TYPE);
    public static final ConversionTrackingErrorReason DUPLICATE_APP_ID = new ConversionTrackingErrorReason(_DUPLICATE_APP_ID);
    public static final ConversionTrackingErrorReason TWO_CONVERSION_TYPES_BIDDING_ON_SAME_APP_DOWNLOAD = new ConversionTrackingErrorReason(_TWO_CONVERSION_TYPES_BIDDING_ON_SAME_APP_DOWNLOAD);
    public static final ConversionTrackingErrorReason CONVERSION_TYPE_BIDDING_ON_SAME_APP_DOWNLOAD_AS_GLOBAL_TYPE = new ConversionTrackingErrorReason(_CONVERSION_TYPE_BIDDING_ON_SAME_APP_DOWNLOAD_AS_GLOBAL_TYPE);
    public static final ConversionTrackingErrorReason DUPLICATE_NAME = new ConversionTrackingErrorReason(_DUPLICATE_NAME);
    public static final ConversionTrackingErrorReason EMAIL_FAILED = new ConversionTrackingErrorReason(_EMAIL_FAILED);
    public static final ConversionTrackingErrorReason EXCEEDED_CONVERSION_TYPE_LIMIT = new ConversionTrackingErrorReason(_EXCEEDED_CONVERSION_TYPE_LIMIT);
    public static final ConversionTrackingErrorReason ID_IS_NULL = new ConversionTrackingErrorReason(_ID_IS_NULL);
    public static final ConversionTrackingErrorReason INVALID_APP_ID = new ConversionTrackingErrorReason(_INVALID_APP_ID);
    public static final ConversionTrackingErrorReason CANNOT_SET_APP_ID = new ConversionTrackingErrorReason(_CANNOT_SET_APP_ID);
    public static final ConversionTrackingErrorReason INVALID_CATEGORY = new ConversionTrackingErrorReason(_INVALID_CATEGORY);
    public static final ConversionTrackingErrorReason INVALID_COLOR = new ConversionTrackingErrorReason(_INVALID_COLOR);
    public static final ConversionTrackingErrorReason INVALID_DATE_RANGE = new ConversionTrackingErrorReason(_INVALID_DATE_RANGE);
    public static final ConversionTrackingErrorReason INVALID_EMAIL_ADDRESS = new ConversionTrackingErrorReason(_INVALID_EMAIL_ADDRESS);
    public static final ConversionTrackingErrorReason INVALID_ORIGINAL_CONVERSION_TYPE_ID = new ConversionTrackingErrorReason(_INVALID_ORIGINAL_CONVERSION_TYPE_ID);
    public static final ConversionTrackingErrorReason MUST_SET_APP_PLATFORM_AND_APP_CONVERSION_TYPE_TOGETHER = new ConversionTrackingErrorReason(_MUST_SET_APP_PLATFORM_AND_APP_CONVERSION_TYPE_TOGETHER);
    public static final ConversionTrackingErrorReason NAME_ALREADY_EXISTS = new ConversionTrackingErrorReason(_NAME_ALREADY_EXISTS);
    public static final ConversionTrackingErrorReason NO_RECIPIENTS = new ConversionTrackingErrorReason(_NO_RECIPIENTS);
    public static final ConversionTrackingErrorReason NO_SNIPPET = new ConversionTrackingErrorReason(_NO_SNIPPET);
    public static final ConversionTrackingErrorReason TOO_MANY_WEBPAGES = new ConversionTrackingErrorReason(_TOO_MANY_WEBPAGES);
    public static final ConversionTrackingErrorReason UNKNOWN_SORTING_TYPE = new ConversionTrackingErrorReason(_UNKNOWN_SORTING_TYPE);
    public static final ConversionTrackingErrorReason UNSUPPORTED_APP_CONVERSION_TYPE = new ConversionTrackingErrorReason(_UNSUPPORTED_APP_CONVERSION_TYPE);
    public java.lang.String getValue() { return _value_;}
    public static ConversionTrackingErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ConversionTrackingErrorReason enumeration = (ConversionTrackingErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ConversionTrackingErrorReason fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConversionTrackingErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ConversionTrackingError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
