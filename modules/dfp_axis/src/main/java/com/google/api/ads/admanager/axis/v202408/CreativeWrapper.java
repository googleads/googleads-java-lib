// Copyright 2024 Google LLC
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
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202408;


/**
 * A {@code CreativeWrapper} allows the wrapping of HTML snippets
 * to be served along with {@code
 *             Creative} objects.
 *             
 *             <p>Creative wrappers must be associated with a {@link
 * LabelType#CREATIVE_WRAPPER} label and
 *             applied to ad units by {@link AdUnit#appliedLabels}.
 */
public class CreativeWrapper  implements java.io.Serializable {
    /* The unique ID of the {@code CreativeWrapper}. This value is
     * readonly and is assigned by Google. */
    private java.lang.Long id;

    /* The ID of the {@link Label} which will be used to label ad
     * units. The {@code labelId} on a
     *                 creative wrapper cannot be changed once it is created. */
    private java.lang.Long labelId;

    /* The creative wrapper type. If the creative wrapper type is
     * {@link
     *                 CreativeWrapperType#VIDEO_TRACKING_URL}, the {@code
     * videoTrackingUrls} field must be set. If
     *                 the creative wrapper type is {@link CreativeWrapperType#HTML},
     * either the {@code header} or
     *                 {@code footer} field must be set. This field is required. */
    private com.google.api.ads.admanager.axis.v202408.CreativeWrapperType creativeWrapperType;

    /* The header HTML snippet that this creative wrapper delivers. */
    private java.lang.String htmlHeader;

    /* The footer HTML snippet that this creative wrapper delivers. */
    private java.lang.String htmlFooter;

    /* The header AMP snippet that this creative wrapper delivers. */
    private java.lang.String ampHead;

    /* The footer AMP snippet that this creative wrapper delivers. */
    private java.lang.String ampBody;

    /* The video tracking URLs that this creative wrapper delivers.
     * This field is required if the
     *                 {@code creativeWrapperType} is {@link CreativeWrapperType#VIDEO_TRACKING_URL}
     * and ignored
     *                 otherwise. */
    private com.google.api.ads.admanager.axis.v202408.ConversionEvent_TrackingUrlsMapEntry[] videoTrackingUrls;

    /* The {@code ThirdPartyDataDeclaration} for this creative wrapper.
     * 
     *                 <p>It is copied to one of the underlying creatives.
     * If the header creative is active then it is
     *                 persisted there. Otherwise it is stored on the footer
     * creative. */
    private com.google.api.ads.admanager.axis.v202408.ThirdPartyDataDeclaration thirdPartyDataDeclaration;

    /* If there are multiple wrappers for a creative, then {@code
     * ordering} defines the order in which
     *                 the HTML snippets are rendered. */
    private com.google.api.ads.admanager.axis.v202408.CreativeWrapperOrdering ordering;

    /* The status of the {@code CreativeWrapper}. This attribute is
     * readonly. */
    private com.google.api.ads.admanager.axis.v202408.CreativeWrapperStatus status;

    public CreativeWrapper() {
    }

    public CreativeWrapper(
           java.lang.Long id,
           java.lang.Long labelId,
           com.google.api.ads.admanager.axis.v202408.CreativeWrapperType creativeWrapperType,
           java.lang.String htmlHeader,
           java.lang.String htmlFooter,
           java.lang.String ampHead,
           java.lang.String ampBody,
           com.google.api.ads.admanager.axis.v202408.ConversionEvent_TrackingUrlsMapEntry[] videoTrackingUrls,
           com.google.api.ads.admanager.axis.v202408.ThirdPartyDataDeclaration thirdPartyDataDeclaration,
           com.google.api.ads.admanager.axis.v202408.CreativeWrapperOrdering ordering,
           com.google.api.ads.admanager.axis.v202408.CreativeWrapperStatus status) {
           this.id = id;
           this.labelId = labelId;
           this.creativeWrapperType = creativeWrapperType;
           this.htmlHeader = htmlHeader;
           this.htmlFooter = htmlFooter;
           this.ampHead = ampHead;
           this.ampBody = ampBody;
           this.videoTrackingUrls = videoTrackingUrls;
           this.thirdPartyDataDeclaration = thirdPartyDataDeclaration;
           this.ordering = ordering;
           this.status = status;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("ampBody", getAmpBody())
            .add("ampHead", getAmpHead())
            .add("creativeWrapperType", getCreativeWrapperType())
            .add("htmlFooter", getHtmlFooter())
            .add("htmlHeader", getHtmlHeader())
            .add("id", getId())
            .add("labelId", getLabelId())
            .add("ordering", getOrdering())
            .add("status", getStatus())
            .add("thirdPartyDataDeclaration", getThirdPartyDataDeclaration())
            .add("videoTrackingUrls", getVideoTrackingUrls())
            .toString();
    }

    /**
     * Gets the id value for this CreativeWrapper.
     * 
     * @return id   * The unique ID of the {@code CreativeWrapper}. This value is
     * readonly and is assigned by Google.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this CreativeWrapper.
     * 
     * @param id   * The unique ID of the {@code CreativeWrapper}. This value is
     * readonly and is assigned by Google.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the labelId value for this CreativeWrapper.
     * 
     * @return labelId   * The ID of the {@link Label} which will be used to label ad
     * units. The {@code labelId} on a
     *                 creative wrapper cannot be changed once it is created.
     */
    public java.lang.Long getLabelId() {
        return labelId;
    }


    /**
     * Sets the labelId value for this CreativeWrapper.
     * 
     * @param labelId   * The ID of the {@link Label} which will be used to label ad
     * units. The {@code labelId} on a
     *                 creative wrapper cannot be changed once it is created.
     */
    public void setLabelId(java.lang.Long labelId) {
        this.labelId = labelId;
    }


    /**
     * Gets the creativeWrapperType value for this CreativeWrapper.
     * 
     * @return creativeWrapperType   * The creative wrapper type. If the creative wrapper type is
     * {@link
     *                 CreativeWrapperType#VIDEO_TRACKING_URL}, the {@code
     * videoTrackingUrls} field must be set. If
     *                 the creative wrapper type is {@link CreativeWrapperType#HTML},
     * either the {@code header} or
     *                 {@code footer} field must be set. This field is required.
     */
    public com.google.api.ads.admanager.axis.v202408.CreativeWrapperType getCreativeWrapperType() {
        return creativeWrapperType;
    }


    /**
     * Sets the creativeWrapperType value for this CreativeWrapper.
     * 
     * @param creativeWrapperType   * The creative wrapper type. If the creative wrapper type is
     * {@link
     *                 CreativeWrapperType#VIDEO_TRACKING_URL}, the {@code
     * videoTrackingUrls} field must be set. If
     *                 the creative wrapper type is {@link CreativeWrapperType#HTML},
     * either the {@code header} or
     *                 {@code footer} field must be set. This field is required.
     */
    public void setCreativeWrapperType(com.google.api.ads.admanager.axis.v202408.CreativeWrapperType creativeWrapperType) {
        this.creativeWrapperType = creativeWrapperType;
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
     * Gets the videoTrackingUrls value for this CreativeWrapper.
     * 
     * @return videoTrackingUrls   * The video tracking URLs that this creative wrapper delivers.
     * This field is required if the
     *                 {@code creativeWrapperType} is {@link CreativeWrapperType#VIDEO_TRACKING_URL}
     * and ignored
     *                 otherwise.
     */
    public com.google.api.ads.admanager.axis.v202408.ConversionEvent_TrackingUrlsMapEntry[] getVideoTrackingUrls() {
        return videoTrackingUrls;
    }


    /**
     * Sets the videoTrackingUrls value for this CreativeWrapper.
     * 
     * @param videoTrackingUrls   * The video tracking URLs that this creative wrapper delivers.
     * This field is required if the
     *                 {@code creativeWrapperType} is {@link CreativeWrapperType#VIDEO_TRACKING_URL}
     * and ignored
     *                 otherwise.
     */
    public void setVideoTrackingUrls(com.google.api.ads.admanager.axis.v202408.ConversionEvent_TrackingUrlsMapEntry[] videoTrackingUrls) {
        this.videoTrackingUrls = videoTrackingUrls;
    }

    public com.google.api.ads.admanager.axis.v202408.ConversionEvent_TrackingUrlsMapEntry getVideoTrackingUrls(int i) {
        return this.videoTrackingUrls[i];
    }

    public void setVideoTrackingUrls(int i, com.google.api.ads.admanager.axis.v202408.ConversionEvent_TrackingUrlsMapEntry _value) {
        this.videoTrackingUrls[i] = _value;
    }


    /**
     * Gets the thirdPartyDataDeclaration value for this CreativeWrapper.
     * 
     * @return thirdPartyDataDeclaration   * The {@code ThirdPartyDataDeclaration} for this creative wrapper.
     * 
     *                 <p>It is copied to one of the underlying creatives.
     * If the header creative is active then it is
     *                 persisted there. Otherwise it is stored on the footer
     * creative.
     */
    public com.google.api.ads.admanager.axis.v202408.ThirdPartyDataDeclaration getThirdPartyDataDeclaration() {
        return thirdPartyDataDeclaration;
    }


    /**
     * Sets the thirdPartyDataDeclaration value for this CreativeWrapper.
     * 
     * @param thirdPartyDataDeclaration   * The {@code ThirdPartyDataDeclaration} for this creative wrapper.
     * 
     *                 <p>It is copied to one of the underlying creatives.
     * If the header creative is active then it is
     *                 persisted there. Otherwise it is stored on the footer
     * creative.
     */
    public void setThirdPartyDataDeclaration(com.google.api.ads.admanager.axis.v202408.ThirdPartyDataDeclaration thirdPartyDataDeclaration) {
        this.thirdPartyDataDeclaration = thirdPartyDataDeclaration;
    }


    /**
     * Gets the ordering value for this CreativeWrapper.
     * 
     * @return ordering   * If there are multiple wrappers for a creative, then {@code
     * ordering} defines the order in which
     *                 the HTML snippets are rendered.
     */
    public com.google.api.ads.admanager.axis.v202408.CreativeWrapperOrdering getOrdering() {
        return ordering;
    }


    /**
     * Sets the ordering value for this CreativeWrapper.
     * 
     * @param ordering   * If there are multiple wrappers for a creative, then {@code
     * ordering} defines the order in which
     *                 the HTML snippets are rendered.
     */
    public void setOrdering(com.google.api.ads.admanager.axis.v202408.CreativeWrapperOrdering ordering) {
        this.ordering = ordering;
    }


    /**
     * Gets the status value for this CreativeWrapper.
     * 
     * @return status   * The status of the {@code CreativeWrapper}. This attribute is
     * readonly.
     */
    public com.google.api.ads.admanager.axis.v202408.CreativeWrapperStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CreativeWrapper.
     * 
     * @param status   * The status of the {@code CreativeWrapper}. This attribute is
     * readonly.
     */
    public void setStatus(com.google.api.ads.admanager.axis.v202408.CreativeWrapperStatus status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreativeWrapper)) return false;
        CreativeWrapper other = (CreativeWrapper) obj;
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
            ((this.creativeWrapperType==null && other.getCreativeWrapperType()==null) || 
             (this.creativeWrapperType!=null &&
              this.creativeWrapperType.equals(other.getCreativeWrapperType()))) &&
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
            ((this.videoTrackingUrls==null && other.getVideoTrackingUrls()==null) || 
             (this.videoTrackingUrls!=null &&
              java.util.Arrays.equals(this.videoTrackingUrls, other.getVideoTrackingUrls()))) &&
            ((this.thirdPartyDataDeclaration==null && other.getThirdPartyDataDeclaration()==null) || 
             (this.thirdPartyDataDeclaration!=null &&
              this.thirdPartyDataDeclaration.equals(other.getThirdPartyDataDeclaration()))) &&
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
        if (getCreativeWrapperType() != null) {
            _hashCode += getCreativeWrapperType().hashCode();
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
        if (getVideoTrackingUrls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVideoTrackingUrls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVideoTrackingUrls(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getThirdPartyDataDeclaration() != null) {
            _hashCode += getThirdPartyDataDeclaration().hashCode();
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
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "CreativeWrapper"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "labelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeWrapperType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "creativeWrapperType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "CreativeWrapperType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("htmlHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "htmlHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("htmlFooter");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "htmlFooter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ampHead");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "ampHead"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ampBody");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "ampBody"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoTrackingUrls");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "videoTrackingUrls"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "ConversionEvent_TrackingUrlsMapEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyDataDeclaration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "thirdPartyDataDeclaration"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "ThirdPartyDataDeclaration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ordering");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "ordering"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "CreativeWrapperOrdering"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "CreativeWrapperStatus"));
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
