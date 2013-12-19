/**
 * BatchFailureResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.cm;


/**
 * Represents a failure result for a mutate operation that was applied
 * in a
 *             transactional batch. It does not imply that the corresponding
 * operation
 *             for this result itself caused the failure. To determine
 * that, please see
 *             the {@link FailureResult} provided for the first operation
 * of the batch.
 */
public class BatchFailureResult  extends com.google.api.ads.adwords.axis.v201309.cm.OperationResult  implements java.io.Serializable {
    /* The zero-based index within the batch of the operation corresponding
     * to
     *                     this result. */
    private java.lang.Integer operationIndexInBatch;

    public BatchFailureResult() {
    }

    public BatchFailureResult(
           java.lang.String operationResultType,
           java.lang.Integer operationIndexInBatch) {
        super(
            operationResultType);
        this.operationIndexInBatch = operationIndexInBatch;
    }


    /**
     * Gets the operationIndexInBatch value for this BatchFailureResult.
     * 
     * @return operationIndexInBatch   * The zero-based index within the batch of the operation corresponding
     * to
     *                     this result.
     */
    public java.lang.Integer getOperationIndexInBatch() {
        return operationIndexInBatch;
    }


    /**
     * Sets the operationIndexInBatch value for this BatchFailureResult.
     * 
     * @param operationIndexInBatch   * The zero-based index within the batch of the operation corresponding
     * to
     *                     this result.
     */
    public void setOperationIndexInBatch(java.lang.Integer operationIndexInBatch) {
        this.operationIndexInBatch = operationIndexInBatch;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchFailureResult)) return false;
        BatchFailureResult other = (BatchFailureResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.operationIndexInBatch==null && other.getOperationIndexInBatch()==null) || 
             (this.operationIndexInBatch!=null &&
              this.operationIndexInBatch.equals(other.getOperationIndexInBatch())));
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
        if (getOperationIndexInBatch() != null) {
            _hashCode += getOperationIndexInBatch().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BatchFailureResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "BatchFailureResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationIndexInBatch");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "operationIndexInBatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
