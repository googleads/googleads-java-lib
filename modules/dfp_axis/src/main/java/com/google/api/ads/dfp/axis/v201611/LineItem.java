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
 * LineItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201611;


/**
 * {@code LineItem} is an advertiser's commitment to purchase a specific
 * number
 *             of ad impressions, clicks, or time.
 */
public class LineItem  extends com.google.api.ads.dfp.axis.v201611.LineItemSummary  implements java.io.Serializable {
    /* Contains the targeting criteria for the ad campaign. This attribute
     * is
     *                     required. */
    private com.google.api.ads.dfp.axis.v201611.Targeting targeting;

    /* A list of {@link CreativeTargeting} objects that can be used
     * to specify creative level
     *                     targeting for this line item. Creative level targeting
     * is specified in a creative placeholder's
     *                     {@link CreativePlaceholder#targetingName} field
     * by referencing the creative targeting's
     *                     {@link CreativeTargeting#name name}. It also needs
     * to be re-specified in the
     *                     {@link LineItemCreativeAssociation#targetingName}
     * field when associating a line item with a
     *                     creative that fits into that placeholder. */
    private com.google.api.ads.dfp.axis.v201611.CreativeTargeting[] creativeTargetings;

    public LineItem() {
    }

    public LineItem(
           java.lang.Long orderId,
           java.lang.Long id,
           java.lang.String name,
           java.lang.String externalId,
           java.lang.String orderName,
           com.google.api.ads.dfp.axis.v201611.DateTime startDateTime,
           com.google.api.ads.dfp.axis.v201611.StartDateTimeType startDateTimeType,
           com.google.api.ads.dfp.axis.v201611.DateTime endDateTime,
           java.lang.Integer autoExtensionDays,
           java.lang.Boolean unlimitedEndDateTime,
           com.google.api.ads.dfp.axis.v201611.CreativeRotationType creativeRotationType,
           com.google.api.ads.dfp.axis.v201611.DeliveryRateType deliveryRateType,
           com.google.api.ads.dfp.axis.v201611.RoadblockingType roadblockingType,
           com.google.api.ads.dfp.axis.v201611.FrequencyCap[] frequencyCaps,
           com.google.api.ads.dfp.axis.v201611.LineItemType lineItemType,
           java.lang.Integer priority,
           com.google.api.ads.dfp.axis.v201611.Money costPerUnit,
           com.google.api.ads.dfp.axis.v201611.Money valueCostPerUnit,
           com.google.api.ads.dfp.axis.v201611.CostType costType,
           com.google.api.ads.dfp.axis.v201611.LineItemDiscountType discountType,
           java.lang.Double discount,
           java.lang.Long contractedUnitsBought,
           com.google.api.ads.dfp.axis.v201611.CreativePlaceholder[] creativePlaceholders,
           com.google.api.ads.dfp.axis.v201611.LineItemActivityAssociation[] activityAssociations,
           com.google.api.ads.dfp.axis.v201611.EnvironmentType environmentType,
           com.google.api.ads.dfp.axis.v201611.CompanionDeliveryOption companionDeliveryOption,
           com.google.api.ads.dfp.axis.v201611.CreativePersistenceType creativePersistenceType,
           java.lang.Boolean allowOverbook,
           java.lang.Boolean skipInventoryCheck,
           java.lang.Boolean skipCrossSellingRuleWarningChecks,
           java.lang.Boolean reserveAtCreation,
           com.google.api.ads.dfp.axis.v201611.Stats stats,
           com.google.api.ads.dfp.axis.v201611.DeliveryIndicator deliveryIndicator,
           com.google.api.ads.dfp.axis.v201611.DeliveryData deliveryData,
           com.google.api.ads.dfp.axis.v201611.Money budget,
           com.google.api.ads.dfp.axis.v201611.ComputedStatus status,
           com.google.api.ads.dfp.axis.v201611.LineItemSummaryReservationStatus reservationStatus,
           java.lang.Boolean isArchived,
           java.lang.String webPropertyCode,
           com.google.api.ads.dfp.axis.v201611.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.axis.v201611.AppliedLabel[] effectiveAppliedLabels,
           java.lang.Boolean disableSameAdvertiserCompetitiveExclusion,
           java.lang.String lastModifiedByApp,
           java.lang.String notes,
           com.google.api.ads.dfp.axis.v201611.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.axis.v201611.DateTime creationDateTime,
           java.lang.Boolean isPrioritizedPreferredDealsEnabled,
           java.lang.Integer adExchangeAuctionOpeningPriority,
           com.google.api.ads.dfp.axis.v201611.BaseCustomFieldValue[] customFieldValues,
           java.lang.Boolean isSetTopBoxEnabled,
           java.lang.Boolean isMissingCreatives,
           com.google.api.ads.dfp.axis.v201611.SetTopBoxInfo setTopBoxDisplayInfo,
           java.lang.Long videoMaxDuration,
           com.google.api.ads.dfp.axis.v201611.Goal primaryGoal,
           com.google.api.ads.dfp.axis.v201611.Goal[] secondaryGoals,
           com.google.api.ads.dfp.axis.v201611.GrpSettings grpSettings,
           com.google.api.ads.dfp.axis.v201611.Targeting targeting,
           com.google.api.ads.dfp.axis.v201611.CreativeTargeting[] creativeTargetings) {
        super(
            orderId,
            id,
            name,
            externalId,
            orderName,
            startDateTime,
            startDateTimeType,
            endDateTime,
            autoExtensionDays,
            unlimitedEndDateTime,
            creativeRotationType,
            deliveryRateType,
            roadblockingType,
            frequencyCaps,
            lineItemType,
            priority,
            costPerUnit,
            valueCostPerUnit,
            costType,
            discountType,
            discount,
            contractedUnitsBought,
            creativePlaceholders,
            activityAssociations,
            environmentType,
            companionDeliveryOption,
            creativePersistenceType,
            allowOverbook,
            skipInventoryCheck,
            skipCrossSellingRuleWarningChecks,
            reserveAtCreation,
            stats,
            deliveryIndicator,
            deliveryData,
            budget,
            status,
            reservationStatus,
            isArchived,
            webPropertyCode,
            appliedLabels,
            effectiveAppliedLabels,
            disableSameAdvertiserCompetitiveExclusion,
            lastModifiedByApp,
            notes,
            lastModifiedDateTime,
            creationDateTime,
            isPrioritizedPreferredDealsEnabled,
            adExchangeAuctionOpeningPriority,
            customFieldValues,
            isSetTopBoxEnabled,
            isMissingCreatives,
            setTopBoxDisplayInfo,
            videoMaxDuration,
            primaryGoal,
            secondaryGoals,
            grpSettings);
        this.targeting = targeting;
        this.creativeTargetings = creativeTargetings;
    }


    /**
     * Gets the targeting value for this LineItem.
     * 
     * @return targeting   * Contains the targeting criteria for the ad campaign. This attribute
     * is
     *                     required.
     */
    public com.google.api.ads.dfp.axis.v201611.Targeting getTargeting() {
        return targeting;
    }


    /**
     * Sets the targeting value for this LineItem.
     * 
     * @param targeting   * Contains the targeting criteria for the ad campaign. This attribute
     * is
     *                     required.
     */
    public void setTargeting(com.google.api.ads.dfp.axis.v201611.Targeting targeting) {
        this.targeting = targeting;
    }


    /**
     * Gets the creativeTargetings value for this LineItem.
     * 
     * @return creativeTargetings   * A list of {@link CreativeTargeting} objects that can be used
     * to specify creative level
     *                     targeting for this line item. Creative level targeting
     * is specified in a creative placeholder's
     *                     {@link CreativePlaceholder#targetingName} field
     * by referencing the creative targeting's
     *                     {@link CreativeTargeting#name name}. It also needs
     * to be re-specified in the
     *                     {@link LineItemCreativeAssociation#targetingName}
     * field when associating a line item with a
     *                     creative that fits into that placeholder.
     */
    public com.google.api.ads.dfp.axis.v201611.CreativeTargeting[] getCreativeTargetings() {
        return creativeTargetings;
    }


    /**
     * Sets the creativeTargetings value for this LineItem.
     * 
     * @param creativeTargetings   * A list of {@link CreativeTargeting} objects that can be used
     * to specify creative level
     *                     targeting for this line item. Creative level targeting
     * is specified in a creative placeholder's
     *                     {@link CreativePlaceholder#targetingName} field
     * by referencing the creative targeting's
     *                     {@link CreativeTargeting#name name}. It also needs
     * to be re-specified in the
     *                     {@link LineItemCreativeAssociation#targetingName}
     * field when associating a line item with a
     *                     creative that fits into that placeholder.
     */
    public void setCreativeTargetings(com.google.api.ads.dfp.axis.v201611.CreativeTargeting[] creativeTargetings) {
        this.creativeTargetings = creativeTargetings;
    }

    public com.google.api.ads.dfp.axis.v201611.CreativeTargeting getCreativeTargetings(int i) {
        return this.creativeTargetings[i];
    }

    public void setCreativeTargetings(int i, com.google.api.ads.dfp.axis.v201611.CreativeTargeting _value) {
        this.creativeTargetings[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LineItem)) return false;
        LineItem other = (LineItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.targeting==null && other.getTargeting()==null) || 
             (this.targeting!=null &&
              this.targeting.equals(other.getTargeting()))) &&
            ((this.creativeTargetings==null && other.getCreativeTargetings()==null) || 
             (this.creativeTargetings!=null &&
              java.util.Arrays.equals(this.creativeTargetings, other.getCreativeTargetings())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getTargeting() != null) {
            _hashCode += getTargeting().hashCode();
        }
        if (getCreativeTargetings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreativeTargetings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreativeTargetings(), i);
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
        new org.apache.axis.description.TypeDesc(LineItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "LineItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "targeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "Targeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeTargetings");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "creativeTargetings"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201611", "CreativeTargeting"));
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
