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
 * UrlList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Wrapper POJO for a list of URLs.  The list can be cleared if a
 * request contains
 *             a UrlList with an empty urls list.
 */
public class UrlList  implements java.io.Serializable {
    /* List of URLs.  On SET operation, empty list indicates to clear
     * the list.
     *                 <span class="constraint CollectionSize">The maximum
     * size of this collection is 10.</span>
     *                 <span class="constraint ContentsStringLength">Strings
     * in this field must be non-empty (trimmed).</span> */
    private java.lang.String[] urls;

    public UrlList() {
    }

    public UrlList(
           java.lang.String[] urls) {
           this.urls = urls;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("urls", getUrls())
            .toString();
    }

    /**
     * Gets the urls value for this UrlList.
     * 
     * @return urls   * List of URLs.  On SET operation, empty list indicates to clear
     * the list.
     *                 <span class="constraint CollectionSize">The maximum
     * size of this collection is 10.</span>
     *                 <span class="constraint ContentsStringLength">Strings
     * in this field must be non-empty (trimmed).</span>
     */
    public java.lang.String[] getUrls() {
        return urls;
    }


    /**
     * Sets the urls value for this UrlList.
     * 
     * @param urls   * List of URLs.  On SET operation, empty list indicates to clear
     * the list.
     *                 <span class="constraint CollectionSize">The maximum
     * size of this collection is 10.</span>
     *                 <span class="constraint ContentsStringLength">Strings
     * in this field must be non-empty (trimmed).</span>
     */
    public void setUrls(java.lang.String[] urls) {
        this.urls = urls;
    }

    public java.lang.String getUrls(int i) {
        return this.urls[i];
    }

    public void setUrls(int i, java.lang.String _value) {
        this.urls[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UrlList)) return false;
        UrlList other = (UrlList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.urls==null && other.getUrls()==null) || 
             (this.urls!=null &&
              java.util.Arrays.equals(this.urls, other.getUrls())));
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
        if (getUrls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUrls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUrls(), i);
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
        new org.apache.axis.description.TypeDesc(UrlList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "UrlList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urls");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "urls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
