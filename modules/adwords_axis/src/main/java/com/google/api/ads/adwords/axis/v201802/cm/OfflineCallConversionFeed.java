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
 * OfflineCallConversionFeed.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents an entire record in the offline call conversions feed
 * that the advertiser uploads.
 */
public class OfflineCallConversionFeed  implements java.io.Serializable {
    /* The caller id from which this call was placed.
     *                 
     *                 <p>Caller ids in E.164 format with preceding '+' sign.
     * (e.g., "+16502531234", +443308182000),
     *                 National numbers which are treated as US numbers in
     * formats like "6502531234",
     *                 and International Numbers with accompanying country
     * code and preceding '+' like +64 3-331 6005
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 30, inclusive, (trimmed).</span> */
    private java.lang.String callerId;

    /* The time at which this call started.
     *                 <p> A time in the future is not allowed. A timezone
     * is always required.
     *                 
     *                 <p> When a conversion for the same caller id, conversion
     * name
     *                 and conversion time is uploaded multiple times, the
     * first one
     *                 results in a conversion being recorded. The duplicates
     * are
     *                 ignored and reported as successes, to indicate that
     * a conversion
     *                 for this combination has been recorded.
     *                 
     *                 <p>String Format: yyyyMMdd HHmmss <Timezone ID> (for
     * example, 20100609 150223
     *                 America/New_York). See the <a
     *                 href="https://developers.google.com/adwords/api/docs/appendix/timezones">Timezones</a>
     * page for
     *                 the complete list of Timezone IDs.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.String callStartTime;

    /* The type associated with this conversion.
     *                 <p>It is valid to report multiple conversions for
     * the same call
     *                 since visitors may trigger multiple conversions for
     * a
     *                 call. These conversions names are generated in the
     * front end by
     *                 advertisers.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 100, inclusive, (trimmed).</span> */
    private java.lang.String conversionName;

    /* The time that this conversion occurred at.
     *                 <p>This has to be after the call time. A time in the
     * future is not allowed.
     *                 A timezone is always required.
     *                 
     *                 <p>When a conversion for the same caller id, conversion
     * name
     *                 and conversion time is uploaded multiple times, the
     * first one
     *                 results in a conversion being recorded. The duplicates
     * are
     *                 ignored and reported as successes, to indicate that
     * a conversion
     *                 for this combination has been recorded.
     *                 
     *                 <p>String Format: yyyyMMdd HHmmss <Timezone ID> (for
     * example, 20100609 150223
     *                 America/New_York). See the <a
     *                 href="https://developers.google.com/adwords/api/docs/appendix/timezones">Timezones</a>
     * page for
     *                 the complete list of Timezone IDs. */
    private java.lang.String conversionTime;

    /* This conversions value for the advertiser.
     *                 <span class="constraint InRange">This field must be
     * greater than or equal to 0.</span> */
    private java.lang.Double conversionValue;

    /* The currency that the advertiser associates with the conversion
     * value. This is the ISO 4217
     *                 3-character currency code. For example: USD, EUR.
     *                 <span class="constraint StringLength">The length of
     * this string should be between 3 and 3, inclusive, (trimmed).</span> */
    private java.lang.String conversionCurrencyCode;

    public OfflineCallConversionFeed() {
    }

    public OfflineCallConversionFeed(
           java.lang.String callerId,
           java.lang.String callStartTime,
           java.lang.String conversionName,
           java.lang.String conversionTime,
           java.lang.Double conversionValue,
           java.lang.String conversionCurrencyCode) {
           this.callerId = callerId;
           this.callStartTime = callStartTime;
           this.conversionName = conversionName;
           this.conversionTime = conversionTime;
           this.conversionValue = conversionValue;
           this.conversionCurrencyCode = conversionCurrencyCode;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("callStartTime", getCallStartTime())
            .add("callerId", getCallerId())
            .add("conversionCurrencyCode", getConversionCurrencyCode())
            .add("conversionName", getConversionName())
            .add("conversionTime", getConversionTime())
            .add("conversionValue", getConversionValue())
            .toString();
    }

    /**
     * Gets the callerId value for this OfflineCallConversionFeed.
     * 
     * @return callerId   * The caller id from which this call was placed.
     *                 
     *                 <p>Caller ids in E.164 format with preceding '+' sign.
     * (e.g., "+16502531234", +443308182000),
     *                 National numbers which are treated as US numbers in
     * formats like "6502531234",
     *                 and International Numbers with accompanying country
     * code and preceding '+' like +64 3-331 6005
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 30, inclusive, (trimmed).</span>
     */
    public java.lang.String getCallerId() {
        return callerId;
    }


    /**
     * Sets the callerId value for this OfflineCallConversionFeed.
     * 
     * @param callerId   * The caller id from which this call was placed.
     *                 
     *                 <p>Caller ids in E.164 format with preceding '+' sign.
     * (e.g., "+16502531234", +443308182000),
     *                 National numbers which are treated as US numbers in
     * formats like "6502531234",
     *                 and International Numbers with accompanying country
     * code and preceding '+' like +64 3-331 6005
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 30, inclusive, (trimmed).</span>
     */
    public void setCallerId(java.lang.String callerId) {
        this.callerId = callerId;
    }


    /**
     * Gets the callStartTime value for this OfflineCallConversionFeed.
     * 
     * @return callStartTime   * The time at which this call started.
     *                 <p> A time in the future is not allowed. A timezone
     * is always required.
     *                 
     *                 <p> When a conversion for the same caller id, conversion
     * name
     *                 and conversion time is uploaded multiple times, the
     * first one
     *                 results in a conversion being recorded. The duplicates
     * are
     *                 ignored and reported as successes, to indicate that
     * a conversion
     *                 for this combination has been recorded.
     *                 
     *                 <p>String Format: yyyyMMdd HHmmss <Timezone ID> (for
     * example, 20100609 150223
     *                 America/New_York). See the <a
     *                 href="https://developers.google.com/adwords/api/docs/appendix/timezones">Timezones</a>
     * page for
     *                 the complete list of Timezone IDs.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.String getCallStartTime() {
        return callStartTime;
    }


    /**
     * Sets the callStartTime value for this OfflineCallConversionFeed.
     * 
     * @param callStartTime   * The time at which this call started.
     *                 <p> A time in the future is not allowed. A timezone
     * is always required.
     *                 
     *                 <p> When a conversion for the same caller id, conversion
     * name
     *                 and conversion time is uploaded multiple times, the
     * first one
     *                 results in a conversion being recorded. The duplicates
     * are
     *                 ignored and reported as successes, to indicate that
     * a conversion
     *                 for this combination has been recorded.
     *                 
     *                 <p>String Format: yyyyMMdd HHmmss <Timezone ID> (for
     * example, 20100609 150223
     *                 America/New_York). See the <a
     *                 href="https://developers.google.com/adwords/api/docs/appendix/timezones">Timezones</a>
     * page for
     *                 the complete list of Timezone IDs.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setCallStartTime(java.lang.String callStartTime) {
        this.callStartTime = callStartTime;
    }


    /**
     * Gets the conversionName value for this OfflineCallConversionFeed.
     * 
     * @return conversionName   * The type associated with this conversion.
     *                 <p>It is valid to report multiple conversions for
     * the same call
     *                 since visitors may trigger multiple conversions for
     * a
     *                 call. These conversions names are generated in the
     * front end by
     *                 advertisers.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 100, inclusive, (trimmed).</span>
     */
    public java.lang.String getConversionName() {
        return conversionName;
    }


    /**
     * Sets the conversionName value for this OfflineCallConversionFeed.
     * 
     * @param conversionName   * The type associated with this conversion.
     *                 <p>It is valid to report multiple conversions for
     * the same call
     *                 since visitors may trigger multiple conversions for
     * a
     *                 call. These conversions names are generated in the
     * front end by
     *                 advertisers.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 100, inclusive, (trimmed).</span>
     */
    public void setConversionName(java.lang.String conversionName) {
        this.conversionName = conversionName;
    }


    /**
     * Gets the conversionTime value for this OfflineCallConversionFeed.
     * 
     * @return conversionTime   * The time that this conversion occurred at.
     *                 <p>This has to be after the call time. A time in the
     * future is not allowed.
     *                 A timezone is always required.
     *                 
     *                 <p>When a conversion for the same caller id, conversion
     * name
     *                 and conversion time is uploaded multiple times, the
     * first one
     *                 results in a conversion being recorded. The duplicates
     * are
     *                 ignored and reported as successes, to indicate that
     * a conversion
     *                 for this combination has been recorded.
     *                 
     *                 <p>String Format: yyyyMMdd HHmmss <Timezone ID> (for
     * example, 20100609 150223
     *                 America/New_York). See the <a
     *                 href="https://developers.google.com/adwords/api/docs/appendix/timezones">Timezones</a>
     * page for
     *                 the complete list of Timezone IDs.
     */
    public java.lang.String getConversionTime() {
        return conversionTime;
    }


    /**
     * Sets the conversionTime value for this OfflineCallConversionFeed.
     * 
     * @param conversionTime   * The time that this conversion occurred at.
     *                 <p>This has to be after the call time. A time in the
     * future is not allowed.
     *                 A timezone is always required.
     *                 
     *                 <p>When a conversion for the same caller id, conversion
     * name
     *                 and conversion time is uploaded multiple times, the
     * first one
     *                 results in a conversion being recorded. The duplicates
     * are
     *                 ignored and reported as successes, to indicate that
     * a conversion
     *                 for this combination has been recorded.
     *                 
     *                 <p>String Format: yyyyMMdd HHmmss <Timezone ID> (for
     * example, 20100609 150223
     *                 America/New_York). See the <a
     *                 href="https://developers.google.com/adwords/api/docs/appendix/timezones">Timezones</a>
     * page for
     *                 the complete list of Timezone IDs.
     */
    public void setConversionTime(java.lang.String conversionTime) {
        this.conversionTime = conversionTime;
    }


    /**
     * Gets the conversionValue value for this OfflineCallConversionFeed.
     * 
     * @return conversionValue   * This conversions value for the advertiser.
     *                 <span class="constraint InRange">This field must be
     * greater than or equal to 0.</span>
     */
    public java.lang.Double getConversionValue() {
        return conversionValue;
    }


    /**
     * Sets the conversionValue value for this OfflineCallConversionFeed.
     * 
     * @param conversionValue   * This conversions value for the advertiser.
     *                 <span class="constraint InRange">This field must be
     * greater than or equal to 0.</span>
     */
    public void setConversionValue(java.lang.Double conversionValue) {
        this.conversionValue = conversionValue;
    }


    /**
     * Gets the conversionCurrencyCode value for this OfflineCallConversionFeed.
     * 
     * @return conversionCurrencyCode   * The currency that the advertiser associates with the conversion
     * value. This is the ISO 4217
     *                 3-character currency code. For example: USD, EUR.
     *                 <span class="constraint StringLength">The length of
     * this string should be between 3 and 3, inclusive, (trimmed).</span>
     */
    public java.lang.String getConversionCurrencyCode() {
        return conversionCurrencyCode;
    }


    /**
     * Sets the conversionCurrencyCode value for this OfflineCallConversionFeed.
     * 
     * @param conversionCurrencyCode   * The currency that the advertiser associates with the conversion
     * value. This is the ISO 4217
     *                 3-character currency code. For example: USD, EUR.
     *                 <span class="constraint StringLength">The length of
     * this string should be between 3 and 3, inclusive, (trimmed).</span>
     */
    public void setConversionCurrencyCode(java.lang.String conversionCurrencyCode) {
        this.conversionCurrencyCode = conversionCurrencyCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OfflineCallConversionFeed)) return false;
        OfflineCallConversionFeed other = (OfflineCallConversionFeed) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.callerId==null && other.getCallerId()==null) || 
             (this.callerId!=null &&
              this.callerId.equals(other.getCallerId()))) &&
            ((this.callStartTime==null && other.getCallStartTime()==null) || 
             (this.callStartTime!=null &&
              this.callStartTime.equals(other.getCallStartTime()))) &&
            ((this.conversionName==null && other.getConversionName()==null) || 
             (this.conversionName!=null &&
              this.conversionName.equals(other.getConversionName()))) &&
            ((this.conversionTime==null && other.getConversionTime()==null) || 
             (this.conversionTime!=null &&
              this.conversionTime.equals(other.getConversionTime()))) &&
            ((this.conversionValue==null && other.getConversionValue()==null) || 
             (this.conversionValue!=null &&
              this.conversionValue.equals(other.getConversionValue()))) &&
            ((this.conversionCurrencyCode==null && other.getConversionCurrencyCode()==null) || 
             (this.conversionCurrencyCode!=null &&
              this.conversionCurrencyCode.equals(other.getConversionCurrencyCode())));
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
        if (getCallerId() != null) {
            _hashCode += getCallerId().hashCode();
        }
        if (getCallStartTime() != null) {
            _hashCode += getCallStartTime().hashCode();
        }
        if (getConversionName() != null) {
            _hashCode += getConversionName().hashCode();
        }
        if (getConversionTime() != null) {
            _hashCode += getConversionTime().hashCode();
        }
        if (getConversionValue() != null) {
            _hashCode += getConversionValue().hashCode();
        }
        if (getConversionCurrencyCode() != null) {
            _hashCode += getConversionCurrencyCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OfflineCallConversionFeed.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "OfflineCallConversionFeed"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callerId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "callerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "callStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "conversionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "conversionTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "conversionValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionCurrencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "conversionCurrencyCode"));
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
