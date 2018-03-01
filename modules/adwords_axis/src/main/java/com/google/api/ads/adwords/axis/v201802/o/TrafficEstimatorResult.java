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
 * TrafficEstimatorResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.o;


/**
 * Contains results of traffic estimation request.
 */
public class TrafficEstimatorResult  implements java.io.Serializable {
    /* The estimates for the campaigns specified in the request.
     *                 
     *                 They are listed in the same order as the campaigns
     * that were sent in the
     *                 request. */
    private com.google.api.ads.adwords.axis.v201802.o.CampaignEstimate[] campaignEstimates;

    public TrafficEstimatorResult() {
    }

    public TrafficEstimatorResult(
           com.google.api.ads.adwords.axis.v201802.o.CampaignEstimate[] campaignEstimates) {
           this.campaignEstimates = campaignEstimates;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("campaignEstimates", getCampaignEstimates())
            .toString();
    }

    /**
     * Gets the campaignEstimates value for this TrafficEstimatorResult.
     * 
     * @return campaignEstimates   * The estimates for the campaigns specified in the request.
     *                 
     *                 They are listed in the same order as the campaigns
     * that were sent in the
     *                 request.
     */
    public com.google.api.ads.adwords.axis.v201802.o.CampaignEstimate[] getCampaignEstimates() {
        return campaignEstimates;
    }


    /**
     * Sets the campaignEstimates value for this TrafficEstimatorResult.
     * 
     * @param campaignEstimates   * The estimates for the campaigns specified in the request.
     *                 
     *                 They are listed in the same order as the campaigns
     * that were sent in the
     *                 request.
     */
    public void setCampaignEstimates(com.google.api.ads.adwords.axis.v201802.o.CampaignEstimate[] campaignEstimates) {
        this.campaignEstimates = campaignEstimates;
    }

    public com.google.api.ads.adwords.axis.v201802.o.CampaignEstimate getCampaignEstimates(int i) {
        return this.campaignEstimates[i];
    }

    public void setCampaignEstimates(int i, com.google.api.ads.adwords.axis.v201802.o.CampaignEstimate _value) {
        this.campaignEstimates[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrafficEstimatorResult)) return false;
        TrafficEstimatorResult other = (TrafficEstimatorResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.campaignEstimates==null && other.getCampaignEstimates()==null) || 
             (this.campaignEstimates!=null &&
              java.util.Arrays.equals(this.campaignEstimates, other.getCampaignEstimates())));
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
        if (getCampaignEstimates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCampaignEstimates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCampaignEstimates(), i);
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
        new org.apache.axis.description.TypeDesc(TrafficEstimatorResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "TrafficEstimatorResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignEstimates");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "campaignEstimates"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "CampaignEstimate"));
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
