/**
 * SimpleMutateJob.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201502.cm;


/**
 * A mutation job, which was submitted using
 *             {@link MutateJobService#mutate}, and will execute asynchronously
 * sometime after submission.
 */
public class SimpleMutateJob  extends com.google.api.ads.adwords.axis.v201502.cm.Job  implements java.io.Serializable {
    /* The unique id of the job, which can be used to query it's state
     * and
     *                     results. */
    private java.lang.Long id;

    /* status of the job. if {@code COMPLETED}, the id can be used
     * to query
     *                     {@link MutateJobService#getResult}. */
    private com.google.api.ads.adwords.axis.v201502.cm.BasicJobStatus status;

    /* History of this job. */
    private com.google.api.ads.adwords.axis.v201502.cm.JobEvent[] history;

    public SimpleMutateJob() {
    }

    public SimpleMutateJob(
           com.google.api.ads.adwords.axis.v201502.cm.ApiErrorReason failureReason,
           com.google.api.ads.adwords.axis.v201502.cm.JobStats stats,
           com.google.api.ads.adwords.axis.v201502.cm.BillingSummary billingSummary,
           java.lang.String jobType,
           java.lang.Long id,
           com.google.api.ads.adwords.axis.v201502.cm.BasicJobStatus status,
           com.google.api.ads.adwords.axis.v201502.cm.JobEvent[] history) {
        super(
            failureReason,
            stats,
            billingSummary,
            jobType);
        this.id = id;
        this.status = status;
        this.history = history;
    }


    /**
     * Gets the id value for this SimpleMutateJob.
     * 
     * @return id   * The unique id of the job, which can be used to query it's state
     * and
     *                     results.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this SimpleMutateJob.
     * 
     * @param id   * The unique id of the job, which can be used to query it's state
     * and
     *                     results.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the status value for this SimpleMutateJob.
     * 
     * @return status   * status of the job. if {@code COMPLETED}, the id can be used
     * to query
     *                     {@link MutateJobService#getResult}.
     */
    public com.google.api.ads.adwords.axis.v201502.cm.BasicJobStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SimpleMutateJob.
     * 
     * @param status   * status of the job. if {@code COMPLETED}, the id can be used
     * to query
     *                     {@link MutateJobService#getResult}.
     */
    public void setStatus(com.google.api.ads.adwords.axis.v201502.cm.BasicJobStatus status) {
        this.status = status;
    }


    /**
     * Gets the history value for this SimpleMutateJob.
     * 
     * @return history   * History of this job.
     */
    public com.google.api.ads.adwords.axis.v201502.cm.JobEvent[] getHistory() {
        return history;
    }


    /**
     * Sets the history value for this SimpleMutateJob.
     * 
     * @param history   * History of this job.
     */
    public void setHistory(com.google.api.ads.adwords.axis.v201502.cm.JobEvent[] history) {
        this.history = history;
    }

    public com.google.api.ads.adwords.axis.v201502.cm.JobEvent getHistory(int i) {
        return this.history[i];
    }

    public void setHistory(int i, com.google.api.ads.adwords.axis.v201502.cm.JobEvent _value) {
        this.history[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SimpleMutateJob)) return false;
        SimpleMutateJob other = (SimpleMutateJob) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.history==null && other.getHistory()==null) || 
             (this.history!=null &&
              java.util.Arrays.equals(this.history, other.getHistory())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getHistory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHistory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHistory(), i);
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
        new org.apache.axis.description.TypeDesc(SimpleMutateJob.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "SimpleMutateJob"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "BasicJobStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("history");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "history"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "JobEvent"));
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
