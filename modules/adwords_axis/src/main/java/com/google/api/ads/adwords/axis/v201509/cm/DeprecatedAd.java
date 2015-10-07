/**
 * DeprecatedAd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201509.cm;


/**
 * Represents a deprecated ad.
 *             
 *             Deprecated ads can be deleted, but cannot be created.
 *             <span class="constraint AdxEnabled">This is disabled for
 * AdX when it is contained within Operators: ADD, SET.</span>
 */
public class DeprecatedAd  extends com.google.api.ads.adwords.axis.v201509.cm.Ad  implements java.io.Serializable {
    /* Name of the ad.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "Name".</span> */
    private java.lang.String name;

    /* Type of the creative.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "Type".</span> */
    private com.google.api.ads.adwords.axis.v201509.cm.DeprecatedAdType type;

    public DeprecatedAd() {
    }

    public DeprecatedAd(
           java.lang.Long id,
           java.lang.String url,
           java.lang.String displayUrl,
           java.lang.String[] finalUrls,
           java.lang.String[] finalMobileUrls,
           com.google.api.ads.adwords.axis.v201509.cm.AppUrl[] finalAppUrls,
           java.lang.String trackingUrlTemplate,
           com.google.api.ads.adwords.axis.v201509.cm.CustomParameters urlCustomParameters,
           java.lang.Long devicePreference,
           java.lang.String adType,
           java.lang.String name,
           com.google.api.ads.adwords.axis.v201509.cm.DeprecatedAdType type) {
        super(
            id,
            url,
            displayUrl,
            finalUrls,
            finalMobileUrls,
            finalAppUrls,
            trackingUrlTemplate,
            urlCustomParameters,
            devicePreference,
            adType);
        this.name = name;
        this.type = type;
    }


    /**
     * Gets the name value for this DeprecatedAd.
     * 
     * @return name   * Name of the ad.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "Name".</span>
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DeprecatedAd.
     * 
     * @param name   * Name of the ad.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "Name".</span>
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the type value for this DeprecatedAd.
     * 
     * @return type   * Type of the creative.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "Type".</span>
     */
    public com.google.api.ads.adwords.axis.v201509.cm.DeprecatedAdType getType() {
        return type;
    }


    /**
     * Sets the type value for this DeprecatedAd.
     * 
     * @param type   * Type of the creative.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "Type".</span>
     */
    public void setType(com.google.api.ads.adwords.axis.v201509.cm.DeprecatedAdType type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeprecatedAd)) return false;
        DeprecatedAd other = (DeprecatedAd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeprecatedAd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201509", "DeprecatedAd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201509", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201509", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201509", "DeprecatedAd.Type"));
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
