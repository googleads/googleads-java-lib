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
 * CreativePlaceholder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * A {@code CreativePlaceholder} describes a slot that a creative
 * is expected to
 *             fill. This is used primarily to help in forecasting, and
 * also to validate
 *             that the correct creatives are associated with the line
 * item. A
 *             {@code CreativePlaceholder} must contain a size, and it
 * can optionally
 *             contain companions. Companions are only valid if the line
 * item's environment
 *             type is {@link EnvironmentType#VIDEO_PLAYER}.
 */
public class CreativePlaceholder  implements java.io.Serializable {
    /* The dimensions that the creative is expected to have. This
     * attribute is
     *                 required. */
    private com.google.api.ads.dfp.axis.v201802.Size size;

    /* The native creative template ID.
     *                 
     *                 <p>This value is only required if {@link #creativeSizeType}
     * is {@link CreativeSizeType#NATIVE}. */
    private java.lang.Long creativeTemplateId;

    /* The companions that the creative is expected to have. This
     * attribute can
     *                 only be set if the line item it belongs to has a
     *                 {@link LineItem#environmentType} of {@link EnvironmentType#VIDEO_PLAYER}
     * or
     *                 {@link LineItem#roadblockingType} of {@link RoadblockingType#CREATIVE_SET}. */
    private com.google.api.ads.dfp.axis.v201802.CreativePlaceholder[] companions;

    /* The set of label frequency caps applied directly to this creative
     * placeholder. */
    private com.google.api.ads.dfp.axis.v201802.AppliedLabel[] appliedLabels;

    /* Contains the set of labels applied directly to this creative
     * placeholder
     *                 as well as those inherited from the creative template
     * from which this
     *                 creative placeholder was instantiated.  This field
     * is readonly and is
     *                 assigned by Google. */
    private com.google.api.ads.dfp.axis.v201802.AppliedLabel[] effectiveAppliedLabels;

    /* Expected number of creatives that will be uploaded corresponding
     * to this
     *                 creative placeholder.  This estimate is used to improve
     * the accuracy of
     *                 forecasting; for example, if label frequency capping
     * limits the number of
     *                 times a creative may be served. */
    private java.lang.Integer expectedCreativeCount;

    /* Describes the types of sizes a creative can be. By default,
     * the creative's size
     *                 is {@link CreativeSizeType#PIXEL}, which is a dimension
     * based size (width-height pair). */
    private com.google.api.ads.dfp.axis.v201802.CreativeSizeType creativeSizeType;

    /* The name of the {@link CreativeTargeting} for creatives this
     * placeholder represents.
     *                 
     *                 <p>This attribute is optional. Specifying creative
     * targeting here is for forecasting
     *                 purposes only and has no effect on serving. The same
     * creative targeting should be specified on
     *                 a {@link LineItemCreativeAssociation} when associating
     * a {@link Creative} with the
     *                 {@link LineItem}. */
    private java.lang.String targetingName;

    public CreativePlaceholder() {
    }

    public CreativePlaceholder(
           com.google.api.ads.dfp.axis.v201802.Size size,
           java.lang.Long creativeTemplateId,
           com.google.api.ads.dfp.axis.v201802.CreativePlaceholder[] companions,
           com.google.api.ads.dfp.axis.v201802.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.axis.v201802.AppliedLabel[] effectiveAppliedLabels,
           java.lang.Integer expectedCreativeCount,
           com.google.api.ads.dfp.axis.v201802.CreativeSizeType creativeSizeType,
           java.lang.String targetingName) {
           this.size = size;
           this.creativeTemplateId = creativeTemplateId;
           this.companions = companions;
           this.appliedLabels = appliedLabels;
           this.effectiveAppliedLabels = effectiveAppliedLabels;
           this.expectedCreativeCount = expectedCreativeCount;
           this.creativeSizeType = creativeSizeType;
           this.targetingName = targetingName;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("appliedLabels", getAppliedLabels())
            .add("companions", getCompanions())
            .add("creativeSizeType", getCreativeSizeType())
            .add("creativeTemplateId", getCreativeTemplateId())
            .add("effectiveAppliedLabels", getEffectiveAppliedLabels())
            .add("expectedCreativeCount", getExpectedCreativeCount())
            .add("size", getSize())
            .add("targetingName", getTargetingName())
            .toString();
    }

    /**
     * Gets the size value for this CreativePlaceholder.
     * 
     * @return size   * The dimensions that the creative is expected to have. This
     * attribute is
     *                 required.
     */
    public com.google.api.ads.dfp.axis.v201802.Size getSize() {
        return size;
    }


    /**
     * Sets the size value for this CreativePlaceholder.
     * 
     * @param size   * The dimensions that the creative is expected to have. This
     * attribute is
     *                 required.
     */
    public void setSize(com.google.api.ads.dfp.axis.v201802.Size size) {
        this.size = size;
    }


    /**
     * Gets the creativeTemplateId value for this CreativePlaceholder.
     * 
     * @return creativeTemplateId   * The native creative template ID.
     *                 
     *                 <p>This value is only required if {@link #creativeSizeType}
     * is {@link CreativeSizeType#NATIVE}.
     */
    public java.lang.Long getCreativeTemplateId() {
        return creativeTemplateId;
    }


    /**
     * Sets the creativeTemplateId value for this CreativePlaceholder.
     * 
     * @param creativeTemplateId   * The native creative template ID.
     *                 
     *                 <p>This value is only required if {@link #creativeSizeType}
     * is {@link CreativeSizeType#NATIVE}.
     */
    public void setCreativeTemplateId(java.lang.Long creativeTemplateId) {
        this.creativeTemplateId = creativeTemplateId;
    }


    /**
     * Gets the companions value for this CreativePlaceholder.
     * 
     * @return companions   * The companions that the creative is expected to have. This
     * attribute can
     *                 only be set if the line item it belongs to has a
     *                 {@link LineItem#environmentType} of {@link EnvironmentType#VIDEO_PLAYER}
     * or
     *                 {@link LineItem#roadblockingType} of {@link RoadblockingType#CREATIVE_SET}.
     */
    public com.google.api.ads.dfp.axis.v201802.CreativePlaceholder[] getCompanions() {
        return companions;
    }


    /**
     * Sets the companions value for this CreativePlaceholder.
     * 
     * @param companions   * The companions that the creative is expected to have. This
     * attribute can
     *                 only be set if the line item it belongs to has a
     *                 {@link LineItem#environmentType} of {@link EnvironmentType#VIDEO_PLAYER}
     * or
     *                 {@link LineItem#roadblockingType} of {@link RoadblockingType#CREATIVE_SET}.
     */
    public void setCompanions(com.google.api.ads.dfp.axis.v201802.CreativePlaceholder[] companions) {
        this.companions = companions;
    }

    public com.google.api.ads.dfp.axis.v201802.CreativePlaceholder getCompanions(int i) {
        return this.companions[i];
    }

    public void setCompanions(int i, com.google.api.ads.dfp.axis.v201802.CreativePlaceholder _value) {
        this.companions[i] = _value;
    }


    /**
     * Gets the appliedLabels value for this CreativePlaceholder.
     * 
     * @return appliedLabels   * The set of label frequency caps applied directly to this creative
     * placeholder.
     */
    public com.google.api.ads.dfp.axis.v201802.AppliedLabel[] getAppliedLabels() {
        return appliedLabels;
    }


    /**
     * Sets the appliedLabels value for this CreativePlaceholder.
     * 
     * @param appliedLabels   * The set of label frequency caps applied directly to this creative
     * placeholder.
     */
    public void setAppliedLabels(com.google.api.ads.dfp.axis.v201802.AppliedLabel[] appliedLabels) {
        this.appliedLabels = appliedLabels;
    }

    public com.google.api.ads.dfp.axis.v201802.AppliedLabel getAppliedLabels(int i) {
        return this.appliedLabels[i];
    }

    public void setAppliedLabels(int i, com.google.api.ads.dfp.axis.v201802.AppliedLabel _value) {
        this.appliedLabels[i] = _value;
    }


    /**
     * Gets the effectiveAppliedLabels value for this CreativePlaceholder.
     * 
     * @return effectiveAppliedLabels   * Contains the set of labels applied directly to this creative
     * placeholder
     *                 as well as those inherited from the creative template
     * from which this
     *                 creative placeholder was instantiated.  This field
     * is readonly and is
     *                 assigned by Google.
     */
    public com.google.api.ads.dfp.axis.v201802.AppliedLabel[] getEffectiveAppliedLabels() {
        return effectiveAppliedLabels;
    }


    /**
     * Sets the effectiveAppliedLabels value for this CreativePlaceholder.
     * 
     * @param effectiveAppliedLabels   * Contains the set of labels applied directly to this creative
     * placeholder
     *                 as well as those inherited from the creative template
     * from which this
     *                 creative placeholder was instantiated.  This field
     * is readonly and is
     *                 assigned by Google.
     */
    public void setEffectiveAppliedLabels(com.google.api.ads.dfp.axis.v201802.AppliedLabel[] effectiveAppliedLabels) {
        this.effectiveAppliedLabels = effectiveAppliedLabels;
    }

    public com.google.api.ads.dfp.axis.v201802.AppliedLabel getEffectiveAppliedLabels(int i) {
        return this.effectiveAppliedLabels[i];
    }

    public void setEffectiveAppliedLabels(int i, com.google.api.ads.dfp.axis.v201802.AppliedLabel _value) {
        this.effectiveAppliedLabels[i] = _value;
    }


    /**
     * Gets the expectedCreativeCount value for this CreativePlaceholder.
     * 
     * @return expectedCreativeCount   * Expected number of creatives that will be uploaded corresponding
     * to this
     *                 creative placeholder.  This estimate is used to improve
     * the accuracy of
     *                 forecasting; for example, if label frequency capping
     * limits the number of
     *                 times a creative may be served.
     */
    public java.lang.Integer getExpectedCreativeCount() {
        return expectedCreativeCount;
    }


    /**
     * Sets the expectedCreativeCount value for this CreativePlaceholder.
     * 
     * @param expectedCreativeCount   * Expected number of creatives that will be uploaded corresponding
     * to this
     *                 creative placeholder.  This estimate is used to improve
     * the accuracy of
     *                 forecasting; for example, if label frequency capping
     * limits the number of
     *                 times a creative may be served.
     */
    public void setExpectedCreativeCount(java.lang.Integer expectedCreativeCount) {
        this.expectedCreativeCount = expectedCreativeCount;
    }


    /**
     * Gets the creativeSizeType value for this CreativePlaceholder.
     * 
     * @return creativeSizeType   * Describes the types of sizes a creative can be. By default,
     * the creative's size
     *                 is {@link CreativeSizeType#PIXEL}, which is a dimension
     * based size (width-height pair).
     */
    public com.google.api.ads.dfp.axis.v201802.CreativeSizeType getCreativeSizeType() {
        return creativeSizeType;
    }


    /**
     * Sets the creativeSizeType value for this CreativePlaceholder.
     * 
     * @param creativeSizeType   * Describes the types of sizes a creative can be. By default,
     * the creative's size
     *                 is {@link CreativeSizeType#PIXEL}, which is a dimension
     * based size (width-height pair).
     */
    public void setCreativeSizeType(com.google.api.ads.dfp.axis.v201802.CreativeSizeType creativeSizeType) {
        this.creativeSizeType = creativeSizeType;
    }


    /**
     * Gets the targetingName value for this CreativePlaceholder.
     * 
     * @return targetingName   * The name of the {@link CreativeTargeting} for creatives this
     * placeholder represents.
     *                 
     *                 <p>This attribute is optional. Specifying creative
     * targeting here is for forecasting
     *                 purposes only and has no effect on serving. The same
     * creative targeting should be specified on
     *                 a {@link LineItemCreativeAssociation} when associating
     * a {@link Creative} with the
     *                 {@link LineItem}.
     */
    public java.lang.String getTargetingName() {
        return targetingName;
    }


    /**
     * Sets the targetingName value for this CreativePlaceholder.
     * 
     * @param targetingName   * The name of the {@link CreativeTargeting} for creatives this
     * placeholder represents.
     *                 
     *                 <p>This attribute is optional. Specifying creative
     * targeting here is for forecasting
     *                 purposes only and has no effect on serving. The same
     * creative targeting should be specified on
     *                 a {@link LineItemCreativeAssociation} when associating
     * a {@link Creative} with the
     *                 {@link LineItem}.
     */
    public void setTargetingName(java.lang.String targetingName) {
        this.targetingName = targetingName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreativePlaceholder)) return false;
        CreativePlaceholder other = (CreativePlaceholder) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.size==null && other.getSize()==null) || 
             (this.size!=null &&
              this.size.equals(other.getSize()))) &&
            ((this.creativeTemplateId==null && other.getCreativeTemplateId()==null) || 
             (this.creativeTemplateId!=null &&
              this.creativeTemplateId.equals(other.getCreativeTemplateId()))) &&
            ((this.companions==null && other.getCompanions()==null) || 
             (this.companions!=null &&
              java.util.Arrays.equals(this.companions, other.getCompanions()))) &&
            ((this.appliedLabels==null && other.getAppliedLabels()==null) || 
             (this.appliedLabels!=null &&
              java.util.Arrays.equals(this.appliedLabels, other.getAppliedLabels()))) &&
            ((this.effectiveAppliedLabels==null && other.getEffectiveAppliedLabels()==null) || 
             (this.effectiveAppliedLabels!=null &&
              java.util.Arrays.equals(this.effectiveAppliedLabels, other.getEffectiveAppliedLabels()))) &&
            ((this.expectedCreativeCount==null && other.getExpectedCreativeCount()==null) || 
             (this.expectedCreativeCount!=null &&
              this.expectedCreativeCount.equals(other.getExpectedCreativeCount()))) &&
            ((this.creativeSizeType==null && other.getCreativeSizeType()==null) || 
             (this.creativeSizeType!=null &&
              this.creativeSizeType.equals(other.getCreativeSizeType()))) &&
            ((this.targetingName==null && other.getTargetingName()==null) || 
             (this.targetingName!=null &&
              this.targetingName.equals(other.getTargetingName())));
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
        if (getSize() != null) {
            _hashCode += getSize().hashCode();
        }
        if (getCreativeTemplateId() != null) {
            _hashCode += getCreativeTemplateId().hashCode();
        }
        if (getCompanions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCompanions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCompanions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppliedLabels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppliedLabels());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppliedLabels(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEffectiveAppliedLabels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEffectiveAppliedLabels());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEffectiveAppliedLabels(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExpectedCreativeCount() != null) {
            _hashCode += getExpectedCreativeCount().hashCode();
        }
        if (getCreativeSizeType() != null) {
            _hashCode += getCreativeSizeType().hashCode();
        }
        if (getTargetingName() != null) {
            _hashCode += getTargetingName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreativePlaceholder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CreativePlaceholder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Size"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeTemplateId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "creativeTemplateId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "companions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CreativePlaceholder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "appliedLabels"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "AppliedLabel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveAppliedLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "effectiveAppliedLabels"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "AppliedLabel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedCreativeCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "expectedCreativeCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeSizeType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "creativeSizeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CreativeSizeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetingName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "targetingName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
