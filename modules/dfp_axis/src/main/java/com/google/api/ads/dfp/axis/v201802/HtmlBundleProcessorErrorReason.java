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
 * HtmlBundleProcessorErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class HtmlBundleProcessorErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected HtmlBundleProcessorErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CANNOT_EXTRACT_FILES_FROM_BUNDLE = "CANNOT_EXTRACT_FILES_FROM_BUNDLE";
    public static final java.lang.String _CLICK_TAG_HARD_CODED = "CLICK_TAG_HARD_CODED";
    public static final java.lang.String _CLICK_TAG_IN_GWD_UNUPPORTED = "CLICK_TAG_IN_GWD_UNUPPORTED";
    public static final java.lang.String _CLICK_TAG_NOT_IN_PRIMARY_HTML = "CLICK_TAG_NOT_IN_PRIMARY_HTML";
    public static final java.lang.String _CLICK_TAG_INVALID = "CLICK_TAG_INVALID";
    public static final java.lang.String _FILE_SIZE_TOO_LARGE = "FILE_SIZE_TOO_LARGE";
    public static final java.lang.String _FILES_TOO_MANY = "FILES_TOO_MANY";
    public static final java.lang.String _FLASH_UNSUPPORTED = "FLASH_UNSUPPORTED";
    public static final java.lang.String _GWD_COMPONENTS_UNSUPPORTED = "GWD_COMPONENTS_UNSUPPORTED";
    public static final java.lang.String _GWD_ENABLER_METHODS_UNSUPPORTED = "GWD_ENABLER_METHODS_UNSUPPORTED";
    public static final java.lang.String _GWD_PROPERTIES_INVALID = "GWD_PROPERTIES_INVALID";
    public static final java.lang.String _LINKED_FILES_NOT_FOUND = "LINKED_FILES_NOT_FOUND";
    public static final java.lang.String _PRIMARY_HTML_MISSING = "PRIMARY_HTML_MISSING";
    public static final java.lang.String _PRIMARY_HTML_UNDETERMINED = "PRIMARY_HTML_UNDETERMINED";
    public static final java.lang.String _SVG_BLOCK_INVALID = "SVG_BLOCK_INVALID";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final HtmlBundleProcessorErrorReason CANNOT_EXTRACT_FILES_FROM_BUNDLE = new HtmlBundleProcessorErrorReason(_CANNOT_EXTRACT_FILES_FROM_BUNDLE);
    public static final HtmlBundleProcessorErrorReason CLICK_TAG_HARD_CODED = new HtmlBundleProcessorErrorReason(_CLICK_TAG_HARD_CODED);
    public static final HtmlBundleProcessorErrorReason CLICK_TAG_IN_GWD_UNUPPORTED = new HtmlBundleProcessorErrorReason(_CLICK_TAG_IN_GWD_UNUPPORTED);
    public static final HtmlBundleProcessorErrorReason CLICK_TAG_NOT_IN_PRIMARY_HTML = new HtmlBundleProcessorErrorReason(_CLICK_TAG_NOT_IN_PRIMARY_HTML);
    public static final HtmlBundleProcessorErrorReason CLICK_TAG_INVALID = new HtmlBundleProcessorErrorReason(_CLICK_TAG_INVALID);
    public static final HtmlBundleProcessorErrorReason FILE_SIZE_TOO_LARGE = new HtmlBundleProcessorErrorReason(_FILE_SIZE_TOO_LARGE);
    public static final HtmlBundleProcessorErrorReason FILES_TOO_MANY = new HtmlBundleProcessorErrorReason(_FILES_TOO_MANY);
    public static final HtmlBundleProcessorErrorReason FLASH_UNSUPPORTED = new HtmlBundleProcessorErrorReason(_FLASH_UNSUPPORTED);
    public static final HtmlBundleProcessorErrorReason GWD_COMPONENTS_UNSUPPORTED = new HtmlBundleProcessorErrorReason(_GWD_COMPONENTS_UNSUPPORTED);
    public static final HtmlBundleProcessorErrorReason GWD_ENABLER_METHODS_UNSUPPORTED = new HtmlBundleProcessorErrorReason(_GWD_ENABLER_METHODS_UNSUPPORTED);
    public static final HtmlBundleProcessorErrorReason GWD_PROPERTIES_INVALID = new HtmlBundleProcessorErrorReason(_GWD_PROPERTIES_INVALID);
    public static final HtmlBundleProcessorErrorReason LINKED_FILES_NOT_FOUND = new HtmlBundleProcessorErrorReason(_LINKED_FILES_NOT_FOUND);
    public static final HtmlBundleProcessorErrorReason PRIMARY_HTML_MISSING = new HtmlBundleProcessorErrorReason(_PRIMARY_HTML_MISSING);
    public static final HtmlBundleProcessorErrorReason PRIMARY_HTML_UNDETERMINED = new HtmlBundleProcessorErrorReason(_PRIMARY_HTML_UNDETERMINED);
    public static final HtmlBundleProcessorErrorReason SVG_BLOCK_INVALID = new HtmlBundleProcessorErrorReason(_SVG_BLOCK_INVALID);
    public static final HtmlBundleProcessorErrorReason UNKNOWN = new HtmlBundleProcessorErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static HtmlBundleProcessorErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        HtmlBundleProcessorErrorReason enumeration = (HtmlBundleProcessorErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static HtmlBundleProcessorErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(HtmlBundleProcessorErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "HtmlBundleProcessorError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
