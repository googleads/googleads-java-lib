/**
 * LocationExtension.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201502.cm;


/**
 * Location based ad extension.
 */
public class LocationExtension  extends com.google.api.ads.adwords.axis.v201502.cm.AdExtension  implements java.io.Serializable {
    /* Address of the location (as is populated in GeoLocation by
     *                     GeoLocationService). <b>Note:</b> When specifying
     * both
     *                     {@link Address#provinceCode provinceCode} and
     *                     {@link Address#provinceName provinceName}, only
     * provinceName is saved and
     *                     returned. If provinceName is empty and provinceCode
     * is specified, the
     *                     provinceCode value is saved as a provinceName,
     * i.e. provinceCode is
     *                     ignored by the service. */
    private com.google.api.ads.adwords.axis.v201502.cm.Address address;

    /* The lat/long point of the location (as is populated in GeoLocation
     * by
     *                     GeoLocationService). */
    private com.google.api.ads.adwords.axis.v201502.cm.GeoPoint geoPoint;

    /* Byte data encoding address and geo point (as is populated in
     * GeoLocation
     *                     by GeoLocationService).
     *                     Input only. Required on location extension creation. */
    private byte[] encodedLocation;

    /* The name of the company located at the given address
     *                     <span class="constraint StringLength">The length
     * of this string should be between 1 and 80, inclusive.</span> */
    private java.lang.String companyName;

    /* The phone number for the location */
    private java.lang.String phoneNumber;

    /* The source which generated the extension */
    private com.google.api.ads.adwords.axis.v201502.cm.LocationExtensionSource source;

    /* The business icon to use with the extension */
    private java.lang.Long iconMediaId;

    /* The store front image to use with the extension */
    private java.lang.Long imageMediaId;

    public LocationExtension() {
    }

    public LocationExtension(
           java.lang.Long id,
           java.lang.String adExtensionType,
           com.google.api.ads.adwords.axis.v201502.cm.Address address,
           com.google.api.ads.adwords.axis.v201502.cm.GeoPoint geoPoint,
           byte[] encodedLocation,
           java.lang.String companyName,
           java.lang.String phoneNumber,
           com.google.api.ads.adwords.axis.v201502.cm.LocationExtensionSource source,
           java.lang.Long iconMediaId,
           java.lang.Long imageMediaId) {
        super(
            id,
            adExtensionType);
        this.address = address;
        this.geoPoint = geoPoint;
        this.encodedLocation = encodedLocation;
        this.companyName = companyName;
        this.phoneNumber = phoneNumber;
        this.source = source;
        this.iconMediaId = iconMediaId;
        this.imageMediaId = imageMediaId;
    }


    /**
     * Gets the address value for this LocationExtension.
     * 
     * @return address   * Address of the location (as is populated in GeoLocation by
     *                     GeoLocationService). <b>Note:</b> When specifying
     * both
     *                     {@link Address#provinceCode provinceCode} and
     *                     {@link Address#provinceName provinceName}, only
     * provinceName is saved and
     *                     returned. If provinceName is empty and provinceCode
     * is specified, the
     *                     provinceCode value is saved as a provinceName,
     * i.e. provinceCode is
     *                     ignored by the service.
     */
    public com.google.api.ads.adwords.axis.v201502.cm.Address getAddress() {
        return address;
    }


    /**
     * Sets the address value for this LocationExtension.
     * 
     * @param address   * Address of the location (as is populated in GeoLocation by
     *                     GeoLocationService). <b>Note:</b> When specifying
     * both
     *                     {@link Address#provinceCode provinceCode} and
     *                     {@link Address#provinceName provinceName}, only
     * provinceName is saved and
     *                     returned. If provinceName is empty and provinceCode
     * is specified, the
     *                     provinceCode value is saved as a provinceName,
     * i.e. provinceCode is
     *                     ignored by the service.
     */
    public void setAddress(com.google.api.ads.adwords.axis.v201502.cm.Address address) {
        this.address = address;
    }


    /**
     * Gets the geoPoint value for this LocationExtension.
     * 
     * @return geoPoint   * The lat/long point of the location (as is populated in GeoLocation
     * by
     *                     GeoLocationService).
     */
    public com.google.api.ads.adwords.axis.v201502.cm.GeoPoint getGeoPoint() {
        return geoPoint;
    }


    /**
     * Sets the geoPoint value for this LocationExtension.
     * 
     * @param geoPoint   * The lat/long point of the location (as is populated in GeoLocation
     * by
     *                     GeoLocationService).
     */
    public void setGeoPoint(com.google.api.ads.adwords.axis.v201502.cm.GeoPoint geoPoint) {
        this.geoPoint = geoPoint;
    }


    /**
     * Gets the encodedLocation value for this LocationExtension.
     * 
     * @return encodedLocation   * Byte data encoding address and geo point (as is populated in
     * GeoLocation
     *                     by GeoLocationService).
     *                     Input only. Required on location extension creation.
     */
    public byte[] getEncodedLocation() {
        return encodedLocation;
    }


    /**
     * Sets the encodedLocation value for this LocationExtension.
     * 
     * @param encodedLocation   * Byte data encoding address and geo point (as is populated in
     * GeoLocation
     *                     by GeoLocationService).
     *                     Input only. Required on location extension creation.
     */
    public void setEncodedLocation(byte[] encodedLocation) {
        this.encodedLocation = encodedLocation;
    }


    /**
     * Gets the companyName value for this LocationExtension.
     * 
     * @return companyName   * The name of the company located at the given address
     *                     <span class="constraint StringLength">The length
     * of this string should be between 1 and 80, inclusive.</span>
     */
    public java.lang.String getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this LocationExtension.
     * 
     * @param companyName   * The name of the company located at the given address
     *                     <span class="constraint StringLength">The length
     * of this string should be between 1 and 80, inclusive.</span>
     */
    public void setCompanyName(java.lang.String companyName) {
        this.companyName = companyName;
    }


    /**
     * Gets the phoneNumber value for this LocationExtension.
     * 
     * @return phoneNumber   * The phone number for the location
     */
    public java.lang.String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this LocationExtension.
     * 
     * @param phoneNumber   * The phone number for the location
     */
    public void setPhoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the source value for this LocationExtension.
     * 
     * @return source   * The source which generated the extension
     */
    public com.google.api.ads.adwords.axis.v201502.cm.LocationExtensionSource getSource() {
        return source;
    }


    /**
     * Sets the source value for this LocationExtension.
     * 
     * @param source   * The source which generated the extension
     */
    public void setSource(com.google.api.ads.adwords.axis.v201502.cm.LocationExtensionSource source) {
        this.source = source;
    }


    /**
     * Gets the iconMediaId value for this LocationExtension.
     * 
     * @return iconMediaId   * The business icon to use with the extension
     */
    public java.lang.Long getIconMediaId() {
        return iconMediaId;
    }


    /**
     * Sets the iconMediaId value for this LocationExtension.
     * 
     * @param iconMediaId   * The business icon to use with the extension
     */
    public void setIconMediaId(java.lang.Long iconMediaId) {
        this.iconMediaId = iconMediaId;
    }


    /**
     * Gets the imageMediaId value for this LocationExtension.
     * 
     * @return imageMediaId   * The store front image to use with the extension
     */
    public java.lang.Long getImageMediaId() {
        return imageMediaId;
    }


    /**
     * Sets the imageMediaId value for this LocationExtension.
     * 
     * @param imageMediaId   * The store front image to use with the extension
     */
    public void setImageMediaId(java.lang.Long imageMediaId) {
        this.imageMediaId = imageMediaId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocationExtension)) return false;
        LocationExtension other = (LocationExtension) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.geoPoint==null && other.getGeoPoint()==null) || 
             (this.geoPoint!=null &&
              this.geoPoint.equals(other.getGeoPoint()))) &&
            ((this.encodedLocation==null && other.getEncodedLocation()==null) || 
             (this.encodedLocation!=null &&
              java.util.Arrays.equals(this.encodedLocation, other.getEncodedLocation()))) &&
            ((this.companyName==null && other.getCompanyName()==null) || 
             (this.companyName!=null &&
              this.companyName.equals(other.getCompanyName()))) &&
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.iconMediaId==null && other.getIconMediaId()==null) || 
             (this.iconMediaId!=null &&
              this.iconMediaId.equals(other.getIconMediaId()))) &&
            ((this.imageMediaId==null && other.getImageMediaId()==null) || 
             (this.imageMediaId!=null &&
              this.imageMediaId.equals(other.getImageMediaId())));
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getGeoPoint() != null) {
            _hashCode += getGeoPoint().hashCode();
        }
        if (getEncodedLocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEncodedLocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEncodedLocation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCompanyName() != null) {
            _hashCode += getCompanyName().hashCode();
        }
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getIconMediaId() != null) {
            _hashCode += getIconMediaId().hashCode();
        }
        if (getImageMediaId() != null) {
            _hashCode += getImageMediaId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocationExtension.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "LocationExtension"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geoPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "geoPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "GeoPoint"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encodedLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "encodedLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "companyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "phoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "LocationExtension.Source"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iconMediaId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "iconMediaId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageMediaId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "imageMediaId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
