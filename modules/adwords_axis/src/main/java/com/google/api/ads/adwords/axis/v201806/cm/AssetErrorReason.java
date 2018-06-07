// Copyright 2018 Google LLC
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
 * AssetErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201806.cm;

public class AssetErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AssetErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _ASSET_TYPE_NOT_SUPPORTED = "ASSET_TYPE_NOT_SUPPORTED";
    public static final java.lang.String _CANNOT_REMOVE_ASSET_WITH_REMOVED_STATUS = "CANNOT_REMOVE_ASSET_WITH_REMOVED_STATUS";
    public static final java.lang.String _CANNOT_MODIFY_ASSET_NAME = "CANNOT_MODIFY_ASSET_NAME";
    public static final java.lang.String _DUPLICATE_ASSET = "DUPLICATE_ASSET";
    public static final java.lang.String _DUPLICATE_ASSET_NAME = "DUPLICATE_ASSET_NAME";
    public static final java.lang.String _ASSET_DATA_IS_MISSING = "ASSET_DATA_IS_MISSING";
    public static final AssetErrorReason UNKNOWN = new AssetErrorReason(_UNKNOWN);
    public static final AssetErrorReason ASSET_TYPE_NOT_SUPPORTED = new AssetErrorReason(_ASSET_TYPE_NOT_SUPPORTED);
    public static final AssetErrorReason CANNOT_REMOVE_ASSET_WITH_REMOVED_STATUS = new AssetErrorReason(_CANNOT_REMOVE_ASSET_WITH_REMOVED_STATUS);
    public static final AssetErrorReason CANNOT_MODIFY_ASSET_NAME = new AssetErrorReason(_CANNOT_MODIFY_ASSET_NAME);
    public static final AssetErrorReason DUPLICATE_ASSET = new AssetErrorReason(_DUPLICATE_ASSET);
    public static final AssetErrorReason DUPLICATE_ASSET_NAME = new AssetErrorReason(_DUPLICATE_ASSET_NAME);
    public static final AssetErrorReason ASSET_DATA_IS_MISSING = new AssetErrorReason(_ASSET_DATA_IS_MISSING);
    public java.lang.String getValue() { return _value_;}
    public static AssetErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AssetErrorReason enumeration = (AssetErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AssetErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AssetErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201806", "AssetError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
