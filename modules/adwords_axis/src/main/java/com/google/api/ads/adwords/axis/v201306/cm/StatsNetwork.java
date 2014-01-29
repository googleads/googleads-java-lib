/**
 * StatsNetwork.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201306.cm;

public class StatsNetwork implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected StatsNetwork(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _SEARCH = "SEARCH";
    public static final java.lang.String _GOOGLE_SEARCH = "GOOGLE_SEARCH";
    public static final java.lang.String _SEARCH_NETWORK = "SEARCH_NETWORK";
    public static final java.lang.String _CONTENT = "CONTENT";
    public static final java.lang.String _CONTENT_KEYWORD_BID = "CONTENT_KEYWORD_BID";
    public static final java.lang.String _CONTENT_PLACEMENT_BID = "CONTENT_PLACEMENT_BID";
    public static final java.lang.String _ALL = "ALL";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final StatsNetwork SEARCH = new StatsNetwork(_SEARCH);
    public static final StatsNetwork GOOGLE_SEARCH = new StatsNetwork(_GOOGLE_SEARCH);
    public static final StatsNetwork SEARCH_NETWORK = new StatsNetwork(_SEARCH_NETWORK);
    public static final StatsNetwork CONTENT = new StatsNetwork(_CONTENT);
    public static final StatsNetwork CONTENT_KEYWORD_BID = new StatsNetwork(_CONTENT_KEYWORD_BID);
    public static final StatsNetwork CONTENT_PLACEMENT_BID = new StatsNetwork(_CONTENT_PLACEMENT_BID);
    public static final StatsNetwork ALL = new StatsNetwork(_ALL);
    public static final StatsNetwork UNKNOWN = new StatsNetwork(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static StatsNetwork fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        StatsNetwork enumeration = (StatsNetwork)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static StatsNetwork fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(StatsNetwork.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "Stats.Network"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
