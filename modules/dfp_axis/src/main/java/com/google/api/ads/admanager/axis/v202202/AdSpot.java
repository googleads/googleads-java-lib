// Copyright 2022 Google LLC
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
 * AdSpot.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202202;


/**
 * A {@link AdSpot} is a targetable entity used in the creation of
 * {@link AdRule} objects.
 *             
 *             <p>A ad spot contains a variable number of ads and has
 * constraints (ad duration, reservation
 *             type, etc) on the ads that can appear in it.
 */
public class AdSpot  implements java.io.Serializable {
    /* The unique ID of the {@link AdSpot}. This value is readonly
     * and is assigned by Google. */
    private java.lang.Long id;

    /* Name of the {@link AdSpot}. The name is case insenstive and
     * can be referenced in ad tags. This
     *                 value is required if {@code customSpot} is true, and
     * cannot be set otherwise.
     *                 
     *                 <p>You can use alphanumeric characters and symbols
     * other than the following: ", ', =, !, +, #,
     *                 *, ~, ;, ^, (, ), <, >, [, ], the white space character. */
    private java.lang.String name;

    /* Descriptive name for the {@link AdSpot}.This value is optional
     * if {@code customSpot} is true,
     *                 and cannot be set otherwise. */
    private java.lang.String displayName;

    /* Whether this ad spot is a custom spot. This field is optional
     * and defaults to false.
     *                 
     *                 <p>Custom spots can be reused and targeted in the
     * targeting picker. */
    private java.lang.Boolean customSpot;

    /* Whether this ad spot is a flexible spot. This field is optional
     * and defaults to false.
     *                 
     *                 <p>Flexible spots are allowed to have no max number
     * of ads. */
    private java.lang.Boolean flexible;

    /* The maximum total duration for this {@link AdSpot}. This field
     * is optional, defaults to 0,
     *                 and supports precision to the nearest second. */
    private java.lang.Long maxDurationMillis;

    /* The maximum number of ads allowed in the {@link AdSpot}. This
     * field is optional and defaults to
     *                 O.
     *                 
     *                 <p>A {@code maxNumberOfAds} of 0 means that there
     * is no maximum for the number of ads in the ad
     *                 spot. No max ads is only supported for ad spots that
     * have {@code flexible} set to true. */
    private java.lang.Integer maxNumberOfAds;

    /* The {@link SubpodTargetingType} determines how this ad spot
     * can be targeted. This field is
     *                 required. */
    private com.google.api.ads.admanager.axis.v202202.AdSpotTargetingType targetingType;

    /* Whether backfill is blocked in this ad spot. This field is
     * optional and defaults to false. */
    private java.lang.Boolean backfillBlocked;

    /* The set of line item types that may appear in the ad spot.
     * This field is optional and defaults
     *                 to an empty set, which means that all types are allowed.
     * 
     *                 <p>Note, backfill reservation types are controlled
     * via the {@code backfillBlocked} field. */
    private com.google.api.ads.admanager.axis.v202202.LineItemType[] allowedLineItemTypes;

    /* Whether inventory sharing is blocked in this ad spot. This
     * field is optional and defaults to
     *                 false. */
    private java.lang.Boolean inventorySharingBlocked;

    public AdSpot() {
    }

    public AdSpot(
           java.lang.Long id,
           java.lang.String name,
           java.lang.String displayName,
           java.lang.Boolean customSpot,
           java.lang.Boolean flexible,
           java.lang.Long maxDurationMillis,
           java.lang.Integer maxNumberOfAds,
           com.google.api.ads.admanager.axis.v202202.AdSpotTargetingType targetingType,
           java.lang.Boolean backfillBlocked,
           com.google.api.ads.admanager.axis.v202202.LineItemType[] allowedLineItemTypes,
           java.lang.Boolean inventorySharingBlocked) {
           this.id = id;
           this.name = name;
           this.displayName = displayName;
           this.customSpot = customSpot;
           this.flexible = flexible;
           this.maxDurationMillis = maxDurationMillis;
           this.maxNumberOfAds = maxNumberOfAds;
           this.targetingType = targetingType;
           this.backfillBlocked = backfillBlocked;
           this.allowedLineItemTypes = allowedLineItemTypes;
           this.inventorySharingBlocked = inventorySharingBlocked;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("allowedLineItemTypes", getAllowedLineItemTypes())
            .add("backfillBlocked", getBackfillBlocked())
            .add("customSpot", getCustomSpot())
            .add("displayName", getDisplayName())
            .add("flexible", getFlexible())
            .add("id", getId())
            .add("inventorySharingBlocked", getInventorySharingBlocked())
            .add("maxDurationMillis", getMaxDurationMillis())
            .add("maxNumberOfAds", getMaxNumberOfAds())
            .add("name", getName())
            .add("targetingType", getTargetingType())
            .toString();
    }

    /**
     * Gets the id value for this AdSpot.
     * 
     * @return id   * The unique ID of the {@link AdSpot}. This value is readonly
     * and is assigned by Google.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this AdSpot.
     * 
     * @param id   * The unique ID of the {@link AdSpot}. This value is readonly
     * and is assigned by Google.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this AdSpot.
     * 
     * @return name   * Name of the {@link AdSpot}. The name is case insenstive and
     * can be referenced in ad tags. This
     *                 value is required if {@code customSpot} is true, and
     * cannot be set otherwise.
     *                 
     *                 <p>You can use alphanumeric characters and symbols
     * other than the following: ", ', =, !, +, #,
     *                 *, ~, ;, ^, (, ), <, >, [, ], the white space character.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this AdSpot.
     * 
     * @param name   * Name of the {@link AdSpot}. The name is case insenstive and
     * can be referenced in ad tags. This
     *                 value is required if {@code customSpot} is true, and
     * cannot be set otherwise.
     *                 
     *                 <p>You can use alphanumeric characters and symbols
     * other than the following: ", ', =, !, +, #,
     *                 *, ~, ;, ^, (, ), <, >, [, ], the white space character.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the displayName value for this AdSpot.
     * 
     * @return displayName   * Descriptive name for the {@link AdSpot}.This value is optional
     * if {@code customSpot} is true,
     *                 and cannot be set otherwise.
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this AdSpot.
     * 
     * @param displayName   * Descriptive name for the {@link AdSpot}.This value is optional
     * if {@code customSpot} is true,
     *                 and cannot be set otherwise.
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the customSpot value for this AdSpot.
     * 
     * @return customSpot   * Whether this ad spot is a custom spot. This field is optional
     * and defaults to false.
     *                 
     *                 <p>Custom spots can be reused and targeted in the
     * targeting picker.
     */
    public java.lang.Boolean getCustomSpot() {
        return customSpot;
    }


    /**
     * Sets the customSpot value for this AdSpot.
     * 
     * @param customSpot   * Whether this ad spot is a custom spot. This field is optional
     * and defaults to false.
     *                 
     *                 <p>Custom spots can be reused and targeted in the
     * targeting picker.
     */
    public void setCustomSpot(java.lang.Boolean customSpot) {
        this.customSpot = customSpot;
    }


    /**
     * Gets the flexible value for this AdSpot.
     * 
     * @return flexible   * Whether this ad spot is a flexible spot. This field is optional
     * and defaults to false.
     *                 
     *                 <p>Flexible spots are allowed to have no max number
     * of ads.
     */
    public java.lang.Boolean getFlexible() {
        return flexible;
    }


    /**
     * Sets the flexible value for this AdSpot.
     * 
     * @param flexible   * Whether this ad spot is a flexible spot. This field is optional
     * and defaults to false.
     *                 
     *                 <p>Flexible spots are allowed to have no max number
     * of ads.
     */
    public void setFlexible(java.lang.Boolean flexible) {
        this.flexible = flexible;
    }


    /**
     * Gets the maxDurationMillis value for this AdSpot.
     * 
     * @return maxDurationMillis   * The maximum total duration for this {@link AdSpot}. This field
     * is optional, defaults to 0,
     *                 and supports precision to the nearest second.
     */
    public java.lang.Long getMaxDurationMillis() {
        return maxDurationMillis;
    }


    /**
     * Sets the maxDurationMillis value for this AdSpot.
     * 
     * @param maxDurationMillis   * The maximum total duration for this {@link AdSpot}. This field
     * is optional, defaults to 0,
     *                 and supports precision to the nearest second.
     */
    public void setMaxDurationMillis(java.lang.Long maxDurationMillis) {
        this.maxDurationMillis = maxDurationMillis;
    }


    /**
     * Gets the maxNumberOfAds value for this AdSpot.
     * 
     * @return maxNumberOfAds   * The maximum number of ads allowed in the {@link AdSpot}. This
     * field is optional and defaults to
     *                 O.
     *                 
     *                 <p>A {@code maxNumberOfAds} of 0 means that there
     * is no maximum for the number of ads in the ad
     *                 spot. No max ads is only supported for ad spots that
     * have {@code flexible} set to true.
     */
    public java.lang.Integer getMaxNumberOfAds() {
        return maxNumberOfAds;
    }


    /**
     * Sets the maxNumberOfAds value for this AdSpot.
     * 
     * @param maxNumberOfAds   * The maximum number of ads allowed in the {@link AdSpot}. This
     * field is optional and defaults to
     *                 O.
     *                 
     *                 <p>A {@code maxNumberOfAds} of 0 means that there
     * is no maximum for the number of ads in the ad
     *                 spot. No max ads is only supported for ad spots that
     * have {@code flexible} set to true.
     */
    public void setMaxNumberOfAds(java.lang.Integer maxNumberOfAds) {
        this.maxNumberOfAds = maxNumberOfAds;
    }


    /**
     * Gets the targetingType value for this AdSpot.
     * 
     * @return targetingType   * The {@link SubpodTargetingType} determines how this ad spot
     * can be targeted. This field is
     *                 required.
     */
    public com.google.api.ads.admanager.axis.v202202.AdSpotTargetingType getTargetingType() {
        return targetingType;
    }


    /**
     * Sets the targetingType value for this AdSpot.
     * 
     * @param targetingType   * The {@link SubpodTargetingType} determines how this ad spot
     * can be targeted. This field is
     *                 required.
     */
    public void setTargetingType(com.google.api.ads.admanager.axis.v202202.AdSpotTargetingType targetingType) {
        this.targetingType = targetingType;
    }


    /**
     * Gets the backfillBlocked value for this AdSpot.
     * 
     * @return backfillBlocked   * Whether backfill is blocked in this ad spot. This field is
     * optional and defaults to false.
     */
    public java.lang.Boolean getBackfillBlocked() {
        return backfillBlocked;
    }


    /**
     * Sets the backfillBlocked value for this AdSpot.
     * 
     * @param backfillBlocked   * Whether backfill is blocked in this ad spot. This field is
     * optional and defaults to false.
     */
    public void setBackfillBlocked(java.lang.Boolean backfillBlocked) {
        this.backfillBlocked = backfillBlocked;
    }


    /**
     * Gets the allowedLineItemTypes value for this AdSpot.
     * 
     * @return allowedLineItemTypes   * The set of line item types that may appear in the ad spot.
     * This field is optional and defaults
     *                 to an empty set, which means that all types are allowed.
     * 
     *                 <p>Note, backfill reservation types are controlled
     * via the {@code backfillBlocked} field.
     */
    public com.google.api.ads.admanager.axis.v202202.LineItemType[] getAllowedLineItemTypes() {
        return allowedLineItemTypes;
    }


    /**
     * Sets the allowedLineItemTypes value for this AdSpot.
     * 
     * @param allowedLineItemTypes   * The set of line item types that may appear in the ad spot.
     * This field is optional and defaults
     *                 to an empty set, which means that all types are allowed.
     * 
     *                 <p>Note, backfill reservation types are controlled
     * via the {@code backfillBlocked} field.
     */
    public void setAllowedLineItemTypes(com.google.api.ads.admanager.axis.v202202.LineItemType[] allowedLineItemTypes) {
        this.allowedLineItemTypes = allowedLineItemTypes;
    }

    public com.google.api.ads.admanager.axis.v202202.LineItemType getAllowedLineItemTypes(int i) {
        return this.allowedLineItemTypes[i];
    }

    public void setAllowedLineItemTypes(int i, com.google.api.ads.admanager.axis.v202202.LineItemType _value) {
        this.allowedLineItemTypes[i] = _value;
    }


    /**
     * Gets the inventorySharingBlocked value for this AdSpot.
     * 
     * @return inventorySharingBlocked   * Whether inventory sharing is blocked in this ad spot. This
     * field is optional and defaults to
     *                 false.
     */
    public java.lang.Boolean getInventorySharingBlocked() {
        return inventorySharingBlocked;
    }


    /**
     * Sets the inventorySharingBlocked value for this AdSpot.
     * 
     * @param inventorySharingBlocked   * Whether inventory sharing is blocked in this ad spot. This
     * field is optional and defaults to
     *                 false.
     */
    public void setInventorySharingBlocked(java.lang.Boolean inventorySharingBlocked) {
        this.inventorySharingBlocked = inventorySharingBlocked;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdSpot)) return false;
        AdSpot other = (AdSpot) obj;
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
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.customSpot==null && other.getCustomSpot()==null) || 
             (this.customSpot!=null &&
              this.customSpot.equals(other.getCustomSpot()))) &&
            ((this.flexible==null && other.getFlexible()==null) || 
             (this.flexible!=null &&
              this.flexible.equals(other.getFlexible()))) &&
            ((this.maxDurationMillis==null && other.getMaxDurationMillis()==null) || 
             (this.maxDurationMillis!=null &&
              this.maxDurationMillis.equals(other.getMaxDurationMillis()))) &&
            ((this.maxNumberOfAds==null && other.getMaxNumberOfAds()==null) || 
             (this.maxNumberOfAds!=null &&
              this.maxNumberOfAds.equals(other.getMaxNumberOfAds()))) &&
            ((this.targetingType==null && other.getTargetingType()==null) || 
             (this.targetingType!=null &&
              this.targetingType.equals(other.getTargetingType()))) &&
            ((this.backfillBlocked==null && other.getBackfillBlocked()==null) || 
             (this.backfillBlocked!=null &&
              this.backfillBlocked.equals(other.getBackfillBlocked()))) &&
            ((this.allowedLineItemTypes==null && other.getAllowedLineItemTypes()==null) || 
             (this.allowedLineItemTypes!=null &&
              java.util.Arrays.equals(this.allowedLineItemTypes, other.getAllowedLineItemTypes()))) &&
            ((this.inventorySharingBlocked==null && other.getInventorySharingBlocked()==null) || 
             (this.inventorySharingBlocked!=null &&
              this.inventorySharingBlocked.equals(other.getInventorySharingBlocked())));
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
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getCustomSpot() != null) {
            _hashCode += getCustomSpot().hashCode();
        }
        if (getFlexible() != null) {
            _hashCode += getFlexible().hashCode();
        }
        if (getMaxDurationMillis() != null) {
            _hashCode += getMaxDurationMillis().hashCode();
        }
        if (getMaxNumberOfAds() != null) {
            _hashCode += getMaxNumberOfAds().hashCode();
        }
        if (getTargetingType() != null) {
            _hashCode += getTargetingType().hashCode();
        }
        if (getBackfillBlocked() != null) {
            _hashCode += getBackfillBlocked().hashCode();
        }
        if (getAllowedLineItemTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAllowedLineItemTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAllowedLineItemTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInventorySharingBlocked() != null) {
            _hashCode += getInventorySharingBlocked().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdSpot.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "AdSpot"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "displayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customSpot");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "customSpot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flexible");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "flexible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxDurationMillis");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "maxDurationMillis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxNumberOfAds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "maxNumberOfAds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetingType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "targetingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "AdSpotTargetingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backfillBlocked");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "backfillBlocked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowedLineItemTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "allowedLineItemTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "LineItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventorySharingBlocked");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "inventorySharingBlocked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
