/**
 * TextAd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201509.cm;


/**
 * Represents a TextAd.
 *             <span class="constraint AdxEnabled">This is disabled for
 * AdX when it is contained within Operators: ADD, SET.</span>
 */
public class TextAd  extends com.google.api.ads.adwords.axis.v201509.cm.Ad  implements java.io.Serializable {
    /* The headline of the ad. */
    private java.lang.String headline;

    /* The first description line. */
    private java.lang.String description1;

    /* The second description line. */
    private java.lang.String description2;

    public TextAd() {
    }

    public TextAd(
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
           java.lang.String headline,
           java.lang.String description1,
           java.lang.String description2) {
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
        this.headline = headline;
        this.description1 = description1;
        this.description2 = description2;
    }


    /**
     * Gets the headline value for this TextAd.
     * 
     * @return headline   * The headline of the ad.
     */
    public java.lang.String getHeadline() {
        return headline;
    }


    /**
     * Sets the headline value for this TextAd.
     * 
     * @param headline   * The headline of the ad.
     */
    public void setHeadline(java.lang.String headline) {
        this.headline = headline;
    }


    /**
     * Gets the description1 value for this TextAd.
     * 
     * @return description1   * The first description line.
     */
    public java.lang.String getDescription1() {
        return description1;
    }


    /**
     * Sets the description1 value for this TextAd.
     * 
     * @param description1   * The first description line.
     */
    public void setDescription1(java.lang.String description1) {
        this.description1 = description1;
    }


    /**
     * Gets the description2 value for this TextAd.
     * 
     * @return description2   * The second description line.
     */
    public java.lang.String getDescription2() {
        return description2;
    }


    /**
     * Sets the description2 value for this TextAd.
     * 
     * @param description2   * The second description line.
     */
    public void setDescription2(java.lang.String description2) {
        this.description2 = description2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TextAd)) return false;
        TextAd other = (TextAd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.headline==null && other.getHeadline()==null) || 
             (this.headline!=null &&
              this.headline.equals(other.getHeadline()))) &&
            ((this.description1==null && other.getDescription1()==null) || 
             (this.description1!=null &&
              this.description1.equals(other.getDescription1()))) &&
            ((this.description2==null && other.getDescription2()==null) || 
             (this.description2!=null &&
              this.description2.equals(other.getDescription2())));
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
        if (getHeadline() != null) {
            _hashCode += getHeadline().hashCode();
        }
        if (getDescription1() != null) {
            _hashCode += getDescription1().hashCode();
        }
        if (getDescription2() != null) {
            _hashCode += getDescription2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TextAd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201509", "TextAd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headline");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201509", "headline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description1");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201509", "description1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description2");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201509", "description2"));
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
