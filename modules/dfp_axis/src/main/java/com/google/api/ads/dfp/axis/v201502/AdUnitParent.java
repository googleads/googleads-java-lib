/**
 * AdUnitParent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201502;


/**
 * The summary of a parent {@link AdUnit}.
 */
public class AdUnitParent  implements java.io.Serializable {
    /* The ID of the parent {@code AdUnit}. This value is readonly
     * and is populated by Google. */
    private java.lang.String id;

    /* The name of the parent {@code AdUnit}. This value is readonly
     * and is populated by Google. */
    private java.lang.String name;

    /* A string used to uniquely identify the ad unit for the purposes
     * of
     *                 serving the ad. This attribute is read-only and is
     * assigned by Google
     *                 when an ad unit is created. */
    private java.lang.String adUnitCode;

    public AdUnitParent() {
    }

    public AdUnitParent(
           java.lang.String id,
           java.lang.String name,
           java.lang.String adUnitCode) {
           this.id = id;
           this.name = name;
           this.adUnitCode = adUnitCode;
    }


    /**
     * Gets the id value for this AdUnitParent.
     * 
     * @return id   * The ID of the parent {@code AdUnit}. This value is readonly
     * and is populated by Google.
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this AdUnitParent.
     * 
     * @param id   * The ID of the parent {@code AdUnit}. This value is readonly
     * and is populated by Google.
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the name value for this AdUnitParent.
     * 
     * @return name   * The name of the parent {@code AdUnit}. This value is readonly
     * and is populated by Google.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this AdUnitParent.
     * 
     * @param name   * The name of the parent {@code AdUnit}. This value is readonly
     * and is populated by Google.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the adUnitCode value for this AdUnitParent.
     * 
     * @return adUnitCode   * A string used to uniquely identify the ad unit for the purposes
     * of
     *                 serving the ad. This attribute is read-only and is
     * assigned by Google
     *                 when an ad unit is created.
     */
    public java.lang.String getAdUnitCode() {
        return adUnitCode;
    }


    /**
     * Sets the adUnitCode value for this AdUnitParent.
     * 
     * @param adUnitCode   * A string used to uniquely identify the ad unit for the purposes
     * of
     *                 serving the ad. This attribute is read-only and is
     * assigned by Google
     *                 when an ad unit is created.
     */
    public void setAdUnitCode(java.lang.String adUnitCode) {
        this.adUnitCode = adUnitCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdUnitParent)) return false;
        AdUnitParent other = (AdUnitParent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.adUnitCode==null && other.getAdUnitCode()==null) || 
             (this.adUnitCode!=null &&
              this.adUnitCode.equals(other.getAdUnitCode())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getAdUnitCode() != null) {
            _hashCode += getAdUnitCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdUnitParent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201502", "AdUnitParent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201502", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201502", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adUnitCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201502", "adUnitCode"));
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
