/**
 * LineItemCreativeAssociationErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201208;

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
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "LineItemCreativeAssociationError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
