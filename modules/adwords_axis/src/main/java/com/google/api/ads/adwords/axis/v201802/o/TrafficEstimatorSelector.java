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
 * TrafficEstimatorSelector.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.o;


/**
 * Contains a list of campaigns to perform a traffic estimate on.
 */
public class TrafficEstimatorSelector  implements java.io.Serializable {
    /* A list of all campaigns to estimate.<p>
     *                 
     *                 To create a Keyword estimates request, use {@code
     * null} campaign id.
     *                 <span class="constraint CollectionSize">The maximum
     * size of this collection is 5.</span>
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     *                 <span class="constraint NotEmpty">This field must
     * contain at least one element.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201802.o.CampaignEstimateRequest[] campaignEstimateRequests;

    /* To request a list of campaign level estimates segmented by
     * platform. */
    private java.lang.Boolean platformEstimateRequested;

    public TrafficEstimatorSelector() {
    }

    public TrafficEstimatorSelector(
           com.google.api.ads.adwords.axis.v201802.o.CampaignEstimateRequest[] campaignEstimateRequests,
           java.lang.Boolean platformEstimateRequested) {
           this.campaignEstimateRequests = campaignEstimateRequests;
           this.platformEstimateRequested = platformEstimateRequested;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("campaignEstimateRequests", getCampaignEstimateRequests())
            .add("platformEstimateRequested", getPlatformEstimateRequested())
            .toString();
    }

    /**
     * Gets the campaignEstimateRequests value for this TrafficEstimatorSelector.
     * 
     * @return campaignEstimateRequests   * A list of all campaigns to estimate.<p>
     *                 
     *                 To create a Keyword estimates request, use {@code
     * null} campaign id.
     *                 <span class="constraint CollectionSize">The maximum
     * size of this collection is 5.</span>
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     *                 <span class="constraint NotEmpty">This field must
     * contain at least one element.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.o.CampaignEstimateRequest[] getCampaignEstimateRequests() {
        return campaignEstimateRequests;
    }


    /**
     * Sets the campaignEstimateRequests value for this TrafficEstimatorSelector.
     * 
     * @param campaignEstimateRequests   * A list of all campaigns to estimate.<p>
     *                 
     *                 To create a Keyword estimates request, use {@code
     * null} campaign id.
     *                 <span class="constraint CollectionSize">The maximum
     * size of this collection is 5.</span>
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     *                 <span class="constraint NotEmpty">This field must
     * contain at least one element.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setCampaignEstimateRequests(com.google.api.ads.adwords.axis.v201802.o.CampaignEstimateRequest[] campaignEstimateRequests) {
        this.campaignEstimateRequests = campaignEstimateRequests;
    }

    public com.google.api.ads.adwords.axis.v201802.o.CampaignEstimateRequest getCampaignEstimateRequests(int i) {
        return this.campaignEstimateRequests[i];
    }

    public void setCampaignEstimateRequests(int i, com.google.api.ads.adwords.axis.v201802.o.CampaignEstimateRequest _value) {
        this.campaignEstimateRequests[i] = _value;
    }


    /**
     * Gets the platformEstimateRequested value for this TrafficEstimatorSelector.
     * 
     * @return platformEstimateRequested   * To request a list of campaign level estimates segmented by
     * platform.
     */
    public java.lang.Boolean getPlatformEstimateRequested() {
        return platformEstimateRequested;
    }


    /**
     * Sets the platformEstimateRequested value for this TrafficEstimatorSelector.
     * 
     * @param platformEstimateRequested   * To request a list of campaign level estimates segmented by
     * platform.
     */
    public void setPlatformEstimateRequested(java.lang.Boolean platformEstimateRequested) {
        this.platformEstimateRequested = platformEstimateRequested;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrafficEstimatorSelector)) return false;
        TrafficEstimatorSelector other = (TrafficEstimatorSelector) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.campaignEstimateRequests==null && other.getCampaignEstimateRequests()==null) || 
             (this.campaignEstimateRequests!=null &&
              java.util.Arrays.equals(this.campaignEstimateRequests, other.getCampaignEstimateRequests()))) &&
            ((this.platformEstimateRequested==null && other.getPlatformEstimateRequested()==null) || 
             (this.platformEstimateRequested!=null &&
              this.platformEstimateRequested.equals(other.getPlatformEstimateRequested())));
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
        if (getCampaignEstimateRequests() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCampaignEstimateRequests());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCampaignEstimateRequests(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPlatformEstimateRequested() != null) {
            _hashCode += getPlatformEstimateRequested().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrafficEstimatorSelector.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "TrafficEstimatorSelector"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignEstimateRequests");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "campaignEstimateRequests"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "CampaignEstimateRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("platformEstimateRequested");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "platformEstimateRequested"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
