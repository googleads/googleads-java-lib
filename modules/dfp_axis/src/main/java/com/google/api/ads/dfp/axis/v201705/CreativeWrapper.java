// Copyright 2017 Google Inc. All Rights Reserved.
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
 * CreativeWrapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201705;


/**
 * A {@code CreativeWrapper} allows the wrapping of HTML snippets
 * to be
 *             served along with {@code Creative} objects.
 *             <p>
 *             Creative wrappers must be associated with a
 *             {@link LabelType#CREATIVE_WRAPPER} label and applied to
 * ad units by
 *             {@link AdUnit#appliedLabels}.
 */
public class CreativeWrapper  implements java.io.Serializable {
    /* The unique ID of the {@code CreativeWrapper}. This value is
     * readonly
     *                 and is assigned by Google. */
    private java.lang.Long id;

    /* The ID of the {@link Label} which will be used to label ad
     * units. The
     *                 {@code labelId} on a creative wrapper cannot be changed
     * once it is
     *                 created. */
    private java.lang.Long labelId;

    /* The header HTML snippet that this creative wrapper delivers. */
    private com.google.api.ads.dfp.axis.v201705.CreativeWrapperHtmlSnippet header;

    /* The footer HTML snippet that this creative wrapper delivers. */
    private com.google.api.ads.dfp.axis.v201705.CreativeWrapperHtmlSnippet footer;

    /* If there are multiple wrappers for a creative, then
     *                 {@code ordering} defines the order in which the HTML
     * snippets are rendered. */
    private com.google.api.ads.dfp.axis.v201705.CreativeWrapperOrdering ordering;

    /* The status of the {@code CreativeWrapper}. This attribute is
     * readonly. */
    private com.google.api.ads.dfp.axis.v201705.CreativeWrapperStatus status;

    public CreativeWrapper() {
    }

    public CreativeWrapper(
           java.lang.Long id,
           java.lang.Long labelId,
           com.google.api.ads.dfp.axis.v201705.CreativeWrapperHtmlSnippet header,
           com.google.api.ads.dfp.axis.v201705.CreativeWrapperHtmlSnippet footer,
           com.google.api.ads.dfp.axis.v201705.CreativeWrapperOrdering ordering,
           com.google.api.ads.dfp.axis.v201705.CreativeWrapperStatus status) {
           this.id = id;
           this.labelId = labelId;
           this.header = header;
           this.footer = footer;
           this.ordering = ordering;
           this.status = status;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("footer", getFooter())
            .add("header", getHeader())
            .add("id", getId())
            .add("labelId", getLabelId())
            .add("ordering", getOrdering())
            .add("status", getStatus())
            .toString();
    }

    /**
     * Gets the id value for this CreativeWrapper.
     * 
     * @return id   * The unique ID of the {@code CreativeWrapper}. This value is
     * readonly
     *                 and is assigned by Google.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this CreativeWrapper.
     * 
     * @param id   * The unique ID of the {@code CreativeWrapper}. This value is
     * readonly
     *                 and is assigned by Google.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the labelId value for this CreativeWrapper.
     * 
     * @return labelId   * The ID of the {@link Label} which will be used to label ad
     * units. The
     *                 {@code labelId} on a creative wrapper cannot be changed
     * once it is
     *                 created.
     */
    public java.lang.Long getLabelId() {
        return labelId;
    }


    /**
     * Sets the labelId value for this CreativeWrapper.
     * 
     * @param labelId   * The ID of the {@link Label} which will be used to label ad
     * units. The
     *                 {@code labelId} on a creative wrapper cannot be changed
     * once it is
     *                 created.
     */
    public void setLabelId(java.lang.Long labelId) {
        this.labelId = labelId;
    }


    /**
     * Gets the header value for this CreativeWrapper.
     * 
     * @return header   * The header HTML snippet that this creative wrapper delivers.
     */
    public com.google.api.ads.dfp.axis.v201705.CreativeWrapperHtmlSnippet getHeader() {
        return header;
    }


    /**
     * Sets the header value for this CreativeWrapper.
     * 
     * @param header   * The header HTML snippet that this creative wrapper delivers.
     */
    public void setHeader(com.google.api.ads.dfp.axis.v201705.CreativeWrapperHtmlSnippet header) {
        this.header = header;
    }


    /**
     * Gets the footer value for this CreativeWrapper.
     * 
     * @return footer   * The footer HTML snippet that this creative wrapper delivers.
     */
    public com.google.api.ads.dfp.axis.v201705.CreativeWrapperHtmlSnippet getFooter() {
        return footer;
    }


    /**
     * Sets the footer value for this CreativeWrapper.
     * 
     * @param footer   * The footer HTML snippet that this creative wrapper delivers.
     */
    public void setFooter(com.google.api.ads.dfp.axis.v201705.CreativeWrapperHtmlSnippet footer) {
        this.footer = footer;
    }


    /**
     * Gets the ordering value for this CreativeWrapper.
     * 
     * @return ordering   * If there are multiple wrappers for a creative, then
     *                 {@code ordering} defines the order in which the HTML
     * snippets are rendered.
     */
    public com.google.api.ads.dfp.axis.v201705.CreativeWrapperOrdering getOrdering() {
        return ordering;
    }


    /**
     * Sets the ordering value for this CreativeWrapper.
     * 
     * @param ordering   * If there are multiple wrappers for a creative, then
     *                 {@code ordering} defines the order in which the HTML
     * snippets are rendered.
     */
    public void setOrdering(com.google.api.ads.dfp.axis.v201705.CreativeWrapperOrdering ordering) {
        this.ordering = ordering;
    }


    /**
     * Gets the status value for this CreativeWrapper.
     * 
     * @return status   * The status of the {@code CreativeWrapper}. This attribute is
     * readonly.
     */
    public com.google.api.ads.dfp.axis.v201705.CreativeWrapperStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CreativeWrapper.
     * 
     * @param status   * The status of the {@code CreativeWrapper}. This attribute is
     * readonly.
     */
    public void setStatus(com.google.api.ads.dfp.axis.v201705.CreativeWrapperStatus status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreativeWrapper)) return false;
        CreativeWrapper other = (CreativeWrapper) obj;
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
            ((this.labelId==null && other.getLabelId()==null) || 
             (this.labelId!=null &&
              this.labelId.equals(other.getLabelId()))) &&
            ((this.header==null && other.getHeader()==null) || 
             (this.header!=null &&
              this.header.equals(other.getHeader()))) &&
            ((this.footer==null && other.getFooter()==null) || 
             (this.footer!=null &&
              this.footer.equals(other.getFooter()))) &&
            ((this.ordering==null && other.getOrdering()==null) || 
             (this.ordering!=null &&
              this.ordering.equals(other.getOrdering()))) &&
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
        if (getLabelId() != null) {
            _hashCode += getLabelId().hashCode();
        }
        if (getHeader() != null) {
            _hashCode += getHeader().hashCode();
        }
        if (getFooter() != null) {
            _hashCode += getFooter().hashCode();
        }
        if (getOrdering() != null) {
            _hashCode += getOrdering().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreativeWrapper.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201705", "CreativeWrapper"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201705", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201705", "labelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("header");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201705", "header"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201705", "CreativeWrapperHtmlSnippet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("footer");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201705", "footer"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201705", "CreativeWrapperHtmlSnippet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ordering");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201705", "ordering"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201705", "CreativeWrapperOrdering"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201705", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201705", "CreativeWrapperStatus"));
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
