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
 * FeedItemCriterionTarget.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents a feed item target for a criterion.
 */
public class FeedItemCriterionTarget  extends com.google.api.ads.adwords.axis.v201802.cm.FeedItemTarget  implements java.io.Serializable {
    /* The target criterion.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.Criterion criterion;

    /* Indicates that the target criterion is negative. Used only
     * for filtering. Use {@link
     *                     NegativeFeedItemCriterionTarget} to create a negative
     * criterion target.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "IsNegative".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private java.lang.Boolean isNegative;

    public FeedItemCriterionTarget() {
    }

    public FeedItemCriterionTarget(
           java.lang.Long feedId,
           java.lang.Long feedItemId,
           com.google.api.ads.adwords.axis.v201802.cm.FeedItemTargetType targetType,
           com.google.api.ads.adwords.axis.v201802.cm.FeedItemTargetStatus status,
           java.lang.String feedItemTargetType,
           com.google.api.ads.adwords.axis.v201802.cm.Criterion criterion,
           java.lang.Boolean isNegative) {
        super(
            feedId,
            feedItemId,
            targetType,
            status,
            feedItemTargetType);
        this.criterion = criterion;
        this.isNegative = isNegative;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("criterion", getCriterion())
            .add("feedId", getFeedId())
            .add("feedItemId", getFeedItemId())
            .add("feedItemTargetType", getFeedItemTargetType())
            .add("isNegative", getIsNegative())
            .add("status", getStatus())
            .add("targetType", getTargetType())
            .toString();
    }

    /**
     * Gets the criterion value for this FeedItemCriterionTarget.
     * 
     * @return criterion   * The target criterion.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Criterion getCriterion() {
        return criterion;
    }


    /**
     * Sets the criterion value for this FeedItemCriterionTarget.
     * 
     * @param criterion   * The target criterion.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setCriterion(com.google.api.ads.adwords.axis.v201802.cm.Criterion criterion) {
        this.criterion = criterion;
    }


    /**
     * Gets the isNegative value for this FeedItemCriterionTarget.
     * 
     * @return isNegative   * Indicates that the target criterion is negative. Used only
     * for filtering. Use {@link
     *                     NegativeFeedItemCriterionTarget} to create a negative
     * criterion target.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "IsNegative".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public java.lang.Boolean getIsNegative() {
        return isNegative;
    }


    /**
     * Sets the isNegative value for this FeedItemCriterionTarget.
     * 
     * @param isNegative   * Indicates that the target criterion is negative. Used only
     * for filtering. Use {@link
     *                     NegativeFeedItemCriterionTarget} to create a negative
     * criterion target.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "IsNegative".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setIsNegative(java.lang.Boolean isNegative) {
        this.isNegative = isNegative;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeedItemCriterionTarget)) return false;
        FeedItemCriterionTarget other = (FeedItemCriterionTarget) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.criterion==null && other.getCriterion()==null) || 
             (this.criterion!=null &&
              this.criterion.equals(other.getCriterion()))) &&
            ((this.isNegative==null && other.getIsNegative()==null) || 
             (this.isNegative!=null &&
              this.isNegative.equals(other.getIsNegative())));
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
        if (getCriterion() != null) {
            _hashCode += getCriterion().hashCode();
        }
        if (getIsNegative() != null) {
            _hashCode += getIsNegative().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeedItemCriterionTarget.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemCriterionTarget"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criterion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "criterion"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Criterion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNegative");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "isNegative"));
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
