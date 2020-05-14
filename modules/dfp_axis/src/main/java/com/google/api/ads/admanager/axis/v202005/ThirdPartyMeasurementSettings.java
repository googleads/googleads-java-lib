// Copyright 2020 Google LLC
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
 * ThirdPartyMeasurementSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202005;


/**
 * Contains third party auto-pixeling settings for cross-sell Partners.
 */
public class ThirdPartyMeasurementSettings  implements java.io.Serializable {
    /* A field to determine the type of ThirdPartyViewabilityIntegrationPartner.
     * This field default is
     *                 NONE. */
    private com.google.api.ads.admanager.axis.v202005.ThirdPartyViewabilityIntegrationPartner viewabilityPartner;

    /* The third party partner id for YouTube viewability verification. */
    private java.lang.String viewabilityClientId;

    /* The reporting id that maps viewability partner data with a
     * campaign (or a group of related
     *                 campaigns) specific data. */
    private java.lang.String viewabilityReportingId;

    /* A field to determine the type of advertiser's ThirdPartyReachIntegrationPartner.
     * This field
     *                 default is UNKNOWN. */
    private com.google.api.ads.admanager.axis.v202005.ThirdPartyReachIntegrationPartner reachPartner;

    /* The third party partner id for YouTube reach verification for
     * advertiser. */
    private java.lang.String reachClientId;

    /* The reporting id that maps reach partner data with a campaign
     * (or a group of related campaigns)
     *                 specific data for advertiser. */
    private java.lang.String reachReportingId;

    /* A field to determine the type of publisher's ThirdPartyReachIntegrationPartner.
     * This field
     *                 default is UNKNOWN. */
    private com.google.api.ads.admanager.axis.v202005.ThirdPartyReachIntegrationPartner publisherReachPartner;

    /* The third party partner id for YouTube reach verification for
     * publisher. */
    private java.lang.String publisherReachClientId;

    /* The reporting id that maps reach partner data with a campaign
     * (or a group of related campaigns)
     *                 specific data for publisher. */
    private java.lang.String publisherReachReportingId;

    public ThirdPartyMeasurementSettings() {
    }

    public ThirdPartyMeasurementSettings(
           com.google.api.ads.admanager.axis.v202005.ThirdPartyViewabilityIntegrationPartner viewabilityPartner,
           java.lang.String viewabilityClientId,
           java.lang.String viewabilityReportingId,
           com.google.api.ads.admanager.axis.v202005.ThirdPartyReachIntegrationPartner reachPartner,
           java.lang.String reachClientId,
           java.lang.String reachReportingId,
           com.google.api.ads.admanager.axis.v202005.ThirdPartyReachIntegrationPartner publisherReachPartner,
           java.lang.String publisherReachClientId,
           java.lang.String publisherReachReportingId) {
           this.viewabilityPartner = viewabilityPartner;
           this.viewabilityClientId = viewabilityClientId;
           this.viewabilityReportingId = viewabilityReportingId;
           this.reachPartner = reachPartner;
           this.reachClientId = reachClientId;
           this.reachReportingId = reachReportingId;
           this.publisherReachPartner = publisherReachPartner;
           this.publisherReachClientId = publisherReachClientId;
           this.publisherReachReportingId = publisherReachReportingId;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("publisherReachClientId", getPublisherReachClientId())
            .add("publisherReachPartner", getPublisherReachPartner())
            .add("publisherReachReportingId", getPublisherReachReportingId())
            .add("reachClientId", getReachClientId())
            .add("reachPartner", getReachPartner())
            .add("reachReportingId", getReachReportingId())
            .add("viewabilityClientId", getViewabilityClientId())
            .add("viewabilityPartner", getViewabilityPartner())
            .add("viewabilityReportingId", getViewabilityReportingId())
            .toString();
    }

    /**
     * Gets the viewabilityPartner value for this ThirdPartyMeasurementSettings.
     * 
     * @return viewabilityPartner   * A field to determine the type of ThirdPartyViewabilityIntegrationPartner.
     * This field default is
     *                 NONE.
     */
    public com.google.api.ads.admanager.axis.v202005.ThirdPartyViewabilityIntegrationPartner getViewabilityPartner() {
        return viewabilityPartner;
    }


    /**
     * Sets the viewabilityPartner value for this ThirdPartyMeasurementSettings.
     * 
     * @param viewabilityPartner   * A field to determine the type of ThirdPartyViewabilityIntegrationPartner.
     * This field default is
     *                 NONE.
     */
    public void setViewabilityPartner(com.google.api.ads.admanager.axis.v202005.ThirdPartyViewabilityIntegrationPartner viewabilityPartner) {
        this.viewabilityPartner = viewabilityPartner;
    }


    /**
     * Gets the viewabilityClientId value for this ThirdPartyMeasurementSettings.
     * 
     * @return viewabilityClientId   * The third party partner id for YouTube viewability verification.
     */
    public java.lang.String getViewabilityClientId() {
        return viewabilityClientId;
    }


    /**
     * Sets the viewabilityClientId value for this ThirdPartyMeasurementSettings.
     * 
     * @param viewabilityClientId   * The third party partner id for YouTube viewability verification.
     */
    public void setViewabilityClientId(java.lang.String viewabilityClientId) {
        this.viewabilityClientId = viewabilityClientId;
    }


    /**
     * Gets the viewabilityReportingId value for this ThirdPartyMeasurementSettings.
     * 
     * @return viewabilityReportingId   * The reporting id that maps viewability partner data with a
     * campaign (or a group of related
     *                 campaigns) specific data.
     */
    public java.lang.String getViewabilityReportingId() {
        return viewabilityReportingId;
    }


    /**
     * Sets the viewabilityReportingId value for this ThirdPartyMeasurementSettings.
     * 
     * @param viewabilityReportingId   * The reporting id that maps viewability partner data with a
     * campaign (or a group of related
     *                 campaigns) specific data.
     */
    public void setViewabilityReportingId(java.lang.String viewabilityReportingId) {
        this.viewabilityReportingId = viewabilityReportingId;
    }


    /**
     * Gets the reachPartner value for this ThirdPartyMeasurementSettings.
     * 
     * @return reachPartner   * A field to determine the type of advertiser's ThirdPartyReachIntegrationPartner.
     * This field
     *                 default is UNKNOWN.
     */
    public com.google.api.ads.admanager.axis.v202005.ThirdPartyReachIntegrationPartner getReachPartner() {
        return reachPartner;
    }


    /**
     * Sets the reachPartner value for this ThirdPartyMeasurementSettings.
     * 
     * @param reachPartner   * A field to determine the type of advertiser's ThirdPartyReachIntegrationPartner.
     * This field
     *                 default is UNKNOWN.
     */
    public void setReachPartner(com.google.api.ads.admanager.axis.v202005.ThirdPartyReachIntegrationPartner reachPartner) {
        this.reachPartner = reachPartner;
    }


    /**
     * Gets the reachClientId value for this ThirdPartyMeasurementSettings.
     * 
     * @return reachClientId   * The third party partner id for YouTube reach verification for
     * advertiser.
     */
    public java.lang.String getReachClientId() {
        return reachClientId;
    }


    /**
     * Sets the reachClientId value for this ThirdPartyMeasurementSettings.
     * 
     * @param reachClientId   * The third party partner id for YouTube reach verification for
     * advertiser.
     */
    public void setReachClientId(java.lang.String reachClientId) {
        this.reachClientId = reachClientId;
    }


    /**
     * Gets the reachReportingId value for this ThirdPartyMeasurementSettings.
     * 
     * @return reachReportingId   * The reporting id that maps reach partner data with a campaign
     * (or a group of related campaigns)
     *                 specific data for advertiser.
     */
    public java.lang.String getReachReportingId() {
        return reachReportingId;
    }


    /**
     * Sets the reachReportingId value for this ThirdPartyMeasurementSettings.
     * 
     * @param reachReportingId   * The reporting id that maps reach partner data with a campaign
     * (or a group of related campaigns)
     *                 specific data for advertiser.
     */
    public void setReachReportingId(java.lang.String reachReportingId) {
        this.reachReportingId = reachReportingId;
    }


    /**
     * Gets the publisherReachPartner value for this ThirdPartyMeasurementSettings.
     * 
     * @return publisherReachPartner   * A field to determine the type of publisher's ThirdPartyReachIntegrationPartner.
     * This field
     *                 default is UNKNOWN.
     */
    public com.google.api.ads.admanager.axis.v202005.ThirdPartyReachIntegrationPartner getPublisherReachPartner() {
        return publisherReachPartner;
    }


    /**
     * Sets the publisherReachPartner value for this ThirdPartyMeasurementSettings.
     * 
     * @param publisherReachPartner   * A field to determine the type of publisher's ThirdPartyReachIntegrationPartner.
     * This field
     *                 default is UNKNOWN.
     */
    public void setPublisherReachPartner(com.google.api.ads.admanager.axis.v202005.ThirdPartyReachIntegrationPartner publisherReachPartner) {
        this.publisherReachPartner = publisherReachPartner;
    }


    /**
     * Gets the publisherReachClientId value for this ThirdPartyMeasurementSettings.
     * 
     * @return publisherReachClientId   * The third party partner id for YouTube reach verification for
     * publisher.
     */
    public java.lang.String getPublisherReachClientId() {
        return publisherReachClientId;
    }


    /**
     * Sets the publisherReachClientId value for this ThirdPartyMeasurementSettings.
     * 
     * @param publisherReachClientId   * The third party partner id for YouTube reach verification for
     * publisher.
     */
    public void setPublisherReachClientId(java.lang.String publisherReachClientId) {
        this.publisherReachClientId = publisherReachClientId;
    }


    /**
     * Gets the publisherReachReportingId value for this ThirdPartyMeasurementSettings.
     * 
     * @return publisherReachReportingId   * The reporting id that maps reach partner data with a campaign
     * (or a group of related campaigns)
     *                 specific data for publisher.
     */
    public java.lang.String getPublisherReachReportingId() {
        return publisherReachReportingId;
    }


    /**
     * Sets the publisherReachReportingId value for this ThirdPartyMeasurementSettings.
     * 
     * @param publisherReachReportingId   * The reporting id that maps reach partner data with a campaign
     * (or a group of related campaigns)
     *                 specific data for publisher.
     */
    public void setPublisherReachReportingId(java.lang.String publisherReachReportingId) {
        this.publisherReachReportingId = publisherReachReportingId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ThirdPartyMeasurementSettings)) return false;
        ThirdPartyMeasurementSettings other = (ThirdPartyMeasurementSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.viewabilityPartner==null && other.getViewabilityPartner()==null) || 
             (this.viewabilityPartner!=null &&
              this.viewabilityPartner.equals(other.getViewabilityPartner()))) &&
            ((this.viewabilityClientId==null && other.getViewabilityClientId()==null) || 
             (this.viewabilityClientId!=null &&
              this.viewabilityClientId.equals(other.getViewabilityClientId()))) &&
            ((this.viewabilityReportingId==null && other.getViewabilityReportingId()==null) || 
             (this.viewabilityReportingId!=null &&
              this.viewabilityReportingId.equals(other.getViewabilityReportingId()))) &&
            ((this.reachPartner==null && other.getReachPartner()==null) || 
             (this.reachPartner!=null &&
              this.reachPartner.equals(other.getReachPartner()))) &&
            ((this.reachClientId==null && other.getReachClientId()==null) || 
             (this.reachClientId!=null &&
              this.reachClientId.equals(other.getReachClientId()))) &&
            ((this.reachReportingId==null && other.getReachReportingId()==null) || 
             (this.reachReportingId!=null &&
              this.reachReportingId.equals(other.getReachReportingId()))) &&
            ((this.publisherReachPartner==null && other.getPublisherReachPartner()==null) || 
             (this.publisherReachPartner!=null &&
              this.publisherReachPartner.equals(other.getPublisherReachPartner()))) &&
            ((this.publisherReachClientId==null && other.getPublisherReachClientId()==null) || 
             (this.publisherReachClientId!=null &&
              this.publisherReachClientId.equals(other.getPublisherReachClientId()))) &&
            ((this.publisherReachReportingId==null && other.getPublisherReachReportingId()==null) || 
             (this.publisherReachReportingId!=null &&
              this.publisherReachReportingId.equals(other.getPublisherReachReportingId())));
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
        if (getViewabilityPartner() != null) {
            _hashCode += getViewabilityPartner().hashCode();
        }
        if (getViewabilityClientId() != null) {
            _hashCode += getViewabilityClientId().hashCode();
        }
        if (getViewabilityReportingId() != null) {
            _hashCode += getViewabilityReportingId().hashCode();
        }
        if (getReachPartner() != null) {
            _hashCode += getReachPartner().hashCode();
        }
        if (getReachClientId() != null) {
            _hashCode += getReachClientId().hashCode();
        }
        if (getReachReportingId() != null) {
            _hashCode += getReachReportingId().hashCode();
        }
        if (getPublisherReachPartner() != null) {
            _hashCode += getPublisherReachPartner().hashCode();
        }
        if (getPublisherReachClientId() != null) {
            _hashCode += getPublisherReachClientId().hashCode();
        }
        if (getPublisherReachReportingId() != null) {
            _hashCode += getPublisherReachReportingId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ThirdPartyMeasurementSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "ThirdPartyMeasurementSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewabilityPartner");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "viewabilityPartner"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "ThirdPartyViewabilityIntegrationPartner"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewabilityClientId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "viewabilityClientId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewabilityReportingId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "viewabilityReportingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reachPartner");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "reachPartner"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "ThirdPartyReachIntegrationPartner"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reachClientId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "reachClientId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reachReportingId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "reachReportingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publisherReachPartner");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "publisherReachPartner"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "ThirdPartyReachIntegrationPartner"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publisherReachClientId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "publisherReachClientId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publisherReachReportingId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "publisherReachReportingId"));
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
