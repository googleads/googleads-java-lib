/**
 * FailureResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201306.cm;


/**
 * Represents a failure result for an individual mutate operation.
 * 
 *             <p>Currently, operations are applied in transactional
 * batches, so the
 *             corresponding operation for this result may not itself
 * be faulty.</p>
 *             
 *             <p>The errors in the exception may contain {@code OGNL
 * path}s that identify
 *             the faulty operations in the batch. Please see the subsequent
 * {@link BatchFailureResult}s to determine the remaining operations
 * that were
 *             also applied in the batch and their positions within the
 * batch.</p>
 */
public class FailureResult  extends com.google.api.ads.adwords.axis.v201306.cm.OperationResult  implements java.io.Serializable {
    /* The exception describing the failure that occurred in processing
     * the
     *                     mutate operation. */
    private com.google.api.ads.adwords.axis.v201306.cm.ApiException cause;

    public FailureResult() {
    }

    public FailureResult(
           java.lang.String operationResultType,
           com.google.api.ads.adwords.axis.v201306.cm.ApiException cause) {
        super(
            operationResultType);
        this.cause = cause;
    }


    /**
     * Gets the cause value for this FailureResult.
     * 
     * @return cause   * The exception describing the failure that occurred in processing
     * the
     *                     mutate operation.
     */
    public com.google.api.ads.adwords.axis.v201306.cm.ApiException getCause() {
        return cause;
    }


    /**
     * Sets the cause value for this FailureResult.
     * 
     * @param cause   * The exception describing the failure that occurred in processing
     * the
     *                     mutate operation.
     */
    public void setCause(com.google.api.ads.adwords.axis.v201306.cm.ApiException cause) {
        this.cause = cause;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FailureResult)) return false;
        FailureResult other = (FailureResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cause==null && other.getCause()==null) || 
             (this.cause!=null &&
              this.cause.equals(other.getCause())));
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
        if (getCause() != null) {
            _hashCode += getCause().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FailureResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "FailureResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cause");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "cause"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "ApiException"));
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
