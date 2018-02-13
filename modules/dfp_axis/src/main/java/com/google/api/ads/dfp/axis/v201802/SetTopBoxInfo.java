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
 * SetTopBoxInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Contains data used to display information synchronized with Canoe
 * for set-top box enabled {@link
 *             LineItem line items}.
 */
public class SetTopBoxInfo  implements java.io.Serializable {
    /* Indicates if the line item is ready to be synced with Canoe
     * or if there are changes on this
     *                 line item that are waiting to be pushed on the next
     * sync with Canoe. This attribute is
     *                 read-only. */
    private com.google.api.ads.dfp.axis.v201802.SetTopBoxSyncStatus syncStatus;

    /* The result of the last sync attempt with Canoe. This attribute
     * is read-only. */
    private com.google.api.ads.dfp.axis.v201802.CanoeSyncResult lastSyncResult;

    /* The response that Canoe sent for the last sync attempt. This
     * attribute is read-only. */
    private java.lang.String lastSyncCanoeResponseMessage;

    /* The Nielsen product category code for the line item. */
    private java.lang.String nielsenProductCategoryCode;

    public SetTopBoxInfo() {
    }

    public SetTopBoxInfo(
           com.google.api.ads.dfp.axis.v201802.SetTopBoxSyncStatus syncStatus,
           com.google.api.ads.dfp.axis.v201802.CanoeSyncResult lastSyncResult,
           java.lang.String lastSyncCanoeResponseMessage,
           java.lang.String nielsenProductCategoryCode) {
           this.syncStatus = syncStatus;
           this.lastSyncResult = lastSyncResult;
           this.lastSyncCanoeResponseMessage = lastSyncCanoeResponseMessage;
           this.nielsenProductCategoryCode = nielsenProductCategoryCode;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("lastSyncCanoeResponseMessage", getLastSyncCanoeResponseMessage())
            .add("lastSyncResult", getLastSyncResult())
            .add("nielsenProductCategoryCode", getNielsenProductCategoryCode())
            .add("syncStatus", getSyncStatus())
            .toString();
    }

    /**
     * Gets the syncStatus value for this SetTopBoxInfo.
     * 
     * @return syncStatus   * Indicates if the line item is ready to be synced with Canoe
     * or if there are changes on this
     *                 line item that are waiting to be pushed on the next
     * sync with Canoe. This attribute is
     *                 read-only.
     */
    public com.google.api.ads.dfp.axis.v201802.SetTopBoxSyncStatus getSyncStatus() {
        return syncStatus;
    }


    /**
     * Sets the syncStatus value for this SetTopBoxInfo.
     * 
     * @param syncStatus   * Indicates if the line item is ready to be synced with Canoe
     * or if there are changes on this
     *                 line item that are waiting to be pushed on the next
     * sync with Canoe. This attribute is
     *                 read-only.
     */
    public void setSyncStatus(com.google.api.ads.dfp.axis.v201802.SetTopBoxSyncStatus syncStatus) {
        this.syncStatus = syncStatus;
    }


    /**
     * Gets the lastSyncResult value for this SetTopBoxInfo.
     * 
     * @return lastSyncResult   * The result of the last sync attempt with Canoe. This attribute
     * is read-only.
     */
    public com.google.api.ads.dfp.axis.v201802.CanoeSyncResult getLastSyncResult() {
        return lastSyncResult;
    }


    /**
     * Sets the lastSyncResult value for this SetTopBoxInfo.
     * 
     * @param lastSyncResult   * The result of the last sync attempt with Canoe. This attribute
     * is read-only.
     */
    public void setLastSyncResult(com.google.api.ads.dfp.axis.v201802.CanoeSyncResult lastSyncResult) {
        this.lastSyncResult = lastSyncResult;
    }


    /**
     * Gets the lastSyncCanoeResponseMessage value for this SetTopBoxInfo.
     * 
     * @return lastSyncCanoeResponseMessage   * The response that Canoe sent for the last sync attempt. This
     * attribute is read-only.
     */
    public java.lang.String getLastSyncCanoeResponseMessage() {
        return lastSyncCanoeResponseMessage;
    }


    /**
     * Sets the lastSyncCanoeResponseMessage value for this SetTopBoxInfo.
     * 
     * @param lastSyncCanoeResponseMessage   * The response that Canoe sent for the last sync attempt. This
     * attribute is read-only.
     */
    public void setLastSyncCanoeResponseMessage(java.lang.String lastSyncCanoeResponseMessage) {
        this.lastSyncCanoeResponseMessage = lastSyncCanoeResponseMessage;
    }


    /**
     * Gets the nielsenProductCategoryCode value for this SetTopBoxInfo.
     * 
     * @return nielsenProductCategoryCode   * The Nielsen product category code for the line item.
     */
    public java.lang.String getNielsenProductCategoryCode() {
        return nielsenProductCategoryCode;
    }


    /**
     * Sets the nielsenProductCategoryCode value for this SetTopBoxInfo.
     * 
     * @param nielsenProductCategoryCode   * The Nielsen product category code for the line item.
     */
    public void setNielsenProductCategoryCode(java.lang.String nielsenProductCategoryCode) {
        this.nielsenProductCategoryCode = nielsenProductCategoryCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetTopBoxInfo)) return false;
        SetTopBoxInfo other = (SetTopBoxInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.syncStatus==null && other.getSyncStatus()==null) || 
             (this.syncStatus!=null &&
              this.syncStatus.equals(other.getSyncStatus()))) &&
            ((this.lastSyncResult==null && other.getLastSyncResult()==null) || 
             (this.lastSyncResult!=null &&
              this.lastSyncResult.equals(other.getLastSyncResult()))) &&
            ((this.lastSyncCanoeResponseMessage==null && other.getLastSyncCanoeResponseMessage()==null) || 
             (this.lastSyncCanoeResponseMessage!=null &&
              this.lastSyncCanoeResponseMessage.equals(other.getLastSyncCanoeResponseMessage()))) &&
            ((this.nielsenProductCategoryCode==null && other.getNielsenProductCategoryCode()==null) || 
             (this.nielsenProductCategoryCode!=null &&
              this.nielsenProductCategoryCode.equals(other.getNielsenProductCategoryCode())));
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
        if (getSyncStatus() != null) {
            _hashCode += getSyncStatus().hashCode();
        }
        if (getLastSyncResult() != null) {
            _hashCode += getLastSyncResult().hashCode();
        }
        if (getLastSyncCanoeResponseMessage() != null) {
            _hashCode += getLastSyncCanoeResponseMessage().hashCode();
        }
        if (getNielsenProductCategoryCode() != null) {
            _hashCode += getNielsenProductCategoryCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetTopBoxInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "SetTopBoxInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syncStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "syncStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "SetTopBoxSyncStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastSyncResult");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "lastSyncResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CanoeSyncResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastSyncCanoeResponseMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "lastSyncCanoeResponseMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nielsenProductCategoryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "nielsenProductCategoryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
