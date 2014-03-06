/**
 * FeedItemAttributeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201306.cm;


/**
 * Represents a feed item's value for a particular feed attribute.
 * A feed item's value is
 *             composed of a collection of these attribute values.
 */
public class FeedItemAttributeValue  implements java.io.Serializable {
    /* Feed attribute id */
    private java.lang.Long feedAttributeId;

    /* Integer value. Should be set if feedAttributeId refers to a
     * feed attribute of type INT64. Leave
     *                 empty to clear an existing INT64 attribute value. */
    private java.lang.Long integerValue;

    /* Double value. Should be set if feedAttributeId refers to a
     * feed attribute of type FLOAT. Leave
     *                 empty to clear an existing FLOAT attribute value. */
    private java.lang.Double doubleValue;

    /* Boolean value. Should be set if feedAttributeId refers to a
     * feed attribute of type BOOLEAN.
     *                 Leave empty to clear an existing BOOLEAN attribute
     * value. */
    private java.lang.Boolean booleanValue;

    /* String value. Should be set if feedAttributeId refers to a
     * feed attribute of type STRING,
     *                 URL, or DATE_TIME.
     *                 The format of DATE_TIME is 'YYYYMMDD hhmmss' (e.g.,
     * 20130101 163031 to represent
     *                 Jan 1, 2013 4:30:31pm). All date times are interpreted
     * in the account's time zone.
     *                 A time zone id may be appended to the date time, but
     * it must match the account's time zone.
     *                 For example '20130101 163031 America/Los_Angeles'
     * may be specified in the above example as long
     *                 as the account's time zone is America/Los_Angeles.
     * Leave empty to clear an existing STRING, URL, or DATE_TIME attribute
     * value. */
    private java.lang.String stringValue;

    public FeedItemAttributeValue() {
    }

    public FeedItemAttributeValue(
           java.lang.Long feedAttributeId,
           java.lang.Long integerValue,
           java.lang.Double doubleValue,
           java.lang.Boolean booleanValue,
           java.lang.String stringValue) {
           this.feedAttributeId = feedAttributeId;
           this.integerValue = integerValue;
           this.doubleValue = doubleValue;
           this.booleanValue = booleanValue;
           this.stringValue = stringValue;
    }


    /**
     * Gets the feedAttributeId value for this FeedItemAttributeValue.
     * 
     * @return feedAttributeId   * Feed attribute id
     */
    public java.lang.Long getFeedAttributeId() {
        return feedAttributeId;
    }


    /**
     * Sets the feedAttributeId value for this FeedItemAttributeValue.
     * 
     * @param feedAttributeId   * Feed attribute id
     */
    public void setFeedAttributeId(java.lang.Long feedAttributeId) {
        this.feedAttributeId = feedAttributeId;
    }


    /**
     * Gets the integerValue value for this FeedItemAttributeValue.
     * 
     * @return integerValue   * Integer value. Should be set if feedAttributeId refers to a
     * feed attribute of type INT64. Leave
     *                 empty to clear an existing INT64 attribute value.
     */
    public java.lang.Long getIntegerValue() {
        return integerValue;
    }


    /**
     * Sets the integerValue value for this FeedItemAttributeValue.
     * 
     * @param integerValue   * Integer value. Should be set if feedAttributeId refers to a
     * feed attribute of type INT64. Leave
     *                 empty to clear an existing INT64 attribute value.
     */
    public void setIntegerValue(java.lang.Long integerValue) {
        this.integerValue = integerValue;
    }


    /**
     * Gets the doubleValue value for this FeedItemAttributeValue.
     * 
     * @return doubleValue   * Double value. Should be set if feedAttributeId refers to a
     * feed attribute of type FLOAT. Leave
     *                 empty to clear an existing FLOAT attribute value.
     */
    public java.lang.Double getDoubleValue() {
        return doubleValue;
    }


    /**
     * Sets the doubleValue value for this FeedItemAttributeValue.
     * 
     * @param doubleValue   * Double value. Should be set if feedAttributeId refers to a
     * feed attribute of type FLOAT. Leave
     *                 empty to clear an existing FLOAT attribute value.
     */
    public void setDoubleValue(java.lang.Double doubleValue) {
        this.doubleValue = doubleValue;
    }


    /**
     * Gets the booleanValue value for this FeedItemAttributeValue.
     * 
     * @return booleanValue   * Boolean value. Should be set if feedAttributeId refers to a
     * feed attribute of type BOOLEAN.
     *                 Leave empty to clear an existing BOOLEAN attribute
     * value.
     */
    public java.lang.Boolean getBooleanValue() {
        return booleanValue;
    }


    /**
     * Sets the booleanValue value for this FeedItemAttributeValue.
     * 
     * @param booleanValue   * Boolean value. Should be set if feedAttributeId refers to a
     * feed attribute of type BOOLEAN.
     *                 Leave empty to clear an existing BOOLEAN attribute
     * value.
     */
    public void setBooleanValue(java.lang.Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }


    /**
     * Gets the stringValue value for this FeedItemAttributeValue.
     * 
     * @return stringValue   * String value. Should be set if feedAttributeId refers to a
     * feed attribute of type STRING,
     *                 URL, or DATE_TIME.
     *                 The format of DATE_TIME is 'YYYYMMDD hhmmss' (e.g.,
     * 20130101 163031 to represent
     *                 Jan 1, 2013 4:30:31pm). All date times are interpreted
     * in the account's time zone.
     *                 A time zone id may be appended to the date time, but
     * it must match the account's time zone.
     *                 For example '20130101 163031 America/Los_Angeles'
     * may be specified in the above example as long
     *                 as the account's time zone is America/Los_Angeles.
     * Leave empty to clear an existing STRING, URL, or DATE_TIME attribute
     * value.
     */
    public java.lang.String getStringValue() {
        return stringValue;
    }


    /**
     * Sets the stringValue value for this FeedItemAttributeValue.
     * 
     * @param stringValue   * String value. Should be set if feedAttributeId refers to a
     * feed attribute of type STRING,
     *                 URL, or DATE_TIME.
     *                 The format of DATE_TIME is 'YYYYMMDD hhmmss' (e.g.,
     * 20130101 163031 to represent
     *                 Jan 1, 2013 4:30:31pm). All date times are interpreted
     * in the account's time zone.
     *                 A time zone id may be appended to the date time, but
     * it must match the account's time zone.
     *                 For example '20130101 163031 America/Los_Angeles'
     * may be specified in the above example as long
     *                 as the account's time zone is America/Los_Angeles.
     * Leave empty to clear an existing STRING, URL, or DATE_TIME attribute
     * value.
     */
    public void setStringValue(java.lang.String stringValue) {
        this.stringValue = stringValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeedItemAttributeValue)) return false;
        FeedItemAttributeValue other = (FeedItemAttributeValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.feedAttributeId==null && other.getFeedAttributeId()==null) || 
             (this.feedAttributeId!=null &&
              this.feedAttributeId.equals(other.getFeedAttributeId()))) &&
            ((this.integerValue==null && other.getIntegerValue()==null) || 
             (this.integerValue!=null &&
              this.integerValue.equals(other.getIntegerValue()))) &&
            ((this.doubleValue==null && other.getDoubleValue()==null) || 
             (this.doubleValue!=null &&
              this.doubleValue.equals(other.getDoubleValue()))) &&
            ((this.booleanValue==null && other.getBooleanValue()==null) || 
             (this.booleanValue!=null &&
              this.booleanValue.equals(other.getBooleanValue()))) &&
            ((this.stringValue==null && other.getStringValue()==null) || 
             (this.stringValue!=null &&
              this.stringValue.equals(other.getStringValue())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getFeedAttributeId() != null) {
            _hashCode += getFeedAttributeId().hashCode();
        }
        if (getIntegerValue() != null) {
            _hashCode += getIntegerValue().hashCode();
        }
        if (getDoubleValue() != null) {
            _hashCode += getDoubleValue().hashCode();
        }
        if (getBooleanValue() != null) {
            _hashCode += getBooleanValue().hashCode();
        }
        if (getStringValue() != null) {
            _hashCode += getStringValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeedItemAttributeValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "FeedItemAttributeValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedAttributeId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "feedAttributeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("integerValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "integerValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doubleValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "doubleValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("booleanValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "booleanValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stringValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "stringValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
