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
 * IdeaTextFilterSearchParameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.o;


/**
 * A {@link SearchParameter} for {@code KEYWORD} {@link IdeaType}s
 * that
 *             specifies a collection of strings by which the results
 * should be
 *             constrained. This guarantees that each idea in the result
 * will match
 *             at least one of the {@code included} values.
 *             
 *             For this {@link SearchParameter}, excluded items will
 * always take
 *             priority over included ones.
 *             
 *             This can handle a maximum of 200 (included + excluded)
 * elements.
 *             <p>This element is supported by following {@link IdeaType}s:
 * KEYWORD.
 *             <p>This element is supported by following {@link RequestType}s:
 * IDEAS, STATS.
 */
public class IdeaTextFilterSearchParameter  extends com.google.api.ads.adwords.axis.v201802.o.SearchParameter  implements java.io.Serializable {
    /* A set of strings specifying which ideas should be included
     * in the results.
     *                     <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span>
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     *                     <span class="constraint ContentsStringLength">Strings
     * in this field must be non-empty (trimmed).</span> */
    private java.lang.String[] included;

    /* A set of strings specifying which ideas should be excluded
     * from the results.
     *                     <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span>
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     *                     <span class="constraint ContentsStringLength">Strings
     * in this field must be non-empty (trimmed).</span> */
    private java.lang.String[] excluded;

    public IdeaTextFilterSearchParameter() {
    }

    public IdeaTextFilterSearchParameter(
           java.lang.String searchParameterType,
           java.lang.String[] included,
           java.lang.String[] excluded) {
        super(
            searchParameterType);
        this.included = included;
        this.excluded = excluded;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("excluded", getExcluded())
            .add("included", getIncluded())
            .add("searchParameterType", getSearchParameterType())
            .toString();
    }

    /**
     * Gets the included value for this IdeaTextFilterSearchParameter.
     * 
     * @return included   * A set of strings specifying which ideas should be included
     * in the results.
     *                     <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span>
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     *                     <span class="constraint ContentsStringLength">Strings
     * in this field must be non-empty (trimmed).</span>
     */
    public java.lang.String[] getIncluded() {
        return included;
    }


    /**
     * Sets the included value for this IdeaTextFilterSearchParameter.
     * 
     * @param included   * A set of strings specifying which ideas should be included
     * in the results.
     *                     <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span>
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     *                     <span class="constraint ContentsStringLength">Strings
     * in this field must be non-empty (trimmed).</span>
     */
    public void setIncluded(java.lang.String[] included) {
        this.included = included;
    }

    public java.lang.String getIncluded(int i) {
        return this.included[i];
    }

    public void setIncluded(int i, java.lang.String _value) {
        this.included[i] = _value;
    }


    /**
     * Gets the excluded value for this IdeaTextFilterSearchParameter.
     * 
     * @return excluded   * A set of strings specifying which ideas should be excluded
     * from the results.
     *                     <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span>
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     *                     <span class="constraint ContentsStringLength">Strings
     * in this field must be non-empty (trimmed).</span>
     */
    public java.lang.String[] getExcluded() {
        return excluded;
    }


    /**
     * Sets the excluded value for this IdeaTextFilterSearchParameter.
     * 
     * @param excluded   * A set of strings specifying which ideas should be excluded
     * from the results.
     *                     <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span>
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     *                     <span class="constraint ContentsStringLength">Strings
     * in this field must be non-empty (trimmed).</span>
     */
    public void setExcluded(java.lang.String[] excluded) {
        this.excluded = excluded;
    }

    public java.lang.String getExcluded(int i) {
        return this.excluded[i];
    }

    public void setExcluded(int i, java.lang.String _value) {
        this.excluded[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdeaTextFilterSearchParameter)) return false;
        IdeaTextFilterSearchParameter other = (IdeaTextFilterSearchParameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.included==null && other.getIncluded()==null) || 
             (this.included!=null &&
              java.util.Arrays.equals(this.included, other.getIncluded()))) &&
            ((this.excluded==null && other.getExcluded()==null) || 
             (this.excluded!=null &&
              java.util.Arrays.equals(this.excluded, other.getExcluded())));
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
        if (getIncluded() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIncluded());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIncluded(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcluded() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcluded());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcluded(), i);
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
        new org.apache.axis.description.TypeDesc(IdeaTextFilterSearchParameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "IdeaTextFilterSearchParameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("included");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "included"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excluded");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "excluded"));
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
