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
 * CreativeWrapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


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
    private java.lang.String htmlHeader;

    /* The footer HTML snippet that this creative wrapper delivers. */
    private java.lang.String htmlFooter;

    /* The header AMP snippet that this creative wrapper delivers. */
    private java.lang.String ampHead;

    /* The footer AMP snippet that this creative wrapper delivers. */
    private java.lang.String ampBody;

    /* If there are multiple wrappers for a creative, then
     *                 {@code ordering} defines the order in which the HTML
     * snippets are rendered. */
    private com.google.api.ads.dfp.axis.v201802.CreativeWrapperOrdering ordering;

    /* The status of the {@code CreativeWrapper}. This attribute is
     * readonly. */
    private com.google.api.ads.dfp.axis.v201802.CreativeWrapperStatus status;

    public CreativeWrapper() {
    }

    public CreativeWrapper(
           java.lang.Long id,
           java.lang.Long labelId,
           java.lang.String htmlHeader,
           java.lang.String htmlFooter,
           java.lang.String ampHead,
           java.lang.String ampBody,
           com.google.api.ads.dfp.axis.v201802.CreativeWrapperOrdering ordering,
           com.google.api.ads.dfp.axis.v201802.CreativeWrapperStatus status) {
           this.id = id;
           this.labelId = labelId;
           this.htmlHeader = htmlHeader;
           this.htmlFooter = htmlFooter;
           this.ampHead = ampHead;
           this.ampBody = ampBody;
           this.ordering = ordering;
           this.status = status;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("ampBody", getAmpBody())
            .add("ampHead", getAmpHead())
            .add("htmlFooter", getHtmlFooter())
            .add("htmlHeader", getHtmlHeader())
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
     * Gets the htmlHeader value for this CreativeWrapper.
     * 
     * @return htmlHeader   * The header HTML snippet that this creative wrapper delivers.
     */
    public java.lang.String getHtmlHeader() {
        return htmlHeader;
    }


    /**
     * Sets the htmlHeader value for this CreativeWrapper.
     * 
     * @param htmlHeader   * The header HTML snippet that this creative wrapper delivers.
     */
    public void setHtmlHeader(java.lang.String htmlHeader) {
        this.htmlHeader = htmlHeader;
    }


    /**
     * Gets the htmlFooter value for this CreativeWrapper.
     * 
     * @return htmlFooter   * The footer HTML snippet that this creative wrapper delivers.
     */
    public java.lang.String getHtmlFooter() {
        return htmlFooter;
    }


    /**
     * Sets the htmlFooter value for this CreativeWrapper.
     * 
     * @param htmlFooter   * The footer HTML snippet that this creative wrapper delivers.
     */
    public void setHtmlFooter(java.lang.String htmlFooter) {
        this.htmlFooter = htmlFooter;
    }


    /**
     * Gets the ampHead value for this CreativeWrapper.
     * 
     * @return ampHead   * The header AMP snippet that this creative wrapper delivers.
     */
    public java.lang.String getAmpHead() {
        return ampHead;
    }


    /**
     * Sets the ampHead value for this CreativeWrapper.
     * 
     * @param ampHead   * The header AMP snippet that this creative wrapper delivers.
     */
    public void setAmpHead(java.lang.String ampHead) {
        this.ampHead = ampHead;
    }


    /**
     * Gets the ampBody value for this CreativeWrapper.
     * 
     * @return ampBody   * The footer AMP snippet that this creative wrapper delivers.
     */
    public java.lang.String getAmpBody() {
        return ampBody;
    }


    /**
     * Sets the ampBody value for this CreativeWrapper.
     * 
     * @param ampBody   * The footer AMP snippet that this creative wrapper delivers.
     */
    public void setAmpBody(java.lang.String ampBody) {
        this.ampBody = ampBody;
    }


    /**
     * Gets the ordering value for this CreativeWrapper.
     * 
     * @return ordering   * If there are multiple wrappers for a creative, then
     *                 {@code ordering} defines the order in which the HTML
     * snippets are rendered.
     */
    public com.google.api.ads.dfp.axis.v201802.CreativeWrapperOrdering getOrdering() {
        return ordering;
    }


    /**
     * Sets the ordering value for this CreativeWrapper.
     * 
     * @param ordering   * If there are multiple wrappers for a creative, then
     *                 {@code ordering} defines the order in which the HTML
     * snippets are rendered.
     */
    public void setOrdering(com.google.api.ads.dfp.axis.v201802.CreativeWrapperOrdering ordering) {
        this.ordering = ordering;
    }


    /**
     * Gets the status value for this CreativeWrapper.
     * 
     * @return status   * The status of the {@code CreativeWrapper}. This attribute is
     * readonly.
     */
    public com.google.api.ads.dfp.axis.v201802.CreativeWrapperStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CreativeWrapper.
     * 
     * @param status   * The status of the {@code CreativeWrapper}. This attribute is
     * readonly.
     */
    public void setStatus(com.google.api.ads.dfp.axis.v201802.CreativeWrapperStatus status) {
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
            ((this.htmlHeader==null && other.getHtmlHeader()==null) || 
             (this.htmlHeader!=null &&
              this.htmlHeader.equals(other.getHtmlHeader()))) &&
            ((this.htmlFooter==null && other.getHtmlFooter()==null) || 
             (this.htmlFooter!=null &&
              this.htmlFooter.equals(other.getHtmlFooter()))) &&
            ((this.ampHead==null && other.getAmpHead()==null) || 
             (this.ampHead!=null &&
              this.ampHead.equals(other.getAmpHead()))) &&
            ((this.ampBody==null && other.getAmpBody()==null) || 
             (this.ampBody!=null &&
              this.ampBody.equals(other.getAmpBody()))) &&
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
        if (getHtmlHeader() != null) {
            _hashCode += getHtmlHeader().hashCode();
        }
        if (getHtmlFooter() != null) {
            _hashCode += getHtmlFooter().hashCode();
        }
        if (getAmpHead() != null) {
            _hashCode += getAmpHead().hashCode();
        }
        if (getAmpBody() != null) {
            _hashCode += getAmpBody().hashCode();
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
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CreativeWrapper"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "labelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("htmlHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "htmlHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("htmlFooter");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "htmlFooter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ampHead");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ampHead"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ampBody");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ampBody"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ordering");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ordering"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CreativeWrapperOrdering"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CreativeWrapperStatus"));
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
