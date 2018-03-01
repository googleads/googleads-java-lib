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
 * TargetingIdeaSelector.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.o;


/**
 * A descriptor for finding {@link TargetingIdea}s that match the
 * specified criteria.
 */
public class TargetingIdeaSelector  implements java.io.Serializable {
    /* Search for targeting ideas based on these search rules.
     *                 
     *                 <p>An empty set indicates this selector is valid for
     * selecting metadata
     *                 with default parameters.
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     *                 <span class="constraint DistinctTypes">Elements in
     * this field must have distinct types.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201802.o.SearchParameter[] searchParameters;

    /* Limits the request to responses of this {@link IdeaType}, e.g.
     * {@code KEYWORDS}.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201802.o.IdeaType ideaType;

    /* Specifies the {@link RequestType}, e.g. {@code IDEAS} or {@code
     * STATS}.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201802.o.RequestType requestType;

    /* Request {@link Attribute}s and associated data for this set
     * of {@link Type}s.
     *                 
     *                 <p>An empty set indicates a request for {@link KeywordAttribute},
     * {@link PlacementAttribute},
     *                 and {@link IdeaType}.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span> */
    private com.google.api.ads.adwords.axis.v201802.o.AttributeType[] requestedAttributeTypes;

    /* A {@link Paging} object that specifies the desired starting
     * index and
     *                 number of results to return.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.Paging paging;

    /* The locale code (for example "en_US") used for localizing strings,
     * controlling numeric formatting, and the like.  See RFC 3066 for
     *                 information on the format used. */
    private java.lang.String localeCode;

    /* The currency code to be used for all monetary values returned
     * in results in
     *                 ISO format (see
     *                 https://developers.google.com/adwords/api/docs/appendix/currencycodes
     * for supported currencies). The default is "USD" (US dollars). */
    private java.lang.String currencyCode;

    public TargetingIdeaSelector() {
    }

    public TargetingIdeaSelector(
           com.google.api.ads.adwords.axis.v201802.o.SearchParameter[] searchParameters,
           com.google.api.ads.adwords.axis.v201802.o.IdeaType ideaType,
           com.google.api.ads.adwords.axis.v201802.o.RequestType requestType,
           com.google.api.ads.adwords.axis.v201802.o.AttributeType[] requestedAttributeTypes,
           com.google.api.ads.adwords.axis.v201802.cm.Paging paging,
           java.lang.String localeCode,
           java.lang.String currencyCode) {
           this.searchParameters = searchParameters;
           this.ideaType = ideaType;
           this.requestType = requestType;
           this.requestedAttributeTypes = requestedAttributeTypes;
           this.paging = paging;
           this.localeCode = localeCode;
           this.currencyCode = currencyCode;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("currencyCode", getCurrencyCode())
            .add("ideaType", getIdeaType())
            .add("localeCode", getLocaleCode())
            .add("paging", getPaging())
            .add("requestType", getRequestType())
            .add("requestedAttributeTypes", getRequestedAttributeTypes())
            .add("searchParameters", getSearchParameters())
            .toString();
    }

    /**
     * Gets the searchParameters value for this TargetingIdeaSelector.
     * 
     * @return searchParameters   * Search for targeting ideas based on these search rules.
     *                 
     *                 <p>An empty set indicates this selector is valid for
     * selecting metadata
     *                 with default parameters.
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     *                 <span class="constraint DistinctTypes">Elements in
     * this field must have distinct types.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.o.SearchParameter[] getSearchParameters() {
        return searchParameters;
    }


    /**
     * Sets the searchParameters value for this TargetingIdeaSelector.
     * 
     * @param searchParameters   * Search for targeting ideas based on these search rules.
     *                 
     *                 <p>An empty set indicates this selector is valid for
     * selecting metadata
     *                 with default parameters.
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     *                 <span class="constraint DistinctTypes">Elements in
     * this field must have distinct types.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setSearchParameters(com.google.api.ads.adwords.axis.v201802.o.SearchParameter[] searchParameters) {
        this.searchParameters = searchParameters;
    }

    public com.google.api.ads.adwords.axis.v201802.o.SearchParameter getSearchParameters(int i) {
        return this.searchParameters[i];
    }

    public void setSearchParameters(int i, com.google.api.ads.adwords.axis.v201802.o.SearchParameter _value) {
        this.searchParameters[i] = _value;
    }


    /**
     * Gets the ideaType value for this TargetingIdeaSelector.
     * 
     * @return ideaType   * Limits the request to responses of this {@link IdeaType}, e.g.
     * {@code KEYWORDS}.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.o.IdeaType getIdeaType() {
        return ideaType;
    }


    /**
     * Sets the ideaType value for this TargetingIdeaSelector.
     * 
     * @param ideaType   * Limits the request to responses of this {@link IdeaType}, e.g.
     * {@code KEYWORDS}.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setIdeaType(com.google.api.ads.adwords.axis.v201802.o.IdeaType ideaType) {
        this.ideaType = ideaType;
    }


    /**
     * Gets the requestType value for this TargetingIdeaSelector.
     * 
     * @return requestType   * Specifies the {@link RequestType}, e.g. {@code IDEAS} or {@code
     * STATS}.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.o.RequestType getRequestType() {
        return requestType;
    }


    /**
     * Sets the requestType value for this TargetingIdeaSelector.
     * 
     * @param requestType   * Specifies the {@link RequestType}, e.g. {@code IDEAS} or {@code
     * STATS}.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setRequestType(com.google.api.ads.adwords.axis.v201802.o.RequestType requestType) {
        this.requestType = requestType;
    }


    /**
     * Gets the requestedAttributeTypes value for this TargetingIdeaSelector.
     * 
     * @return requestedAttributeTypes   * Request {@link Attribute}s and associated data for this set
     * of {@link Type}s.
     *                 
     *                 <p>An empty set indicates a request for {@link KeywordAttribute},
     * {@link PlacementAttribute},
     *                 and {@link IdeaType}.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.o.AttributeType[] getRequestedAttributeTypes() {
        return requestedAttributeTypes;
    }


    /**
     * Sets the requestedAttributeTypes value for this TargetingIdeaSelector.
     * 
     * @param requestedAttributeTypes   * Request {@link Attribute}s and associated data for this set
     * of {@link Type}s.
     *                 
     *                 <p>An empty set indicates a request for {@link KeywordAttribute},
     * {@link PlacementAttribute},
     *                 and {@link IdeaType}.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public void setRequestedAttributeTypes(com.google.api.ads.adwords.axis.v201802.o.AttributeType[] requestedAttributeTypes) {
        this.requestedAttributeTypes = requestedAttributeTypes;
    }

    public com.google.api.ads.adwords.axis.v201802.o.AttributeType getRequestedAttributeTypes(int i) {
        return this.requestedAttributeTypes[i];
    }

    public void setRequestedAttributeTypes(int i, com.google.api.ads.adwords.axis.v201802.o.AttributeType _value) {
        this.requestedAttributeTypes[i] = _value;
    }


    /**
     * Gets the paging value for this TargetingIdeaSelector.
     * 
     * @return paging   * A {@link Paging} object that specifies the desired starting
     * index and
     *                 number of results to return.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Paging getPaging() {
        return paging;
    }


    /**
     * Sets the paging value for this TargetingIdeaSelector.
     * 
     * @param paging   * A {@link Paging} object that specifies the desired starting
     * index and
     *                 number of results to return.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setPaging(com.google.api.ads.adwords.axis.v201802.cm.Paging paging) {
        this.paging = paging;
    }


    /**
     * Gets the localeCode value for this TargetingIdeaSelector.
     * 
     * @return localeCode   * The locale code (for example "en_US") used for localizing strings,
     * controlling numeric formatting, and the like.  See RFC 3066 for
     *                 information on the format used.
     */
    public java.lang.String getLocaleCode() {
        return localeCode;
    }


    /**
     * Sets the localeCode value for this TargetingIdeaSelector.
     * 
     * @param localeCode   * The locale code (for example "en_US") used for localizing strings,
     * controlling numeric formatting, and the like.  See RFC 3066 for
     *                 information on the format used.
     */
    public void setLocaleCode(java.lang.String localeCode) {
        this.localeCode = localeCode;
    }


    /**
     * Gets the currencyCode value for this TargetingIdeaSelector.
     * 
     * @return currencyCode   * The currency code to be used for all monetary values returned
     * in results in
     *                 ISO format (see
     *                 https://developers.google.com/adwords/api/docs/appendix/currencycodes
     * for supported currencies). The default is "USD" (US dollars).
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this TargetingIdeaSelector.
     * 
     * @param currencyCode   * The currency code to be used for all monetary values returned
     * in results in
     *                 ISO format (see
     *                 https://developers.google.com/adwords/api/docs/appendix/currencycodes
     * for supported currencies). The default is "USD" (US dollars).
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TargetingIdeaSelector)) return false;
        TargetingIdeaSelector other = (TargetingIdeaSelector) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.searchParameters==null && other.getSearchParameters()==null) || 
             (this.searchParameters!=null &&
              java.util.Arrays.equals(this.searchParameters, other.getSearchParameters()))) &&
            ((this.ideaType==null && other.getIdeaType()==null) || 
             (this.ideaType!=null &&
              this.ideaType.equals(other.getIdeaType()))) &&
            ((this.requestType==null && other.getRequestType()==null) || 
             (this.requestType!=null &&
              this.requestType.equals(other.getRequestType()))) &&
            ((this.requestedAttributeTypes==null && other.getRequestedAttributeTypes()==null) || 
             (this.requestedAttributeTypes!=null &&
              java.util.Arrays.equals(this.requestedAttributeTypes, other.getRequestedAttributeTypes()))) &&
            ((this.paging==null && other.getPaging()==null) || 
             (this.paging!=null &&
              this.paging.equals(other.getPaging()))) &&
            ((this.localeCode==null && other.getLocaleCode()==null) || 
             (this.localeCode!=null &&
              this.localeCode.equals(other.getLocaleCode()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode())));
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
        if (getSearchParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSearchParameters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSearchParameters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIdeaType() != null) {
            _hashCode += getIdeaType().hashCode();
        }
        if (getRequestType() != null) {
            _hashCode += getRequestType().hashCode();
        }
        if (getRequestedAttributeTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRequestedAttributeTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRequestedAttributeTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaging() != null) {
            _hashCode += getPaging().hashCode();
        }
        if (getLocaleCode() != null) {
            _hashCode += getLocaleCode().hashCode();
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TargetingIdeaSelector.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "TargetingIdeaSelector"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "searchParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "SearchParameter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ideaType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "ideaType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "IdeaType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "requestType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "RequestType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestedAttributeTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "requestedAttributeTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "AttributeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paging");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "paging"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Paging"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "localeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "currencyCode"));
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
