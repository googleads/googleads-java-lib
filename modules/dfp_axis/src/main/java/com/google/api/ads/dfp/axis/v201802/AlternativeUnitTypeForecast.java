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
 * AlternativeUnitTypeForecast.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * A view of the forecast in terms of an alternative unit type.
 *             
 *             <p>For example, a forecast for an impressions goal may
 * include this to
 *             express the matched, available, and possible viewable
 * impressions.
 */
public class AlternativeUnitTypeForecast  implements java.io.Serializable {
    /* The alternative unit type being presented. */
    private com.google.api.ads.dfp.axis.v201802.UnitType unitType;

    /* The number of units, defined by {@link #unitType}, that match
     * the
     *                 specified targeting and delivery settings. */
    private java.lang.Long matchedUnits;

    /* The number of units, defined by {@link #unitType}, that can
     * be
     *                 booked without affecting the delivery of any reserved
     * line items. Exceeding
     *                 this value will not cause an overbook, but lower-priority
     * line items may
     *                 not run. */
    private java.lang.Long availableUnits;

    /* The maximum number of units, defined by {@link #unitType},
     * that
     *                 could be booked by taking inventory away from lower-priority
     * line items. */
    private java.lang.Long possibleUnits;

    public AlternativeUnitTypeForecast() {
    }

    public AlternativeUnitTypeForecast(
           com.google.api.ads.dfp.axis.v201802.UnitType unitType,
           java.lang.Long matchedUnits,
           java.lang.Long availableUnits,
           java.lang.Long possibleUnits) {
           this.unitType = unitType;
           this.matchedUnits = matchedUnits;
           this.availableUnits = availableUnits;
           this.possibleUnits = possibleUnits;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("availableUnits", getAvailableUnits())
            .add("matchedUnits", getMatchedUnits())
            .add("possibleUnits", getPossibleUnits())
            .add("unitType", getUnitType())
            .toString();
    }

    /**
     * Gets the unitType value for this AlternativeUnitTypeForecast.
     * 
     * @return unitType   * The alternative unit type being presented.
     */
    public com.google.api.ads.dfp.axis.v201802.UnitType getUnitType() {
        return unitType;
    }


    /**
     * Sets the unitType value for this AlternativeUnitTypeForecast.
     * 
     * @param unitType   * The alternative unit type being presented.
     */
    public void setUnitType(com.google.api.ads.dfp.axis.v201802.UnitType unitType) {
        this.unitType = unitType;
    }


    /**
     * Gets the matchedUnits value for this AlternativeUnitTypeForecast.
     * 
     * @return matchedUnits   * The number of units, defined by {@link #unitType}, that match
     * the
     *                 specified targeting and delivery settings.
     */
    public java.lang.Long getMatchedUnits() {
        return matchedUnits;
    }


    /**
     * Sets the matchedUnits value for this AlternativeUnitTypeForecast.
     * 
     * @param matchedUnits   * The number of units, defined by {@link #unitType}, that match
     * the
     *                 specified targeting and delivery settings.
     */
    public void setMatchedUnits(java.lang.Long matchedUnits) {
        this.matchedUnits = matchedUnits;
    }


    /**
     * Gets the availableUnits value for this AlternativeUnitTypeForecast.
     * 
     * @return availableUnits   * The number of units, defined by {@link #unitType}, that can
     * be
     *                 booked without affecting the delivery of any reserved
     * line items. Exceeding
     *                 this value will not cause an overbook, but lower-priority
     * line items may
     *                 not run.
     */
    public java.lang.Long getAvailableUnits() {
        return availableUnits;
    }


    /**
     * Sets the availableUnits value for this AlternativeUnitTypeForecast.
     * 
     * @param availableUnits   * The number of units, defined by {@link #unitType}, that can
     * be
     *                 booked without affecting the delivery of any reserved
     * line items. Exceeding
     *                 this value will not cause an overbook, but lower-priority
     * line items may
     *                 not run.
     */
    public void setAvailableUnits(java.lang.Long availableUnits) {
        this.availableUnits = availableUnits;
    }


    /**
     * Gets the possibleUnits value for this AlternativeUnitTypeForecast.
     * 
     * @return possibleUnits   * The maximum number of units, defined by {@link #unitType},
     * that
     *                 could be booked by taking inventory away from lower-priority
     * line items.
     */
    public java.lang.Long getPossibleUnits() {
        return possibleUnits;
    }


    /**
     * Sets the possibleUnits value for this AlternativeUnitTypeForecast.
     * 
     * @param possibleUnits   * The maximum number of units, defined by {@link #unitType},
     * that
     *                 could be booked by taking inventory away from lower-priority
     * line items.
     */
    public void setPossibleUnits(java.lang.Long possibleUnits) {
        this.possibleUnits = possibleUnits;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlternativeUnitTypeForecast)) return false;
        AlternativeUnitTypeForecast other = (AlternativeUnitTypeForecast) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.unitType==null && other.getUnitType()==null) || 
             (this.unitType!=null &&
              this.unitType.equals(other.getUnitType()))) &&
            ((this.matchedUnits==null && other.getMatchedUnits()==null) || 
             (this.matchedUnits!=null &&
              this.matchedUnits.equals(other.getMatchedUnits()))) &&
            ((this.availableUnits==null && other.getAvailableUnits()==null) || 
             (this.availableUnits!=null &&
              this.availableUnits.equals(other.getAvailableUnits()))) &&
            ((this.possibleUnits==null && other.getPossibleUnits()==null) || 
             (this.possibleUnits!=null &&
              this.possibleUnits.equals(other.getPossibleUnits())));
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
        if (getUnitType() != null) {
            _hashCode += getUnitType().hashCode();
        }
        if (getMatchedUnits() != null) {
            _hashCode += getMatchedUnits().hashCode();
        }
        if (getAvailableUnits() != null) {
            _hashCode += getAvailableUnits().hashCode();
        }
        if (getPossibleUnits() != null) {
            _hashCode += getPossibleUnits().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlternativeUnitTypeForecast.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "AlternativeUnitTypeForecast"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "unitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "UnitType"));
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
        elemField.setFieldName("availableUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "availableUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("possibleUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "possibleUnits"));
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
