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
 * AdParam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents an ad parameter.  Use ad parameters to update numeric
 * values
 *             (such as prices or inventory levels) in any line of a
 * text ad, including
 *             the destination URL. You can set two <code>AdParam</code>
 * objects
 *             (one for each value of {@link #paramIndex}) per ad group
 * <a href="AdGroupCriterionService.Keyword.html">Keyword</a>
 *             criterion.
 *             <p>When setting or removing an <code>AdParam</code>, it
 * is uniquely
 *             identified by the combination of these three fields:</p>
 * <ul>
 *             <li><code>adGroupId</code></li>
 *             <li><code>criterionId</code></li>
 *             <li><code>paramIndex</code></li>
 *             </ul>
 */
public class AdParam  implements java.io.Serializable {
    /* ID of the associated ad group. Text ads in this ad group will
     * be
     *                 candidates for parameterized text replacement.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AdGroupId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.Long adGroupId;

    /* ID of the associated <code>Keyword</code> criterion. The keyword
     * must be
     *                 in the same ad group as this <code>AdParam</code>.
     * Text ads triggered by
     *                 this keyword will have their
     *                 <code>{param<var>N</var>:<var>default-value</var>}</code>
     * snippet
     *                 replaced by the contents of {@link #insertionText}.
     * <span class="constraint Selectable">This field can be selected using
     * the value "CriterionId".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.Long criterionId;

    /* Numeric value to insert into the ad text. The following restrictions
     * apply:
     *                 <ul>
     *                 <li>Can use <code><b>,</b></code> or <code><b>.</b></code>
     * as a
     *                 separator, with an optional <code><b>.</b></code>
     * or
     *                 <code><b>,</b></code> (respectively) for fractional
     * values. For
     *                 example, <code>1,000,000.00</code> and <code>2.000.000,10</code>
     * are
     *                 valid.</li>
     *                 <li>Can be prepended or appended with a currency symbol.
     * For example, <code>$99.99</code> and <code>200&pound;</code> are
     *                 valid.</li>
     *                 <li>Can be prepended or appended with a currency code.
     * For example, <code>99.99USD</code> and <code>EUR200</code> are
     *                 valid.</li>
     *                 <li>Can use <code>%</code>. For example, <code>1.0%</code>
     * and
     *                 <code>1,0%</code> are valid.</li>
     *                 <li>Can use <code>+</code> or <code>-</code>. For
     * example,
     *                 <code>-10.99</code> and <code>25+</code> are valid.</li>
     * <li>Can use <code>/</code> between two numbers. For example
     *                 <code>4/1</code> and <code>0.95/0.45</code> are valid.</li>
     * </ul>
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "InsertionText".</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 25, inclusive.</span> */
    private java.lang.String insertionText;

    /* Defines which parameterized snippet of ad text to replace.
     * For example, a
     *                 value of <code>1</code> indicates a replacement for
     * the
     *                 <code>{<b>param1</b>:<var>default-value</var>}</code>
     * token.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ParamIndex".</span>
     *                 <span class="constraint InRange">This field must be
     * between 1 and 2, inclusive.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.Integer paramIndex;

    public AdParam() {
    }

    public AdParam(
           java.lang.Long adGroupId,
           java.lang.Long criterionId,
           java.lang.String insertionText,
           java.lang.Integer paramIndex) {
           this.adGroupId = adGroupId;
           this.criterionId = criterionId;
           this.insertionText = insertionText;
           this.paramIndex = paramIndex;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adGroupId", getAdGroupId())
            .add("criterionId", getCriterionId())
            .add("insertionText", getInsertionText())
            .add("paramIndex", getParamIndex())
            .toString();
    }

    /**
     * Gets the adGroupId value for this AdParam.
     * 
     * @return adGroupId   * ID of the associated ad group. Text ads in this ad group will
     * be
     *                 candidates for parameterized text replacement.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AdGroupId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.Long getAdGroupId() {
        return adGroupId;
    }


    /**
     * Sets the adGroupId value for this AdParam.
     * 
     * @param adGroupId   * ID of the associated ad group. Text ads in this ad group will
     * be
     *                 candidates for parameterized text replacement.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AdGroupId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setAdGroupId(java.lang.Long adGroupId) {
        this.adGroupId = adGroupId;
    }


    /**
     * Gets the criterionId value for this AdParam.
     * 
     * @return criterionId   * ID of the associated <code>Keyword</code> criterion. The keyword
     * must be
     *                 in the same ad group as this <code>AdParam</code>.
     * Text ads triggered by
     *                 this keyword will have their
     *                 <code>{param<var>N</var>:<var>default-value</var>}</code>
     * snippet
     *                 replaced by the contents of {@link #insertionText}.
     * <span class="constraint Selectable">This field can be selected using
     * the value "CriterionId".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.Long getCriterionId() {
        return criterionId;
    }


    /**
     * Sets the criterionId value for this AdParam.
     * 
     * @param criterionId   * ID of the associated <code>Keyword</code> criterion. The keyword
     * must be
     *                 in the same ad group as this <code>AdParam</code>.
     * Text ads triggered by
     *                 this keyword will have their
     *                 <code>{param<var>N</var>:<var>default-value</var>}</code>
     * snippet
     *                 replaced by the contents of {@link #insertionText}.
     * <span class="constraint Selectable">This field can be selected using
     * the value "CriterionId".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setCriterionId(java.lang.Long criterionId) {
        this.criterionId = criterionId;
    }


    /**
     * Gets the insertionText value for this AdParam.
     * 
     * @return insertionText   * Numeric value to insert into the ad text. The following restrictions
     * apply:
     *                 <ul>
     *                 <li>Can use <code><b>,</b></code> or <code><b>.</b></code>
     * as a
     *                 separator, with an optional <code><b>.</b></code>
     * or
     *                 <code><b>,</b></code> (respectively) for fractional
     * values. For
     *                 example, <code>1,000,000.00</code> and <code>2.000.000,10</code>
     * are
     *                 valid.</li>
     *                 <li>Can be prepended or appended with a currency symbol.
     * For example, <code>$99.99</code> and <code>200&pound;</code> are
     *                 valid.</li>
     *                 <li>Can be prepended or appended with a currency code.
     * For example, <code>99.99USD</code> and <code>EUR200</code> are
     *                 valid.</li>
     *                 <li>Can use <code>%</code>. For example, <code>1.0%</code>
     * and
     *                 <code>1,0%</code> are valid.</li>
     *                 <li>Can use <code>+</code> or <code>-</code>. For
     * example,
     *                 <code>-10.99</code> and <code>25+</code> are valid.</li>
     * <li>Can use <code>/</code> between two numbers. For example
     *                 <code>4/1</code> and <code>0.95/0.45</code> are valid.</li>
     * </ul>
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "InsertionText".</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 25, inclusive.</span>
     */
    public java.lang.String getInsertionText() {
        return insertionText;
    }


    /**
     * Sets the insertionText value for this AdParam.
     * 
     * @param insertionText   * Numeric value to insert into the ad text. The following restrictions
     * apply:
     *                 <ul>
     *                 <li>Can use <code><b>,</b></code> or <code><b>.</b></code>
     * as a
     *                 separator, with an optional <code><b>.</b></code>
     * or
     *                 <code><b>,</b></code> (respectively) for fractional
     * values. For
     *                 example, <code>1,000,000.00</code> and <code>2.000.000,10</code>
     * are
     *                 valid.</li>
     *                 <li>Can be prepended or appended with a currency symbol.
     * For example, <code>$99.99</code> and <code>200&pound;</code> are
     *                 valid.</li>
     *                 <li>Can be prepended or appended with a currency code.
     * For example, <code>99.99USD</code> and <code>EUR200</code> are
     *                 valid.</li>
     *                 <li>Can use <code>%</code>. For example, <code>1.0%</code>
     * and
     *                 <code>1,0%</code> are valid.</li>
     *                 <li>Can use <code>+</code> or <code>-</code>. For
     * example,
     *                 <code>-10.99</code> and <code>25+</code> are valid.</li>
     * <li>Can use <code>/</code> between two numbers. For example
     *                 <code>4/1</code> and <code>0.95/0.45</code> are valid.</li>
     * </ul>
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "InsertionText".</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 25, inclusive.</span>
     */
    public void setInsertionText(java.lang.String insertionText) {
        this.insertionText = insertionText;
    }


    /**
     * Gets the paramIndex value for this AdParam.
     * 
     * @return paramIndex   * Defines which parameterized snippet of ad text to replace.
     * For example, a
     *                 value of <code>1</code> indicates a replacement for
     * the
     *                 <code>{<b>param1</b>:<var>default-value</var>}</code>
     * token.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ParamIndex".</span>
     *                 <span class="constraint InRange">This field must be
     * between 1 and 2, inclusive.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.Integer getParamIndex() {
        return paramIndex;
    }


    /**
     * Sets the paramIndex value for this AdParam.
     * 
     * @param paramIndex   * Defines which parameterized snippet of ad text to replace.
     * For example, a
     *                 value of <code>1</code> indicates a replacement for
     * the
     *                 <code>{<b>param1</b>:<var>default-value</var>}</code>
     * token.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ParamIndex".</span>
     *                 <span class="constraint InRange">This field must be
     * between 1 and 2, inclusive.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setParamIndex(java.lang.Integer paramIndex) {
        this.paramIndex = paramIndex;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdParam)) return false;
        AdParam other = (AdParam) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adGroupId==null && other.getAdGroupId()==null) || 
             (this.adGroupId!=null &&
              this.adGroupId.equals(other.getAdGroupId()))) &&
            ((this.criterionId==null && other.getCriterionId()==null) || 
             (this.criterionId!=null &&
              this.criterionId.equals(other.getCriterionId()))) &&
            ((this.insertionText==null && other.getInsertionText()==null) || 
             (this.insertionText!=null &&
              this.insertionText.equals(other.getInsertionText()))) &&
            ((this.paramIndex==null && other.getParamIndex()==null) || 
             (this.paramIndex!=null &&
              this.paramIndex.equals(other.getParamIndex())));
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
        if (getAdGroupId() != null) {
            _hashCode += getAdGroupId().hashCode();
        }
        if (getCriterionId() != null) {
            _hashCode += getCriterionId().hashCode();
        }
        if (getInsertionText() != null) {
            _hashCode += getInsertionText().hashCode();
        }
        if (getParamIndex() != null) {
            _hashCode += getParamIndex().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdParam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdParam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "adGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criterionId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "criterionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertionText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "insertionText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paramIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "paramIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
