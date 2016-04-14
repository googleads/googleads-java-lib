/**
 * UserListOperation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.ddp.axis.v201603.provider;


/**
 * UserList operations for adding/updating UserList entities.
 */
public class UserListOperation  extends com.google.api.ads.ddp.axis.v201603.provider.Operation  implements java.io.Serializable {
    /* UserList to operate on
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private com.google.api.ads.ddp.axis.v201603.provider.UserList operand;

    public UserListOperation() {
    }

    public UserListOperation(
           com.google.api.ads.ddp.axis.v201603.provider.Operator operator,
           java.lang.String operationType,
           com.google.api.ads.ddp.axis.v201603.provider.UserList operand) {
        super(
            operator,
            operationType);
        this.operand = operand;
    }


    /**
     * Gets the operand value for this UserListOperation.
     * 
     * @return operand   * UserList to operate on
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public com.google.api.ads.ddp.axis.v201603.provider.UserList getOperand() {
        return operand;
    }


    /**
     * Sets the operand value for this UserListOperation.
     * 
     * @param operand   * UserList to operate on
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setOperand(com.google.api.ads.ddp.axis.v201603.provider.UserList operand) {
        this.operand = operand;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserListOperation)) return false;
        UserListOperation other = (UserListOperation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.operand==null && other.getOperand()==null) || 
             (this.operand!=null &&
              this.operand.equals(other.getOperand())));
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
        if (getOperand() != null) {
            _hashCode += getOperand().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserListOperation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201603", "UserListOperation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operand");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201603", "operand"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201603", "UserList"));
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
