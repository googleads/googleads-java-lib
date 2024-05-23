// Copyright 2023 Google LLC
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
 * TotalVolumeSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202311;


/**
 * Settings to specify a single total traffic volume that will be
 * used as the expected total future
 *             volume for a forecast adjustment.
 *             
 *             <p>For example, an {@code adOpportunityCount} of 3,000
 * indicates a forecast goal for the
 *             targeting specified on the parent traffic forecast segment
 * of 3,000 ad opportunities over the
 *             entire duration of the adjustment.
 */
public class TotalVolumeSettings  implements java.io.Serializable {
    /* The total ad opportunity count over the entire forecast adjustment
     * date range.
     *                 <span class="constraint Required">This attribute is
     * required.</span> */
    private java.lang.Long adOpportunityCount;

    public TotalVolumeSettings() {
    }

    public TotalVolumeSettings(
           java.lang.Long adOpportunityCount) {
           this.adOpportunityCount = adOpportunityCount;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adOpportunityCount", getAdOpportunityCount())
            .toString();
    }

    /**
     * Gets the adOpportunityCount value for this TotalVolumeSettings.
     * 
     * @return adOpportunityCount   * The total ad opportunity count over the entire forecast adjustment
     * date range.
     *                 <span class="constraint Required">This attribute is
     * required.</span>
     */
    public java.lang.Long getAdOpportunityCount() {
        return adOpportunityCount;
    }


    /**
     * Sets the adOpportunityCount value for this TotalVolumeSettings.
     * 
     * @param adOpportunityCount   * The total ad opportunity count over the entire forecast adjustment
     * date range.
     *                 <span class="constraint Required">This attribute is
     * required.</span>
     */
    public void setAdOpportunityCount(java.lang.Long adOpportunityCount) {
        this.adOpportunityCount = adOpportunityCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TotalVolumeSettings)) return false;
        TotalVolumeSettings other = (TotalVolumeSettings) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adOpportunityCount==null && other.getAdOpportunityCount()==null) || 
             (this.adOpportunityCount!=null &&
              this.adOpportunityCount.equals(other.getAdOpportunityCount())));
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
        if (getAdOpportunityCount() != null) {
            _hashCode += getAdOpportunityCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TotalVolumeSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202311", "TotalVolumeSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adOpportunityCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202311", "adOpportunityCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
