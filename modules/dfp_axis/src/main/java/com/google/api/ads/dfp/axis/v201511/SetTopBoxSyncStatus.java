/**
 * SetTopBoxSyncStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201511;

public class SetTopBoxSyncStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SetTopBoxSyncStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NOT_READY = "NOT_READY";
    public static final java.lang.String _SYNC_PENDING = "SYNC_PENDING";
    public static final java.lang.String _SYNCED = "SYNCED";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final SetTopBoxSyncStatus NOT_READY = new SetTopBoxSyncStatus(_NOT_READY);
    public static final SetTopBoxSyncStatus SYNC_PENDING = new SetTopBoxSyncStatus(_SYNC_PENDING);
    public static final SetTopBoxSyncStatus SYNCED = new SetTopBoxSyncStatus(_SYNCED);
    public static final SetTopBoxSyncStatus UNKNOWN = new SetTopBoxSyncStatus(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static SetTopBoxSyncStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SetTopBoxSyncStatus enumeration = (SetTopBoxSyncStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SetTopBoxSyncStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SetTopBoxSyncStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201511", "SetTopBoxSyncStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
