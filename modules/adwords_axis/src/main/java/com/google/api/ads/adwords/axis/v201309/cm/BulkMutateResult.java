/**
 * BulkMutateResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.cm;


/**
 * Represents a result part of a {@link BulkMutateJob}.
 *             
 *             <p>Once one or more mutate operations have been processed,
 * the bulk mutate
 *             job will eventually be completed. This means that the
 * job will have a result
 *             corresponding to each operation. The types of results
 * for an operation are:
 *             <ul>
 *             <li>{@link ReturnValueResult}: the corresponding operation
 * was successfully
 *             processed and this result contains the return value of
 * that operation;
 *             </li>
 *             <li>{@link FailureResult} or {@link BatchFailureResult}:
 * the corresponding
 *             operation was in a batch that failed with errors. Please
 * inspect these
 *             errors to determine if the operation itself was faulty
 * and if so what
 *             errors need to be fixed before you submit this operation
 * as part of a
 *             future job.</li>
 *             <li>{@link LostResult}: the corresponding operation was
 * processed - it was
 *             either successful and had a return value, or it was a
 * part of a failed
 *             batch. Unfortunately, despite our best efforts, we were
 * unable to
 *             durably save the result. You may have to retrieve the
 * related state of
 *             your account to determine if this operation actually succeeded.</li>
 * <li>{@link UnprocessedResult}: the corresponding operation was not
 * processed
 *             because the job was aborted <i>Note: The job's status
 * will be
 *             {@code COMPLETED}, signifying that although it may have
 * some operations
 *             that were processed, it cannot be resumed.</i></li></p>
 * 
 *             <p>The results of a job are structured so that the each
 * operation can be
 *             easily matched to its corresponding result. So for every
 * {@link BulkMutateRequest} in a job, there is a corresponding
 *             {@code BulkMutateResult}; For every {@link OperationStream}
 * in a request
 *             part, there is a corresponding {@link OperationStreamResult};
 * And, for
 *             every {@link Operation} in an operation stream, there
 * is an
 *             {@link OperationResult}.</p>
 *             
 *             <p>Within an operation stream, the operations are processed
 * in atomic
 *             batches. So even one faulty operation may cause its neighboring
 * non-faulty
 *             operations to fail just because they happened to be processed
 * in the same
 *             batch. It is important to keep this batch failure reporting
 * scheme in mind
 *             when handling operation failures.</p>
 *             
 *             <p>There will be a single {@link ApiException} returned
 * for each failing
 *             batch of operations, and it will have a similar structure
 * and
 *             interpretation to the exceptions returned by the synchronous
 * AdWords API
 *             services. This exception is returned in a {@link FailureResult}
 * that
 *             corresponds to the first operation of the failing batch.</p>
 * 
 *             <p>The exception may contain multiple errors, and each
 * error may have
 *             {@code OGNL path}s that identify the faulty operation(s)
 * by index (or
 *             position within the batch). The first operation in the
 * batch has an
 *             implicit index of 0. The subsequent operations in the
 * batch have a
 *             corresponding {@link BatchFailureResult} which explicitly
 * specifies the
 *             index of the operation within the batch.</p>
 */
public class BulkMutateResult  implements java.io.Serializable {
    /* The index of this result part;
     *                 From 0 (inclusive) to numResultParts (exclusive). */
    private java.lang.Integer partIndex;

    /* List of {@code OperationStreamResult}'s that comprise this
     * result part of
     *                 the bulk mutate job. Each operation result is indexed
     * to its corresponding
     *                 {@code OperationStream} in the {@link BulkMutateRequest}. */
    private com.google.api.ads.adwords.axis.v201309.cm.OperationStreamResult[] operationStreamResults;

    public BulkMutateResult() {
    }

    public BulkMutateResult(
           java.lang.Integer partIndex,
           com.google.api.ads.adwords.axis.v201309.cm.OperationStreamResult[] operationStreamResults) {
           this.partIndex = partIndex;
           this.operationStreamResults = operationStreamResults;
    }


    /**
     * Gets the partIndex value for this BulkMutateResult.
     * 
     * @return partIndex   * The index of this result part;
     *                 From 0 (inclusive) to numResultParts (exclusive).
     */
    public java.lang.Integer getPartIndex() {
        return partIndex;
    }


    /**
     * Sets the partIndex value for this BulkMutateResult.
     * 
     * @param partIndex   * The index of this result part;
     *                 From 0 (inclusive) to numResultParts (exclusive).
     */
    public void setPartIndex(java.lang.Integer partIndex) {
        this.partIndex = partIndex;
    }


    /**
     * Gets the operationStreamResults value for this BulkMutateResult.
     * 
     * @return operationStreamResults   * List of {@code OperationStreamResult}'s that comprise this
     * result part of
     *                 the bulk mutate job. Each operation result is indexed
     * to its corresponding
     *                 {@code OperationStream} in the {@link BulkMutateRequest}.
     */
    public com.google.api.ads.adwords.axis.v201309.cm.OperationStreamResult[] getOperationStreamResults() {
        return operationStreamResults;
    }


    /**
     * Sets the operationStreamResults value for this BulkMutateResult.
     * 
     * @param operationStreamResults   * List of {@code OperationStreamResult}'s that comprise this
     * result part of
     *                 the bulk mutate job. Each operation result is indexed
     * to its corresponding
     *                 {@code OperationStream} in the {@link BulkMutateRequest}.
     */
    public void setOperationStreamResults(com.google.api.ads.adwords.axis.v201309.cm.OperationStreamResult[] operationStreamResults) {
        this.operationStreamResults = operationStreamResults;
    }

    public com.google.api.ads.adwords.axis.v201309.cm.OperationStreamResult getOperationStreamResults(int i) {
        return this.operationStreamResults[i];
    }

    public void setOperationStreamResults(int i, com.google.api.ads.adwords.axis.v201309.cm.OperationStreamResult _value) {
        this.operationStreamResults[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BulkMutateResult)) return false;
        BulkMutateResult other = (BulkMutateResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.partIndex==null && other.getPartIndex()==null) || 
             (this.partIndex!=null &&
              this.partIndex.equals(other.getPartIndex()))) &&
            ((this.operationStreamResults==null && other.getOperationStreamResults()==null) || 
             (this.operationStreamResults!=null &&
              java.util.Arrays.equals(this.operationStreamResults, other.getOperationStreamResults())));
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
        if (getPartIndex() != null) {
            _hashCode += getPartIndex().hashCode();
        }
        if (getOperationStreamResults() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOperationStreamResults());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOperationStreamResults(), i);
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
        new org.apache.axis.description.TypeDesc(BulkMutateResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "BulkMutateResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "partIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationStreamResults");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "operationStreamResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "OperationStreamResult"));
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
