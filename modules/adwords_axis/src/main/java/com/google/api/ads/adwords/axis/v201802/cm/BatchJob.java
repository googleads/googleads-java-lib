// Copyright 2018 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * BatchJob.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents a large mutation job.
 */
public class BatchJob  implements java.io.Serializable {
    /* ID of this job.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Id".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span> */
    private java.lang.Long id;

    /* Status of this job.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.BatchJobStatus status;

    /* Statistics related to the progress of this job.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ProgressStats".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.ProgressStats progressStats;

    /* The URL to use in upload operations for this job. The URL is
     * unique to this
     *                 job and will expire one week after the job was created.
     * This field is only
     *                 returned when calling {@link BatchJobService#mutate}
     * with an {@code ADD}
     *                 operation.
     *                 
     *                 <p>To upload a file, make a POST request to {@code
     * uploadUrl} and retrieve
     *                 the "Location" header from the response as the URL
     * to upload operations.
     *                 For the set of supported operations, look up
     *                 {@code https://adwords.google.com/api/adwords/cm/xsd/<version>/BatchJobOps.xsd}.
     * For more information about how to upload files, see
     *                 {@link https://cloud.google.com/storage/docs/json_api/v1/how-tos/upload}.
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.TemporaryUrl uploadUrl;

    /* The URL to use to download results for this job. Results will
     * be available
     *                 for 30 days after job completion. This field is only
     * returned once
     *                 {@link #status} is either {@code DONE} or {@code CANCELED}.
     * <span class="constraint Selectable">This field can be selected using
     * the value "DownloadUrl".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.TemporaryUrl downloadUrl;

    /* A list of any errors that occurred during processing, not related
     * to specific
     *                 input operations, e.g. input file corruption errors.
     * <span class="constraint Selectable">This field can be selected using
     * the value "ProcessingErrors".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.BatchJobProcessingError[] processingErrors;

    /* Disk quota balance of the batch job's customer in KB, which
     * is the limit of batch job disk
     *                 usage for the customer. The field is only returned
     * when calling {@link BatchJobService#mutate}
     *                 with an {@code ADD} operation.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Long diskUsageQuotaBalance;

    public BatchJob() {
    }

    public BatchJob(
           java.lang.Long id,
           com.google.api.ads.adwords.axis.v201802.cm.BatchJobStatus status,
           com.google.api.ads.adwords.axis.v201802.cm.ProgressStats progressStats,
           com.google.api.ads.adwords.axis.v201802.cm.TemporaryUrl uploadUrl,
           com.google.api.ads.adwords.axis.v201802.cm.TemporaryUrl downloadUrl,
           com.google.api.ads.adwords.axis.v201802.cm.BatchJobProcessingError[] processingErrors,
           java.lang.Long diskUsageQuotaBalance) {
           this.id = id;
           this.status = status;
           this.progressStats = progressStats;
           this.uploadUrl = uploadUrl;
           this.downloadUrl = downloadUrl;
           this.processingErrors = processingErrors;
           this.diskUsageQuotaBalance = diskUsageQuotaBalance;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("diskUsageQuotaBalance", getDiskUsageQuotaBalance())
            .add("downloadUrl", getDownloadUrl())
            .add("id", getId())
            .add("processingErrors", getProcessingErrors())
            .add("progressStats", getProgressStats())
            .add("status", getStatus())
            .add("uploadUrl", getUploadUrl())
            .toString();
    }

    /**
     * Gets the id value for this BatchJob.
     * 
     * @return id   * ID of this job.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Id".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span>
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this BatchJob.
     * 
     * @param id   * ID of this job.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Id".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span>
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the status value for this BatchJob.
     * 
     * @return status   * Status of this job.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.BatchJobStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this BatchJob.
     * 
     * @param status   * Status of this job.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     */
    public void setStatus(com.google.api.ads.adwords.axis.v201802.cm.BatchJobStatus status) {
        this.status = status;
    }


    /**
     * Gets the progressStats value for this BatchJob.
     * 
     * @return progressStats   * Statistics related to the progress of this job.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ProgressStats".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.ProgressStats getProgressStats() {
        return progressStats;
    }


    /**
     * Sets the progressStats value for this BatchJob.
     * 
     * @param progressStats   * Statistics related to the progress of this job.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ProgressStats".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setProgressStats(com.google.api.ads.adwords.axis.v201802.cm.ProgressStats progressStats) {
        this.progressStats = progressStats;
    }


    /**
     * Gets the uploadUrl value for this BatchJob.
     * 
     * @return uploadUrl   * The URL to use in upload operations for this job. The URL is
     * unique to this
     *                 job and will expire one week after the job was created.
     * This field is only
     *                 returned when calling {@link BatchJobService#mutate}
     * with an {@code ADD}
     *                 operation.
     *                 
     *                 <p>To upload a file, make a POST request to {@code
     * uploadUrl} and retrieve
     *                 the "Location" header from the response as the URL
     * to upload operations.
     *                 For the set of supported operations, look up
     *                 {@code https://adwords.google.com/api/adwords/cm/xsd/<version>/BatchJobOps.xsd}.
     * For more information about how to upload files, see
     *                 {@link https://cloud.google.com/storage/docs/json_api/v1/how-tos/upload}.
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.TemporaryUrl getUploadUrl() {
        return uploadUrl;
    }


    /**
     * Sets the uploadUrl value for this BatchJob.
     * 
     * @param uploadUrl   * The URL to use in upload operations for this job. The URL is
     * unique to this
     *                 job and will expire one week after the job was created.
     * This field is only
     *                 returned when calling {@link BatchJobService#mutate}
     * with an {@code ADD}
     *                 operation.
     *                 
     *                 <p>To upload a file, make a POST request to {@code
     * uploadUrl} and retrieve
     *                 the "Location" header from the response as the URL
     * to upload operations.
     *                 For the set of supported operations, look up
     *                 {@code https://adwords.google.com/api/adwords/cm/xsd/<version>/BatchJobOps.xsd}.
     * For more information about how to upload files, see
     *                 {@link https://cloud.google.com/storage/docs/json_api/v1/how-tos/upload}.
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span>
     */
    public void setUploadUrl(com.google.api.ads.adwords.axis.v201802.cm.TemporaryUrl uploadUrl) {
        this.uploadUrl = uploadUrl;
    }


    /**
     * Gets the downloadUrl value for this BatchJob.
     * 
     * @return downloadUrl   * The URL to use to download results for this job. Results will
     * be available
     *                 for 30 days after job completion. This field is only
     * returned once
     *                 {@link #status} is either {@code DONE} or {@code CANCELED}.
     * <span class="constraint Selectable">This field can be selected using
     * the value "DownloadUrl".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.TemporaryUrl getDownloadUrl() {
        return downloadUrl;
    }


    /**
     * Sets the downloadUrl value for this BatchJob.
     * 
     * @param downloadUrl   * The URL to use to download results for this job. Results will
     * be available
     *                 for 30 days after job completion. This field is only
     * returned once
     *                 {@link #status} is either {@code DONE} or {@code CANCELED}.
     * <span class="constraint Selectable">This field can be selected using
     * the value "DownloadUrl".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setDownloadUrl(com.google.api.ads.adwords.axis.v201802.cm.TemporaryUrl downloadUrl) {
        this.downloadUrl = downloadUrl;
    }


    /**
     * Gets the processingErrors value for this BatchJob.
     * 
     * @return processingErrors   * A list of any errors that occurred during processing, not related
     * to specific
     *                 input operations, e.g. input file corruption errors.
     * <span class="constraint Selectable">This field can be selected using
     * the value "ProcessingErrors".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.BatchJobProcessingError[] getProcessingErrors() {
        return processingErrors;
    }


    /**
     * Sets the processingErrors value for this BatchJob.
     * 
     * @param processingErrors   * A list of any errors that occurred during processing, not related
     * to specific
     *                 input operations, e.g. input file corruption errors.
     * <span class="constraint Selectable">This field can be selected using
     * the value "ProcessingErrors".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setProcessingErrors(com.google.api.ads.adwords.axis.v201802.cm.BatchJobProcessingError[] processingErrors) {
        this.processingErrors = processingErrors;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.BatchJobProcessingError getProcessingErrors(int i) {
        return this.processingErrors[i];
    }

    public void setProcessingErrors(int i, com.google.api.ads.adwords.axis.v201802.cm.BatchJobProcessingError _value) {
        this.processingErrors[i] = _value;
    }


    /**
     * Gets the diskUsageQuotaBalance value for this BatchJob.
     * 
     * @return diskUsageQuotaBalance   * Disk quota balance of the batch job's customer in KB, which
     * is the limit of batch job disk
     *                 usage for the customer. The field is only returned
     * when calling {@link BatchJobService#mutate}
     *                 with an {@code ADD} operation.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Long getDiskUsageQuotaBalance() {
        return diskUsageQuotaBalance;
    }


    /**
     * Sets the diskUsageQuotaBalance value for this BatchJob.
     * 
     * @param diskUsageQuotaBalance   * Disk quota balance of the batch job's customer in KB, which
     * is the limit of batch job disk
     *                 usage for the customer. The field is only returned
     * when calling {@link BatchJobService#mutate}
     *                 with an {@code ADD} operation.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setDiskUsageQuotaBalance(java.lang.Long diskUsageQuotaBalance) {
        this.diskUsageQuotaBalance = diskUsageQuotaBalance;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchJob)) return false;
        BatchJob other = (BatchJob) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.progressStats==null && other.getProgressStats()==null) || 
             (this.progressStats!=null &&
              this.progressStats.equals(other.getProgressStats()))) &&
            ((this.uploadUrl==null && other.getUploadUrl()==null) || 
             (this.uploadUrl!=null &&
              this.uploadUrl.equals(other.getUploadUrl()))) &&
            ((this.downloadUrl==null && other.getDownloadUrl()==null) || 
             (this.downloadUrl!=null &&
              this.downloadUrl.equals(other.getDownloadUrl()))) &&
            ((this.processingErrors==null && other.getProcessingErrors()==null) || 
             (this.processingErrors!=null &&
              java.util.Arrays.equals(this.processingErrors, other.getProcessingErrors()))) &&
            ((this.diskUsageQuotaBalance==null && other.getDiskUsageQuotaBalance()==null) || 
             (this.diskUsageQuotaBalance!=null &&
              this.diskUsageQuotaBalance.equals(other.getDiskUsageQuotaBalance())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getProgressStats() != null) {
            _hashCode += getProgressStats().hashCode();
        }
        if (getUploadUrl() != null) {
            _hashCode += getUploadUrl().hashCode();
        }
        if (getDownloadUrl() != null) {
            _hashCode += getDownloadUrl().hashCode();
        }
        if (getProcessingErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProcessingErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProcessingErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDiskUsageQuotaBalance() != null) {
            _hashCode += getDiskUsageQuotaBalance().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BatchJob.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "BatchJob"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "BatchJobStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("progressStats");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "progressStats"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ProgressStats"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uploadUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "uploadUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TemporaryUrl"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downloadUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "downloadUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TemporaryUrl"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processingErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "processingErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "BatchJobProcessingError"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskUsageQuotaBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "diskUsageQuotaBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
