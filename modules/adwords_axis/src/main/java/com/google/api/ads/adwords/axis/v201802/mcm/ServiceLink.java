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
 * ServiceLink.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.mcm;


/**
 * A data-sharing connection between an AdWords customer and another
 * Google service.
 */
public class ServiceLink  implements java.io.Serializable {
    /* The service being linked.
     *                 <span class="constraint Filterable">This field can
     * be filtered on using the value "ServiceType".</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201802.mcm.ServiceType serviceType;

    /* An ID uniquely identifying this link within a given {@link
     * serviceType}.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET, REMOVE.</span> */
    private java.lang.Long serviceLinkId;

    /* Status of the link.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span> */
    private com.google.api.ads.adwords.axis.v201802.mcm.ServiceLinkLinkStatus linkStatus;

    /* An identifier for the service account to which the AdWords
     * account is linked.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String name;

    public ServiceLink() {
    }

    public ServiceLink(
           com.google.api.ads.adwords.axis.v201802.mcm.ServiceType serviceType,
           java.lang.Long serviceLinkId,
           com.google.api.ads.adwords.axis.v201802.mcm.ServiceLinkLinkStatus linkStatus,
           java.lang.String name) {
           this.serviceType = serviceType;
           this.serviceLinkId = serviceLinkId;
           this.linkStatus = linkStatus;
           this.name = name;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("linkStatus", getLinkStatus())
            .add("name", getName())
            .add("serviceLinkId", getServiceLinkId())
            .add("serviceType", getServiceType())
            .toString();
    }

    /**
     * Gets the serviceType value for this ServiceLink.
     * 
     * @return serviceType   * The service being linked.
     *                 <span class="constraint Filterable">This field can
     * be filtered on using the value "ServiceType".</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.mcm.ServiceType getServiceType() {
        return serviceType;
    }


    /**
     * Sets the serviceType value for this ServiceLink.
     * 
     * @param serviceType   * The service being linked.
     *                 <span class="constraint Filterable">This field can
     * be filtered on using the value "ServiceType".</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setServiceType(com.google.api.ads.adwords.axis.v201802.mcm.ServiceType serviceType) {
        this.serviceType = serviceType;
    }


    /**
     * Gets the serviceLinkId value for this ServiceLink.
     * 
     * @return serviceLinkId   * An ID uniquely identifying this link within a given {@link
     * serviceType}.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET, REMOVE.</span>
     */
    public java.lang.Long getServiceLinkId() {
        return serviceLinkId;
    }


    /**
     * Sets the serviceLinkId value for this ServiceLink.
     * 
     * @param serviceLinkId   * An ID uniquely identifying this link within a given {@link
     * serviceType}.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET, REMOVE.</span>
     */
    public void setServiceLinkId(java.lang.Long serviceLinkId) {
        this.serviceLinkId = serviceLinkId;
    }


    /**
     * Gets the linkStatus value for this ServiceLink.
     * 
     * @return linkStatus   * Status of the link.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.mcm.ServiceLinkLinkStatus getLinkStatus() {
        return linkStatus;
    }


    /**
     * Sets the linkStatus value for this ServiceLink.
     * 
     * @param linkStatus   * Status of the link.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span>
     */
    public void setLinkStatus(com.google.api.ads.adwords.axis.v201802.mcm.ServiceLinkLinkStatus linkStatus) {
        this.linkStatus = linkStatus;
    }


    /**
     * Gets the name value for this ServiceLink.
     * 
     * @return name   * An identifier for the service account to which the AdWords
     * account is linked.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ServiceLink.
     * 
     * @param name   * An identifier for the service account to which the AdWords
     * account is linked.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceLink)) return false;
        ServiceLink other = (ServiceLink) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serviceType==null && other.getServiceType()==null) || 
             (this.serviceType!=null &&
              this.serviceType.equals(other.getServiceType()))) &&
            ((this.serviceLinkId==null && other.getServiceLinkId()==null) || 
             (this.serviceLinkId!=null &&
              this.serviceLinkId.equals(other.getServiceLinkId()))) &&
            ((this.linkStatus==null && other.getLinkStatus()==null) || 
             (this.linkStatus!=null &&
              this.linkStatus.equals(other.getLinkStatus()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())));
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
        if (getServiceType() != null) {
            _hashCode += getServiceType().hashCode();
        }
        if (getServiceLinkId() != null) {
            _hashCode += getServiceLinkId().hashCode();
        }
        if (getLinkStatus() != null) {
            _hashCode += getLinkStatus().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceLink.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "ServiceLink"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "serviceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "ServiceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceLinkId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "serviceLinkId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "linkStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "ServiceLink.LinkStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "name"));
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
