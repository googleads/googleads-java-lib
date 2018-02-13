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
 * AvailabilityForecast.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Describes predicted inventory availability for a {@link ProspectiveLineItem}.
 * 
 *             <p>Inventory has three threshold values along a line of
 * possible inventory. From least to most,
 *             these are:
 *             
 *             <dl>
 *             <li>Available units -- How many units can be booked without
 * affecting any other line items.
 *             Booking more than this number can cause lower and same
 * priority line items to underdeliver.
 *             <li>Possible units -- How many units can be booked without
 * affecting any higher priority line
 *             items. Booking more than this number can cause the line
 * item to underdeliver.
 *             <li>Matched (forecast) units -- How many units satisfy
 * all specified criteria.
 *             </dl>
 *             
 *             <p>Underdelivery is caused by overbooking. However, if
 * more impressions are served than are
 *             predicted, the extra available inventory might enable
 * all inventory guarantees to be met without
 *             overbooking.
 */
public class AvailabilityForecast  implements java.io.Serializable {
    /* Uniquely identifies this availability forecast. This value
     * is read-only
     *                 and is assigned by Google when the forecast is created.
     * The
     *                 attribute will be either the ID of the {@link LineItem}
     * object it
     *                 represents, or {@code null} if the forecast represents
     * a prospective line item. */
    private java.lang.Long lineItemId;

    /* The unique ID for the {@link Order} object that this line item
     * belongs to, or {@code null} if
     *                 the forecast represents a prospective line item without
     * an {@link LineItem#orderId} set. */
    private java.lang.Long orderId;

    /* The unit with which the goal or cap of the {@link LineItem}
     * is defined.
     *                 Will be the same value as {@link Goal#unitType} for
     * both a set line
     *                 item or a prospective one. */
    private com.google.api.ads.dfp.axis.v201802.UnitType unitType;

    /* The number of units, defined by {@link Goal#unitType}, that
     * can be
     *                 booked without affecting the delivery of any reserved
     * line items. Exceeding
     *                 this value will not cause an overbook, but lower priority
     * line items may
     *                 not run. */
    private java.lang.Long availableUnits;

    /* The number of units, defined by {@link Goal#unitType}, that
     * have already been served if the reservation is already running. */
    private java.lang.Long deliveredUnits;

    /* The number of units, defined by {@link Goal#unitType}, that
     * match the
     *                 specified targeting and delivery settings. */
    private java.lang.Long matchedUnits;

    /* The maximum number of units, defined by {@link Goal#unitType},
     * that could be booked by
     *                 taking inventory away from lower priority line items
     * and some same priority line items.
     *                 <p>Please note: booking this number may cause lower
     * priority line items and some same priority
     *                 line items to underdeliver. */
    private java.lang.Long possibleUnits;

    /* The number of reserved units, defined by {@link Goal#unitType},
     * requested.
     *                 This can be an absolute or percentage value. */
    private java.lang.Long reservedUnits;

    /* The forecast result broken down by the targeting of the forecasted
     * line item. */
    private com.google.api.ads.dfp.axis.v201802.TargetingCriteriaBreakdown[] targetingCriteriaBreakdowns;

    /* List of {@link ContendingLineItem contending line items} for
     * this forecast. */
    private com.google.api.ads.dfp.axis.v201802.ContendingLineItem[] contendingLineItems;

    /* Views of this forecast, with alternative unit types. */
    private com.google.api.ads.dfp.axis.v201802.AlternativeUnitTypeForecast[] alternativeUnitTypeForecasts;

    /* The forecast result broken down by demographics. */
    private com.google.api.ads.dfp.axis.v201802.GrpDemographicBreakdown[] demographicBreakdowns;

    public AvailabilityForecast() {
    }

    public AvailabilityForecast(
           java.lang.Long lineItemId,
           java.lang.Long orderId,
           com.google.api.ads.dfp.axis.v201802.UnitType unitType,
           java.lang.Long availableUnits,
           java.lang.Long deliveredUnits,
           java.lang.Long matchedUnits,
           java.lang.Long possibleUnits,
           java.lang.Long reservedUnits,
           com.google.api.ads.dfp.axis.v201802.TargetingCriteriaBreakdown[] targetingCriteriaBreakdowns,
           com.google.api.ads.dfp.axis.v201802.ContendingLineItem[] contendingLineItems,
           com.google.api.ads.dfp.axis.v201802.AlternativeUnitTypeForecast[] alternativeUnitTypeForecasts,
           com.google.api.ads.dfp.axis.v201802.GrpDemographicBreakdown[] demographicBreakdowns) {
           this.lineItemId = lineItemId;
           this.orderId = orderId;
           this.unitType = unitType;
           this.availableUnits = availableUnits;
           this.deliveredUnits = deliveredUnits;
           this.matchedUnits = matchedUnits;
           this.possibleUnits = possibleUnits;
           this.reservedUnits = reservedUnits;
           this.targetingCriteriaBreakdowns = targetingCriteriaBreakdowns;
           this.contendingLineItems = contendingLineItems;
           this.alternativeUnitTypeForecasts = alternativeUnitTypeForecasts;
           this.demographicBreakdowns = demographicBreakdowns;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("alternativeUnitTypeForecasts", getAlternativeUnitTypeForecasts())
            .add("availableUnits", getAvailableUnits())
            .add("contendingLineItems", getContendingLineItems())
            .add("deliveredUnits", getDeliveredUnits())
            .add("demographicBreakdowns", getDemographicBreakdowns())
            .add("lineItemId", getLineItemId())
            .add("matchedUnits", getMatchedUnits())
            .add("orderId", getOrderId())
            .add("possibleUnits", getPossibleUnits())
            .add("reservedUnits", getReservedUnits())
            .add("targetingCriteriaBreakdowns", getTargetingCriteriaBreakdowns())
            .add("unitType", getUnitType())
            .toString();
    }

    /**
     * Gets the lineItemId value for this AvailabilityForecast.
     * 
     * @return lineItemId   * Uniquely identifies this availability forecast. This value
     * is read-only
     *                 and is assigned by Google when the forecast is created.
     * The
     *                 attribute will be either the ID of the {@link LineItem}
     * object it
     *                 represents, or {@code null} if the forecast represents
     * a prospective line item.
     */
    public java.lang.Long getLineItemId() {
        return lineItemId;
    }


    /**
     * Sets the lineItemId value for this AvailabilityForecast.
     * 
     * @param lineItemId   * Uniquely identifies this availability forecast. This value
     * is read-only
     *                 and is assigned by Google when the forecast is created.
     * The
     *                 attribute will be either the ID of the {@link LineItem}
     * object it
     *                 represents, or {@code null} if the forecast represents
     * a prospective line item.
     */
    public void setLineItemId(java.lang.Long lineItemId) {
        this.lineItemId = lineItemId;
    }


    /**
     * Gets the orderId value for this AvailabilityForecast.
     * 
     * @return orderId   * The unique ID for the {@link Order} object that this line item
     * belongs to, or {@code null} if
     *                 the forecast represents a prospective line item without
     * an {@link LineItem#orderId} set.
     */
    public java.lang.Long getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this AvailabilityForecast.
     * 
     * @param orderId   * The unique ID for the {@link Order} object that this line item
     * belongs to, or {@code null} if
     *                 the forecast represents a prospective line item without
     * an {@link LineItem#orderId} set.
     */
    public void setOrderId(java.lang.Long orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the unitType value for this AvailabilityForecast.
     * 
     * @return unitType   * The unit with which the goal or cap of the {@link LineItem}
     * is defined.
     *                 Will be the same value as {@link Goal#unitType} for
     * both a set line
     *                 item or a prospective one.
     */
    public com.google.api.ads.dfp.axis.v201802.UnitType getUnitType() {
        return unitType;
    }


    /**
     * Sets the unitType value for this AvailabilityForecast.
     * 
     * @param unitType   * The unit with which the goal or cap of the {@link LineItem}
     * is defined.
     *                 Will be the same value as {@link Goal#unitType} for
     * both a set line
     *                 item or a prospective one.
     */
    public void setUnitType(com.google.api.ads.dfp.axis.v201802.UnitType unitType) {
        this.unitType = unitType;
    }


    /**
     * Gets the availableUnits value for this AvailabilityForecast.
     * 
     * @return availableUnits   * The number of units, defined by {@link Goal#unitType}, that
     * can be
     *                 booked without affecting the delivery of any reserved
     * line items. Exceeding
     *                 this value will not cause an overbook, but lower priority
     * line items may
     *                 not run.
     */
    public java.lang.Long getAvailableUnits() {
        return availableUnits;
    }


    /**
     * Sets the availableUnits value for this AvailabilityForecast.
     * 
     * @param availableUnits   * The number of units, defined by {@link Goal#unitType}, that
     * can be
     *                 booked without affecting the delivery of any reserved
     * line items. Exceeding
     *                 this value will not cause an overbook, but lower priority
     * line items may
     *                 not run.
     */
    public void setAvailableUnits(java.lang.Long availableUnits) {
        this.availableUnits = availableUnits;
    }


    /**
     * Gets the deliveredUnits value for this AvailabilityForecast.
     * 
     * @return deliveredUnits   * The number of units, defined by {@link Goal#unitType}, that
     * have already been served if the reservation is already running.
     */
    public java.lang.Long getDeliveredUnits() {
        return deliveredUnits;
    }


    /**
     * Sets the deliveredUnits value for this AvailabilityForecast.
     * 
     * @param deliveredUnits   * The number of units, defined by {@link Goal#unitType}, that
     * have already been served if the reservation is already running.
     */
    public void setDeliveredUnits(java.lang.Long deliveredUnits) {
        this.deliveredUnits = deliveredUnits;
    }


    /**
     * Gets the matchedUnits value for this AvailabilityForecast.
     * 
     * @return matchedUnits   * The number of units, defined by {@link Goal#unitType}, that
     * match the
     *                 specified targeting and delivery settings.
     */
    public java.lang.Long getMatchedUnits() {
        return matchedUnits;
    }


    /**
     * Sets the matchedUnits value for this AvailabilityForecast.
     * 
     * @param matchedUnits   * The number of units, defined by {@link Goal#unitType}, that
     * match the
     *                 specified targeting and delivery settings.
     */
    public void setMatchedUnits(java.lang.Long matchedUnits) {
        this.matchedUnits = matchedUnits;
    }


    /**
     * Gets the possibleUnits value for this AvailabilityForecast.
     * 
     * @return possibleUnits   * The maximum number of units, defined by {@link Goal#unitType},
     * that could be booked by
     *                 taking inventory away from lower priority line items
     * and some same priority line items.
     *                 <p>Please note: booking this number may cause lower
     * priority line items and some same priority
     *                 line items to underdeliver.
     */
    public java.lang.Long getPossibleUnits() {
        return possibleUnits;
    }


    /**
     * Sets the possibleUnits value for this AvailabilityForecast.
     * 
     * @param possibleUnits   * The maximum number of units, defined by {@link Goal#unitType},
     * that could be booked by
     *                 taking inventory away from lower priority line items
     * and some same priority line items.
     *                 <p>Please note: booking this number may cause lower
     * priority line items and some same priority
     *                 line items to underdeliver.
     */
    public void setPossibleUnits(java.lang.Long possibleUnits) {
        this.possibleUnits = possibleUnits;
    }


    /**
     * Gets the reservedUnits value for this AvailabilityForecast.
     * 
     * @return reservedUnits   * The number of reserved units, defined by {@link Goal#unitType},
     * requested.
     *                 This can be an absolute or percentage value.
     */
    public java.lang.Long getReservedUnits() {
        return reservedUnits;
    }


    /**
     * Sets the reservedUnits value for this AvailabilityForecast.
     * 
     * @param reservedUnits   * The number of reserved units, defined by {@link Goal#unitType},
     * requested.
     *                 This can be an absolute or percentage value.
     */
    public void setReservedUnits(java.lang.Long reservedUnits) {
        this.reservedUnits = reservedUnits;
    }


    /**
     * Gets the targetingCriteriaBreakdowns value for this AvailabilityForecast.
     * 
     * @return targetingCriteriaBreakdowns   * The forecast result broken down by the targeting of the forecasted
     * line item.
     */
    public com.google.api.ads.dfp.axis.v201802.TargetingCriteriaBreakdown[] getTargetingCriteriaBreakdowns() {
        return targetingCriteriaBreakdowns;
    }


    /**
     * Sets the targetingCriteriaBreakdowns value for this AvailabilityForecast.
     * 
     * @param targetingCriteriaBreakdowns   * The forecast result broken down by the targeting of the forecasted
     * line item.
     */
    public void setTargetingCriteriaBreakdowns(com.google.api.ads.dfp.axis.v201802.TargetingCriteriaBreakdown[] targetingCriteriaBreakdowns) {
        this.targetingCriteriaBreakdowns = targetingCriteriaBreakdowns;
    }

    public com.google.api.ads.dfp.axis.v201802.TargetingCriteriaBreakdown getTargetingCriteriaBreakdowns(int i) {
        return this.targetingCriteriaBreakdowns[i];
    }

    public void setTargetingCriteriaBreakdowns(int i, com.google.api.ads.dfp.axis.v201802.TargetingCriteriaBreakdown _value) {
        this.targetingCriteriaBreakdowns[i] = _value;
    }


    /**
     * Gets the contendingLineItems value for this AvailabilityForecast.
     * 
     * @return contendingLineItems   * List of {@link ContendingLineItem contending line items} for
     * this forecast.
     */
    public com.google.api.ads.dfp.axis.v201802.ContendingLineItem[] getContendingLineItems() {
        return contendingLineItems;
    }


    /**
     * Sets the contendingLineItems value for this AvailabilityForecast.
     * 
     * @param contendingLineItems   * List of {@link ContendingLineItem contending line items} for
     * this forecast.
     */
    public void setContendingLineItems(com.google.api.ads.dfp.axis.v201802.ContendingLineItem[] contendingLineItems) {
        this.contendingLineItems = contendingLineItems;
    }

    public com.google.api.ads.dfp.axis.v201802.ContendingLineItem getContendingLineItems(int i) {
        return this.contendingLineItems[i];
    }

    public void setContendingLineItems(int i, com.google.api.ads.dfp.axis.v201802.ContendingLineItem _value) {
        this.contendingLineItems[i] = _value;
    }


    /**
     * Gets the alternativeUnitTypeForecasts value for this AvailabilityForecast.
     * 
     * @return alternativeUnitTypeForecasts   * Views of this forecast, with alternative unit types.
     */
    public com.google.api.ads.dfp.axis.v201802.AlternativeUnitTypeForecast[] getAlternativeUnitTypeForecasts() {
        return alternativeUnitTypeForecasts;
    }


    /**
     * Sets the alternativeUnitTypeForecasts value for this AvailabilityForecast.
     * 
     * @param alternativeUnitTypeForecasts   * Views of this forecast, with alternative unit types.
     */
    public void setAlternativeUnitTypeForecasts(com.google.api.ads.dfp.axis.v201802.AlternativeUnitTypeForecast[] alternativeUnitTypeForecasts) {
        this.alternativeUnitTypeForecasts = alternativeUnitTypeForecasts;
    }

    public com.google.api.ads.dfp.axis.v201802.AlternativeUnitTypeForecast getAlternativeUnitTypeForecasts(int i) {
        return this.alternativeUnitTypeForecasts[i];
    }

    public void setAlternativeUnitTypeForecasts(int i, com.google.api.ads.dfp.axis.v201802.AlternativeUnitTypeForecast _value) {
        this.alternativeUnitTypeForecasts[i] = _value;
    }


    /**
     * Gets the demographicBreakdowns value for this AvailabilityForecast.
     * 
     * @return demographicBreakdowns   * The forecast result broken down by demographics.
     */
    public com.google.api.ads.dfp.axis.v201802.GrpDemographicBreakdown[] getDemographicBreakdowns() {
        return demographicBreakdowns;
    }


    /**
     * Sets the demographicBreakdowns value for this AvailabilityForecast.
     * 
     * @param demographicBreakdowns   * The forecast result broken down by demographics.
     */
    public void setDemographicBreakdowns(com.google.api.ads.dfp.axis.v201802.GrpDemographicBreakdown[] demographicBreakdowns) {
        this.demographicBreakdowns = demographicBreakdowns;
    }

    public com.google.api.ads.dfp.axis.v201802.GrpDemographicBreakdown getDemographicBreakdowns(int i) {
        return this.demographicBreakdowns[i];
    }

    public void setDemographicBreakdowns(int i, com.google.api.ads.dfp.axis.v201802.GrpDemographicBreakdown _value) {
        this.demographicBreakdowns[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AvailabilityForecast)) return false;
        AvailabilityForecast other = (AvailabilityForecast) obj;
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
            ((this.availableUnits==null && other.getAvailableUnits()==null) || 
             (this.availableUnits!=null &&
              this.availableUnits.equals(other.getAvailableUnits()))) &&
            ((this.deliveredUnits==null && other.getDeliveredUnits()==null) || 
             (this.deliveredUnits!=null &&
              this.deliveredUnits.equals(other.getDeliveredUnits()))) &&
            ((this.matchedUnits==null && other.getMatchedUnits()==null) || 
             (this.matchedUnits!=null &&
              this.matchedUnits.equals(other.getMatchedUnits()))) &&
            ((this.possibleUnits==null && other.getPossibleUnits()==null) || 
             (this.possibleUnits!=null &&
              this.possibleUnits.equals(other.getPossibleUnits()))) &&
            ((this.reservedUnits==null && other.getReservedUnits()==null) || 
             (this.reservedUnits!=null &&
              this.reservedUnits.equals(other.getReservedUnits()))) &&
            ((this.targetingCriteriaBreakdowns==null && other.getTargetingCriteriaBreakdowns()==null) || 
             (this.targetingCriteriaBreakdowns!=null &&
              java.util.Arrays.equals(this.targetingCriteriaBreakdowns, other.getTargetingCriteriaBreakdowns()))) &&
            ((this.contendingLineItems==null && other.getContendingLineItems()==null) || 
             (this.contendingLineItems!=null &&
              java.util.Arrays.equals(this.contendingLineItems, other.getContendingLineItems()))) &&
            ((this.alternativeUnitTypeForecasts==null && other.getAlternativeUnitTypeForecasts()==null) || 
             (this.alternativeUnitTypeForecasts!=null &&
              java.util.Arrays.equals(this.alternativeUnitTypeForecasts, other.getAlternativeUnitTypeForecasts()))) &&
            ((this.demographicBreakdowns==null && other.getDemographicBreakdowns()==null) || 
             (this.demographicBreakdowns!=null &&
              java.util.Arrays.equals(this.demographicBreakdowns, other.getDemographicBreakdowns())));
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
        if (getAvailableUnits() != null) {
            _hashCode += getAvailableUnits().hashCode();
        }
        if (getDeliveredUnits() != null) {
            _hashCode += getDeliveredUnits().hashCode();
        }
        if (getMatchedUnits() != null) {
            _hashCode += getMatchedUnits().hashCode();
        }
        if (getPossibleUnits() != null) {
            _hashCode += getPossibleUnits().hashCode();
        }
        if (getReservedUnits() != null) {
            _hashCode += getReservedUnits().hashCode();
        }
        if (getTargetingCriteriaBreakdowns() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetingCriteriaBreakdowns());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetingCriteriaBreakdowns(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContendingLineItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContendingLineItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContendingLineItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAlternativeUnitTypeForecasts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAlternativeUnitTypeForecasts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAlternativeUnitTypeForecasts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDemographicBreakdowns() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDemographicBreakdowns());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDemographicBreakdowns(), i);
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
        new org.apache.axis.description.TypeDesc(AvailabilityForecast.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "AvailabilityForecast"));
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
        elemField.setFieldName("availableUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "availableUnits"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("possibleUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "possibleUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservedUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "reservedUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetingCriteriaBreakdowns");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "targetingCriteriaBreakdowns"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "TargetingCriteriaBreakdown"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contendingLineItems");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "contendingLineItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ContendingLineItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternativeUnitTypeForecasts");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "alternativeUnitTypeForecasts"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "AlternativeUnitTypeForecast"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("demographicBreakdowns");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "demographicBreakdowns"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "GrpDemographicBreakdown"));
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
