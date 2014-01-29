/**
 * BulkMutateRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.cm;


/**
 * A request part of a {@link BulkMutateJob}.
 */
public class BulkMutateRequest  implements java.io.Serializable {
    /* Index of this request part. 0 &le; {@code partIndex} &lt; {@link
     * BulkMutateRequest#numRequestParts numRequestParts}.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.Integer partIndex;

    /* <span class="constraint ContentsNotNull">This field must not
     * contain {@code null} elements.</span>
     *                 <span class="constraint NotEmpty">This field must
     * contain at least one element.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201309.cm.OperationStream[] operationStreams;

    public BulkMutateRequest() {
    }

    public BulkMutateRequest(
           java.lang.Integer partIndex,
           com.google.api.ads.adwords.axis.v201309.cm.OperationStream[] operationStreams) {
           this.partIndex = partIndex;
           this.operationStreams = operationStreams;
    }


    /**
     * Gets the partIndex value for this BulkMutateRequest.
     * 
     * @return partIndex   * Index of this request part. 0 &le; {@code partIndex} &lt; {@link
     * BulkMutateRequest#numRequestParts numRequestParts}.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.Integer getPartIndex() {
        return partIndex;
    }


    /**
     * Sets the partIndex value for this BulkMutateRequest.
     * 
     * @param partIndex   * Index of this request part. 0 &le; {@code partIndex} &lt; {@link
     * BulkMutateRequest#numRequestParts numRequestParts}.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setPartIndex(java.lang.Integer partIndex) {
        this.partIndex = partIndex;
    }


    /**
     * Gets the operationStreams value for this BulkMutateRequest.
     * 
     * @return operationStreams   * <span class="constraint ContentsNotNull">This field must not
     * contain {@code null} elements.</span>
     *                 <span class="constraint NotEmpty">This field must
     * contain at least one element.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201309.cm.OperationStream[] getOperationStreams() {
        return operationStreams;
    }


    /**
     * Sets the operationStreams value for this BulkMutateRequest.
     * 
     * @param operationStreams   * <span class="constraint ContentsNotNull">This field must not
     * contain {@code null} elements.</span>
     *                 <span class="constraint NotEmpty">This field must
     * contain at least one element.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setOperationStreams(com.google.api.ads.adwords.axis.v201309.cm.OperationStream[] operationStreams) {
        this.operationStreams = operationStreams;
    }

    public com.google.api.ads.adwords.axis.v201309.cm.OperationStream getOperationStreams(int i) {
        return this.operationStreams[i];
    }

    public void setOperationStreams(int i, com.google.api.ads.adwords.axis.v201309.cm.OperationStream _value) {
        this.operationStreams[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BulkMutateRequest)) return false;
        BulkMutateRequest other = (BulkMutateRequest) obj;
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
            ((this.operationStreams==null && other.getOperationStreams()==null) || 
             (this.operationStreams!=null &&
              java.util.Arrays.equals(this.operationStreams, other.getOperationStreams())));
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
        if (getOperationStreams() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOperationStreams());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOperationStreams(), i);
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
        new org.apache.axis.description.TypeDesc(BulkMutateRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "BulkMutateRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "partIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationStreams");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "operationStreams"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "OperationStream"));
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
