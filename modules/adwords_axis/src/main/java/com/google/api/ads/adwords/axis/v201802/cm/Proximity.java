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
 * Proximity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents a Proximity Criterion.
 *             
 *             A proximity is an area within a certain radius of a point
 * with the center point being described
 *             by a lat/long pair. The caller may also alternatively
 * provide address fields which will be
 *             geocoded into a lat/long pair. Note: If a geoPoint value
 * is provided, the address is not
 *             used for calculating the lat/long to target.
 *             <p>
 *             <span class="constraint AdxEnabled">This is enabled for
 * AdX.</span>
 */
public class Proximity  extends com.google.api.ads.adwords.axis.v201802.cm.Criterion  implements java.io.Serializable {
    /* Latitude and longitude. */
    private com.google.api.ads.adwords.axis.v201802.cm.GeoPoint geoPoint;

    /* Radius distance units.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.ProximityDistanceUnits radiusDistanceUnits;

    /* Radius expressed in distance units.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private java.lang.Double radiusInUnits;

    /* Full address; <code>null</code> if unknonwn. */
    private com.google.api.ads.adwords.axis.v201802.cm.Address address;

    public Proximity() {
    }

    public Proximity(
           java.lang.Long id,
           com.google.api.ads.adwords.axis.v201802.cm.CriterionType type,
           java.lang.String criterionType,
           com.google.api.ads.adwords.axis.v201802.cm.GeoPoint geoPoint,
           com.google.api.ads.adwords.axis.v201802.cm.ProximityDistanceUnits radiusDistanceUnits,
           java.lang.Double radiusInUnits,
           com.google.api.ads.adwords.axis.v201802.cm.Address address) {
        super(
            id,
            type,
            criterionType);
        this.geoPoint = geoPoint;
        this.radiusDistanceUnits = radiusDistanceUnits;
        this.radiusInUnits = radiusInUnits;
        this.address = address;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("address", getAddress())
            .add("criterionType", getCriterionType())
            .add("geoPoint", getGeoPoint())
            .add("id", getId())
            .add("radiusDistanceUnits", getRadiusDistanceUnits())
            .add("radiusInUnits", getRadiusInUnits())
            .add("type", getType())
            .toString();
    }

    /**
     * Gets the geoPoint value for this Proximity.
     * 
     * @return geoPoint   * Latitude and longitude.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.GeoPoint getGeoPoint() {
        return geoPoint;
    }


    /**
     * Sets the geoPoint value for this Proximity.
     * 
     * @param geoPoint   * Latitude and longitude.
     */
    public void setGeoPoint(com.google.api.ads.adwords.axis.v201802.cm.GeoPoint geoPoint) {
        this.geoPoint = geoPoint;
    }


    /**
     * Gets the radiusDistanceUnits value for this Proximity.
     * 
     * @return radiusDistanceUnits   * Radius distance units.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.ProximityDistanceUnits getRadiusDistanceUnits() {
        return radiusDistanceUnits;
    }


    /**
     * Sets the radiusDistanceUnits value for this Proximity.
     * 
     * @param radiusDistanceUnits   * Radius distance units.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setRadiusDistanceUnits(com.google.api.ads.adwords.axis.v201802.cm.ProximityDistanceUnits radiusDistanceUnits) {
        this.radiusDistanceUnits = radiusDistanceUnits;
    }


    /**
     * Gets the radiusInUnits value for this Proximity.
     * 
     * @return radiusInUnits   * Radius expressed in distance units.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public java.lang.Double getRadiusInUnits() {
        return radiusInUnits;
    }


    /**
     * Sets the radiusInUnits value for this Proximity.
     * 
     * @param radiusInUnits   * Radius expressed in distance units.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setRadiusInUnits(java.lang.Double radiusInUnits) {
        this.radiusInUnits = radiusInUnits;
    }


    /**
     * Gets the address value for this Proximity.
     * 
     * @return address   * Full address; <code>null</code> if unknonwn.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Address getAddress() {
        return address;
    }


    /**
     * Sets the address value for this Proximity.
     * 
     * @param address   * Full address; <code>null</code> if unknonwn.
     */
    public void setAddress(com.google.api.ads.adwords.axis.v201802.cm.Address address) {
        this.address = address;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Proximity)) return false;
        Proximity other = (Proximity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.geoPoint==null && other.getGeoPoint()==null) || 
             (this.geoPoint!=null &&
              this.geoPoint.equals(other.getGeoPoint()))) &&
            ((this.radiusDistanceUnits==null && other.getRadiusDistanceUnits()==null) || 
             (this.radiusDistanceUnits!=null &&
              this.radiusDistanceUnits.equals(other.getRadiusDistanceUnits()))) &&
            ((this.radiusInUnits==null && other.getRadiusInUnits()==null) || 
             (this.radiusInUnits!=null &&
              this.radiusInUnits.equals(other.getRadiusInUnits()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress())));
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
        if (getGeoPoint() != null) {
            _hashCode += getGeoPoint().hashCode();
        }
        if (getRadiusDistanceUnits() != null) {
            _hashCode += getRadiusDistanceUnits().hashCode();
        }
        if (getRadiusInUnits() != null) {
            _hashCode += getRadiusInUnits().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Proximity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Proximity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geoPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "geoPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "GeoPoint"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radiusDistanceUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "radiusDistanceUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Proximity.DistanceUnits"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radiusInUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "radiusInUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Address"));
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
