/**
 * Dimension.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201308;

public class Dimension implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Dimension(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _MONTH = "MONTH";
    public static final java.lang.String _MONTH_AND_YEAR = "MONTH_AND_YEAR";
    public static final java.lang.String _WEEK = "WEEK";
    public static final java.lang.String _DATE = "DATE";
    public static final java.lang.String _DAY = "DAY";
    public static final java.lang.String _HOUR = "HOUR";
    public static final java.lang.String _LINE_ITEM_ID = "LINE_ITEM_ID";
    public static final java.lang.String _LINE_ITEM_NAME = "LINE_ITEM_NAME";
    public static final java.lang.String _LINE_ITEM_TYPE = "LINE_ITEM_TYPE";
    public static final java.lang.String _ORDER_ID = "ORDER_ID";
    public static final java.lang.String _ORDER_NAME = "ORDER_NAME";
    public static final java.lang.String _ADVERTISER_ID = "ADVERTISER_ID";
    public static final java.lang.String _ADVERTISER_NAME = "ADVERTISER_NAME";
    public static final java.lang.String _SALESPERSON_ID = "SALESPERSON_ID";
    public static final java.lang.String _SALESPERSON_NAME = "SALESPERSON_NAME";
    public static final java.lang.String _CREATIVE_ID = "CREATIVE_ID";
    public static final java.lang.String _CREATIVE_NAME = "CREATIVE_NAME";
    public static final java.lang.String _CREATIVE_TYPE = "CREATIVE_TYPE";
    public static final java.lang.String _CREATIVE_SIZE = "CREATIVE_SIZE";
    public static final java.lang.String _AD_UNIT_ID = "AD_UNIT_ID";
    public static final java.lang.String _AD_UNIT_NAME = "AD_UNIT_NAME";
    public static final java.lang.String _PLACEMENT_ID = "PLACEMENT_ID";
    public static final java.lang.String _PLACEMENT_NAME = "PLACEMENT_NAME";
    public static final java.lang.String _GENERIC_CRITERION_NAME = "GENERIC_CRITERION_NAME";
    public static final java.lang.String _COUNTRY_CRITERIA_ID = "COUNTRY_CRITERIA_ID";
    public static final java.lang.String _COUNTRY_NAME = "COUNTRY_NAME";
    public static final java.lang.String _REGION_CRITERIA_ID = "REGION_CRITERIA_ID";
    public static final java.lang.String _REGION_NAME = "REGION_NAME";
    public static final java.lang.String _CITY_CRITERIA_ID = "CITY_CRITERIA_ID";
    public static final java.lang.String _CITY_NAME = "CITY_NAME";
    public static final java.lang.String _METRO_CRITERIA_ID = "METRO_CRITERIA_ID";
    public static final java.lang.String _METRO_NAME = "METRO_NAME";
    public static final java.lang.String _POSTAL_CODE_CRITERIA_ID = "POSTAL_CODE_CRITERIA_ID";
    public static final java.lang.String _POSTAL_CODE = "POSTAL_CODE";
    public static final java.lang.String _CUSTOM_TARGETING_VALUE_ID = "CUSTOM_TARGETING_VALUE_ID";
    public static final java.lang.String _CUSTOM_CRITERIA = "CUSTOM_CRITERIA";
    public static final java.lang.String _ACTIVITY_ID = "ACTIVITY_ID";
    public static final java.lang.String _ACTIVITY_NAME = "ACTIVITY_NAME";
    public static final java.lang.String _ACTIVITY_GROUP_ID = "ACTIVITY_GROUP_ID";
    public static final java.lang.String _ACTIVITY_GROUP_NAME = "ACTIVITY_GROUP_NAME";
    public static final java.lang.String _CONTENT_ID = "CONTENT_ID";
    public static final java.lang.String _CONTENT_NAME = "CONTENT_NAME";
    public static final java.lang.String _AD_REQUEST_AD_UNIT_SIZES = "AD_REQUEST_AD_UNIT_SIZES";
    public static final java.lang.String _AD_REQUEST_CUSTOM_CRITERIA = "AD_REQUEST_CUSTOM_CRITERIA";
    public static final java.lang.String _MASTER_COMPANION_CREATIVE_ID = "MASTER_COMPANION_CREATIVE_ID";
    public static final java.lang.String _MASTER_COMPANION_CREATIVE_NAME = "MASTER_COMPANION_CREATIVE_NAME";
    public static final java.lang.String _DISTRIBUTION_PARTNER_ID = "DISTRIBUTION_PARTNER_ID";
    public static final java.lang.String _DISTRIBUTION_PARTNER_NAME = "DISTRIBUTION_PARTNER_NAME";
    public static final java.lang.String _CONTENT_PARTNER_ID = "CONTENT_PARTNER_ID";
    public static final java.lang.String _CONTENT_PARTNER_NAME = "CONTENT_PARTNER_NAME";
    public static final java.lang.String _RIGHTS_HOLDER_ID = "RIGHTS_HOLDER_ID";
    public static final java.lang.String _RIGHTS_HOLDER_NAME = "RIGHTS_HOLDER_NAME";
    public static final java.lang.String _PROPOSAL_LINE_ITEM_ID = "PROPOSAL_LINE_ITEM_ID";
    public static final java.lang.String _PROPOSAL_LINE_ITEM_NAME = "PROPOSAL_LINE_ITEM_NAME";
    public static final java.lang.String _PROPOSAL_ID = "PROPOSAL_ID";
    public static final java.lang.String _PROPOSAL_NAME = "PROPOSAL_NAME";
    public static final java.lang.String _PROPOSAL_SALESPERSON_ID = "PROPOSAL_SALESPERSON_ID";
    public static final java.lang.String _PROPOSAL_SALESPERSON_NAME = "PROPOSAL_SALESPERSON_NAME";
    public static final java.lang.String _PROPOSAL_ADVERTISER_ID = "PROPOSAL_ADVERTISER_ID";
    public static final java.lang.String _PROPOSAL_ADVERTISER_NAME = "PROPOSAL_ADVERTISER_NAME";
    public static final java.lang.String _PROPOSAL_AGENCY_ID = "PROPOSAL_AGENCY_ID";
    public static final java.lang.String _PROPOSAL_AGENCY_NAME = "PROPOSAL_AGENCY_NAME";
    public static final java.lang.String _PRODUCT_ID = "PRODUCT_ID";
    public static final java.lang.String _PRODUCT_NAME = "PRODUCT_NAME";
    public static final java.lang.String _PRODUCT_TEMPLATE_ID = "PRODUCT_TEMPLATE_ID";
    public static final java.lang.String _PRODUCT_TEMPLATE_NAME = "PRODUCT_TEMPLATE_NAME";
    public static final java.lang.String _AUDIENCE_SEGMENT_ID = "AUDIENCE_SEGMENT_ID";
    public static final java.lang.String _AUDIENCE_SEGMENT_NAME = "AUDIENCE_SEGMENT_NAME";
    public static final java.lang.String _AUDIENCE_SEGMENT_DATA_PROVIDER_NAME = "AUDIENCE_SEGMENT_DATA_PROVIDER_NAME";
    public static final Dimension MONTH = new Dimension(_MONTH);
    public static final Dimension MONTH_AND_YEAR = new Dimension(_MONTH_AND_YEAR);
    public static final Dimension WEEK = new Dimension(_WEEK);
    public static final Dimension DATE = new Dimension(_DATE);
    public static final Dimension DAY = new Dimension(_DAY);
    public static final Dimension HOUR = new Dimension(_HOUR);
    public static final Dimension LINE_ITEM_ID = new Dimension(_LINE_ITEM_ID);
    public static final Dimension LINE_ITEM_NAME = new Dimension(_LINE_ITEM_NAME);
    public static final Dimension LINE_ITEM_TYPE = new Dimension(_LINE_ITEM_TYPE);
    public static final Dimension ORDER_ID = new Dimension(_ORDER_ID);
    public static final Dimension ORDER_NAME = new Dimension(_ORDER_NAME);
    public static final Dimension ADVERTISER_ID = new Dimension(_ADVERTISER_ID);
    public static final Dimension ADVERTISER_NAME = new Dimension(_ADVERTISER_NAME);
    public static final Dimension SALESPERSON_ID = new Dimension(_SALESPERSON_ID);
    public static final Dimension SALESPERSON_NAME = new Dimension(_SALESPERSON_NAME);
    public static final Dimension CREATIVE_ID = new Dimension(_CREATIVE_ID);
    public static final Dimension CREATIVE_NAME = new Dimension(_CREATIVE_NAME);
    public static final Dimension CREATIVE_TYPE = new Dimension(_CREATIVE_TYPE);
    public static final Dimension CREATIVE_SIZE = new Dimension(_CREATIVE_SIZE);
    public static final Dimension AD_UNIT_ID = new Dimension(_AD_UNIT_ID);
    public static final Dimension AD_UNIT_NAME = new Dimension(_AD_UNIT_NAME);
    public static final Dimension PLACEMENT_ID = new Dimension(_PLACEMENT_ID);
    public static final Dimension PLACEMENT_NAME = new Dimension(_PLACEMENT_NAME);
    public static final Dimension GENERIC_CRITERION_NAME = new Dimension(_GENERIC_CRITERION_NAME);
    public static final Dimension COUNTRY_CRITERIA_ID = new Dimension(_COUNTRY_CRITERIA_ID);
    public static final Dimension COUNTRY_NAME = new Dimension(_COUNTRY_NAME);
    public static final Dimension REGION_CRITERIA_ID = new Dimension(_REGION_CRITERIA_ID);
    public static final Dimension REGION_NAME = new Dimension(_REGION_NAME);
    public static final Dimension CITY_CRITERIA_ID = new Dimension(_CITY_CRITERIA_ID);
    public static final Dimension CITY_NAME = new Dimension(_CITY_NAME);
    public static final Dimension METRO_CRITERIA_ID = new Dimension(_METRO_CRITERIA_ID);
    public static final Dimension METRO_NAME = new Dimension(_METRO_NAME);
    public static final Dimension POSTAL_CODE_CRITERIA_ID = new Dimension(_POSTAL_CODE_CRITERIA_ID);
    public static final Dimension POSTAL_CODE = new Dimension(_POSTAL_CODE);
    public static final Dimension CUSTOM_TARGETING_VALUE_ID = new Dimension(_CUSTOM_TARGETING_VALUE_ID);
    public static final Dimension CUSTOM_CRITERIA = new Dimension(_CUSTOM_CRITERIA);
    public static final Dimension ACTIVITY_ID = new Dimension(_ACTIVITY_ID);
    public static final Dimension ACTIVITY_NAME = new Dimension(_ACTIVITY_NAME);
    public static final Dimension ACTIVITY_GROUP_ID = new Dimension(_ACTIVITY_GROUP_ID);
    public static final Dimension ACTIVITY_GROUP_NAME = new Dimension(_ACTIVITY_GROUP_NAME);
    public static final Dimension CONTENT_ID = new Dimension(_CONTENT_ID);
    public static final Dimension CONTENT_NAME = new Dimension(_CONTENT_NAME);
    public static final Dimension AD_REQUEST_AD_UNIT_SIZES = new Dimension(_AD_REQUEST_AD_UNIT_SIZES);
    public static final Dimension AD_REQUEST_CUSTOM_CRITERIA = new Dimension(_AD_REQUEST_CUSTOM_CRITERIA);
    public static final Dimension MASTER_COMPANION_CREATIVE_ID = new Dimension(_MASTER_COMPANION_CREATIVE_ID);
    public static final Dimension MASTER_COMPANION_CREATIVE_NAME = new Dimension(_MASTER_COMPANION_CREATIVE_NAME);
    public static final Dimension DISTRIBUTION_PARTNER_ID = new Dimension(_DISTRIBUTION_PARTNER_ID);
    public static final Dimension DISTRIBUTION_PARTNER_NAME = new Dimension(_DISTRIBUTION_PARTNER_NAME);
    public static final Dimension CONTENT_PARTNER_ID = new Dimension(_CONTENT_PARTNER_ID);
    public static final Dimension CONTENT_PARTNER_NAME = new Dimension(_CONTENT_PARTNER_NAME);
    public static final Dimension RIGHTS_HOLDER_ID = new Dimension(_RIGHTS_HOLDER_ID);
    public static final Dimension RIGHTS_HOLDER_NAME = new Dimension(_RIGHTS_HOLDER_NAME);
    public static final Dimension PROPOSAL_LINE_ITEM_ID = new Dimension(_PROPOSAL_LINE_ITEM_ID);
    public static final Dimension PROPOSAL_LINE_ITEM_NAME = new Dimension(_PROPOSAL_LINE_ITEM_NAME);
    public static final Dimension PROPOSAL_ID = new Dimension(_PROPOSAL_ID);
    public static final Dimension PROPOSAL_NAME = new Dimension(_PROPOSAL_NAME);
    public static final Dimension PROPOSAL_SALESPERSON_ID = new Dimension(_PROPOSAL_SALESPERSON_ID);
    public static final Dimension PROPOSAL_SALESPERSON_NAME = new Dimension(_PROPOSAL_SALESPERSON_NAME);
    public static final Dimension PROPOSAL_ADVERTISER_ID = new Dimension(_PROPOSAL_ADVERTISER_ID);
    public static final Dimension PROPOSAL_ADVERTISER_NAME = new Dimension(_PROPOSAL_ADVERTISER_NAME);
    public static final Dimension PROPOSAL_AGENCY_ID = new Dimension(_PROPOSAL_AGENCY_ID);
    public static final Dimension PROPOSAL_AGENCY_NAME = new Dimension(_PROPOSAL_AGENCY_NAME);
    public static final Dimension PRODUCT_ID = new Dimension(_PRODUCT_ID);
    public static final Dimension PRODUCT_NAME = new Dimension(_PRODUCT_NAME);
    public static final Dimension PRODUCT_TEMPLATE_ID = new Dimension(_PRODUCT_TEMPLATE_ID);
    public static final Dimension PRODUCT_TEMPLATE_NAME = new Dimension(_PRODUCT_TEMPLATE_NAME);
    public static final Dimension AUDIENCE_SEGMENT_ID = new Dimension(_AUDIENCE_SEGMENT_ID);
    public static final Dimension AUDIENCE_SEGMENT_NAME = new Dimension(_AUDIENCE_SEGMENT_NAME);
    public static final Dimension AUDIENCE_SEGMENT_DATA_PROVIDER_NAME = new Dimension(_AUDIENCE_SEGMENT_DATA_PROVIDER_NAME);
    public java.lang.String getValue() { return _value_;}
    public static Dimension fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Dimension enumeration = (Dimension)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Dimension fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Dimension.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "Dimension"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
