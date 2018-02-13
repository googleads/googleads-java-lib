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
 * Placement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * A {@code Placement} groups related {@code AdUnit} objects.
 */
public class Placement  extends com.google.api.ads.dfp.axis.v201802.SiteTargetingInfo  implements java.io.Serializable {
    /* Uniquely identifies the {@code Placement}. This attribute is
     * read-only and
     *                     is assigned by Google when a placement is created. */
    private java.lang.Long id;

    /* The name of the {@code Placement}. This value is required and
     * has a maximum
     *                     length of 255 characters. */
    private java.lang.String name;

    /* A description of the {@code Placement}. This value is optional
     * and its
     *                     maximum length is 65,535 characters. */
    private java.lang.String description;

    /* A string used to uniquely identify the {@code Placement} for
     * purposes of
     *                     serving the ad. This attribute is read-only and
     * is assigned by Google when
     *                     a placement is created. */
    private java.lang.String placementCode;

    /* The status of the {@code Placement}. This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201802.InventoryStatus status;

    /* The collection of {@code AdUnit} object IDs that constitute
     * the {@code
     *                     Placement}. */
    private java.lang.String[] targetedAdUnitIds;

    /* The date and time this placement was last modified. */
    private com.google.api.ads.dfp.axis.v201802.DateTime lastModifiedDateTime;

    public Placement() {
    }

    public Placement(
           java.lang.Long id,
           java.lang.String name,
           java.lang.String description,
           java.lang.String placementCode,
           com.google.api.ads.dfp.axis.v201802.InventoryStatus status,
           java.lang.String[] targetedAdUnitIds,
           com.google.api.ads.dfp.axis.v201802.DateTime lastModifiedDateTime) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.placementCode = placementCode;
        this.status = status;
        this.targetedAdUnitIds = targetedAdUnitIds;
        this.lastModifiedDateTime = lastModifiedDateTime;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("description", getDescription())
            .add("id", getId())
            .add("lastModifiedDateTime", getLastModifiedDateTime())
            .add("name", getName())
            .add("placementCode", getPlacementCode())
            .add("status", getStatus())
            .add("targetedAdUnitIds", getTargetedAdUnitIds())
            .toString();
    }

    /**
     * Gets the id value for this Placement.
     * 
     * @return id   * Uniquely identifies the {@code Placement}. This attribute is
     * read-only and
     *                     is assigned by Google when a placement is created.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Placement.
     * 
     * @param id   * Uniquely identifies the {@code Placement}. This attribute is
     * read-only and
     *                     is assigned by Google when a placement is created.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this Placement.
     * 
     * @return name   * The name of the {@code Placement}. This value is required and
     * has a maximum
     *                     length of 255 characters.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Placement.
     * 
     * @param name   * The name of the {@code Placement}. This value is required and
     * has a maximum
     *                     length of 255 characters.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this Placement.
     * 
     * @return description   * A description of the {@code Placement}. This value is optional
     * and its
     *                     maximum length is 65,535 characters.
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Placement.
     * 
     * @param description   * A description of the {@code Placement}. This value is optional
     * and its
     *                     maximum length is 65,535 characters.
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the placementCode value for this Placement.
     * 
     * @return placementCode   * A string used to uniquely identify the {@code Placement} for
     * purposes of
     *                     serving the ad. This attribute is read-only and
     * is assigned by Google when
     *                     a placement is created.
     */
    public java.lang.String getPlacementCode() {
        return placementCode;
    }


    /**
     * Sets the placementCode value for this Placement.
     * 
     * @param placementCode   * A string used to uniquely identify the {@code Placement} for
     * purposes of
     *                     serving the ad. This attribute is read-only and
     * is assigned by Google when
     *                     a placement is created.
     */
    public void setPlacementCode(java.lang.String placementCode) {
        this.placementCode = placementCode;
    }


    /**
     * Gets the status value for this Placement.
     * 
     * @return status   * The status of the {@code Placement}. This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201802.InventoryStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Placement.
     * 
     * @param status   * The status of the {@code Placement}. This attribute is read-only.
     */
    public void setStatus(com.google.api.ads.dfp.axis.v201802.InventoryStatus status) {
        this.status = status;
    }


    /**
     * Gets the targetedAdUnitIds value for this Placement.
     * 
     * @return targetedAdUnitIds   * The collection of {@code AdUnit} object IDs that constitute
     * the {@code
     *                     Placement}.
     */
    public java.lang.String[] getTargetedAdUnitIds() {
        return targetedAdUnitIds;
    }


    /**
     * Sets the targetedAdUnitIds value for this Placement.
     * 
     * @param targetedAdUnitIds   * The collection of {@code AdUnit} object IDs that constitute
     * the {@code
     *                     Placement}.
     */
    public void setTargetedAdUnitIds(java.lang.String[] targetedAdUnitIds) {
        this.targetedAdUnitIds = targetedAdUnitIds;
    }

    public java.lang.String getTargetedAdUnitIds(int i) {
        return this.targetedAdUnitIds[i];
    }

    public void setTargetedAdUnitIds(int i, java.lang.String _value) {
        this.targetedAdUnitIds[i] = _value;
    }


    /**
     * Gets the lastModifiedDateTime value for this Placement.
     * 
     * @return lastModifiedDateTime   * The date and time this placement was last modified.
     */
    public com.google.api.ads.dfp.axis.v201802.DateTime getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }


    /**
     * Sets the lastModifiedDateTime value for this Placement.
     * 
     * @param lastModifiedDateTime   * The date and time this placement was last modified.
     */
    public void setLastModifiedDateTime(com.google.api.ads.dfp.axis.v201802.DateTime lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Placement)) return false;
        Placement other = (Placement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.placementCode==null && other.getPlacementCode()==null) || 
             (this.placementCode!=null &&
              this.placementCode.equals(other.getPlacementCode()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.targetedAdUnitIds==null && other.getTargetedAdUnitIds()==null) || 
             (this.targetedAdUnitIds!=null &&
              java.util.Arrays.equals(this.targetedAdUnitIds, other.getTargetedAdUnitIds()))) &&
            ((this.lastModifiedDateTime==null && other.getLastModifiedDateTime()==null) || 
             (this.lastModifiedDateTime!=null &&
              this.lastModifiedDateTime.equals(other.getLastModifiedDateTime())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getPlacementCode() != null) {
            _hashCode += getPlacementCode().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTargetedAdUnitIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetedAdUnitIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetedAdUnitIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastModifiedDateTime() != null) {
            _hashCode += getLastModifiedDateTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Placement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Placement"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placementCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "placementCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "InventoryStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetedAdUnitIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "targetedAdUnitIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "lastModifiedDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DateTime"));
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
