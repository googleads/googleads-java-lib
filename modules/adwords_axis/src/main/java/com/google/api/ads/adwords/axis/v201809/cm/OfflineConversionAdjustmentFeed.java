// Copyright 2018 Google LLC
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
 * OfflineConversionAdjustmentFeed.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201809.cm;


/**
 * Represents a record in the offline conversion adjustments feed
 * that advertisers upload.
 *             This class is inherited by GclidOfflineConversionAdjustmentFeed
 * and
 *             OrderIdOfflineConversionAdjustmentFeed because advertisers
 * upload conversion name and
 *             either (order id) or (gclid, conversion time) to identify
 * a conversion.
 */
public abstract class OfflineConversionAdjustmentFeed  implements java.io.Serializable {
    /* The name associated with the conversion for this adjustment
     * <span class="constraint Required">This field is required and should
     * not be {@code null}.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 100, inclusive, (trimmed).</span> */
    private java.lang.String conversionName;

    /* The instant that this adjustment occurred as reported by the
     * advertiser.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.String adjustmentTime;

    /* The adjustment type.
     *                 (RETRACT, RESTATE)
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201809.cm.OfflineConversionAdjustmentType adjustmentType;

    /* The adjusted value used for restatements. This is the value
     * of the conversion after
     *                 adjustment. For example, to change the value of a
     * conversion from 100 to 70, an
     *                 adjusted value of 70 should be reported.
     *                 This is required for restatements and should not be
     * used for retractions. An error
     *                 will be returned if an adjusted value is provided
     * for a retraction.
     *                 <span class="constraint InRange">This field must be
     * greater than or equal to 0.</span> */
    private java.lang.Double adjustedValue;

    /* The currency of the adjusted value. This is can be used for
     * restatements and should not
     *                 be used for retractions. An error will be returned
     * if a adjustedValueCurrency is provided
     *                 for a retraction. If not provided for a restatement,
     * then the default currency
     *                 from the conversion type is used, and if that is not
     * set then the account currency is used.
     *                 This is the ISO 4217 3-character currency code e.g.
     * USD or EUR.
     *                 <span class="constraint StringLength">The length of
     * this string should be between 3 and 3, inclusive, (trimmed).</span> */
    private java.lang.String adjustedValueCurrencyCode;

    /* Indicates that this instance is a subtype of OfflineConversionAdjustmentFeed.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String offlineConversionAdjustmentFeedType;

    public OfflineConversionAdjustmentFeed() {
    }

    public OfflineConversionAdjustmentFeed(
           java.lang.String conversionName,
           java.lang.String adjustmentTime,
           com.google.api.ads.adwords.axis.v201809.cm.OfflineConversionAdjustmentType adjustmentType,
           java.lang.Double adjustedValue,
           java.lang.String adjustedValueCurrencyCode,
           java.lang.String offlineConversionAdjustmentFeedType) {
           this.conversionName = conversionName;
           this.adjustmentTime = adjustmentTime;
           this.adjustmentType = adjustmentType;
           this.adjustedValue = adjustedValue;
           this.adjustedValueCurrencyCode = adjustedValueCurrencyCode;
           this.offlineConversionAdjustmentFeedType = offlineConversionAdjustmentFeedType;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adjustedValue", getAdjustedValue())
            .add("adjustedValueCurrencyCode", getAdjustedValueCurrencyCode())
            .add("adjustmentTime", getAdjustmentTime())
            .add("adjustmentType", getAdjustmentType())
            .add("conversionName", getConversionName())
            .add("offlineConversionAdjustmentFeedType", getOfflineConversionAdjustmentFeedType())
            .toString();
    }

    /**
     * Gets the conversionName value for this OfflineConversionAdjustmentFeed.
     * 
     * @return conversionName   * The name associated with the conversion for this adjustment
     * <span class="constraint Required">This field is required and should
     * not be {@code null}.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 100, inclusive, (trimmed).</span>
     */
    public java.lang.String getConversionName() {
        return conversionName;
    }


    /**
     * Sets the conversionName value for this OfflineConversionAdjustmentFeed.
     * 
     * @param conversionName   * The name associated with the conversion for this adjustment
     * <span class="constraint Required">This field is required and should
     * not be {@code null}.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 100, inclusive, (trimmed).</span>
     */
    public void setConversionName(java.lang.String conversionName) {
        this.conversionName = conversionName;
    }


    /**
     * Gets the adjustmentTime value for this OfflineConversionAdjustmentFeed.
     * 
     * @return adjustmentTime   * The instant that this adjustment occurred as reported by the
     * advertiser.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.String getAdjustmentTime() {
        return adjustmentTime;
    }


    /**
     * Sets the adjustmentTime value for this OfflineConversionAdjustmentFeed.
     * 
     * @param adjustmentTime   * The instant that this adjustment occurred as reported by the
     * advertiser.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setAdjustmentTime(java.lang.String adjustmentTime) {
        this.adjustmentTime = adjustmentTime;
    }


    /**
     * Gets the adjustmentType value for this OfflineConversionAdjustmentFeed.
     * 
     * @return adjustmentType   * The adjustment type.
     *                 (RETRACT, RESTATE)
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201809.cm.OfflineConversionAdjustmentType getAdjustmentType() {
        return adjustmentType;
    }


    /**
     * Sets the adjustmentType value for this OfflineConversionAdjustmentFeed.
     * 
     * @param adjustmentType   * The adjustment type.
     *                 (RETRACT, RESTATE)
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setAdjustmentType(com.google.api.ads.adwords.axis.v201809.cm.OfflineConversionAdjustmentType adjustmentType) {
        this.adjustmentType = adjustmentType;
    }


    /**
     * Gets the adjustedValue value for this OfflineConversionAdjustmentFeed.
     * 
     * @return adjustedValue   * The adjusted value used for restatements. This is the value
     * of the conversion after
     *                 adjustment. For example, to change the value of a
     * conversion from 100 to 70, an
     *                 adjusted value of 70 should be reported.
     *                 This is required for restatements and should not be
     * used for retractions. An error
     *                 will be returned if an adjusted value is provided
     * for a retraction.
     *                 <span class="constraint InRange">This field must be
     * greater than or equal to 0.</span>
     */
    public java.lang.Double getAdjustedValue() {
        return adjustedValue;
    }


    /**
     * Sets the adjustedValue value for this OfflineConversionAdjustmentFeed.
     * 
     * @param adjustedValue   * The adjusted value used for restatements. This is the value
     * of the conversion after
     *                 adjustment. For example, to change the value of a
     * conversion from 100 to 70, an
     *                 adjusted value of 70 should be reported.
     *                 This is required for restatements and should not be
     * used for retractions. An error
     *                 will be returned if an adjusted value is provided
     * for a retraction.
     *                 <span class="constraint InRange">This field must be
     * greater than or equal to 0.</span>
     */
    public void setAdjustedValue(java.lang.Double adjustedValue) {
        this.adjustedValue = adjustedValue;
    }


    /**
     * Gets the adjustedValueCurrencyCode value for this OfflineConversionAdjustmentFeed.
     * 
     * @return adjustedValueCurrencyCode   * The currency of the adjusted value. This is can be used for
     * restatements and should not
     *                 be used for retractions. An error will be returned
     * if a adjustedValueCurrency is provided
     *                 for a retraction. If not provided for a restatement,
     * then the default currency
     *                 from the conversion type is used, and if that is not
     * set then the account currency is used.
     *                 This is the ISO 4217 3-character currency code e.g.
     * USD or EUR.
     *                 <span class="constraint StringLength">The length of
     * this string should be between 3 and 3, inclusive, (trimmed).</span>
     */
    public java.lang.String getAdjustedValueCurrencyCode() {
        return adjustedValueCurrencyCode;
    }


    /**
     * Sets the adjustedValueCurrencyCode value for this OfflineConversionAdjustmentFeed.
     * 
     * @param adjustedValueCurrencyCode   * The currency of the adjusted value. This is can be used for
     * restatements and should not
     *                 be used for retractions. An error will be returned
     * if a adjustedValueCurrency is provided
     *                 for a retraction. If not provided for a restatement,
     * then the default currency
     *                 from the conversion type is used, and if that is not
     * set then the account currency is used.
     *                 This is the ISO 4217 3-character currency code e.g.
     * USD or EUR.
     *                 <span class="constraint StringLength">The length of
     * this string should be between 3 and 3, inclusive, (trimmed).</span>
     */
    public void setAdjustedValueCurrencyCode(java.lang.String adjustedValueCurrencyCode) {
        this.adjustedValueCurrencyCode = adjustedValueCurrencyCode;
    }


    /**
     * Gets the offlineConversionAdjustmentFeedType value for this OfflineConversionAdjustmentFeed.
     * 
     * @return offlineConversionAdjustmentFeedType   * Indicates that this instance is a subtype of OfflineConversionAdjustmentFeed.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getOfflineConversionAdjustmentFeedType() {
        return offlineConversionAdjustmentFeedType;
    }


    /**
     * Sets the offlineConversionAdjustmentFeedType value for this OfflineConversionAdjustmentFeed.
     * 
     * @param offlineConversionAdjustmentFeedType   * Indicates that this instance is a subtype of OfflineConversionAdjustmentFeed.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setOfflineConversionAdjustmentFeedType(java.lang.String offlineConversionAdjustmentFeedType) {
        this.offlineConversionAdjustmentFeedType = offlineConversionAdjustmentFeedType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OfflineConversionAdjustmentFeed)) return false;
        OfflineConversionAdjustmentFeed other = (OfflineConversionAdjustmentFeed) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.conversionName==null && other.getConversionName()==null) || 
             (this.conversionName!=null &&
              this.conversionName.equals(other.getConversionName()))) &&
            ((this.adjustmentTime==null && other.getAdjustmentTime()==null) || 
             (this.adjustmentTime!=null &&
              this.adjustmentTime.equals(other.getAdjustmentTime()))) &&
            ((this.adjustmentType==null && other.getAdjustmentType()==null) || 
             (this.adjustmentType!=null &&
              this.adjustmentType.equals(other.getAdjustmentType()))) &&
            ((this.adjustedValue==null && other.getAdjustedValue()==null) || 
             (this.adjustedValue!=null &&
              this.adjustedValue.equals(other.getAdjustedValue()))) &&
            ((this.adjustedValueCurrencyCode==null && other.getAdjustedValueCurrencyCode()==null) || 
             (this.adjustedValueCurrencyCode!=null &&
              this.adjustedValueCurrencyCode.equals(other.getAdjustedValueCurrencyCode()))) &&
            ((this.offlineConversionAdjustmentFeedType==null && other.getOfflineConversionAdjustmentFeedType()==null) || 
             (this.offlineConversionAdjustmentFeedType!=null &&
              this.offlineConversionAdjustmentFeedType.equals(other.getOfflineConversionAdjustmentFeedType())));
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
        if (getConversionName() != null) {
            _hashCode += getConversionName().hashCode();
        }
        if (getAdjustmentTime() != null) {
            _hashCode += getAdjustmentTime().hashCode();
        }
        if (getAdjustmentType() != null) {
            _hashCode += getAdjustmentType().hashCode();
        }
        if (getAdjustedValue() != null) {
            _hashCode += getAdjustedValue().hashCode();
        }
        if (getAdjustedValueCurrencyCode() != null) {
            _hashCode += getAdjustedValueCurrencyCode().hashCode();
        }
        if (getOfflineConversionAdjustmentFeedType() != null) {
            _hashCode += getOfflineConversionAdjustmentFeedType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OfflineConversionAdjustmentFeed.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "OfflineConversionAdjustmentFeed"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "conversionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "adjustmentTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "adjustmentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "OfflineConversionAdjustmentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustedValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "adjustedValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustedValueCurrencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "adjustedValueCurrencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offlineConversionAdjustmentFeedType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "OfflineConversionAdjustmentFeed.Type"));
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
