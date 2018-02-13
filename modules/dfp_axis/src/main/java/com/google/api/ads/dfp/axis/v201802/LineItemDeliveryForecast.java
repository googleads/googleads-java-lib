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
 * LineItemDeliveryForecast.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * The forecasted delivery of a {@link ProspectiveLineItem}.
 */
public class LineItemDeliveryForecast  implements java.io.Serializable {
    /* Uniquely identifies this line item delivery forecast.
     *                 This value is read-only and will be either the ID
     * of the {@link LineItem} object it represents,
     *                 or {@code null} if the forecast represents a prospective
     * line item. */
    private java.lang.Long lineItemId;

    /* The unique ID for the {@link Order} object that this line item
     * belongs to, or
     *                 {@code null} if the forecast represents a prospective
     * line item without an
     *                 {@link LineItem#orderId} set. */
    private java.lang.Long orderId;

    /* The unit with which the goal or cap of the {@link LineItem}
     * is defined.
     *                 Will be the same value as {@link Goal#unitType} for
     * both a set line item or
     *                 a prospective one. */
    private com.google.api.ads.dfp.axis.v201802.UnitType unitType;

    /* The number of units, defined by {@link Goal#unitType}, that
     * will be delivered by the line
     *                 item. Delivery of existing line items that are of
     * same or lower priorities may be impacted. */
    private java.lang.Long predictedDeliveryUnits;

    /* The number of units, defined by {@link Goal#unitType}, that
     * have already been served if the
     *                 reservation is already running. */
    private java.lang.Long deliveredUnits;

    /* The number of units, defined by {@link Goal#unitType}, that
     * match the specified
     *                 {@link LineItem#targeting} and delivery settings. */
    private java.lang.Long matchedUnits;

    public LineItemDeliveryForecast() {
    }

    public LineItemDeliveryForecast(
           java.lang.Long lineItemId,
           java.lang.Long orderId,
           com.google.api.ads.dfp.axis.v201802.UnitType unitType,
           java.lang.Long predictedDeliveryUnits,
           java.lang.Long deliveredUnits,
           java.lang.Long matchedUnits) {
           this.lineItemId = lineItemId;
           this.orderId = orderId;
           this.unitType = unitType;
           this.predictedDeliveryUnits = predictedDeliveryUnits;
           this.deliveredUnits = deliveredUnits;
           this.matchedUnits = matchedUnits;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("deliveredUnits", getDeliveredUnits())
            .add("lineItemId", getLineItemId())
            .add("matchedUnits", getMatchedUnits())
            .add("orderId", getOrderId())
            .add("predictedDeliveryUnits", getPredictedDeliveryUnits())
            .add("unitType", getUnitType())
            .toString();
    }

    /**
     * Gets the lineItemId value for this LineItemDeliveryForecast.
     * 
     * @return lineItemId   * Uniquely identifies this line item delivery forecast.
     *                 This value is read-only and will be either the ID
     * of the {@link LineItem} object it represents,
     *                 or {@code null} if the forecast represents a prospective
     * line item.
     */
    public java.lang.Long getLineItemId() {
        return lineItemId;
    }


    /**
     * Sets the lineItemId value for this LineItemDeliveryForecast.
     * 
     * @param lineItemId   * Uniquely identifies this line item delivery forecast.
     *                 This value is read-only and will be either the ID
     * of the {@link LineItem} object it represents,
     *                 or {@code null} if the forecast represents a prospective
     * line item.
     */
    public void setLineItemId(java.lang.Long lineItemId) {
        this.lineItemId = lineItemId;
    }


    /**
     * Gets the orderId value for this LineItemDeliveryForecast.
     * 
     * @return orderId   * The unique ID for the {@link Order} object that this line item
     * belongs to, or
     *                 {@code null} if the forecast represents a prospective
     * line item without an
     *                 {@link LineItem#orderId} set.
     */
    public java.lang.Long getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this LineItemDeliveryForecast.
     * 
     * @param orderId   * The unique ID for the {@link Order} object that this line item
     * belongs to, or
     *                 {@code null} if the forecast represents a prospective
     * line item without an
     *                 {@link LineItem#orderId} set.
     */
    public void setOrderId(java.lang.Long orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the unitType value for this LineItemDeliveryForecast.
     * 
     * @return unitType   * The unit with which the goal or cap of the {@link LineItem}
     * is defined.
     *                 Will be the same value as {@link Goal#unitType} for
     * both a set line item or
     *                 a prospective one.
     */
    public com.google.api.ads.dfp.axis.v201802.UnitType getUnitType() {
        return unitType;
    }


    /**
     * Sets the unitType value for this LineItemDeliveryForecast.
     * 
     * @param unitType   * The unit with which the goal or cap of the {@link LineItem}
     * is defined.
     *                 Will be the same value as {@link Goal#unitType} for
     * both a set line item or
     *                 a prospective one.
     */
    public void setUnitType(com.google.api.ads.dfp.axis.v201802.UnitType unitType) {
        this.unitType = unitType;
    }


    /**
     * Gets the predictedDeliveryUnits value for this LineItemDeliveryForecast.
     * 
     * @return predictedDeliveryUnits   * The number of units, defined by {@link Goal#unitType}, that
     * will be delivered by the line
     *                 item. Delivery of existing line items that are of
     * same or lower priorities may be impacted.
     */
    public java.lang.Long getPredictedDeliveryUnits() {
        return predictedDeliveryUnits;
    }


    /**
     * Sets the predictedDeliveryUnits value for this LineItemDeliveryForecast.
     * 
     * @param predictedDeliveryUnits   * The number of units, defined by {@link Goal#unitType}, that
     * will be delivered by the line
     *                 item. Delivery of existing line items that are of
     * same or lower priorities may be impacted.
     */
    public void setPredictedDeliveryUnits(java.lang.Long predictedDeliveryUnits) {
        this.predictedDeliveryUnits = predictedDeliveryUnits;
    }


    /**
     * Gets the deliveredUnits value for this LineItemDeliveryForecast.
     * 
     * @return deliveredUnits   * The number of units, defined by {@link Goal#unitType}, that
     * have already been served if the
     *                 reservation is already running.
     */
    public java.lang.Long getDeliveredUnits() {
        return deliveredUnits;
    }


    /**
     * Sets the deliveredUnits value for this LineItemDeliveryForecast.
     * 
     * @param deliveredUnits   * The number of units, defined by {@link Goal#unitType}, that
     * have already been served if the
     *                 reservation is already running.
     */
    public void setDeliveredUnits(java.lang.Long deliveredUnits) {
        this.deliveredUnits = deliveredUnits;
    }


    /**
     * Gets the matchedUnits value for this LineItemDeliveryForecast.
     * 
     * @return matchedUnits   * The number of units, defined by {@link Goal#unitType}, that
     * match the specified
     *                 {@link LineItem#targeting} and delivery settings.
     */
    public java.lang.Long getMatchedUnits() {
        return matchedUnits;
    }


    /**
     * Sets the matchedUnits value for this LineItemDeliveryForecast.
     * 
     * @param matchedUnits   * The number of units, defined by {@link Goal#unitType}, that
     * match the specified
     *                 {@link LineItem#targeting} and delivery settings.
     */
    public void setMatchedUnits(java.lang.Long matchedUnits) {
        this.matchedUnits = matchedUnits;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LineItemDeliveryForecast)) return false;
        LineItemDeliveryForecast other = (LineItemDeliveryForecast) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lineItemId==null && other.getLineItemId()==null) || 
             (this.lineItemId!=null &&
              this.lineItemId.equals(other.getLineItemId()))) &&
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.unitType==null && other.getUnitType()==null) || 
             (this.unitType!=null &&
              this.unitType.equals(other.getUnitType()))) &&
            ((this.predictedDeliveryUnits==null && other.getPredictedDeliveryUnits()==null) || 
             (this.predictedDeliveryUnits!=null &&
              this.predictedDeliveryUnits.equals(other.getPredictedDeliveryUnits()))) &&
            ((this.deliveredUnits==null && other.getDeliveredUnits()==null) || 
             (this.deliveredUnits!=null &&
              this.deliveredUnits.equals(other.getDeliveredUnits()))) &&
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
        if (getLineItemId() != null) {
            _hashCode += getLineItemId().hashCode();
        }
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getUnitType() != null) {
            _hashCode += getUnitType().hashCode();
        }
        if (getPredictedDeliveryUnits() != null) {
            _hashCode += getPredictedDeliveryUnits().hashCode();
        }
        if (getDeliveredUnits() != null) {
            _hashCode += getDeliveredUnits().hashCode();
        }
        if (getMatchedUnits() != null) {
            _hashCode += getMatchedUnits().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LineItemDeliveryForecast.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "LineItemDeliveryForecast"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "lineItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "orderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "unitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "UnitType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("predictedDeliveryUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "predictedDeliveryUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveredUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "deliveredUnits"));
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
