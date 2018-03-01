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
 * TargetingSettingDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Specifies if criteria of this type group should be used to restrict
 * targeting, or if ads can serve anywhere and criteria are only used
 * in
 *             determining the bid.
 *             <p>For more information, see
 *             <a href="https://support.google.com/adwords/answer/6056342">Targeting
 * Settings</a>.</p>
 */
public class TargetingSettingDetail  implements java.io.Serializable {
    /* The criterion type group that these settings apply to.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.CriterionTypeGroup criterionTypeGroup;

    /* If true, criteria of this type can be used to modify bidding
     * but will not restrict targeting
     *                 of ads. This is equivalent to "Bid only" in the AdWords
     * user interface.
     *                 If false, restricts your ads to showing only for the
     * criteria you have selected for this
     *                 CriterionTypeGroup. This is equivalent to "Target
     * and Bid" in the AdWords user interface.
     *                 The default setting for a CriterionTypeGroup is false
     * ("Target and Bid").
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.Boolean targetAll;

    public TargetingSettingDetail() {
    }

    public TargetingSettingDetail(
           com.google.api.ads.adwords.axis.v201802.cm.CriterionTypeGroup criterionTypeGroup,
           java.lang.Boolean targetAll) {
           this.criterionTypeGroup = criterionTypeGroup;
           this.targetAll = targetAll;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("criterionTypeGroup", getCriterionTypeGroup())
            .add("targetAll", getTargetAll())
            .toString();
    }

    /**
     * Gets the criterionTypeGroup value for this TargetingSettingDetail.
     * 
     * @return criterionTypeGroup   * The criterion type group that these settings apply to.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.CriterionTypeGroup getCriterionTypeGroup() {
        return criterionTypeGroup;
    }


    /**
     * Sets the criterionTypeGroup value for this TargetingSettingDetail.
     * 
     * @param criterionTypeGroup   * The criterion type group that these settings apply to.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setCriterionTypeGroup(com.google.api.ads.adwords.axis.v201802.cm.CriterionTypeGroup criterionTypeGroup) {
        this.criterionTypeGroup = criterionTypeGroup;
    }


    /**
     * Gets the targetAll value for this TargetingSettingDetail.
     * 
     * @return targetAll   * If true, criteria of this type can be used to modify bidding
     * but will not restrict targeting
     *                 of ads. This is equivalent to "Bid only" in the AdWords
     * user interface.
     *                 If false, restricts your ads to showing only for the
     * criteria you have selected for this
     *                 CriterionTypeGroup. This is equivalent to "Target
     * and Bid" in the AdWords user interface.
     *                 The default setting for a CriterionTypeGroup is false
     * ("Target and Bid").
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.Boolean getTargetAll() {
        return targetAll;
    }


    /**
     * Sets the targetAll value for this TargetingSettingDetail.
     * 
     * @param targetAll   * If true, criteria of this type can be used to modify bidding
     * but will not restrict targeting
     *                 of ads. This is equivalent to "Bid only" in the AdWords
     * user interface.
     *                 If false, restricts your ads to showing only for the
     * criteria you have selected for this
     *                 CriterionTypeGroup. This is equivalent to "Target
     * and Bid" in the AdWords user interface.
     *                 The default setting for a CriterionTypeGroup is false
     * ("Target and Bid").
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setTargetAll(java.lang.Boolean targetAll) {
        this.targetAll = targetAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TargetingSettingDetail)) return false;
        TargetingSettingDetail other = (TargetingSettingDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.criterionTypeGroup==null && other.getCriterionTypeGroup()==null) || 
             (this.criterionTypeGroup!=null &&
              this.criterionTypeGroup.equals(other.getCriterionTypeGroup()))) &&
            ((this.targetAll==null && other.getTargetAll()==null) || 
             (this.targetAll!=null &&
              this.targetAll.equals(other.getTargetAll())));
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
        if (getCriterionTypeGroup() != null) {
            _hashCode += getCriterionTypeGroup().hashCode();
        }
        if (getTargetAll() != null) {
            _hashCode += getTargetAll().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TargetingSettingDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TargetingSettingDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criterionTypeGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "criterionTypeGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CriterionTypeGroup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetAll");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "targetAll"));
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
