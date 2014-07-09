/**
 * CampaignAdExtensionErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.cm;

public class CampaignAdExtensionErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CampaignAdExtensionErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ADEXTENSION_NOT_UNDER_CAMPAIGN = "ADEXTENSION_NOT_UNDER_CAMPAIGN";
    public static final java.lang.String _CANNOT_ADD_REMOVED_CAMPAIGN_ADEXTENSION = "CANNOT_ADD_REMOVED_CAMPAIGN_ADEXTENSION";
    public static final java.lang.String _CANNOT_OPERATE_ON_REMOVED_CAMPAIGN_ADEXTENSION = "CANNOT_OPERATE_ON_REMOVED_CAMPAIGN_ADEXTENSION";
    public static final java.lang.String _INVALID_ADEXTENSION_ID = "INVALID_ADEXTENSION_ID";
    public static final java.lang.String _MISSING_ADEXTENSION_ID = "MISSING_ADEXTENSION_ID";
    public static final java.lang.String _MUST_USE_CONCRETE_ADEXTENSION = "MUST_USE_CONCRETE_ADEXTENSION";
    public static final java.lang.String _UNKNOWN_ERROR = "UNKNOWN_ERROR";
    public static final CampaignAdExtensionErrorReason ADEXTENSION_NOT_UNDER_CAMPAIGN = new CampaignAdExtensionErrorReason(_ADEXTENSION_NOT_UNDER_CAMPAIGN);
    public static final CampaignAdExtensionErrorReason CANNOT_ADD_REMOVED_CAMPAIGN_ADEXTENSION = new CampaignAdExtensionErrorReason(_CANNOT_ADD_REMOVED_CAMPAIGN_ADEXTENSION);
    public static final CampaignAdExtensionErrorReason CANNOT_OPERATE_ON_REMOVED_CAMPAIGN_ADEXTENSION = new CampaignAdExtensionErrorReason(_CANNOT_OPERATE_ON_REMOVED_CAMPAIGN_ADEXTENSION);
    public static final CampaignAdExtensionErrorReason INVALID_ADEXTENSION_ID = new CampaignAdExtensionErrorReason(_INVALID_ADEXTENSION_ID);
    public static final CampaignAdExtensionErrorReason MISSING_ADEXTENSION_ID = new CampaignAdExtensionErrorReason(_MISSING_ADEXTENSION_ID);
    public static final CampaignAdExtensionErrorReason MUST_USE_CONCRETE_ADEXTENSION = new CampaignAdExtensionErrorReason(_MUST_USE_CONCRETE_ADEXTENSION);
    public static final CampaignAdExtensionErrorReason UNKNOWN_ERROR = new CampaignAdExtensionErrorReason(_UNKNOWN_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static CampaignAdExtensionErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CampaignAdExtensionErrorReason enumeration = (CampaignAdExtensionErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CampaignAdExtensionErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CampaignAdExtensionErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "CampaignAdExtensionError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
