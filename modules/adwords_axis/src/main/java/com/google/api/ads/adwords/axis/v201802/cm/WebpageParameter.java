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
 * WebpageParameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Parameter of Webpage criterion, expressed as a list of conditions,
 * or
 *             logical expressions, for targeting webpages of an advertiser's
 * website.
 */
public class WebpageParameter  extends com.google.api.ads.adwords.axis.v201802.cm.CriterionParameter  implements java.io.Serializable {
    /* The name of the criterion that is defined by this parameter.
     * 
     *                     <p>This name value will be used for identifying,
     * sorting and filtering
     *                     criteria with this type of parameters. For criteria
     * with simpler
     *                     parameters, such as keywords and placements, the
     * parameter value itself
     *                     is used for identification, sorting and filtering.
     * <span class="constraint Required">This field is required and should
     * not be {@code null}.</span>
     *                     <span class="constraint StringLength">The length
     * of this string should be between 1 and 2048, inclusive.</span> */
    private java.lang.String criterionName;

    /* Conditions, or logical expressions, for webpage targeting.
     *                     
     *                     <p>The list of webpage targeting conditions are
     * {@code and}-ed together
     *                     when evaluated for targeting. A {@code null} list
     * of conditions means that
     *                     all webpages of the campaign's website are targeted.</p>
     * <span class="constraint CollectionSize">The maximum size of this collection
     * is 3.</span>
     *                     <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.WebpageCondition[] conditions;

    public WebpageParameter() {
    }

    public WebpageParameter(
           java.lang.String criterionParameterType,
           java.lang.String criterionName,
           com.google.api.ads.adwords.axis.v201802.cm.WebpageCondition[] conditions) {
        super(
            criterionParameterType);
        this.criterionName = criterionName;
        this.conditions = conditions;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("conditions", getConditions())
            .add("criterionName", getCriterionName())
            .add("criterionParameterType", getCriterionParameterType())
            .toString();
    }

    /**
     * Gets the criterionName value for this WebpageParameter.
     * 
     * @return criterionName   * The name of the criterion that is defined by this parameter.
     * 
     *                     <p>This name value will be used for identifying,
     * sorting and filtering
     *                     criteria with this type of parameters. For criteria
     * with simpler
     *                     parameters, such as keywords and placements, the
     * parameter value itself
     *                     is used for identification, sorting and filtering.
     * <span class="constraint Required">This field is required and should
     * not be {@code null}.</span>
     *                     <span class="constraint StringLength">The length
     * of this string should be between 1 and 2048, inclusive.</span>
     */
    public java.lang.String getCriterionName() {
        return criterionName;
    }


    /**
     * Sets the criterionName value for this WebpageParameter.
     * 
     * @param criterionName   * The name of the criterion that is defined by this parameter.
     * 
     *                     <p>This name value will be used for identifying,
     * sorting and filtering
     *                     criteria with this type of parameters. For criteria
     * with simpler
     *                     parameters, such as keywords and placements, the
     * parameter value itself
     *                     is used for identification, sorting and filtering.
     * <span class="constraint Required">This field is required and should
     * not be {@code null}.</span>
     *                     <span class="constraint StringLength">The length
     * of this string should be between 1 and 2048, inclusive.</span>
     */
    public void setCriterionName(java.lang.String criterionName) {
        this.criterionName = criterionName;
    }


    /**
     * Gets the conditions value for this WebpageParameter.
     * 
     * @return conditions   * Conditions, or logical expressions, for webpage targeting.
     *                     
     *                     <p>The list of webpage targeting conditions are
     * {@code and}-ed together
     *                     when evaluated for targeting. A {@code null} list
     * of conditions means that
     *                     all webpages of the campaign's website are targeted.</p>
     * <span class="constraint CollectionSize">The maximum size of this collection
     * is 3.</span>
     *                     <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.WebpageCondition[] getConditions() {
        return conditions;
    }


    /**
     * Sets the conditions value for this WebpageParameter.
     * 
     * @param conditions   * Conditions, or logical expressions, for webpage targeting.
     *                     
     *                     <p>The list of webpage targeting conditions are
     * {@code and}-ed together
     *                     when evaluated for targeting. A {@code null} list
     * of conditions means that
     *                     all webpages of the campaign's website are targeted.</p>
     * <span class="constraint CollectionSize">The maximum size of this collection
     * is 3.</span>
     *                     <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span>
     */
    public void setConditions(com.google.api.ads.adwords.axis.v201802.cm.WebpageCondition[] conditions) {
        this.conditions = conditions;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.WebpageCondition getConditions(int i) {
        return this.conditions[i];
    }

    public void setConditions(int i, com.google.api.ads.adwords.axis.v201802.cm.WebpageCondition _value) {
        this.conditions[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WebpageParameter)) return false;
        WebpageParameter other = (WebpageParameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.criterionName==null && other.getCriterionName()==null) || 
             (this.criterionName!=null &&
              this.criterionName.equals(other.getCriterionName()))) &&
            ((this.conditions==null && other.getConditions()==null) || 
             (this.conditions!=null &&
              java.util.Arrays.equals(this.conditions, other.getConditions())));
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
        if (getCriterionName() != null) {
            _hashCode += getCriterionName().hashCode();
        }
        if (getConditions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConditions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConditions(), i);
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
        new org.apache.axis.description.TypeDesc(WebpageParameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "WebpageParameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criterionName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "criterionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conditions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "conditions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "WebpageCondition"));
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
