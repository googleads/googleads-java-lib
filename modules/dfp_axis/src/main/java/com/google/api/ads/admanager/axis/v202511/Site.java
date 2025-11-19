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
 * Site.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202511;


/**
 * A {@code Site} represents a domain owned or represented by a network.
 * For a parent network
 *             managing other networks as part of Multiple Customer Management
 * "Manage Inventory" model, it
 *             could be the child's site.
 */
public class Site  implements java.io.Serializable {
    /* Uniquely identifies the {@code Site}. This value is read-only
     * and is assigned by Google when
     *                 the site is created. */
    private java.lang.Long id;

    /* The URL of the {@code Site}. */
    private java.lang.String url;

    /* The {@link Network#networkCode} of the child if the {@code
     * Site} is being managed for an MCM
     *                 child network, or null if owned by this network. */
    private java.lang.String childNetworkCode;

    /* Status of the review performed on the {@code Site} by Google.
     * This field is read-only and is
     *                 assigned by Google. */
    private com.google.api.ads.admanager.axis.v202511.ApprovalStatus approvalStatus;

    /* The latest site approval status change time. */
    private com.google.api.ads.admanager.axis.v202511.DateTime approvalStatusUpdateTime;

    /* Provides reasons for disapproving the site. It is {@code null}
     * when the {@code Site} is not
     *                 disapproved. This is field is read-only and is assigned
     * by Google. */
    private com.google.api.ads.admanager.axis.v202511.DisapprovalReason[] disapprovalReasons;

    public Site() {
    }

    public Site(
           java.lang.Long id,
           java.lang.String url,
           java.lang.String childNetworkCode,
           com.google.api.ads.admanager.axis.v202511.ApprovalStatus approvalStatus,
           com.google.api.ads.admanager.axis.v202511.DateTime approvalStatusUpdateTime,
           com.google.api.ads.admanager.axis.v202511.DisapprovalReason[] disapprovalReasons) {
           this.id = id;
           this.url = url;
           this.childNetworkCode = childNetworkCode;
           this.approvalStatus = approvalStatus;
           this.approvalStatusUpdateTime = approvalStatusUpdateTime;
           this.disapprovalReasons = disapprovalReasons;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("approvalStatus", getApprovalStatus())
            .add("approvalStatusUpdateTime", getApprovalStatusUpdateTime())
            .add("childNetworkCode", getChildNetworkCode())
            .add("disapprovalReasons", getDisapprovalReasons())
            .add("id", getId())
            .add("url", getUrl())
            .toString();
    }

    /**
     * Gets the id value for this Site.
     * 
     * @return id   * Uniquely identifies the {@code Site}. This value is read-only
     * and is assigned by Google when
     *                 the site is created.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Site.
     * 
     * @param id   * Uniquely identifies the {@code Site}. This value is read-only
     * and is assigned by Google when
     *                 the site is created.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the url value for this Site.
     * 
     * @return url   * The URL of the {@code Site}.
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this Site.
     * 
     * @param url   * The URL of the {@code Site}.
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the childNetworkCode value for this Site.
     * 
     * @return childNetworkCode   * The {@link Network#networkCode} of the child if the {@code
     * Site} is being managed for an MCM
     *                 child network, or null if owned by this network.
     */
    public java.lang.String getChildNetworkCode() {
        return childNetworkCode;
    }


    /**
     * Sets the childNetworkCode value for this Site.
     * 
     * @param childNetworkCode   * The {@link Network#networkCode} of the child if the {@code
     * Site} is being managed for an MCM
     *                 child network, or null if owned by this network.
     */
    public void setChildNetworkCode(java.lang.String childNetworkCode) {
        this.childNetworkCode = childNetworkCode;
    }


    /**
     * Gets the approvalStatus value for this Site.
     * 
     * @return approvalStatus   * Status of the review performed on the {@code Site} by Google.
     * This field is read-only and is
     *                 assigned by Google.
     */
    public com.google.api.ads.admanager.axis.v202511.ApprovalStatus getApprovalStatus() {
        return approvalStatus;
    }


    /**
     * Sets the approvalStatus value for this Site.
     * 
     * @param approvalStatus   * Status of the review performed on the {@code Site} by Google.
     * This field is read-only and is
     *                 assigned by Google.
     */
    public void setApprovalStatus(com.google.api.ads.admanager.axis.v202511.ApprovalStatus approvalStatus) {
        this.approvalStatus = approvalStatus;
    }


    /**
     * Gets the approvalStatusUpdateTime value for this Site.
     * 
     * @return approvalStatusUpdateTime   * The latest site approval status change time.
     */
    public com.google.api.ads.admanager.axis.v202511.DateTime getApprovalStatusUpdateTime() {
        return approvalStatusUpdateTime;
    }


    /**
     * Sets the approvalStatusUpdateTime value for this Site.
     * 
     * @param approvalStatusUpdateTime   * The latest site approval status change time.
     */
    public void setApprovalStatusUpdateTime(com.google.api.ads.admanager.axis.v202511.DateTime approvalStatusUpdateTime) {
        this.approvalStatusUpdateTime = approvalStatusUpdateTime;
    }


    /**
     * Gets the disapprovalReasons value for this Site.
     * 
     * @return disapprovalReasons   * Provides reasons for disapproving the site. It is {@code null}
     * when the {@code Site} is not
     *                 disapproved. This is field is read-only and is assigned
     * by Google.
     */
    public com.google.api.ads.admanager.axis.v202511.DisapprovalReason[] getDisapprovalReasons() {
        return disapprovalReasons;
    }


    /**
     * Sets the disapprovalReasons value for this Site.
     * 
     * @param disapprovalReasons   * Provides reasons for disapproving the site. It is {@code null}
     * when the {@code Site} is not
     *                 disapproved. This is field is read-only and is assigned
     * by Google.
     */
    public void setDisapprovalReasons(com.google.api.ads.admanager.axis.v202511.DisapprovalReason[] disapprovalReasons) {
        this.disapprovalReasons = disapprovalReasons;
    }

    public com.google.api.ads.admanager.axis.v202511.DisapprovalReason getDisapprovalReasons(int i) {
        return this.disapprovalReasons[i];
    }

    public void setDisapprovalReasons(int i, com.google.api.ads.admanager.axis.v202511.DisapprovalReason _value) {
        this.disapprovalReasons[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Site)) return false;
        Site other = (Site) obj;
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
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.childNetworkCode==null && other.getChildNetworkCode()==null) || 
             (this.childNetworkCode!=null &&
              this.childNetworkCode.equals(other.getChildNetworkCode()))) &&
            ((this.approvalStatus==null && other.getApprovalStatus()==null) || 
             (this.approvalStatus!=null &&
              this.approvalStatus.equals(other.getApprovalStatus()))) &&
            ((this.approvalStatusUpdateTime==null && other.getApprovalStatusUpdateTime()==null) || 
             (this.approvalStatusUpdateTime!=null &&
              this.approvalStatusUpdateTime.equals(other.getApprovalStatusUpdateTime()))) &&
            ((this.disapprovalReasons==null && other.getDisapprovalReasons()==null) || 
             (this.disapprovalReasons!=null &&
              java.util.Arrays.equals(this.disapprovalReasons, other.getDisapprovalReasons())));
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
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getChildNetworkCode() != null) {
            _hashCode += getChildNetworkCode().hashCode();
        }
        if (getApprovalStatus() != null) {
            _hashCode += getApprovalStatus().hashCode();
        }
        if (getApprovalStatusUpdateTime() != null) {
            _hashCode += getApprovalStatusUpdateTime().hashCode();
        }
        if (getDisapprovalReasons() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDisapprovalReasons());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDisapprovalReasons(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Site.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202511", "Site"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202511", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202511", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childNetworkCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202511", "childNetworkCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202511", "approvalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202511", "ApprovalStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalStatusUpdateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202511", "approvalStatusUpdateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202511", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disapprovalReasons");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202511", "disapprovalReasons"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202511", "DisapprovalReason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
