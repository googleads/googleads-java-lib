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
 * TargetingSetting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Setting for targeting related features.
 *             This is applicable at Campaign and AdGroup level.
 */
public class TargetingSetting  extends com.google.api.ads.adwords.axis.v201802.cm.Setting  implements java.io.Serializable {
    /* The list of per-criterion-type-group targeting settings. */
    private com.google.api.ads.adwords.axis.v201802.cm.TargetingSettingDetail[] details;

    public TargetingSetting() {
    }

    public TargetingSetting(
           java.lang.String settingType,
           com.google.api.ads.adwords.axis.v201802.cm.TargetingSettingDetail[] details) {
        super(
            settingType);
        this.details = details;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("details", getDetails())
            .add("settingType", getSettingType())
            .toString();
    }

    /**
     * Gets the details value for this TargetingSetting.
     * 
     * @return details   * The list of per-criterion-type-group targeting settings.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.TargetingSettingDetail[] getDetails() {
        return details;
    }


    /**
     * Sets the details value for this TargetingSetting.
     * 
     * @param details   * The list of per-criterion-type-group targeting settings.
     */
    public void setDetails(com.google.api.ads.adwords.axis.v201802.cm.TargetingSettingDetail[] details) {
        this.details = details;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.TargetingSettingDetail getDetails(int i) {
        return this.details[i];
    }

    public void setDetails(int i, com.google.api.ads.adwords.axis.v201802.cm.TargetingSettingDetail _value) {
        this.details[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TargetingSetting)) return false;
        TargetingSetting other = (TargetingSetting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.details==null && other.getDetails()==null) || 
             (this.details!=null &&
              java.util.Arrays.equals(this.details, other.getDetails())));
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
        if (getDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetails(), i);
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
        new org.apache.axis.description.TypeDesc(TargetingSetting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TargetingSetting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("details");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "details"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TargetingSettingDetail"));
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
