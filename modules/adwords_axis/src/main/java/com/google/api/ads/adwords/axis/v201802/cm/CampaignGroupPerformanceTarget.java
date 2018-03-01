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
 * CampaignGroupPerformanceTarget.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Data representing a campaign group performance target. A campaign
 * group performance target is an
 *             entity that specifies a time range for a campaign group
 * and various metrics by which the
 *             performance of that campaign group can be measured for
 * the time period that the performance
 *             target is active.
 */
public class CampaignGroupPerformanceTarget  implements java.io.Serializable {
    /* Id of this campaign group performance target.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Id".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : REMOVE, SET.</span> */
    private java.lang.Long id;

    /* Id of the campaign group that this performance target is for.
     * <span class="constraint Selectable">This field can be selected using
     * the value "CampaignGroupId".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.Long campaignGroupId;

    /* The main configuration of the performance target.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, SET.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.PerformanceTarget performanceTarget;

    public CampaignGroupPerformanceTarget() {
    }

    public CampaignGroupPerformanceTarget(
           java.lang.Long id,
           java.lang.Long campaignGroupId,
           com.google.api.ads.adwords.axis.v201802.cm.PerformanceTarget performanceTarget) {
           this.id = id;
           this.campaignGroupId = campaignGroupId;
           this.performanceTarget = performanceTarget;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("campaignGroupId", getCampaignGroupId())
            .add("id", getId())
            .add("performanceTarget", getPerformanceTarget())
            .toString();
    }

    /**
     * Gets the id value for this CampaignGroupPerformanceTarget.
     * 
     * @return id   * Id of this campaign group performance target.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Id".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : REMOVE, SET.</span>
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this CampaignGroupPerformanceTarget.
     * 
     * @param id   * Id of this campaign group performance target.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Id".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : REMOVE, SET.</span>
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the campaignGroupId value for this CampaignGroupPerformanceTarget.
     * 
     * @return campaignGroupId   * Id of the campaign group that this performance target is for.
     * <span class="constraint Selectable">This field can be selected using
     * the value "CampaignGroupId".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.Long getCampaignGroupId() {
        return campaignGroupId;
    }


    /**
     * Sets the campaignGroupId value for this CampaignGroupPerformanceTarget.
     * 
     * @param campaignGroupId   * Id of the campaign group that this performance target is for.
     * <span class="constraint Selectable">This field can be selected using
     * the value "CampaignGroupId".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setCampaignGroupId(java.lang.Long campaignGroupId) {
        this.campaignGroupId = campaignGroupId;
    }


    /**
     * Gets the performanceTarget value for this CampaignGroupPerformanceTarget.
     * 
     * @return performanceTarget   * The main configuration of the performance target.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, SET.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.PerformanceTarget getPerformanceTarget() {
        return performanceTarget;
    }


    /**
     * Sets the performanceTarget value for this CampaignGroupPerformanceTarget.
     * 
     * @param performanceTarget   * The main configuration of the performance target.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, SET.</span>
     */
    public void setPerformanceTarget(com.google.api.ads.adwords.axis.v201802.cm.PerformanceTarget performanceTarget) {
        this.performanceTarget = performanceTarget;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CampaignGroupPerformanceTarget)) return false;
        CampaignGroupPerformanceTarget other = (CampaignGroupPerformanceTarget) obj;
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
            ((this.campaignGroupId==null && other.getCampaignGroupId()==null) || 
             (this.campaignGroupId!=null &&
              this.campaignGroupId.equals(other.getCampaignGroupId()))) &&
            ((this.performanceTarget==null && other.getPerformanceTarget()==null) || 
             (this.performanceTarget!=null &&
              this.performanceTarget.equals(other.getPerformanceTarget())));
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
        if (getCampaignGroupId() != null) {
            _hashCode += getCampaignGroupId().hashCode();
        }
        if (getPerformanceTarget() != null) {
            _hashCode += getPerformanceTarget().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CampaignGroupPerformanceTarget.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CampaignGroupPerformanceTarget"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "campaignGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("performanceTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "performanceTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PerformanceTarget"));
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
