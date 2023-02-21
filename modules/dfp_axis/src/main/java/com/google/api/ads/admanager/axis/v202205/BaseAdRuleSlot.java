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
 * BaseAdRuleSlot.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202205;


/**
 * Simple object representing an ad slot within an {@link AdRule}.
 * Ad rule slots contain information
 *             about the types/number of ads to display, as well as additional
 * information on how the ad server
 *             will generate playlists.
 */
public abstract class BaseAdRuleSlot  implements java.io.Serializable {
    /* The {@link AdRuleSlotBehavior} for video ads for this slot.
     * This attribute is optional and
     *                 defaults to {@link AdRuleSlotBehavior#DEFER}.
     *                 
     *                 <p>Indicates whether video ads are allowed for this
     * slot, or if the decision is deferred to a
     *                 lower-priority ad rule. */
    private com.google.api.ads.admanager.axis.v202205.AdRuleSlotBehavior slotBehavior;

    /* The maximum duration in milliseconds of video ads within this
     * slot. This attribute is optional
     *                 and defaults to 0. */
    private java.lang.Long maxVideoAdDuration;

    /* The frequency type for video ads in this ad rule slot. This
     * attribute is required for
     *                 mid-rolls, but if this is not a mid-roll, the value
     * is set to {@link
     *                 MidrollFrequencyType#NONE}. */
    private com.google.api.ads.admanager.axis.v202205.MidrollFrequencyType videoMidrollFrequencyType;

    /* The mid-roll frequency of this ad rule slot for video ads.
     * This attribute is required for
     *                 mid-rolls, but if {@link MidrollFrequencyType} is
     * set to {@link MidrollFrequencyType#NONE},
     *                 this value should be ignored. For example, if this
     * slot has a frequency type of {@link
     *                 MidrollFrequencyType#EVERY_N_SECONDS} and {@code #videoMidrollFrequency}
     * = "60", this would
     *                 mean " play a mid-roll every 60 seconds." */
    private java.lang.String videoMidrollFrequency;

    /* The {@link AdRuleSlotBumper} for this slot. This attribute
     * is optional and defaults to {@link
     *                 AdRuleSlotBumper#NONE}. */
    private com.google.api.ads.admanager.axis.v202205.AdRuleSlotBumper bumper;

    /* The maximum duration of bumper ads within this slot. This attribute
     * is optional and defaults to
     *                 0. */
    private java.lang.Long maxBumperDuration;

    /* The maximum pod duration in milliseconds for this slot. This
     * attribute is optional and defaults
     *                 to 0. */
    private java.lang.Long maxPodDuration;

    /* The maximum number of ads allowed in a pod in this slot. This
     * attribute is optional and
     *                 defaults to 0. */
    private java.lang.Integer maxAdsInPod;

    /* ID of a {@link BreakTemplate} that defines what kinds of ads
     * show at which positions within
     *                 this slot. This field is optional and only supported
     * on {@link OptimizedPoddingAdRuleSlot}
     *                 entities. */
    private java.lang.Long breakTemplateId;

    public BaseAdRuleSlot() {
    }

    public BaseAdRuleSlot(
           com.google.api.ads.admanager.axis.v202205.AdRuleSlotBehavior slotBehavior,
           java.lang.Long maxVideoAdDuration,
           com.google.api.ads.admanager.axis.v202205.MidrollFrequencyType videoMidrollFrequencyType,
           java.lang.String videoMidrollFrequency,
           com.google.api.ads.admanager.axis.v202205.AdRuleSlotBumper bumper,
           java.lang.Long maxBumperDuration,
           java.lang.Long maxPodDuration,
           java.lang.Integer maxAdsInPod,
           java.lang.Long breakTemplateId) {
           this.slotBehavior = slotBehavior;
           this.maxVideoAdDuration = maxVideoAdDuration;
           this.videoMidrollFrequencyType = videoMidrollFrequencyType;
           this.videoMidrollFrequency = videoMidrollFrequency;
           this.bumper = bumper;
           this.maxBumperDuration = maxBumperDuration;
           this.maxPodDuration = maxPodDuration;
           this.maxAdsInPod = maxAdsInPod;
           this.breakTemplateId = breakTemplateId;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("breakTemplateId", getBreakTemplateId())
            .add("bumper", getBumper())
            .add("maxAdsInPod", getMaxAdsInPod())
            .add("maxBumperDuration", getMaxBumperDuration())
            .add("maxPodDuration", getMaxPodDuration())
            .add("maxVideoAdDuration", getMaxVideoAdDuration())
            .add("slotBehavior", getSlotBehavior())
            .add("videoMidrollFrequency", getVideoMidrollFrequency())
            .add("videoMidrollFrequencyType", getVideoMidrollFrequencyType())
            .toString();
    }

    /**
     * Gets the slotBehavior value for this BaseAdRuleSlot.
     * 
     * @return slotBehavior   * The {@link AdRuleSlotBehavior} for video ads for this slot.
     * This attribute is optional and
     *                 defaults to {@link AdRuleSlotBehavior#DEFER}.
     *                 
     *                 <p>Indicates whether video ads are allowed for this
     * slot, or if the decision is deferred to a
     *                 lower-priority ad rule.
     */
    public com.google.api.ads.admanager.axis.v202205.AdRuleSlotBehavior getSlotBehavior() {
        return slotBehavior;
    }


    /**
     * Sets the slotBehavior value for this BaseAdRuleSlot.
     * 
     * @param slotBehavior   * The {@link AdRuleSlotBehavior} for video ads for this slot.
     * This attribute is optional and
     *                 defaults to {@link AdRuleSlotBehavior#DEFER}.
     *                 
     *                 <p>Indicates whether video ads are allowed for this
     * slot, or if the decision is deferred to a
     *                 lower-priority ad rule.
     */
    public void setSlotBehavior(com.google.api.ads.admanager.axis.v202205.AdRuleSlotBehavior slotBehavior) {
        this.slotBehavior = slotBehavior;
    }


    /**
     * Gets the maxVideoAdDuration value for this BaseAdRuleSlot.
     * 
     * @return maxVideoAdDuration   * The maximum duration in milliseconds of video ads within this
     * slot. This attribute is optional
     *                 and defaults to 0.
     */
    public java.lang.Long getMaxVideoAdDuration() {
        return maxVideoAdDuration;
    }


    /**
     * Sets the maxVideoAdDuration value for this BaseAdRuleSlot.
     * 
     * @param maxVideoAdDuration   * The maximum duration in milliseconds of video ads within this
     * slot. This attribute is optional
     *                 and defaults to 0.
     */
    public void setMaxVideoAdDuration(java.lang.Long maxVideoAdDuration) {
        this.maxVideoAdDuration = maxVideoAdDuration;
    }


    /**
     * Gets the videoMidrollFrequencyType value for this BaseAdRuleSlot.
     * 
     * @return videoMidrollFrequencyType   * The frequency type for video ads in this ad rule slot. This
     * attribute is required for
     *                 mid-rolls, but if this is not a mid-roll, the value
     * is set to {@link
     *                 MidrollFrequencyType#NONE}.
     */
    public com.google.api.ads.admanager.axis.v202205.MidrollFrequencyType getVideoMidrollFrequencyType() {
        return videoMidrollFrequencyType;
    }


    /**
     * Sets the videoMidrollFrequencyType value for this BaseAdRuleSlot.
     * 
     * @param videoMidrollFrequencyType   * The frequency type for video ads in this ad rule slot. This
     * attribute is required for
     *                 mid-rolls, but if this is not a mid-roll, the value
     * is set to {@link
     *                 MidrollFrequencyType#NONE}.
     */
    public void setVideoMidrollFrequencyType(com.google.api.ads.admanager.axis.v202205.MidrollFrequencyType videoMidrollFrequencyType) {
        this.videoMidrollFrequencyType = videoMidrollFrequencyType;
    }


    /**
     * Gets the videoMidrollFrequency value for this BaseAdRuleSlot.
     * 
     * @return videoMidrollFrequency   * The mid-roll frequency of this ad rule slot for video ads.
     * This attribute is required for
     *                 mid-rolls, but if {@link MidrollFrequencyType} is
     * set to {@link MidrollFrequencyType#NONE},
     *                 this value should be ignored. For example, if this
     * slot has a frequency type of {@link
     *                 MidrollFrequencyType#EVERY_N_SECONDS} and {@code #videoMidrollFrequency}
     * = "60", this would
     *                 mean " play a mid-roll every 60 seconds."
     */
    public java.lang.String getVideoMidrollFrequency() {
        return videoMidrollFrequency;
    }


    /**
     * Sets the videoMidrollFrequency value for this BaseAdRuleSlot.
     * 
     * @param videoMidrollFrequency   * The mid-roll frequency of this ad rule slot for video ads.
     * This attribute is required for
     *                 mid-rolls, but if {@link MidrollFrequencyType} is
     * set to {@link MidrollFrequencyType#NONE},
     *                 this value should be ignored. For example, if this
     * slot has a frequency type of {@link
     *                 MidrollFrequencyType#EVERY_N_SECONDS} and {@code #videoMidrollFrequency}
     * = "60", this would
     *                 mean " play a mid-roll every 60 seconds."
     */
    public void setVideoMidrollFrequency(java.lang.String videoMidrollFrequency) {
        this.videoMidrollFrequency = videoMidrollFrequency;
    }


    /**
     * Gets the bumper value for this BaseAdRuleSlot.
     * 
     * @return bumper   * The {@link AdRuleSlotBumper} for this slot. This attribute
     * is optional and defaults to {@link
     *                 AdRuleSlotBumper#NONE}.
     */
    public com.google.api.ads.admanager.axis.v202205.AdRuleSlotBumper getBumper() {
        return bumper;
    }


    /**
     * Sets the bumper value for this BaseAdRuleSlot.
     * 
     * @param bumper   * The {@link AdRuleSlotBumper} for this slot. This attribute
     * is optional and defaults to {@link
     *                 AdRuleSlotBumper#NONE}.
     */
    public void setBumper(com.google.api.ads.admanager.axis.v202205.AdRuleSlotBumper bumper) {
        this.bumper = bumper;
    }


    /**
     * Gets the maxBumperDuration value for this BaseAdRuleSlot.
     * 
     * @return maxBumperDuration   * The maximum duration of bumper ads within this slot. This attribute
     * is optional and defaults to
     *                 0.
     */
    public java.lang.Long getMaxBumperDuration() {
        return maxBumperDuration;
    }


    /**
     * Sets the maxBumperDuration value for this BaseAdRuleSlot.
     * 
     * @param maxBumperDuration   * The maximum duration of bumper ads within this slot. This attribute
     * is optional and defaults to
     *                 0.
     */
    public void setMaxBumperDuration(java.lang.Long maxBumperDuration) {
        this.maxBumperDuration = maxBumperDuration;
    }


    /**
     * Gets the maxPodDuration value for this BaseAdRuleSlot.
     * 
     * @return maxPodDuration   * The maximum pod duration in milliseconds for this slot. This
     * attribute is optional and defaults
     *                 to 0.
     */
    public java.lang.Long getMaxPodDuration() {
        return maxPodDuration;
    }


    /**
     * Sets the maxPodDuration value for this BaseAdRuleSlot.
     * 
     * @param maxPodDuration   * The maximum pod duration in milliseconds for this slot. This
     * attribute is optional and defaults
     *                 to 0.
     */
    public void setMaxPodDuration(java.lang.Long maxPodDuration) {
        this.maxPodDuration = maxPodDuration;
    }


    /**
     * Gets the maxAdsInPod value for this BaseAdRuleSlot.
     * 
     * @return maxAdsInPod   * The maximum number of ads allowed in a pod in this slot. This
     * attribute is optional and
     *                 defaults to 0.
     */
    public java.lang.Integer getMaxAdsInPod() {
        return maxAdsInPod;
    }


    /**
     * Sets the maxAdsInPod value for this BaseAdRuleSlot.
     * 
     * @param maxAdsInPod   * The maximum number of ads allowed in a pod in this slot. This
     * attribute is optional and
     *                 defaults to 0.
     */
    public void setMaxAdsInPod(java.lang.Integer maxAdsInPod) {
        this.maxAdsInPod = maxAdsInPod;
    }


    /**
     * Gets the breakTemplateId value for this BaseAdRuleSlot.
     * 
     * @return breakTemplateId   * ID of a {@link BreakTemplate} that defines what kinds of ads
     * show at which positions within
     *                 this slot. This field is optional and only supported
     * on {@link OptimizedPoddingAdRuleSlot}
     *                 entities.
     */
    public java.lang.Long getBreakTemplateId() {
        return breakTemplateId;
    }


    /**
     * Sets the breakTemplateId value for this BaseAdRuleSlot.
     * 
     * @param breakTemplateId   * ID of a {@link BreakTemplate} that defines what kinds of ads
     * show at which positions within
     *                 this slot. This field is optional and only supported
     * on {@link OptimizedPoddingAdRuleSlot}
     *                 entities.
     */
    public void setBreakTemplateId(java.lang.Long breakTemplateId) {
        this.breakTemplateId = breakTemplateId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BaseAdRuleSlot)) return false;
        BaseAdRuleSlot other = (BaseAdRuleSlot) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.slotBehavior==null && other.getSlotBehavior()==null) || 
             (this.slotBehavior!=null &&
              this.slotBehavior.equals(other.getSlotBehavior()))) &&
            ((this.maxVideoAdDuration==null && other.getMaxVideoAdDuration()==null) || 
             (this.maxVideoAdDuration!=null &&
              this.maxVideoAdDuration.equals(other.getMaxVideoAdDuration()))) &&
            ((this.videoMidrollFrequencyType==null && other.getVideoMidrollFrequencyType()==null) || 
             (this.videoMidrollFrequencyType!=null &&
              this.videoMidrollFrequencyType.equals(other.getVideoMidrollFrequencyType()))) &&
            ((this.videoMidrollFrequency==null && other.getVideoMidrollFrequency()==null) || 
             (this.videoMidrollFrequency!=null &&
              this.videoMidrollFrequency.equals(other.getVideoMidrollFrequency()))) &&
            ((this.bumper==null && other.getBumper()==null) || 
             (this.bumper!=null &&
              this.bumper.equals(other.getBumper()))) &&
            ((this.maxBumperDuration==null && other.getMaxBumperDuration()==null) || 
             (this.maxBumperDuration!=null &&
              this.maxBumperDuration.equals(other.getMaxBumperDuration()))) &&
            ((this.maxPodDuration==null && other.getMaxPodDuration()==null) || 
             (this.maxPodDuration!=null &&
              this.maxPodDuration.equals(other.getMaxPodDuration()))) &&
            ((this.maxAdsInPod==null && other.getMaxAdsInPod()==null) || 
             (this.maxAdsInPod!=null &&
              this.maxAdsInPod.equals(other.getMaxAdsInPod()))) &&
            ((this.breakTemplateId==null && other.getBreakTemplateId()==null) || 
             (this.breakTemplateId!=null &&
              this.breakTemplateId.equals(other.getBreakTemplateId())));
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
        if (getSlotBehavior() != null) {
            _hashCode += getSlotBehavior().hashCode();
        }
        if (getMaxVideoAdDuration() != null) {
            _hashCode += getMaxVideoAdDuration().hashCode();
        }
        if (getVideoMidrollFrequencyType() != null) {
            _hashCode += getVideoMidrollFrequencyType().hashCode();
        }
        if (getVideoMidrollFrequency() != null) {
            _hashCode += getVideoMidrollFrequency().hashCode();
        }
        if (getBumper() != null) {
            _hashCode += getBumper().hashCode();
        }
        if (getMaxBumperDuration() != null) {
            _hashCode += getMaxBumperDuration().hashCode();
        }
        if (getMaxPodDuration() != null) {
            _hashCode += getMaxPodDuration().hashCode();
        }
        if (getMaxAdsInPod() != null) {
            _hashCode += getMaxAdsInPod().hashCode();
        }
        if (getBreakTemplateId() != null) {
            _hashCode += getBreakTemplateId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BaseAdRuleSlot.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202205", "BaseAdRuleSlot"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slotBehavior");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202205", "slotBehavior"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202205", "AdRuleSlotBehavior"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxVideoAdDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202205", "maxVideoAdDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoMidrollFrequencyType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202205", "videoMidrollFrequencyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202205", "MidrollFrequencyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoMidrollFrequency");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202205", "videoMidrollFrequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bumper");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202205", "bumper"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202205", "AdRuleSlotBumper"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxBumperDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202205", "maxBumperDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxPodDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202205", "maxPodDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxAdsInPod");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202205", "maxAdsInPod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("breakTemplateId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202205", "breakTemplateId"));
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
