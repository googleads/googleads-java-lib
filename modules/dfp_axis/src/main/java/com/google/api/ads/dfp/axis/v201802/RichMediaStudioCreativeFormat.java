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
 * RichMediaStudioCreativeFormat.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class RichMediaStudioCreativeFormat implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected RichMediaStudioCreativeFormat(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _IN_PAGE = "IN_PAGE";
    public static final java.lang.String _EXPANDING = "EXPANDING";
    public static final java.lang.String _IM_EXPANDING = "IM_EXPANDING";
    public static final java.lang.String _FLOATING = "FLOATING";
    public static final java.lang.String _PEEL_DOWN = "PEEL_DOWN";
    public static final java.lang.String _IN_PAGE_WITH_FLOATING = "IN_PAGE_WITH_FLOATING";
    public static final java.lang.String _FLASH_IN_FLASH = "FLASH_IN_FLASH";
    public static final java.lang.String _FLASH_IN_FLASH_EXPANDING = "FLASH_IN_FLASH_EXPANDING";
    public static final java.lang.String _IN_APP = "IN_APP";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final RichMediaStudioCreativeFormat IN_PAGE = new RichMediaStudioCreativeFormat(_IN_PAGE);
    public static final RichMediaStudioCreativeFormat EXPANDING = new RichMediaStudioCreativeFormat(_EXPANDING);
    public static final RichMediaStudioCreativeFormat IM_EXPANDING = new RichMediaStudioCreativeFormat(_IM_EXPANDING);
    public static final RichMediaStudioCreativeFormat FLOATING = new RichMediaStudioCreativeFormat(_FLOATING);
    public static final RichMediaStudioCreativeFormat PEEL_DOWN = new RichMediaStudioCreativeFormat(_PEEL_DOWN);
    public static final RichMediaStudioCreativeFormat IN_PAGE_WITH_FLOATING = new RichMediaStudioCreativeFormat(_IN_PAGE_WITH_FLOATING);
    public static final RichMediaStudioCreativeFormat FLASH_IN_FLASH = new RichMediaStudioCreativeFormat(_FLASH_IN_FLASH);
    public static final RichMediaStudioCreativeFormat FLASH_IN_FLASH_EXPANDING = new RichMediaStudioCreativeFormat(_FLASH_IN_FLASH_EXPANDING);
    public static final RichMediaStudioCreativeFormat IN_APP = new RichMediaStudioCreativeFormat(_IN_APP);
    public static final RichMediaStudioCreativeFormat UNKNOWN = new RichMediaStudioCreativeFormat(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static RichMediaStudioCreativeFormat fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        RichMediaStudioCreativeFormat enumeration = (RichMediaStudioCreativeFormat)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static RichMediaStudioCreativeFormat fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(RichMediaStudioCreativeFormat.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "RichMediaStudioCreativeFormat"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
