/**
 * VideoBudgetErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.video;

public class VideoBudgetErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VideoBudgetErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _MONEY_AMOUNT_LESS_THAN_CURRENCY_MINIMUM_CPC = "MONEY_AMOUNT_LESS_THAN_CURRENCY_MINIMUM_CPC";
    public static final java.lang.String _MONEY_AMOUNT_LESS_THAN_MAXIMUM_AD_GROUP_CPM = "MONEY_AMOUNT_LESS_THAN_MAXIMUM_AD_GROUP_CPM";
    public static final java.lang.String _MONEY_AMOUNT_LESS_THAN_MAXIMUM_SITE_CPM = "MONEY_AMOUNT_LESS_THAN_MAXIMUM_SITE_CPM";
    public static final java.lang.String _MONEY_AMOUNT_LESS_THAN_MINIMUM_AD_GROUP_CPC = "MONEY_AMOUNT_LESS_THAN_MINIMUM_AD_GROUP_CPC";
    public static final java.lang.String _MONEY_AMOUNT_LESS_THAN_MINIMUM_CRITERIA_CPC = "MONEY_AMOUNT_LESS_THAN_MINIMUM_CRITERIA_CPC";
    public static final java.lang.String _MONEY_AMOUNT_TOO_LARGE = "MONEY_AMOUNT_TOO_LARGE";
    public static final java.lang.String _NON_MULTIPLE_OF_MINIMUM_CURRENCY_UNIT = "NON_MULTIPLE_OF_MINIMUM_CURRENCY_UNIT";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final VideoBudgetErrorReason MONEY_AMOUNT_LESS_THAN_CURRENCY_MINIMUM_CPC = new VideoBudgetErrorReason(_MONEY_AMOUNT_LESS_THAN_CURRENCY_MINIMUM_CPC);
    public static final VideoBudgetErrorReason MONEY_AMOUNT_LESS_THAN_MAXIMUM_AD_GROUP_CPM = new VideoBudgetErrorReason(_MONEY_AMOUNT_LESS_THAN_MAXIMUM_AD_GROUP_CPM);
    public static final VideoBudgetErrorReason MONEY_AMOUNT_LESS_THAN_MAXIMUM_SITE_CPM = new VideoBudgetErrorReason(_MONEY_AMOUNT_LESS_THAN_MAXIMUM_SITE_CPM);
    public static final VideoBudgetErrorReason MONEY_AMOUNT_LESS_THAN_MINIMUM_AD_GROUP_CPC = new VideoBudgetErrorReason(_MONEY_AMOUNT_LESS_THAN_MINIMUM_AD_GROUP_CPC);
    public static final VideoBudgetErrorReason MONEY_AMOUNT_LESS_THAN_MINIMUM_CRITERIA_CPC = new VideoBudgetErrorReason(_MONEY_AMOUNT_LESS_THAN_MINIMUM_CRITERIA_CPC);
    public static final VideoBudgetErrorReason MONEY_AMOUNT_TOO_LARGE = new VideoBudgetErrorReason(_MONEY_AMOUNT_TOO_LARGE);
    public static final VideoBudgetErrorReason NON_MULTIPLE_OF_MINIMUM_CURRENCY_UNIT = new VideoBudgetErrorReason(_NON_MULTIPLE_OF_MINIMUM_CURRENCY_UNIT);
    public static final VideoBudgetErrorReason UNKNOWN = new VideoBudgetErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static VideoBudgetErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VideoBudgetErrorReason enumeration = (VideoBudgetErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VideoBudgetErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VideoBudgetErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "VideoBudgetError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
