/**
 * CampaignCriterionLimitExceededCriteriaLimitType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201306.cm;

public class CampaignCriterionLimitExceededCriteriaLimitType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CampaignCriterionLimitExceededCriteriaLimitType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CAMPAIGN_CRITERIA = "CAMPAIGN_CRITERIA";
    public static final java.lang.String _CAMPAIGN_NEGATIVE_KEYWORD = "CAMPAIGN_NEGATIVE_KEYWORD";
    public static final java.lang.String _CAMPAIGN_NEGATIVE_WEBSITE = "CAMPAIGN_NEGATIVE_WEBSITE";
    public static final java.lang.String _CAMPAIGN_LOCATION_CRITERIA = "CAMPAIGN_LOCATION_CRITERIA";
    public static final java.lang.String _CAMPAIGN_PROXIMITY_CRITERIA = "CAMPAIGN_PROXIMITY_CRITERIA";
    public static final CampaignCriterionLimitExceededCriteriaLimitType CAMPAIGN_CRITERIA = new CampaignCriterionLimitExceededCriteriaLimitType(_CAMPAIGN_CRITERIA);
    public static final CampaignCriterionLimitExceededCriteriaLimitType CAMPAIGN_NEGATIVE_KEYWORD = new CampaignCriterionLimitExceededCriteriaLimitType(_CAMPAIGN_NEGATIVE_KEYWORD);
    public static final CampaignCriterionLimitExceededCriteriaLimitType CAMPAIGN_NEGATIVE_WEBSITE = new CampaignCriterionLimitExceededCriteriaLimitType(_CAMPAIGN_NEGATIVE_WEBSITE);
    public static final CampaignCriterionLimitExceededCriteriaLimitType CAMPAIGN_LOCATION_CRITERIA = new CampaignCriterionLimitExceededCriteriaLimitType(_CAMPAIGN_LOCATION_CRITERIA);
    public static final CampaignCriterionLimitExceededCriteriaLimitType CAMPAIGN_PROXIMITY_CRITERIA = new CampaignCriterionLimitExceededCriteriaLimitType(_CAMPAIGN_PROXIMITY_CRITERIA);
    public java.lang.String getValue() { return _value_;}
    public static CampaignCriterionLimitExceededCriteriaLimitType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CampaignCriterionLimitExceededCriteriaLimitType enumeration = (CampaignCriterionLimitExceededCriteriaLimitType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CampaignCriterionLimitExceededCriteriaLimitType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CampaignCriterionLimitExceededCriteriaLimitType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "CampaignCriterionLimitExceeded.CriteriaLimitType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
