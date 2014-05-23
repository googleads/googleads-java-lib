/**
 * CallToActionCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.video;


/**
 * Creative data that composes the core piece of the call-to-action.
 * This data is displayed
 *             to users.
 */
public class CallToActionCreative  implements java.io.Serializable {
    private com.google.api.ads.adwords.axis.v201402.video.CallToActionCreativeType type;

    /* <span class="constraint Required">This field is required and
     * should not be {@code null}.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span> */
    private java.lang.String headline;

    /* <span class="constraint Required">This field is required and
     * should not be {@code null}.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span> */
    private java.lang.String descriptionLine1;

    /* <span class="constraint Required">This field is required and
     * should not be {@code null}.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span> */
    private java.lang.String descriptionLine2;

    /* <span class="constraint Required">This field is required and
     * should not be {@code null}.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span> */
    private java.lang.String displayUrl;

    /* <span class="constraint Required">This field is required and
     * should not be {@code null}.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span> */
    private java.lang.String destinationUrl;

    /* Optional image object. */
    private com.google.api.ads.adwords.axis.v201402.video.CallToActionImage image;

    public CallToActionCreative() {
    }

    public CallToActionCreative(
           com.google.api.ads.adwords.axis.v201402.video.CallToActionCreativeType type,
           java.lang.String headline,
           java.lang.String descriptionLine1,
           java.lang.String descriptionLine2,
           java.lang.String displayUrl,
           java.lang.String destinationUrl,
           com.google.api.ads.adwords.axis.v201402.video.CallToActionImage image) {
           this.type = type;
           this.headline = headline;
           this.descriptionLine1 = descriptionLine1;
           this.descriptionLine2 = descriptionLine2;
           this.displayUrl = displayUrl;
           this.destinationUrl = destinationUrl;
           this.image = image;
    }


    /**
     * Gets the type value for this CallToActionCreative.
     * 
     * @return type
     */
    public com.google.api.ads.adwords.axis.v201402.video.CallToActionCreativeType getType() {
        return type;
    }


    /**
     * Sets the type value for this CallToActionCreative.
     * 
     * @param type
     */
    public void setType(com.google.api.ads.adwords.axis.v201402.video.CallToActionCreativeType type) {
        this.type = type;
    }


    /**
     * Gets the headline value for this CallToActionCreative.
     * 
     * @return headline   * <span class="constraint Required">This field is required and
     * should not be {@code null}.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public java.lang.String getHeadline() {
        return headline;
    }


    /**
     * Sets the headline value for this CallToActionCreative.
     * 
     * @param headline   * <span class="constraint Required">This field is required and
     * should not be {@code null}.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public void setHeadline(java.lang.String headline) {
        this.headline = headline;
    }


    /**
     * Gets the descriptionLine1 value for this CallToActionCreative.
     * 
     * @return descriptionLine1   * <span class="constraint Required">This field is required and
     * should not be {@code null}.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public java.lang.String getDescriptionLine1() {
        return descriptionLine1;
    }


    /**
     * Sets the descriptionLine1 value for this CallToActionCreative.
     * 
     * @param descriptionLine1   * <span class="constraint Required">This field is required and
     * should not be {@code null}.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public void setDescriptionLine1(java.lang.String descriptionLine1) {
        this.descriptionLine1 = descriptionLine1;
    }


    /**
     * Gets the descriptionLine2 value for this CallToActionCreative.
     * 
     * @return descriptionLine2   * <span class="constraint Required">This field is required and
     * should not be {@code null}.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public java.lang.String getDescriptionLine2() {
        return descriptionLine2;
    }


    /**
     * Sets the descriptionLine2 value for this CallToActionCreative.
     * 
     * @param descriptionLine2   * <span class="constraint Required">This field is required and
     * should not be {@code null}.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public void setDescriptionLine2(java.lang.String descriptionLine2) {
        this.descriptionLine2 = descriptionLine2;
    }


    /**
     * Gets the displayUrl value for this CallToActionCreative.
     * 
     * @return displayUrl   * <span class="constraint Required">This field is required and
     * should not be {@code null}.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public java.lang.String getDisplayUrl() {
        return displayUrl;
    }


    /**
     * Sets the displayUrl value for this CallToActionCreative.
     * 
     * @param displayUrl   * <span class="constraint Required">This field is required and
     * should not be {@code null}.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public void setDisplayUrl(java.lang.String displayUrl) {
        this.displayUrl = displayUrl;
    }


    /**
     * Gets the destinationUrl value for this CallToActionCreative.
     * 
     * @return destinationUrl   * <span class="constraint Required">This field is required and
     * should not be {@code null}.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public java.lang.String getDestinationUrl() {
        return destinationUrl;
    }


    /**
     * Sets the destinationUrl value for this CallToActionCreative.
     * 
     * @param destinationUrl   * <span class="constraint Required">This field is required and
     * should not be {@code null}.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public void setDestinationUrl(java.lang.String destinationUrl) {
        this.destinationUrl = destinationUrl;
    }


    /**
     * Gets the image value for this CallToActionCreative.
     * 
     * @return image   * Optional image object.
     */
    public com.google.api.ads.adwords.axis.v201402.video.CallToActionImage getImage() {
        return image;
    }


    /**
     * Sets the image value for this CallToActionCreative.
     * 
     * @param image   * Optional image object.
     */
    public void setImage(com.google.api.ads.adwords.axis.v201402.video.CallToActionImage image) {
        this.image = image;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CallToActionCreative)) return false;
        CallToActionCreative other = (CallToActionCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.headline==null && other.getHeadline()==null) || 
             (this.headline!=null &&
              this.headline.equals(other.getHeadline()))) &&
            ((this.descriptionLine1==null && other.getDescriptionLine1()==null) || 
             (this.descriptionLine1!=null &&
              this.descriptionLine1.equals(other.getDescriptionLine1()))) &&
            ((this.descriptionLine2==null && other.getDescriptionLine2()==null) || 
             (this.descriptionLine2!=null &&
              this.descriptionLine2.equals(other.getDescriptionLine2()))) &&
            ((this.displayUrl==null && other.getDisplayUrl()==null) || 
             (this.displayUrl!=null &&
              this.displayUrl.equals(other.getDisplayUrl()))) &&
            ((this.destinationUrl==null && other.getDestinationUrl()==null) || 
             (this.destinationUrl!=null &&
              this.destinationUrl.equals(other.getDestinationUrl()))) &&
            ((this.image==null && other.getImage()==null) || 
             (this.image!=null &&
              this.image.equals(other.getImage())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getHeadline() != null) {
            _hashCode += getHeadline().hashCode();
        }
        if (getDescriptionLine1() != null) {
            _hashCode += getDescriptionLine1().hashCode();
        }
        if (getDescriptionLine2() != null) {
            _hashCode += getDescriptionLine2().hashCode();
        }
        if (getDisplayUrl() != null) {
            _hashCode += getDisplayUrl().hashCode();
        }
        if (getDestinationUrl() != null) {
            _hashCode += getDestinationUrl().hashCode();
        }
        if (getImage() != null) {
            _hashCode += getImage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CallToActionCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "CallToAction.Creative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "CallToAction.Creative.Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headline");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "headline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descriptionLine1");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "descriptionLine1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descriptionLine2");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "descriptionLine2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "displayUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "destinationUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("image");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "image"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "CallToActionImage"));
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
