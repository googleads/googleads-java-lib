/**
 * InAppLinkExtension.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201306.cm;


/**
 * <p>This extension is useful for advertisers who wish to provide
 * users with a
 *             link that points to the advertiser's mobile application
 * in addition to their
 *             website.
 *             
 *             <p>It is also known as Mobile App Extension.
 *             
 *             <p>The API allows one InAppLinkExtension per {@code AppStore}
 * per campaign.
 *             Only the extension for a given {@code AppStore} will render
 * on the device
 *             relevant to that {@code AppStore} (e.g. iPhones for {@code
 * AppStore.ITUNES}
 *             and Android phones for {@code AppStore.GOOGLE_PLAY}).
 *             <span class="constraint Beta">This is a beta feature.</span>
 */
public class InAppLinkExtension  extends com.google.api.ads.adwords.axis.v201306.cm.AdExtension  implements java.io.Serializable {
    /* The visible text displayed when the link in rendered in an
     * ad.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "InAppLinkText".</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     *                     <span class="constraint StringLength">The length
     * of this string should be between 1 and 25, inclusive.</span> */
    private java.lang.String inAppLinkText;

    /* The destination URL of the in-app link.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "InAppLinkUrl".</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     *                     <span class="constraint StringLength">The length
     * of this string should be between 1 and 1024, inclusive.</span> */
    private java.lang.String inAppLinkUrl;

    /* The Application Store that the target application belongs to.
     * <span class="constraint Selectable">This field can be selected using
     * the value "AppStore".</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201306.cm.InAppLinkExtensionAppStore appStore;

    /* The store-specific ID for the target application.
     *                     
     *                     <p>E.g. com.foo.bar for Google Play or 1234567
     * for iTunes.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "AppId".</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private java.lang.String appId;

    public InAppLinkExtension() {
    }

    public InAppLinkExtension(
           java.lang.Long id,
           java.lang.String adExtensionType,
           java.lang.String inAppLinkText,
           java.lang.String inAppLinkUrl,
           com.google.api.ads.adwords.axis.v201306.cm.InAppLinkExtensionAppStore appStore,
           java.lang.String appId) {
        super(
            id,
            adExtensionType);
        this.inAppLinkText = inAppLinkText;
        this.inAppLinkUrl = inAppLinkUrl;
        this.appStore = appStore;
        this.appId = appId;
    }


    /**
     * Gets the inAppLinkText value for this InAppLinkExtension.
     * 
     * @return inAppLinkText   * The visible text displayed when the link in rendered in an
     * ad.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "InAppLinkText".</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     *                     <span class="constraint StringLength">The length
     * of this string should be between 1 and 25, inclusive.</span>
     */
    public java.lang.String getInAppLinkText() {
        return inAppLinkText;
    }


    /**
     * Sets the inAppLinkText value for this InAppLinkExtension.
     * 
     * @param inAppLinkText   * The visible text displayed when the link in rendered in an
     * ad.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "InAppLinkText".</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     *                     <span class="constraint StringLength">The length
     * of this string should be between 1 and 25, inclusive.</span>
     */
    public void setInAppLinkText(java.lang.String inAppLinkText) {
        this.inAppLinkText = inAppLinkText;
    }


    /**
     * Gets the inAppLinkUrl value for this InAppLinkExtension.
     * 
     * @return inAppLinkUrl   * The destination URL of the in-app link.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "InAppLinkUrl".</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     *                     <span class="constraint StringLength">The length
     * of this string should be between 1 and 1024, inclusive.</span>
     */
    public java.lang.String getInAppLinkUrl() {
        return inAppLinkUrl;
    }


    /**
     * Sets the inAppLinkUrl value for this InAppLinkExtension.
     * 
     * @param inAppLinkUrl   * The destination URL of the in-app link.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "InAppLinkUrl".</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     *                     <span class="constraint StringLength">The length
     * of this string should be between 1 and 1024, inclusive.</span>
     */
    public void setInAppLinkUrl(java.lang.String inAppLinkUrl) {
        this.inAppLinkUrl = inAppLinkUrl;
    }


    /**
     * Gets the appStore value for this InAppLinkExtension.
     * 
     * @return appStore   * The Application Store that the target application belongs to.
     * <span class="constraint Selectable">This field can be selected using
     * the value "AppStore".</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201306.cm.InAppLinkExtensionAppStore getAppStore() {
        return appStore;
    }


    /**
     * Sets the appStore value for this InAppLinkExtension.
     * 
     * @param appStore   * The Application Store that the target application belongs to.
     * <span class="constraint Selectable">This field can be selected using
     * the value "AppStore".</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setAppStore(com.google.api.ads.adwords.axis.v201306.cm.InAppLinkExtensionAppStore appStore) {
        this.appStore = appStore;
    }


    /**
     * Gets the appId value for this InAppLinkExtension.
     * 
     * @return appId   * The store-specific ID for the target application.
     *                     
     *                     <p>E.g. com.foo.bar for Google Play or 1234567
     * for iTunes.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "AppId".</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public java.lang.String getAppId() {
        return appId;
    }


    /**
     * Sets the appId value for this InAppLinkExtension.
     * 
     * @param appId   * The store-specific ID for the target application.
     *                     
     *                     <p>E.g. com.foo.bar for Google Play or 1234567
     * for iTunes.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "AppId".</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setAppId(java.lang.String appId) {
        this.appId = appId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InAppLinkExtension)) return false;
        InAppLinkExtension other = (InAppLinkExtension) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.inAppLinkText==null && other.getInAppLinkText()==null) || 
             (this.inAppLinkText!=null &&
              this.inAppLinkText.equals(other.getInAppLinkText()))) &&
            ((this.inAppLinkUrl==null && other.getInAppLinkUrl()==null) || 
             (this.inAppLinkUrl!=null &&
              this.inAppLinkUrl.equals(other.getInAppLinkUrl()))) &&
            ((this.appStore==null && other.getAppStore()==null) || 
             (this.appStore!=null &&
              this.appStore.equals(other.getAppStore()))) &&
            ((this.appId==null && other.getAppId()==null) || 
             (this.appId!=null &&
              this.appId.equals(other.getAppId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getInAppLinkText() != null) {
            _hashCode += getInAppLinkText().hashCode();
        }
        if (getInAppLinkUrl() != null) {
            _hashCode += getInAppLinkUrl().hashCode();
        }
        if (getAppStore() != null) {
            _hashCode += getAppStore().hashCode();
        }
        if (getAppId() != null) {
            _hashCode += getAppId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InAppLinkExtension.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "InAppLinkExtension"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inAppLinkText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "inAppLinkText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inAppLinkUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "inAppLinkUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appStore");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "appStore"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "InAppLinkExtension.AppStore"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "appId"));
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
