// Copyright 2018 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * FeedItemAttributeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


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

    /* List of integer values. Should be set if feedAttributeId refers
     * to a feed attribute of type
     *                 INT64_LIST. Leave empty to clear an existing INT64_LIST
     * attribute value. */
    private long[] integerValues;

    /* List of double values. Should be set if feedAttributeId refers
     * to a feed attribute of type
     *                 FLOAT_LIST. Leave empty to clear an existing FLOAT_LIST
     * attribute value. */
    private double[] doubleValues;

    /* List of boolean values. Should be set if feedAttributeId refers
     * to a feed attribute of type
     *                 BOOLEAN_LIST. Leave empty to clear an existing BOOLEAN_LIST
     * attribute value. */
    private boolean[] booleanValues;

    /* List of string values. Should be set if feedAttributeId refers
     * to a feed attribute of type
     *                 STRING_LIST, URL_LIST, or DATE_TIME_LIST. All strings
     * in this list must be of the same type
     *                 and format. For example, if the type is DATE_TIME_LIST,
     * all strings in the list must be
     *                 DATE_TIME formatted strings. See {@link #stringValue}
     * for specific formatting requirements. */
    private java.lang.String[] stringValues;

    /* MoneyWithCurrency value. Should be set if feedAttributeId refers
     * to a feed attribute of type
     *                 PRICE. Leave empty to clear an existing PRICE attribute
     * value. */
    private com.google.api.ads.adwords.axis.v201802.cm.MoneyWithCurrency moneyWithCurrencyValue;

    public FeedItemAttributeValue() {
    }

    public FeedItemAttributeValue(
           java.lang.Long feedAttributeId,
           java.lang.Long integerValue,
           java.lang.Double doubleValue,
           java.lang.Boolean booleanValue,
           java.lang.String stringValue,
           long[] integerValues,
           double[] doubleValues,
           boolean[] booleanValues,
           java.lang.String[] stringValues,
           com.google.api.ads.adwords.axis.v201802.cm.MoneyWithCurrency moneyWithCurrencyValue) {
           this.feedAttributeId = feedAttributeId;
           this.integerValue = integerValue;
           this.doubleValue = doubleValue;
           this.booleanValue = booleanValue;
           this.stringValue = stringValue;
           this.integerValues = integerValues;
           this.doubleValues = doubleValues;
           this.booleanValues = booleanValues;
           this.stringValues = stringValues;
           this.moneyWithCurrencyValue = moneyWithCurrencyValue;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("booleanValue", getBooleanValue())
            .add("booleanValues", getBooleanValues())
            .add("doubleValue", getDoubleValue())
            .add("doubleValues", getDoubleValues())
            .add("feedAttributeId", getFeedAttributeId())
            .add("integerValue", getIntegerValue())
            .add("integerValues", getIntegerValues())
            .add("moneyWithCurrencyValue", getMoneyWithCurrencyValue())
            .add("stringValue", getStringValue())
            .add("stringValues", getStringValues())
            .toString();
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


    /**
     * Gets the integerValues value for this FeedItemAttributeValue.
     * 
     * @return integerValues   * List of integer values. Should be set if feedAttributeId refers
     * to a feed attribute of type
     *                 INT64_LIST. Leave empty to clear an existing INT64_LIST
     * attribute value.
     */
    public long[] getIntegerValues() {
        return integerValues;
    }


    /**
     * Sets the integerValues value for this FeedItemAttributeValue.
     * 
     * @param integerValues   * List of integer values. Should be set if feedAttributeId refers
     * to a feed attribute of type
     *                 INT64_LIST. Leave empty to clear an existing INT64_LIST
     * attribute value.
     */
    public void setIntegerValues(long[] integerValues) {
        this.integerValues = integerValues;
    }

    public long getIntegerValues(int i) {
        return this.integerValues[i];
    }

    public void setIntegerValues(int i, long _value) {
        this.integerValues[i] = _value;
    }


    /**
     * Gets the doubleValues value for this FeedItemAttributeValue.
     * 
     * @return doubleValues   * List of double values. Should be set if feedAttributeId refers
     * to a feed attribute of type
     *                 FLOAT_LIST. Leave empty to clear an existing FLOAT_LIST
     * attribute value.
     */
    public double[] getDoubleValues() {
        return doubleValues;
    }


    /**
     * Sets the doubleValues value for this FeedItemAttributeValue.
     * 
     * @param doubleValues   * List of double values. Should be set if feedAttributeId refers
     * to a feed attribute of type
     *                 FLOAT_LIST. Leave empty to clear an existing FLOAT_LIST
     * attribute value.
     */
    public void setDoubleValues(double[] doubleValues) {
        this.doubleValues = doubleValues;
    }

    public double getDoubleValues(int i) {
        return this.doubleValues[i];
    }

    public void setDoubleValues(int i, double _value) {
        this.doubleValues[i] = _value;
    }


    /**
     * Gets the booleanValues value for this FeedItemAttributeValue.
     * 
     * @return booleanValues   * List of boolean values. Should be set if feedAttributeId refers
     * to a feed attribute of type
     *                 BOOLEAN_LIST. Leave empty to clear an existing BOOLEAN_LIST
     * attribute value.
     */
    public boolean[] getBooleanValues() {
        return booleanValues;
    }


    /**
     * Sets the booleanValues value for this FeedItemAttributeValue.
     * 
     * @param booleanValues   * List of boolean values. Should be set if feedAttributeId refers
     * to a feed attribute of type
     *                 BOOLEAN_LIST. Leave empty to clear an existing BOOLEAN_LIST
     * attribute value.
     */
    public void setBooleanValues(boolean[] booleanValues) {
        this.booleanValues = booleanValues;
    }

    public boolean getBooleanValues(int i) {
        return this.booleanValues[i];
    }

    public void setBooleanValues(int i, boolean _value) {
        this.booleanValues[i] = _value;
    }


    /**
     * Gets the stringValues value for this FeedItemAttributeValue.
     * 
     * @return stringValues   * List of string values. Should be set if feedAttributeId refers
     * to a feed attribute of type
     *                 STRING_LIST, URL_LIST, or DATE_TIME_LIST. All strings
     * in this list must be of the same type
     *                 and format. For example, if the type is DATE_TIME_LIST,
     * all strings in the list must be
     *                 DATE_TIME formatted strings. See {@link #stringValue}
     * for specific formatting requirements.
     */
    public java.lang.String[] getStringValues() {
        return stringValues;
    }


    /**
     * Sets the stringValues value for this FeedItemAttributeValue.
     * 
     * @param stringValues   * List of string values. Should be set if feedAttributeId refers
     * to a feed attribute of type
     *                 STRING_LIST, URL_LIST, or DATE_TIME_LIST. All strings
     * in this list must be of the same type
     *                 and format. For example, if the type is DATE_TIME_LIST,
     * all strings in the list must be
     *                 DATE_TIME formatted strings. See {@link #stringValue}
     * for specific formatting requirements.
     */
    public void setStringValues(java.lang.String[] stringValues) {
        this.stringValues = stringValues;
    }

    public java.lang.String getStringValues(int i) {
        return this.stringValues[i];
    }

    public void setStringValues(int i, java.lang.String _value) {
        this.stringValues[i] = _value;
    }


    /**
     * Gets the moneyWithCurrencyValue value for this FeedItemAttributeValue.
     * 
     * @return moneyWithCurrencyValue   * MoneyWithCurrency value. Should be set if feedAttributeId refers
     * to a feed attribute of type
     *                 PRICE. Leave empty to clear an existing PRICE attribute
     * value.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.MoneyWithCurrency getMoneyWithCurrencyValue() {
        return moneyWithCurrencyValue;
    }


    /**
     * Sets the moneyWithCurrencyValue value for this FeedItemAttributeValue.
     * 
     * @param moneyWithCurrencyValue   * MoneyWithCurrency value. Should be set if feedAttributeId refers
     * to a feed attribute of type
     *                 PRICE. Leave empty to clear an existing PRICE attribute
     * value.
     */
    public void setMoneyWithCurrencyValue(com.google.api.ads.adwords.axis.v201802.cm.MoneyWithCurrency moneyWithCurrencyValue) {
        this.moneyWithCurrencyValue = moneyWithCurrencyValue;
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
              this.stringValue.equals(other.getStringValue()))) &&
            ((this.integerValues==null && other.getIntegerValues()==null) || 
             (this.integerValues!=null &&
              java.util.Arrays.equals(this.integerValues, other.getIntegerValues()))) &&
            ((this.doubleValues==null && other.getDoubleValues()==null) || 
             (this.doubleValues!=null &&
              java.util.Arrays.equals(this.doubleValues, other.getDoubleValues()))) &&
            ((this.booleanValues==null && other.getBooleanValues()==null) || 
             (this.booleanValues!=null &&
              java.util.Arrays.equals(this.booleanValues, other.getBooleanValues()))) &&
            ((this.stringValues==null && other.getStringValues()==null) || 
             (this.stringValues!=null &&
              java.util.Arrays.equals(this.stringValues, other.getStringValues()))) &&
            ((this.moneyWithCurrencyValue==null && other.getMoneyWithCurrencyValue()==null) || 
             (this.moneyWithCurrencyValue!=null &&
              this.moneyWithCurrencyValue.equals(other.getMoneyWithCurrencyValue())));
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
        if (getIntegerValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIntegerValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIntegerValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDoubleValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDoubleValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDoubleValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBooleanValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBooleanValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBooleanValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStringValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStringValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStringValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMoneyWithCurrencyValue() != null) {
            _hashCode += getMoneyWithCurrencyValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeedItemAttributeValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemAttributeValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedAttributeId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "feedAttributeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("integerValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "integerValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doubleValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "doubleValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("booleanValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "booleanValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stringValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "stringValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("integerValues");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "integerValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doubleValues");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "doubleValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("booleanValues");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "booleanValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stringValues");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "stringValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moneyWithCurrencyValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "moneyWithCurrencyValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "MoneyWithCurrency"));
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
