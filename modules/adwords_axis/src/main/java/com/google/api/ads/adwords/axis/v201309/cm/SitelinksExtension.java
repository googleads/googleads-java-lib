/**
 * SitelinksExtension.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.cm;


/**
 * Class to represent a set of sitelinks and their order of preference.
 */
public class SitelinksExtension  extends com.google.api.ads.adwords.axis.v201309.cm.AdExtension  implements java.io.Serializable {
    /* <span class="constraint NotEmpty">This field must contain at
     * least one element.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201309.cm.Sitelink[] sitelinks;

    public SitelinksExtension() {
    }

    public SitelinksExtension(
           java.lang.Long id,
           java.lang.String adExtensionType,
           com.google.api.ads.adwords.axis.v201309.cm.Sitelink[] sitelinks) {
        super(
            id,
            adExtensionType);
        this.sitelinks = sitelinks;
    }


    /**
     * Gets the sitelinks value for this SitelinksExtension.
     * 
     * @return sitelinks   * <span class="constraint NotEmpty">This field must contain at
     * least one element.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201309.cm.Sitelink[] getSitelinks() {
        return sitelinks;
    }


    /**
     * Sets the sitelinks value for this SitelinksExtension.
     * 
     * @param sitelinks   * <span class="constraint NotEmpty">This field must contain at
     * least one element.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setSitelinks(com.google.api.ads.adwords.axis.v201309.cm.Sitelink[] sitelinks) {
        this.sitelinks = sitelinks;
    }

    public com.google.api.ads.adwords.axis.v201309.cm.Sitelink getSitelinks(int i) {
        return this.sitelinks[i];
    }

    public void setSitelinks(int i, com.google.api.ads.adwords.axis.v201309.cm.Sitelink _value) {
        this.sitelinks[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SitelinksExtension)) return false;
        SitelinksExtension other = (SitelinksExtension) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sitelinks==null && other.getSitelinks()==null) || 
             (this.sitelinks!=null &&
              java.util.Arrays.equals(this.sitelinks, other.getSitelinks())));
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
        if (getSitelinks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSitelinks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSitelinks(), i);
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
        new org.apache.axis.description.TypeDesc(SitelinksExtension.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "SitelinksExtension"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sitelinks");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "sitelinks"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "Sitelink"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
