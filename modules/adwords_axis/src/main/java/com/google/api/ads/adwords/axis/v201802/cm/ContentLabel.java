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
 * ContentLabel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Content Label for category exclusion.
 *             <span class="constraint AdxEnabled">This is enabled for
 * AdX.</span>
 */
public class ContentLabel  extends com.google.api.ads.adwords.axis.v201802.cm.Criterion  implements java.io.Serializable {
    /* Content label type
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.ContentLabelType contentLabelType;

    public ContentLabel() {
    }

    public ContentLabel(
           java.lang.Long id,
           com.google.api.ads.adwords.axis.v201802.cm.CriterionType type,
           java.lang.String criterionType,
           com.google.api.ads.adwords.axis.v201802.cm.ContentLabelType contentLabelType) {
        super(
            id,
            type,
            criterionType);
        this.contentLabelType = contentLabelType;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("contentLabelType", getContentLabelType())
            .add("criterionType", getCriterionType())
            .add("id", getId())
            .add("type", getType())
            .toString();
    }

    /**
     * Gets the contentLabelType value for this ContentLabel.
     * 
     * @return contentLabelType   * Content label type
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.ContentLabelType getContentLabelType() {
        return contentLabelType;
    }


    /**
     * Sets the contentLabelType value for this ContentLabel.
     * 
     * @param contentLabelType   * Content label type
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setContentLabelType(com.google.api.ads.adwords.axis.v201802.cm.ContentLabelType contentLabelType) {
        this.contentLabelType = contentLabelType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContentLabel)) return false;
        ContentLabel other = (ContentLabel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.contentLabelType==null && other.getContentLabelType()==null) || 
             (this.contentLabelType!=null &&
              this.contentLabelType.equals(other.getContentLabelType())));
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
        if (getContentLabelType() != null) {
            _hashCode += getContentLabelType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContentLabel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ContentLabel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentLabelType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "contentLabelType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ContentLabelType"));
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
