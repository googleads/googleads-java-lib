// Copyright 2025 Google LLC
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
 * ThirdPartyAudienceSegment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202505;


/**
 * A {@link ThirdPartyAudienceSegment} is an {@link AudienceSegment}
 * owned by a data provider and
 *             licensed to the Ad Manager publisher.
 */
public class ThirdPartyAudienceSegment  extends com.google.api.ads.admanager.axis.v202505.AudienceSegment  implements java.io.Serializable {
    /* Specifies if the publisher has approved or rejected the segment. */
    private com.google.api.ads.admanager.axis.v202505.AudienceSegmentApprovalStatus approvalStatus;

    /* Specifies CPM cost for the given segment. This attribute is
     * readonly and is assigned by the
     *                     data provider.
     *                     
     *                     <p>The CPM cost comes from the active pricing,
     * if there is one; otherwise it comes from the
     *                     latest pricing. */
    private com.google.api.ads.admanager.axis.v202505.Money cost;

    /* Specifies the license type of the external segment. This attribute
     * is read-only. */
    private com.google.api.ads.admanager.axis.v202505.LicenseType licenseType;

    /* Specifies the date and time at which this segment becomes available
     * for use. This attribute is
     *                     readonly and is assigned by the data provider. */
    private com.google.api.ads.admanager.axis.v202505.DateTime startDateTime;

    /* Specifies the date and time at which this segment ceases to
     * be available for use. This
     *                     attribute is readonly and is assigned by the data
     * provider. */
    private com.google.api.ads.admanager.axis.v202505.DateTime endDateTime;

    public ThirdPartyAudienceSegment() {
    }

    public ThirdPartyAudienceSegment(
           java.lang.Long id,
           java.lang.String name,
           long[] categoryIds,
           java.lang.String description,
           com.google.api.ads.admanager.axis.v202505.AudienceSegmentStatus status,
           java.lang.Long size,
           java.lang.Long mobileWebSize,
           java.lang.Long idfaSize,
           java.lang.Long adIdSize,
           java.lang.Long ppidSize,
           com.google.api.ads.admanager.axis.v202505.AudienceSegmentDataProvider dataProvider,
           com.google.api.ads.admanager.axis.v202505.AudienceSegmentType type,
           com.google.api.ads.admanager.axis.v202505.AudienceSegmentApprovalStatus approvalStatus,
           com.google.api.ads.admanager.axis.v202505.Money cost,
           com.google.api.ads.admanager.axis.v202505.LicenseType licenseType,
           com.google.api.ads.admanager.axis.v202505.DateTime startDateTime,
           com.google.api.ads.admanager.axis.v202505.DateTime endDateTime) {
        super(
            id,
            name,
            categoryIds,
            description,
            status,
            size,
            mobileWebSize,
            idfaSize,
            adIdSize,
            ppidSize,
            dataProvider,
            type);
        this.approvalStatus = approvalStatus;
        this.cost = cost;
        this.licenseType = licenseType;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adIdSize", getAdIdSize())
            .add("approvalStatus", getApprovalStatus())
            .add("categoryIds", getCategoryIds())
            .add("cost", getCost())
            .add("dataProvider", getDataProvider())
            .add("description", getDescription())
            .add("endDateTime", getEndDateTime())
            .add("id", getId())
            .add("idfaSize", getIdfaSize())
            .add("licenseType", getLicenseType())
            .add("mobileWebSize", getMobileWebSize())
            .add("name", getName())
            .add("ppidSize", getPpidSize())
            .add("size", getSize())
            .add("startDateTime", getStartDateTime())
            .add("status", getStatus())
            .add("type", getType())
            .toString();
    }

    /**
     * Gets the approvalStatus value for this ThirdPartyAudienceSegment.
     * 
     * @return approvalStatus   * Specifies if the publisher has approved or rejected the segment.
     */
    public com.google.api.ads.admanager.axis.v202505.AudienceSegmentApprovalStatus getApprovalStatus() {
        return approvalStatus;
    }


    /**
     * Sets the approvalStatus value for this ThirdPartyAudienceSegment.
     * 
     * @param approvalStatus   * Specifies if the publisher has approved or rejected the segment.
     */
    public void setApprovalStatus(com.google.api.ads.admanager.axis.v202505.AudienceSegmentApprovalStatus approvalStatus) {
        this.approvalStatus = approvalStatus;
    }


    /**
     * Gets the cost value for this ThirdPartyAudienceSegment.
     * 
     * @return cost   * Specifies CPM cost for the given segment. This attribute is
     * readonly and is assigned by the
     *                     data provider.
     *                     
     *                     <p>The CPM cost comes from the active pricing,
     * if there is one; otherwise it comes from the
     *                     latest pricing.
     */
    public com.google.api.ads.admanager.axis.v202505.Money getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this ThirdPartyAudienceSegment.
     * 
     * @param cost   * Specifies CPM cost for the given segment. This attribute is
     * readonly and is assigned by the
     *                     data provider.
     *                     
     *                     <p>The CPM cost comes from the active pricing,
     * if there is one; otherwise it comes from the
     *                     latest pricing.
     */
    public void setCost(com.google.api.ads.admanager.axis.v202505.Money cost) {
        this.cost = cost;
    }


    /**
     * Gets the licenseType value for this ThirdPartyAudienceSegment.
     * 
     * @return licenseType   * Specifies the license type of the external segment. This attribute
     * is read-only.
     */
    public com.google.api.ads.admanager.axis.v202505.LicenseType getLicenseType() {
        return licenseType;
    }


    /**
     * Sets the licenseType value for this ThirdPartyAudienceSegment.
     * 
     * @param licenseType   * Specifies the license type of the external segment. This attribute
     * is read-only.
     */
    public void setLicenseType(com.google.api.ads.admanager.axis.v202505.LicenseType licenseType) {
        this.licenseType = licenseType;
    }


    /**
     * Gets the startDateTime value for this ThirdPartyAudienceSegment.
     * 
     * @return startDateTime   * Specifies the date and time at which this segment becomes available
     * for use. This attribute is
     *                     readonly and is assigned by the data provider.
     */
    public com.google.api.ads.admanager.axis.v202505.DateTime getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this ThirdPartyAudienceSegment.
     * 
     * @param startDateTime   * Specifies the date and time at which this segment becomes available
     * for use. This attribute is
     *                     readonly and is assigned by the data provider.
     */
    public void setStartDateTime(com.google.api.ads.admanager.axis.v202505.DateTime startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the endDateTime value for this ThirdPartyAudienceSegment.
     * 
     * @return endDateTime   * Specifies the date and time at which this segment ceases to
     * be available for use. This
     *                     attribute is readonly and is assigned by the data
     * provider.
     */
    public com.google.api.ads.admanager.axis.v202505.DateTime getEndDateTime() {
        return endDateTime;
    }


    /**
     * Sets the endDateTime value for this ThirdPartyAudienceSegment.
     * 
     * @param endDateTime   * Specifies the date and time at which this segment ceases to
     * be available for use. This
     *                     attribute is readonly and is assigned by the data
     * provider.
     */
    public void setEndDateTime(com.google.api.ads.admanager.axis.v202505.DateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ThirdPartyAudienceSegment)) return false;
        ThirdPartyAudienceSegment other = (ThirdPartyAudienceSegment) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.approvalStatus==null && other.getApprovalStatus()==null) || 
             (this.approvalStatus!=null &&
              this.approvalStatus.equals(other.getApprovalStatus()))) &&
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              this.cost.equals(other.getCost()))) &&
            ((this.licenseType==null && other.getLicenseType()==null) || 
             (this.licenseType!=null &&
              this.licenseType.equals(other.getLicenseType()))) &&
            ((this.startDateTime==null && other.getStartDateTime()==null) || 
             (this.startDateTime!=null &&
              this.startDateTime.equals(other.getStartDateTime()))) &&
            ((this.endDateTime==null && other.getEndDateTime()==null) || 
             (this.endDateTime!=null &&
              this.endDateTime.equals(other.getEndDateTime())));
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
        if (getApprovalStatus() != null) {
            _hashCode += getApprovalStatus().hashCode();
        }
        if (getCost() != null) {
            _hashCode += getCost().hashCode();
        }
        if (getLicenseType() != null) {
            _hashCode += getLicenseType().hashCode();
        }
        if (getStartDateTime() != null) {
            _hashCode += getStartDateTime().hashCode();
        }
        if (getEndDateTime() != null) {
            _hashCode += getEndDateTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ThirdPartyAudienceSegment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "ThirdPartyAudienceSegment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "approvalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "AudienceSegmentApprovalStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "cost"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "licenseType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "LicenseType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "startDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "endDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "DateTime"));
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
