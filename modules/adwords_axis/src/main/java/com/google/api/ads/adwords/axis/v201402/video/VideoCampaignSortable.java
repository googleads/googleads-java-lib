/**
 * VideoCampaignSortable.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.video;

public class VideoCampaignSortable implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VideoCampaignSortable(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _BUDGET_AMOUNT = "BUDGET_AMOUNT";
    public static final java.lang.String _CAMPAIGN_ID = "CAMPAIGN_ID";
    public static final java.lang.String _END_DATE = "END_DATE";
    public static final java.lang.String _NAME = "NAME";
    public static final java.lang.String _START_DATE = "START_DATE";
    public static final java.lang.String _STATUS = "STATUS";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final VideoCampaignSortable BUDGET_AMOUNT = new VideoCampaignSortable(_BUDGET_AMOUNT);
    public static final VideoCampaignSortable CAMPAIGN_ID = new VideoCampaignSortable(_CAMPAIGN_ID);
    public static final VideoCampaignSortable END_DATE = new VideoCampaignSortable(_END_DATE);
    public static final VideoCampaignSortable NAME = new VideoCampaignSortable(_NAME);
    public static final VideoCampaignSortable START_DATE = new VideoCampaignSortable(_START_DATE);
    public static final VideoCampaignSortable STATUS = new VideoCampaignSortable(_STATUS);
    public static final VideoCampaignSortable UNKNOWN = new VideoCampaignSortable(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static VideoCampaignSortable fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VideoCampaignSortable enumeration = (VideoCampaignSortable)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VideoCampaignSortable fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VideoCampaignSortable.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "VideoCampaignSortable"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
