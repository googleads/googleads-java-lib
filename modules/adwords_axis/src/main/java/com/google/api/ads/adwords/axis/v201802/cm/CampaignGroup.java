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
 * CampaignGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Data representing an AdWords campaign group.
 */
public class CampaignGroup  implements java.io.Serializable {
    /* Id of this Campaign Group.
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

    /* Name of this campaign group. This field is required and should
     * not be {@code null} for ADD
     *                 operations.
     *                 
     *                 <p>For SET and REMOVE operations, this can be used
     * to address the campaign group by name when
     *                 the campaign group is ACTIVE or PAUSED. Removed campaign
     * groups cannot be addressed by name.
     *                 If you wish to rename a campaign group, you must provide
     * the ID.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Name".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint MatchesRegex">Campaign group
     * names must not contain any null (code point 0x0), NL line feed (code
     * point 0xA) or carriage return (code point 0xD) characters. This is
     * checked by the regular expression '[^\x00\x0A\x0D]*'.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty, (trimmed).</span> */
    private java.lang.String name;

    /* Status of this campaign group. On add, defaults to {@code ACTIVE}.
     * On remove, changes to
     *                 {@code DELETED}.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.CampaignGroupStatus status;

    public CampaignGroup() {
    }

    public CampaignGroup(
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.adwords.axis.v201802.cm.CampaignGroupStatus status) {
           this.id = id;
           this.name = name;
           this.status = status;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("id", getId())
            .add("name", getName())
            .add("status", getStatus())
            .toString();
    }

    /**
     * Gets the id value for this CampaignGroup.
     * 
     * @return id   * Id of this Campaign Group.
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
     * Sets the id value for this CampaignGroup.
     * 
     * @param id   * Id of this Campaign Group.
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
     * Gets the name value for this CampaignGroup.
     * 
     * @return name   * Name of this campaign group. This field is required and should
     * not be {@code null} for ADD
     *                 operations.
     *                 
     *                 <p>For SET and REMOVE operations, this can be used
     * to address the campaign group by name when
     *                 the campaign group is ACTIVE or PAUSED. Removed campaign
     * groups cannot be addressed by name.
     *                 If you wish to rename a campaign group, you must provide
     * the ID.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Name".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint MatchesRegex">Campaign group
     * names must not contain any null (code point 0x0), NL line feed (code
     * point 0xA) or carriage return (code point 0xD) characters. This is
     * checked by the regular expression '[^\x00\x0A\x0D]*'.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty, (trimmed).</span>
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CampaignGroup.
     * 
     * @param name   * Name of this campaign group. This field is required and should
     * not be {@code null} for ADD
     *                 operations.
     *                 
     *                 <p>For SET and REMOVE operations, this can be used
     * to address the campaign group by name when
     *                 the campaign group is ACTIVE or PAUSED. Removed campaign
     * groups cannot be addressed by name.
     *                 If you wish to rename a campaign group, you must provide
     * the ID.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Name".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint MatchesRegex">Campaign group
     * names must not contain any null (code point 0x0), NL line feed (code
     * point 0xA) or carriage return (code point 0xD) characters. This is
     * checked by the regular expression '[^\x00\x0A\x0D]*'.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty, (trimmed).</span>
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the status value for this CampaignGroup.
     * 
     * @return status   * Status of this campaign group. On add, defaults to {@code ACTIVE}.
     * On remove, changes to
     *                 {@code DELETED}.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.CampaignGroupStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CampaignGroup.
     * 
     * @param status   * Status of this campaign group. On add, defaults to {@code ACTIVE}.
     * On remove, changes to
     *                 {@code DELETED}.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setStatus(com.google.api.ads.adwords.axis.v201802.cm.CampaignGroupStatus status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CampaignGroup)) return false;
        CampaignGroup other = (CampaignGroup) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CampaignGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CampaignGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CampaignGroupStatus"));
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
