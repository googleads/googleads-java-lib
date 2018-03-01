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
 * TrialAsyncError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * An error that has occurred while asynchronously processing the
 * creation or promotion of a trial.
 */
public class TrialAsyncError  implements java.io.Serializable {
    /* The trial that was attempted to be created or promoted.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "TrialId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Long trialId;

    /* The error that occurred while processing the trial.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AsyncError".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.ApiError asyncError;

    /* The error occurred during trial creation while updating this
     * Campaign or an entity in this
     *                 Campaign.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "TrialCampaignId".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Long trialCampaignId;

    /* The error occurred during trial creation while updating this
     * AdGroup or an entity in this
     *                 AdGroup.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "TrialAdGroupId".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Long trialAdGroupId;

    /* The error occurred during trial promotion while updating this
     * Campaign or an entity in this
     *                 Campaign.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "BaseCampaignId".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Long baseCampaignId;

    /* The error occurred during trial promotion while updating this
     * AdGroup or an entity in this
     *                 AdGroup.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "BaseAdGroupId".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Long baseAdGroupId;

    public TrialAsyncError() {
    }

    public TrialAsyncError(
           java.lang.Long trialId,
           com.google.api.ads.adwords.axis.v201802.cm.ApiError asyncError,
           java.lang.Long trialCampaignId,
           java.lang.Long trialAdGroupId,
           java.lang.Long baseCampaignId,
           java.lang.Long baseAdGroupId) {
           this.trialId = trialId;
           this.asyncError = asyncError;
           this.trialCampaignId = trialCampaignId;
           this.trialAdGroupId = trialAdGroupId;
           this.baseCampaignId = baseCampaignId;
           this.baseAdGroupId = baseAdGroupId;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("asyncError", getAsyncError())
            .add("baseAdGroupId", getBaseAdGroupId())
            .add("baseCampaignId", getBaseCampaignId())
            .add("trialAdGroupId", getTrialAdGroupId())
            .add("trialCampaignId", getTrialCampaignId())
            .add("trialId", getTrialId())
            .toString();
    }

    /**
     * Gets the trialId value for this TrialAsyncError.
     * 
     * @return trialId   * The trial that was attempted to be created or promoted.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "TrialId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Long getTrialId() {
        return trialId;
    }


    /**
     * Sets the trialId value for this TrialAsyncError.
     * 
     * @param trialId   * The trial that was attempted to be created or promoted.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "TrialId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setTrialId(java.lang.Long trialId) {
        this.trialId = trialId;
    }


    /**
     * Gets the asyncError value for this TrialAsyncError.
     * 
     * @return asyncError   * The error that occurred while processing the trial.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AsyncError".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.ApiError getAsyncError() {
        return asyncError;
    }


    /**
     * Sets the asyncError value for this TrialAsyncError.
     * 
     * @param asyncError   * The error that occurred while processing the trial.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AsyncError".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setAsyncError(com.google.api.ads.adwords.axis.v201802.cm.ApiError asyncError) {
        this.asyncError = asyncError;
    }


    /**
     * Gets the trialCampaignId value for this TrialAsyncError.
     * 
     * @return trialCampaignId   * The error occurred during trial creation while updating this
     * Campaign or an entity in this
     *                 Campaign.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "TrialCampaignId".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Long getTrialCampaignId() {
        return trialCampaignId;
    }


    /**
     * Sets the trialCampaignId value for this TrialAsyncError.
     * 
     * @param trialCampaignId   * The error occurred during trial creation while updating this
     * Campaign or an entity in this
     *                 Campaign.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "TrialCampaignId".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setTrialCampaignId(java.lang.Long trialCampaignId) {
        this.trialCampaignId = trialCampaignId;
    }


    /**
     * Gets the trialAdGroupId value for this TrialAsyncError.
     * 
     * @return trialAdGroupId   * The error occurred during trial creation while updating this
     * AdGroup or an entity in this
     *                 AdGroup.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "TrialAdGroupId".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Long getTrialAdGroupId() {
        return trialAdGroupId;
    }


    /**
     * Sets the trialAdGroupId value for this TrialAsyncError.
     * 
     * @param trialAdGroupId   * The error occurred during trial creation while updating this
     * AdGroup or an entity in this
     *                 AdGroup.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "TrialAdGroupId".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setTrialAdGroupId(java.lang.Long trialAdGroupId) {
        this.trialAdGroupId = trialAdGroupId;
    }


    /**
     * Gets the baseCampaignId value for this TrialAsyncError.
     * 
     * @return baseCampaignId   * The error occurred during trial promotion while updating this
     * Campaign or an entity in this
     *                 Campaign.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "BaseCampaignId".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Long getBaseCampaignId() {
        return baseCampaignId;
    }


    /**
     * Sets the baseCampaignId value for this TrialAsyncError.
     * 
     * @param baseCampaignId   * The error occurred during trial promotion while updating this
     * Campaign or an entity in this
     *                 Campaign.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "BaseCampaignId".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setBaseCampaignId(java.lang.Long baseCampaignId) {
        this.baseCampaignId = baseCampaignId;
    }


    /**
     * Gets the baseAdGroupId value for this TrialAsyncError.
     * 
     * @return baseAdGroupId   * The error occurred during trial promotion while updating this
     * AdGroup or an entity in this
     *                 AdGroup.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "BaseAdGroupId".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Long getBaseAdGroupId() {
        return baseAdGroupId;
    }


    /**
     * Sets the baseAdGroupId value for this TrialAsyncError.
     * 
     * @param baseAdGroupId   * The error occurred during trial promotion while updating this
     * AdGroup or an entity in this
     *                 AdGroup.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "BaseAdGroupId".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setBaseAdGroupId(java.lang.Long baseAdGroupId) {
        this.baseAdGroupId = baseAdGroupId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrialAsyncError)) return false;
        TrialAsyncError other = (TrialAsyncError) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.trialId==null && other.getTrialId()==null) || 
             (this.trialId!=null &&
              this.trialId.equals(other.getTrialId()))) &&
            ((this.asyncError==null && other.getAsyncError()==null) || 
             (this.asyncError!=null &&
              this.asyncError.equals(other.getAsyncError()))) &&
            ((this.trialCampaignId==null && other.getTrialCampaignId()==null) || 
             (this.trialCampaignId!=null &&
              this.trialCampaignId.equals(other.getTrialCampaignId()))) &&
            ((this.trialAdGroupId==null && other.getTrialAdGroupId()==null) || 
             (this.trialAdGroupId!=null &&
              this.trialAdGroupId.equals(other.getTrialAdGroupId()))) &&
            ((this.baseCampaignId==null && other.getBaseCampaignId()==null) || 
             (this.baseCampaignId!=null &&
              this.baseCampaignId.equals(other.getBaseCampaignId()))) &&
            ((this.baseAdGroupId==null && other.getBaseAdGroupId()==null) || 
             (this.baseAdGroupId!=null &&
              this.baseAdGroupId.equals(other.getBaseAdGroupId())));
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
        if (getTrialId() != null) {
            _hashCode += getTrialId().hashCode();
        }
        if (getAsyncError() != null) {
            _hashCode += getAsyncError().hashCode();
        }
        if (getTrialCampaignId() != null) {
            _hashCode += getTrialCampaignId().hashCode();
        }
        if (getTrialAdGroupId() != null) {
            _hashCode += getTrialAdGroupId().hashCode();
        }
        if (getBaseCampaignId() != null) {
            _hashCode += getBaseCampaignId().hashCode();
        }
        if (getBaseAdGroupId() != null) {
            _hashCode += getBaseAdGroupId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrialAsyncError.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TrialAsyncError"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trialId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "trialId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asyncError");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "asyncError"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ApiError"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trialCampaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "trialCampaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trialAdGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "trialAdGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseCampaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "baseCampaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseAdGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "baseAdGroupId"));
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
