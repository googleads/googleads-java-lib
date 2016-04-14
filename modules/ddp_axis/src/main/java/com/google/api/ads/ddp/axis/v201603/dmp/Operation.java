/**
 * Operation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.ddp.axis.v201603.dmp;


/**
 * This represents an operation that includes an operator and an operand
 * specified type.
 */
public abstract class Operation  implements java.io.Serializable {
    /* Operator.
     *                                 <span class="constraint Required">This
     * field is required and should not be {@code null}.</span> */
    private com.google.api.ads.ddp.axis.v201603.dmp.Operator operator;

    /* Indicates that this instance is a subtype of Operation.
     *                                 Although this field is returned in
     * the response, it is ignored on input
     *                                 and cannot be selected. Specify xsi:type
     * instead. */
    private java.lang.String operationType;

    public Operation() {
    }

    public Operation(
           com.google.api.ads.ddp.axis.v201603.dmp.Operator operator,
           java.lang.String operationType) {
           this.operator = operator;
           this.operationType = operationType;
    }


    /**
     * Gets the operator value for this Operation.
     * 
     * @return operator   * Operator.
     *                                 <span class="constraint Required">This
     * field is required and should not be {@code null}.</span>
     */
    public com.google.api.ads.ddp.axis.v201603.dmp.Operator getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this Operation.
     * 
     * @param operator   * Operator.
     *                                 <span class="constraint Required">This
     * field is required and should not be {@code null}.</span>
     */
    public void setOperator(com.google.api.ads.ddp.axis.v201603.dmp.Operator operator) {
        this.operator = operator;
    }


    /**
     * Gets the operationType value for this Operation.
     * 
     * @return operationType   * Indicates that this instance is a subtype of Operation.
     *                                 Although this field is returned in
     * the response, it is ignored on input
     *                                 and cannot be selected. Specify xsi:type
     * instead.
     */
    public java.lang.String getOperationType() {
        return operationType;
    }


    /**
     * Sets the operationType value for this Operation.
     * 
     * @param operationType   * Indicates that this instance is a subtype of Operation.
     *                                 Although this field is returned in
     * the response, it is ignored on input
     *                                 and cannot be selected. Specify xsi:type
     * instead.
     */
    public void setOperationType(java.lang.String operationType) {
        this.operationType = operationType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Operation)) return false;
        Operation other = (Operation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator()))) &&
            ((this.operationType==null && other.getOperationType()==null) || 
             (this.operationType!=null &&
              this.operationType.equals(other.getOperationType())));
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
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        if (getOperationType() != null) {
            _hashCode += getOperationType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Operation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201603", "Operation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201603", "operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201603", "Operator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201603", "Operation.Type"));
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
