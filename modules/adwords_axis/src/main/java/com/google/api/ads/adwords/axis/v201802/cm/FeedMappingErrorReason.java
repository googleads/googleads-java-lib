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
 * FeedMappingErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class FeedMappingErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FeedMappingErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_PLACEHOLDER_FIELD = "INVALID_PLACEHOLDER_FIELD";
    public static final java.lang.String _INVALID_CRITERION_FIELD = "INVALID_CRITERION_FIELD";
    public static final java.lang.String _INVALID_PLACEHOLDER_TYPE = "INVALID_PLACEHOLDER_TYPE";
    public static final java.lang.String _INVALID_CRITERION_TYPE = "INVALID_CRITERION_TYPE";
    public static final java.lang.String _CANNOT_SET_PLACEHOLDER_TYPE_AND_CRITERION_TYPE = "CANNOT_SET_PLACEHOLDER_TYPE_AND_CRITERION_TYPE";
    public static final java.lang.String _NO_ATTRIBUTE_FIELD_MAPPINGS = "NO_ATTRIBUTE_FIELD_MAPPINGS";
    public static final java.lang.String _FEED_ATTRIBUTE_TYPE_MISMATCH = "FEED_ATTRIBUTE_TYPE_MISMATCH";
    public static final java.lang.String _CANNOT_OPERATE_ON_MAPPINGS_FOR_SYSTEM_GENERATED_FEED = "CANNOT_OPERATE_ON_MAPPINGS_FOR_SYSTEM_GENERATED_FEED";
    public static final java.lang.String _MULTIPLE_MAPPINGS_FOR_PLACEHOLDER_TYPE = "MULTIPLE_MAPPINGS_FOR_PLACEHOLDER_TYPE";
    public static final java.lang.String _MULTIPLE_MAPPINGS_FOR_CRITERION_TYPE = "MULTIPLE_MAPPINGS_FOR_CRITERION_TYPE";
    public static final java.lang.String _MULTIPLE_MAPPINGS_FOR_PLACEHOLDER_FIELD = "MULTIPLE_MAPPINGS_FOR_PLACEHOLDER_FIELD";
    public static final java.lang.String _MULTIPLE_MAPPINGS_FOR_CRITERION_FIELD = "MULTIPLE_MAPPINGS_FOR_CRITERION_FIELD";
    public static final java.lang.String _UNEXPECTED_ATTRIBUTE_FIELD_MAPPINGS = "UNEXPECTED_ATTRIBUTE_FIELD_MAPPINGS";
    public static final java.lang.String _LOCATION_PLACEHOLDER_ONLY_FOR_PLACES_FEEDS = "LOCATION_PLACEHOLDER_ONLY_FOR_PLACES_FEEDS";
    public static final java.lang.String _CANNOT_MODIFY_MAPPINGS_FOR_TYPED_FEED = "CANNOT_MODIFY_MAPPINGS_FOR_TYPED_FEED";
    public static final java.lang.String _INVALID_PLACEHOLDER_TYPE_FOR_NON_SYSTEM_GENERATED_FEED = "INVALID_PLACEHOLDER_TYPE_FOR_NON_SYSTEM_GENERATED_FEED";
    public static final java.lang.String _INVALID_PLACEHOLDER_TYPE_FOR_SYSTEM_GENERATED_FEED_TYPE = "INVALID_PLACEHOLDER_TYPE_FOR_SYSTEM_GENERATED_FEED_TYPE";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final FeedMappingErrorReason INVALID_PLACEHOLDER_FIELD = new FeedMappingErrorReason(_INVALID_PLACEHOLDER_FIELD);
    public static final FeedMappingErrorReason INVALID_CRITERION_FIELD = new FeedMappingErrorReason(_INVALID_CRITERION_FIELD);
    public static final FeedMappingErrorReason INVALID_PLACEHOLDER_TYPE = new FeedMappingErrorReason(_INVALID_PLACEHOLDER_TYPE);
    public static final FeedMappingErrorReason INVALID_CRITERION_TYPE = new FeedMappingErrorReason(_INVALID_CRITERION_TYPE);
    public static final FeedMappingErrorReason CANNOT_SET_PLACEHOLDER_TYPE_AND_CRITERION_TYPE = new FeedMappingErrorReason(_CANNOT_SET_PLACEHOLDER_TYPE_AND_CRITERION_TYPE);
    public static final FeedMappingErrorReason NO_ATTRIBUTE_FIELD_MAPPINGS = new FeedMappingErrorReason(_NO_ATTRIBUTE_FIELD_MAPPINGS);
    public static final FeedMappingErrorReason FEED_ATTRIBUTE_TYPE_MISMATCH = new FeedMappingErrorReason(_FEED_ATTRIBUTE_TYPE_MISMATCH);
    public static final FeedMappingErrorReason CANNOT_OPERATE_ON_MAPPINGS_FOR_SYSTEM_GENERATED_FEED = new FeedMappingErrorReason(_CANNOT_OPERATE_ON_MAPPINGS_FOR_SYSTEM_GENERATED_FEED);
    public static final FeedMappingErrorReason MULTIPLE_MAPPINGS_FOR_PLACEHOLDER_TYPE = new FeedMappingErrorReason(_MULTIPLE_MAPPINGS_FOR_PLACEHOLDER_TYPE);
    public static final FeedMappingErrorReason MULTIPLE_MAPPINGS_FOR_CRITERION_TYPE = new FeedMappingErrorReason(_MULTIPLE_MAPPINGS_FOR_CRITERION_TYPE);
    public static final FeedMappingErrorReason MULTIPLE_MAPPINGS_FOR_PLACEHOLDER_FIELD = new FeedMappingErrorReason(_MULTIPLE_MAPPINGS_FOR_PLACEHOLDER_FIELD);
    public static final FeedMappingErrorReason MULTIPLE_MAPPINGS_FOR_CRITERION_FIELD = new FeedMappingErrorReason(_MULTIPLE_MAPPINGS_FOR_CRITERION_FIELD);
    public static final FeedMappingErrorReason UNEXPECTED_ATTRIBUTE_FIELD_MAPPINGS = new FeedMappingErrorReason(_UNEXPECTED_ATTRIBUTE_FIELD_MAPPINGS);
    public static final FeedMappingErrorReason LOCATION_PLACEHOLDER_ONLY_FOR_PLACES_FEEDS = new FeedMappingErrorReason(_LOCATION_PLACEHOLDER_ONLY_FOR_PLACES_FEEDS);
    public static final FeedMappingErrorReason CANNOT_MODIFY_MAPPINGS_FOR_TYPED_FEED = new FeedMappingErrorReason(_CANNOT_MODIFY_MAPPINGS_FOR_TYPED_FEED);
    public static final FeedMappingErrorReason INVALID_PLACEHOLDER_TYPE_FOR_NON_SYSTEM_GENERATED_FEED = new FeedMappingErrorReason(_INVALID_PLACEHOLDER_TYPE_FOR_NON_SYSTEM_GENERATED_FEED);
    public static final FeedMappingErrorReason INVALID_PLACEHOLDER_TYPE_FOR_SYSTEM_GENERATED_FEED_TYPE = new FeedMappingErrorReason(_INVALID_PLACEHOLDER_TYPE_FOR_SYSTEM_GENERATED_FEED_TYPE);
    public static final FeedMappingErrorReason UNKNOWN = new FeedMappingErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static FeedMappingErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FeedMappingErrorReason enumeration = (FeedMappingErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FeedMappingErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FeedMappingErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedMappingError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
