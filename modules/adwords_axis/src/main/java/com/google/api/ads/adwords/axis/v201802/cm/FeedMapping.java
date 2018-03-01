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
 * FeedMapping.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * A FeedMapping represents a mapping between feed attributes in a
 * specific feed
 *             and placeholder fields for a specific placeholder type.
 * This will tell the
 *             ads serving system which parts of the feed item should
 * be used when
 *             populating a placeholder. Without this mapping the placeholder
 * cannot be
 *             populated and the extension can not be displayed.
 *             
 *             <p>For a list of feed placeholders, see
 *             <a href="/adwords/api/docs/appendix/placeholders">
 *             https://developers.google.com/adwords/api/docs/appendix/placeholders
 * </a></p>
 */
public class FeedMapping  implements java.io.Serializable {
    /* ID of this FeedMapping.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "FeedMappingId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : REMOVE.</span> */
    private java.lang.Long feedMappingId;

    /* ID of the Feed that is mapped by this mapping.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "FeedId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.Long feedId;

    /* The placeholder type for this mapping.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "PlaceholderType".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.Integer placeholderType;

    /* Status of the mapping.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.FeedMappingStatus status;

    /* The list of feed attributes to placeholder fields mappings.
     * <span class="constraint Selectable">This field can be selected using
     * the value "AttributeFieldMappings".</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.AttributeFieldMapping[] attributeFieldMappings;

    /* The criterion type for this mapping. This field is mutually
     * exclusive with placeholderType.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "CriterionType".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.Integer criterionType;

    public FeedMapping() {
    }

    public FeedMapping(
           java.lang.Long feedMappingId,
           java.lang.Long feedId,
           java.lang.Integer placeholderType,
           com.google.api.ads.adwords.axis.v201802.cm.FeedMappingStatus status,
           com.google.api.ads.adwords.axis.v201802.cm.AttributeFieldMapping[] attributeFieldMappings,
           java.lang.Integer criterionType) {
           this.feedMappingId = feedMappingId;
           this.feedId = feedId;
           this.placeholderType = placeholderType;
           this.status = status;
           this.attributeFieldMappings = attributeFieldMappings;
           this.criterionType = criterionType;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("attributeFieldMappings", getAttributeFieldMappings())
            .add("criterionType", getCriterionType())
            .add("feedId", getFeedId())
            .add("feedMappingId", getFeedMappingId())
            .add("placeholderType", getPlaceholderType())
            .add("status", getStatus())
            .toString();
    }

    /**
     * Gets the feedMappingId value for this FeedMapping.
     * 
     * @return feedMappingId   * ID of this FeedMapping.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "FeedMappingId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : REMOVE.</span>
     */
    public java.lang.Long getFeedMappingId() {
        return feedMappingId;
    }


    /**
     * Sets the feedMappingId value for this FeedMapping.
     * 
     * @param feedMappingId   * ID of this FeedMapping.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "FeedMappingId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : REMOVE.</span>
     */
    public void setFeedMappingId(java.lang.Long feedMappingId) {
        this.feedMappingId = feedMappingId;
    }


    /**
     * Gets the feedId value for this FeedMapping.
     * 
     * @return feedId   * ID of the Feed that is mapped by this mapping.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "FeedId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.Long getFeedId() {
        return feedId;
    }


    /**
     * Sets the feedId value for this FeedMapping.
     * 
     * @param feedId   * ID of the Feed that is mapped by this mapping.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "FeedId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setFeedId(java.lang.Long feedId) {
        this.feedId = feedId;
    }


    /**
     * Gets the placeholderType value for this FeedMapping.
     * 
     * @return placeholderType   * The placeholder type for this mapping.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "PlaceholderType".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.Integer getPlaceholderType() {
        return placeholderType;
    }


    /**
     * Sets the placeholderType value for this FeedMapping.
     * 
     * @param placeholderType   * The placeholder type for this mapping.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "PlaceholderType".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setPlaceholderType(java.lang.Integer placeholderType) {
        this.placeholderType = placeholderType;
    }


    /**
     * Gets the status value for this FeedMapping.
     * 
     * @return status   * Status of the mapping.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.FeedMappingStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this FeedMapping.
     * 
     * @param status   * Status of the mapping.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setStatus(com.google.api.ads.adwords.axis.v201802.cm.FeedMappingStatus status) {
        this.status = status;
    }


    /**
     * Gets the attributeFieldMappings value for this FeedMapping.
     * 
     * @return attributeFieldMappings   * The list of feed attributes to placeholder fields mappings.
     * <span class="constraint Selectable">This field can be selected using
     * the value "AttributeFieldMappings".</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.AttributeFieldMapping[] getAttributeFieldMappings() {
        return attributeFieldMappings;
    }


    /**
     * Sets the attributeFieldMappings value for this FeedMapping.
     * 
     * @param attributeFieldMappings   * The list of feed attributes to placeholder fields mappings.
     * <span class="constraint Selectable">This field can be selected using
     * the value "AttributeFieldMappings".</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public void setAttributeFieldMappings(com.google.api.ads.adwords.axis.v201802.cm.AttributeFieldMapping[] attributeFieldMappings) {
        this.attributeFieldMappings = attributeFieldMappings;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.AttributeFieldMapping getAttributeFieldMappings(int i) {
        return this.attributeFieldMappings[i];
    }

    public void setAttributeFieldMappings(int i, com.google.api.ads.adwords.axis.v201802.cm.AttributeFieldMapping _value) {
        this.attributeFieldMappings[i] = _value;
    }


    /**
     * Gets the criterionType value for this FeedMapping.
     * 
     * @return criterionType   * The criterion type for this mapping. This field is mutually
     * exclusive with placeholderType.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "CriterionType".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.Integer getCriterionType() {
        return criterionType;
    }


    /**
     * Sets the criterionType value for this FeedMapping.
     * 
     * @param criterionType   * The criterion type for this mapping. This field is mutually
     * exclusive with placeholderType.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "CriterionType".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setCriterionType(java.lang.Integer criterionType) {
        this.criterionType = criterionType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeedMapping)) return false;
        FeedMapping other = (FeedMapping) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.feedMappingId==null && other.getFeedMappingId()==null) || 
             (this.feedMappingId!=null &&
              this.feedMappingId.equals(other.getFeedMappingId()))) &&
            ((this.feedId==null && other.getFeedId()==null) || 
             (this.feedId!=null &&
              this.feedId.equals(other.getFeedId()))) &&
            ((this.placeholderType==null && other.getPlaceholderType()==null) || 
             (this.placeholderType!=null &&
              this.placeholderType.equals(other.getPlaceholderType()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.attributeFieldMappings==null && other.getAttributeFieldMappings()==null) || 
             (this.attributeFieldMappings!=null &&
              java.util.Arrays.equals(this.attributeFieldMappings, other.getAttributeFieldMappings()))) &&
            ((this.criterionType==null && other.getCriterionType()==null) || 
             (this.criterionType!=null &&
              this.criterionType.equals(other.getCriterionType())));
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
        if (getFeedMappingId() != null) {
            _hashCode += getFeedMappingId().hashCode();
        }
        if (getFeedId() != null) {
            _hashCode += getFeedId().hashCode();
        }
        if (getPlaceholderType() != null) {
            _hashCode += getPlaceholderType().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getAttributeFieldMappings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttributeFieldMappings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttributeFieldMappings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCriterionType() != null) {
            _hashCode += getCriterionType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeedMapping.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedMapping"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedMappingId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "feedMappingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "feedId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placeholderType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "placeholderType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedMapping.Status"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeFieldMappings");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "attributeFieldMappings"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AttributeFieldMapping"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criterionType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "criterionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
