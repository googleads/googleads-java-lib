/**
 * TargetingScope.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.video;

public class TargetingScope implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TargetingScope(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _TRUE_VIEW_IN_SEARCH_ON_YOUTUBE_SEARCH = "TRUE_VIEW_IN_SEARCH_ON_YOUTUBE_SEARCH";
    public static final java.lang.String _TRUE_VIEW_IN_SLATE_ON_YOUTUBE_WATCH = "TRUE_VIEW_IN_SLATE_ON_YOUTUBE_WATCH";
    public static final java.lang.String _TRUE_VIEW_IN_DISPLAY_ON_YOUTUBE_WATCH = "TRUE_VIEW_IN_DISPLAY_ON_YOUTUBE_WATCH";
    public static final java.lang.String _TRUE_VIEW_IN_STREAM_ON_YOUTUBE_WATCH = "TRUE_VIEW_IN_STREAM_ON_YOUTUBE_WATCH";
    public static final java.lang.String _TRUE_VIEW_IN_SLATE_ON_GOOGLE_DISPLAY_NETWORK = "TRUE_VIEW_IN_SLATE_ON_GOOGLE_DISPLAY_NETWORK";
    public static final java.lang.String _TRUE_VIEW_IN_DISPLAY_ON_GOOGLE_DISPLAY_NETWORK = "TRUE_VIEW_IN_DISPLAY_ON_GOOGLE_DISPLAY_NETWORK";
    public static final java.lang.String _TRUE_VIEW_IN_STREAM_ON_GOOGLE_DISPLAY_NETWORK = "TRUE_VIEW_IN_STREAM_ON_GOOGLE_DISPLAY_NETWORK";
    public static final java.lang.String _TRUE_VIEW_IN_SEARCH_ON_GOOGLE_SEARCH = "TRUE_VIEW_IN_SEARCH_ON_GOOGLE_SEARCH";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final TargetingScope TRUE_VIEW_IN_SEARCH_ON_YOUTUBE_SEARCH = new TargetingScope(_TRUE_VIEW_IN_SEARCH_ON_YOUTUBE_SEARCH);
    public static final TargetingScope TRUE_VIEW_IN_SLATE_ON_YOUTUBE_WATCH = new TargetingScope(_TRUE_VIEW_IN_SLATE_ON_YOUTUBE_WATCH);
    public static final TargetingScope TRUE_VIEW_IN_DISPLAY_ON_YOUTUBE_WATCH = new TargetingScope(_TRUE_VIEW_IN_DISPLAY_ON_YOUTUBE_WATCH);
    public static final TargetingScope TRUE_VIEW_IN_STREAM_ON_YOUTUBE_WATCH = new TargetingScope(_TRUE_VIEW_IN_STREAM_ON_YOUTUBE_WATCH);
    public static final TargetingScope TRUE_VIEW_IN_SLATE_ON_GOOGLE_DISPLAY_NETWORK = new TargetingScope(_TRUE_VIEW_IN_SLATE_ON_GOOGLE_DISPLAY_NETWORK);
    public static final TargetingScope TRUE_VIEW_IN_DISPLAY_ON_GOOGLE_DISPLAY_NETWORK = new TargetingScope(_TRUE_VIEW_IN_DISPLAY_ON_GOOGLE_DISPLAY_NETWORK);
    public static final TargetingScope TRUE_VIEW_IN_STREAM_ON_GOOGLE_DISPLAY_NETWORK = new TargetingScope(_TRUE_VIEW_IN_STREAM_ON_GOOGLE_DISPLAY_NETWORK);
    public static final TargetingScope TRUE_VIEW_IN_SEARCH_ON_GOOGLE_SEARCH = new TargetingScope(_TRUE_VIEW_IN_SEARCH_ON_GOOGLE_SEARCH);
    public static final TargetingScope UNKNOWN = new TargetingScope(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static TargetingScope fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TargetingScope enumeration = (TargetingScope)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TargetingScope fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TargetingScope.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "TargetingScope"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
