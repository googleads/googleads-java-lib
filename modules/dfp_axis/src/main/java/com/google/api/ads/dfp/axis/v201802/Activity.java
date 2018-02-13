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
 * Activity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * <p>An activity is a specific user action that an advertiser wants
 * to track, such as the
 *             completion of a purchase or a visit to a webpage. You
 * create and manage activities in DFP. When
 *             a user performs the action after seeing an advertiser's
 * ad, that's a conversion.</p>
 *             
 *             <p>For example, you set up an activity in DFP to track
 * how many users visit an advertiser's
 *             promotional website after viewing or clicking on an ad.
 * When a user views an ad, then visits the
 *             page, that's one conversion.</p>
 */
public class Activity  implements java.io.Serializable {
    /* The unique ID of the {@code Activity}. This value is readonly
     * and is assigned
     *                 by Google. */
    private java.lang.Integer id;

    /* The ID of the {@link ActivityGroup} that this {@link Activity}
     * belongs to. */
    private java.lang.Integer activityGroupId;

    /* The name of the {@code Activity}. This attribute is required
     * and has a maximum length of 255
     *                 characters. */
    private java.lang.String name;

    /* The URL of the webpage where the tags from this activity will
     * be placed. This attribute is
     *                 optional. */
    private java.lang.String expectedURL;

    /* The status of this activity. This attribute is readonly. */
    private com.google.api.ads.dfp.axis.v201802.ActivityStatus status;

    /* The activity type. This attribute is optional and defaults
     * to {@link Activity.Type#PAGE_VIEWS} */
    private com.google.api.ads.dfp.axis.v201802.ActivityType type;

    public Activity() {
    }

    public Activity(
           java.lang.Integer id,
           java.lang.Integer activityGroupId,
           java.lang.String name,
           java.lang.String expectedURL,
           com.google.api.ads.dfp.axis.v201802.ActivityStatus status,
           com.google.api.ads.dfp.axis.v201802.ActivityType type) {
           this.id = id;
           this.activityGroupId = activityGroupId;
           this.name = name;
           this.expectedURL = expectedURL;
           this.status = status;
           this.type = type;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("activityGroupId", getActivityGroupId())
            .add("expectedURL", getExpectedURL())
            .add("id", getId())
            .add("name", getName())
            .add("status", getStatus())
            .add("type", getType())
            .toString();
    }

    /**
     * Gets the id value for this Activity.
     * 
     * @return id   * The unique ID of the {@code Activity}. This value is readonly
     * and is assigned
     *                 by Google.
     */
    public java.lang.Integer getId() {
        return id;
    }


    /**
     * Sets the id value for this Activity.
     * 
     * @param id   * The unique ID of the {@code Activity}. This value is readonly
     * and is assigned
     *                 by Google.
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }


    /**
     * Gets the activityGroupId value for this Activity.
     * 
     * @return activityGroupId   * The ID of the {@link ActivityGroup} that this {@link Activity}
     * belongs to.
     */
    public java.lang.Integer getActivityGroupId() {
        return activityGroupId;
    }


    /**
     * Sets the activityGroupId value for this Activity.
     * 
     * @param activityGroupId   * The ID of the {@link ActivityGroup} that this {@link Activity}
     * belongs to.
     */
    public void setActivityGroupId(java.lang.Integer activityGroupId) {
        this.activityGroupId = activityGroupId;
    }


    /**
     * Gets the name value for this Activity.
     * 
     * @return name   * The name of the {@code Activity}. This attribute is required
     * and has a maximum length of 255
     *                 characters.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Activity.
     * 
     * @param name   * The name of the {@code Activity}. This attribute is required
     * and has a maximum length of 255
     *                 characters.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the expectedURL value for this Activity.
     * 
     * @return expectedURL   * The URL of the webpage where the tags from this activity will
     * be placed. This attribute is
     *                 optional.
     */
    public java.lang.String getExpectedURL() {
        return expectedURL;
    }


    /**
     * Sets the expectedURL value for this Activity.
     * 
     * @param expectedURL   * The URL of the webpage where the tags from this activity will
     * be placed. This attribute is
     *                 optional.
     */
    public void setExpectedURL(java.lang.String expectedURL) {
        this.expectedURL = expectedURL;
    }


    /**
     * Gets the status value for this Activity.
     * 
     * @return status   * The status of this activity. This attribute is readonly.
     */
    public com.google.api.ads.dfp.axis.v201802.ActivityStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Activity.
     * 
     * @param status   * The status of this activity. This attribute is readonly.
     */
    public void setStatus(com.google.api.ads.dfp.axis.v201802.ActivityStatus status) {
        this.status = status;
    }


    /**
     * Gets the type value for this Activity.
     * 
     * @return type   * The activity type. This attribute is optional and defaults
     * to {@link Activity.Type#PAGE_VIEWS}
     */
    public com.google.api.ads.dfp.axis.v201802.ActivityType getType() {
        return type;
    }


    /**
     * Sets the type value for this Activity.
     * 
     * @param type   * The activity type. This attribute is optional and defaults
     * to {@link Activity.Type#PAGE_VIEWS}
     */
    public void setType(com.google.api.ads.dfp.axis.v201802.ActivityType type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Activity)) return false;
        Activity other = (Activity) obj;
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
            ((this.activityGroupId==null && other.getActivityGroupId()==null) || 
             (this.activityGroupId!=null &&
              this.activityGroupId.equals(other.getActivityGroupId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.expectedURL==null && other.getExpectedURL()==null) || 
             (this.expectedURL!=null &&
              this.expectedURL.equals(other.getExpectedURL()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getActivityGroupId() != null) {
            _hashCode += getActivityGroupId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getExpectedURL() != null) {
            _hashCode += getExpectedURL().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Activity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Activity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "activityGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("expectedURL");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "expectedURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Activity.Status"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Activity.Type"));
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
