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
 * Keyword.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents a keyword.
 *             <span class="constraint AdxEnabled">This is disabled for
 * AdX when it is contained within Operators: ADD, SET.</span>
 */
public class Keyword  extends com.google.api.ads.adwords.axis.v201802.cm.Criterion  implements java.io.Serializable {
    /* Text of this keyword (at most 80 characters and ten words).
     * <span class="constraint Selectable">This field can be selected using
     * the value "KeywordText".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                     <span class="constraint MatchesRegex">Keyword
     * text must not contain NUL (code point 0x0) characters. This is checked
     * by the regular expression '[^\x00]*'.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private java.lang.String text;

    /* Match type of this keyword.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "KeywordMatchType".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.KeywordMatchType matchType;

    public Keyword() {
    }

    public Keyword(
           java.lang.Long id,
           com.google.api.ads.adwords.axis.v201802.cm.CriterionType type,
           java.lang.String criterionType,
           java.lang.String text,
           com.google.api.ads.adwords.axis.v201802.cm.KeywordMatchType matchType) {
        super(
            id,
            type,
            criterionType);
        this.text = text;
        this.matchType = matchType;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("criterionType", getCriterionType())
            .add("id", getId())
            .add("matchType", getMatchType())
            .add("text", getText())
            .add("type", getType())
            .toString();
    }

    /**
     * Gets the text value for this Keyword.
     * 
     * @return text   * Text of this keyword (at most 80 characters and ten words).
     * <span class="constraint Selectable">This field can be selected using
     * the value "KeywordText".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                     <span class="constraint MatchesRegex">Keyword
     * text must not contain NUL (code point 0x0) characters. This is checked
     * by the regular expression '[^\x00]*'.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public java.lang.String getText() {
        return text;
    }


    /**
     * Sets the text value for this Keyword.
     * 
     * @param text   * Text of this keyword (at most 80 characters and ten words).
     * <span class="constraint Selectable">This field can be selected using
     * the value "KeywordText".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                     <span class="constraint MatchesRegex">Keyword
     * text must not contain NUL (code point 0x0) characters. This is checked
     * by the regular expression '[^\x00]*'.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }


    /**
     * Gets the matchType value for this Keyword.
     * 
     * @return matchType   * Match type of this keyword.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "KeywordMatchType".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.KeywordMatchType getMatchType() {
        return matchType;
    }


    /**
     * Sets the matchType value for this Keyword.
     * 
     * @param matchType   * Match type of this keyword.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "KeywordMatchType".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setMatchType(com.google.api.ads.adwords.axis.v201802.cm.KeywordMatchType matchType) {
        this.matchType = matchType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Keyword)) return false;
        Keyword other = (Keyword) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText()))) &&
            ((this.matchType==null && other.getMatchType()==null) || 
             (this.matchType!=null &&
              this.matchType.equals(other.getMatchType())));
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
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        if (getMatchType() != null) {
            _hashCode += getMatchType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Keyword.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Keyword"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "matchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "KeywordMatchType"));
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
