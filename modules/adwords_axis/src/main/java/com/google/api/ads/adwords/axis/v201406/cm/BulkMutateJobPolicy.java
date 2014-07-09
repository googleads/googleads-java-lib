/**
 * BulkMutateJobPolicy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.cm;


/**
 * A basic job policy.
 */
public class BulkMutateJobPolicy  implements java.io.Serializable {
    /* Ids of jobs that must successfully complete before this job
     * can be
     *                 processed.
     *                 <span class="constraint CollectionSize">The maximum
     * size of this collection is 100.</span> */
    private long[] prerequisiteJobIds;

    public BulkMutateJobPolicy() {
    }

    public BulkMutateJobPolicy(
           long[] prerequisiteJobIds) {
           this.prerequisiteJobIds = prerequisiteJobIds;
    }


    /**
     * Gets the prerequisiteJobIds value for this BulkMutateJobPolicy.
     * 
     * @return prerequisiteJobIds   * Ids of jobs that must successfully complete before this job
     * can be
     *                 processed.
     *                 <span class="constraint CollectionSize">The maximum
     * size of this collection is 100.</span>
     */
    public long[] getPrerequisiteJobIds() {
        return prerequisiteJobIds;
    }


    /**
     * Sets the prerequisiteJobIds value for this BulkMutateJobPolicy.
     * 
     * @param prerequisiteJobIds   * Ids of jobs that must successfully complete before this job
     * can be
     *                 processed.
     *                 <span class="constraint CollectionSize">The maximum
     * size of this collection is 100.</span>
     */
    public void setPrerequisiteJobIds(long[] prerequisiteJobIds) {
        this.prerequisiteJobIds = prerequisiteJobIds;
    }

    public long getPrerequisiteJobIds(int i) {
        return this.prerequisiteJobIds[i];
    }

    public void setPrerequisiteJobIds(int i, long _value) {
        this.prerequisiteJobIds[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BulkMutateJobPolicy)) return false;
        BulkMutateJobPolicy other = (BulkMutateJobPolicy) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.prerequisiteJobIds==null && other.getPrerequisiteJobIds()==null) || 
             (this.prerequisiteJobIds!=null &&
              java.util.Arrays.equals(this.prerequisiteJobIds, other.getPrerequisiteJobIds())));
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
        if (getPrerequisiteJobIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrerequisiteJobIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrerequisiteJobIds(), i);
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
        new org.apache.axis.description.TypeDesc(BulkMutateJobPolicy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "BulkMutateJobPolicy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prerequisiteJobIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "prerequisiteJobIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
