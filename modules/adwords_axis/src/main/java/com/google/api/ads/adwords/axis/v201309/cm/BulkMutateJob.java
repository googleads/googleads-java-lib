/**
 * BulkMutateJob.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.cm;


/**
 * A {@code BulkMutateJob} is essentially a mixed collection of mutate
 * operations from the following AdWords API campaign management services:
 * <ul>
 *             <li>{@link CampaignService}</li>
 *             <li>{@link CampaignTargetService}</li>
 *             <li>{@link CampaignCriterionService}</li>
 *             <li>{@link AdGroupService}</li>
 *             <li>{@link AdGroupAdService}</li>
 *             <li>{@link AdGroupCriterionService}</li>
 *             </ul>
 *             
 *             <p>The mutate operations in a job's request are constructed
 * in exactly the
 *             same way as they are for synchronous calls to these services.</p>
 * 
 *             <p>The mutate operations are grouped by their scoping
 * entity in the
 *             AdWords customer tree. Currently, mutate operations can
 * be grouped either
 *             by the customer or by their parent campaign. However,
 * they cannot be
 *             grouped both ways - some by customer and others by campaigns
 * - in the same
 *             job.</p>
 *             
 *             <p class="note"><b>Note:</b> A job may have no more than
 * 500,000 mutate
 *             operations in total, and no more than 10 different scoping
 * campaigns.</p>
 *             
 *             <p>The mutate operations must be packaged into containers
 * called
 *             {@code Operation Streams}, each tagged with the ID of
 * the scoping entity of
 *             its operations.</p>
 *             
 *             <p>To facilitate the building of very large bulk mutate
 * jobs, the operation
 *             streams of a job can be submitted using multiple request
 * parts. A job is
 *             queued for processing as soon as it can be determined
 * that all of its
 *             request parts have been received.</p>
 *             
 *             <p class="note"><b>Note:</b> A job may have no more than
 * 100 request parts.
 *             Each part may have no more than 25 operation streams and
 * no more than 10,000
 *             operations in total.</p>
 */
public class BulkMutateJob  extends com.google.api.ads.adwords.axis.v201309.cm.Job  implements java.io.Serializable {
    /* ID of this bulk mutate job, which is returned by
     *                     {@code BulkMutateJobService} after adding a new
     * job.
     *                     <span class="constraint ReadOnly">This field is
     * read only and should not be set for following {@link Operator}s :
     * ADD.  If this field is sent to the API, it will be ignored.</span> */
    private java.lang.Long id;

    /* Defines which existing jobs are required to successfully process
     * before
     *                     starting this job. This field can only be set
     * when adding a new job.
     *                     <span class="constraint ReadOnly">This field is
     * read only and should not be set for following {@link Operator}s :
     * SET.  If this field is sent to the API, it will be ignored.</span> */
    private com.google.api.ads.adwords.axis.v201309.cm.BulkMutateJobPolicy policy;

    /* A request part of this job. Even though a {@code BulkMutateJob}
     * can
     *                     contain up to 100 request parts (each with a unique
     * {@link BulkMutateRequest#partIndex partIndex}), only one can be added
     * or
     *                     updated at a time for optimization purposes.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201309.cm.BulkMutateRequest request;

    /* Status of this job.
     *                     <span class="constraint ReadOnly">This field is
     * read only and should not be set.  If this field is sent to the API,
     * it will be ignored.</span> */
    private com.google.api.ads.adwords.axis.v201309.cm.BasicJobStatus status;

    /* History of status changes of this job.
     *                     <span class="constraint ReadOnly">This field is
     * read only and should not be set.  If this field is sent to the API,
     * it will be ignored.</span> */
    private com.google.api.ads.adwords.axis.v201309.cm.BulkMutateJobEvent[] history;

    /* The selected result part of this job.
     *                     <span class="constraint ReadOnly">This field is
     * read only and should not be set.  If this field is sent to the API,
     * it will be ignored.</span> */
    private com.google.api.ads.adwords.axis.v201309.cm.BulkMutateResult result;

    /* Total number of request parts (maximum of 100) in this job. */
    private java.lang.Integer numRequestParts;

    /* Number of request parts currently received via {@code ADD}
     * and
     *                     {@code SET} operations. This job will begin processing
     * when
     *                     {@code numRequestPartsReceived} equals
     *                     {@code numRequestParts}.
     *                     <span class="constraint ReadOnly">This field is
     * read only and should not be set.  If this field is sent to the API,
     * it will be ignored.</span> */
    private java.lang.Integer numRequestPartsReceived;

    public BulkMutateJob() {
    }

    public BulkMutateJob(
           com.google.api.ads.adwords.axis.v201309.cm.ApiErrorReason failureReason,
           com.google.api.ads.adwords.axis.v201309.cm.JobStats stats,
           com.google.api.ads.adwords.axis.v201309.cm.BillingSummary billingSummary,
           java.lang.String jobType,
           java.lang.Long id,
           com.google.api.ads.adwords.axis.v201309.cm.BulkMutateJobPolicy policy,
           com.google.api.ads.adwords.axis.v201309.cm.BulkMutateRequest request,
           com.google.api.ads.adwords.axis.v201309.cm.BasicJobStatus status,
           com.google.api.ads.adwords.axis.v201309.cm.BulkMutateJobEvent[] history,
           com.google.api.ads.adwords.axis.v201309.cm.BulkMutateResult result,
           java.lang.Integer numRequestParts,
           java.lang.Integer numRequestPartsReceived) {
        super(
            failureReason,
            stats,
            billingSummary,
            jobType);
        this.id = id;
        this.policy = policy;
        this.request = request;
        this.status = status;
        this.history = history;
        this.result = result;
        this.numRequestParts = numRequestParts;
        this.numRequestPartsReceived = numRequestPartsReceived;
    }


    /**
     * Gets the id value for this BulkMutateJob.
     * 
     * @return id   * ID of this bulk mutate job, which is returned by
     *                     {@code BulkMutateJobService} after adding a new
     * job.
     *                     <span class="constraint ReadOnly">This field is
     * read only and should not be set for following {@link Operator}s :
     * ADD.  If this field is sent to the API, it will be ignored.</span>
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this BulkMutateJob.
     * 
     * @param id   * ID of this bulk mutate job, which is returned by
     *                     {@code BulkMutateJobService} after adding a new
     * job.
     *                     <span class="constraint ReadOnly">This field is
     * read only and should not be set for following {@link Operator}s :
     * ADD.  If this field is sent to the API, it will be ignored.</span>
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the policy value for this BulkMutateJob.
     * 
     * @return policy   * Defines which existing jobs are required to successfully process
     * before
     *                     starting this job. This field can only be set
     * when adding a new job.
     *                     <span class="constraint ReadOnly">This field is
     * read only and should not be set for following {@link Operator}s :
     * SET.  If this field is sent to the API, it will be ignored.</span>
     */
    public com.google.api.ads.adwords.axis.v201309.cm.BulkMutateJobPolicy getPolicy() {
        return policy;
    }


    /**
     * Sets the policy value for this BulkMutateJob.
     * 
     * @param policy   * Defines which existing jobs are required to successfully process
     * before
     *                     starting this job. This field can only be set
     * when adding a new job.
     *                     <span class="constraint ReadOnly">This field is
     * read only and should not be set for following {@link Operator}s :
     * SET.  If this field is sent to the API, it will be ignored.</span>
     */
    public void setPolicy(com.google.api.ads.adwords.axis.v201309.cm.BulkMutateJobPolicy policy) {
        this.policy = policy;
    }


    /**
     * Gets the request value for this BulkMutateJob.
     * 
     * @return request   * A request part of this job. Even though a {@code BulkMutateJob}
     * can
     *                     contain up to 100 request parts (each with a unique
     * {@link BulkMutateRequest#partIndex partIndex}), only one can be added
     * or
     *                     updated at a time for optimization purposes.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201309.cm.BulkMutateRequest getRequest() {
        return request;
    }


    /**
     * Sets the request value for this BulkMutateJob.
     * 
     * @param request   * A request part of this job. Even though a {@code BulkMutateJob}
     * can
     *                     contain up to 100 request parts (each with a unique
     * {@link BulkMutateRequest#partIndex partIndex}), only one can be added
     * or
     *                     updated at a time for optimization purposes.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setRequest(com.google.api.ads.adwords.axis.v201309.cm.BulkMutateRequest request) {
        this.request = request;
    }


    /**
     * Gets the status value for this BulkMutateJob.
     * 
     * @return status   * Status of this job.
     *                     <span class="constraint ReadOnly">This field is
     * read only and should not be set.  If this field is sent to the API,
     * it will be ignored.</span>
     */
    public com.google.api.ads.adwords.axis.v201309.cm.BasicJobStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this BulkMutateJob.
     * 
     * @param status   * Status of this job.
     *                     <span class="constraint ReadOnly">This field is
     * read only and should not be set.  If this field is sent to the API,
     * it will be ignored.</span>
     */
    public void setStatus(com.google.api.ads.adwords.axis.v201309.cm.BasicJobStatus status) {
        this.status = status;
    }


    /**
     * Gets the history value for this BulkMutateJob.
     * 
     * @return history   * History of status changes of this job.
     *                     <span class="constraint ReadOnly">This field is
     * read only and should not be set.  If this field is sent to the API,
     * it will be ignored.</span>
     */
    public com.google.api.ads.adwords.axis.v201309.cm.BulkMutateJobEvent[] getHistory() {
        return history;
    }


    /**
     * Sets the history value for this BulkMutateJob.
     * 
     * @param history   * History of status changes of this job.
     *                     <span class="constraint ReadOnly">This field is
     * read only and should not be set.  If this field is sent to the API,
     * it will be ignored.</span>
     */
    public void setHistory(com.google.api.ads.adwords.axis.v201309.cm.BulkMutateJobEvent[] history) {
        this.history = history;
    }

    public com.google.api.ads.adwords.axis.v201309.cm.BulkMutateJobEvent getHistory(int i) {
        return this.history[i];
    }

    public void setHistory(int i, com.google.api.ads.adwords.axis.v201309.cm.BulkMutateJobEvent _value) {
        this.history[i] = _value;
    }


    /**
     * Gets the result value for this BulkMutateJob.
     * 
     * @return result   * The selected result part of this job.
     *                     <span class="constraint ReadOnly">This field is
     * read only and should not be set.  If this field is sent to the API,
     * it will be ignored.</span>
     */
    public com.google.api.ads.adwords.axis.v201309.cm.BulkMutateResult getResult() {
        return result;
    }


    /**
     * Sets the result value for this BulkMutateJob.
     * 
     * @param result   * The selected result part of this job.
     *                     <span class="constraint ReadOnly">This field is
     * read only and should not be set.  If this field is sent to the API,
     * it will be ignored.</span>
     */
    public void setResult(com.google.api.ads.adwords.axis.v201309.cm.BulkMutateResult result) {
        this.result = result;
    }


    /**
     * Gets the numRequestParts value for this BulkMutateJob.
     * 
     * @return numRequestParts   * Total number of request parts (maximum of 100) in this job.
     */
    public java.lang.Integer getNumRequestParts() {
        return numRequestParts;
    }


    /**
     * Sets the numRequestParts value for this BulkMutateJob.
     * 
     * @param numRequestParts   * Total number of request parts (maximum of 100) in this job.
     */
    public void setNumRequestParts(java.lang.Integer numRequestParts) {
        this.numRequestParts = numRequestParts;
    }


    /**
     * Gets the numRequestPartsReceived value for this BulkMutateJob.
     * 
     * @return numRequestPartsReceived   * Number of request parts currently received via {@code ADD}
     * and
     *                     {@code SET} operations. This job will begin processing
     * when
     *                     {@code numRequestPartsReceived} equals
     *                     {@code numRequestParts}.
     *                     <span class="constraint ReadOnly">This field is
     * read only and should not be set.  If this field is sent to the API,
     * it will be ignored.</span>
     */
    public java.lang.Integer getNumRequestPartsReceived() {
        return numRequestPartsReceived;
    }


    /**
     * Sets the numRequestPartsReceived value for this BulkMutateJob.
     * 
     * @param numRequestPartsReceived   * Number of request parts currently received via {@code ADD}
     * and
     *                     {@code SET} operations. This job will begin processing
     * when
     *                     {@code numRequestPartsReceived} equals
     *                     {@code numRequestParts}.
     *                     <span class="constraint ReadOnly">This field is
     * read only and should not be set.  If this field is sent to the API,
     * it will be ignored.</span>
     */
    public void setNumRequestPartsReceived(java.lang.Integer numRequestPartsReceived) {
        this.numRequestPartsReceived = numRequestPartsReceived;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BulkMutateJob)) return false;
        BulkMutateJob other = (BulkMutateJob) obj;
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
            ((this.policy==null && other.getPolicy()==null) || 
             (this.policy!=null &&
              this.policy.equals(other.getPolicy()))) &&
            ((this.request==null && other.getRequest()==null) || 
             (this.request!=null &&
              this.request.equals(other.getRequest()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.history==null && other.getHistory()==null) || 
             (this.history!=null &&
              java.util.Arrays.equals(this.history, other.getHistory()))) &&
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult()))) &&
            ((this.numRequestParts==null && other.getNumRequestParts()==null) || 
             (this.numRequestParts!=null &&
              this.numRequestParts.equals(other.getNumRequestParts()))) &&
            ((this.numRequestPartsReceived==null && other.getNumRequestPartsReceived()==null) || 
             (this.numRequestPartsReceived!=null &&
              this.numRequestPartsReceived.equals(other.getNumRequestPartsReceived())));
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
        if (getPolicy() != null) {
            _hashCode += getPolicy().hashCode();
        }
        if (getRequest() != null) {
            _hashCode += getRequest().hashCode();
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
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        if (getNumRequestParts() != null) {
            _hashCode += getNumRequestParts().hashCode();
        }
        if (getNumRequestPartsReceived() != null) {
            _hashCode += getNumRequestPartsReceived().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BulkMutateJob.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "BulkMutateJob"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policy");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "policy"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "BulkMutateJobPolicy"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("request");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "request"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "BulkMutateRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "BasicJobStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("history");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "history"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "BulkMutateJobEvent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "BulkMutateResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numRequestParts");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "numRequestParts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numRequestPartsReceived");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "numRequestPartsReceived"));
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
