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
 * Draft.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * The interface object which contains the basic information of a
 * draft.  Entity specific
 *             information in the campaign tree are represented by their
 * respective entities objects with a
 *             corresponding draftId.
 */
public class Draft  implements java.io.Serializable {
    /* <span class="constraint Selectable">This field can be selected
     * using the value "DraftId".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span> */
    private java.lang.Long draftId;

    /* <span class="constraint Selectable">This field can be selected
     * using the value "BaseCampaignId".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.Long baseCampaignId;

    /* <span class="constraint Selectable">This field can be selected
     * using the value "DraftName".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 1024, inclusive, in UTF-8 bytes,
     * (trimmed).</span> */
    private java.lang.String draftName;

    /* <span class="constraint Selectable">This field can be selected
     * using the value "DraftStatus".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.DraftStatus draftStatus;

    /* The campaign id that references the draft version of the
     *                 original campaign.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "DraftCampaignId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Long draftCampaignId;

    /* True, if a trial created from this draft is running. Only available
     * via the Get action.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "HasRunningTrial".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Boolean hasRunningTrial;

    public Draft() {
    }

    public Draft(
           java.lang.Long draftId,
           java.lang.Long baseCampaignId,
           java.lang.String draftName,
           com.google.api.ads.adwords.axis.v201802.cm.DraftStatus draftStatus,
           java.lang.Long draftCampaignId,
           java.lang.Boolean hasRunningTrial) {
           this.draftId = draftId;
           this.baseCampaignId = baseCampaignId;
           this.draftName = draftName;
           this.draftStatus = draftStatus;
           this.draftCampaignId = draftCampaignId;
           this.hasRunningTrial = hasRunningTrial;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("baseCampaignId", getBaseCampaignId())
            .add("draftCampaignId", getDraftCampaignId())
            .add("draftId", getDraftId())
            .add("draftName", getDraftName())
            .add("draftStatus", getDraftStatus())
            .add("hasRunningTrial", getHasRunningTrial())
            .toString();
    }

    /**
     * Gets the draftId value for this Draft.
     * 
     * @return draftId   * <span class="constraint Selectable">This field can be selected
     * using the value "DraftId".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span>
     */
    public java.lang.Long getDraftId() {
        return draftId;
    }


    /**
     * Sets the draftId value for this Draft.
     * 
     * @param draftId   * <span class="constraint Selectable">This field can be selected
     * using the value "DraftId".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span>
     */
    public void setDraftId(java.lang.Long draftId) {
        this.draftId = draftId;
    }


    /**
     * Gets the baseCampaignId value for this Draft.
     * 
     * @return baseCampaignId   * <span class="constraint Selectable">This field can be selected
     * using the value "BaseCampaignId".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.Long getBaseCampaignId() {
        return baseCampaignId;
    }


    /**
     * Sets the baseCampaignId value for this Draft.
     * 
     * @param baseCampaignId   * <span class="constraint Selectable">This field can be selected
     * using the value "BaseCampaignId".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setBaseCampaignId(java.lang.Long baseCampaignId) {
        this.baseCampaignId = baseCampaignId;
    }


    /**
     * Gets the draftName value for this Draft.
     * 
     * @return draftName   * <span class="constraint Selectable">This field can be selected
     * using the value "DraftName".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 1024, inclusive, in UTF-8 bytes,
     * (trimmed).</span>
     */
    public java.lang.String getDraftName() {
        return draftName;
    }


    /**
     * Sets the draftName value for this Draft.
     * 
     * @param draftName   * <span class="constraint Selectable">This field can be selected
     * using the value "DraftName".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 1024, inclusive, in UTF-8 bytes,
     * (trimmed).</span>
     */
    public void setDraftName(java.lang.String draftName) {
        this.draftName = draftName;
    }


    /**
     * Gets the draftStatus value for this Draft.
     * 
     * @return draftStatus   * <span class="constraint Selectable">This field can be selected
     * using the value "DraftStatus".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.DraftStatus getDraftStatus() {
        return draftStatus;
    }


    /**
     * Sets the draftStatus value for this Draft.
     * 
     * @param draftStatus   * <span class="constraint Selectable">This field can be selected
     * using the value "DraftStatus".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     */
    public void setDraftStatus(com.google.api.ads.adwords.axis.v201802.cm.DraftStatus draftStatus) {
        this.draftStatus = draftStatus;
    }


    /**
     * Gets the draftCampaignId value for this Draft.
     * 
     * @return draftCampaignId   * The campaign id that references the draft version of the
     *                 original campaign.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "DraftCampaignId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Long getDraftCampaignId() {
        return draftCampaignId;
    }


    /**
     * Sets the draftCampaignId value for this Draft.
     * 
     * @param draftCampaignId   * The campaign id that references the draft version of the
     *                 original campaign.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "DraftCampaignId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setDraftCampaignId(java.lang.Long draftCampaignId) {
        this.draftCampaignId = draftCampaignId;
    }


    /**
     * Gets the hasRunningTrial value for this Draft.
     * 
     * @return hasRunningTrial   * True, if a trial created from this draft is running. Only available
     * via the Get action.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "HasRunningTrial".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Boolean getHasRunningTrial() {
        return hasRunningTrial;
    }


    /**
     * Sets the hasRunningTrial value for this Draft.
     * 
     * @param hasRunningTrial   * True, if a trial created from this draft is running. Only available
     * via the Get action.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "HasRunningTrial".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setHasRunningTrial(java.lang.Boolean hasRunningTrial) {
        this.hasRunningTrial = hasRunningTrial;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Draft)) return false;
        Draft other = (Draft) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.draftId==null && other.getDraftId()==null) || 
             (this.draftId!=null &&
              this.draftId.equals(other.getDraftId()))) &&
            ((this.baseCampaignId==null && other.getBaseCampaignId()==null) || 
             (this.baseCampaignId!=null &&
              this.baseCampaignId.equals(other.getBaseCampaignId()))) &&
            ((this.draftName==null && other.getDraftName()==null) || 
             (this.draftName!=null &&
              this.draftName.equals(other.getDraftName()))) &&
            ((this.draftStatus==null && other.getDraftStatus()==null) || 
             (this.draftStatus!=null &&
              this.draftStatus.equals(other.getDraftStatus()))) &&
            ((this.draftCampaignId==null && other.getDraftCampaignId()==null) || 
             (this.draftCampaignId!=null &&
              this.draftCampaignId.equals(other.getDraftCampaignId()))) &&
            ((this.hasRunningTrial==null && other.getHasRunningTrial()==null) || 
             (this.hasRunningTrial!=null &&
              this.hasRunningTrial.equals(other.getHasRunningTrial())));
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
        if (getDraftId() != null) {
            _hashCode += getDraftId().hashCode();
        }
        if (getBaseCampaignId() != null) {
            _hashCode += getBaseCampaignId().hashCode();
        }
        if (getDraftName() != null) {
            _hashCode += getDraftName().hashCode();
        }
        if (getDraftStatus() != null) {
            _hashCode += getDraftStatus().hashCode();
        }
        if (getDraftCampaignId() != null) {
            _hashCode += getDraftCampaignId().hashCode();
        }
        if (getHasRunningTrial() != null) {
            _hashCode += getHasRunningTrial().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Draft.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Draft"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("draftId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "draftId"));
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
        elemField.setFieldName("draftName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "draftName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("draftStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "draftStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "DraftStatus"));
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
        elemField.setFieldName("hasRunningTrial");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "hasRunningTrial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
