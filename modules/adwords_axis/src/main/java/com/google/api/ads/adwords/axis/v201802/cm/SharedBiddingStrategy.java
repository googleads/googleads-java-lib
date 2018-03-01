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
 * SharedBiddingStrategy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Bidding strategies store shared bidding configuration data and
 * are account-level objects.
 */
public class SharedBiddingStrategy  implements java.io.Serializable {
    /* Specifies the type of bidding scheme and the metadata associated
     * with it.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "BiddingScheme".</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.BiddingScheme biddingScheme;

    /* Id of the flexible bidding strategy. The bidding strategy id
     * is used to associate
     *                 the bidding strategy with the campaign, ad group or
     * ad group criterion.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Id".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET, REMOVE.</span> */
    private java.lang.Long id;

    /* Name of the bidding strategy. Every bidding strategy must have
     * a non-null non-empty name.
     *                 In addition, all bidding strategies within an account
     * must be named distinctly.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Name".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 255, inclusive, in UTF-8 bytes,
     * (trimmed).</span> */
    private java.lang.String name;

    /* <span class="constraint Selectable">This field can be selected
     * using the value "Status".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.SharedBiddingStrategyBiddingStrategyStatus status;

    /* <span class="constraint Selectable">This field can be selected
     * using the value "Type".</span><span class="constraint Filterable">This
     * field can be filtered on.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.BiddingStrategyType type;

    public SharedBiddingStrategy() {
    }

    public SharedBiddingStrategy(
           com.google.api.ads.adwords.axis.v201802.cm.BiddingScheme biddingScheme,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.adwords.axis.v201802.cm.SharedBiddingStrategyBiddingStrategyStatus status,
           com.google.api.ads.adwords.axis.v201802.cm.BiddingStrategyType type) {
           this.biddingScheme = biddingScheme;
           this.id = id;
           this.name = name;
           this.status = status;
           this.type = type;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("biddingScheme", getBiddingScheme())
            .add("id", getId())
            .add("name", getName())
            .add("status", getStatus())
            .add("type", getType())
            .toString();
    }

    /**
     * Gets the biddingScheme value for this SharedBiddingStrategy.
     * 
     * @return biddingScheme   * Specifies the type of bidding scheme and the metadata associated
     * with it.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "BiddingScheme".</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.BiddingScheme getBiddingScheme() {
        return biddingScheme;
    }


    /**
     * Sets the biddingScheme value for this SharedBiddingStrategy.
     * 
     * @param biddingScheme   * Specifies the type of bidding scheme and the metadata associated
     * with it.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "BiddingScheme".</span>
     */
    public void setBiddingScheme(com.google.api.ads.adwords.axis.v201802.cm.BiddingScheme biddingScheme) {
        this.biddingScheme = biddingScheme;
    }


    /**
     * Gets the id value for this SharedBiddingStrategy.
     * 
     * @return id   * Id of the flexible bidding strategy. The bidding strategy id
     * is used to associate
     *                 the bidding strategy with the campaign, ad group or
     * ad group criterion.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Id".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET, REMOVE.</span>
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this SharedBiddingStrategy.
     * 
     * @param id   * Id of the flexible bidding strategy. The bidding strategy id
     * is used to associate
     *                 the bidding strategy with the campaign, ad group or
     * ad group criterion.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Id".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET, REMOVE.</span>
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this SharedBiddingStrategy.
     * 
     * @return name   * Name of the bidding strategy. Every bidding strategy must have
     * a non-null non-empty name.
     *                 In addition, all bidding strategies within an account
     * must be named distinctly.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Name".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 255, inclusive, in UTF-8 bytes,
     * (trimmed).</span>
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this SharedBiddingStrategy.
     * 
     * @param name   * Name of the bidding strategy. Every bidding strategy must have
     * a non-null non-empty name.
     *                 In addition, all bidding strategies within an account
     * must be named distinctly.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Name".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 255, inclusive, in UTF-8 bytes,
     * (trimmed).</span>
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the status value for this SharedBiddingStrategy.
     * 
     * @return status   * <span class="constraint Selectable">This field can be selected
     * using the value "Status".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.SharedBiddingStrategyBiddingStrategyStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SharedBiddingStrategy.
     * 
     * @param status   * <span class="constraint Selectable">This field can be selected
     * using the value "Status".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setStatus(com.google.api.ads.adwords.axis.v201802.cm.SharedBiddingStrategyBiddingStrategyStatus status) {
        this.status = status;
    }


    /**
     * Gets the type value for this SharedBiddingStrategy.
     * 
     * @return type   * <span class="constraint Selectable">This field can be selected
     * using the value "Type".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.BiddingStrategyType getType() {
        return type;
    }


    /**
     * Sets the type value for this SharedBiddingStrategy.
     * 
     * @param type   * <span class="constraint Selectable">This field can be selected
     * using the value "Type".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     */
    public void setType(com.google.api.ads.adwords.axis.v201802.cm.BiddingStrategyType type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SharedBiddingStrategy)) return false;
        SharedBiddingStrategy other = (SharedBiddingStrategy) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biddingScheme==null && other.getBiddingScheme()==null) || 
             (this.biddingScheme!=null &&
              this.biddingScheme.equals(other.getBiddingScheme()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getBiddingScheme() != null) {
            _hashCode += getBiddingScheme().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SharedBiddingStrategy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "SharedBiddingStrategy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biddingScheme");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "biddingScheme"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "BiddingScheme"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "SharedBiddingStrategy.BiddingStrategyStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "BiddingStrategyType"));
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
