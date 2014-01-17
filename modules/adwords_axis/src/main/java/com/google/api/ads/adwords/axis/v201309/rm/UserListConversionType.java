/**
 * UserListConversionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.rm;


/**
 * Represents a conversion type used for building remarketing user
 * lists.
 */
public class UserListConversionType  implements java.io.Serializable {
    /* Conversion type id */
    private java.lang.Long id;

    /* Name of this conversion type */
    private java.lang.String name;

    /* The category of the ConversionType based on the location where
     * the
     *                 conversion event was generated (from a user's perspective).
     * <span class="constraint ReadOnly">This field is read only and should
     * not be set.  If this field is sent to the API, it will be ignored.</span> */
    private com.google.api.ads.adwords.axis.v201309.rm.UserListConversionTypeCategory category;

    public UserListConversionType() {
    }

    public UserListConversionType(
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.adwords.axis.v201309.rm.UserListConversionTypeCategory category) {
           this.id = id;
           this.name = name;
           this.category = category;
    }


    /**
     * Gets the id value for this UserListConversionType.
     * 
     * @return id   * Conversion type id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this UserListConversionType.
     * 
     * @param id   * Conversion type id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this UserListConversionType.
     * 
     * @return name   * Name of this conversion type
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this UserListConversionType.
     * 
     * @param name   * Name of this conversion type
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the category value for this UserListConversionType.
     * 
     * @return category   * The category of the ConversionType based on the location where
     * the
     *                 conversion event was generated (from a user's perspective).
     * <span class="constraint ReadOnly">This field is read only and should
     * not be set.  If this field is sent to the API, it will be ignored.</span>
     */
    public com.google.api.ads.adwords.axis.v201309.rm.UserListConversionTypeCategory getCategory() {
        return category;
    }


    /**
     * Sets the category value for this UserListConversionType.
     * 
     * @param category   * The category of the ConversionType based on the location where
     * the
     *                 conversion event was generated (from a user's perspective).
     * <span class="constraint ReadOnly">This field is read only and should
     * not be set.  If this field is sent to the API, it will be ignored.</span>
     */
    public void setCategory(com.google.api.ads.adwords.axis.v201309.rm.UserListConversionTypeCategory category) {
        this.category = category;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserListConversionType)) return false;
        UserListConversionType other = (UserListConversionType) obj;
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
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory())));
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
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserListConversionType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201309", "UserListConversionType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201309", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201309", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201309", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201309", "UserListConversionType.Category"));
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
