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
 * Goal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Defines the criteria a {@link LineItem} needs to satisfy to meet
 * its delivery goal.
 */
public class Goal  implements java.io.Serializable {
    /* The type of the goal for the {@code LineItem}. It defines the
     * period over which the goal
     *                 for {@code LineItem} should be reached. */
    private com.google.api.ads.dfp.axis.v201802.GoalType goalType;

    /* The type of the goal unit for the {@code LineItem}. */
    private com.google.api.ads.dfp.axis.v201802.UnitType unitType;

    /* If this is a primary goal, it represents the number or percentage
     * of impressions or clicks
     *                 that will be reserved for the {@code LineItem}. If
     * the line item is of type
     *                 {@link LineItemType#SPONSORSHIP}, it represents the
     * percentage of available impressions
     *                 reserved. If the line item is of type {@link LineItemType#BULK}
     * or
     *                 {@link LineItemType#PRICE_PRIORITY}, it represents
     * the number of remaining impressions
     *                 reserved. If the line item is of type {@link LineItemType#NETWORK}
     * or
     *                 {@link LineItemType#HOUSE}, it represents the percentage
     * of remaining impressions
     *                 reserved.
     *                 
     *                 <p>If this is a secondary goal, it represents the
     * number of impressions or conversions that
     *                 the line item will stop serving at if reached. For
     * valid line item types, see
     *                 {@link LineItem#secondaryGoals}. */
    private java.lang.Long units;

    public Goal() {
    }

    public Goal(
           com.google.api.ads.dfp.axis.v201802.GoalType goalType,
           com.google.api.ads.dfp.axis.v201802.UnitType unitType,
           java.lang.Long units) {
           this.goalType = goalType;
           this.unitType = unitType;
           this.units = units;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("goalType", getGoalType())
            .add("unitType", getUnitType())
            .add("units", getUnits())
            .toString();
    }

    /**
     * Gets the goalType value for this Goal.
     * 
     * @return goalType   * The type of the goal for the {@code LineItem}. It defines the
     * period over which the goal
     *                 for {@code LineItem} should be reached.
     */
    public com.google.api.ads.dfp.axis.v201802.GoalType getGoalType() {
        return goalType;
    }


    /**
     * Sets the goalType value for this Goal.
     * 
     * @param goalType   * The type of the goal for the {@code LineItem}. It defines the
     * period over which the goal
     *                 for {@code LineItem} should be reached.
     */
    public void setGoalType(com.google.api.ads.dfp.axis.v201802.GoalType goalType) {
        this.goalType = goalType;
    }


    /**
     * Gets the unitType value for this Goal.
     * 
     * @return unitType   * The type of the goal unit for the {@code LineItem}.
     */
    public com.google.api.ads.dfp.axis.v201802.UnitType getUnitType() {
        return unitType;
    }


    /**
     * Sets the unitType value for this Goal.
     * 
     * @param unitType   * The type of the goal unit for the {@code LineItem}.
     */
    public void setUnitType(com.google.api.ads.dfp.axis.v201802.UnitType unitType) {
        this.unitType = unitType;
    }


    /**
     * Gets the units value for this Goal.
     * 
     * @return units   * If this is a primary goal, it represents the number or percentage
     * of impressions or clicks
     *                 that will be reserved for the {@code LineItem}. If
     * the line item is of type
     *                 {@link LineItemType#SPONSORSHIP}, it represents the
     * percentage of available impressions
     *                 reserved. If the line item is of type {@link LineItemType#BULK}
     * or
     *                 {@link LineItemType#PRICE_PRIORITY}, it represents
     * the number of remaining impressions
     *                 reserved. If the line item is of type {@link LineItemType#NETWORK}
     * or
     *                 {@link LineItemType#HOUSE}, it represents the percentage
     * of remaining impressions
     *                 reserved.
     *                 
     *                 <p>If this is a secondary goal, it represents the
     * number of impressions or conversions that
     *                 the line item will stop serving at if reached. For
     * valid line item types, see
     *                 {@link LineItem#secondaryGoals}.
     */
    public java.lang.Long getUnits() {
        return units;
    }


    /**
     * Sets the units value for this Goal.
     * 
     * @param units   * If this is a primary goal, it represents the number or percentage
     * of impressions or clicks
     *                 that will be reserved for the {@code LineItem}. If
     * the line item is of type
     *                 {@link LineItemType#SPONSORSHIP}, it represents the
     * percentage of available impressions
     *                 reserved. If the line item is of type {@link LineItemType#BULK}
     * or
     *                 {@link LineItemType#PRICE_PRIORITY}, it represents
     * the number of remaining impressions
     *                 reserved. If the line item is of type {@link LineItemType#NETWORK}
     * or
     *                 {@link LineItemType#HOUSE}, it represents the percentage
     * of remaining impressions
     *                 reserved.
     *                 
     *                 <p>If this is a secondary goal, it represents the
     * number of impressions or conversions that
     *                 the line item will stop serving at if reached. For
     * valid line item types, see
     *                 {@link LineItem#secondaryGoals}.
     */
    public void setUnits(java.lang.Long units) {
        this.units = units;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Goal)) return false;
        Goal other = (Goal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.goalType==null && other.getGoalType()==null) || 
             (this.goalType!=null &&
              this.goalType.equals(other.getGoalType()))) &&
            ((this.unitType==null && other.getUnitType()==null) || 
             (this.unitType!=null &&
              this.unitType.equals(other.getUnitType()))) &&
            ((this.units==null && other.getUnits()==null) || 
             (this.units!=null &&
              this.units.equals(other.getUnits())));
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
        if (getGoalType() != null) {
            _hashCode += getGoalType().hashCode();
        }
        if (getUnitType() != null) {
            _hashCode += getUnitType().hashCode();
        }
        if (getUnits() != null) {
            _hashCode += getUnits().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Goal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Goal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("goalType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "goalType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "GoalType"));
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
        elemField.setFieldName("units");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "units"));
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
