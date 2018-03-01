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
 * CompetitionSearchParameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.o;


/**
 * A {@link SearchParameter} for {@code KEYWORD} {@link IdeaType}s
 * used to
 *             filter the results by the amount of competition (eg: LOW,
 * MEDIUM, HIGH).
 *             <p>This element is supported by following {@link IdeaType}s:
 * KEYWORD.
 *             <p>This element is supported by following {@link RequestType}s:
 * IDEAS, STATS.
 */
public class CompetitionSearchParameter  extends com.google.api.ads.adwords.axis.v201802.o.SearchParameter  implements java.io.Serializable {
    /* A set of {@link Level}s indicating a relative amount of competition
     * that
     *                     {@code KEYWORD} {@link IdeaType}s should have
     * in the  results.
     *                     <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span>
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     *                     <span class="constraint NotEmpty">This field must
     * contain at least one element.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201802.o.CompetitionSearchParameterLevel[] levels;

    public CompetitionSearchParameter() {
    }

    public CompetitionSearchParameter(
           java.lang.String searchParameterType,
           com.google.api.ads.adwords.axis.v201802.o.CompetitionSearchParameterLevel[] levels) {
        super(
            searchParameterType);
        this.levels = levels;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("levels", getLevels())
            .add("searchParameterType", getSearchParameterType())
            .toString();
    }

    /**
     * Gets the levels value for this CompetitionSearchParameter.
     * 
     * @return levels   * A set of {@link Level}s indicating a relative amount of competition
     * that
     *                     {@code KEYWORD} {@link IdeaType}s should have
     * in the  results.
     *                     <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span>
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     *                     <span class="constraint NotEmpty">This field must
     * contain at least one element.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.o.CompetitionSearchParameterLevel[] getLevels() {
        return levels;
    }


    /**
     * Sets the levels value for this CompetitionSearchParameter.
     * 
     * @param levels   * A set of {@link Level}s indicating a relative amount of competition
     * that
     *                     {@code KEYWORD} {@link IdeaType}s should have
     * in the  results.
     *                     <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span>
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     *                     <span class="constraint NotEmpty">This field must
     * contain at least one element.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setLevels(com.google.api.ads.adwords.axis.v201802.o.CompetitionSearchParameterLevel[] levels) {
        this.levels = levels;
    }

    public com.google.api.ads.adwords.axis.v201802.o.CompetitionSearchParameterLevel getLevels(int i) {
        return this.levels[i];
    }

    public void setLevels(int i, com.google.api.ads.adwords.axis.v201802.o.CompetitionSearchParameterLevel _value) {
        this.levels[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CompetitionSearchParameter)) return false;
        CompetitionSearchParameter other = (CompetitionSearchParameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.levels==null && other.getLevels()==null) || 
             (this.levels!=null &&
              java.util.Arrays.equals(this.levels, other.getLevels())));
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
        if (getLevels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLevels());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLevels(), i);
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
        new org.apache.axis.description.TypeDesc(CompetitionSearchParameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "CompetitionSearchParameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("levels");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "levels"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "CompetitionSearchParameter.Level"));
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
