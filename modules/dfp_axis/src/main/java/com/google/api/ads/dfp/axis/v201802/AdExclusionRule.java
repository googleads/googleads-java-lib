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
 * AdExclusionRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Represents an inventory blocking rule, which prevents certain ads
 * from being served to specified
 *             ad units.
 */
public class AdExclusionRule  implements java.io.Serializable {
    /* The unique ID of the {@code AdExclusionRule}. This attribute
     * is readonly and is assigned
     *                 by Google. */
    private java.lang.Long id;

    /* The name of the {@code AdExclusionRule}. This attribute is
     * required. */
    private java.lang.String name;

    /* Whether or not the {@code AdExclusionRule} is active. An inactive
     * rule will have no
     *                 effect on adserving.  This attribute is readonly. */
    private java.lang.Boolean isActive;

    /* The targeting information about which {@link AdUnitTargeting}
     * objects this rule is in effect
     *                 for. Any {@link AdUnitTargeting} objects included
     * here will have their children included
     *                 implicitly. Children of a targeted ad unit can be
     * excluded.  This attribute is required. */
    private com.google.api.ads.dfp.axis.v201802.InventoryTargeting inventoryTargeting;

    /* Whether or not this rule blocks all ads from serving other
     * than the labels or advertisers
     *                 specified. This attribute is optional and defaults
     * to false. */
    private java.lang.Boolean isBlockAll;

    /* The labels that will be blocked from serving. Any advertiser,
     * order or line item
     *                 with one of these labels will not serve on the relevant
     * ad units and their children. */
    private long[] blockedLabelIds;

    /* The allowed list of labels that will not be blocked by this
     * rule. This trumps the values of
     *                 {@link #isBlockAllLabels} and {@link #blockedLabelIds}.
     * For example, if a rule specifies
     *                 a blocked label "Cars", and an allowed label "Sports",
     * any ad that is labeled both
     *                 "Sports" and "Cars" will not be blocked by this rule. */
    private long[] allowedLabelIds;

    /* The derived type of this rule: whether it is associated with
     * labels, unified entities,
     *                 or competitive groups.  Because it is derived, it
     * is also read-only, so changes made to this
     *                 field will not be persisted. */
    private com.google.api.ads.dfp.axis.v201802.AdExclusionRuleType type;

    public AdExclusionRule() {
    }

    public AdExclusionRule(
           java.lang.Long id,
           java.lang.String name,
           java.lang.Boolean isActive,
           com.google.api.ads.dfp.axis.v201802.InventoryTargeting inventoryTargeting,
           java.lang.Boolean isBlockAll,
           long[] blockedLabelIds,
           long[] allowedLabelIds,
           com.google.api.ads.dfp.axis.v201802.AdExclusionRuleType type) {
           this.id = id;
           this.name = name;
           this.isActive = isActive;
           this.inventoryTargeting = inventoryTargeting;
           this.isBlockAll = isBlockAll;
           this.blockedLabelIds = blockedLabelIds;
           this.allowedLabelIds = allowedLabelIds;
           this.type = type;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("allowedLabelIds", getAllowedLabelIds())
            .add("blockedLabelIds", getBlockedLabelIds())
            .add("id", getId())
            .add("inventoryTargeting", getInventoryTargeting())
            .add("isActive", getIsActive())
            .add("isBlockAll", getIsBlockAll())
            .add("name", getName())
            .add("type", getType())
            .toString();
    }

    /**
     * Gets the id value for this AdExclusionRule.
     * 
     * @return id   * The unique ID of the {@code AdExclusionRule}. This attribute
     * is readonly and is assigned
     *                 by Google.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this AdExclusionRule.
     * 
     * @param id   * The unique ID of the {@code AdExclusionRule}. This attribute
     * is readonly and is assigned
     *                 by Google.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this AdExclusionRule.
     * 
     * @return name   * The name of the {@code AdExclusionRule}. This attribute is
     * required.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this AdExclusionRule.
     * 
     * @param name   * The name of the {@code AdExclusionRule}. This attribute is
     * required.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the isActive value for this AdExclusionRule.
     * 
     * @return isActive   * Whether or not the {@code AdExclusionRule} is active. An inactive
     * rule will have no
     *                 effect on adserving.  This attribute is readonly.
     */
    public java.lang.Boolean getIsActive() {
        return isActive;
    }


    /**
     * Sets the isActive value for this AdExclusionRule.
     * 
     * @param isActive   * Whether or not the {@code AdExclusionRule} is active. An inactive
     * rule will have no
     *                 effect on adserving.  This attribute is readonly.
     */
    public void setIsActive(java.lang.Boolean isActive) {
        this.isActive = isActive;
    }


    /**
     * Gets the inventoryTargeting value for this AdExclusionRule.
     * 
     * @return inventoryTargeting   * The targeting information about which {@link AdUnitTargeting}
     * objects this rule is in effect
     *                 for. Any {@link AdUnitTargeting} objects included
     * here will have their children included
     *                 implicitly. Children of a targeted ad unit can be
     * excluded.  This attribute is required.
     */
    public com.google.api.ads.dfp.axis.v201802.InventoryTargeting getInventoryTargeting() {
        return inventoryTargeting;
    }


    /**
     * Sets the inventoryTargeting value for this AdExclusionRule.
     * 
     * @param inventoryTargeting   * The targeting information about which {@link AdUnitTargeting}
     * objects this rule is in effect
     *                 for. Any {@link AdUnitTargeting} objects included
     * here will have their children included
     *                 implicitly. Children of a targeted ad unit can be
     * excluded.  This attribute is required.
     */
    public void setInventoryTargeting(com.google.api.ads.dfp.axis.v201802.InventoryTargeting inventoryTargeting) {
        this.inventoryTargeting = inventoryTargeting;
    }


    /**
     * Gets the isBlockAll value for this AdExclusionRule.
     * 
     * @return isBlockAll   * Whether or not this rule blocks all ads from serving other
     * than the labels or advertisers
     *                 specified. This attribute is optional and defaults
     * to false.
     */
    public java.lang.Boolean getIsBlockAll() {
        return isBlockAll;
    }


    /**
     * Sets the isBlockAll value for this AdExclusionRule.
     * 
     * @param isBlockAll   * Whether or not this rule blocks all ads from serving other
     * than the labels or advertisers
     *                 specified. This attribute is optional and defaults
     * to false.
     */
    public void setIsBlockAll(java.lang.Boolean isBlockAll) {
        this.isBlockAll = isBlockAll;
    }


    /**
     * Gets the blockedLabelIds value for this AdExclusionRule.
     * 
     * @return blockedLabelIds   * The labels that will be blocked from serving. Any advertiser,
     * order or line item
     *                 with one of these labels will not serve on the relevant
     * ad units and their children.
     */
    public long[] getBlockedLabelIds() {
        return blockedLabelIds;
    }


    /**
     * Sets the blockedLabelIds value for this AdExclusionRule.
     * 
     * @param blockedLabelIds   * The labels that will be blocked from serving. Any advertiser,
     * order or line item
     *                 with one of these labels will not serve on the relevant
     * ad units and their children.
     */
    public void setBlockedLabelIds(long[] blockedLabelIds) {
        this.blockedLabelIds = blockedLabelIds;
    }

    public long getBlockedLabelIds(int i) {
        return this.blockedLabelIds[i];
    }

    public void setBlockedLabelIds(int i, long _value) {
        this.blockedLabelIds[i] = _value;
    }


    /**
     * Gets the allowedLabelIds value for this AdExclusionRule.
     * 
     * @return allowedLabelIds   * The allowed list of labels that will not be blocked by this
     * rule. This trumps the values of
     *                 {@link #isBlockAllLabels} and {@link #blockedLabelIds}.
     * For example, if a rule specifies
     *                 a blocked label "Cars", and an allowed label "Sports",
     * any ad that is labeled both
     *                 "Sports" and "Cars" will not be blocked by this rule.
     */
    public long[] getAllowedLabelIds() {
        return allowedLabelIds;
    }


    /**
     * Sets the allowedLabelIds value for this AdExclusionRule.
     * 
     * @param allowedLabelIds   * The allowed list of labels that will not be blocked by this
     * rule. This trumps the values of
     *                 {@link #isBlockAllLabels} and {@link #blockedLabelIds}.
     * For example, if a rule specifies
     *                 a blocked label "Cars", and an allowed label "Sports",
     * any ad that is labeled both
     *                 "Sports" and "Cars" will not be blocked by this rule.
     */
    public void setAllowedLabelIds(long[] allowedLabelIds) {
        this.allowedLabelIds = allowedLabelIds;
    }

    public long getAllowedLabelIds(int i) {
        return this.allowedLabelIds[i];
    }

    public void setAllowedLabelIds(int i, long _value) {
        this.allowedLabelIds[i] = _value;
    }


    /**
     * Gets the type value for this AdExclusionRule.
     * 
     * @return type   * The derived type of this rule: whether it is associated with
     * labels, unified entities,
     *                 or competitive groups.  Because it is derived, it
     * is also read-only, so changes made to this
     *                 field will not be persisted.
     */
    public com.google.api.ads.dfp.axis.v201802.AdExclusionRuleType getType() {
        return type;
    }


    /**
     * Sets the type value for this AdExclusionRule.
     * 
     * @param type   * The derived type of this rule: whether it is associated with
     * labels, unified entities,
     *                 or competitive groups.  Because it is derived, it
     * is also read-only, so changes made to this
     *                 field will not be persisted.
     */
    public void setType(com.google.api.ads.dfp.axis.v201802.AdExclusionRuleType type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdExclusionRule)) return false;
        AdExclusionRule other = (AdExclusionRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.isActive==null && other.getIsActive()==null) || 
             (this.isActive!=null &&
              this.isActive.equals(other.getIsActive()))) &&
            ((this.inventoryTargeting==null && other.getInventoryTargeting()==null) || 
             (this.inventoryTargeting!=null &&
              this.inventoryTargeting.equals(other.getInventoryTargeting()))) &&
            ((this.isBlockAll==null && other.getIsBlockAll()==null) || 
             (this.isBlockAll!=null &&
              this.isBlockAll.equals(other.getIsBlockAll()))) &&
            ((this.blockedLabelIds==null && other.getBlockedLabelIds()==null) || 
             (this.blockedLabelIds!=null &&
              java.util.Arrays.equals(this.blockedLabelIds, other.getBlockedLabelIds()))) &&
            ((this.allowedLabelIds==null && other.getAllowedLabelIds()==null) || 
             (this.allowedLabelIds!=null &&
              java.util.Arrays.equals(this.allowedLabelIds, other.getAllowedLabelIds()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getIsActive() != null) {
            _hashCode += getIsActive().hashCode();
        }
        if (getInventoryTargeting() != null) {
            _hashCode += getInventoryTargeting().hashCode();
        }
        if (getIsBlockAll() != null) {
            _hashCode += getIsBlockAll().hashCode();
        }
        if (getBlockedLabelIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBlockedLabelIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBlockedLabelIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAllowedLabelIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAllowedLabelIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAllowedLabelIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdExclusionRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "AdExclusionRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isActive");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "isActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventoryTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "inventoryTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "InventoryTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isBlockAll");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "isBlockAll"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockedLabelIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "blockedLabelIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowedLabelIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "allowedLabelIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "AdExclusionRuleType"));
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
