// Copyright 2016 Google Inc. All Rights Reserved.
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
 * ExperimentSummaryStats.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201605.cm;


/**
 * Contains how many changes were made associated with an experiment
 * at
 *             the adgroup, critieria and creative levels
 */
public class ExperimentSummaryStats  implements java.io.Serializable {
    /* Number of adgroups changed in this experiment
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AdGroupsCount".</span> */
    private java.lang.Integer adGroupsCount;

    /* Number of criteria changed in this experiment
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AdGroupCriteriaCount".</span> */
    private java.lang.Integer adGroupCriteriaCount;

    /* Number of creatives changed in this experiment
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AdGroupAdsCount".</span> */
    private java.lang.Integer adGroupAdsCount;

    public ExperimentSummaryStats() {
    }

    public ExperimentSummaryStats(
           java.lang.Integer adGroupsCount,
           java.lang.Integer adGroupCriteriaCount,
           java.lang.Integer adGroupAdsCount) {
           this.adGroupsCount = adGroupsCount;
           this.adGroupCriteriaCount = adGroupCriteriaCount;
           this.adGroupAdsCount = adGroupAdsCount;
    }


    /**
     * Gets the adGroupsCount value for this ExperimentSummaryStats.
     * 
     * @return adGroupsCount   * Number of adgroups changed in this experiment
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AdGroupsCount".</span>
     */
    public java.lang.Integer getAdGroupsCount() {
        return adGroupsCount;
    }


    /**
     * Sets the adGroupsCount value for this ExperimentSummaryStats.
     * 
     * @param adGroupsCount   * Number of adgroups changed in this experiment
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AdGroupsCount".</span>
     */
    public void setAdGroupsCount(java.lang.Integer adGroupsCount) {
        this.adGroupsCount = adGroupsCount;
    }


    /**
     * Gets the adGroupCriteriaCount value for this ExperimentSummaryStats.
     * 
     * @return adGroupCriteriaCount   * Number of criteria changed in this experiment
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AdGroupCriteriaCount".</span>
     */
    public java.lang.Integer getAdGroupCriteriaCount() {
        return adGroupCriteriaCount;
    }


    /**
     * Sets the adGroupCriteriaCount value for this ExperimentSummaryStats.
     * 
     * @param adGroupCriteriaCount   * Number of criteria changed in this experiment
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AdGroupCriteriaCount".</span>
     */
    public void setAdGroupCriteriaCount(java.lang.Integer adGroupCriteriaCount) {
        this.adGroupCriteriaCount = adGroupCriteriaCount;
    }


    /**
     * Gets the adGroupAdsCount value for this ExperimentSummaryStats.
     * 
     * @return adGroupAdsCount   * Number of creatives changed in this experiment
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AdGroupAdsCount".</span>
     */
    public java.lang.Integer getAdGroupAdsCount() {
        return adGroupAdsCount;
    }


    /**
     * Sets the adGroupAdsCount value for this ExperimentSummaryStats.
     * 
     * @param adGroupAdsCount   * Number of creatives changed in this experiment
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AdGroupAdsCount".</span>
     */
    public void setAdGroupAdsCount(java.lang.Integer adGroupAdsCount) {
        this.adGroupAdsCount = adGroupAdsCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExperimentSummaryStats)) return false;
        ExperimentSummaryStats other = (ExperimentSummaryStats) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adGroupsCount==null && other.getAdGroupsCount()==null) || 
             (this.adGroupsCount!=null &&
              this.adGroupsCount.equals(other.getAdGroupsCount()))) &&
            ((this.adGroupCriteriaCount==null && other.getAdGroupCriteriaCount()==null) || 
             (this.adGroupCriteriaCount!=null &&
              this.adGroupCriteriaCount.equals(other.getAdGroupCriteriaCount()))) &&
            ((this.adGroupAdsCount==null && other.getAdGroupAdsCount()==null) || 
             (this.adGroupAdsCount!=null &&
              this.adGroupAdsCount.equals(other.getAdGroupAdsCount())));
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
        if (getAdGroupsCount() != null) {
            _hashCode += getAdGroupsCount().hashCode();
        }
        if (getAdGroupCriteriaCount() != null) {
            _hashCode += getAdGroupCriteriaCount().hashCode();
        }
        if (getAdGroupAdsCount() != null) {
            _hashCode += getAdGroupAdsCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExperimentSummaryStats.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "ExperimentSummaryStats"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupsCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "adGroupsCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupCriteriaCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "adGroupCriteriaCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupAdsCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "adGroupAdsCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
