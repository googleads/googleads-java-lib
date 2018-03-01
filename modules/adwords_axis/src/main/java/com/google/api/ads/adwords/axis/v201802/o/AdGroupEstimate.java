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
 * AdGroupEstimate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.o;


/**
 * Represents the estimate results for a single ad group.
 */
public class AdGroupEstimate  extends com.google.api.ads.adwords.axis.v201802.o.Estimate  implements java.io.Serializable {
    /* The adGroupId of the ad group specified in the request.
     *                     
     *                     This will be <code>null</code> for new ad groups. */
    private java.lang.Long adGroupId;

    /* The estimates for the keywords specified in the request.
     *                     
     *                     The list of estimates are returned in the same
     * order as the keywords that
     *                     were sent in the request. */
    private com.google.api.ads.adwords.axis.v201802.o.KeywordEstimate[] keywordEstimates;

    public AdGroupEstimate() {
    }

    public AdGroupEstimate(
           java.lang.String estimateType,
           java.lang.Long adGroupId,
           com.google.api.ads.adwords.axis.v201802.o.KeywordEstimate[] keywordEstimates) {
        super(
            estimateType);
        this.adGroupId = adGroupId;
        this.keywordEstimates = keywordEstimates;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adGroupId", getAdGroupId())
            .add("estimateType", getEstimateType())
            .add("keywordEstimates", getKeywordEstimates())
            .toString();
    }

    /**
     * Gets the adGroupId value for this AdGroupEstimate.
     * 
     * @return adGroupId   * The adGroupId of the ad group specified in the request.
     *                     
     *                     This will be <code>null</code> for new ad groups.
     */
    public java.lang.Long getAdGroupId() {
        return adGroupId;
    }


    /**
     * Sets the adGroupId value for this AdGroupEstimate.
     * 
     * @param adGroupId   * The adGroupId of the ad group specified in the request.
     *                     
     *                     This will be <code>null</code> for new ad groups.
     */
    public void setAdGroupId(java.lang.Long adGroupId) {
        this.adGroupId = adGroupId;
    }


    /**
     * Gets the keywordEstimates value for this AdGroupEstimate.
     * 
     * @return keywordEstimates   * The estimates for the keywords specified in the request.
     *                     
     *                     The list of estimates are returned in the same
     * order as the keywords that
     *                     were sent in the request.
     */
    public com.google.api.ads.adwords.axis.v201802.o.KeywordEstimate[] getKeywordEstimates() {
        return keywordEstimates;
    }


    /**
     * Sets the keywordEstimates value for this AdGroupEstimate.
     * 
     * @param keywordEstimates   * The estimates for the keywords specified in the request.
     *                     
     *                     The list of estimates are returned in the same
     * order as the keywords that
     *                     were sent in the request.
     */
    public void setKeywordEstimates(com.google.api.ads.adwords.axis.v201802.o.KeywordEstimate[] keywordEstimates) {
        this.keywordEstimates = keywordEstimates;
    }

    public com.google.api.ads.adwords.axis.v201802.o.KeywordEstimate getKeywordEstimates(int i) {
        return this.keywordEstimates[i];
    }

    public void setKeywordEstimates(int i, com.google.api.ads.adwords.axis.v201802.o.KeywordEstimate _value) {
        this.keywordEstimates[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdGroupEstimate)) return false;
        AdGroupEstimate other = (AdGroupEstimate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.adGroupId==null && other.getAdGroupId()==null) || 
             (this.adGroupId!=null &&
              this.adGroupId.equals(other.getAdGroupId()))) &&
            ((this.keywordEstimates==null && other.getKeywordEstimates()==null) || 
             (this.keywordEstimates!=null &&
              java.util.Arrays.equals(this.keywordEstimates, other.getKeywordEstimates())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAdGroupId() != null) {
            _hashCode += getAdGroupId().hashCode();
        }
        if (getKeywordEstimates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeywordEstimates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeywordEstimates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdGroupEstimate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "AdGroupEstimate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "adGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordEstimates");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "keywordEstimates"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "KeywordEstimate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
