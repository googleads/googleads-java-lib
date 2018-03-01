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
 * KeywordEstimateRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.o;


/**
 * Represents a keyword to be estimated.
 */
public class KeywordEstimateRequest  extends com.google.api.ads.adwords.axis.v201802.o.EstimateRequest  implements java.io.Serializable {
    /* The {@link Keyword} to estimate. The keyword text is required
     * regardless
     *                     of whether the keyword ID is included. The keyword
     * ID is optional and has
     *                     the following characteristics:
     *                     <ul>
     *                     <li>When omitted, the ID indicates a new keyword
     * to be estimated.</li>
     *                     <li>When present with a campaign and ad group
     * also specified, the ID should
     *                     be for an existing keyword in the ad group. This
     * can improve the estimates
     *                     since historical performance is known.</li>
     *                     <li>When present without a campaign and ad group
     * specified, the ID is
     *                     ignored.</li>
     *                     </ul>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.Keyword keyword;

    /* The max CPC bid for this keyword.
     *                     
     *                     In general, the {@code maxCpc} of a {@link KeywordEstimateRequest}
     * is
     *                     optional, since there is usually another {@code
     * maxCpc} that can be used,
     *                     such as the {@code maxCpc} on an existing keyword,
     * an existing or
     *                     overriding {@code maxCpc} of containing {@link
     * AdGroupEstimateRequest}.
     *                     However, if there is no backup value of {@code
     * maxCpc} anywhere along the
     *                     line, you must provide a value for {@code maxCpc}
     * in
     *                     {@link KeywordEstimateRequest}. This would happen,
     * for example, if the
     *                     {@link KeywordEstimateRequest} is for a new keyword. */
    private com.google.api.ads.adwords.axis.v201802.cm.Money maxCpc;

    /* Whether the keyword is negative or not. The default value is
     * false.
     *                     If negative, no current ad group ads will appear
     * for searches containing
     *                     this keyword.<p>
     *                     
     *                     The estimate for negative keywords should reflect
     * no traffic and zero CPC,
     *                     but including a negative keyword will affect the
     * other estimates in the
     *                     request. */
    private java.lang.Boolean isNegative;

    public KeywordEstimateRequest() {
    }

    public KeywordEstimateRequest(
           java.lang.String estimateRequestType,
           com.google.api.ads.adwords.axis.v201802.cm.Keyword keyword,
           com.google.api.ads.adwords.axis.v201802.cm.Money maxCpc,
           java.lang.Boolean isNegative) {
        super(
            estimateRequestType);
        this.keyword = keyword;
        this.maxCpc = maxCpc;
        this.isNegative = isNegative;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("estimateRequestType", getEstimateRequestType())
            .add("isNegative", getIsNegative())
            .add("keyword", getKeyword())
            .add("maxCpc", getMaxCpc())
            .toString();
    }

    /**
     * Gets the keyword value for this KeywordEstimateRequest.
     * 
     * @return keyword   * The {@link Keyword} to estimate. The keyword text is required
     * regardless
     *                     of whether the keyword ID is included. The keyword
     * ID is optional and has
     *                     the following characteristics:
     *                     <ul>
     *                     <li>When omitted, the ID indicates a new keyword
     * to be estimated.</li>
     *                     <li>When present with a campaign and ad group
     * also specified, the ID should
     *                     be for an existing keyword in the ad group. This
     * can improve the estimates
     *                     since historical performance is known.</li>
     *                     <li>When present without a campaign and ad group
     * specified, the ID is
     *                     ignored.</li>
     *                     </ul>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Keyword getKeyword() {
        return keyword;
    }


    /**
     * Sets the keyword value for this KeywordEstimateRequest.
     * 
     * @param keyword   * The {@link Keyword} to estimate. The keyword text is required
     * regardless
     *                     of whether the keyword ID is included. The keyword
     * ID is optional and has
     *                     the following characteristics:
     *                     <ul>
     *                     <li>When omitted, the ID indicates a new keyword
     * to be estimated.</li>
     *                     <li>When present with a campaign and ad group
     * also specified, the ID should
     *                     be for an existing keyword in the ad group. This
     * can improve the estimates
     *                     since historical performance is known.</li>
     *                     <li>When present without a campaign and ad group
     * specified, the ID is
     *                     ignored.</li>
     *                     </ul>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setKeyword(com.google.api.ads.adwords.axis.v201802.cm.Keyword keyword) {
        this.keyword = keyword;
    }


    /**
     * Gets the maxCpc value for this KeywordEstimateRequest.
     * 
     * @return maxCpc   * The max CPC bid for this keyword.
     *                     
     *                     In general, the {@code maxCpc} of a {@link KeywordEstimateRequest}
     * is
     *                     optional, since there is usually another {@code
     * maxCpc} that can be used,
     *                     such as the {@code maxCpc} on an existing keyword,
     * an existing or
     *                     overriding {@code maxCpc} of containing {@link
     * AdGroupEstimateRequest}.
     *                     However, if there is no backup value of {@code
     * maxCpc} anywhere along the
     *                     line, you must provide a value for {@code maxCpc}
     * in
     *                     {@link KeywordEstimateRequest}. This would happen,
     * for example, if the
     *                     {@link KeywordEstimateRequest} is for a new keyword.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Money getMaxCpc() {
        return maxCpc;
    }


    /**
     * Sets the maxCpc value for this KeywordEstimateRequest.
     * 
     * @param maxCpc   * The max CPC bid for this keyword.
     *                     
     *                     In general, the {@code maxCpc} of a {@link KeywordEstimateRequest}
     * is
     *                     optional, since there is usually another {@code
     * maxCpc} that can be used,
     *                     such as the {@code maxCpc} on an existing keyword,
     * an existing or
     *                     overriding {@code maxCpc} of containing {@link
     * AdGroupEstimateRequest}.
     *                     However, if there is no backup value of {@code
     * maxCpc} anywhere along the
     *                     line, you must provide a value for {@code maxCpc}
     * in
     *                     {@link KeywordEstimateRequest}. This would happen,
     * for example, if the
     *                     {@link KeywordEstimateRequest} is for a new keyword.
     */
    public void setMaxCpc(com.google.api.ads.adwords.axis.v201802.cm.Money maxCpc) {
        this.maxCpc = maxCpc;
    }


    /**
     * Gets the isNegative value for this KeywordEstimateRequest.
     * 
     * @return isNegative   * Whether the keyword is negative or not. The default value is
     * false.
     *                     If negative, no current ad group ads will appear
     * for searches containing
     *                     this keyword.<p>
     *                     
     *                     The estimate for negative keywords should reflect
     * no traffic and zero CPC,
     *                     but including a negative keyword will affect the
     * other estimates in the
     *                     request.
     */
    public java.lang.Boolean getIsNegative() {
        return isNegative;
    }


    /**
     * Sets the isNegative value for this KeywordEstimateRequest.
     * 
     * @param isNegative   * Whether the keyword is negative or not. The default value is
     * false.
     *                     If negative, no current ad group ads will appear
     * for searches containing
     *                     this keyword.<p>
     *                     
     *                     The estimate for negative keywords should reflect
     * no traffic and zero CPC,
     *                     but including a negative keyword will affect the
     * other estimates in the
     *                     request.
     */
    public void setIsNegative(java.lang.Boolean isNegative) {
        this.isNegative = isNegative;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KeywordEstimateRequest)) return false;
        KeywordEstimateRequest other = (KeywordEstimateRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.keyword==null && other.getKeyword()==null) || 
             (this.keyword!=null &&
              this.keyword.equals(other.getKeyword()))) &&
            ((this.maxCpc==null && other.getMaxCpc()==null) || 
             (this.maxCpc!=null &&
              this.maxCpc.equals(other.getMaxCpc()))) &&
            ((this.isNegative==null && other.getIsNegative()==null) || 
             (this.isNegative!=null &&
              this.isNegative.equals(other.getIsNegative())));
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
        if (getKeyword() != null) {
            _hashCode += getKeyword().hashCode();
        }
        if (getMaxCpc() != null) {
            _hashCode += getMaxCpc().hashCode();
        }
        if (getIsNegative() != null) {
            _hashCode += getIsNegative().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KeywordEstimateRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "KeywordEstimateRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyword");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "keyword"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Keyword"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxCpc");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "maxCpc"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNegative");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "isNegative"));
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
