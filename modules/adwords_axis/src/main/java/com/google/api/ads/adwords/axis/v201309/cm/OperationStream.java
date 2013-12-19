/**
 * OperationStream.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.cm;


/**
 * A stream of AdWords API mutate operations that must be performed
 * serially.
 *             Further, this operation stream must be processed serially
 * with all other
 *             operation streams in a bulk mutate job that specify the
 * same scoping
 *             entity.
 */
public class OperationStream  implements java.io.Serializable {
    /* The id of the entity within whose scope the mutate operations
     * apply. */
    private com.google.api.ads.adwords.axis.v201309.cm.EntityId scopingEntityId;

    /* The mutate operations comprising this stream.
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     *                 <span class="constraint NotEmpty">This field must
     * contain at least one element.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201309.cm.Operation[] operations;

    public OperationStream() {
    }

    public OperationStream(
           com.google.api.ads.adwords.axis.v201309.cm.EntityId scopingEntityId,
           com.google.api.ads.adwords.axis.v201309.cm.Operation[] operations) {
           this.scopingEntityId = scopingEntityId;
           this.operations = operations;
    }


    /**
     * Gets the scopingEntityId value for this OperationStream.
     * 
     * @return scopingEntityId   * The id of the entity within whose scope the mutate operations
     * apply.
     */
    public com.google.api.ads.adwords.axis.v201309.cm.EntityId getScopingEntityId() {
        return scopingEntityId;
    }


    /**
     * Sets the scopingEntityId value for this OperationStream.
     * 
     * @param scopingEntityId   * The id of the entity within whose scope the mutate operations
     * apply.
     */
    public void setScopingEntityId(com.google.api.ads.adwords.axis.v201309.cm.EntityId scopingEntityId) {
        this.scopingEntityId = scopingEntityId;
    }


    /**
     * Gets the operations value for this OperationStream.
     * 
     * @return operations   * The mutate operations comprising this stream.
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     *                 <span class="constraint NotEmpty">This field must
     * contain at least one element.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201309.cm.Operation[] getOperations() {
        return operations;
    }


    /**
     * Sets the operations value for this OperationStream.
     * 
     * @param operations   * The mutate operations comprising this stream.
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     *                 <span class="constraint NotEmpty">This field must
     * contain at least one element.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setOperations(com.google.api.ads.adwords.axis.v201309.cm.Operation[] operations) {
        this.operations = operations;
    }

    public com.google.api.ads.adwords.axis.v201309.cm.Operation getOperations(int i) {
        return this.operations[i];
    }

    public void setOperations(int i, com.google.api.ads.adwords.axis.v201309.cm.Operation _value) {
        this.operations[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OperationStream)) return false;
        OperationStream other = (OperationStream) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.scopingEntityId==null && other.getScopingEntityId()==null) || 
             (this.scopingEntityId!=null &&
              this.scopingEntityId.equals(other.getScopingEntityId()))) &&
            ((this.operations==null && other.getOperations()==null) || 
             (this.operations!=null &&
              java.util.Arrays.equals(this.operations, other.getOperations())));
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
        if (getScopingEntityId() != null) {
            _hashCode += getScopingEntityId().hashCode();
        }
        if (getOperations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOperations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOperations(), i);
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
        new org.apache.axis.description.TypeDesc(OperationStream.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "OperationStream"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scopingEntityId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "scopingEntityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "EntityId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operations");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "operations"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "Operation"));
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
