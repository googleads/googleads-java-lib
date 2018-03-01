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
 * PromotionExtensionOccasion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class PromotionExtensionOccasion implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PromotionExtensionOccasion(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _NEW_YEARS = "NEW_YEARS";
    public static final java.lang.String _VALENTINES_DAY = "VALENTINES_DAY";
    public static final java.lang.String _EASTER = "EASTER";
    public static final java.lang.String _MOTHERS_DAY = "MOTHERS_DAY";
    public static final java.lang.String _FATHERS_DAY = "FATHERS_DAY";
    public static final java.lang.String _LABOR_DAY = "LABOR_DAY";
    public static final java.lang.String _BACK_TO_SCHOOL = "BACK_TO_SCHOOL";
    public static final java.lang.String _HALLOWEEN = "HALLOWEEN";
    public static final java.lang.String _BLACK_FRIDAY = "BLACK_FRIDAY";
    public static final java.lang.String _CYBER_MONDAY = "CYBER_MONDAY";
    public static final java.lang.String _CHRISTMAS = "CHRISTMAS";
    public static final java.lang.String _BOXING_DAY = "BOXING_DAY";
    public static final java.lang.String _NONE = "NONE";
    public static final PromotionExtensionOccasion UNKNOWN = new PromotionExtensionOccasion(_UNKNOWN);
    public static final PromotionExtensionOccasion NEW_YEARS = new PromotionExtensionOccasion(_NEW_YEARS);
    public static final PromotionExtensionOccasion VALENTINES_DAY = new PromotionExtensionOccasion(_VALENTINES_DAY);
    public static final PromotionExtensionOccasion EASTER = new PromotionExtensionOccasion(_EASTER);
    public static final PromotionExtensionOccasion MOTHERS_DAY = new PromotionExtensionOccasion(_MOTHERS_DAY);
    public static final PromotionExtensionOccasion FATHERS_DAY = new PromotionExtensionOccasion(_FATHERS_DAY);
    public static final PromotionExtensionOccasion LABOR_DAY = new PromotionExtensionOccasion(_LABOR_DAY);
    public static final PromotionExtensionOccasion BACK_TO_SCHOOL = new PromotionExtensionOccasion(_BACK_TO_SCHOOL);
    public static final PromotionExtensionOccasion HALLOWEEN = new PromotionExtensionOccasion(_HALLOWEEN);
    public static final PromotionExtensionOccasion BLACK_FRIDAY = new PromotionExtensionOccasion(_BLACK_FRIDAY);
    public static final PromotionExtensionOccasion CYBER_MONDAY = new PromotionExtensionOccasion(_CYBER_MONDAY);
    public static final PromotionExtensionOccasion CHRISTMAS = new PromotionExtensionOccasion(_CHRISTMAS);
    public static final PromotionExtensionOccasion BOXING_DAY = new PromotionExtensionOccasion(_BOXING_DAY);
    public static final PromotionExtensionOccasion NONE = new PromotionExtensionOccasion(_NONE);
    public java.lang.String getValue() { return _value_;}
    public static PromotionExtensionOccasion fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PromotionExtensionOccasion enumeration = (PromotionExtensionOccasion)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PromotionExtensionOccasion fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PromotionExtensionOccasion.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PromotionExtensionOccasion"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
