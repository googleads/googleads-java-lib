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
 * TargetingCriteriaBreakdown.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * A single targeting criteria breakdown result.
 */
public class TargetingCriteriaBreakdown  implements java.io.Serializable {
    /* The dimension of this breakdown */
    private com.google.api.ads.dfp.axis.v201802.TargetingDimension targetingDimension;

    /* The unique ID of the targeting criteria. */
    private java.lang.Long targetingCriteriaId;

    /* The name of the targeting criteria. */
    private java.lang.String targetingCriteriaName;

    /* When true, the breakdown is negative. */
    private java.lang.Boolean excluded;

    /* The available units for this breakdown. */
    private java.lang.Long availableUnits;

    /* The matched units for this breakdown. */
    private java.lang.Long matchedUnits;

    public TargetingCriteriaBreakdown() {
    }

    public TargetingCriteriaBreakdown(
           com.google.api.ads.dfp.axis.v201802.TargetingDimension targetingDimension,
           java.lang.Long targetingCriteriaId,
           java.lang.String targetingCriteriaName,
           java.lang.Boolean excluded,
           java.lang.Long availableUnits,
           java.lang.Long matchedUnits) {
           this.targetingDimension = targetingDimension;
           this.targetingCriteriaId = targetingCriteriaId;
           this.targetingCriteriaName = targetingCriteriaName;
           this.excluded = excluded;
           this.availableUnits = availableUnits;
           this.matchedUnits = matchedUnits;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("availableUnits", getAvailableUnits())
            .add("excluded", getExcluded())
            .add("matchedUnits", getMatchedUnits())
            .add("targetingCriteriaId", getTargetingCriteriaId())
            .add("targetingCriteriaName", getTargetingCriteriaName())
            .add("targetingDimension", getTargetingDimension())
            .toString();
    }

    /**
     * Gets the targetingDimension value for this TargetingCriteriaBreakdown.
     * 
     * @return targetingDimension   * The dimension of this breakdown
     */
    public com.google.api.ads.dfp.axis.v201802.TargetingDimension getTargetingDimension() {
        return targetingDimension;
    }


    /**
     * Sets the targetingDimension value for this TargetingCriteriaBreakdown.
     * 
     * @param targetingDimension   * The dimension of this breakdown
     */
    public void setTargetingDimension(com.google.api.ads.dfp.axis.v201802.TargetingDimension targetingDimension) {
        this.targetingDimension = targetingDimension;
    }


    /**
     * Gets the targetingCriteriaId value for this TargetingCriteriaBreakdown.
     * 
     * @return targetingCriteriaId   * The unique ID of the targeting criteria.
     */
    public java.lang.Long getTargetingCriteriaId() {
        return targetingCriteriaId;
    }


    /**
     * Sets the targetingCriteriaId value for this TargetingCriteriaBreakdown.
     * 
     * @param targetingCriteriaId   * The unique ID of the targeting criteria.
     */
    public void setTargetingCriteriaId(java.lang.Long targetingCriteriaId) {
        this.targetingCriteriaId = targetingCriteriaId;
    }


    /**
     * Gets the targetingCriteriaName value for this TargetingCriteriaBreakdown.
     * 
     * @return targetingCriteriaName   * The name of the targeting criteria.
     */
    public java.lang.String getTargetingCriteriaName() {
        return targetingCriteriaName;
    }


    /**
     * Sets the targetingCriteriaName value for this TargetingCriteriaBreakdown.
     * 
     * @param targetingCriteriaName   * The name of the targeting criteria.
     */
    public void setTargetingCriteriaName(java.lang.String targetingCriteriaName) {
        this.targetingCriteriaName = targetingCriteriaName;
    }


    /**
     * Gets the excluded value for this TargetingCriteriaBreakdown.
     * 
     * @return excluded   * When true, the breakdown is negative.
     */
    public java.lang.Boolean getExcluded() {
        return excluded;
    }


    /**
     * Sets the excluded value for this TargetingCriteriaBreakdown.
     * 
     * @param excluded   * When true, the breakdown is negative.
     */
    public void setExcluded(java.lang.Boolean excluded) {
        this.excluded = excluded;
    }


    /**
     * Gets the availableUnits value for this TargetingCriteriaBreakdown.
     * 
     * @return availableUnits   * The available units for this breakdown.
     */
    public java.lang.Long getAvailableUnits() {
        return availableUnits;
    }


    /**
     * Sets the availableUnits value for this TargetingCriteriaBreakdown.
     * 
     * @param availableUnits   * The available units for this breakdown.
     */
    public void setAvailableUnits(java.lang.Long availableUnits) {
        this.availableUnits = availableUnits;
    }


    /**
     * Gets the matchedUnits value for this TargetingCriteriaBreakdown.
     * 
     * @return matchedUnits   * The matched units for this breakdown.
     */
    public java.lang.Long getMatchedUnits() {
        return matchedUnits;
    }


    /**
     * Sets the matchedUnits value for this TargetingCriteriaBreakdown.
     * 
     * @param matchedUnits   * The matched units for this breakdown.
     */
    public void setMatchedUnits(java.lang.Long matchedUnits) {
        this.matchedUnits = matchedUnits;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TargetingCriteriaBreakdown)) return false;
        TargetingCriteriaBreakdown other = (TargetingCriteriaBreakdown) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.targetingDimension==null && other.getTargetingDimension()==null) || 
             (this.targetingDimension!=null &&
              this.targetingDimension.equals(other.getTargetingDimension()))) &&
            ((this.targetingCriteriaId==null && other.getTargetingCriteriaId()==null) || 
             (this.targetingCriteriaId!=null &&
              this.targetingCriteriaId.equals(other.getTargetingCriteriaId()))) &&
            ((this.targetingCriteriaName==null && other.getTargetingCriteriaName()==null) || 
             (this.targetingCriteriaName!=null &&
              this.targetingCriteriaName.equals(other.getTargetingCriteriaName()))) &&
            ((this.excluded==null && other.getExcluded()==null) || 
             (this.excluded!=null &&
              this.excluded.equals(other.getExcluded()))) &&
            ((this.availableUnits==null && other.getAvailableUnits()==null) || 
             (this.availableUnits!=null &&
              this.availableUnits.equals(other.getAvailableUnits()))) &&
            ((this.matchedUnits==null && other.getMatchedUnits()==null) || 
             (this.matchedUnits!=null &&
              this.matchedUnits.equals(other.getMatchedUnits())));
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
        if (getTargetingDimension() != null) {
            _hashCode += getTargetingDimension().hashCode();
        }
        if (getTargetingCriteriaId() != null) {
            _hashCode += getTargetingCriteriaId().hashCode();
        }
        if (getTargetingCriteriaName() != null) {
            _hashCode += getTargetingCriteriaName().hashCode();
        }
        if (getExcluded() != null) {
            _hashCode += getExcluded().hashCode();
        }
        if (getAvailableUnits() != null) {
            _hashCode += getAvailableUnits().hashCode();
        }
        if (getMatchedUnits() != null) {
            _hashCode += getMatchedUnits().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TargetingCriteriaBreakdown.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "TargetingCriteriaBreakdown"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetingDimension");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "targetingDimension"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "TargetingDimension"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetingCriteriaId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "targetingCriteriaId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetingCriteriaName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "targetingCriteriaName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excluded");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "excluded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "availableUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchedUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "matchedUnits"));
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
