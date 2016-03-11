/**
 * ReconciliationImportErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201508;

public class ReconciliationImportErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ReconciliationImportErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _MISSING_EDITABLE_COLUMN = "MISSING_EDITABLE_COLUMN";
    public static final java.lang.String _INCONSISTENT_IMPORT_COLUMNS = "INCONSISTENT_IMPORT_COLUMNS";
    public static final java.lang.String _COLUMN_CONVERSION_TYPE_ERROR = "COLUMN_CONVERSION_TYPE_ERROR";
    public static final java.lang.String _INCONSISTENT_COLUMNS_COUNT = "INCONSISTENT_COLUMNS_COUNT";
    public static final java.lang.String _IMPORT_INTERNAL_ERROR = "IMPORT_INTERNAL_ERROR";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final ReconciliationImportErrorReason MISSING_EDITABLE_COLUMN = new ReconciliationImportErrorReason(_MISSING_EDITABLE_COLUMN);
    public static final ReconciliationImportErrorReason INCONSISTENT_IMPORT_COLUMNS = new ReconciliationImportErrorReason(_INCONSISTENT_IMPORT_COLUMNS);
    public static final ReconciliationImportErrorReason COLUMN_CONVERSION_TYPE_ERROR = new ReconciliationImportErrorReason(_COLUMN_CONVERSION_TYPE_ERROR);
    public static final ReconciliationImportErrorReason INCONSISTENT_COLUMNS_COUNT = new ReconciliationImportErrorReason(_INCONSISTENT_COLUMNS_COUNT);
    public static final ReconciliationImportErrorReason IMPORT_INTERNAL_ERROR = new ReconciliationImportErrorReason(_IMPORT_INTERNAL_ERROR);
    public static final ReconciliationImportErrorReason UNKNOWN = new ReconciliationImportErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static ReconciliationImportErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ReconciliationImportErrorReason enumeration = (ReconciliationImportErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ReconciliationImportErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ReconciliationImportErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "ReconciliationImportError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
