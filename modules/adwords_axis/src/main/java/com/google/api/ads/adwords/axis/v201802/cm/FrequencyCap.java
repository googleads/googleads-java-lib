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
 * FrequencyCap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * A frequency cap is the maximum number of times an ad (or some set
 * of ads) can
 *             be shown to a user over a particular time period.
 */
public class FrequencyCap  implements java.io.Serializable {
    /* Maximum number of impressions allowed during the time range
     * by this cap.
     *                 To remove the frequency cap on a campaign, set this
     * field to {@code 0}. */
    private java.lang.Long impressions;

    /* Unit of time the cap is defined at.
     *                 Only the Day, Week and Month time units are supported. */
    private com.google.api.ads.adwords.axis.v201802.cm.TimeUnit timeUnit;

    /* The level on which the cap is to be applied (creative/adgroup).
     * Cap is applied to all the entities of this level in the campaign. */
    private com.google.api.ads.adwords.axis.v201802.cm.Level level;

    public FrequencyCap() {
    }

    public FrequencyCap(
           java.lang.Long impressions,
           com.google.api.ads.adwords.axis.v201802.cm.TimeUnit timeUnit,
           com.google.api.ads.adwords.axis.v201802.cm.Level level) {
           this.impressions = impressions;
           this.timeUnit = timeUnit;
           this.level = level;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("impressions", getImpressions())
            .add("level", getLevel())
            .add("timeUnit", getTimeUnit())
            .toString();
    }

    /**
     * Gets the impressions value for this FrequencyCap.
     * 
     * @return impressions   * Maximum number of impressions allowed during the time range
     * by this cap.
     *                 To remove the frequency cap on a campaign, set this
     * field to {@code 0}.
     */
    public java.lang.Long getImpressions() {
        return impressions;
    }


    /**
     * Sets the impressions value for this FrequencyCap.
     * 
     * @param impressions   * Maximum number of impressions allowed during the time range
     * by this cap.
     *                 To remove the frequency cap on a campaign, set this
     * field to {@code 0}.
     */
    public void setImpressions(java.lang.Long impressions) {
        this.impressions = impressions;
    }


    /**
     * Gets the timeUnit value for this FrequencyCap.
     * 
     * @return timeUnit   * Unit of time the cap is defined at.
     *                 Only the Day, Week and Month time units are supported.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.TimeUnit getTimeUnit() {
        return timeUnit;
    }


    /**
     * Sets the timeUnit value for this FrequencyCap.
     * 
     * @param timeUnit   * Unit of time the cap is defined at.
     *                 Only the Day, Week and Month time units are supported.
     */
    public void setTimeUnit(com.google.api.ads.adwords.axis.v201802.cm.TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }


    /**
     * Gets the level value for this FrequencyCap.
     * 
     * @return level   * The level on which the cap is to be applied (creative/adgroup).
     * Cap is applied to all the entities of this level in the campaign.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Level getLevel() {
        return level;
    }


    /**
     * Sets the level value for this FrequencyCap.
     * 
     * @param level   * The level on which the cap is to be applied (creative/adgroup).
     * Cap is applied to all the entities of this level in the campaign.
     */
    public void setLevel(com.google.api.ads.adwords.axis.v201802.cm.Level level) {
        this.level = level;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FrequencyCap)) return false;
        FrequencyCap other = (FrequencyCap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.impressions==null && other.getImpressions()==null) || 
             (this.impressions!=null &&
              this.impressions.equals(other.getImpressions()))) &&
            ((this.timeUnit==null && other.getTimeUnit()==null) || 
             (this.timeUnit!=null &&
              this.timeUnit.equals(other.getTimeUnit()))) &&
            ((this.level==null && other.getLevel()==null) || 
             (this.level!=null &&
              this.level.equals(other.getLevel())));
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
        if (getImpressions() != null) {
            _hashCode += getImpressions().hashCode();
        }
        if (getTimeUnit() != null) {
            _hashCode += getTimeUnit().hashCode();
        }
        if (getLevel() != null) {
            _hashCode += getLevel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FrequencyCap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FrequencyCap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impressions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "impressions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "timeUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TimeUnit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("level");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "level"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Level"));
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
