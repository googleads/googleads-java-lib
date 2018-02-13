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
 * LineItemTemplate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Represents the template that populates the fields of a new line
 * item being created.
 */
public class LineItemTemplate  implements java.io.Serializable {
    /* Uniquely identifies the {@code LineItemTemplate}. This attribute
     * is
     *                 read-only and is assigned by Google when a template
     * is created. */
    private java.lang.Long id;

    /* The name of the {@code LineItemTemplate}. This attribute is
     * required. */
    private java.lang.String name;

    /* Whether or not the {@code LineItemTemplate} represents the
     * default choices
     *                 for creating a {@code LineItem}. Only one default
     * {@code LineItemTemplate}
     *                 is allowed per {@code Network}. This attribute is
     * readonly. */
    private java.lang.Boolean isDefault;

    /* The default {@link LineItem#name name} of a new {@code LineItem}.
     * This
     *                 attribute is optional and has a maximum length of
     * 127 characters. */
    private java.lang.String lineItemName;

    /* The default value for the
     *                 {@link LineItem#enabledForSameAdvertiserException}
     * field of a new
     *                 {@code LineItem}. This attribute is required. */
    private java.lang.Boolean enabledForSameAdvertiserException;

    /* The default {@link LineItem#notes notes} for a new {@code LineItem}.
     * This
     *                 attribute is optional and has a maximum length of
     * 65,535 characters. */
    private java.lang.String notes;

    /* The default {@link LineItem#lineItemType type} of a new {@code
     * LineItem}.
     *                 This attribute is required. */
    private com.google.api.ads.dfp.axis.v201802.LineItemType lineItemType;

    /* The default time of the {@link LineItem#startDateTime} field
     * of a new
     *                 {@code LineItem}. Only the time part is used, and
     * the date part is ignored.
     *                 This attribute is deprecated. */
    private com.google.api.ads.dfp.axis.v201802.DateTime startTime;

    /* The default time of the {@link LineItem#endDateTime} field
     * of a new
     *                 {@code LineItem}. Only the time part is used, and
     * the date part is ignored.
     *                 This attribute is deprecated. */
    private com.google.api.ads.dfp.axis.v201802.DateTime endTime;

    /* The default {@link LineItem#deliveryRateType delivery strategy}
     * for a new
     *                 {@code LineItem}. This attribute is required. */
    private com.google.api.ads.dfp.axis.v201802.DeliveryRateType deliveryRateType;

    /* The default {@link LineItem#roadblockingType roadblocking strategy}
     * for a
     *                 new {@code LineItem}. This attribute is required. */
    private com.google.api.ads.dfp.axis.v201802.RoadblockingType roadblockingType;

    /* The default {@link LineItem#creativeRotationType creative rotation
     * strategy}
     *                 for a new {@code LineItem}. This attribute is required. */
    private com.google.api.ads.dfp.axis.v201802.CreativeRotationType creativeRotationType;

    public LineItemTemplate() {
    }

    public LineItemTemplate(
           java.lang.Long id,
           java.lang.String name,
           java.lang.Boolean isDefault,
           java.lang.String lineItemName,
           java.lang.Boolean enabledForSameAdvertiserException,
           java.lang.String notes,
           com.google.api.ads.dfp.axis.v201802.LineItemType lineItemType,
           com.google.api.ads.dfp.axis.v201802.DateTime startTime,
           com.google.api.ads.dfp.axis.v201802.DateTime endTime,
           com.google.api.ads.dfp.axis.v201802.DeliveryRateType deliveryRateType,
           com.google.api.ads.dfp.axis.v201802.RoadblockingType roadblockingType,
           com.google.api.ads.dfp.axis.v201802.CreativeRotationType creativeRotationType) {
           this.id = id;
           this.name = name;
           this.isDefault = isDefault;
           this.lineItemName = lineItemName;
           this.enabledForSameAdvertiserException = enabledForSameAdvertiserException;
           this.notes = notes;
           this.lineItemType = lineItemType;
           this.startTime = startTime;
           this.endTime = endTime;
           this.deliveryRateType = deliveryRateType;
           this.roadblockingType = roadblockingType;
           this.creativeRotationType = creativeRotationType;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("creativeRotationType", getCreativeRotationType())
            .add("deliveryRateType", getDeliveryRateType())
            .add("enabledForSameAdvertiserException", getEnabledForSameAdvertiserException())
            .add("endTime", getEndTime())
            .add("id", getId())
            .add("isDefault", getIsDefault())
            .add("lineItemName", getLineItemName())
            .add("lineItemType", getLineItemType())
            .add("name", getName())
            .add("notes", getNotes())
            .add("roadblockingType", getRoadblockingType())
            .add("startTime", getStartTime())
            .toString();
    }

    /**
     * Gets the id value for this LineItemTemplate.
     * 
     * @return id   * Uniquely identifies the {@code LineItemTemplate}. This attribute
     * is
     *                 read-only and is assigned by Google when a template
     * is created.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this LineItemTemplate.
     * 
     * @param id   * Uniquely identifies the {@code LineItemTemplate}. This attribute
     * is
     *                 read-only and is assigned by Google when a template
     * is created.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this LineItemTemplate.
     * 
     * @return name   * The name of the {@code LineItemTemplate}. This attribute is
     * required.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this LineItemTemplate.
     * 
     * @param name   * The name of the {@code LineItemTemplate}. This attribute is
     * required.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the isDefault value for this LineItemTemplate.
     * 
     * @return isDefault   * Whether or not the {@code LineItemTemplate} represents the
     * default choices
     *                 for creating a {@code LineItem}. Only one default
     * {@code LineItemTemplate}
     *                 is allowed per {@code Network}. This attribute is
     * readonly.
     */
    public java.lang.Boolean getIsDefault() {
        return isDefault;
    }


    /**
     * Sets the isDefault value for this LineItemTemplate.
     * 
     * @param isDefault   * Whether or not the {@code LineItemTemplate} represents the
     * default choices
     *                 for creating a {@code LineItem}. Only one default
     * {@code LineItemTemplate}
     *                 is allowed per {@code Network}. This attribute is
     * readonly.
     */
    public void setIsDefault(java.lang.Boolean isDefault) {
        this.isDefault = isDefault;
    }


    /**
     * Gets the lineItemName value for this LineItemTemplate.
     * 
     * @return lineItemName   * The default {@link LineItem#name name} of a new {@code LineItem}.
     * This
     *                 attribute is optional and has a maximum length of
     * 127 characters.
     */
    public java.lang.String getLineItemName() {
        return lineItemName;
    }


    /**
     * Sets the lineItemName value for this LineItemTemplate.
     * 
     * @param lineItemName   * The default {@link LineItem#name name} of a new {@code LineItem}.
     * This
     *                 attribute is optional and has a maximum length of
     * 127 characters.
     */
    public void setLineItemName(java.lang.String lineItemName) {
        this.lineItemName = lineItemName;
    }


    /**
     * Gets the enabledForSameAdvertiserException value for this LineItemTemplate.
     * 
     * @return enabledForSameAdvertiserException   * The default value for the
     *                 {@link LineItem#enabledForSameAdvertiserException}
     * field of a new
     *                 {@code LineItem}. This attribute is required.
     */
    public java.lang.Boolean getEnabledForSameAdvertiserException() {
        return enabledForSameAdvertiserException;
    }


    /**
     * Sets the enabledForSameAdvertiserException value for this LineItemTemplate.
     * 
     * @param enabledForSameAdvertiserException   * The default value for the
     *                 {@link LineItem#enabledForSameAdvertiserException}
     * field of a new
     *                 {@code LineItem}. This attribute is required.
     */
    public void setEnabledForSameAdvertiserException(java.lang.Boolean enabledForSameAdvertiserException) {
        this.enabledForSameAdvertiserException = enabledForSameAdvertiserException;
    }


    /**
     * Gets the notes value for this LineItemTemplate.
     * 
     * @return notes   * The default {@link LineItem#notes notes} for a new {@code LineItem}.
     * This
     *                 attribute is optional and has a maximum length of
     * 65,535 characters.
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this LineItemTemplate.
     * 
     * @param notes   * The default {@link LineItem#notes notes} for a new {@code LineItem}.
     * This
     *                 attribute is optional and has a maximum length of
     * 65,535 characters.
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the lineItemType value for this LineItemTemplate.
     * 
     * @return lineItemType   * The default {@link LineItem#lineItemType type} of a new {@code
     * LineItem}.
     *                 This attribute is required.
     */
    public com.google.api.ads.dfp.axis.v201802.LineItemType getLineItemType() {
        return lineItemType;
    }


    /**
     * Sets the lineItemType value for this LineItemTemplate.
     * 
     * @param lineItemType   * The default {@link LineItem#lineItemType type} of a new {@code
     * LineItem}.
     *                 This attribute is required.
     */
    public void setLineItemType(com.google.api.ads.dfp.axis.v201802.LineItemType lineItemType) {
        this.lineItemType = lineItemType;
    }


    /**
     * Gets the startTime value for this LineItemTemplate.
     * 
     * @return startTime   * The default time of the {@link LineItem#startDateTime} field
     * of a new
     *                 {@code LineItem}. Only the time part is used, and
     * the date part is ignored.
     *                 This attribute is deprecated.
     */
    public com.google.api.ads.dfp.axis.v201802.DateTime getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this LineItemTemplate.
     * 
     * @param startTime   * The default time of the {@link LineItem#startDateTime} field
     * of a new
     *                 {@code LineItem}. Only the time part is used, and
     * the date part is ignored.
     *                 This attribute is deprecated.
     */
    public void setStartTime(com.google.api.ads.dfp.axis.v201802.DateTime startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the endTime value for this LineItemTemplate.
     * 
     * @return endTime   * The default time of the {@link LineItem#endDateTime} field
     * of a new
     *                 {@code LineItem}. Only the time part is used, and
     * the date part is ignored.
     *                 This attribute is deprecated.
     */
    public com.google.api.ads.dfp.axis.v201802.DateTime getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this LineItemTemplate.
     * 
     * @param endTime   * The default time of the {@link LineItem#endDateTime} field
     * of a new
     *                 {@code LineItem}. Only the time part is used, and
     * the date part is ignored.
     *                 This attribute is deprecated.
     */
    public void setEndTime(com.google.api.ads.dfp.axis.v201802.DateTime endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the deliveryRateType value for this LineItemTemplate.
     * 
     * @return deliveryRateType   * The default {@link LineItem#deliveryRateType delivery strategy}
     * for a new
     *                 {@code LineItem}. This attribute is required.
     */
    public com.google.api.ads.dfp.axis.v201802.DeliveryRateType getDeliveryRateType() {
        return deliveryRateType;
    }


    /**
     * Sets the deliveryRateType value for this LineItemTemplate.
     * 
     * @param deliveryRateType   * The default {@link LineItem#deliveryRateType delivery strategy}
     * for a new
     *                 {@code LineItem}. This attribute is required.
     */
    public void setDeliveryRateType(com.google.api.ads.dfp.axis.v201802.DeliveryRateType deliveryRateType) {
        this.deliveryRateType = deliveryRateType;
    }


    /**
     * Gets the roadblockingType value for this LineItemTemplate.
     * 
     * @return roadblockingType   * The default {@link LineItem#roadblockingType roadblocking strategy}
     * for a
     *                 new {@code LineItem}. This attribute is required.
     */
    public com.google.api.ads.dfp.axis.v201802.RoadblockingType getRoadblockingType() {
        return roadblockingType;
    }


    /**
     * Sets the roadblockingType value for this LineItemTemplate.
     * 
     * @param roadblockingType   * The default {@link LineItem#roadblockingType roadblocking strategy}
     * for a
     *                 new {@code LineItem}. This attribute is required.
     */
    public void setRoadblockingType(com.google.api.ads.dfp.axis.v201802.RoadblockingType roadblockingType) {
        this.roadblockingType = roadblockingType;
    }


    /**
     * Gets the creativeRotationType value for this LineItemTemplate.
     * 
     * @return creativeRotationType   * The default {@link LineItem#creativeRotationType creative rotation
     * strategy}
     *                 for a new {@code LineItem}. This attribute is required.
     */
    public com.google.api.ads.dfp.axis.v201802.CreativeRotationType getCreativeRotationType() {
        return creativeRotationType;
    }


    /**
     * Sets the creativeRotationType value for this LineItemTemplate.
     * 
     * @param creativeRotationType   * The default {@link LineItem#creativeRotationType creative rotation
     * strategy}
     *                 for a new {@code LineItem}. This attribute is required.
     */
    public void setCreativeRotationType(com.google.api.ads.dfp.axis.v201802.CreativeRotationType creativeRotationType) {
        this.creativeRotationType = creativeRotationType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LineItemTemplate)) return false;
        LineItemTemplate other = (LineItemTemplate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.isDefault==null && other.getIsDefault()==null) || 
             (this.isDefault!=null &&
              this.isDefault.equals(other.getIsDefault()))) &&
            ((this.lineItemName==null && other.getLineItemName()==null) || 
             (this.lineItemName!=null &&
              this.lineItemName.equals(other.getLineItemName()))) &&
            ((this.enabledForSameAdvertiserException==null && other.getEnabledForSameAdvertiserException()==null) || 
             (this.enabledForSameAdvertiserException!=null &&
              this.enabledForSameAdvertiserException.equals(other.getEnabledForSameAdvertiserException()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.lineItemType==null && other.getLineItemType()==null) || 
             (this.lineItemType!=null &&
              this.lineItemType.equals(other.getLineItemType()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            ((this.deliveryRateType==null && other.getDeliveryRateType()==null) || 
             (this.deliveryRateType!=null &&
              this.deliveryRateType.equals(other.getDeliveryRateType()))) &&
            ((this.roadblockingType==null && other.getRoadblockingType()==null) || 
             (this.roadblockingType!=null &&
              this.roadblockingType.equals(other.getRoadblockingType()))) &&
            ((this.creativeRotationType==null && other.getCreativeRotationType()==null) || 
             (this.creativeRotationType!=null &&
              this.creativeRotationType.equals(other.getCreativeRotationType())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getIsDefault() != null) {
            _hashCode += getIsDefault().hashCode();
        }
        if (getLineItemName() != null) {
            _hashCode += getLineItemName().hashCode();
        }
        if (getEnabledForSameAdvertiserException() != null) {
            _hashCode += getEnabledForSameAdvertiserException().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getLineItemType() != null) {
            _hashCode += getLineItemType().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        if (getDeliveryRateType() != null) {
            _hashCode += getDeliveryRateType().hashCode();
        }
        if (getRoadblockingType() != null) {
            _hashCode += getRoadblockingType().hashCode();
        }
        if (getCreativeRotationType() != null) {
            _hashCode += getCreativeRotationType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LineItemTemplate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "LineItemTemplate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "id"));
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
        elemField.setFieldName("isDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "isDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "lineItemName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabledForSameAdvertiserException");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "enabledForSameAdvertiserException"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "lineItemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "LineItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "endTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryRateType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "deliveryRateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DeliveryRateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roadblockingType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "roadblockingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "RoadblockingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeRotationType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "creativeRotationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CreativeRotationType"));
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
