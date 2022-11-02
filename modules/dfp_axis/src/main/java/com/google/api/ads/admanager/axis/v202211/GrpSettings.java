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
 * GrpSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202211;


/**
 * {@code GrpSettings} contains information for a line item that will
 * have a target demographic when
 *             serving. This information will be used to set up tracking
 * and enable reporting on the demographic
 *             information.
 */
public class GrpSettings  implements java.io.Serializable {
    /* Specifies the minimum target age (in years) of the {@link LineItem}.
     * This field is only
     *                 applicable if {@link #provider} is not null. */
    private java.lang.Long minTargetAge;

    /* Specifies the maximum target age (in years) of the {@link LineItem}.
     * This field is only
     *                 applicable if {@link #provider} is not null. */
    private java.lang.Long maxTargetAge;

    /* Specifies the target gender of the {@link LineItem}. This field
     * is only applicable if
     *                 {@link #provider} is not null. */
    private com.google.api.ads.admanager.axis.v202211.GrpTargetGender targetGender;

    /* Specifies the GRP provider of the {@link LineItem}. */
    private com.google.api.ads.admanager.axis.v202211.GrpProvider provider;

    /* Specifies the impression goal for the given target demographic.
     * This field is only applicable
     *                 if {@link #provider} is not null and demographics-based
     * goal is selected by the user. If this
     *                 field is set, {@link LineItem#primaryGoal} will have
     * its {@link Goal#units} value set by Google
     *                 to represent the estimated total quantity. */
    private java.lang.Long targetImpressionGoal;

    /* Estimate for the in-target ratio given the line item's audience
     * targeting. This field is only
     *                 applicable if {@link #provider} is Nielsen, {@link
     * LineItem#primaryGoal#unitType} is in-target
     *                 impressions, and {@link LineItem#CostType} is in-target
     * CPM. This field determines the
     *                 in-target ratio to use for pacing Nielsen line items
     * before Nielsen reporting data is
     *                 available. Represented as a milli percent, so 55.7%
     * becomes 55700. */
    private java.lang.Long inTargetRatioEstimateMilliPercent;

    /* Specifies which pacing computation to apply in pacing to impressions
     * from connected devices.
     *                 This field is required if {@code enableNielsenCoViewingSupport}
     * is true. */
    private com.google.api.ads.admanager.axis.v202211.NielsenCtvPacingType nielsenCtvPacingType;

    /* Specifies whether to use Google or Nielsen device breakdown
     * in Nielsen Line Item auto pacing. */
    private com.google.api.ads.admanager.axis.v202211.PacingDeviceCategorizationType pacingDeviceCategorizationType;

    private java.lang.Boolean applyTrueCoview;

    public GrpSettings() {
    }

    public GrpSettings(
           java.lang.Long minTargetAge,
           java.lang.Long maxTargetAge,
           com.google.api.ads.admanager.axis.v202211.GrpTargetGender targetGender,
           com.google.api.ads.admanager.axis.v202211.GrpProvider provider,
           java.lang.Long targetImpressionGoal,
           java.lang.Long inTargetRatioEstimateMilliPercent,
           com.google.api.ads.admanager.axis.v202211.NielsenCtvPacingType nielsenCtvPacingType,
           com.google.api.ads.admanager.axis.v202211.PacingDeviceCategorizationType pacingDeviceCategorizationType,
           java.lang.Boolean applyTrueCoview) {
           this.minTargetAge = minTargetAge;
           this.maxTargetAge = maxTargetAge;
           this.targetGender = targetGender;
           this.provider = provider;
           this.targetImpressionGoal = targetImpressionGoal;
           this.inTargetRatioEstimateMilliPercent = inTargetRatioEstimateMilliPercent;
           this.nielsenCtvPacingType = nielsenCtvPacingType;
           this.pacingDeviceCategorizationType = pacingDeviceCategorizationType;
           this.applyTrueCoview = applyTrueCoview;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("applyTrueCoview", getApplyTrueCoview())
            .add("inTargetRatioEstimateMilliPercent", getInTargetRatioEstimateMilliPercent())
            .add("maxTargetAge", getMaxTargetAge())
            .add("minTargetAge", getMinTargetAge())
            .add("nielsenCtvPacingType", getNielsenCtvPacingType())
            .add("pacingDeviceCategorizationType", getPacingDeviceCategorizationType())
            .add("provider", getProvider())
            .add("targetGender", getTargetGender())
            .add("targetImpressionGoal", getTargetImpressionGoal())
            .toString();
    }

    /**
     * Gets the minTargetAge value for this GrpSettings.
     * 
     * @return minTargetAge   * Specifies the minimum target age (in years) of the {@link LineItem}.
     * This field is only
     *                 applicable if {@link #provider} is not null.
     */
    public java.lang.Long getMinTargetAge() {
        return minTargetAge;
    }


    /**
     * Sets the minTargetAge value for this GrpSettings.
     * 
     * @param minTargetAge   * Specifies the minimum target age (in years) of the {@link LineItem}.
     * This field is only
     *                 applicable if {@link #provider} is not null.
     */
    public void setMinTargetAge(java.lang.Long minTargetAge) {
        this.minTargetAge = minTargetAge;
    }


    /**
     * Gets the maxTargetAge value for this GrpSettings.
     * 
     * @return maxTargetAge   * Specifies the maximum target age (in years) of the {@link LineItem}.
     * This field is only
     *                 applicable if {@link #provider} is not null.
     */
    public java.lang.Long getMaxTargetAge() {
        return maxTargetAge;
    }


    /**
     * Sets the maxTargetAge value for this GrpSettings.
     * 
     * @param maxTargetAge   * Specifies the maximum target age (in years) of the {@link LineItem}.
     * This field is only
     *                 applicable if {@link #provider} is not null.
     */
    public void setMaxTargetAge(java.lang.Long maxTargetAge) {
        this.maxTargetAge = maxTargetAge;
    }


    /**
     * Gets the targetGender value for this GrpSettings.
     * 
     * @return targetGender   * Specifies the target gender of the {@link LineItem}. This field
     * is only applicable if
     *                 {@link #provider} is not null.
     */
    public com.google.api.ads.admanager.axis.v202211.GrpTargetGender getTargetGender() {
        return targetGender;
    }


    /**
     * Sets the targetGender value for this GrpSettings.
     * 
     * @param targetGender   * Specifies the target gender of the {@link LineItem}. This field
     * is only applicable if
     *                 {@link #provider} is not null.
     */
    public void setTargetGender(com.google.api.ads.admanager.axis.v202211.GrpTargetGender targetGender) {
        this.targetGender = targetGender;
    }


    /**
     * Gets the provider value for this GrpSettings.
     * 
     * @return provider   * Specifies the GRP provider of the {@link LineItem}.
     */
    public com.google.api.ads.admanager.axis.v202211.GrpProvider getProvider() {
        return provider;
    }


    /**
     * Sets the provider value for this GrpSettings.
     * 
     * @param provider   * Specifies the GRP provider of the {@link LineItem}.
     */
    public void setProvider(com.google.api.ads.admanager.axis.v202211.GrpProvider provider) {
        this.provider = provider;
    }


    /**
     * Gets the targetImpressionGoal value for this GrpSettings.
     * 
     * @return targetImpressionGoal   * Specifies the impression goal for the given target demographic.
     * This field is only applicable
     *                 if {@link #provider} is not null and demographics-based
     * goal is selected by the user. If this
     *                 field is set, {@link LineItem#primaryGoal} will have
     * its {@link Goal#units} value set by Google
     *                 to represent the estimated total quantity.
     */
    public java.lang.Long getTargetImpressionGoal() {
        return targetImpressionGoal;
    }


    /**
     * Sets the targetImpressionGoal value for this GrpSettings.
     * 
     * @param targetImpressionGoal   * Specifies the impression goal for the given target demographic.
     * This field is only applicable
     *                 if {@link #provider} is not null and demographics-based
     * goal is selected by the user. If this
     *                 field is set, {@link LineItem#primaryGoal} will have
     * its {@link Goal#units} value set by Google
     *                 to represent the estimated total quantity.
     */
    public void setTargetImpressionGoal(java.lang.Long targetImpressionGoal) {
        this.targetImpressionGoal = targetImpressionGoal;
    }


    /**
     * Gets the inTargetRatioEstimateMilliPercent value for this GrpSettings.
     * 
     * @return inTargetRatioEstimateMilliPercent   * Estimate for the in-target ratio given the line item's audience
     * targeting. This field is only
     *                 applicable if {@link #provider} is Nielsen, {@link
     * LineItem#primaryGoal#unitType} is in-target
     *                 impressions, and {@link LineItem#CostType} is in-target
     * CPM. This field determines the
     *                 in-target ratio to use for pacing Nielsen line items
     * before Nielsen reporting data is
     *                 available. Represented as a milli percent, so 55.7%
     * becomes 55700.
     */
    public java.lang.Long getInTargetRatioEstimateMilliPercent() {
        return inTargetRatioEstimateMilliPercent;
    }


    /**
     * Sets the inTargetRatioEstimateMilliPercent value for this GrpSettings.
     * 
     * @param inTargetRatioEstimateMilliPercent   * Estimate for the in-target ratio given the line item's audience
     * targeting. This field is only
     *                 applicable if {@link #provider} is Nielsen, {@link
     * LineItem#primaryGoal#unitType} is in-target
     *                 impressions, and {@link LineItem#CostType} is in-target
     * CPM. This field determines the
     *                 in-target ratio to use for pacing Nielsen line items
     * before Nielsen reporting data is
     *                 available. Represented as a milli percent, so 55.7%
     * becomes 55700.
     */
    public void setInTargetRatioEstimateMilliPercent(java.lang.Long inTargetRatioEstimateMilliPercent) {
        this.inTargetRatioEstimateMilliPercent = inTargetRatioEstimateMilliPercent;
    }


    /**
     * Gets the nielsenCtvPacingType value for this GrpSettings.
     * 
     * @return nielsenCtvPacingType   * Specifies which pacing computation to apply in pacing to impressions
     * from connected devices.
     *                 This field is required if {@code enableNielsenCoViewingSupport}
     * is true.
     */
    public com.google.api.ads.admanager.axis.v202211.NielsenCtvPacingType getNielsenCtvPacingType() {
        return nielsenCtvPacingType;
    }


    /**
     * Sets the nielsenCtvPacingType value for this GrpSettings.
     * 
     * @param nielsenCtvPacingType   * Specifies which pacing computation to apply in pacing to impressions
     * from connected devices.
     *                 This field is required if {@code enableNielsenCoViewingSupport}
     * is true.
     */
    public void setNielsenCtvPacingType(com.google.api.ads.admanager.axis.v202211.NielsenCtvPacingType nielsenCtvPacingType) {
        this.nielsenCtvPacingType = nielsenCtvPacingType;
    }


    /**
     * Gets the pacingDeviceCategorizationType value for this GrpSettings.
     * 
     * @return pacingDeviceCategorizationType   * Specifies whether to use Google or Nielsen device breakdown
     * in Nielsen Line Item auto pacing.
     */
    public com.google.api.ads.admanager.axis.v202211.PacingDeviceCategorizationType getPacingDeviceCategorizationType() {
        return pacingDeviceCategorizationType;
    }


    /**
     * Sets the pacingDeviceCategorizationType value for this GrpSettings.
     * 
     * @param pacingDeviceCategorizationType   * Specifies whether to use Google or Nielsen device breakdown
     * in Nielsen Line Item auto pacing.
     */
    public void setPacingDeviceCategorizationType(com.google.api.ads.admanager.axis.v202211.PacingDeviceCategorizationType pacingDeviceCategorizationType) {
        this.pacingDeviceCategorizationType = pacingDeviceCategorizationType;
    }


    /**
     * Gets the applyTrueCoview value for this GrpSettings.
     * 
     * @return applyTrueCoview
     */
    public java.lang.Boolean getApplyTrueCoview() {
        return applyTrueCoview;
    }


    /**
     * Sets the applyTrueCoview value for this GrpSettings.
     * 
     * @param applyTrueCoview
     */
    public void setApplyTrueCoview(java.lang.Boolean applyTrueCoview) {
        this.applyTrueCoview = applyTrueCoview;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GrpSettings)) return false;
        GrpSettings other = (GrpSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.minTargetAge==null && other.getMinTargetAge()==null) || 
             (this.minTargetAge!=null &&
              this.minTargetAge.equals(other.getMinTargetAge()))) &&
            ((this.maxTargetAge==null && other.getMaxTargetAge()==null) || 
             (this.maxTargetAge!=null &&
              this.maxTargetAge.equals(other.getMaxTargetAge()))) &&
            ((this.targetGender==null && other.getTargetGender()==null) || 
             (this.targetGender!=null &&
              this.targetGender.equals(other.getTargetGender()))) &&
            ((this.provider==null && other.getProvider()==null) || 
             (this.provider!=null &&
              this.provider.equals(other.getProvider()))) &&
            ((this.targetImpressionGoal==null && other.getTargetImpressionGoal()==null) || 
             (this.targetImpressionGoal!=null &&
              this.targetImpressionGoal.equals(other.getTargetImpressionGoal()))) &&
            ((this.inTargetRatioEstimateMilliPercent==null && other.getInTargetRatioEstimateMilliPercent()==null) || 
             (this.inTargetRatioEstimateMilliPercent!=null &&
              this.inTargetRatioEstimateMilliPercent.equals(other.getInTargetRatioEstimateMilliPercent()))) &&
            ((this.nielsenCtvPacingType==null && other.getNielsenCtvPacingType()==null) || 
             (this.nielsenCtvPacingType!=null &&
              this.nielsenCtvPacingType.equals(other.getNielsenCtvPacingType()))) &&
            ((this.pacingDeviceCategorizationType==null && other.getPacingDeviceCategorizationType()==null) || 
             (this.pacingDeviceCategorizationType!=null &&
              this.pacingDeviceCategorizationType.equals(other.getPacingDeviceCategorizationType()))) &&
            ((this.applyTrueCoview==null && other.getApplyTrueCoview()==null) || 
             (this.applyTrueCoview!=null &&
              this.applyTrueCoview.equals(other.getApplyTrueCoview())));
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
        if (getMinTargetAge() != null) {
            _hashCode += getMinTargetAge().hashCode();
        }
        if (getMaxTargetAge() != null) {
            _hashCode += getMaxTargetAge().hashCode();
        }
        if (getTargetGender() != null) {
            _hashCode += getTargetGender().hashCode();
        }
        if (getProvider() != null) {
            _hashCode += getProvider().hashCode();
        }
        if (getTargetImpressionGoal() != null) {
            _hashCode += getTargetImpressionGoal().hashCode();
        }
        if (getInTargetRatioEstimateMilliPercent() != null) {
            _hashCode += getInTargetRatioEstimateMilliPercent().hashCode();
        }
        if (getNielsenCtvPacingType() != null) {
            _hashCode += getNielsenCtvPacingType().hashCode();
        }
        if (getPacingDeviceCategorizationType() != null) {
            _hashCode += getPacingDeviceCategorizationType().hashCode();
        }
        if (getApplyTrueCoview() != null) {
            _hashCode += getApplyTrueCoview().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GrpSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "GrpSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minTargetAge");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "minTargetAge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxTargetAge");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "maxTargetAge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetGender");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "targetGender"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "GrpTargetGender"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provider");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "provider"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "GrpProvider"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetImpressionGoal");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "targetImpressionGoal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inTargetRatioEstimateMilliPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "inTargetRatioEstimateMilliPercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nielsenCtvPacingType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "nielsenCtvPacingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "NielsenCtvPacingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pacingDeviceCategorizationType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "pacingDeviceCategorizationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "PacingDeviceCategorizationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyTrueCoview");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "applyTrueCoview"));
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
