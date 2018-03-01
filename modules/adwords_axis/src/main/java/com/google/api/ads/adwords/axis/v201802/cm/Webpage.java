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
 * Webpage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Criterion for targeting webpages of an advertiser's website. The
 * website domain name is specified at the campaign level.
 *             <span class="constraint AdxEnabled">This is disabled for
 * AdX when it is contained within Operators: ADD, SET.</span>
 */
public class Webpage  extends com.google.api.ads.adwords.axis.v201802.cm.Criterion  implements java.io.Serializable {
    /* The webpage criterion parameter.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.WebpageParameter parameter;

    /* Keywordless criteria coverage - Computed percentage of website
     * coverage based on the
     *                     website target, negative website targets and negative
     * keywords in the ad group and campaign.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private java.lang.Double criteriaCoverage;

    /* Keywordless criteria samples - List of sample urls that matches
     * with the website target.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private java.lang.String[] criteriaSamples;

    public Webpage() {
    }

    public Webpage(
           java.lang.Long id,
           com.google.api.ads.adwords.axis.v201802.cm.CriterionType type,
           java.lang.String criterionType,
           com.google.api.ads.adwords.axis.v201802.cm.WebpageParameter parameter,
           java.lang.Double criteriaCoverage,
           java.lang.String[] criteriaSamples) {
        super(
            id,
            type,
            criterionType);
        this.parameter = parameter;
        this.criteriaCoverage = criteriaCoverage;
        this.criteriaSamples = criteriaSamples;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("criteriaCoverage", getCriteriaCoverage())
            .add("criteriaSamples", getCriteriaSamples())
            .add("criterionType", getCriterionType())
            .add("id", getId())
            .add("parameter", getParameter())
            .add("type", getType())
            .toString();
    }

    /**
     * Gets the parameter value for this Webpage.
     * 
     * @return parameter   * The webpage criterion parameter.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.WebpageParameter getParameter() {
        return parameter;
    }


    /**
     * Sets the parameter value for this Webpage.
     * 
     * @param parameter   * The webpage criterion parameter.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setParameter(com.google.api.ads.adwords.axis.v201802.cm.WebpageParameter parameter) {
        this.parameter = parameter;
    }


    /**
     * Gets the criteriaCoverage value for this Webpage.
     * 
     * @return criteriaCoverage   * Keywordless criteria coverage - Computed percentage of website
     * coverage based on the
     *                     website target, negative website targets and negative
     * keywords in the ad group and campaign.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public java.lang.Double getCriteriaCoverage() {
        return criteriaCoverage;
    }


    /**
     * Sets the criteriaCoverage value for this Webpage.
     * 
     * @param criteriaCoverage   * Keywordless criteria coverage - Computed percentage of website
     * coverage based on the
     *                     website target, negative website targets and negative
     * keywords in the ad group and campaign.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setCriteriaCoverage(java.lang.Double criteriaCoverage) {
        this.criteriaCoverage = criteriaCoverage;
    }


    /**
     * Gets the criteriaSamples value for this Webpage.
     * 
     * @return criteriaSamples   * Keywordless criteria samples - List of sample urls that matches
     * with the website target.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public java.lang.String[] getCriteriaSamples() {
        return criteriaSamples;
    }


    /**
     * Sets the criteriaSamples value for this Webpage.
     * 
     * @param criteriaSamples   * Keywordless criteria samples - List of sample urls that matches
     * with the website target.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setCriteriaSamples(java.lang.String[] criteriaSamples) {
        this.criteriaSamples = criteriaSamples;
    }

    public java.lang.String getCriteriaSamples(int i) {
        return this.criteriaSamples[i];
    }

    public void setCriteriaSamples(int i, java.lang.String _value) {
        this.criteriaSamples[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Webpage)) return false;
        Webpage other = (Webpage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.parameter==null && other.getParameter()==null) || 
             (this.parameter!=null &&
              this.parameter.equals(other.getParameter()))) &&
            ((this.criteriaCoverage==null && other.getCriteriaCoverage()==null) || 
             (this.criteriaCoverage!=null &&
              this.criteriaCoverage.equals(other.getCriteriaCoverage()))) &&
            ((this.criteriaSamples==null && other.getCriteriaSamples()==null) || 
             (this.criteriaSamples!=null &&
              java.util.Arrays.equals(this.criteriaSamples, other.getCriteriaSamples())));
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
        if (getParameter() != null) {
            _hashCode += getParameter().hashCode();
        }
        if (getCriteriaCoverage() != null) {
            _hashCode += getCriteriaCoverage().hashCode();
        }
        if (getCriteriaSamples() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCriteriaSamples());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCriteriaSamples(), i);
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
        new org.apache.axis.description.TypeDesc(Webpage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Webpage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameter");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "parameter"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "WebpageParameter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criteriaCoverage");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "criteriaCoverage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criteriaSamples");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "criteriaSamples"));
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
