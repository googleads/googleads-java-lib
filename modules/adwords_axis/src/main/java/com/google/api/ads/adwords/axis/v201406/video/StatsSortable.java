/**
 * StatsSortable.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.video;

public class StatsSortable implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected StatsSortable(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AVERAGE_CPV = "AVERAGE_CPV";
    public static final java.lang.String _AVERAGE_CPM = "AVERAGE_CPM";
    public static final java.lang.String _VIEWS = "VIEWS";
    public static final java.lang.String _VIEW_RATE = "VIEW_RATE";
    public static final java.lang.String _CTR = "CTR";
    public static final java.lang.String _COST = "COST";
    public static final java.lang.String _COST_PER_CONVERSION = "COST_PER_CONVERSION";
    public static final java.lang.String _IMPRESSIONS = "IMPRESSIONS";
    public static final java.lang.String _WEBSITE_CLICKS = "WEBSITE_CLICKS";
    public static final java.lang.String _CONVERSIONS = "CONVERSIONS";
    public static final java.lang.String _CONVERSION_RATE = "CONVERSION_RATE";
    public static final java.lang.String _VIEW_THROUGH_CONVERSIONS = "VIEW_THROUGH_CONVERSIONS";
    public static final java.lang.String _CONVERSIONS_MANY_PER_VIEW = "CONVERSIONS_MANY_PER_VIEW";
    public static final java.lang.String _CONVERSION_RATE_MANY_PER_VIEW = "CONVERSION_RATE_MANY_PER_VIEW";
    public static final java.lang.String _COST_PER_CONVERSION_MANY_PER_VIEW = "COST_PER_CONVERSION_MANY_PER_VIEW";
    public static final java.lang.String _TOTAL_CONV_VALUE = "TOTAL_CONV_VALUE";
    public static final java.lang.String _VALUE_PER_CONV = "VALUE_PER_CONV";
    public static final java.lang.String _VALUE_PER_CONV_MANY_PER_VIEW = "VALUE_PER_CONV_MANY_PER_VIEW";
    public static final java.lang.String _PERCENT_SERVED = "PERCENT_SERVED";
    public static final java.lang.String _VIDEO_STARTS = "VIDEO_STARTS";
    public static final java.lang.String _QUARTILE_25S = "QUARTILE_25S";
    public static final java.lang.String _QUARTILE_50S = "QUARTILE_50S";
    public static final java.lang.String _QUARTILE_75S = "QUARTILE_75S";
    public static final java.lang.String _QUARTILE_100S = "QUARTILE_100S";
    public static final java.lang.String _QUARTILE_25_PERCENTS = "QUARTILE_25_PERCENTS";
    public static final java.lang.String _QUARTILE_50_PERCENTS = "QUARTILE_50_PERCENTS";
    public static final java.lang.String _QUARTILE_75_PERCENTS = "QUARTILE_75_PERCENTS";
    public static final java.lang.String _QUARTILE_100_PERCENTS = "QUARTILE_100_PERCENTS";
    public static final java.lang.String _FOLLOW_ON_SUBSCRIBES = "FOLLOW_ON_SUBSCRIBES";
    public static final java.lang.String _FOLLOW_ON_SUBSCRIBE_RATE = "FOLLOW_ON_SUBSCRIBE_RATE";
    public static final java.lang.String _FOLLOW_ON_VIEWS = "FOLLOW_ON_VIEWS";
    public static final java.lang.String _FOLLOW_ON_VIEW_RATE = "FOLLOW_ON_VIEW_RATE";
    public static final java.lang.String _FOLLOW_ON_ADD_TO_PLAYLIST = "FOLLOW_ON_ADD_TO_PLAYLIST";
    public static final java.lang.String _FOLLOW_ON_COMMENTS = "FOLLOW_ON_COMMENTS";
    public static final java.lang.String _FOLLOW_ON_LIKES = "FOLLOW_ON_LIKES";
    public static final java.lang.String _FOLLOW_ON_SHARES = "FOLLOW_ON_SHARES";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final StatsSortable AVERAGE_CPV = new StatsSortable(_AVERAGE_CPV);
    public static final StatsSortable AVERAGE_CPM = new StatsSortable(_AVERAGE_CPM);
    public static final StatsSortable VIEWS = new StatsSortable(_VIEWS);
    public static final StatsSortable VIEW_RATE = new StatsSortable(_VIEW_RATE);
    public static final StatsSortable CTR = new StatsSortable(_CTR);
    public static final StatsSortable COST = new StatsSortable(_COST);
    public static final StatsSortable COST_PER_CONVERSION = new StatsSortable(_COST_PER_CONVERSION);
    public static final StatsSortable IMPRESSIONS = new StatsSortable(_IMPRESSIONS);
    public static final StatsSortable WEBSITE_CLICKS = new StatsSortable(_WEBSITE_CLICKS);
    public static final StatsSortable CONVERSIONS = new StatsSortable(_CONVERSIONS);
    public static final StatsSortable CONVERSION_RATE = new StatsSortable(_CONVERSION_RATE);
    public static final StatsSortable VIEW_THROUGH_CONVERSIONS = new StatsSortable(_VIEW_THROUGH_CONVERSIONS);
    public static final StatsSortable CONVERSIONS_MANY_PER_VIEW = new StatsSortable(_CONVERSIONS_MANY_PER_VIEW);
    public static final StatsSortable CONVERSION_RATE_MANY_PER_VIEW = new StatsSortable(_CONVERSION_RATE_MANY_PER_VIEW);
    public static final StatsSortable COST_PER_CONVERSION_MANY_PER_VIEW = new StatsSortable(_COST_PER_CONVERSION_MANY_PER_VIEW);
    public static final StatsSortable TOTAL_CONV_VALUE = new StatsSortable(_TOTAL_CONV_VALUE);
    public static final StatsSortable VALUE_PER_CONV = new StatsSortable(_VALUE_PER_CONV);
    public static final StatsSortable VALUE_PER_CONV_MANY_PER_VIEW = new StatsSortable(_VALUE_PER_CONV_MANY_PER_VIEW);
    public static final StatsSortable PERCENT_SERVED = new StatsSortable(_PERCENT_SERVED);
    public static final StatsSortable VIDEO_STARTS = new StatsSortable(_VIDEO_STARTS);
    public static final StatsSortable QUARTILE_25S = new StatsSortable(_QUARTILE_25S);
    public static final StatsSortable QUARTILE_50S = new StatsSortable(_QUARTILE_50S);
    public static final StatsSortable QUARTILE_75S = new StatsSortable(_QUARTILE_75S);
    public static final StatsSortable QUARTILE_100S = new StatsSortable(_QUARTILE_100S);
    public static final StatsSortable QUARTILE_25_PERCENTS = new StatsSortable(_QUARTILE_25_PERCENTS);
    public static final StatsSortable QUARTILE_50_PERCENTS = new StatsSortable(_QUARTILE_50_PERCENTS);
    public static final StatsSortable QUARTILE_75_PERCENTS = new StatsSortable(_QUARTILE_75_PERCENTS);
    public static final StatsSortable QUARTILE_100_PERCENTS = new StatsSortable(_QUARTILE_100_PERCENTS);
    public static final StatsSortable FOLLOW_ON_SUBSCRIBES = new StatsSortable(_FOLLOW_ON_SUBSCRIBES);
    public static final StatsSortable FOLLOW_ON_SUBSCRIBE_RATE = new StatsSortable(_FOLLOW_ON_SUBSCRIBE_RATE);
    public static final StatsSortable FOLLOW_ON_VIEWS = new StatsSortable(_FOLLOW_ON_VIEWS);
    public static final StatsSortable FOLLOW_ON_VIEW_RATE = new StatsSortable(_FOLLOW_ON_VIEW_RATE);
    public static final StatsSortable FOLLOW_ON_ADD_TO_PLAYLIST = new StatsSortable(_FOLLOW_ON_ADD_TO_PLAYLIST);
    public static final StatsSortable FOLLOW_ON_COMMENTS = new StatsSortable(_FOLLOW_ON_COMMENTS);
    public static final StatsSortable FOLLOW_ON_LIKES = new StatsSortable(_FOLLOW_ON_LIKES);
    public static final StatsSortable FOLLOW_ON_SHARES = new StatsSortable(_FOLLOW_ON_SHARES);
    public static final StatsSortable UNKNOWN = new StatsSortable(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static StatsSortable fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        StatsSortable enumeration = (StatsSortable)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static StatsSortable fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(StatsSortable.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "StatsSortable"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
