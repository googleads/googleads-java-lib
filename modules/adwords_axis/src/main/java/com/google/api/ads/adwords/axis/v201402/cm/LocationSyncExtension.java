/**
 * LocationSyncExtension.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.cm;


/**
 * Local business center(LBC) sync extension that ties a LBC account
 * with a campaign.
 */
public class LocationSyncExtension  extends com.google.api.ads.adwords.axis.v201402.cm.AdExtension  implements java.io.Serializable {
    /* Email associated with the LBC backend data
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "Email".</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private java.lang.String email;

    /* Required authentication token (from ClientLogin API) for the
     * email - input only. */
    private java.lang.String authToken;

    /* Authentication token (from OAuth API) for the email if OAuth
     * athentication should be used
     *                     instead of ClientLogin API. One of either authToken
     * or oAuthInfo is required. */
    private com.google.api.ads.adwords.axis.v201402.cm.OAuthInfo oAuthInfo;

    /* The business icon to use with the extension
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "IconMediaId".</span> */
    private java.lang.Long iconMediaId;

    /* Whether we should copy homepage url from LBC entries as the
     * destination url in location extension.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ShouldSyncUrl".</span> */
    private java.lang.Boolean shouldSyncUrl;

    public LocationSyncExtension() {
    }

    public LocationSyncExtension(
           java.lang.Long id,
           java.lang.String adExtensionType,
           java.lang.String email,
           java.lang.String authToken,
           com.google.api.ads.adwords.axis.v201402.cm.OAuthInfo oAuthInfo,
           java.lang.Long iconMediaId,
           java.lang.Boolean shouldSyncUrl) {
        super(
            id,
            adExtensionType);
        this.email = email;
        this.authToken = authToken;
        this.oAuthInfo = oAuthInfo;
        this.iconMediaId = iconMediaId;
        this.shouldSyncUrl = shouldSyncUrl;
    }


    /**
     * Gets the email value for this LocationSyncExtension.
     * 
     * @return email   * Email associated with the LBC backend data
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "Email".</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this LocationSyncExtension.
     * 
     * @param email   * Email associated with the LBC backend data
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "Email".</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the authToken value for this LocationSyncExtension.
     * 
     * @return authToken   * Required authentication token (from ClientLogin API) for the
     * email - input only.
     */
    public java.lang.String getAuthToken() {
        return authToken;
    }


    /**
     * Sets the authToken value for this LocationSyncExtension.
     * 
     * @param authToken   * Required authentication token (from ClientLogin API) for the
     * email - input only.
     */
    public void setAuthToken(java.lang.String authToken) {
        this.authToken = authToken;
    }


    /**
     * Gets the oAuthInfo value for this LocationSyncExtension.
     * 
     * @return oAuthInfo   * Authentication token (from OAuth API) for the email if OAuth
     * athentication should be used
     *                     instead of ClientLogin API. One of either authToken
     * or oAuthInfo is required.
     */
    public com.google.api.ads.adwords.axis.v201402.cm.OAuthInfo getOAuthInfo() {
        return oAuthInfo;
    }


    /**
     * Sets the oAuthInfo value for this LocationSyncExtension.
     * 
     * @param oAuthInfo   * Authentication token (from OAuth API) for the email if OAuth
     * athentication should be used
     *                     instead of ClientLogin API. One of either authToken
     * or oAuthInfo is required.
     */
    public void setOAuthInfo(com.google.api.ads.adwords.axis.v201402.cm.OAuthInfo oAuthInfo) {
        this.oAuthInfo = oAuthInfo;
    }


    /**
     * Gets the iconMediaId value for this LocationSyncExtension.
     * 
     * @return iconMediaId   * The business icon to use with the extension
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "IconMediaId".</span>
     */
    public java.lang.Long getIconMediaId() {
        return iconMediaId;
    }


    /**
     * Sets the iconMediaId value for this LocationSyncExtension.
     * 
     * @param iconMediaId   * The business icon to use with the extension
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "IconMediaId".</span>
     */
    public void setIconMediaId(java.lang.Long iconMediaId) {
        this.iconMediaId = iconMediaId;
    }


    /**
     * Gets the shouldSyncUrl value for this LocationSyncExtension.
     * 
     * @return shouldSyncUrl   * Whether we should copy homepage url from LBC entries as the
     * destination url in location extension.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ShouldSyncUrl".</span>
     */
    public java.lang.Boolean getShouldSyncUrl() {
        return shouldSyncUrl;
    }


    /**
     * Sets the shouldSyncUrl value for this LocationSyncExtension.
     * 
     * @param shouldSyncUrl   * Whether we should copy homepage url from LBC entries as the
     * destination url in location extension.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ShouldSyncUrl".</span>
     */
    public void setShouldSyncUrl(java.lang.Boolean shouldSyncUrl) {
        this.shouldSyncUrl = shouldSyncUrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocationSyncExtension)) return false;
        LocationSyncExtension other = (LocationSyncExtension) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.authToken==null && other.getAuthToken()==null) || 
             (this.authToken!=null &&
              this.authToken.equals(other.getAuthToken()))) &&
            ((this.oAuthInfo==null && other.getOAuthInfo()==null) || 
             (this.oAuthInfo!=null &&
              this.oAuthInfo.equals(other.getOAuthInfo()))) &&
            ((this.iconMediaId==null && other.getIconMediaId()==null) || 
             (this.iconMediaId!=null &&
              this.iconMediaId.equals(other.getIconMediaId()))) &&
            ((this.shouldSyncUrl==null && other.getShouldSyncUrl()==null) || 
             (this.shouldSyncUrl!=null &&
              this.shouldSyncUrl.equals(other.getShouldSyncUrl())));
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
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getAuthToken() != null) {
            _hashCode += getAuthToken().hashCode();
        }
        if (getOAuthInfo() != null) {
            _hashCode += getOAuthInfo().hashCode();
        }
        if (getIconMediaId() != null) {
            _hashCode += getIconMediaId().hashCode();
        }
        if (getShouldSyncUrl() != null) {
            _hashCode += getShouldSyncUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocationSyncExtension.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "LocationSyncExtension"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authToken");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "authToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OAuthInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "oAuthInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "OAuthInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iconMediaId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "iconMediaId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shouldSyncUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "shouldSyncUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
