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
 * AdRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * An {@link AdRule} contains data that the ad server will use to
 * generate a playlist of video ads.
 */
public class AdRule  implements java.io.Serializable {
    /* The unique ID of the {@link AdRule}. This value is readonly
     * and is assigned by Google. */
    private java.lang.Long adRuleId;

    /* The unique name of the {@link AdRule}. This attribute is required
     * to create an
     *                 ad rule and has a maximum length of 255 characters. */
    private java.lang.String name;

    /* The priority of the {@link AdRule}. This attribute is required
     * and can range
     *                 from 1 to 1000, with 1 being the highest possible
     * priority.
     *                 
     *                 <p>Changing an ad rule's priority can affect the priorities
     * of other ad
     *                 rules. For example, increasing an ad rule's priority
     * from 5 to 1 will
     *                 shift the ad rules that were previously in priority
     * positions 1 through 4
     *                 down one. */
    private java.lang.Integer priority;

    /* The targeting criteria of the {@link AdRule}. This attribute
     * is required. */
    private com.google.api.ads.dfp.axis.v201802.Targeting targeting;

    /* This {@link AdRule} object's start date and time. This attribute
     * is required and must be
     *                 a date in the future for new ad rules. */
    private com.google.api.ads.dfp.axis.v201802.DateTime startDateTime;

    /* Specifies whether to start using the {@link AdRule} right away,
     * in an hour, etc.
     *                 This attribute is optional and defaults to {@link
     * StartDateTimeType#USE_START_DATE_TIME}. */
    private com.google.api.ads.dfp.axis.v201802.StartDateTimeType startDateTimeType;

    /* This {@link AdRule} object's end date and time. This attribute
     * is required unless
     *                 {@code unlimitedEndDateTime} is set to {@code true}.
     * If specified, it
     *                 must be after the {@code startDateTime}. */
    private com.google.api.ads.dfp.axis.v201802.DateTime endDateTime;

    /* Specifies whether the {@link AdRule} has an end time. This
     * attribute is optional
     *                 and defaults to false. */
    private java.lang.Boolean unlimitedEndDateTime;

    /* The {@link AdRuleStatus} of the ad rule. This attribute is
     * read-only and
     *                 defaults to {@link AdRuleStatus#INACTIVE}. */
    private com.google.api.ads.dfp.axis.v201802.AdRuleStatus status;

    /* The {@link FrequencyCapBehavior} of the {@link AdRule}. This
     * attribute is
     *                 optional and defaults to {@link FrequencyCapBehavior#DEFER}. */
    private com.google.api.ads.dfp.axis.v201802.FrequencyCapBehavior frequencyCapBehavior;

    /* This {@link AdRule} object's frequency cap for the maximum
     * impressions per stream.
     *                 This attribute is optional and defaults to 0. */
    private java.lang.Integer maxImpressionsPerLineItemPerStream;

    /* This {@link AdRule} object's frequency cap for the maximum
     * impressions per pod. This
     *                 attribute is optional and defaults to 0. */
    private java.lang.Integer maxImpressionsPerLineItemPerPod;

    /* This {@link AdRule} object's pre-roll slot. This attribute
     * is required. */
    private com.google.api.ads.dfp.axis.v201802.BaseAdRuleSlot preroll;

    /* This {@link AdRule} object's mid-roll slot. This attribute
     * is required. */
    private com.google.api.ads.dfp.axis.v201802.BaseAdRuleSlot midroll;

    /* This {@link AdRule} object's post-roll slot. This attribute
     * is required. */
    private com.google.api.ads.dfp.axis.v201802.BaseAdRuleSlot postroll;

    public AdRule() {
    }

    public AdRule(
           java.lang.Long adRuleId,
           java.lang.String name,
           java.lang.Integer priority,
           com.google.api.ads.dfp.axis.v201802.Targeting targeting,
           com.google.api.ads.dfp.axis.v201802.DateTime startDateTime,
           com.google.api.ads.dfp.axis.v201802.StartDateTimeType startDateTimeType,
           com.google.api.ads.dfp.axis.v201802.DateTime endDateTime,
           java.lang.Boolean unlimitedEndDateTime,
           com.google.api.ads.dfp.axis.v201802.AdRuleStatus status,
           com.google.api.ads.dfp.axis.v201802.FrequencyCapBehavior frequencyCapBehavior,
           java.lang.Integer maxImpressionsPerLineItemPerStream,
           java.lang.Integer maxImpressionsPerLineItemPerPod,
           com.google.api.ads.dfp.axis.v201802.BaseAdRuleSlot preroll,
           com.google.api.ads.dfp.axis.v201802.BaseAdRuleSlot midroll,
           com.google.api.ads.dfp.axis.v201802.BaseAdRuleSlot postroll) {
           this.adRuleId = adRuleId;
           this.name = name;
           this.priority = priority;
           this.targeting = targeting;
           this.startDateTime = startDateTime;
           this.startDateTimeType = startDateTimeType;
           this.endDateTime = endDateTime;
           this.unlimitedEndDateTime = unlimitedEndDateTime;
           this.status = status;
           this.frequencyCapBehavior = frequencyCapBehavior;
           this.maxImpressionsPerLineItemPerStream = maxImpressionsPerLineItemPerStream;
           this.maxImpressionsPerLineItemPerPod = maxImpressionsPerLineItemPerPod;
           this.preroll = preroll;
           this.midroll = midroll;
           this.postroll = postroll;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adRuleId", getAdRuleId())
            .add("endDateTime", getEndDateTime())
            .add("frequencyCapBehavior", getFrequencyCapBehavior())
            .add("maxImpressionsPerLineItemPerPod", getMaxImpressionsPerLineItemPerPod())
            .add("maxImpressionsPerLineItemPerStream", getMaxImpressionsPerLineItemPerStream())
            .add("midroll", getMidroll())
            .add("name", getName())
            .add("postroll", getPostroll())
            .add("preroll", getPreroll())
            .add("priority", getPriority())
            .add("startDateTime", getStartDateTime())
            .add("startDateTimeType", getStartDateTimeType())
            .add("status", getStatus())
            .add("targeting", getTargeting())
            .add("unlimitedEndDateTime", getUnlimitedEndDateTime())
            .toString();
    }

    /**
     * Gets the adRuleId value for this AdRule.
     * 
     * @return adRuleId   * The unique ID of the {@link AdRule}. This value is readonly
     * and is assigned by Google.
     */
    public java.lang.Long getAdRuleId() {
        return adRuleId;
    }


    /**
     * Sets the adRuleId value for this AdRule.
     * 
     * @param adRuleId   * The unique ID of the {@link AdRule}. This value is readonly
     * and is assigned by Google.
     */
    public void setAdRuleId(java.lang.Long adRuleId) {
        this.adRuleId = adRuleId;
    }


    /**
     * Gets the name value for this AdRule.
     * 
     * @return name   * The unique name of the {@link AdRule}. This attribute is required
     * to create an
     *                 ad rule and has a maximum length of 255 characters.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this AdRule.
     * 
     * @param name   * The unique name of the {@link AdRule}. This attribute is required
     * to create an
     *                 ad rule and has a maximum length of 255 characters.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the priority value for this AdRule.
     * 
     * @return priority   * The priority of the {@link AdRule}. This attribute is required
     * and can range
     *                 from 1 to 1000, with 1 being the highest possible
     * priority.
     *                 
     *                 <p>Changing an ad rule's priority can affect the priorities
     * of other ad
     *                 rules. For example, increasing an ad rule's priority
     * from 5 to 1 will
     *                 shift the ad rules that were previously in priority
     * positions 1 through 4
     *                 down one.
     */
    public java.lang.Integer getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this AdRule.
     * 
     * @param priority   * The priority of the {@link AdRule}. This attribute is required
     * and can range
     *                 from 1 to 1000, with 1 being the highest possible
     * priority.
     *                 
     *                 <p>Changing an ad rule's priority can affect the priorities
     * of other ad
     *                 rules. For example, increasing an ad rule's priority
     * from 5 to 1 will
     *                 shift the ad rules that were previously in priority
     * positions 1 through 4
     *                 down one.
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }


    /**
     * Gets the targeting value for this AdRule.
     * 
     * @return targeting   * The targeting criteria of the {@link AdRule}. This attribute
     * is required.
     */
    public com.google.api.ads.dfp.axis.v201802.Targeting getTargeting() {
        return targeting;
    }


    /**
     * Sets the targeting value for this AdRule.
     * 
     * @param targeting   * The targeting criteria of the {@link AdRule}. This attribute
     * is required.
     */
    public void setTargeting(com.google.api.ads.dfp.axis.v201802.Targeting targeting) {
        this.targeting = targeting;
    }


    /**
     * Gets the startDateTime value for this AdRule.
     * 
     * @return startDateTime   * This {@link AdRule} object's start date and time. This attribute
     * is required and must be
     *                 a date in the future for new ad rules.
     */
    public com.google.api.ads.dfp.axis.v201802.DateTime getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this AdRule.
     * 
     * @param startDateTime   * This {@link AdRule} object's start date and time. This attribute
     * is required and must be
     *                 a date in the future for new ad rules.
     */
    public void setStartDateTime(com.google.api.ads.dfp.axis.v201802.DateTime startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the startDateTimeType value for this AdRule.
     * 
     * @return startDateTimeType   * Specifies whether to start using the {@link AdRule} right away,
     * in an hour, etc.
     *                 This attribute is optional and defaults to {@link
     * StartDateTimeType#USE_START_DATE_TIME}.
     */
    public com.google.api.ads.dfp.axis.v201802.StartDateTimeType getStartDateTimeType() {
        return startDateTimeType;
    }


    /**
     * Sets the startDateTimeType value for this AdRule.
     * 
     * @param startDateTimeType   * Specifies whether to start using the {@link AdRule} right away,
     * in an hour, etc.
     *                 This attribute is optional and defaults to {@link
     * StartDateTimeType#USE_START_DATE_TIME}.
     */
    public void setStartDateTimeType(com.google.api.ads.dfp.axis.v201802.StartDateTimeType startDateTimeType) {
        this.startDateTimeType = startDateTimeType;
    }


    /**
     * Gets the endDateTime value for this AdRule.
     * 
     * @return endDateTime   * This {@link AdRule} object's end date and time. This attribute
     * is required unless
     *                 {@code unlimitedEndDateTime} is set to {@code true}.
     * If specified, it
     *                 must be after the {@code startDateTime}.
     */
    public com.google.api.ads.dfp.axis.v201802.DateTime getEndDateTime() {
        return endDateTime;
    }


    /**
     * Sets the endDateTime value for this AdRule.
     * 
     * @param endDateTime   * This {@link AdRule} object's end date and time. This attribute
     * is required unless
     *                 {@code unlimitedEndDateTime} is set to {@code true}.
     * If specified, it
     *                 must be after the {@code startDateTime}.
     */
    public void setEndDateTime(com.google.api.ads.dfp.axis.v201802.DateTime endDateTime) {
        this.endDateTime = endDateTime;
    }


    /**
     * Gets the unlimitedEndDateTime value for this AdRule.
     * 
     * @return unlimitedEndDateTime   * Specifies whether the {@link AdRule} has an end time. This
     * attribute is optional
     *                 and defaults to false.
     */
    public java.lang.Boolean getUnlimitedEndDateTime() {
        return unlimitedEndDateTime;
    }


    /**
     * Sets the unlimitedEndDateTime value for this AdRule.
     * 
     * @param unlimitedEndDateTime   * Specifies whether the {@link AdRule} has an end time. This
     * attribute is optional
     *                 and defaults to false.
     */
    public void setUnlimitedEndDateTime(java.lang.Boolean unlimitedEndDateTime) {
        this.unlimitedEndDateTime = unlimitedEndDateTime;
    }


    /**
     * Gets the status value for this AdRule.
     * 
     * @return status   * The {@link AdRuleStatus} of the ad rule. This attribute is
     * read-only and
     *                 defaults to {@link AdRuleStatus#INACTIVE}.
     */
    public com.google.api.ads.dfp.axis.v201802.AdRuleStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this AdRule.
     * 
     * @param status   * The {@link AdRuleStatus} of the ad rule. This attribute is
     * read-only and
     *                 defaults to {@link AdRuleStatus#INACTIVE}.
     */
    public void setStatus(com.google.api.ads.dfp.axis.v201802.AdRuleStatus status) {
        this.status = status;
    }


    /**
     * Gets the frequencyCapBehavior value for this AdRule.
     * 
     * @return frequencyCapBehavior   * The {@link FrequencyCapBehavior} of the {@link AdRule}. This
     * attribute is
     *                 optional and defaults to {@link FrequencyCapBehavior#DEFER}.
     */
    public com.google.api.ads.dfp.axis.v201802.FrequencyCapBehavior getFrequencyCapBehavior() {
        return frequencyCapBehavior;
    }


    /**
     * Sets the frequencyCapBehavior value for this AdRule.
     * 
     * @param frequencyCapBehavior   * The {@link FrequencyCapBehavior} of the {@link AdRule}. This
     * attribute is
     *                 optional and defaults to {@link FrequencyCapBehavior#DEFER}.
     */
    public void setFrequencyCapBehavior(com.google.api.ads.dfp.axis.v201802.FrequencyCapBehavior frequencyCapBehavior) {
        this.frequencyCapBehavior = frequencyCapBehavior;
    }


    /**
     * Gets the maxImpressionsPerLineItemPerStream value for this AdRule.
     * 
     * @return maxImpressionsPerLineItemPerStream   * This {@link AdRule} object's frequency cap for the maximum
     * impressions per stream.
     *                 This attribute is optional and defaults to 0.
     */
    public java.lang.Integer getMaxImpressionsPerLineItemPerStream() {
        return maxImpressionsPerLineItemPerStream;
    }


    /**
     * Sets the maxImpressionsPerLineItemPerStream value for this AdRule.
     * 
     * @param maxImpressionsPerLineItemPerStream   * This {@link AdRule} object's frequency cap for the maximum
     * impressions per stream.
     *                 This attribute is optional and defaults to 0.
     */
    public void setMaxImpressionsPerLineItemPerStream(java.lang.Integer maxImpressionsPerLineItemPerStream) {
        this.maxImpressionsPerLineItemPerStream = maxImpressionsPerLineItemPerStream;
    }


    /**
     * Gets the maxImpressionsPerLineItemPerPod value for this AdRule.
     * 
     * @return maxImpressionsPerLineItemPerPod   * This {@link AdRule} object's frequency cap for the maximum
     * impressions per pod. This
     *                 attribute is optional and defaults to 0.
     */
    public java.lang.Integer getMaxImpressionsPerLineItemPerPod() {
        return maxImpressionsPerLineItemPerPod;
    }


    /**
     * Sets the maxImpressionsPerLineItemPerPod value for this AdRule.
     * 
     * @param maxImpressionsPerLineItemPerPod   * This {@link AdRule} object's frequency cap for the maximum
     * impressions per pod. This
     *                 attribute is optional and defaults to 0.
     */
    public void setMaxImpressionsPerLineItemPerPod(java.lang.Integer maxImpressionsPerLineItemPerPod) {
        this.maxImpressionsPerLineItemPerPod = maxImpressionsPerLineItemPerPod;
    }


    /**
     * Gets the preroll value for this AdRule.
     * 
     * @return preroll   * This {@link AdRule} object's pre-roll slot. This attribute
     * is required.
     */
    public com.google.api.ads.dfp.axis.v201802.BaseAdRuleSlot getPreroll() {
        return preroll;
    }


    /**
     * Sets the preroll value for this AdRule.
     * 
     * @param preroll   * This {@link AdRule} object's pre-roll slot. This attribute
     * is required.
     */
    public void setPreroll(com.google.api.ads.dfp.axis.v201802.BaseAdRuleSlot preroll) {
        this.preroll = preroll;
    }


    /**
     * Gets the midroll value for this AdRule.
     * 
     * @return midroll   * This {@link AdRule} object's mid-roll slot. This attribute
     * is required.
     */
    public com.google.api.ads.dfp.axis.v201802.BaseAdRuleSlot getMidroll() {
        return midroll;
    }


    /**
     * Sets the midroll value for this AdRule.
     * 
     * @param midroll   * This {@link AdRule} object's mid-roll slot. This attribute
     * is required.
     */
    public void setMidroll(com.google.api.ads.dfp.axis.v201802.BaseAdRuleSlot midroll) {
        this.midroll = midroll;
    }


    /**
     * Gets the postroll value for this AdRule.
     * 
     * @return postroll   * This {@link AdRule} object's post-roll slot. This attribute
     * is required.
     */
    public com.google.api.ads.dfp.axis.v201802.BaseAdRuleSlot getPostroll() {
        return postroll;
    }


    /**
     * Sets the postroll value for this AdRule.
     * 
     * @param postroll   * This {@link AdRule} object's post-roll slot. This attribute
     * is required.
     */
    public void setPostroll(com.google.api.ads.dfp.axis.v201802.BaseAdRuleSlot postroll) {
        this.postroll = postroll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdRule)) return false;
        AdRule other = (AdRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adRuleId==null && other.getAdRuleId()==null) || 
             (this.adRuleId!=null &&
              this.adRuleId.equals(other.getAdRuleId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.targeting==null && other.getTargeting()==null) || 
             (this.targeting!=null &&
              this.targeting.equals(other.getTargeting()))) &&
            ((this.startDateTime==null && other.getStartDateTime()==null) || 
             (this.startDateTime!=null &&
              this.startDateTime.equals(other.getStartDateTime()))) &&
            ((this.startDateTimeType==null && other.getStartDateTimeType()==null) || 
             (this.startDateTimeType!=null &&
              this.startDateTimeType.equals(other.getStartDateTimeType()))) &&
            ((this.endDateTime==null && other.getEndDateTime()==null) || 
             (this.endDateTime!=null &&
              this.endDateTime.equals(other.getEndDateTime()))) &&
            ((this.unlimitedEndDateTime==null && other.getUnlimitedEndDateTime()==null) || 
             (this.unlimitedEndDateTime!=null &&
              this.unlimitedEndDateTime.equals(other.getUnlimitedEndDateTime()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.frequencyCapBehavior==null && other.getFrequencyCapBehavior()==null) || 
             (this.frequencyCapBehavior!=null &&
              this.frequencyCapBehavior.equals(other.getFrequencyCapBehavior()))) &&
            ((this.maxImpressionsPerLineItemPerStream==null && other.getMaxImpressionsPerLineItemPerStream()==null) || 
             (this.maxImpressionsPerLineItemPerStream!=null &&
              this.maxImpressionsPerLineItemPerStream.equals(other.getMaxImpressionsPerLineItemPerStream()))) &&
            ((this.maxImpressionsPerLineItemPerPod==null && other.getMaxImpressionsPerLineItemPerPod()==null) || 
             (this.maxImpressionsPerLineItemPerPod!=null &&
              this.maxImpressionsPerLineItemPerPod.equals(other.getMaxImpressionsPerLineItemPerPod()))) &&
            ((this.preroll==null && other.getPreroll()==null) || 
             (this.preroll!=null &&
              this.preroll.equals(other.getPreroll()))) &&
            ((this.midroll==null && other.getMidroll()==null) || 
             (this.midroll!=null &&
              this.midroll.equals(other.getMidroll()))) &&
            ((this.postroll==null && other.getPostroll()==null) || 
             (this.postroll!=null &&
              this.postroll.equals(other.getPostroll())));
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
        if (getAdRuleId() != null) {
            _hashCode += getAdRuleId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getTargeting() != null) {
            _hashCode += getTargeting().hashCode();
        }
        if (getStartDateTime() != null) {
            _hashCode += getStartDateTime().hashCode();
        }
        if (getStartDateTimeType() != null) {
            _hashCode += getStartDateTimeType().hashCode();
        }
        if (getEndDateTime() != null) {
            _hashCode += getEndDateTime().hashCode();
        }
        if (getUnlimitedEndDateTime() != null) {
            _hashCode += getUnlimitedEndDateTime().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getFrequencyCapBehavior() != null) {
            _hashCode += getFrequencyCapBehavior().hashCode();
        }
        if (getMaxImpressionsPerLineItemPerStream() != null) {
            _hashCode += getMaxImpressionsPerLineItemPerStream().hashCode();
        }
        if (getMaxImpressionsPerLineItemPerPod() != null) {
            _hashCode += getMaxImpressionsPerLineItemPerPod().hashCode();
        }
        if (getPreroll() != null) {
            _hashCode += getPreroll().hashCode();
        }
        if (getMidroll() != null) {
            _hashCode += getMidroll().hashCode();
        }
        if (getPostroll() != null) {
            _hashCode += getPostroll().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "AdRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adRuleId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "adRuleId"));
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
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "targeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Targeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "startDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTimeType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "startDateTimeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "StartDateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "endDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unlimitedEndDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "unlimitedEndDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "AdRuleStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequencyCapBehavior");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "frequencyCapBehavior"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "FrequencyCapBehavior"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxImpressionsPerLineItemPerStream");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "maxImpressionsPerLineItemPerStream"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxImpressionsPerLineItemPerPod");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "maxImpressionsPerLineItemPerPod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preroll");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "preroll"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "BaseAdRuleSlot"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("midroll");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "midroll"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "BaseAdRuleSlot"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postroll");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "postroll"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "BaseAdRuleSlot"));
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
