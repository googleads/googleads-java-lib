/**
 * ServingStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.video;

public class ServingStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ServingStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNDEFINED = "UNDEFINED";
    public static final java.lang.String _REMOVED = "REMOVED";
    public static final java.lang.String _CAMPAIGN_REMOVED = "CAMPAIGN_REMOVED";
    public static final java.lang.String _PAUSED = "PAUSED";
    public static final java.lang.String _CAMPAIGN_PAUSED = "CAMPAIGN_PAUSED";
    public static final java.lang.String _ENDED = "ENDED";
    public static final java.lang.String _SUSPENDED = "SUSPENDED";
    public static final java.lang.String _BROKEN = "BROKEN";
    public static final java.lang.String _IMPROVABLE = "IMPROVABLE";
    public static final java.lang.String _LIMITED_BY_BUDGET = "LIMITED_BY_BUDGET";
    public static final java.lang.String _NOTIFICATION = "NOTIFICATION";
    public static final java.lang.String _PENDING = "PENDING";
    public static final java.lang.String _SERVING = "SERVING";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final ServingStatus UNDEFINED = new ServingStatus(_UNDEFINED);
    public static final ServingStatus REMOVED = new ServingStatus(_REMOVED);
    public static final ServingStatus CAMPAIGN_REMOVED = new ServingStatus(_CAMPAIGN_REMOVED);
    public static final ServingStatus PAUSED = new ServingStatus(_PAUSED);
    public static final ServingStatus CAMPAIGN_PAUSED = new ServingStatus(_CAMPAIGN_PAUSED);
    public static final ServingStatus ENDED = new ServingStatus(_ENDED);
    public static final ServingStatus SUSPENDED = new ServingStatus(_SUSPENDED);
    public static final ServingStatus BROKEN = new ServingStatus(_BROKEN);
    public static final ServingStatus IMPROVABLE = new ServingStatus(_IMPROVABLE);
    public static final ServingStatus LIMITED_BY_BUDGET = new ServingStatus(_LIMITED_BY_BUDGET);
    public static final ServingStatus NOTIFICATION = new ServingStatus(_NOTIFICATION);
    public static final ServingStatus PENDING = new ServingStatus(_PENDING);
    public static final ServingStatus SERVING = new ServingStatus(_SERVING);
    public static final ServingStatus UNKNOWN = new ServingStatus(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static ServingStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ServingStatus enumeration = (ServingStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ServingStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ServingStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "ServingStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
