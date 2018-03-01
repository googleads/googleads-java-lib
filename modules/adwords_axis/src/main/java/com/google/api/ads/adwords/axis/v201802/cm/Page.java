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
 * Page.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Contains the results from a get call.
 */
public abstract class Page  implements java.io.Serializable {
    /* Total number of entries in the result that this page is a part
     * of. */
    private java.lang.Integer totalNumEntries;

    /* Indicates that this instance is a subtype of Page.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String pageType;

    public Page() {
    }

    public Page(
           java.lang.Integer totalNumEntries,
           java.lang.String pageType) {
           this.totalNumEntries = totalNumEntries;
           this.pageType = pageType;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("pageType", getPageType())
            .add("totalNumEntries", getTotalNumEntries())
            .toString();
    }

    /**
     * Gets the totalNumEntries value for this Page.
     * 
     * @return totalNumEntries   * Total number of entries in the result that this page is a part
     * of.
     */
    public java.lang.Integer getTotalNumEntries() {
        return totalNumEntries;
    }


    /**
     * Sets the totalNumEntries value for this Page.
     * 
     * @param totalNumEntries   * Total number of entries in the result that this page is a part
     * of.
     */
    public void setTotalNumEntries(java.lang.Integer totalNumEntries) {
        this.totalNumEntries = totalNumEntries;
    }


    /**
     * Gets the pageType value for this Page.
     * 
     * @return pageType   * Indicates that this instance is a subtype of Page.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getPageType() {
        return pageType;
    }


    /**
     * Sets the pageType value for this Page.
     * 
     * @param pageType   * Indicates that this instance is a subtype of Page.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setPageType(java.lang.String pageType) {
        this.pageType = pageType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Page)) return false;
        Page other = (Page) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.totalNumEntries==null && other.getTotalNumEntries()==null) || 
             (this.totalNumEntries!=null &&
              this.totalNumEntries.equals(other.getTotalNumEntries()))) &&
            ((this.pageType==null && other.getPageType()==null) || 
             (this.pageType!=null &&
              this.pageType.equals(other.getPageType())));
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
        if (getTotalNumEntries() != null) {
            _hashCode += getTotalNumEntries().hashCode();
        }
        if (getPageType() != null) {
            _hashCode += getPageType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Page.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Page"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalNumEntries");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "totalNumEntries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Page.Type"));
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
