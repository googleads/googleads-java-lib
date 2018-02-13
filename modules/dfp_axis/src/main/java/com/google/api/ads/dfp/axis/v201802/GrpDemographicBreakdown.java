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
 * GrpDemographicBreakdown.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * GRP forecast breakdown counts associated with a gender and age
 * demographic.
 */
public class GrpDemographicBreakdown  implements java.io.Serializable {
    /* The number of units matching the demographic breakdown that
     * can be booked without affecting
     *                 the delivery of any reserved line items. */
    private java.lang.Long availableUnits;

    /* The number of units matching the demographic and matching specified
     * targeting and
     *                 delivery settings. */
    private java.lang.Long matchedUnits;

    /* The {@link GrpUnitType} associated with this demographic breakdown. */
    private com.google.api.ads.dfp.axis.v201802.GrpUnitType unitType;

    /* The {@link GrpGender} associated with this demographic breakdown. */
    private com.google.api.ads.dfp.axis.v201802.GrpGender gender;

    /* The {@link GrpAge} associated with this demographic breakdown. */
    private com.google.api.ads.dfp.axis.v201802.GrpAge age;

    public GrpDemographicBreakdown() {
    }

    public GrpDemographicBreakdown(
           java.lang.Long availableUnits,
           java.lang.Long matchedUnits,
           com.google.api.ads.dfp.axis.v201802.GrpUnitType unitType,
           com.google.api.ads.dfp.axis.v201802.GrpGender gender,
           com.google.api.ads.dfp.axis.v201802.GrpAge age) {
           this.availableUnits = availableUnits;
           this.matchedUnits = matchedUnits;
           this.unitType = unitType;
           this.gender = gender;
           this.age = age;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("age", getAge())
            .add("availableUnits", getAvailableUnits())
            .add("gender", getGender())
            .add("matchedUnits", getMatchedUnits())
            .add("unitType", getUnitType())
            .toString();
    }

    /**
     * Gets the availableUnits value for this GrpDemographicBreakdown.
     * 
     * @return availableUnits   * The number of units matching the demographic breakdown that
     * can be booked without affecting
     *                 the delivery of any reserved line items.
     */
    public java.lang.Long getAvailableUnits() {
        return availableUnits;
    }


    /**
     * Sets the availableUnits value for this GrpDemographicBreakdown.
     * 
     * @param availableUnits   * The number of units matching the demographic breakdown that
     * can be booked without affecting
     *                 the delivery of any reserved line items.
     */
    public void setAvailableUnits(java.lang.Long availableUnits) {
        this.availableUnits = availableUnits;
    }


    /**
     * Gets the matchedUnits value for this GrpDemographicBreakdown.
     * 
     * @return matchedUnits   * The number of units matching the demographic and matching specified
     * targeting and
     *                 delivery settings.
     */
    public java.lang.Long getMatchedUnits() {
        return matchedUnits;
    }


    /**
     * Sets the matchedUnits value for this GrpDemographicBreakdown.
     * 
     * @param matchedUnits   * The number of units matching the demographic and matching specified
     * targeting and
     *                 delivery settings.
     */
    public void setMatchedUnits(java.lang.Long matchedUnits) {
        this.matchedUnits = matchedUnits;
    }


    /**
     * Gets the unitType value for this GrpDemographicBreakdown.
     * 
     * @return unitType   * The {@link GrpUnitType} associated with this demographic breakdown.
     */
    public com.google.api.ads.dfp.axis.v201802.GrpUnitType getUnitType() {
        return unitType;
    }


    /**
     * Sets the unitType value for this GrpDemographicBreakdown.
     * 
     * @param unitType   * The {@link GrpUnitType} associated with this demographic breakdown.
     */
    public void setUnitType(com.google.api.ads.dfp.axis.v201802.GrpUnitType unitType) {
        this.unitType = unitType;
    }


    /**
     * Gets the gender value for this GrpDemographicBreakdown.
     * 
     * @return gender   * The {@link GrpGender} associated with this demographic breakdown.
     */
    public com.google.api.ads.dfp.axis.v201802.GrpGender getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this GrpDemographicBreakdown.
     * 
     * @param gender   * The {@link GrpGender} associated with this demographic breakdown.
     */
    public void setGender(com.google.api.ads.dfp.axis.v201802.GrpGender gender) {
        this.gender = gender;
    }


    /**
     * Gets the age value for this GrpDemographicBreakdown.
     * 
     * @return age   * The {@link GrpAge} associated with this demographic breakdown.
     */
    public com.google.api.ads.dfp.axis.v201802.GrpAge getAge() {
        return age;
    }


    /**
     * Sets the age value for this GrpDemographicBreakdown.
     * 
     * @param age   * The {@link GrpAge} associated with this demographic breakdown.
     */
    public void setAge(com.google.api.ads.dfp.axis.v201802.GrpAge age) {
        this.age = age;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GrpDemographicBreakdown)) return false;
        GrpDemographicBreakdown other = (GrpDemographicBreakdown) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.availableUnits==null && other.getAvailableUnits()==null) || 
             (this.availableUnits!=null &&
              this.availableUnits.equals(other.getAvailableUnits()))) &&
            ((this.matchedUnits==null && other.getMatchedUnits()==null) || 
             (this.matchedUnits!=null &&
              this.matchedUnits.equals(other.getMatchedUnits()))) &&
            ((this.unitType==null && other.getUnitType()==null) || 
             (this.unitType!=null &&
              this.unitType.equals(other.getUnitType()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.age==null && other.getAge()==null) || 
             (this.age!=null &&
              this.age.equals(other.getAge())));
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
        if (getAvailableUnits() != null) {
            _hashCode += getAvailableUnits().hashCode();
        }
        if (getMatchedUnits() != null) {
            _hashCode += getMatchedUnits().hashCode();
        }
        if (getUnitType() != null) {
            _hashCode += getUnitType().hashCode();
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getAge() != null) {
            _hashCode += getAge().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GrpDemographicBreakdown.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "GrpDemographicBreakdown"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "unitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "GrpUnitType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "GrpGender"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("age");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "age"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "GrpAge"));
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
