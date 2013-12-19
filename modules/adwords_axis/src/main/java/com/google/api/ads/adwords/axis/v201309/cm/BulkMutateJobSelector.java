/**
 * BulkMutateJobSelector.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.cm;


/**
 * Specifies additional criteria for selecting bulk mutate jobs.
 */
public class BulkMutateJobSelector  extends com.google.api.ads.adwords.axis.v201309.cm.JobSelector  implements java.io.Serializable {
    /* The list of jobs, specified by IDs, to be selected.
     *                     <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span>
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private long[] jobIds;

    /* The index of the result part to include with in the returned
     * jobs.
     *                     {@code null} indicates that no result part is
     * to be included.
     *                     
     *                     <p>Only set this field if the selector specifies
     * exactly one job using
     *                     {@link #jobIds} (a request part can be retrieved
     * for only one job at a
     *                     time).</p>
     *                     <span class="constraint InRange">This field must
     * be greater than or equal to 0.</span> */
    private java.lang.Integer resultPartIndex;

    public BulkMutateJobSelector() {
    }

    public BulkMutateJobSelector(
           java.lang.Boolean includeHistory,
           java.lang.Boolean includeStats,
           java.lang.String jobSelectorType,
           long[] jobIds,
           java.lang.Integer resultPartIndex) {
        super(
            includeHistory,
            includeStats,
            jobSelectorType);
        this.jobIds = jobIds;
        this.resultPartIndex = resultPartIndex;
    }


    /**
     * Gets the jobIds value for this BulkMutateJobSelector.
     * 
     * @return jobIds   * The list of jobs, specified by IDs, to be selected.
     *                     <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span>
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public long[] getJobIds() {
        return jobIds;
    }


    /**
     * Sets the jobIds value for this BulkMutateJobSelector.
     * 
     * @param jobIds   * The list of jobs, specified by IDs, to be selected.
     *                     <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span>
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setJobIds(long[] jobIds) {
        this.jobIds = jobIds;
    }

    public long getJobIds(int i) {
        return this.jobIds[i];
    }

    public void setJobIds(int i, long _value) {
        this.jobIds[i] = _value;
    }


    /**
     * Gets the resultPartIndex value for this BulkMutateJobSelector.
     * 
     * @return resultPartIndex   * The index of the result part to include with in the returned
     * jobs.
     *                     {@code null} indicates that no result part is
     * to be included.
     *                     
     *                     <p>Only set this field if the selector specifies
     * exactly one job using
     *                     {@link #jobIds} (a request part can be retrieved
     * for only one job at a
     *                     time).</p>
     *                     <span class="constraint InRange">This field must
     * be greater than or equal to 0.</span>
     */
    public java.lang.Integer getResultPartIndex() {
        return resultPartIndex;
    }


    /**
     * Sets the resultPartIndex value for this BulkMutateJobSelector.
     * 
     * @param resultPartIndex   * The index of the result part to include with in the returned
     * jobs.
     *                     {@code null} indicates that no result part is
     * to be included.
     *                     
     *                     <p>Only set this field if the selector specifies
     * exactly one job using
     *                     {@link #jobIds} (a request part can be retrieved
     * for only one job at a
     *                     time).</p>
     *                     <span class="constraint InRange">This field must
     * be greater than or equal to 0.</span>
     */
    public void setResultPartIndex(java.lang.Integer resultPartIndex) {
        this.resultPartIndex = resultPartIndex;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BulkMutateJobSelector)) return false;
        BulkMutateJobSelector other = (BulkMutateJobSelector) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.jobIds==null && other.getJobIds()==null) || 
             (this.jobIds!=null &&
              java.util.Arrays.equals(this.jobIds, other.getJobIds()))) &&
            ((this.resultPartIndex==null && other.getResultPartIndex()==null) || 
             (this.resultPartIndex!=null &&
              this.resultPartIndex.equals(other.getResultPartIndex())));
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
        if (getJobIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJobIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJobIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResultPartIndex() != null) {
            _hashCode += getResultPartIndex().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BulkMutateJobSelector.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "BulkMutateJobSelector"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "jobIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultPartIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "resultPartIndex"));
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
