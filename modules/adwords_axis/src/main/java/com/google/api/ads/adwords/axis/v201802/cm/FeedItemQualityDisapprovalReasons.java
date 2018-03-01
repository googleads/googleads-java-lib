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
 * FeedItemQualityDisapprovalReasons.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class FeedItemQualityDisapprovalReasons implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FeedItemQualityDisapprovalReasons(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _TABLE_REPETITIVE_HEADERS = "TABLE_REPETITIVE_HEADERS";
    public static final java.lang.String _TABLE_REPETITIVE_DESCRIPTION = "TABLE_REPETITIVE_DESCRIPTION";
    public static final java.lang.String _TABLE_INCONSISTENT_ROWS = "TABLE_INCONSISTENT_ROWS";
    public static final java.lang.String _DESCRIPTION_HAS_PRICE_QUALIFIERS = "DESCRIPTION_HAS_PRICE_QUALIFIERS";
    public static final java.lang.String _UNSUPPORTED_LANGUAGE = "UNSUPPORTED_LANGUAGE";
    public static final java.lang.String _TABLE_ROW_HEADER_TABLE_TYPE_MISMATCH = "TABLE_ROW_HEADER_TABLE_TYPE_MISMATCH";
    public static final java.lang.String _TABLE_ROW_HEADER_HAS_PROMOTIONAL_TEXT = "TABLE_ROW_HEADER_HAS_PROMOTIONAL_TEXT";
    public static final java.lang.String _TABLE_ROW_DESCRIPTION_NOT_RELEVANT = "TABLE_ROW_DESCRIPTION_NOT_RELEVANT";
    public static final java.lang.String _TABLE_ROW_DESCRIPTION_HAS_PROMOTIONAL_TEXT = "TABLE_ROW_DESCRIPTION_HAS_PROMOTIONAL_TEXT";
    public static final java.lang.String _TABLE_ROW_HEADER_DESCRIPTION_REPETITIVE = "TABLE_ROW_HEADER_DESCRIPTION_REPETITIVE";
    public static final java.lang.String _TABLE_ROW_UNRATEABLE = "TABLE_ROW_UNRATEABLE";
    public static final java.lang.String _TABLE_ROW_PRICE_INVALID = "TABLE_ROW_PRICE_INVALID";
    public static final java.lang.String _TABLE_ROW_URL_INVALID = "TABLE_ROW_URL_INVALID";
    public static final java.lang.String _HEADER_OR_DESCRIPTION_HAS_PRICE = "HEADER_OR_DESCRIPTION_HAS_PRICE";
    public static final java.lang.String _STRUCTURED_SNIPPETS_HEADER_POLICY_VIOLATED = "STRUCTURED_SNIPPETS_HEADER_POLICY_VIOLATED";
    public static final java.lang.String _STRUCTURED_SNIPPETS_REPEATED_VALUES = "STRUCTURED_SNIPPETS_REPEATED_VALUES";
    public static final java.lang.String _STRUCTURED_SNIPPETS_EDITORIAL_GUIDELINES = "STRUCTURED_SNIPPETS_EDITORIAL_GUIDELINES";
    public static final java.lang.String _STRUCTURED_SNIPPETS_HAS_PROMOTIONAL_TEXT = "STRUCTURED_SNIPPETS_HAS_PROMOTIONAL_TEXT";
    public static final FeedItemQualityDisapprovalReasons UNKNOWN = new FeedItemQualityDisapprovalReasons(_UNKNOWN);
    public static final FeedItemQualityDisapprovalReasons TABLE_REPETITIVE_HEADERS = new FeedItemQualityDisapprovalReasons(_TABLE_REPETITIVE_HEADERS);
    public static final FeedItemQualityDisapprovalReasons TABLE_REPETITIVE_DESCRIPTION = new FeedItemQualityDisapprovalReasons(_TABLE_REPETITIVE_DESCRIPTION);
    public static final FeedItemQualityDisapprovalReasons TABLE_INCONSISTENT_ROWS = new FeedItemQualityDisapprovalReasons(_TABLE_INCONSISTENT_ROWS);
    public static final FeedItemQualityDisapprovalReasons DESCRIPTION_HAS_PRICE_QUALIFIERS = new FeedItemQualityDisapprovalReasons(_DESCRIPTION_HAS_PRICE_QUALIFIERS);
    public static final FeedItemQualityDisapprovalReasons UNSUPPORTED_LANGUAGE = new FeedItemQualityDisapprovalReasons(_UNSUPPORTED_LANGUAGE);
    public static final FeedItemQualityDisapprovalReasons TABLE_ROW_HEADER_TABLE_TYPE_MISMATCH = new FeedItemQualityDisapprovalReasons(_TABLE_ROW_HEADER_TABLE_TYPE_MISMATCH);
    public static final FeedItemQualityDisapprovalReasons TABLE_ROW_HEADER_HAS_PROMOTIONAL_TEXT = new FeedItemQualityDisapprovalReasons(_TABLE_ROW_HEADER_HAS_PROMOTIONAL_TEXT);
    public static final FeedItemQualityDisapprovalReasons TABLE_ROW_DESCRIPTION_NOT_RELEVANT = new FeedItemQualityDisapprovalReasons(_TABLE_ROW_DESCRIPTION_NOT_RELEVANT);
    public static final FeedItemQualityDisapprovalReasons TABLE_ROW_DESCRIPTION_HAS_PROMOTIONAL_TEXT = new FeedItemQualityDisapprovalReasons(_TABLE_ROW_DESCRIPTION_HAS_PROMOTIONAL_TEXT);
    public static final FeedItemQualityDisapprovalReasons TABLE_ROW_HEADER_DESCRIPTION_REPETITIVE = new FeedItemQualityDisapprovalReasons(_TABLE_ROW_HEADER_DESCRIPTION_REPETITIVE);
    public static final FeedItemQualityDisapprovalReasons TABLE_ROW_UNRATEABLE = new FeedItemQualityDisapprovalReasons(_TABLE_ROW_UNRATEABLE);
    public static final FeedItemQualityDisapprovalReasons TABLE_ROW_PRICE_INVALID = new FeedItemQualityDisapprovalReasons(_TABLE_ROW_PRICE_INVALID);
    public static final FeedItemQualityDisapprovalReasons TABLE_ROW_URL_INVALID = new FeedItemQualityDisapprovalReasons(_TABLE_ROW_URL_INVALID);
    public static final FeedItemQualityDisapprovalReasons HEADER_OR_DESCRIPTION_HAS_PRICE = new FeedItemQualityDisapprovalReasons(_HEADER_OR_DESCRIPTION_HAS_PRICE);
    public static final FeedItemQualityDisapprovalReasons STRUCTURED_SNIPPETS_HEADER_POLICY_VIOLATED = new FeedItemQualityDisapprovalReasons(_STRUCTURED_SNIPPETS_HEADER_POLICY_VIOLATED);
    public static final FeedItemQualityDisapprovalReasons STRUCTURED_SNIPPETS_REPEATED_VALUES = new FeedItemQualityDisapprovalReasons(_STRUCTURED_SNIPPETS_REPEATED_VALUES);
    public static final FeedItemQualityDisapprovalReasons STRUCTURED_SNIPPETS_EDITORIAL_GUIDELINES = new FeedItemQualityDisapprovalReasons(_STRUCTURED_SNIPPETS_EDITORIAL_GUIDELINES);
    public static final FeedItemQualityDisapprovalReasons STRUCTURED_SNIPPETS_HAS_PROMOTIONAL_TEXT = new FeedItemQualityDisapprovalReasons(_STRUCTURED_SNIPPETS_HAS_PROMOTIONAL_TEXT);
    public java.lang.String getValue() { return _value_;}
    public static FeedItemQualityDisapprovalReasons fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FeedItemQualityDisapprovalReasons enumeration = (FeedItemQualityDisapprovalReasons)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FeedItemQualityDisapprovalReasons fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FeedItemQualityDisapprovalReasons.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemQualityDisapprovalReasons"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
