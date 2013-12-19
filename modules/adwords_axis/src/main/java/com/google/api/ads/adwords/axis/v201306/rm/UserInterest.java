/**
 * UserInterest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201306.rm;


/**
 * Represents a particular interest based vertical to be targeted.
 * User interest may be used for defining logical user lists.
 */
public class UserInterest  implements java.io.Serializable {
    /* Id of this user interest.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span> */
    private java.lang.Long id;

    /* The name of this user interest. */
    private java.lang.String name;

    /* Size range in terms of number of users of the user interest. */
    private com.google.api.ads.adwords.axis.v201306.rm.SizeRange sizeRange;

    public UserInterest() {
    }

    public UserInterest(
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.adwords.axis.v201306.rm.SizeRange sizeRange) {
           this.id = id;
           this.name = name;
           this.sizeRange = sizeRange;
    }


    /**
     * Gets the id value for this UserInterest.
     * 
     * @return id   * Id of this user interest.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span>
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this UserInterest.
     * 
     * @param id   * Id of this user interest.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span>
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this UserInterest.
     * 
     * @return name   * The name of this user interest.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this UserInterest.
     * 
     * @param name   * The name of this user interest.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the sizeRange value for this UserInterest.
     * 
     * @return sizeRange   * Size range in terms of number of users of the user interest.
     */
    public com.google.api.ads.adwords.axis.v201306.rm.SizeRange getSizeRange() {
        return sizeRange;
    }


    /**
     * Sets the sizeRange value for this UserInterest.
     * 
     * @param sizeRange   * Size range in terms of number of users of the user interest.
     */
    public void setSizeRange(com.google.api.ads.adwords.axis.v201306.rm.SizeRange sizeRange) {
        this.sizeRange = sizeRange;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserInterest)) return false;
        UserInterest other = (UserInterest) obj;
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
            ((this.sizeRange==null && other.getSizeRange()==null) || 
             (this.sizeRange!=null &&
              this.sizeRange.equals(other.getSizeRange())));
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
        if (getSizeRange() != null) {
            _hashCode += getSizeRange().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserInterest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201306", "UserInterest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201306", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201306", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sizeRange");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201306", "sizeRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201306", "SizeRange"));
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
