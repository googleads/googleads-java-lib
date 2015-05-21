/**
 * AppFeedItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201409.cm;


/**
 * Represents an App extension.
 */
public class AppFeedItem  extends com.google.api.ads.adwords.axis.v201409.cm.ExtensionFeedItem  implements java.io.Serializable {
    /* The application store that the target application belongs to. */
    private com.google.api.ads.adwords.axis.v201409.cm.AppFeedItemAppStore appStore;

    /* The store-specific ID for the target application.
     *                     <span class="constraint StringLength">This string
     * must not be empty.</span> */
    private java.lang.String appId;

    /* The visible text displayed when the link is rendered in an
     * ad.
     *                     <span class="constraint StringLength">This string
     * must not be empty.</span> */
    private java.lang.String appLinkText;

    /* The destination URL of the in-app link.
     *                     <span class="constraint StringLength">This string
     * must not be empty.</span> */
    private java.lang.String appUrl;

    public AppFeedItem() {
    }

    public AppFeedItem(
           java.lang.Long feedId,
           java.lang.Long feedItemId,
           com.google.api.ads.adwords.axis.v201409.cm.FeedItemStatus status,
           com.google.api.ads.adwords.axis.v201409.cm.FeedType feedType,
           java.lang.String startTime,
           java.lang.String endTime,
           com.google.api.ads.adwords.axis.v201409.cm.FeedItemDevicePreference devicePreference,
           com.google.api.ads.adwords.axis.v201409.cm.FeedItemScheduling scheduling,
           java.lang.String extensionFeedItemType,
           com.google.api.ads.adwords.axis.v201409.cm.AppFeedItemAppStore appStore,
           java.lang.String appId,
           java.lang.String appLinkText,
           java.lang.String appUrl) {
        super(
            feedId,
            feedItemId,
            status,
            feedType,
            startTime,
            endTime,
            devicePreference,
            scheduling,
            extensionFeedItemType);
        this.appStore = appStore;
        this.appId = appId;
        this.appLinkText = appLinkText;
        this.appUrl = appUrl;
    }


    /**
     * Gets the appStore value for this AppFeedItem.
     * 
     * @return appStore   * The application store that the target application belongs to.
     */
    public com.google.api.ads.adwords.axis.v201409.cm.AppFeedItemAppStore getAppStore() {
        return appStore;
    }


    /**
     * Sets the appStore value for this AppFeedItem.
     * 
     * @param appStore   * The application store that the target application belongs to.
     */
    public void setAppStore(com.google.api.ads.adwords.axis.v201409.cm.AppFeedItemAppStore appStore) {
        this.appStore = appStore;
    }


    /**
     * Gets the appId value for this AppFeedItem.
     * 
     * @return appId   * The store-specific ID for the target application.
     *                     <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public java.lang.String getAppId() {
        return appId;
    }


    /**
     * Sets the appId value for this AppFeedItem.
     * 
     * @param appId   * The store-specific ID for the target application.
     *                     <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public void setAppId(java.lang.String appId) {
        this.appId = appId;
    }


    /**
     * Gets the appLinkText value for this AppFeedItem.
     * 
     * @return appLinkText   * The visible text displayed when the link is rendered in an
     * ad.
     *                     <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public java.lang.String getAppLinkText() {
        return appLinkText;
    }


    /**
     * Sets the appLinkText value for this AppFeedItem.
     * 
     * @param appLinkText   * The visible text displayed when the link is rendered in an
     * ad.
     *                     <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public void setAppLinkText(java.lang.String appLinkText) {
        this.appLinkText = appLinkText;
    }


    /**
     * Gets the appUrl value for this AppFeedItem.
     * 
     * @return appUrl   * The destination URL of the in-app link.
     *                     <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public java.lang.String getAppUrl() {
        return appUrl;
    }


    /**
     * Sets the appUrl value for this AppFeedItem.
     * 
     * @param appUrl   * The destination URL of the in-app link.
     *                     <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public void setAppUrl(java.lang.String appUrl) {
        this.appUrl = appUrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AppFeedItem)) return false;
        AppFeedItem other = (AppFeedItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.appStore==null && other.getAppStore()==null) || 
             (this.appStore!=null &&
              this.appStore.equals(other.getAppStore()))) &&
            ((this.appId==null && other.getAppId()==null) || 
             (this.appId!=null &&
              this.appId.equals(other.getAppId()))) &&
            ((this.appLinkText==null && other.getAppLinkText()==null) || 
             (this.appLinkText!=null &&
              this.appLinkText.equals(other.getAppLinkText()))) &&
            ((this.appUrl==null && other.getAppUrl()==null) || 
             (this.appUrl!=null &&
              this.appUrl.equals(other.getAppUrl())));
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
        if (getAppStore() != null) {
            _hashCode += getAppStore().hashCode();
        }
        if (getAppId() != null) {
            _hashCode += getAppId().hashCode();
        }
        if (getAppLinkText() != null) {
            _hashCode += getAppLinkText().hashCode();
        }
        if (getAppUrl() != null) {
            _hashCode += getAppUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AppFeedItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "AppFeedItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appStore");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "appStore"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "AppFeedItem.AppStore"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "appId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appLinkText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "appLinkText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "appUrl"));
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
