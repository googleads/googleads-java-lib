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
 * SavedQuery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * A saved {@link ReportQuery} representing the selection criteria
 * for running a report.
 */
public class SavedQuery  implements java.io.Serializable {
    /* The ID of the saved query. */
    private java.lang.Long id;

    /* The name of the saved query. */
    private java.lang.String name;

    /* The {@link ReportQuery} representing the selection criteria
     * for the saved query.
     *                 This will be non-null if and only if {@link SavedQuery#isCompatibleWithApiVersion}
     * is
     *                 {@code true}. */
    private com.google.api.ads.dfp.axis.v201802.ReportQuery reportQuery;

    /* Whether or not the saved query is compatible with the current
     * API version.
     *                 This will be {@code true} if and only if {@link SavedQuery#reportQuery}
     * is non-null.
     *                 A saved query will be incompatible with the API if
     * it uses columns, dimensions, or other
     *                 reporting features from the UI that are not available
     * in the {@link ReportQuery} entity. */
    private java.lang.Boolean isCompatibleWithApiVersion;

    public SavedQuery() {
    }

    public SavedQuery(
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201802.ReportQuery reportQuery,
           java.lang.Boolean isCompatibleWithApiVersion) {
           this.id = id;
           this.name = name;
           this.reportQuery = reportQuery;
           this.isCompatibleWithApiVersion = isCompatibleWithApiVersion;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("id", getId())
            .add("isCompatibleWithApiVersion", getIsCompatibleWithApiVersion())
            .add("name", getName())
            .add("reportQuery", getReportQuery())
            .toString();
    }

    /**
     * Gets the id value for this SavedQuery.
     * 
     * @return id   * The ID of the saved query.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this SavedQuery.
     * 
     * @param id   * The ID of the saved query.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this SavedQuery.
     * 
     * @return name   * The name of the saved query.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this SavedQuery.
     * 
     * @param name   * The name of the saved query.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the reportQuery value for this SavedQuery.
     * 
     * @return reportQuery   * The {@link ReportQuery} representing the selection criteria
     * for the saved query.
     *                 This will be non-null if and only if {@link SavedQuery#isCompatibleWithApiVersion}
     * is
     *                 {@code true}.
     */
    public com.google.api.ads.dfp.axis.v201802.ReportQuery getReportQuery() {
        return reportQuery;
    }


    /**
     * Sets the reportQuery value for this SavedQuery.
     * 
     * @param reportQuery   * The {@link ReportQuery} representing the selection criteria
     * for the saved query.
     *                 This will be non-null if and only if {@link SavedQuery#isCompatibleWithApiVersion}
     * is
     *                 {@code true}.
     */
    public void setReportQuery(com.google.api.ads.dfp.axis.v201802.ReportQuery reportQuery) {
        this.reportQuery = reportQuery;
    }


    /**
     * Gets the isCompatibleWithApiVersion value for this SavedQuery.
     * 
     * @return isCompatibleWithApiVersion   * Whether or not the saved query is compatible with the current
     * API version.
     *                 This will be {@code true} if and only if {@link SavedQuery#reportQuery}
     * is non-null.
     *                 A saved query will be incompatible with the API if
     * it uses columns, dimensions, or other
     *                 reporting features from the UI that are not available
     * in the {@link ReportQuery} entity.
     */
    public java.lang.Boolean getIsCompatibleWithApiVersion() {
        return isCompatibleWithApiVersion;
    }


    /**
     * Sets the isCompatibleWithApiVersion value for this SavedQuery.
     * 
     * @param isCompatibleWithApiVersion   * Whether or not the saved query is compatible with the current
     * API version.
     *                 This will be {@code true} if and only if {@link SavedQuery#reportQuery}
     * is non-null.
     *                 A saved query will be incompatible with the API if
     * it uses columns, dimensions, or other
     *                 reporting features from the UI that are not available
     * in the {@link ReportQuery} entity.
     */
    public void setIsCompatibleWithApiVersion(java.lang.Boolean isCompatibleWithApiVersion) {
        this.isCompatibleWithApiVersion = isCompatibleWithApiVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SavedQuery)) return false;
        SavedQuery other = (SavedQuery) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.reportQuery==null && other.getReportQuery()==null) || 
             (this.reportQuery!=null &&
              this.reportQuery.equals(other.getReportQuery()))) &&
            ((this.isCompatibleWithApiVersion==null && other.getIsCompatibleWithApiVersion()==null) || 
             (this.isCompatibleWithApiVersion!=null &&
              this.isCompatibleWithApiVersion.equals(other.getIsCompatibleWithApiVersion())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getReportQuery() != null) {
            _hashCode += getReportQuery().hashCode();
        }
        if (getIsCompatibleWithApiVersion() != null) {
            _hashCode += getIsCompatibleWithApiVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SavedQuery.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "SavedQuery"));
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
        elemField.setFieldName("reportQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "reportQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ReportQuery"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCompatibleWithApiVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "isCompatibleWithApiVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
