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
 * AssetCreativeTemplateVariable.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Represents a file asset variable defined in a creative template.
 * <p>
 *             Use {@link AssetCreativeTemplateVariableValue} to specify
 * the value
 *             for this variable when creating {@link TemplateCreative}
 * from the {@link TemplateCreative}.
 */
public class AssetCreativeTemplateVariable  extends com.google.api.ads.dfp.axis.v201802.CreativeTemplateVariable  implements java.io.Serializable {
    /* A set of supported mime types. This set can be empty or null
     * if there's no
     *                     constraint, meaning files of any mime types are
     * allowed. */
    private com.google.api.ads.dfp.axis.v201802.AssetCreativeTemplateVariableMimeType[] mimeTypes;

    public AssetCreativeTemplateVariable() {
    }

    public AssetCreativeTemplateVariable(
           java.lang.String label,
           java.lang.String uniqueName,
           java.lang.String description,
           java.lang.Boolean isRequired,
           com.google.api.ads.dfp.axis.v201802.AssetCreativeTemplateVariableMimeType[] mimeTypes) {
        super(
            label,
            uniqueName,
            description,
            isRequired);
        this.mimeTypes = mimeTypes;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("description", getDescription())
            .add("isRequired", getIsRequired())
            .add("label", getLabel())
            .add("mimeTypes", getMimeTypes())
            .add("uniqueName", getUniqueName())
            .toString();
    }

    /**
     * Gets the mimeTypes value for this AssetCreativeTemplateVariable.
     * 
     * @return mimeTypes   * A set of supported mime types. This set can be empty or null
     * if there's no
     *                     constraint, meaning files of any mime types are
     * allowed.
     */
    public com.google.api.ads.dfp.axis.v201802.AssetCreativeTemplateVariableMimeType[] getMimeTypes() {
        return mimeTypes;
    }


    /**
     * Sets the mimeTypes value for this AssetCreativeTemplateVariable.
     * 
     * @param mimeTypes   * A set of supported mime types. This set can be empty or null
     * if there's no
     *                     constraint, meaning files of any mime types are
     * allowed.
     */
    public void setMimeTypes(com.google.api.ads.dfp.axis.v201802.AssetCreativeTemplateVariableMimeType[] mimeTypes) {
        this.mimeTypes = mimeTypes;
    }

    public com.google.api.ads.dfp.axis.v201802.AssetCreativeTemplateVariableMimeType getMimeTypes(int i) {
        return this.mimeTypes[i];
    }

    public void setMimeTypes(int i, com.google.api.ads.dfp.axis.v201802.AssetCreativeTemplateVariableMimeType _value) {
        this.mimeTypes[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AssetCreativeTemplateVariable)) return false;
        AssetCreativeTemplateVariable other = (AssetCreativeTemplateVariable) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.mimeTypes==null && other.getMimeTypes()==null) || 
             (this.mimeTypes!=null &&
              java.util.Arrays.equals(this.mimeTypes, other.getMimeTypes())));
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
        if (getMimeTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMimeTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMimeTypes(), i);
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
        new org.apache.axis.description.TypeDesc(AssetCreativeTemplateVariable.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "AssetCreativeTemplateVariable"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimeTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "mimeTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "AssetCreativeTemplateVariable.MimeType"));
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
