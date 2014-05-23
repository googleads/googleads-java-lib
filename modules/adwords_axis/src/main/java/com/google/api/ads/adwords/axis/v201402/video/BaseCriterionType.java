/**
 * BaseCriterionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.video;

public class BaseCriterionType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BaseCriterionType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AGE = "AGE";
    public static final java.lang.String _CARRIER = "CARRIER";
    public static final java.lang.String _CHANNEL = "CHANNEL";
    public static final java.lang.String _CONTENT_KEYWORD = "CONTENT_KEYWORD";
    public static final java.lang.String _CONTENT_LABEL = "CONTENT_LABEL";
    public static final java.lang.String _GENDER = "GENDER";
    public static final java.lang.String _INTEREST = "INTEREST";
    public static final java.lang.String _KEYWORD = "KEYWORD";
    public static final java.lang.String _LANGUAGE = "LANGUAGE";
    public static final java.lang.String _LOCATION = "LOCATION";
    public static final java.lang.String _MOBILE_APPLICATION = "MOBILE_APPLICATION";
    public static final java.lang.String _MOBILE_APP_CATEGORY = "MOBILE_APP_CATEGORY";
    public static final java.lang.String _MOBILE_DEVICE = "MOBILE_DEVICE";
    public static final java.lang.String _OPERATING_SYSTEM_VERSION = "OPERATING_SYSTEM_VERSION";
    public static final java.lang.String _PLATFORM = "PLATFORM";
    public static final java.lang.String _RUN_OF_YOUTUBE = "RUN_OF_YOUTUBE";
    public static final java.lang.String _SCHEDULE = "SCHEDULE";
    public static final java.lang.String _SEARCH_KEYWORD = "SEARCH_KEYWORD";
    public static final java.lang.String _USER_LIST = "USER_LIST";
    public static final java.lang.String _VERTICAL = "VERTICAL";
    public static final java.lang.String _VIDEO = "VIDEO";
    public static final java.lang.String _WEB_SITE = "WEB_SITE";
    public static final java.lang.String _YOUTUBE_PLACEMENT = "YOUTUBE_PLACEMENT";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final BaseCriterionType AGE = new BaseCriterionType(_AGE);
    public static final BaseCriterionType CARRIER = new BaseCriterionType(_CARRIER);
    public static final BaseCriterionType CHANNEL = new BaseCriterionType(_CHANNEL);
    public static final BaseCriterionType CONTENT_KEYWORD = new BaseCriterionType(_CONTENT_KEYWORD);
    public static final BaseCriterionType CONTENT_LABEL = new BaseCriterionType(_CONTENT_LABEL);
    public static final BaseCriterionType GENDER = new BaseCriterionType(_GENDER);
    public static final BaseCriterionType INTEREST = new BaseCriterionType(_INTEREST);
    public static final BaseCriterionType KEYWORD = new BaseCriterionType(_KEYWORD);
    public static final BaseCriterionType LANGUAGE = new BaseCriterionType(_LANGUAGE);
    public static final BaseCriterionType LOCATION = new BaseCriterionType(_LOCATION);
    public static final BaseCriterionType MOBILE_APPLICATION = new BaseCriterionType(_MOBILE_APPLICATION);
    public static final BaseCriterionType MOBILE_APP_CATEGORY = new BaseCriterionType(_MOBILE_APP_CATEGORY);
    public static final BaseCriterionType MOBILE_DEVICE = new BaseCriterionType(_MOBILE_DEVICE);
    public static final BaseCriterionType OPERATING_SYSTEM_VERSION = new BaseCriterionType(_OPERATING_SYSTEM_VERSION);
    public static final BaseCriterionType PLATFORM = new BaseCriterionType(_PLATFORM);
    public static final BaseCriterionType RUN_OF_YOUTUBE = new BaseCriterionType(_RUN_OF_YOUTUBE);
    public static final BaseCriterionType SCHEDULE = new BaseCriterionType(_SCHEDULE);
    public static final BaseCriterionType SEARCH_KEYWORD = new BaseCriterionType(_SEARCH_KEYWORD);
    public static final BaseCriterionType USER_LIST = new BaseCriterionType(_USER_LIST);
    public static final BaseCriterionType VERTICAL = new BaseCriterionType(_VERTICAL);
    public static final BaseCriterionType VIDEO = new BaseCriterionType(_VIDEO);
    public static final BaseCriterionType WEB_SITE = new BaseCriterionType(_WEB_SITE);
    public static final BaseCriterionType YOUTUBE_PLACEMENT = new BaseCriterionType(_YOUTUBE_PLACEMENT);
    public static final BaseCriterionType UNKNOWN = new BaseCriterionType(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static BaseCriterionType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        BaseCriterionType enumeration = (BaseCriterionType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BaseCriterionType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BaseCriterionType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "BaseCriterion.Type"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
