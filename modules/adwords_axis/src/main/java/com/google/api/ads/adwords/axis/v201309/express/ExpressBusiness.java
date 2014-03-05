/**
 * ExpressBusiness.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.express;


/**
 * Information about an AdWords Express business.
 */
public class ExpressBusiness  implements java.io.Serializable {
    /* ID of this business.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Id".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span> */
    private java.lang.Long id;

    /* Name of this business.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Name".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 80, inclusive.</span> */
    private java.lang.String name;

    /* Status of this business.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201309.express.ExpressBusinessStatus status;

    /* The structured address.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Address".</span> */
    private com.google.api.ads.adwords.axis.v201309.cm.Address address;

    /* The lat/lng of the address of this business. It will be derived
     * by geocoding the specified
     *                 address.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "GeoPoint".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201309.cm.GeoPoint geoPoint;

    /* Phone number of this business.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "PhoneNumber".</span> */
    private com.google.api.ads.adwords.axis.v201309.express.PhoneNumber phoneNumber;

    /* Website of this business.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Website".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span> */
    private java.lang.String website;

    public ExpressBusiness() {
    }

    public ExpressBusiness(
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.adwords.axis.v201309.express.ExpressBusinessStatus status,
           com.google.api.ads.adwords.axis.v201309.cm.Address address,
           com.google.api.ads.adwords.axis.v201309.cm.GeoPoint geoPoint,
           com.google.api.ads.adwords.axis.v201309.express.PhoneNumber phoneNumber,
           java.lang.String website) {
           this.id = id;
           this.name = name;
           this.status = status;
           this.address = address;
           this.geoPoint = geoPoint;
           this.phoneNumber = phoneNumber;
           this.website = website;
    }


    /**
     * Gets the id value for this ExpressBusiness.
     * 
     * @return id   * ID of this business.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Id".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span>
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this ExpressBusiness.
     * 
     * @param id   * ID of this business.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Id".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span>
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this ExpressBusiness.
     * 
     * @return name   * Name of this business.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Name".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 80, inclusive.</span>
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ExpressBusiness.
     * 
     * @param name   * Name of this business.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Name".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 80, inclusive.</span>
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the status value for this ExpressBusiness.
     * 
     * @return status   * Status of this business.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201309.express.ExpressBusinessStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ExpressBusiness.
     * 
     * @param status   * Status of this business.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public void setStatus(com.google.api.ads.adwords.axis.v201309.express.ExpressBusinessStatus status) {
        this.status = status;
    }


    /**
     * Gets the address value for this ExpressBusiness.
     * 
     * @return address   * The structured address.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Address".</span>
     */
    public com.google.api.ads.adwords.axis.v201309.cm.Address getAddress() {
        return address;
    }


    /**
     * Sets the address value for this ExpressBusiness.
     * 
     * @param address   * The structured address.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Address".</span>
     */
    public void setAddress(com.google.api.ads.adwords.axis.v201309.cm.Address address) {
        this.address = address;
    }


    /**
     * Gets the geoPoint value for this ExpressBusiness.
     * 
     * @return geoPoint   * The lat/lng of the address of this business. It will be derived
     * by geocoding the specified
     *                 address.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "GeoPoint".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201309.cm.GeoPoint getGeoPoint() {
        return geoPoint;
    }


    /**
     * Sets the geoPoint value for this ExpressBusiness.
     * 
     * @param geoPoint   * The lat/lng of the address of this business. It will be derived
     * by geocoding the specified
     *                 address.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "GeoPoint".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setGeoPoint(com.google.api.ads.adwords.axis.v201309.cm.GeoPoint geoPoint) {
        this.geoPoint = geoPoint;
    }


    /**
     * Gets the phoneNumber value for this ExpressBusiness.
     * 
     * @return phoneNumber   * Phone number of this business.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "PhoneNumber".</span>
     */
    public com.google.api.ads.adwords.axis.v201309.express.PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this ExpressBusiness.
     * 
     * @param phoneNumber   * Phone number of this business.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "PhoneNumber".</span>
     */
    public void setPhoneNumber(com.google.api.ads.adwords.axis.v201309.express.PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the website value for this ExpressBusiness.
     * 
     * @return website   * Website of this business.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Website".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public java.lang.String getWebsite() {
        return website;
    }


    /**
     * Sets the website value for this ExpressBusiness.
     * 
     * @param website   * Website of this business.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Website".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public void setWebsite(java.lang.String website) {
        this.website = website;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExpressBusiness)) return false;
        ExpressBusiness other = (ExpressBusiness) obj;
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
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.geoPoint==null && other.getGeoPoint()==null) || 
             (this.geoPoint!=null &&
              this.geoPoint.equals(other.getGeoPoint()))) &&
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            ((this.website==null && other.getWebsite()==null) || 
             (this.website!=null &&
              this.website.equals(other.getWebsite())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getGeoPoint() != null) {
            _hashCode += getGeoPoint().hashCode();
        }
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        if (getWebsite() != null) {
            _hashCode += getWebsite().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExpressBusiness.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201309", "ExpressBusiness"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201309", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201309", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201309", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201309", "ExpressBusiness.Status"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201309", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geoPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201309", "geoPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "GeoPoint"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201309", "phoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201309", "PhoneNumber"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("website");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201309", "website"));
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
