/**
 * ThirdPartyCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201211;


/**
 * A {@code Creative} that is served by a 3rd-party vendor.
 */
public class ThirdPartyCreative  extends com.google.api.ads.dfp.axis.v201211.Creative  implements java.io.Serializable {
    /* The HTML snippet that this creative delivers. This attribute
     * is required. */
    private java.lang.String snippet;

    /* The HTML snippet that this creative delivers with macros expanded.
     * This
     *                     attribute is read-only and is set by Google. */
    private java.lang.String expandedSnippet;

    public ThirdPartyCreative() {
    }

    public ThirdPartyCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201211.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.dfp.axis.v201211.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.axis.v201211.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.axis.v201211.BaseCustomFieldValue[] customFieldValues,
           java.lang.String creativeType,
           java.lang.String snippet,
           java.lang.String expandedSnippet) {
        super(
            advertiserId,
            id,
            name,
            size,
            previewUrl,
            appliedLabels,
            lastModifiedDateTime,
            customFieldValues,
            creativeType);
        this.snippet = snippet;
        this.expandedSnippet = expandedSnippet;
    }


    /**
     * Gets the snippet value for this ThirdPartyCreative.
     * 
     * @return snippet   * The HTML snippet that this creative delivers. This attribute
     * is required.
     */
    public java.lang.String getSnippet() {
        return snippet;
    }


    /**
     * Sets the snippet value for this ThirdPartyCreative.
     * 
     * @param snippet   * The HTML snippet that this creative delivers. This attribute
     * is required.
     */
    public void setSnippet(java.lang.String snippet) {
        this.snippet = snippet;
    }


    /**
     * Gets the expandedSnippet value for this ThirdPartyCreative.
     * 
     * @return expandedSnippet   * The HTML snippet that this creative delivers with macros expanded.
     * This
     *                     attribute is read-only and is set by Google.
     */
    public java.lang.String getExpandedSnippet() {
        return expandedSnippet;
    }


    /**
     * Sets the expandedSnippet value for this ThirdPartyCreative.
     * 
     * @param expandedSnippet   * The HTML snippet that this creative delivers with macros expanded.
     * This
     *                     attribute is read-only and is set by Google.
     */
    public void setExpandedSnippet(java.lang.String expandedSnippet) {
        this.expandedSnippet = expandedSnippet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ThirdPartyCreative)) return false;
        ThirdPartyCreative other = (ThirdPartyCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.snippet==null && other.getSnippet()==null) || 
             (this.snippet!=null &&
              this.snippet.equals(other.getSnippet()))) &&
            ((this.expandedSnippet==null && other.getExpandedSnippet()==null) || 
             (this.expandedSnippet!=null &&
              this.expandedSnippet.equals(other.getExpandedSnippet())));
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
        if (getSnippet() != null) {
            _hashCode += getSnippet().hashCode();
        }
        if (getExpandedSnippet() != null) {
            _hashCode += getExpandedSnippet().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ThirdPartyCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "ThirdPartyCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snippet");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "snippet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expandedSnippet");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "expandedSnippet"));
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
