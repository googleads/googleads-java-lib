/**
 * HTMLCreativeBase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public abstract class HTMLCreativeBase  extends com.google.api.ads.dfa.axis.v1_19.CreativeBase  implements java.io.Serializable {
    private java.lang.String HTMLCode;

    private com.google.api.ads.dfa.axis.v1_19.HTMLCreativeAsset[] creativeAssets;

    public HTMLCreativeBase() {
    }

    public HTMLCreativeBase(
           long id,
           java.lang.String name,
           boolean active,
           long advertiserId,
           boolean archived,
           com.google.api.ads.dfa.axis.v1_19.CreativeFieldAssignment[] creativeFieldAssignments,
           long sizeId,
           long typeId,
           int version,
           java.lang.String HTMLCode,
           com.google.api.ads.dfa.axis.v1_19.HTMLCreativeAsset[] creativeAssets) {
        super(
            id,
            name,
            active,
            advertiserId,
            archived,
            creativeFieldAssignments,
            sizeId,
            typeId,
            version);
        this.HTMLCode = HTMLCode;
        this.creativeAssets = creativeAssets;
    }


    /**
     * Gets the HTMLCode value for this HTMLCreativeBase.
     * 
     * @return HTMLCode
     */
    public java.lang.String getHTMLCode() {
        return HTMLCode;
    }


    /**
     * Sets the HTMLCode value for this HTMLCreativeBase.
     * 
     * @param HTMLCode
     */
    public void setHTMLCode(java.lang.String HTMLCode) {
        this.HTMLCode = HTMLCode;
    }


    /**
     * Gets the creativeAssets value for this HTMLCreativeBase.
     * 
     * @return creativeAssets
     */
    public com.google.api.ads.dfa.axis.v1_19.HTMLCreativeAsset[] getCreativeAssets() {
        return creativeAssets;
    }


    /**
     * Sets the creativeAssets value for this HTMLCreativeBase.
     * 
     * @param creativeAssets
     */
    public void setCreativeAssets(com.google.api.ads.dfa.axis.v1_19.HTMLCreativeAsset[] creativeAssets) {
        this.creativeAssets = creativeAssets;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HTMLCreativeBase)) return false;
        HTMLCreativeBase other = (HTMLCreativeBase) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.HTMLCode==null && other.getHTMLCode()==null) || 
             (this.HTMLCode!=null &&
              this.HTMLCode.equals(other.getHTMLCode()))) &&
            ((this.creativeAssets==null && other.getCreativeAssets()==null) || 
             (this.creativeAssets!=null &&
              java.util.Arrays.equals(this.creativeAssets, other.getCreativeAssets())));
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
        if (getHTMLCode() != null) {
            _hashCode += getHTMLCode().hashCode();
        }
        if (getCreativeAssets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreativeAssets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreativeAssets(), i);
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
        new org.apache.axis.description.TypeDesc(HTMLCreativeBase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "HTMLCreativeBase"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HTMLCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HTMLCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeAssets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creativeAssets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "HTMLCreativeAsset"));
        elemField.setNillable(true);
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
