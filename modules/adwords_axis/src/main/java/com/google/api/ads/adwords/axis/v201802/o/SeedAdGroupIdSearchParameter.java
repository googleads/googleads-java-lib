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
 * SeedAdGroupIdSearchParameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.o;


/**
 * A {@link SearchParameter} for {@code KEYWORD} {@link IdeaType}s
 * that specifies that the supplied AdGroup should be used as a seed
 *             for generating new ideas. For example, an AdGroup's keywords
 * would be used to generate new and related keywords.
 *             <p>This element is supported by following {@link IdeaType}s:
 * KEYWORD.
 *             <p>This element is supported by following {@link RequestType}s:
 * IDEAS.
 */
public class SeedAdGroupIdSearchParameter  extends com.google.api.ads.adwords.axis.v201802.o.SearchParameter  implements java.io.Serializable {
    /* The id for the ad group that should be used as a seed for generating
     * new ideas.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private java.lang.Long adGroupId;

    public SeedAdGroupIdSearchParameter() {
    }

    public SeedAdGroupIdSearchParameter(
           java.lang.String searchParameterType,
           java.lang.Long adGroupId) {
        super(
            searchParameterType);
        this.adGroupId = adGroupId;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adGroupId", getAdGroupId())
            .add("searchParameterType", getSearchParameterType())
            .toString();
    }

    /**
     * Gets the adGroupId value for this SeedAdGroupIdSearchParameter.
     * 
     * @return adGroupId   * The id for the ad group that should be used as a seed for generating
     * new ideas.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public java.lang.Long getAdGroupId() {
        return adGroupId;
    }


    /**
     * Sets the adGroupId value for this SeedAdGroupIdSearchParameter.
     * 
     * @param adGroupId   * The id for the ad group that should be used as a seed for generating
     * new ideas.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setAdGroupId(java.lang.Long adGroupId) {
        this.adGroupId = adGroupId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeedAdGroupIdSearchParameter)) return false;
        SeedAdGroupIdSearchParameter other = (SeedAdGroupIdSearchParameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.adGroupId==null && other.getAdGroupId()==null) || 
             (this.adGroupId!=null &&
              this.adGroupId.equals(other.getAdGroupId())));
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
        if (getAdGroupId() != null) {
            _hashCode += getAdGroupId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeedAdGroupIdSearchParameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "SeedAdGroupIdSearchParameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "adGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
