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
 * RelatedToUrlSearchParameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.o;


/**
 * A {@link SearchParameter} that specifies a set of URLs that results
 * should
 *             in some way be related to. For example, keyword results
 * would be
 *             similar to content keywords found on the related URLs.
 * <p>This element is supported by following {@link IdeaType}s: KEYWORD.
 * <p>This element is supported by following {@link RequestType}s: IDEAS.
 */
public class RelatedToUrlSearchParameter  extends com.google.api.ads.adwords.axis.v201802.o.SearchParameter  implements java.io.Serializable {
    /* A set of URL strings to which search results should be related.
     * For {@code KEYWORD} queries, only one URL may be submitted.
     *                     <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span>
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     *                     <span class="constraint NotEmpty">This field must
     * contain at least one element.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private java.lang.String[] urls;

    /* Whether to crawl links off of the {@code urls} for the same
     * domain.
     *                     Default is {@code false}. */
    private java.lang.Boolean includeSubUrls;

    public RelatedToUrlSearchParameter() {
    }

    public RelatedToUrlSearchParameter(
           java.lang.String searchParameterType,
           java.lang.String[] urls,
           java.lang.Boolean includeSubUrls) {
        super(
            searchParameterType);
        this.urls = urls;
        this.includeSubUrls = includeSubUrls;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("includeSubUrls", getIncludeSubUrls())
            .add("searchParameterType", getSearchParameterType())
            .add("urls", getUrls())
            .toString();
    }

    /**
     * Gets the urls value for this RelatedToUrlSearchParameter.
     * 
     * @return urls   * A set of URL strings to which search results should be related.
     * For {@code KEYWORD} queries, only one URL may be submitted.
     *                     <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span>
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     *                     <span class="constraint NotEmpty">This field must
     * contain at least one element.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public java.lang.String[] getUrls() {
        return urls;
    }


    /**
     * Sets the urls value for this RelatedToUrlSearchParameter.
     * 
     * @param urls   * A set of URL strings to which search results should be related.
     * For {@code KEYWORD} queries, only one URL may be submitted.
     *                     <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span>
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     *                     <span class="constraint NotEmpty">This field must
     * contain at least one element.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
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


    /**
     * Gets the includeSubUrls value for this RelatedToUrlSearchParameter.
     * 
     * @return includeSubUrls   * Whether to crawl links off of the {@code urls} for the same
     * domain.
     *                     Default is {@code false}.
     */
    public java.lang.Boolean getIncludeSubUrls() {
        return includeSubUrls;
    }


    /**
     * Sets the includeSubUrls value for this RelatedToUrlSearchParameter.
     * 
     * @param includeSubUrls   * Whether to crawl links off of the {@code urls} for the same
     * domain.
     *                     Default is {@code false}.
     */
    public void setIncludeSubUrls(java.lang.Boolean includeSubUrls) {
        this.includeSubUrls = includeSubUrls;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RelatedToUrlSearchParameter)) return false;
        RelatedToUrlSearchParameter other = (RelatedToUrlSearchParameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.urls==null && other.getUrls()==null) || 
             (this.urls!=null &&
              java.util.Arrays.equals(this.urls, other.getUrls()))) &&
            ((this.includeSubUrls==null && other.getIncludeSubUrls()==null) || 
             (this.includeSubUrls!=null &&
              this.includeSubUrls.equals(other.getIncludeSubUrls())));
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
        if (getIncludeSubUrls() != null) {
            _hashCode += getIncludeSubUrls().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RelatedToUrlSearchParameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "RelatedToUrlSearchParameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urls");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "urls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeSubUrls");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "includeSubUrls"));
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
