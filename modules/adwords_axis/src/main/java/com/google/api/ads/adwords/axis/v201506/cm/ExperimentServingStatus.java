/**
 * ExperimentServingStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201506.cm;

public class ExperimentServingStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ExperimentServingStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _RUNNING = "RUNNING";
    public static final java.lang.String _PENDING = "PENDING";
    public static final java.lang.String _ENDED = "ENDED";
    public static final java.lang.String _REMOVED = "REMOVED";
    public static final java.lang.String _PROMOTED = "PROMOTED";
    public static final ExperimentServingStatus RUNNING = new ExperimentServingStatus(_RUNNING);
    public static final ExperimentServingStatus PENDING = new ExperimentServingStatus(_PENDING);
    public static final ExperimentServingStatus ENDED = new ExperimentServingStatus(_ENDED);
    public static final ExperimentServingStatus REMOVED = new ExperimentServingStatus(_REMOVED);
    public static final ExperimentServingStatus PROMOTED = new ExperimentServingStatus(_PROMOTED);
    public java.lang.String getValue() { return _value_;}
    public static ExperimentServingStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ExperimentServingStatus enumeration = (ExperimentServingStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ExperimentServingStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ExperimentServingStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "ExperimentServingStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
