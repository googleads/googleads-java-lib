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
 * VideoPosition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Represents a targetable position within a video. A video ad can
 * be targeted
 *             to a position (pre-roll, all mid-rolls, or post-roll),
 * or to a specific mid-roll index.
 */
public class VideoPosition  implements java.io.Serializable {
    /* The type of video position (pre-roll, mid-roll, or post-roll). */
    private com.google.api.ads.dfp.axis.v201802.VideoPositionType positionType;

    /* The index of the mid-roll to target.  Only valid if the {@link
     * positionType} is
     *                 {@link VideoPositionType#MIDROLL}, otherwise this
     * field will be ignored. */
    private java.lang.Integer midrollIndex;

    public VideoPosition() {
    }

    public VideoPosition(
           com.google.api.ads.dfp.axis.v201802.VideoPositionType positionType,
           java.lang.Integer midrollIndex) {
           this.positionType = positionType;
           this.midrollIndex = midrollIndex;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("midrollIndex", getMidrollIndex())
            .add("positionType", getPositionType())
            .toString();
    }

    /**
     * Gets the positionType value for this VideoPosition.
     * 
     * @return positionType   * The type of video position (pre-roll, mid-roll, or post-roll).
     */
    public com.google.api.ads.dfp.axis.v201802.VideoPositionType getPositionType() {
        return positionType;
    }


    /**
     * Sets the positionType value for this VideoPosition.
     * 
     * @param positionType   * The type of video position (pre-roll, mid-roll, or post-roll).
     */
    public void setPositionType(com.google.api.ads.dfp.axis.v201802.VideoPositionType positionType) {
        this.positionType = positionType;
    }


    /**
     * Gets the midrollIndex value for this VideoPosition.
     * 
     * @return midrollIndex   * The index of the mid-roll to target.  Only valid if the {@link
     * positionType} is
     *                 {@link VideoPositionType#MIDROLL}, otherwise this
     * field will be ignored.
     */
    public java.lang.Integer getMidrollIndex() {
        return midrollIndex;
    }


    /**
     * Sets the midrollIndex value for this VideoPosition.
     * 
     * @param midrollIndex   * The index of the mid-roll to target.  Only valid if the {@link
     * positionType} is
     *                 {@link VideoPositionType#MIDROLL}, otherwise this
     * field will be ignored.
     */
    public void setMidrollIndex(java.lang.Integer midrollIndex) {
        this.midrollIndex = midrollIndex;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VideoPosition)) return false;
        VideoPosition other = (VideoPosition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.positionType==null && other.getPositionType()==null) || 
             (this.positionType!=null &&
              this.positionType.equals(other.getPositionType()))) &&
            ((this.midrollIndex==null && other.getMidrollIndex()==null) || 
             (this.midrollIndex!=null &&
              this.midrollIndex.equals(other.getMidrollIndex())));
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
        if (getPositionType() != null) {
            _hashCode += getPositionType().hashCode();
        }
        if (getMidrollIndex() != null) {
            _hashCode += getMidrollIndex().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VideoPosition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "VideoPosition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("positionType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "positionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "VideoPosition.Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("midrollIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "midrollIndex"));
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
