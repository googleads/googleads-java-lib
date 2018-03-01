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
 * QualityInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Container for criterion quality information.
 */
public class QualityInfo  implements java.io.Serializable {
    /* The keyword quality score ranges from 1 (lowest) to 10 (highest).
     * <p>If there aren't enough impressions or clicks to determine an appropriate
     * quality score value, the QualityInfo object is not returned. For reports,
     * this field will return null (designated by "--"). */
    private java.lang.Integer qualityScore;

    public QualityInfo() {
    }

    public QualityInfo(
           java.lang.Integer qualityScore) {
           this.qualityScore = qualityScore;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("qualityScore", getQualityScore())
            .toString();
    }

    /**
     * Gets the qualityScore value for this QualityInfo.
     * 
     * @return qualityScore   * The keyword quality score ranges from 1 (lowest) to 10 (highest).
     * <p>If there aren't enough impressions or clicks to determine an appropriate
     * quality score value, the QualityInfo object is not returned. For reports,
     * this field will return null (designated by "--").
     */
    public java.lang.Integer getQualityScore() {
        return qualityScore;
    }


    /**
     * Sets the qualityScore value for this QualityInfo.
     * 
     * @param qualityScore   * The keyword quality score ranges from 1 (lowest) to 10 (highest).
     * <p>If there aren't enough impressions or clicks to determine an appropriate
     * quality score value, the QualityInfo object is not returned. For reports,
     * this field will return null (designated by "--").
     */
    public void setQualityScore(java.lang.Integer qualityScore) {
        this.qualityScore = qualityScore;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QualityInfo)) return false;
        QualityInfo other = (QualityInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.qualityScore==null && other.getQualityScore()==null) || 
             (this.qualityScore!=null &&
              this.qualityScore.equals(other.getQualityScore())));
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
        if (getQualityScore() != null) {
            _hashCode += getQualityScore().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QualityInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "QualityInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qualityScore");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "qualityScore"));
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
