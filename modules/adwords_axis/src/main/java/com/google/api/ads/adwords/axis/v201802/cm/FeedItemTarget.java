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
 * FeedItemTarget.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents one target for a FeedItem.
 */
public abstract class FeedItemTarget  implements java.io.Serializable {
    /* ID of the target feed item's feed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "FeedId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.Long feedId;

    /* ID of the target's feed item.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "FeedItemId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.Long feedItemId;

    /* Concrete subtype of FeedItemTarget.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "TargetType".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.FeedItemTargetType targetType;

    /* Status of feed item target.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.FeedItemTargetStatus status;

    /* Indicates that this instance is a subtype of FeedItemTarget.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String feedItemTargetType;

    public FeedItemTarget() {
    }

    public FeedItemTarget(
           java.lang.Long feedId,
           java.lang.Long feedItemId,
           com.google.api.ads.adwords.axis.v201802.cm.FeedItemTargetType targetType,
           com.google.api.ads.adwords.axis.v201802.cm.FeedItemTargetStatus status,
           java.lang.String feedItemTargetType) {
           this.feedId = feedId;
           this.feedItemId = feedItemId;
           this.targetType = targetType;
           this.status = status;
           this.feedItemTargetType = feedItemTargetType;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("feedId", getFeedId())
            .add("feedItemId", getFeedItemId())
            .add("feedItemTargetType", getFeedItemTargetType())
            .add("status", getStatus())
            .add("targetType", getTargetType())
            .toString();
    }

    /**
     * Gets the feedId value for this FeedItemTarget.
     * 
     * @return feedId   * ID of the target feed item's feed.
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
     * Sets the feedId value for this FeedItemTarget.
     * 
     * @param feedId   * ID of the target feed item's feed.
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
     * Gets the feedItemId value for this FeedItemTarget.
     * 
     * @return feedItemId   * ID of the target's feed item.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "FeedItemId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.Long getFeedItemId() {
        return feedItemId;
    }


    /**
     * Sets the feedItemId value for this FeedItemTarget.
     * 
     * @param feedItemId   * ID of the target's feed item.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "FeedItemId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setFeedItemId(java.lang.Long feedItemId) {
        this.feedItemId = feedItemId;
    }


    /**
     * Gets the targetType value for this FeedItemTarget.
     * 
     * @return targetType   * Concrete subtype of FeedItemTarget.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "TargetType".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.FeedItemTargetType getTargetType() {
        return targetType;
    }


    /**
     * Sets the targetType value for this FeedItemTarget.
     * 
     * @param targetType   * Concrete subtype of FeedItemTarget.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "TargetType".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setTargetType(com.google.api.ads.adwords.axis.v201802.cm.FeedItemTargetType targetType) {
        this.targetType = targetType;
    }


    /**
     * Gets the status value for this FeedItemTarget.
     * 
     * @return status   * Status of feed item target.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.FeedItemTargetStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this FeedItemTarget.
     * 
     * @param status   * Status of feed item target.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setStatus(com.google.api.ads.adwords.axis.v201802.cm.FeedItemTargetStatus status) {
        this.status = status;
    }


    /**
     * Gets the feedItemTargetType value for this FeedItemTarget.
     * 
     * @return feedItemTargetType   * Indicates that this instance is a subtype of FeedItemTarget.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getFeedItemTargetType() {
        return feedItemTargetType;
    }


    /**
     * Sets the feedItemTargetType value for this FeedItemTarget.
     * 
     * @param feedItemTargetType   * Indicates that this instance is a subtype of FeedItemTarget.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setFeedItemTargetType(java.lang.String feedItemTargetType) {
        this.feedItemTargetType = feedItemTargetType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeedItemTarget)) return false;
        FeedItemTarget other = (FeedItemTarget) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.feedId==null && other.getFeedId()==null) || 
             (this.feedId!=null &&
              this.feedId.equals(other.getFeedId()))) &&
            ((this.feedItemId==null && other.getFeedItemId()==null) || 
             (this.feedItemId!=null &&
              this.feedItemId.equals(other.getFeedItemId()))) &&
            ((this.targetType==null && other.getTargetType()==null) || 
             (this.targetType!=null &&
              this.targetType.equals(other.getTargetType()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.feedItemTargetType==null && other.getFeedItemTargetType()==null) || 
             (this.feedItemTargetType!=null &&
              this.feedItemTargetType.equals(other.getFeedItemTargetType())));
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
        if (getFeedId() != null) {
            _hashCode += getFeedId().hashCode();
        }
        if (getFeedItemId() != null) {
            _hashCode += getFeedItemId().hashCode();
        }
        if (getTargetType() != null) {
            _hashCode += getTargetType().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getFeedItemTargetType() != null) {
            _hashCode += getFeedItemTargetType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeedItemTarget.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemTarget"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "feedId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "feedItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "targetType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemTargetType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemTargetStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedItemTargetType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemTarget.Type"));
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
