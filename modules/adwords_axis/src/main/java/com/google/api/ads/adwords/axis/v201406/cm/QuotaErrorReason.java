/**
 * QuotaErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.cm;

public class QuotaErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected QuotaErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _TOO_MANY_ADGROUPS_PER_CAMPAIGN = "TOO_MANY_ADGROUPS_PER_CAMPAIGN";
    public static final java.lang.String _TOO_MANY_CAMPAIGNS_PER_ACCOUNT = "TOO_MANY_CAMPAIGNS_PER_ACCOUNT";
    public static final java.lang.String _TOO_MANY_CONVERSION_TYPES_PER_ACCOUNT = "TOO_MANY_CONVERSION_TYPES_PER_ACCOUNT";
    public static final java.lang.String _TOO_MANY_KEYWORDS_PER_ADGROUP = "TOO_MANY_KEYWORDS_PER_ADGROUP";
    public static final java.lang.String _TOO_MANY_KEYWORDS_PER_CAMPAIGN = "TOO_MANY_KEYWORDS_PER_CAMPAIGN";
    public static final java.lang.String _TOO_MANY_KEYWORDS_PER_CUSTOMER = "TOO_MANY_KEYWORDS_PER_CUSTOMER";
    public static final java.lang.String _TOO_MANY_SITES_PER_ADGROUP = "TOO_MANY_SITES_PER_ADGROUP";
    public static final java.lang.String _TOO_MANY_SITES_PER_CAMPAIGN = "TOO_MANY_SITES_PER_CAMPAIGN";
    public static final java.lang.String _TOO_MANY_CRITERIA_PER_ACCOUNT = "TOO_MANY_CRITERIA_PER_ACCOUNT";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final QuotaErrorReason TOO_MANY_ADGROUPS_PER_CAMPAIGN = new QuotaErrorReason(_TOO_MANY_ADGROUPS_PER_CAMPAIGN);
    public static final QuotaErrorReason TOO_MANY_CAMPAIGNS_PER_ACCOUNT = new QuotaErrorReason(_TOO_MANY_CAMPAIGNS_PER_ACCOUNT);
    public static final QuotaErrorReason TOO_MANY_CONVERSION_TYPES_PER_ACCOUNT = new QuotaErrorReason(_TOO_MANY_CONVERSION_TYPES_PER_ACCOUNT);
    public static final QuotaErrorReason TOO_MANY_KEYWORDS_PER_ADGROUP = new QuotaErrorReason(_TOO_MANY_KEYWORDS_PER_ADGROUP);
    public static final QuotaErrorReason TOO_MANY_KEYWORDS_PER_CAMPAIGN = new QuotaErrorReason(_TOO_MANY_KEYWORDS_PER_CAMPAIGN);
    public static final QuotaErrorReason TOO_MANY_KEYWORDS_PER_CUSTOMER = new QuotaErrorReason(_TOO_MANY_KEYWORDS_PER_CUSTOMER);
    public static final QuotaErrorReason TOO_MANY_SITES_PER_ADGROUP = new QuotaErrorReason(_TOO_MANY_SITES_PER_ADGROUP);
    public static final QuotaErrorReason TOO_MANY_SITES_PER_CAMPAIGN = new QuotaErrorReason(_TOO_MANY_SITES_PER_CAMPAIGN);
    public static final QuotaErrorReason TOO_MANY_CRITERIA_PER_ACCOUNT = new QuotaErrorReason(_TOO_MANY_CRITERIA_PER_ACCOUNT);
    public static final QuotaErrorReason UNKNOWN = new QuotaErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static QuotaErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        QuotaErrorReason enumeration = (QuotaErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static QuotaErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(QuotaErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "QuotaError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
