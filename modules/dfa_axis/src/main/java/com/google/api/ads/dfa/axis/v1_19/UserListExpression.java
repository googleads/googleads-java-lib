/**
 * UserListExpression.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class UserListExpression  implements java.io.Serializable {
    private java.lang.String idExpression;

    private java.lang.String nameExpression;

    public UserListExpression() {
    }

    public UserListExpression(
           java.lang.String idExpression,
           java.lang.String nameExpression) {
           this.idExpression = idExpression;
           this.nameExpression = nameExpression;
    }


    /**
     * Gets the idExpression value for this UserListExpression.
     * 
     * @return idExpression
     */
    public java.lang.String getIdExpression() {
        return idExpression;
    }


    /**
     * Sets the idExpression value for this UserListExpression.
     * 
     * @param idExpression
     */
    public void setIdExpression(java.lang.String idExpression) {
        this.idExpression = idExpression;
    }


    /**
     * Gets the nameExpression value for this UserListExpression.
     * 
     * @return nameExpression
     */
    public java.lang.String getNameExpression() {
        return nameExpression;
    }


    /**
     * Sets the nameExpression value for this UserListExpression.
     * 
     * @param nameExpression
     */
    public void setNameExpression(java.lang.String nameExpression) {
        this.nameExpression = nameExpression;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserListExpression)) return false;
        UserListExpression other = (UserListExpression) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idExpression==null && other.getIdExpression()==null) || 
             (this.idExpression!=null &&
              this.idExpression.equals(other.getIdExpression()))) &&
            ((this.nameExpression==null && other.getNameExpression()==null) || 
             (this.nameExpression!=null &&
              this.nameExpression.equals(other.getNameExpression())));
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
        if (getIdExpression() != null) {
            _hashCode += getIdExpression().hashCode();
        }
        if (getNameExpression() != null) {
            _hashCode += getNameExpression().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserListExpression.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "UserListExpression"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idExpression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idExpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameExpression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nameExpression"));
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
