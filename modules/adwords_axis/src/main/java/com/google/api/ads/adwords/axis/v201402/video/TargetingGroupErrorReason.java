/**
 * TargetingGroupErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.video;

public class TargetingGroupErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TargetingGroupErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _DUPLICATE_TARGETING_GROUP_ID = "DUPLICATE_TARGETING_GROUP_ID";
    public static final java.lang.String _DUPLICATE_TARGETING_GROUP_NAME = "DUPLICATE_TARGETING_GROUP_NAME";
    public static final java.lang.String _DETECTED_DUPLICATE_TARGETING_GROUP_NAME = "DETECTED_DUPLICATE_TARGETING_GROUP_NAME";
    public static final java.lang.String _IMMUTABLE_FIELD = "IMMUTABLE_FIELD";
    public static final java.lang.String _INVALID_TARGETING_GROUP_ID = "INVALID_TARGETING_GROUP_ID";
    public static final java.lang.String _INVALID_TARGETING_GROUP_NAME = "INVALID_TARGETING_GROUP_NAME";
    public static final java.lang.String _NOT_PERSISTENT = "NOT_PERSISTENT";
    public static final java.lang.String _TARGETING_GROUP_NOT_FOUND = "TARGETING_GROUP_NOT_FOUND";
    public static final java.lang.String _TOO_MANY_TARGETING_GROUPS = "TOO_MANY_TARGETING_GROUPS";
    public static final TargetingGroupErrorReason UNKNOWN = new TargetingGroupErrorReason(_UNKNOWN);
    public static final TargetingGroupErrorReason DUPLICATE_TARGETING_GROUP_ID = new TargetingGroupErrorReason(_DUPLICATE_TARGETING_GROUP_ID);
    public static final TargetingGroupErrorReason DUPLICATE_TARGETING_GROUP_NAME = new TargetingGroupErrorReason(_DUPLICATE_TARGETING_GROUP_NAME);
    public static final TargetingGroupErrorReason DETECTED_DUPLICATE_TARGETING_GROUP_NAME = new TargetingGroupErrorReason(_DETECTED_DUPLICATE_TARGETING_GROUP_NAME);
    public static final TargetingGroupErrorReason IMMUTABLE_FIELD = new TargetingGroupErrorReason(_IMMUTABLE_FIELD);
    public static final TargetingGroupErrorReason INVALID_TARGETING_GROUP_ID = new TargetingGroupErrorReason(_INVALID_TARGETING_GROUP_ID);
    public static final TargetingGroupErrorReason INVALID_TARGETING_GROUP_NAME = new TargetingGroupErrorReason(_INVALID_TARGETING_GROUP_NAME);
    public static final TargetingGroupErrorReason NOT_PERSISTENT = new TargetingGroupErrorReason(_NOT_PERSISTENT);
    public static final TargetingGroupErrorReason TARGETING_GROUP_NOT_FOUND = new TargetingGroupErrorReason(_TARGETING_GROUP_NOT_FOUND);
    public static final TargetingGroupErrorReason TOO_MANY_TARGETING_GROUPS = new TargetingGroupErrorReason(_TOO_MANY_TARGETING_GROUPS);
    public java.lang.String getValue() { return _value_;}
    public static TargetingGroupErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TargetingGroupErrorReason enumeration = (TargetingGroupErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TargetingGroupErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TargetingGroupErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "TargetingGroupError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
