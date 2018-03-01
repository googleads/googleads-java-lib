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
 * VanityPharmaText.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class VanityPharmaText implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VanityPharmaText(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _PRESCRIPTION_TREATMENT_WEBSITE_EN = "PRESCRIPTION_TREATMENT_WEBSITE_EN";
    public static final java.lang.String _PRESCRIPTION_TREATMENT_WEBSITE_ES = "PRESCRIPTION_TREATMENT_WEBSITE_ES";
    public static final java.lang.String _PRESCRIPTION_DEVICE_WEBSITE_EN = "PRESCRIPTION_DEVICE_WEBSITE_EN";
    public static final java.lang.String _PRESCRIPTION_DEVICE_WEBSITE_ES = "PRESCRIPTION_DEVICE_WEBSITE_ES";
    public static final java.lang.String _MEDICAL_DEVICE_WEBSITE_EN = "MEDICAL_DEVICE_WEBSITE_EN";
    public static final java.lang.String _MEDICAL_DEVICE_WEBSITE_ES = "MEDICAL_DEVICE_WEBSITE_ES";
    public static final java.lang.String _PREVENTATIVE_TREATMENT_WEBSITE_EN = "PREVENTATIVE_TREATMENT_WEBSITE_EN";
    public static final java.lang.String _PREVENTATIVE_TREATMENT_WEBSITE_ES = "PREVENTATIVE_TREATMENT_WEBSITE_ES";
    public static final java.lang.String _PRESCRIPTION_CONTRACEPTION_WEBSITE_EN = "PRESCRIPTION_CONTRACEPTION_WEBSITE_EN";
    public static final java.lang.String _PRESCRIPTION_CONTRACEPTION_WEBSITE_ES = "PRESCRIPTION_CONTRACEPTION_WEBSITE_ES";
    public static final java.lang.String _PRESCRIPTION_VACCINE_WEBSITE_EN = "PRESCRIPTION_VACCINE_WEBSITE_EN";
    public static final java.lang.String _PRESCRIPTION_VACCINE_WEBSITE_ES = "PRESCRIPTION_VACCINE_WEBSITE_ES";
    public static final VanityPharmaText UNKNOWN = new VanityPharmaText(_UNKNOWN);
    public static final VanityPharmaText PRESCRIPTION_TREATMENT_WEBSITE_EN = new VanityPharmaText(_PRESCRIPTION_TREATMENT_WEBSITE_EN);
    public static final VanityPharmaText PRESCRIPTION_TREATMENT_WEBSITE_ES = new VanityPharmaText(_PRESCRIPTION_TREATMENT_WEBSITE_ES);
    public static final VanityPharmaText PRESCRIPTION_DEVICE_WEBSITE_EN = new VanityPharmaText(_PRESCRIPTION_DEVICE_WEBSITE_EN);
    public static final VanityPharmaText PRESCRIPTION_DEVICE_WEBSITE_ES = new VanityPharmaText(_PRESCRIPTION_DEVICE_WEBSITE_ES);
    public static final VanityPharmaText MEDICAL_DEVICE_WEBSITE_EN = new VanityPharmaText(_MEDICAL_DEVICE_WEBSITE_EN);
    public static final VanityPharmaText MEDICAL_DEVICE_WEBSITE_ES = new VanityPharmaText(_MEDICAL_DEVICE_WEBSITE_ES);
    public static final VanityPharmaText PREVENTATIVE_TREATMENT_WEBSITE_EN = new VanityPharmaText(_PREVENTATIVE_TREATMENT_WEBSITE_EN);
    public static final VanityPharmaText PREVENTATIVE_TREATMENT_WEBSITE_ES = new VanityPharmaText(_PREVENTATIVE_TREATMENT_WEBSITE_ES);
    public static final VanityPharmaText PRESCRIPTION_CONTRACEPTION_WEBSITE_EN = new VanityPharmaText(_PRESCRIPTION_CONTRACEPTION_WEBSITE_EN);
    public static final VanityPharmaText PRESCRIPTION_CONTRACEPTION_WEBSITE_ES = new VanityPharmaText(_PRESCRIPTION_CONTRACEPTION_WEBSITE_ES);
    public static final VanityPharmaText PRESCRIPTION_VACCINE_WEBSITE_EN = new VanityPharmaText(_PRESCRIPTION_VACCINE_WEBSITE_EN);
    public static final VanityPharmaText PRESCRIPTION_VACCINE_WEBSITE_ES = new VanityPharmaText(_PRESCRIPTION_VACCINE_WEBSITE_ES);
    public java.lang.String getValue() { return _value_;}
    public static VanityPharmaText fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VanityPharmaText enumeration = (VanityPharmaText)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VanityPharmaText fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VanityPharmaText.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "VanityPharmaText"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
