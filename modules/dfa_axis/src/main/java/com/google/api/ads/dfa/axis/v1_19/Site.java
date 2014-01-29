/**
 * Site.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class Site  extends com.google.api.ads.dfa.axis.v1_19.SiteBase  implements java.io.Serializable {
    private boolean acceptingInterstitialPlacements;

    private boolean acceptingMobilePlacements;

    private boolean acceptingPublisherPaidPlacements;

    private boolean active;

    private long[] inpageTagSettings;

    private long[] interstitialTagSettings;

    private java.lang.String[] urls;

    public Site() {
    }

    public Site(
           long id,
           java.lang.String name,
           boolean acceptingInterstitialPlacements,
           boolean acceptingMobilePlacements,
           boolean acceptingPublisherPaidPlacements,
           boolean active,
           long[] inpageTagSettings,
           long[] interstitialTagSettings,
           java.lang.String[] urls) {
        super(
            id,
            name);
        this.acceptingInterstitialPlacements = acceptingInterstitialPlacements;
        this.acceptingMobilePlacements = acceptingMobilePlacements;
        this.acceptingPublisherPaidPlacements = acceptingPublisherPaidPlacements;
        this.active = active;
        this.inpageTagSettings = inpageTagSettings;
        this.interstitialTagSettings = interstitialTagSettings;
        this.urls = urls;
    }


    /**
     * Gets the acceptingInterstitialPlacements value for this Site.
     * 
     * @return acceptingInterstitialPlacements
     */
    public boolean isAcceptingInterstitialPlacements() {
        return acceptingInterstitialPlacements;
    }


    /**
     * Sets the acceptingInterstitialPlacements value for this Site.
     * 
     * @param acceptingInterstitialPlacements
     */
    public void setAcceptingInterstitialPlacements(boolean acceptingInterstitialPlacements) {
        this.acceptingInterstitialPlacements = acceptingInterstitialPlacements;
    }


    /**
     * Gets the acceptingMobilePlacements value for this Site.
     * 
     * @return acceptingMobilePlacements
     */
    public boolean isAcceptingMobilePlacements() {
        return acceptingMobilePlacements;
    }


    /**
     * Sets the acceptingMobilePlacements value for this Site.
     * 
     * @param acceptingMobilePlacements
     */
    public void setAcceptingMobilePlacements(boolean acceptingMobilePlacements) {
        this.acceptingMobilePlacements = acceptingMobilePlacements;
    }


    /**
     * Gets the acceptingPublisherPaidPlacements value for this Site.
     * 
     * @return acceptingPublisherPaidPlacements
     */
    public boolean isAcceptingPublisherPaidPlacements() {
        return acceptingPublisherPaidPlacements;
    }


    /**
     * Sets the acceptingPublisherPaidPlacements value for this Site.
     * 
     * @param acceptingPublisherPaidPlacements
     */
    public void setAcceptingPublisherPaidPlacements(boolean acceptingPublisherPaidPlacements) {
        this.acceptingPublisherPaidPlacements = acceptingPublisherPaidPlacements;
    }


    /**
     * Gets the active value for this Site.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this Site.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the inpageTagSettings value for this Site.
     * 
     * @return inpageTagSettings
     */
    public long[] getInpageTagSettings() {
        return inpageTagSettings;
    }


    /**
     * Sets the inpageTagSettings value for this Site.
     * 
     * @param inpageTagSettings
     */
    public void setInpageTagSettings(long[] inpageTagSettings) {
        this.inpageTagSettings = inpageTagSettings;
    }


    /**
     * Gets the interstitialTagSettings value for this Site.
     * 
     * @return interstitialTagSettings
     */
    public long[] getInterstitialTagSettings() {
        return interstitialTagSettings;
    }


    /**
     * Sets the interstitialTagSettings value for this Site.
     * 
     * @param interstitialTagSettings
     */
    public void setInterstitialTagSettings(long[] interstitialTagSettings) {
        this.interstitialTagSettings = interstitialTagSettings;
    }


    /**
     * Gets the urls value for this Site.
     * 
     * @return urls
     */
    public java.lang.String[] getUrls() {
        return urls;
    }


    /**
     * Sets the urls value for this Site.
     * 
     * @param urls
     */
    public void setUrls(java.lang.String[] urls) {
        this.urls = urls;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Site)) return false;
        Site other = (Site) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.acceptingInterstitialPlacements == other.isAcceptingInterstitialPlacements() &&
            this.acceptingMobilePlacements == other.isAcceptingMobilePlacements() &&
            this.acceptingPublisherPaidPlacements == other.isAcceptingPublisherPaidPlacements() &&
            this.active == other.isActive() &&
            ((this.inpageTagSettings==null && other.getInpageTagSettings()==null) || 
             (this.inpageTagSettings!=null &&
              java.util.Arrays.equals(this.inpageTagSettings, other.getInpageTagSettings()))) &&
            ((this.interstitialTagSettings==null && other.getInterstitialTagSettings()==null) || 
             (this.interstitialTagSettings!=null &&
              java.util.Arrays.equals(this.interstitialTagSettings, other.getInterstitialTagSettings()))) &&
            ((this.urls==null && other.getUrls()==null) || 
             (this.urls!=null &&
              java.util.Arrays.equals(this.urls, other.getUrls())));
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
        _hashCode += (isAcceptingInterstitialPlacements() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAcceptingMobilePlacements() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAcceptingPublisherPaidPlacements() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getInpageTagSettings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInpageTagSettings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInpageTagSettings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInterstitialTagSettings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInterstitialTagSettings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInterstitialTagSettings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUrls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUrls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUrls(), i);
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
        new org.apache.axis.description.TypeDesc(Site.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "Site"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acceptingInterstitialPlacements");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acceptingInterstitialPlacements"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acceptingMobilePlacements");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acceptingMobilePlacements"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acceptingPublisherPaidPlacements");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acceptingPublisherPaidPlacements"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inpageTagSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inpageTagSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interstitialTagSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "interstitialTagSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urls");
        elemField.setXmlName(new javax.xml.namespace.QName("", "urls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
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
