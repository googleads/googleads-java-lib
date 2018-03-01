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
 * DisplayAttribute.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Attributes for Text Labels.
 */
public class DisplayAttribute  extends com.google.api.ads.adwords.axis.v201802.cm.LabelAttribute  implements java.io.Serializable {
    /* Background color of the label in RGB format.
     *                     <span class="constraint MatchesRegex">A background
     * color string must begin with a '#' character followed by either 6
     * or 3 hexadecimal characters (24 vs. 12 bits). This is checked by the
     * regular expression '^\#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$'.</span> */
    private java.lang.String backgroundColor;

    /* A short description of the label.
     *                     <span class="constraint StringLength">The length
     * of this string should be between 0 and 200, inclusive.</span> */
    private java.lang.String description;

    public DisplayAttribute() {
    }

    public DisplayAttribute(
           java.lang.String labelAttributeType,
           java.lang.String backgroundColor,
           java.lang.String description) {
        super(
            labelAttributeType);
        this.backgroundColor = backgroundColor;
        this.description = description;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("backgroundColor", getBackgroundColor())
            .add("description", getDescription())
            .add("labelAttributeType", getLabelAttributeType())
            .toString();
    }

    /**
     * Gets the backgroundColor value for this DisplayAttribute.
     * 
     * @return backgroundColor   * Background color of the label in RGB format.
     *                     <span class="constraint MatchesRegex">A background
     * color string must begin with a '#' character followed by either 6
     * or 3 hexadecimal characters (24 vs. 12 bits). This is checked by the
     * regular expression '^\#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$'.</span>
     */
    public java.lang.String getBackgroundColor() {
        return backgroundColor;
    }


    /**
     * Sets the backgroundColor value for this DisplayAttribute.
     * 
     * @param backgroundColor   * Background color of the label in RGB format.
     *                     <span class="constraint MatchesRegex">A background
     * color string must begin with a '#' character followed by either 6
     * or 3 hexadecimal characters (24 vs. 12 bits). This is checked by the
     * regular expression '^\#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$'.</span>
     */
    public void setBackgroundColor(java.lang.String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }


    /**
     * Gets the description value for this DisplayAttribute.
     * 
     * @return description   * A short description of the label.
     *                     <span class="constraint StringLength">The length
     * of this string should be between 0 and 200, inclusive.</span>
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this DisplayAttribute.
     * 
     * @param description   * A short description of the label.
     *                     <span class="constraint StringLength">The length
     * of this string should be between 0 and 200, inclusive.</span>
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DisplayAttribute)) return false;
        DisplayAttribute other = (DisplayAttribute) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.backgroundColor==null && other.getBackgroundColor()==null) || 
             (this.backgroundColor!=null &&
              this.backgroundColor.equals(other.getBackgroundColor()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription())));
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
        if (getBackgroundColor() != null) {
            _hashCode += getBackgroundColor().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DisplayAttribute.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "DisplayAttribute"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backgroundColor");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "backgroundColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
