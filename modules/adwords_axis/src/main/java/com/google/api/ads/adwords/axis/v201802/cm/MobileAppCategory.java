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
 * MobileAppCategory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents the mobile app category to be targeted.
 *             <a href="/adwords/api/docs/appendix/mobileappcategories">View
 * the complete list of
 *             available mobile app categories</a>.
 *             <span class="constraint AdxEnabled">This is enabled for
 * AdX.</span>
 */
public class MobileAppCategory  extends com.google.api.ads.adwords.axis.v201802.cm.Criterion  implements java.io.Serializable {
    /* ID of this mobile app category. A complete list of the available
     * mobile app categories is
     *                     available <a href="/adwords/api/docs/appendix/mobileappcategories">here</a>.
     * <span class="constraint Selectable">This field can be selected using
     * the value "MobileAppCategoryId".</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private java.lang.Integer mobileAppCategoryId;

    /* Name of this mobile app category.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private java.lang.String displayName;

    public MobileAppCategory() {
    }

    public MobileAppCategory(
           java.lang.Long id,
           com.google.api.ads.adwords.axis.v201802.cm.CriterionType type,
           java.lang.String criterionType,
           java.lang.Integer mobileAppCategoryId,
           java.lang.String displayName) {
        super(
            id,
            type,
            criterionType);
        this.mobileAppCategoryId = mobileAppCategoryId;
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("criterionType", getCriterionType())
            .add("displayName", getDisplayName())
            .add("id", getId())
            .add("mobileAppCategoryId", getMobileAppCategoryId())
            .add("type", getType())
            .toString();
    }

    /**
     * Gets the mobileAppCategoryId value for this MobileAppCategory.
     * 
     * @return mobileAppCategoryId   * ID of this mobile app category. A complete list of the available
     * mobile app categories is
     *                     available <a href="/adwords/api/docs/appendix/mobileappcategories">here</a>.
     * <span class="constraint Selectable">This field can be selected using
     * the value "MobileAppCategoryId".</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public java.lang.Integer getMobileAppCategoryId() {
        return mobileAppCategoryId;
    }


    /**
     * Sets the mobileAppCategoryId value for this MobileAppCategory.
     * 
     * @param mobileAppCategoryId   * ID of this mobile app category. A complete list of the available
     * mobile app categories is
     *                     available <a href="/adwords/api/docs/appendix/mobileappcategories">here</a>.
     * <span class="constraint Selectable">This field can be selected using
     * the value "MobileAppCategoryId".</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setMobileAppCategoryId(java.lang.Integer mobileAppCategoryId) {
        this.mobileAppCategoryId = mobileAppCategoryId;
    }


    /**
     * Gets the displayName value for this MobileAppCategory.
     * 
     * @return displayName   * Name of this mobile app category.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this MobileAppCategory.
     * 
     * @param displayName   * Name of this mobile app category.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MobileAppCategory)) return false;
        MobileAppCategory other = (MobileAppCategory) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.mobileAppCategoryId==null && other.getMobileAppCategoryId()==null) || 
             (this.mobileAppCategoryId!=null &&
              this.mobileAppCategoryId.equals(other.getMobileAppCategoryId()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName())));
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
        if (getMobileAppCategoryId() != null) {
            _hashCode += getMobileAppCategoryId().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MobileAppCategory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "MobileAppCategory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileAppCategoryId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "mobileAppCategoryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "displayName"));
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
