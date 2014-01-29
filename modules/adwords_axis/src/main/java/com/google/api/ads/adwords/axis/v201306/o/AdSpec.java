/**
 * AdSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201306.o;


/**
 * Interface for ad specifications to implement. See individual spec
 * documentation for more details on how to use each type, and
 *             {@link AdSpecListSearchParameter} to understand what these
 * specs are for.
 */
public class AdSpec  implements java.io.Serializable {
    private com.google.api.ads.adwords.axis.v201306.o.DisplayAdSpec displayAdSpec;

    private com.google.api.ads.adwords.axis.v201306.o.InStreamAdSpec inStreamAdSpec;

    private com.google.api.ads.adwords.axis.v201306.o.TextAdSpec textAdSpec;

    public AdSpec() {
    }

    public AdSpec(
           com.google.api.ads.adwords.axis.v201306.o.DisplayAdSpec displayAdSpec,
           com.google.api.ads.adwords.axis.v201306.o.InStreamAdSpec inStreamAdSpec,
           com.google.api.ads.adwords.axis.v201306.o.TextAdSpec textAdSpec) {
           this.displayAdSpec = displayAdSpec;
           this.inStreamAdSpec = inStreamAdSpec;
           this.textAdSpec = textAdSpec;
    }


    /**
     * Gets the displayAdSpec value for this AdSpec.
     * 
     * @return displayAdSpec
     */
    public com.google.api.ads.adwords.axis.v201306.o.DisplayAdSpec getDisplayAdSpec() {
        return displayAdSpec;
    }


    /**
     * Sets the displayAdSpec value for this AdSpec.
     * 
     * @param displayAdSpec
     */
    public void setDisplayAdSpec(com.google.api.ads.adwords.axis.v201306.o.DisplayAdSpec displayAdSpec) {
        this.displayAdSpec = displayAdSpec;
    }


    /**
     * Gets the inStreamAdSpec value for this AdSpec.
     * 
     * @return inStreamAdSpec
     */
    public com.google.api.ads.adwords.axis.v201306.o.InStreamAdSpec getInStreamAdSpec() {
        return inStreamAdSpec;
    }


    /**
     * Sets the inStreamAdSpec value for this AdSpec.
     * 
     * @param inStreamAdSpec
     */
    public void setInStreamAdSpec(com.google.api.ads.adwords.axis.v201306.o.InStreamAdSpec inStreamAdSpec) {
        this.inStreamAdSpec = inStreamAdSpec;
    }


    /**
     * Gets the textAdSpec value for this AdSpec.
     * 
     * @return textAdSpec
     */
    public com.google.api.ads.adwords.axis.v201306.o.TextAdSpec getTextAdSpec() {
        return textAdSpec;
    }


    /**
     * Sets the textAdSpec value for this AdSpec.
     * 
     * @param textAdSpec
     */
    public void setTextAdSpec(com.google.api.ads.adwords.axis.v201306.o.TextAdSpec textAdSpec) {
        this.textAdSpec = textAdSpec;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdSpec)) return false;
        AdSpec other = (AdSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.displayAdSpec==null && other.getDisplayAdSpec()==null) || 
             (this.displayAdSpec!=null &&
              this.displayAdSpec.equals(other.getDisplayAdSpec()))) &&
            ((this.inStreamAdSpec==null && other.getInStreamAdSpec()==null) || 
             (this.inStreamAdSpec!=null &&
              this.inStreamAdSpec.equals(other.getInStreamAdSpec()))) &&
            ((this.textAdSpec==null && other.getTextAdSpec()==null) || 
             (this.textAdSpec!=null &&
              this.textAdSpec.equals(other.getTextAdSpec())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDisplayAdSpec() != null) {
            _hashCode += getDisplayAdSpec().hashCode();
        }
        if (getInStreamAdSpec() != null) {
            _hashCode += getInStreamAdSpec().hashCode();
        }
        if (getTextAdSpec() != null) {
            _hashCode += getTextAdSpec().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201306", "AdSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayAdSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201306", "DisplayAdSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201306", "DisplayAdSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inStreamAdSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201306", "InStreamAdSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201306", "InStreamAdSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textAdSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201306", "TextAdSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201306", "TextAdSpec"));
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
