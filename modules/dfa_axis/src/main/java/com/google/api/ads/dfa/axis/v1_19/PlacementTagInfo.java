/**
 * PlacementTagInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class PlacementTagInfo  implements java.io.Serializable {
    private java.lang.String clickThroughUrlTag;

    private java.lang.String iframeJavaScriptTag;

    private java.lang.String imageRedirectUrlTag;

    private java.lang.String internalRedirectTag;

    private java.lang.String javaScriptTag;

    private java.lang.String motifInstructions;

    private com.google.api.ads.dfa.axis.v1_19.PlacementBase placement;

    private java.lang.String prefetchTag;

    private java.lang.String standardTag;

    public PlacementTagInfo() {
    }

    public PlacementTagInfo(
           java.lang.String clickThroughUrlTag,
           java.lang.String iframeJavaScriptTag,
           java.lang.String imageRedirectUrlTag,
           java.lang.String internalRedirectTag,
           java.lang.String javaScriptTag,
           java.lang.String motifInstructions,
           com.google.api.ads.dfa.axis.v1_19.PlacementBase placement,
           java.lang.String prefetchTag,
           java.lang.String standardTag) {
           this.clickThroughUrlTag = clickThroughUrlTag;
           this.iframeJavaScriptTag = iframeJavaScriptTag;
           this.imageRedirectUrlTag = imageRedirectUrlTag;
           this.internalRedirectTag = internalRedirectTag;
           this.javaScriptTag = javaScriptTag;
           this.motifInstructions = motifInstructions;
           this.placement = placement;
           this.prefetchTag = prefetchTag;
           this.standardTag = standardTag;
    }


    /**
     * Gets the clickThroughUrlTag value for this PlacementTagInfo.
     * 
     * @return clickThroughUrlTag
     */
    public java.lang.String getClickThroughUrlTag() {
        return clickThroughUrlTag;
    }


    /**
     * Sets the clickThroughUrlTag value for this PlacementTagInfo.
     * 
     * @param clickThroughUrlTag
     */
    public void setClickThroughUrlTag(java.lang.String clickThroughUrlTag) {
        this.clickThroughUrlTag = clickThroughUrlTag;
    }


    /**
     * Gets the iframeJavaScriptTag value for this PlacementTagInfo.
     * 
     * @return iframeJavaScriptTag
     */
    public java.lang.String getIframeJavaScriptTag() {
        return iframeJavaScriptTag;
    }


    /**
     * Sets the iframeJavaScriptTag value for this PlacementTagInfo.
     * 
     * @param iframeJavaScriptTag
     */
    public void setIframeJavaScriptTag(java.lang.String iframeJavaScriptTag) {
        this.iframeJavaScriptTag = iframeJavaScriptTag;
    }


    /**
     * Gets the imageRedirectUrlTag value for this PlacementTagInfo.
     * 
     * @return imageRedirectUrlTag
     */
    public java.lang.String getImageRedirectUrlTag() {
        return imageRedirectUrlTag;
    }


    /**
     * Sets the imageRedirectUrlTag value for this PlacementTagInfo.
     * 
     * @param imageRedirectUrlTag
     */
    public void setImageRedirectUrlTag(java.lang.String imageRedirectUrlTag) {
        this.imageRedirectUrlTag = imageRedirectUrlTag;
    }


    /**
     * Gets the internalRedirectTag value for this PlacementTagInfo.
     * 
     * @return internalRedirectTag
     */
    public java.lang.String getInternalRedirectTag() {
        return internalRedirectTag;
    }


    /**
     * Sets the internalRedirectTag value for this PlacementTagInfo.
     * 
     * @param internalRedirectTag
     */
    public void setInternalRedirectTag(java.lang.String internalRedirectTag) {
        this.internalRedirectTag = internalRedirectTag;
    }


    /**
     * Gets the javaScriptTag value for this PlacementTagInfo.
     * 
     * @return javaScriptTag
     */
    public java.lang.String getJavaScriptTag() {
        return javaScriptTag;
    }


    /**
     * Sets the javaScriptTag value for this PlacementTagInfo.
     * 
     * @param javaScriptTag
     */
    public void setJavaScriptTag(java.lang.String javaScriptTag) {
        this.javaScriptTag = javaScriptTag;
    }


    /**
     * Gets the motifInstructions value for this PlacementTagInfo.
     * 
     * @return motifInstructions
     */
    public java.lang.String getMotifInstructions() {
        return motifInstructions;
    }


    /**
     * Sets the motifInstructions value for this PlacementTagInfo.
     * 
     * @param motifInstructions
     */
    public void setMotifInstructions(java.lang.String motifInstructions) {
        this.motifInstructions = motifInstructions;
    }


    /**
     * Gets the placement value for this PlacementTagInfo.
     * 
     * @return placement
     */
    public com.google.api.ads.dfa.axis.v1_19.PlacementBase getPlacement() {
        return placement;
    }


    /**
     * Sets the placement value for this PlacementTagInfo.
     * 
     * @param placement
     */
    public void setPlacement(com.google.api.ads.dfa.axis.v1_19.PlacementBase placement) {
        this.placement = placement;
    }


    /**
     * Gets the prefetchTag value for this PlacementTagInfo.
     * 
     * @return prefetchTag
     */
    public java.lang.String getPrefetchTag() {
        return prefetchTag;
    }


    /**
     * Sets the prefetchTag value for this PlacementTagInfo.
     * 
     * @param prefetchTag
     */
    public void setPrefetchTag(java.lang.String prefetchTag) {
        this.prefetchTag = prefetchTag;
    }


    /**
     * Gets the standardTag value for this PlacementTagInfo.
     * 
     * @return standardTag
     */
    public java.lang.String getStandardTag() {
        return standardTag;
    }


    /**
     * Sets the standardTag value for this PlacementTagInfo.
     * 
     * @param standardTag
     */
    public void setStandardTag(java.lang.String standardTag) {
        this.standardTag = standardTag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlacementTagInfo)) return false;
        PlacementTagInfo other = (PlacementTagInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clickThroughUrlTag==null && other.getClickThroughUrlTag()==null) || 
             (this.clickThroughUrlTag!=null &&
              this.clickThroughUrlTag.equals(other.getClickThroughUrlTag()))) &&
            ((this.iframeJavaScriptTag==null && other.getIframeJavaScriptTag()==null) || 
             (this.iframeJavaScriptTag!=null &&
              this.iframeJavaScriptTag.equals(other.getIframeJavaScriptTag()))) &&
            ((this.imageRedirectUrlTag==null && other.getImageRedirectUrlTag()==null) || 
             (this.imageRedirectUrlTag!=null &&
              this.imageRedirectUrlTag.equals(other.getImageRedirectUrlTag()))) &&
            ((this.internalRedirectTag==null && other.getInternalRedirectTag()==null) || 
             (this.internalRedirectTag!=null &&
              this.internalRedirectTag.equals(other.getInternalRedirectTag()))) &&
            ((this.javaScriptTag==null && other.getJavaScriptTag()==null) || 
             (this.javaScriptTag!=null &&
              this.javaScriptTag.equals(other.getJavaScriptTag()))) &&
            ((this.motifInstructions==null && other.getMotifInstructions()==null) || 
             (this.motifInstructions!=null &&
              this.motifInstructions.equals(other.getMotifInstructions()))) &&
            ((this.placement==null && other.getPlacement()==null) || 
             (this.placement!=null &&
              this.placement.equals(other.getPlacement()))) &&
            ((this.prefetchTag==null && other.getPrefetchTag()==null) || 
             (this.prefetchTag!=null &&
              this.prefetchTag.equals(other.getPrefetchTag()))) &&
            ((this.standardTag==null && other.getStandardTag()==null) || 
             (this.standardTag!=null &&
              this.standardTag.equals(other.getStandardTag())));
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
        if (getClickThroughUrlTag() != null) {
            _hashCode += getClickThroughUrlTag().hashCode();
        }
        if (getIframeJavaScriptTag() != null) {
            _hashCode += getIframeJavaScriptTag().hashCode();
        }
        if (getImageRedirectUrlTag() != null) {
            _hashCode += getImageRedirectUrlTag().hashCode();
        }
        if (getInternalRedirectTag() != null) {
            _hashCode += getInternalRedirectTag().hashCode();
        }
        if (getJavaScriptTag() != null) {
            _hashCode += getJavaScriptTag().hashCode();
        }
        if (getMotifInstructions() != null) {
            _hashCode += getMotifInstructions().hashCode();
        }
        if (getPlacement() != null) {
            _hashCode += getPlacement().hashCode();
        }
        if (getPrefetchTag() != null) {
            _hashCode += getPrefetchTag().hashCode();
        }
        if (getStandardTag() != null) {
            _hashCode += getStandardTag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlacementTagInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "PlacementTagInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clickThroughUrlTag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clickThroughUrlTag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iframeJavaScriptTag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iframeJavaScriptTag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageRedirectUrlTag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "imageRedirectUrlTag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalRedirectTag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "internalRedirectTag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("javaScriptTag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "javaScriptTag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motifInstructions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "motifInstructions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placement");
        elemField.setXmlName(new javax.xml.namespace.QName("", "placement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "PlacementBase"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefetchTag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prefetchTag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("standardTag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "standardTag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
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
