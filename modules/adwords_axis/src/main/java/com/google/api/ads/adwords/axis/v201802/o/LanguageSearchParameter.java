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
 * LanguageSearchParameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.o;


/**
 * A {@link SearchParameter} used to indicate multiple language being
 * targeted.
 *             This can be used, for example, to search for {@code KEYWORD}
 * {@link IdeaType}s that are best for Japanese language.
 *             
 *             <p>The service allows at most one language to be targeted
 * for
 *             {@code KEYWORD} requests.
 *             <p>In the {@code KEYWORD} {@link IdeaType} {@code STATS}
 * {@link RequestType}
 *             requests, those keywords that are from different language
 * than specified in
 *             {@code LanguageSearchParameter} or have unknown language
 * will be filtered
 *             out in the response. To avoid filtering, do not include
 * {@code LanguageSearchParameter} in the request.
 *             <p>This element is supported by following {@link IdeaType}s:
 * KEYWORD.
 *             <p>This element is supported by following {@link RequestType}s:
 * IDEAS, STATS.
 */
public class LanguageSearchParameter  extends com.google.api.ads.adwords.axis.v201802.o.SearchParameter  implements java.io.Serializable {
    /* A list of {@link Language}s indicating the desired languages
     * being targeted in the results.
     *                     <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span>
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     *                     <span class="constraint NotEmpty">This field must
     * contain at least one element.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.Language[] languages;

    public LanguageSearchParameter() {
    }

    public LanguageSearchParameter(
           java.lang.String searchParameterType,
           com.google.api.ads.adwords.axis.v201802.cm.Language[] languages) {
        super(
            searchParameterType);
        this.languages = languages;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("languages", getLanguages())
            .add("searchParameterType", getSearchParameterType())
            .toString();
    }

    /**
     * Gets the languages value for this LanguageSearchParameter.
     * 
     * @return languages   * A list of {@link Language}s indicating the desired languages
     * being targeted in the results.
     *                     <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span>
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     *                     <span class="constraint NotEmpty">This field must
     * contain at least one element.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Language[] getLanguages() {
        return languages;
    }


    /**
     * Sets the languages value for this LanguageSearchParameter.
     * 
     * @param languages   * A list of {@link Language}s indicating the desired languages
     * being targeted in the results.
     *                     <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span>
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     *                     <span class="constraint NotEmpty">This field must
     * contain at least one element.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setLanguages(com.google.api.ads.adwords.axis.v201802.cm.Language[] languages) {
        this.languages = languages;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.Language getLanguages(int i) {
        return this.languages[i];
    }

    public void setLanguages(int i, com.google.api.ads.adwords.axis.v201802.cm.Language _value) {
        this.languages[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LanguageSearchParameter)) return false;
        LanguageSearchParameter other = (LanguageSearchParameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.languages==null && other.getLanguages()==null) || 
             (this.languages!=null &&
              java.util.Arrays.equals(this.languages, other.getLanguages())));
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
        if (getLanguages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLanguages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLanguages(), i);
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
        new org.apache.axis.description.TypeDesc(LanguageSearchParameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "LanguageSearchParameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languages");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "languages"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Language"));
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
