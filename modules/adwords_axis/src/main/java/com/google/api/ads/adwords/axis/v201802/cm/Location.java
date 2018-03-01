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
 * Location.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents Location criterion.
 *             <p>A criterion of this type can only be created using
 * an ID.
 *             <span class="constraint AdxEnabled">This is enabled for
 * AdX.</span>
 */
public class Location  extends com.google.api.ads.adwords.axis.v201802.cm.Criterion  implements java.io.Serializable {
    /* Name of the location criterion. <b> Note:</b> This field is
     * filterable only in
     *                     LocationCriterionService. If used as a filter,
     * a location name cannot be greater than 300
     *                     characters.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private java.lang.String locationName;

    /* Display type of the location criterion.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private java.lang.String displayType;

    /* The targeting status of the location criterion.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.LocationTargetingStatus targetingStatus;

    /* Ordered list of parents of the location criterion.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.Location[] parentLocations;

    public Location() {
    }

    public Location(
           java.lang.Long id,
           com.google.api.ads.adwords.axis.v201802.cm.CriterionType type,
           java.lang.String criterionType,
           java.lang.String locationName,
           java.lang.String displayType,
           com.google.api.ads.adwords.axis.v201802.cm.LocationTargetingStatus targetingStatus,
           com.google.api.ads.adwords.axis.v201802.cm.Location[] parentLocations) {
        super(
            id,
            type,
            criterionType);
        this.locationName = locationName;
        this.displayType = displayType;
        this.targetingStatus = targetingStatus;
        this.parentLocations = parentLocations;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("criterionType", getCriterionType())
            .add("displayType", getDisplayType())
            .add("id", getId())
            .add("locationName", getLocationName())
            .add("parentLocations", getParentLocations())
            .add("targetingStatus", getTargetingStatus())
            .add("type", getType())
            .toString();
    }

    /**
     * Gets the locationName value for this Location.
     * 
     * @return locationName   * Name of the location criterion. <b> Note:</b> This field is
     * filterable only in
     *                     LocationCriterionService. If used as a filter,
     * a location name cannot be greater than 300
     *                     characters.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getLocationName() {
        return locationName;
    }


    /**
     * Sets the locationName value for this Location.
     * 
     * @param locationName   * Name of the location criterion. <b> Note:</b> This field is
     * filterable only in
     *                     LocationCriterionService. If used as a filter,
     * a location name cannot be greater than 300
     *                     characters.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setLocationName(java.lang.String locationName) {
        this.locationName = locationName;
    }


    /**
     * Gets the displayType value for this Location.
     * 
     * @return displayType   * Display type of the location criterion.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getDisplayType() {
        return displayType;
    }


    /**
     * Sets the displayType value for this Location.
     * 
     * @param displayType   * Display type of the location criterion.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setDisplayType(java.lang.String displayType) {
        this.displayType = displayType;
    }


    /**
     * Gets the targetingStatus value for this Location.
     * 
     * @return targetingStatus   * The targeting status of the location criterion.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.LocationTargetingStatus getTargetingStatus() {
        return targetingStatus;
    }


    /**
     * Sets the targetingStatus value for this Location.
     * 
     * @param targetingStatus   * The targeting status of the location criterion.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setTargetingStatus(com.google.api.ads.adwords.axis.v201802.cm.LocationTargetingStatus targetingStatus) {
        this.targetingStatus = targetingStatus;
    }


    /**
     * Gets the parentLocations value for this Location.
     * 
     * @return parentLocations   * Ordered list of parents of the location criterion.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Location[] getParentLocations() {
        return parentLocations;
    }


    /**
     * Sets the parentLocations value for this Location.
     * 
     * @param parentLocations   * Ordered list of parents of the location criterion.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setParentLocations(com.google.api.ads.adwords.axis.v201802.cm.Location[] parentLocations) {
        this.parentLocations = parentLocations;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.Location getParentLocations(int i) {
        return this.parentLocations[i];
    }

    public void setParentLocations(int i, com.google.api.ads.adwords.axis.v201802.cm.Location _value) {
        this.parentLocations[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Location)) return false;
        Location other = (Location) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.locationName==null && other.getLocationName()==null) || 
             (this.locationName!=null &&
              this.locationName.equals(other.getLocationName()))) &&
            ((this.displayType==null && other.getDisplayType()==null) || 
             (this.displayType!=null &&
              this.displayType.equals(other.getDisplayType()))) &&
            ((this.targetingStatus==null && other.getTargetingStatus()==null) || 
             (this.targetingStatus!=null &&
              this.targetingStatus.equals(other.getTargetingStatus()))) &&
            ((this.parentLocations==null && other.getParentLocations()==null) || 
             (this.parentLocations!=null &&
              java.util.Arrays.equals(this.parentLocations, other.getParentLocations())));
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
        if (getLocationName() != null) {
            _hashCode += getLocationName().hashCode();
        }
        if (getDisplayType() != null) {
            _hashCode += getDisplayType().hashCode();
        }
        if (getTargetingStatus() != null) {
            _hashCode += getTargetingStatus().hashCode();
        }
        if (getParentLocations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParentLocations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParentLocations(), i);
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
        new org.apache.axis.description.TypeDesc(Location.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Location"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "locationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "displayType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "targetingStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "LocationTargetingStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentLocations");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "parentLocations"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Location"));
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
