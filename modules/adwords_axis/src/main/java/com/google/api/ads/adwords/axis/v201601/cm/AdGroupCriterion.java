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
 * AdGroupCriterion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201601.cm;


/**
 * Represents a criterion in an ad group, used with AdGroupCriterionService.
 */
public class AdGroupCriterion  implements java.io.Serializable {
    /* The ad group this criterion is in.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.Long adGroupId;

    /* <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201601.cm.CriterionUse criterionUse;

    /* The criterion part of the ad group criterion.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201601.cm.Criterion criterion;

    /* Labels that are attached to the AdGroupCriterion. To associate
     * an existing {@link Label} to an
     *                 existing {@link AdGroupCriterion}, use {@link AdGroupCriterionService#mutateLabel}
     * with ADD
     *                 operator. To remove an associated {@link Label} from
     * the {@link AdGroupCriterion}, use
     *                 {@link AdGroupCriterionService#mutateLabel} with REMOVE
     * operator. To filter on {@link Label}s,
     *                 use one of {@link Predicate.Operator#CONTAINS_ALL},
     * {@link Predicate.Operator#CONTAINS_ANY},
     *                 {@link Predicate.Operator#CONTAINS_NONE} operators
     * with a list of {@link Label} ids.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE and SET.</span> */
    private com.google.api.ads.adwords.axis.v201601.cm.Label[] labels;

    private com.google.api.ads.adwords.axis.v201601.cm.String_StringMapEntry[] forwardCompatibilityMap;

    /* Indicates that this instance is a subtype of AdGroupCriterion.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String adGroupCriterionType;

    public AdGroupCriterion() {
    }

    public AdGroupCriterion(
           java.lang.Long adGroupId,
           com.google.api.ads.adwords.axis.v201601.cm.CriterionUse criterionUse,
           com.google.api.ads.adwords.axis.v201601.cm.Criterion criterion,
           com.google.api.ads.adwords.axis.v201601.cm.Label[] labels,
           com.google.api.ads.adwords.axis.v201601.cm.String_StringMapEntry[] forwardCompatibilityMap,
           java.lang.String adGroupCriterionType) {
           this.adGroupId = adGroupId;
           this.criterionUse = criterionUse;
           this.criterion = criterion;
           this.labels = labels;
           this.forwardCompatibilityMap = forwardCompatibilityMap;
           this.adGroupCriterionType = adGroupCriterionType;
    }


    /**
     * Gets the adGroupId value for this AdGroupCriterion.
     *
     * @return adGroupId   * The ad group this criterion is in.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.Long getAdGroupId() {
        return adGroupId;
    }


    /**
     * Sets the adGroupId value for this AdGroupCriterion.
     *
     * @param adGroupId   * The ad group this criterion is in.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setAdGroupId(java.lang.Long adGroupId) {
        this.adGroupId = adGroupId;
    }


    /**
     * Gets the criterionUse value for this AdGroupCriterion.
     *
     * @return criterionUse   * <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201601.cm.CriterionUse getCriterionUse() {
        return criterionUse;
    }


    /**
     * Sets the criterionUse value for this AdGroupCriterion.
     *
     * @param criterionUse   * <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span>
     */
    public void setCriterionUse(com.google.api.ads.adwords.axis.v201601.cm.CriterionUse criterionUse) {
        this.criterionUse = criterionUse;
    }


    /**
     * Gets the criterion value for this AdGroupCriterion.
     *
     * @return criterion   * The criterion part of the ad group criterion.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201601.cm.Criterion getCriterion() {
        return criterion;
    }


    /**
     * Sets the criterion value for this AdGroupCriterion.
     *
     * @param criterion   * The criterion part of the ad group criterion.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setCriterion(com.google.api.ads.adwords.axis.v201601.cm.Criterion criterion) {
        this.criterion = criterion;
    }


    /**
     * Gets the labels value for this AdGroupCriterion.
     *
     * @return labels   * Labels that are attached to the AdGroupCriterion. To associate
     * an existing {@link Label} to an
     *                 existing {@link AdGroupCriterion}, use {@link AdGroupCriterionService#mutateLabel}
     * with ADD
     *                 operator. To remove an associated {@link Label} from
     * the {@link AdGroupCriterion}, use
     *                 {@link AdGroupCriterionService#mutateLabel} with REMOVE
     * operator. To filter on {@link Label}s,
     *                 use one of {@link Predicate.Operator#CONTAINS_ALL},
     * {@link Predicate.Operator#CONTAINS_ANY},
     *                 {@link Predicate.Operator#CONTAINS_NONE} operators
     * with a list of {@link Label} ids.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE and SET.</span>
     */
    public com.google.api.ads.adwords.axis.v201601.cm.Label[] getLabels() {
        return labels;
    }


    /**
     * Sets the labels value for this AdGroupCriterion.
     *
     * @param labels   * Labels that are attached to the AdGroupCriterion. To associate
     * an existing {@link Label} to an
     *                 existing {@link AdGroupCriterion}, use {@link AdGroupCriterionService#mutateLabel}
     * with ADD
     *                 operator. To remove an associated {@link Label} from
     * the {@link AdGroupCriterion}, use
     *                 {@link AdGroupCriterionService#mutateLabel} with REMOVE
     * operator. To filter on {@link Label}s,
     *                 use one of {@link Predicate.Operator#CONTAINS_ALL},
     * {@link Predicate.Operator#CONTAINS_ANY},
     *                 {@link Predicate.Operator#CONTAINS_NONE} operators
     * with a list of {@link Label} ids.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE and SET.</span>
     */
    public void setLabels(com.google.api.ads.adwords.axis.v201601.cm.Label[] labels) {
        this.labels = labels;
    }

    public com.google.api.ads.adwords.axis.v201601.cm.Label getLabels(int i) {
        return this.labels[i];
    }

    public void setLabels(int i, com.google.api.ads.adwords.axis.v201601.cm.Label _value) {
        this.labels[i] = _value;
    }


    public com.google.api.ads.adwords.axis.v201601.cm.String_StringMapEntry[] getForwardCompatibilityMap() {
        return forwardCompatibilityMap;
    }


    public void setForwardCompatibilityMap(com.google.api.ads.adwords.axis.v201601.cm.String_StringMapEntry[] forwardCompatibilityMap) {
        this.forwardCompatibilityMap = forwardCompatibilityMap;
    }

    public com.google.api.ads.adwords.axis.v201601.cm.String_StringMapEntry getForwardCompatibilityMap(int i) {
        return this.forwardCompatibilityMap[i];
    }

    public void setForwardCompatibilityMap(int i, com.google.api.ads.adwords.axis.v201601.cm.String_StringMapEntry _value) {
        this.forwardCompatibilityMap[i] = _value;
    }


    /**
     * Gets the adGroupCriterionType value for this AdGroupCriterion.
     *
     * @return adGroupCriterionType   * Indicates that this instance is a subtype of AdGroupCriterion.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getAdGroupCriterionType() {
        return adGroupCriterionType;
    }


    /**
     * Sets the adGroupCriterionType value for this AdGroupCriterion.
     *
     * @param adGroupCriterionType   * Indicates that this instance is a subtype of AdGroupCriterion.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setAdGroupCriterionType(java.lang.String adGroupCriterionType) {
        this.adGroupCriterionType = adGroupCriterionType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdGroupCriterion)) return false;
        AdGroupCriterion other = (AdGroupCriterion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.adGroupId==null && other.getAdGroupId()==null) ||
             (this.adGroupId!=null &&
              this.adGroupId.equals(other.getAdGroupId()))) &&
            ((this.criterionUse==null && other.getCriterionUse()==null) ||
             (this.criterionUse!=null &&
              this.criterionUse.equals(other.getCriterionUse()))) &&
            ((this.criterion==null && other.getCriterion()==null) ||
             (this.criterion!=null &&
              this.criterion.equals(other.getCriterion()))) &&
            ((this.labels==null && other.getLabels()==null) ||
             (this.labels!=null &&
              java.util.Arrays.equals(this.labels, other.getLabels()))) &&
            ((this.forwardCompatibilityMap==null && other.getForwardCompatibilityMap()==null) ||
             (this.forwardCompatibilityMap!=null &&
              java.util.Arrays.equals(this.forwardCompatibilityMap, other.getForwardCompatibilityMap()))) &&
            ((this.adGroupCriterionType==null && other.getAdGroupCriterionType()==null) ||
             (this.adGroupCriterionType!=null &&
              this.adGroupCriterionType.equals(other.getAdGroupCriterionType())));
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
        if (getAdGroupId() != null) {
            _hashCode += getAdGroupId().hashCode();
        }
        if (getCriterionUse() != null) {
            _hashCode += getCriterionUse().hashCode();
        }
        if (getCriterion() != null) {
            _hashCode += getCriterion().hashCode();
        }
        if (getLabels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLabels());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLabels(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getForwardCompatibilityMap() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getForwardCompatibilityMap());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getForwardCompatibilityMap(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdGroupCriterionType() != null) {
            _hashCode += getAdGroupCriterionType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdGroupCriterion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "AdGroupCriterion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "adGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criterionUse");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "criterionUse"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "CriterionUse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criterion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "criterion"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "Criterion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labels");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "labels"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "Label"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forwardCompatibilityMap");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "forwardCompatibilityMap"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "String_StringMapEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupCriterionType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "AdGroupCriterion.Type"));
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
