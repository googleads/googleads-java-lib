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
 * CriterionUserInterest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * User Interest represents a particular interest-based vertical to
 * be targeted.
 *             <span class="constraint AdxEnabled">This is enabled for
 * AdX.</span>
 */
public class CriterionUserInterest  extends com.google.api.ads.adwords.axis.v201802.cm.Criterion  implements java.io.Serializable {
    /* Id of this user interest. This is a required field.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "UserInterestId".</span> */
    private java.lang.Long userInterestId;

    /* Parent Id of this user interest.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "UserInterestParentId".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private java.lang.Long userInterestParentId;

    /* Name of this user interest.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "UserInterestName".</span> */
    private java.lang.String userInterestName;

    public CriterionUserInterest() {
    }

    public CriterionUserInterest(
           java.lang.Long id,
           com.google.api.ads.adwords.axis.v201802.cm.CriterionType type,
           java.lang.String criterionType,
           java.lang.Long userInterestId,
           java.lang.Long userInterestParentId,
           java.lang.String userInterestName) {
        super(
            id,
            type,
            criterionType);
        this.userInterestId = userInterestId;
        this.userInterestParentId = userInterestParentId;
        this.userInterestName = userInterestName;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("criterionType", getCriterionType())
            .add("id", getId())
            .add("type", getType())
            .add("userInterestId", getUserInterestId())
            .add("userInterestName", getUserInterestName())
            .add("userInterestParentId", getUserInterestParentId())
            .toString();
    }

    /**
     * Gets the userInterestId value for this CriterionUserInterest.
     * 
     * @return userInterestId   * Id of this user interest. This is a required field.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "UserInterestId".</span>
     */
    public java.lang.Long getUserInterestId() {
        return userInterestId;
    }


    /**
     * Sets the userInterestId value for this CriterionUserInterest.
     * 
     * @param userInterestId   * Id of this user interest. This is a required field.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "UserInterestId".</span>
     */
    public void setUserInterestId(java.lang.Long userInterestId) {
        this.userInterestId = userInterestId;
    }


    /**
     * Gets the userInterestParentId value for this CriterionUserInterest.
     * 
     * @return userInterestParentId   * Parent Id of this user interest.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "UserInterestParentId".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public java.lang.Long getUserInterestParentId() {
        return userInterestParentId;
    }


    /**
     * Sets the userInterestParentId value for this CriterionUserInterest.
     * 
     * @param userInterestParentId   * Parent Id of this user interest.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "UserInterestParentId".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setUserInterestParentId(java.lang.Long userInterestParentId) {
        this.userInterestParentId = userInterestParentId;
    }


    /**
     * Gets the userInterestName value for this CriterionUserInterest.
     * 
     * @return userInterestName   * Name of this user interest.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "UserInterestName".</span>
     */
    public java.lang.String getUserInterestName() {
        return userInterestName;
    }


    /**
     * Sets the userInterestName value for this CriterionUserInterest.
     * 
     * @param userInterestName   * Name of this user interest.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "UserInterestName".</span>
     */
    public void setUserInterestName(java.lang.String userInterestName) {
        this.userInterestName = userInterestName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CriterionUserInterest)) return false;
        CriterionUserInterest other = (CriterionUserInterest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.userInterestId==null && other.getUserInterestId()==null) || 
             (this.userInterestId!=null &&
              this.userInterestId.equals(other.getUserInterestId()))) &&
            ((this.userInterestParentId==null && other.getUserInterestParentId()==null) || 
             (this.userInterestParentId!=null &&
              this.userInterestParentId.equals(other.getUserInterestParentId()))) &&
            ((this.userInterestName==null && other.getUserInterestName()==null) || 
             (this.userInterestName!=null &&
              this.userInterestName.equals(other.getUserInterestName())));
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
        if (getUserInterestId() != null) {
            _hashCode += getUserInterestId().hashCode();
        }
        if (getUserInterestParentId() != null) {
            _hashCode += getUserInterestParentId().hashCode();
        }
        if (getUserInterestName() != null) {
            _hashCode += getUserInterestName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CriterionUserInterest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CriterionUserInterest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userInterestId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "userInterestId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userInterestParentId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "userInterestParentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userInterestName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "userInterestName"));
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
