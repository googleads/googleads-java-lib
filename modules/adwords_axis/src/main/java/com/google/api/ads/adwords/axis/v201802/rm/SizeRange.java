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
 * SizeRange.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.rm;

public class SizeRange implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SizeRange(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _LESS_THAN_FIVE_HUNDRED = "LESS_THAN_FIVE_HUNDRED";
    public static final java.lang.String _LESS_THAN_ONE_THOUSAND = "LESS_THAN_ONE_THOUSAND";
    public static final java.lang.String _ONE_THOUSAND_TO_TEN_THOUSAND = "ONE_THOUSAND_TO_TEN_THOUSAND";
    public static final java.lang.String _TEN_THOUSAND_TO_FIFTY_THOUSAND = "TEN_THOUSAND_TO_FIFTY_THOUSAND";
    public static final java.lang.String _FIFTY_THOUSAND_TO_ONE_HUNDRED_THOUSAND = "FIFTY_THOUSAND_TO_ONE_HUNDRED_THOUSAND";
    public static final java.lang.String _ONE_HUNDRED_THOUSAND_TO_THREE_HUNDRED_THOUSAND = "ONE_HUNDRED_THOUSAND_TO_THREE_HUNDRED_THOUSAND";
    public static final java.lang.String _THREE_HUNDRED_THOUSAND_TO_FIVE_HUNDRED_THOUSAND = "THREE_HUNDRED_THOUSAND_TO_FIVE_HUNDRED_THOUSAND";
    public static final java.lang.String _FIVE_HUNDRED_THOUSAND_TO_ONE_MILLION = "FIVE_HUNDRED_THOUSAND_TO_ONE_MILLION";
    public static final java.lang.String _ONE_MILLION_TO_TWO_MILLION = "ONE_MILLION_TO_TWO_MILLION";
    public static final java.lang.String _TWO_MILLION_TO_THREE_MILLION = "TWO_MILLION_TO_THREE_MILLION";
    public static final java.lang.String _THREE_MILLION_TO_FIVE_MILLION = "THREE_MILLION_TO_FIVE_MILLION";
    public static final java.lang.String _FIVE_MILLION_TO_TEN_MILLION = "FIVE_MILLION_TO_TEN_MILLION";
    public static final java.lang.String _TEN_MILLION_TO_TWENTY_MILLION = "TEN_MILLION_TO_TWENTY_MILLION";
    public static final java.lang.String _TWENTY_MILLION_TO_THIRTY_MILLION = "TWENTY_MILLION_TO_THIRTY_MILLION";
    public static final java.lang.String _THIRTY_MILLION_TO_FIFTY_MILLION = "THIRTY_MILLION_TO_FIFTY_MILLION";
    public static final java.lang.String _OVER_FIFTY_MILLION = "OVER_FIFTY_MILLION";
    public static final SizeRange LESS_THAN_FIVE_HUNDRED = new SizeRange(_LESS_THAN_FIVE_HUNDRED);
    public static final SizeRange LESS_THAN_ONE_THOUSAND = new SizeRange(_LESS_THAN_ONE_THOUSAND);
    public static final SizeRange ONE_THOUSAND_TO_TEN_THOUSAND = new SizeRange(_ONE_THOUSAND_TO_TEN_THOUSAND);
    public static final SizeRange TEN_THOUSAND_TO_FIFTY_THOUSAND = new SizeRange(_TEN_THOUSAND_TO_FIFTY_THOUSAND);
    public static final SizeRange FIFTY_THOUSAND_TO_ONE_HUNDRED_THOUSAND = new SizeRange(_FIFTY_THOUSAND_TO_ONE_HUNDRED_THOUSAND);
    public static final SizeRange ONE_HUNDRED_THOUSAND_TO_THREE_HUNDRED_THOUSAND = new SizeRange(_ONE_HUNDRED_THOUSAND_TO_THREE_HUNDRED_THOUSAND);
    public static final SizeRange THREE_HUNDRED_THOUSAND_TO_FIVE_HUNDRED_THOUSAND = new SizeRange(_THREE_HUNDRED_THOUSAND_TO_FIVE_HUNDRED_THOUSAND);
    public static final SizeRange FIVE_HUNDRED_THOUSAND_TO_ONE_MILLION = new SizeRange(_FIVE_HUNDRED_THOUSAND_TO_ONE_MILLION);
    public static final SizeRange ONE_MILLION_TO_TWO_MILLION = new SizeRange(_ONE_MILLION_TO_TWO_MILLION);
    public static final SizeRange TWO_MILLION_TO_THREE_MILLION = new SizeRange(_TWO_MILLION_TO_THREE_MILLION);
    public static final SizeRange THREE_MILLION_TO_FIVE_MILLION = new SizeRange(_THREE_MILLION_TO_FIVE_MILLION);
    public static final SizeRange FIVE_MILLION_TO_TEN_MILLION = new SizeRange(_FIVE_MILLION_TO_TEN_MILLION);
    public static final SizeRange TEN_MILLION_TO_TWENTY_MILLION = new SizeRange(_TEN_MILLION_TO_TWENTY_MILLION);
    public static final SizeRange TWENTY_MILLION_TO_THIRTY_MILLION = new SizeRange(_TWENTY_MILLION_TO_THIRTY_MILLION);
    public static final SizeRange THIRTY_MILLION_TO_FIFTY_MILLION = new SizeRange(_THIRTY_MILLION_TO_FIFTY_MILLION);
    public static final SizeRange OVER_FIFTY_MILLION = new SizeRange(_OVER_FIFTY_MILLION);
    public java.lang.String getValue() { return _value_;}
    public static SizeRange fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SizeRange enumeration = (SizeRange)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SizeRange fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SizeRange.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "SizeRange"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
