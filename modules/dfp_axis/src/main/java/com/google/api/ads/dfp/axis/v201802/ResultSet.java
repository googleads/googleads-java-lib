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
 * ResultSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * The {@code ResultSet} represents a table of data obtained from
 * the execution of a PQL {@link
 *             Statement}.
 */
public class ResultSet  implements java.io.Serializable {
    /* A collection of {@link ColumnType} objects. */
    private com.google.api.ads.dfp.axis.v201802.ColumnType[] columnTypes;

    /* A collection of {@link Row} objects. */
    private com.google.api.ads.dfp.axis.v201802.Row[] rows;

    public ResultSet() {
    }

    public ResultSet(
           com.google.api.ads.dfp.axis.v201802.ColumnType[] columnTypes,
           com.google.api.ads.dfp.axis.v201802.Row[] rows) {
           this.columnTypes = columnTypes;
           this.rows = rows;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("columnTypes", getColumnTypes())
            .add("rows", getRows())
            .toString();
    }

    /**
     * Gets the columnTypes value for this ResultSet.
     * 
     * @return columnTypes   * A collection of {@link ColumnType} objects.
     */
    public com.google.api.ads.dfp.axis.v201802.ColumnType[] getColumnTypes() {
        return columnTypes;
    }


    /**
     * Sets the columnTypes value for this ResultSet.
     * 
     * @param columnTypes   * A collection of {@link ColumnType} objects.
     */
    public void setColumnTypes(com.google.api.ads.dfp.axis.v201802.ColumnType[] columnTypes) {
        this.columnTypes = columnTypes;
    }

    public com.google.api.ads.dfp.axis.v201802.ColumnType getColumnTypes(int i) {
        return this.columnTypes[i];
    }

    public void setColumnTypes(int i, com.google.api.ads.dfp.axis.v201802.ColumnType _value) {
        this.columnTypes[i] = _value;
    }


    /**
     * Gets the rows value for this ResultSet.
     * 
     * @return rows   * A collection of {@link Row} objects.
     */
    public com.google.api.ads.dfp.axis.v201802.Row[] getRows() {
        return rows;
    }


    /**
     * Sets the rows value for this ResultSet.
     * 
     * @param rows   * A collection of {@link Row} objects.
     */
    public void setRows(com.google.api.ads.dfp.axis.v201802.Row[] rows) {
        this.rows = rows;
    }

    public com.google.api.ads.dfp.axis.v201802.Row getRows(int i) {
        return this.rows[i];
    }

    public void setRows(int i, com.google.api.ads.dfp.axis.v201802.Row _value) {
        this.rows[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResultSet)) return false;
        ResultSet other = (ResultSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.columnTypes==null && other.getColumnTypes()==null) || 
             (this.columnTypes!=null &&
              java.util.Arrays.equals(this.columnTypes, other.getColumnTypes()))) &&
            ((this.rows==null && other.getRows()==null) || 
             (this.rows!=null &&
              java.util.Arrays.equals(this.rows, other.getRows())));
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
        if (getColumnTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getColumnTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getColumnTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRows() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRows());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRows(), i);
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
        new org.apache.axis.description.TypeDesc(ResultSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ResultSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columnTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "columnTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ColumnType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rows");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "rows"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Row"));
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
