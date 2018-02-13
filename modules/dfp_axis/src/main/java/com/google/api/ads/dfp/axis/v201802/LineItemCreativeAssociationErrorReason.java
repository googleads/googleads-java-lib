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
 * LineItemCreativeAssociationErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class LineItemCreativeAssociationErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LineItemCreativeAssociationErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CREATIVE_IN_WRONG_ADVERTISERS_LIBRARY = "CREATIVE_IN_WRONG_ADVERTISERS_LIBRARY";
    public static final java.lang.String _INVALID_LINEITEM_CREATIVE_PAIRING = "INVALID_LINEITEM_CREATIVE_PAIRING";
    public static final java.lang.String _STARTDATE_BEFORE_LINEITEM_STARTDATE = "STARTDATE_BEFORE_LINEITEM_STARTDATE";
    public static final java.lang.String _STARTDATE_NOT_BEFORE_LINEITEM_ENDDATE = "STARTDATE_NOT_BEFORE_LINEITEM_ENDDATE";
    public static final java.lang.String _ENDDATE_AFTER_LINEITEM_ENDDATE = "ENDDATE_AFTER_LINEITEM_ENDDATE";
    public static final java.lang.String _ENDDATE_NOT_AFTER_LINEITEM_STARTDATE = "ENDDATE_NOT_AFTER_LINEITEM_STARTDATE";
    public static final java.lang.String _ENDDATE_NOT_AFTER_STARTDATE = "ENDDATE_NOT_AFTER_STARTDATE";
    public static final java.lang.String _ENDDATE_IN_THE_PAST = "ENDDATE_IN_THE_PAST";
    public static final java.lang.String _CANNOT_COPY_WITHIN_SAME_LINE_ITEM = "CANNOT_COPY_WITHIN_SAME_LINE_ITEM";
    public static final java.lang.String _PROGRAMMATIC_CREATIVES_CAN_ONLY_BE_ASSIGNED_TO_ONE_LINE_ITEM = "PROGRAMMATIC_CREATIVES_CAN_ONLY_BE_ASSIGNED_TO_ONE_LINE_ITEM";
    public static final java.lang.String _CANNOT_CREATE_PROGRAMMATIC_CREATIVES = "CANNOT_CREATE_PROGRAMMATIC_CREATIVES";
    public static final java.lang.String _CANNOT_UPDATE_PROGRAMMATIC_CREATIVES = "CANNOT_UPDATE_PROGRAMMATIC_CREATIVES";
    public static final java.lang.String _CREATIVE_AND_LINE_ITEM_MUST_BOTH_BE_SET_TOP_BOX_ENABLED = "CREATIVE_AND_LINE_ITEM_MUST_BOTH_BE_SET_TOP_BOX_ENABLED";
    public static final java.lang.String _CANNOT_DELETE_SET_TOP_BOX_ENABLED_ASSOCIATIONS = "CANNOT_DELETE_SET_TOP_BOX_ENABLED_ASSOCIATIONS";
    public static final java.lang.String _SET_TOP_BOX_CREATIVE_ROTATION_WEIGHT_MUST_BE_INTEGER = "SET_TOP_BOX_CREATIVE_ROTATION_WEIGHT_MUST_BE_INTEGER";
    public static final java.lang.String _INVALID_CREATIVE_ROTATION_TYPE_FOR_MANUAL_WEIGHT = "INVALID_CREATIVE_ROTATION_TYPE_FOR_MANUAL_WEIGHT";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final LineItemCreativeAssociationErrorReason CREATIVE_IN_WRONG_ADVERTISERS_LIBRARY = new LineItemCreativeAssociationErrorReason(_CREATIVE_IN_WRONG_ADVERTISERS_LIBRARY);
    public static final LineItemCreativeAssociationErrorReason INVALID_LINEITEM_CREATIVE_PAIRING = new LineItemCreativeAssociationErrorReason(_INVALID_LINEITEM_CREATIVE_PAIRING);
    public static final LineItemCreativeAssociationErrorReason STARTDATE_BEFORE_LINEITEM_STARTDATE = new LineItemCreativeAssociationErrorReason(_STARTDATE_BEFORE_LINEITEM_STARTDATE);
    public static final LineItemCreativeAssociationErrorReason STARTDATE_NOT_BEFORE_LINEITEM_ENDDATE = new LineItemCreativeAssociationErrorReason(_STARTDATE_NOT_BEFORE_LINEITEM_ENDDATE);
    public static final LineItemCreativeAssociationErrorReason ENDDATE_AFTER_LINEITEM_ENDDATE = new LineItemCreativeAssociationErrorReason(_ENDDATE_AFTER_LINEITEM_ENDDATE);
    public static final LineItemCreativeAssociationErrorReason ENDDATE_NOT_AFTER_LINEITEM_STARTDATE = new LineItemCreativeAssociationErrorReason(_ENDDATE_NOT_AFTER_LINEITEM_STARTDATE);
    public static final LineItemCreativeAssociationErrorReason ENDDATE_NOT_AFTER_STARTDATE = new LineItemCreativeAssociationErrorReason(_ENDDATE_NOT_AFTER_STARTDATE);
    public static final LineItemCreativeAssociationErrorReason ENDDATE_IN_THE_PAST = new LineItemCreativeAssociationErrorReason(_ENDDATE_IN_THE_PAST);
    public static final LineItemCreativeAssociationErrorReason CANNOT_COPY_WITHIN_SAME_LINE_ITEM = new LineItemCreativeAssociationErrorReason(_CANNOT_COPY_WITHIN_SAME_LINE_ITEM);
    public static final LineItemCreativeAssociationErrorReason PROGRAMMATIC_CREATIVES_CAN_ONLY_BE_ASSIGNED_TO_ONE_LINE_ITEM = new LineItemCreativeAssociationErrorReason(_PROGRAMMATIC_CREATIVES_CAN_ONLY_BE_ASSIGNED_TO_ONE_LINE_ITEM);
    public static final LineItemCreativeAssociationErrorReason CANNOT_CREATE_PROGRAMMATIC_CREATIVES = new LineItemCreativeAssociationErrorReason(_CANNOT_CREATE_PROGRAMMATIC_CREATIVES);
    public static final LineItemCreativeAssociationErrorReason CANNOT_UPDATE_PROGRAMMATIC_CREATIVES = new LineItemCreativeAssociationErrorReason(_CANNOT_UPDATE_PROGRAMMATIC_CREATIVES);
    public static final LineItemCreativeAssociationErrorReason CREATIVE_AND_LINE_ITEM_MUST_BOTH_BE_SET_TOP_BOX_ENABLED = new LineItemCreativeAssociationErrorReason(_CREATIVE_AND_LINE_ITEM_MUST_BOTH_BE_SET_TOP_BOX_ENABLED);
    public static final LineItemCreativeAssociationErrorReason CANNOT_DELETE_SET_TOP_BOX_ENABLED_ASSOCIATIONS = new LineItemCreativeAssociationErrorReason(_CANNOT_DELETE_SET_TOP_BOX_ENABLED_ASSOCIATIONS);
    public static final LineItemCreativeAssociationErrorReason SET_TOP_BOX_CREATIVE_ROTATION_WEIGHT_MUST_BE_INTEGER = new LineItemCreativeAssociationErrorReason(_SET_TOP_BOX_CREATIVE_ROTATION_WEIGHT_MUST_BE_INTEGER);
    public static final LineItemCreativeAssociationErrorReason INVALID_CREATIVE_ROTATION_TYPE_FOR_MANUAL_WEIGHT = new LineItemCreativeAssociationErrorReason(_INVALID_CREATIVE_ROTATION_TYPE_FOR_MANUAL_WEIGHT);
    public static final LineItemCreativeAssociationErrorReason UNKNOWN = new LineItemCreativeAssociationErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static LineItemCreativeAssociationErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LineItemCreativeAssociationErrorReason enumeration = (LineItemCreativeAssociationErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LineItemCreativeAssociationErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LineItemCreativeAssociationErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "LineItemCreativeAssociationError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
