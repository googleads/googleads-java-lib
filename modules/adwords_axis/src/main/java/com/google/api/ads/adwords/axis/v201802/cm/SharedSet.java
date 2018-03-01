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
 * SharedSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * SharedSets are used for sharing entities across multiple campaigns
 * under the same account.
 */
public class SharedSet  implements java.io.Serializable {
    /* <span class="constraint Required">This field is required and
     * should not be {@code null} when it is contained within {@link Operator}s
     * : SET, REMOVE.</span> */
    private java.lang.Long sharedSetId;

    /* Shared Sets must have names that are unique among active shared
     * sets of the same type.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 255, inclusive, in UTF-8 bytes,
     * (trimmed).</span> */
    private java.lang.String name;

    /* <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API for the following {@link Operator}s:
     * REMOVE and SET.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.SharedSetType type;

    /* The number of entities in the shared set.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Integer memberCount;

    /* The number of campaigns that actively use the shared set.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Integer referenceCount;

    /* The status of the shared set.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.SharedSetStatus status;

    public SharedSet() {
    }

    public SharedSet(
           java.lang.Long sharedSetId,
           java.lang.String name,
           com.google.api.ads.adwords.axis.v201802.cm.SharedSetType type,
           java.lang.Integer memberCount,
           java.lang.Integer referenceCount,
           com.google.api.ads.adwords.axis.v201802.cm.SharedSetStatus status) {
           this.sharedSetId = sharedSetId;
           this.name = name;
           this.type = type;
           this.memberCount = memberCount;
           this.referenceCount = referenceCount;
           this.status = status;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("memberCount", getMemberCount())
            .add("name", getName())
            .add("referenceCount", getReferenceCount())
            .add("sharedSetId", getSharedSetId())
            .add("status", getStatus())
            .add("type", getType())
            .toString();
    }

    /**
     * Gets the sharedSetId value for this SharedSet.
     * 
     * @return sharedSetId   * <span class="constraint Required">This field is required and
     * should not be {@code null} when it is contained within {@link Operator}s
     * : SET, REMOVE.</span>
     */
    public java.lang.Long getSharedSetId() {
        return sharedSetId;
    }


    /**
     * Sets the sharedSetId value for this SharedSet.
     * 
     * @param sharedSetId   * <span class="constraint Required">This field is required and
     * should not be {@code null} when it is contained within {@link Operator}s
     * : SET, REMOVE.</span>
     */
    public void setSharedSetId(java.lang.Long sharedSetId) {
        this.sharedSetId = sharedSetId;
    }


    /**
     * Gets the name value for this SharedSet.
     * 
     * @return name   * Shared Sets must have names that are unique among active shared
     * sets of the same type.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 255, inclusive, in UTF-8 bytes,
     * (trimmed).</span>
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this SharedSet.
     * 
     * @param name   * Shared Sets must have names that are unique among active shared
     * sets of the same type.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 255, inclusive, in UTF-8 bytes,
     * (trimmed).</span>
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the type value for this SharedSet.
     * 
     * @return type   * <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API for the following {@link Operator}s:
     * REMOVE and SET.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.SharedSetType getType() {
        return type;
    }


    /**
     * Sets the type value for this SharedSet.
     * 
     * @param type   * <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API for the following {@link Operator}s:
     * REMOVE and SET.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public void setType(com.google.api.ads.adwords.axis.v201802.cm.SharedSetType type) {
        this.type = type;
    }


    /**
     * Gets the memberCount value for this SharedSet.
     * 
     * @return memberCount   * The number of entities in the shared set.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Integer getMemberCount() {
        return memberCount;
    }


    /**
     * Sets the memberCount value for this SharedSet.
     * 
     * @param memberCount   * The number of entities in the shared set.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setMemberCount(java.lang.Integer memberCount) {
        this.memberCount = memberCount;
    }


    /**
     * Gets the referenceCount value for this SharedSet.
     * 
     * @return referenceCount   * The number of campaigns that actively use the shared set.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Integer getReferenceCount() {
        return referenceCount;
    }


    /**
     * Sets the referenceCount value for this SharedSet.
     * 
     * @param referenceCount   * The number of campaigns that actively use the shared set.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setReferenceCount(java.lang.Integer referenceCount) {
        this.referenceCount = referenceCount;
    }


    /**
     * Gets the status value for this SharedSet.
     * 
     * @return status   * The status of the shared set.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.SharedSetStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SharedSet.
     * 
     * @param status   * The status of the shared set.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setStatus(com.google.api.ads.adwords.axis.v201802.cm.SharedSetStatus status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SharedSet)) return false;
        SharedSet other = (SharedSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sharedSetId==null && other.getSharedSetId()==null) || 
             (this.sharedSetId!=null &&
              this.sharedSetId.equals(other.getSharedSetId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.memberCount==null && other.getMemberCount()==null) || 
             (this.memberCount!=null &&
              this.memberCount.equals(other.getMemberCount()))) &&
            ((this.referenceCount==null && other.getReferenceCount()==null) || 
             (this.referenceCount!=null &&
              this.referenceCount.equals(other.getReferenceCount()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getSharedSetId() != null) {
            _hashCode += getSharedSetId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getMemberCount() != null) {
            _hashCode += getMemberCount().hashCode();
        }
        if (getReferenceCount() != null) {
            _hashCode += getReferenceCount().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SharedSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "SharedSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharedSetId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "sharedSetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "SharedSetType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "memberCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "referenceCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "SharedSet.Status"));
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
