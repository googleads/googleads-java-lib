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
 * OfflineDataUpload.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.rm;


/**
 * Data representing offline transactions.
 */
public class OfflineDataUpload  implements java.io.Serializable {
    /* User specified upload id.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ExternalUploadId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span> */
    private java.lang.Long externalUploadId;

    /* Type of this upload.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201802.rm.OfflineDataUploadType uploadType;

    /* Status of this upload.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "UploadStatus".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span> */
    private com.google.api.ads.adwords.axis.v201802.rm.OfflineDataUploadStatus uploadStatus;

    /* Metadata for this upload. */
    private com.google.api.ads.adwords.axis.v201802.rm.UploadMetadata uploadMetadata;

    /* List of offline data in this upload. For AdWords API, each
     * offlineDataList can have at most 50
     *                 OfflineData.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201802.rm.OfflineData[] offlineDataList;

    /* Processing failure reason for get, if status is FAILURE. Used
     * for upload level failures.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "FailureReason".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span> */
    private com.google.api.ads.adwords.axis.v201802.rm.OfflineDataUploadFailureReason failureReason;

    public OfflineDataUpload() {
    }

    public OfflineDataUpload(
           java.lang.Long externalUploadId,
           com.google.api.ads.adwords.axis.v201802.rm.OfflineDataUploadType uploadType,
           com.google.api.ads.adwords.axis.v201802.rm.OfflineDataUploadStatus uploadStatus,
           com.google.api.ads.adwords.axis.v201802.rm.UploadMetadata uploadMetadata,
           com.google.api.ads.adwords.axis.v201802.rm.OfflineData[] offlineDataList,
           com.google.api.ads.adwords.axis.v201802.rm.OfflineDataUploadFailureReason failureReason) {
           this.externalUploadId = externalUploadId;
           this.uploadType = uploadType;
           this.uploadStatus = uploadStatus;
           this.uploadMetadata = uploadMetadata;
           this.offlineDataList = offlineDataList;
           this.failureReason = failureReason;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("externalUploadId", getExternalUploadId())
            .add("failureReason", getFailureReason())
            .add("offlineDataList", getOfflineDataList())
            .add("uploadMetadata", getUploadMetadata())
            .add("uploadStatus", getUploadStatus())
            .add("uploadType", getUploadType())
            .toString();
    }

    /**
     * Gets the externalUploadId value for this OfflineDataUpload.
     * 
     * @return externalUploadId   * User specified upload id.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ExternalUploadId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public java.lang.Long getExternalUploadId() {
        return externalUploadId;
    }


    /**
     * Sets the externalUploadId value for this OfflineDataUpload.
     * 
     * @param externalUploadId   * User specified upload id.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ExternalUploadId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public void setExternalUploadId(java.lang.Long externalUploadId) {
        this.externalUploadId = externalUploadId;
    }


    /**
     * Gets the uploadType value for this OfflineDataUpload.
     * 
     * @return uploadType   * Type of this upload.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.rm.OfflineDataUploadType getUploadType() {
        return uploadType;
    }


    /**
     * Sets the uploadType value for this OfflineDataUpload.
     * 
     * @param uploadType   * Type of this upload.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public void setUploadType(com.google.api.ads.adwords.axis.v201802.rm.OfflineDataUploadType uploadType) {
        this.uploadType = uploadType;
    }


    /**
     * Gets the uploadStatus value for this OfflineDataUpload.
     * 
     * @return uploadStatus   * Status of this upload.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "UploadStatus".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.rm.OfflineDataUploadStatus getUploadStatus() {
        return uploadStatus;
    }


    /**
     * Sets the uploadStatus value for this OfflineDataUpload.
     * 
     * @param uploadStatus   * Status of this upload.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "UploadStatus".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     */
    public void setUploadStatus(com.google.api.ads.adwords.axis.v201802.rm.OfflineDataUploadStatus uploadStatus) {
        this.uploadStatus = uploadStatus;
    }


    /**
     * Gets the uploadMetadata value for this OfflineDataUpload.
     * 
     * @return uploadMetadata   * Metadata for this upload.
     */
    public com.google.api.ads.adwords.axis.v201802.rm.UploadMetadata getUploadMetadata() {
        return uploadMetadata;
    }


    /**
     * Sets the uploadMetadata value for this OfflineDataUpload.
     * 
     * @param uploadMetadata   * Metadata for this upload.
     */
    public void setUploadMetadata(com.google.api.ads.adwords.axis.v201802.rm.UploadMetadata uploadMetadata) {
        this.uploadMetadata = uploadMetadata;
    }


    /**
     * Gets the offlineDataList value for this OfflineDataUpload.
     * 
     * @return offlineDataList   * List of offline data in this upload. For AdWords API, each
     * offlineDataList can have at most 50
     *                 OfflineData.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.rm.OfflineData[] getOfflineDataList() {
        return offlineDataList;
    }


    /**
     * Sets the offlineDataList value for this OfflineDataUpload.
     * 
     * @param offlineDataList   * List of offline data in this upload. For AdWords API, each
     * offlineDataList can have at most 50
     *                 OfflineData.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public void setOfflineDataList(com.google.api.ads.adwords.axis.v201802.rm.OfflineData[] offlineDataList) {
        this.offlineDataList = offlineDataList;
    }

    public com.google.api.ads.adwords.axis.v201802.rm.OfflineData getOfflineDataList(int i) {
        return this.offlineDataList[i];
    }

    public void setOfflineDataList(int i, com.google.api.ads.adwords.axis.v201802.rm.OfflineData _value) {
        this.offlineDataList[i] = _value;
    }


    /**
     * Gets the failureReason value for this OfflineDataUpload.
     * 
     * @return failureReason   * Processing failure reason for get, if status is FAILURE. Used
     * for upload level failures.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "FailureReason".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.rm.OfflineDataUploadFailureReason getFailureReason() {
        return failureReason;
    }


    /**
     * Sets the failureReason value for this OfflineDataUpload.
     * 
     * @param failureReason   * Processing failure reason for get, if status is FAILURE. Used
     * for upload level failures.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "FailureReason".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     */
    public void setFailureReason(com.google.api.ads.adwords.axis.v201802.rm.OfflineDataUploadFailureReason failureReason) {
        this.failureReason = failureReason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OfflineDataUpload)) return false;
        OfflineDataUpload other = (OfflineDataUpload) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.externalUploadId==null && other.getExternalUploadId()==null) || 
             (this.externalUploadId!=null &&
              this.externalUploadId.equals(other.getExternalUploadId()))) &&
            ((this.uploadType==null && other.getUploadType()==null) || 
             (this.uploadType!=null &&
              this.uploadType.equals(other.getUploadType()))) &&
            ((this.uploadStatus==null && other.getUploadStatus()==null) || 
             (this.uploadStatus!=null &&
              this.uploadStatus.equals(other.getUploadStatus()))) &&
            ((this.uploadMetadata==null && other.getUploadMetadata()==null) || 
             (this.uploadMetadata!=null &&
              this.uploadMetadata.equals(other.getUploadMetadata()))) &&
            ((this.offlineDataList==null && other.getOfflineDataList()==null) || 
             (this.offlineDataList!=null &&
              java.util.Arrays.equals(this.offlineDataList, other.getOfflineDataList()))) &&
            ((this.failureReason==null && other.getFailureReason()==null) || 
             (this.failureReason!=null &&
              this.failureReason.equals(other.getFailureReason())));
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
        if (getExternalUploadId() != null) {
            _hashCode += getExternalUploadId().hashCode();
        }
        if (getUploadType() != null) {
            _hashCode += getUploadType().hashCode();
        }
        if (getUploadStatus() != null) {
            _hashCode += getUploadStatus().hashCode();
        }
        if (getUploadMetadata() != null) {
            _hashCode += getUploadMetadata().hashCode();
        }
        if (getOfflineDataList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOfflineDataList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOfflineDataList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFailureReason() != null) {
            _hashCode += getFailureReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OfflineDataUpload.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "OfflineDataUpload"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalUploadId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "externalUploadId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uploadType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "uploadType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "OfflineDataUploadType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uploadStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "uploadStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "OfflineDataUploadStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uploadMetadata");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "uploadMetadata"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "UploadMetadata"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offlineDataList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "offlineDataList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "OfflineData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failureReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "failureReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "OfflineDataUploadFailureReason"));
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
