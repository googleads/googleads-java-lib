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
 * DraftAsyncError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * An error that has occurred while asynchronously processing the
 * promotion of a draft.
 */
public class DraftAsyncError  implements java.io.Serializable {
    /* The error occurred during promotion while updating this Campaign
     * or an entity in this Campaign.
     *                 This field can only be used with Predicate Operators
     * EQUALS and IN. When using a Predicate
     *                 with this field, also include a Predicate for the
     * field DraftId.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "BaseCampaignId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Long baseCampaignId;

    /* The draft that was attempted to be promoted.  This field can
     * only be used with Predicate
     *                 Operators EQUALS and IN. When using a Predicate with
     * this field, also include a Predicate for
     *                 the field BaseCampaignId.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "DraftId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Long draftId;

    /* The draft Campaign that was attempted to be promoted.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "DraftCampaignId".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Long draftCampaignId;

    /* The error that occurred while promoting the draft.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AsyncError".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.ApiError asyncError;

    /* The error occurred during promotion while updating this AdGroup
     * or an entity in this AdGroup.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "BaseAdGroupId".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Long baseAdGroupId;

    /* The draft AdGroup that was attempted to be promoted.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "DraftAdGroupId".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Long draftAdGroupId;

    public DraftAsyncError() {
    }

    public DraftAsyncError(
           java.lang.Long baseCampaignId,
           java.lang.Long draftId,
           java.lang.Long draftCampaignId,
           com.google.api.ads.adwords.axis.v201802.cm.ApiError asyncError,
           java.lang.Long baseAdGroupId,
           java.lang.Long draftAdGroupId) {
           this.baseCampaignId = baseCampaignId;
           this.draftId = draftId;
           this.draftCampaignId = draftCampaignId;
           this.asyncError = asyncError;
           this.baseAdGroupId = baseAdGroupId;
           this.draftAdGroupId = draftAdGroupId;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("asyncError", getAsyncError())
            .add("baseAdGroupId", getBaseAdGroupId())
            .add("baseCampaignId", getBaseCampaignId())
            .add("draftAdGroupId", getDraftAdGroupId())
            .add("draftCampaignId", getDraftCampaignId())
            .add("draftId", getDraftId())
            .toString();
    }

    /**
     * Gets the baseCampaignId value for this DraftAsyncError.
     * 
     * @return baseCampaignId   * The error occurred during promotion while updating this Campaign
     * or an entity in this Campaign.
     *                 This field can only be used with Predicate Operators
     * EQUALS and IN. When using a Predicate
     *                 with this field, also include a Predicate for the
     * field DraftId.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "BaseCampaignId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Long getBaseCampaignId() {
        return baseCampaignId;
    }


    /**
     * Sets the baseCampaignId value for this DraftAsyncError.
     * 
     * @param baseCampaignId   * The error occurred during promotion while updating this Campaign
     * or an entity in this Campaign.
     *                 This field can only be used with Predicate Operators
     * EQUALS and IN. When using a Predicate
     *                 with this field, also include a Predicate for the
     * field DraftId.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "BaseCampaignId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setBaseCampaignId(java.lang.Long baseCampaignId) {
        this.baseCampaignId = baseCampaignId;
    }


    /**
     * Gets the draftId value for this DraftAsyncError.
     * 
     * @return draftId   * The draft that was attempted to be promoted.  This field can
     * only be used with Predicate
     *                 Operators EQUALS and IN. When using a Predicate with
     * this field, also include a Predicate for
     *                 the field BaseCampaignId.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "DraftId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Long getDraftId() {
        return draftId;
    }


    /**
     * Sets the draftId value for this DraftAsyncError.
     * 
     * @param draftId   * The draft that was attempted to be promoted.  This field can
     * only be used with Predicate
     *                 Operators EQUALS and IN. When using a Predicate with
     * this field, also include a Predicate for
     *                 the field BaseCampaignId.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "DraftId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setDraftId(java.lang.Long draftId) {
        this.draftId = draftId;
    }


    /**
     * Gets the draftCampaignId value for this DraftAsyncError.
     * 
     * @return draftCampaignId   * The draft Campaign that was attempted to be promoted.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "DraftCampaignId".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Long getDraftCampaignId() {
        return draftCampaignId;
    }


    /**
     * Sets the draftCampaignId value for this DraftAsyncError.
     * 
     * @param draftCampaignId   * The draft Campaign that was attempted to be promoted.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "DraftCampaignId".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setDraftCampaignId(java.lang.Long draftCampaignId) {
        this.draftCampaignId = draftCampaignId;
    }


    /**
     * Gets the asyncError value for this DraftAsyncError.
     * 
     * @return asyncError   * The error that occurred while promoting the draft.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AsyncError".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.ApiError getAsyncError() {
        return asyncError;
    }


    /**
     * Sets the asyncError value for this DraftAsyncError.
     * 
     * @param asyncError   * The error that occurred while promoting the draft.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AsyncError".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setAsyncError(com.google.api.ads.adwords.axis.v201802.cm.ApiError asyncError) {
        this.asyncError = asyncError;
    }


    /**
     * Gets the baseAdGroupId value for this DraftAsyncError.
     * 
     * @return baseAdGroupId   * The error occurred during promotion while updating this AdGroup
     * or an entity in this AdGroup.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "BaseAdGroupId".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Long getBaseAdGroupId() {
        return baseAdGroupId;
    }


    /**
     * Sets the baseAdGroupId value for this DraftAsyncError.
     * 
     * @param baseAdGroupId   * The error occurred during promotion while updating this AdGroup
     * or an entity in this AdGroup.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "BaseAdGroupId".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setBaseAdGroupId(java.lang.Long baseAdGroupId) {
        this.baseAdGroupId = baseAdGroupId;
    }


    /**
     * Gets the draftAdGroupId value for this DraftAsyncError.
     * 
     * @return draftAdGroupId   * The draft AdGroup that was attempted to be promoted.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "DraftAdGroupId".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Long getDraftAdGroupId() {
        return draftAdGroupId;
    }


    /**
     * Sets the draftAdGroupId value for this DraftAsyncError.
     * 
     * @param draftAdGroupId   * The draft AdGroup that was attempted to be promoted.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "DraftAdGroupId".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setDraftAdGroupId(java.lang.Long draftAdGroupId) {
        this.draftAdGroupId = draftAdGroupId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DraftAsyncError)) return false;
        DraftAsyncError other = (DraftAsyncError) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.baseCampaignId==null && other.getBaseCampaignId()==null) || 
             (this.baseCampaignId!=null &&
              this.baseCampaignId.equals(other.getBaseCampaignId()))) &&
            ((this.draftId==null && other.getDraftId()==null) || 
             (this.draftId!=null &&
              this.draftId.equals(other.getDraftId()))) &&
            ((this.draftCampaignId==null && other.getDraftCampaignId()==null) || 
             (this.draftCampaignId!=null &&
              this.draftCampaignId.equals(other.getDraftCampaignId()))) &&
            ((this.asyncError==null && other.getAsyncError()==null) || 
             (this.asyncError!=null &&
              this.asyncError.equals(other.getAsyncError()))) &&
            ((this.baseAdGroupId==null && other.getBaseAdGroupId()==null) || 
             (this.baseAdGroupId!=null &&
              this.baseAdGroupId.equals(other.getBaseAdGroupId()))) &&
            ((this.draftAdGroupId==null && other.getDraftAdGroupId()==null) || 
             (this.draftAdGroupId!=null &&
              this.draftAdGroupId.equals(other.getDraftAdGroupId())));
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
        if (getBaseCampaignId() != null) {
            _hashCode += getBaseCampaignId().hashCode();
        }
        if (getDraftId() != null) {
            _hashCode += getDraftId().hashCode();
        }
        if (getDraftCampaignId() != null) {
            _hashCode += getDraftCampaignId().hashCode();
        }
        if (getAsyncError() != null) {
            _hashCode += getAsyncError().hashCode();
        }
        if (getBaseAdGroupId() != null) {
            _hashCode += getBaseAdGroupId().hashCode();
        }
        if (getDraftAdGroupId() != null) {
            _hashCode += getDraftAdGroupId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DraftAsyncError.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "DraftAsyncError"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseCampaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "baseCampaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("draftId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "draftId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("draftCampaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "draftCampaignId"));
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
        elemField.setFieldName("baseAdGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "baseAdGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("draftAdGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "draftAdGroupId"));
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
