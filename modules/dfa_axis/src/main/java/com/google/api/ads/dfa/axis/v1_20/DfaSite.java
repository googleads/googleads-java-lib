/**
 * DfaSite.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class DfaSite  extends com.google.api.ads.dfa.axis.v1_20.DfaSiteBase  implements java.io.Serializable {
    private boolean approved;

    private long countryId;

    private com.google.api.ads.dfa.axis.v1_20.DfaSiteContact[] dfaSiteContact;

    private boolean displayAlternateTextBelowRichMediaCreatives;

    private boolean existingCookiesIgnored;

    private boolean explicitApprovalNeeded;

    private java.lang.String keyname;

    private com.google.api.ads.dfa.axis.v1_20.LookbackWindow lookbackWindow;

    private long networkId;

    private boolean newCookiesDisabled;

    private com.google.api.ads.dfa.axis.v1_20.SiteRichMediaSettings richMediaSettings;

    private long siteDirectorySiteId;

    private long subnetworkId;

    private com.google.api.ads.dfa.axis.v1_20.SiteTagSettings tagSettings;

    public DfaSite() {
    }

    public DfaSite(
           long id,
           java.lang.String name,
           boolean approved,
           long countryId,
           com.google.api.ads.dfa.axis.v1_20.DfaSiteContact[] dfaSiteContact,
           boolean displayAlternateTextBelowRichMediaCreatives,
           boolean existingCookiesIgnored,
           boolean explicitApprovalNeeded,
           java.lang.String keyname,
           com.google.api.ads.dfa.axis.v1_20.LookbackWindow lookbackWindow,
           long networkId,
           boolean newCookiesDisabled,
           com.google.api.ads.dfa.axis.v1_20.SiteRichMediaSettings richMediaSettings,
           long siteDirectorySiteId,
           long subnetworkId,
           com.google.api.ads.dfa.axis.v1_20.SiteTagSettings tagSettings) {
        super(
            id,
            name);
        this.approved = approved;
        this.countryId = countryId;
        this.dfaSiteContact = dfaSiteContact;
        this.displayAlternateTextBelowRichMediaCreatives = displayAlternateTextBelowRichMediaCreatives;
        this.existingCookiesIgnored = existingCookiesIgnored;
        this.explicitApprovalNeeded = explicitApprovalNeeded;
        this.keyname = keyname;
        this.lookbackWindow = lookbackWindow;
        this.networkId = networkId;
        this.newCookiesDisabled = newCookiesDisabled;
        this.richMediaSettings = richMediaSettings;
        this.siteDirectorySiteId = siteDirectorySiteId;
        this.subnetworkId = subnetworkId;
        this.tagSettings = tagSettings;
    }


    /**
     * Gets the approved value for this DfaSite.
     * 
     * @return approved
     */
    public boolean isApproved() {
        return approved;
    }


    /**
     * Sets the approved value for this DfaSite.
     * 
     * @param approved
     */
    public void setApproved(boolean approved) {
        this.approved = approved;
    }


    /**
     * Gets the countryId value for this DfaSite.
     * 
     * @return countryId
     */
    public long getCountryId() {
        return countryId;
    }


    /**
     * Sets the countryId value for this DfaSite.
     * 
     * @param countryId
     */
    public void setCountryId(long countryId) {
        this.countryId = countryId;
    }


    /**
     * Gets the dfaSiteContact value for this DfaSite.
     * 
     * @return dfaSiteContact
     */
    public com.google.api.ads.dfa.axis.v1_20.DfaSiteContact[] getDfaSiteContact() {
        return dfaSiteContact;
    }


    /**
     * Sets the dfaSiteContact value for this DfaSite.
     * 
     * @param dfaSiteContact
     */
    public void setDfaSiteContact(com.google.api.ads.dfa.axis.v1_20.DfaSiteContact[] dfaSiteContact) {
        this.dfaSiteContact = dfaSiteContact;
    }


    /**
     * Gets the displayAlternateTextBelowRichMediaCreatives value for this DfaSite.
     * 
     * @return displayAlternateTextBelowRichMediaCreatives
     */
    public boolean isDisplayAlternateTextBelowRichMediaCreatives() {
        return displayAlternateTextBelowRichMediaCreatives;
    }


    /**
     * Sets the displayAlternateTextBelowRichMediaCreatives value for this DfaSite.
     * 
     * @param displayAlternateTextBelowRichMediaCreatives
     */
    public void setDisplayAlternateTextBelowRichMediaCreatives(boolean displayAlternateTextBelowRichMediaCreatives) {
        this.displayAlternateTextBelowRichMediaCreatives = displayAlternateTextBelowRichMediaCreatives;
    }


    /**
     * Gets the existingCookiesIgnored value for this DfaSite.
     * 
     * @return existingCookiesIgnored
     */
    public boolean isExistingCookiesIgnored() {
        return existingCookiesIgnored;
    }


    /**
     * Sets the existingCookiesIgnored value for this DfaSite.
     * 
     * @param existingCookiesIgnored
     */
    public void setExistingCookiesIgnored(boolean existingCookiesIgnored) {
        this.existingCookiesIgnored = existingCookiesIgnored;
    }


    /**
     * Gets the explicitApprovalNeeded value for this DfaSite.
     * 
     * @return explicitApprovalNeeded
     */
    public boolean isExplicitApprovalNeeded() {
        return explicitApprovalNeeded;
    }


    /**
     * Sets the explicitApprovalNeeded value for this DfaSite.
     * 
     * @param explicitApprovalNeeded
     */
    public void setExplicitApprovalNeeded(boolean explicitApprovalNeeded) {
        this.explicitApprovalNeeded = explicitApprovalNeeded;
    }


    /**
     * Gets the keyname value for this DfaSite.
     * 
     * @return keyname
     */
    public java.lang.String getKeyname() {
        return keyname;
    }


    /**
     * Sets the keyname value for this DfaSite.
     * 
     * @param keyname
     */
    public void setKeyname(java.lang.String keyname) {
        this.keyname = keyname;
    }


    /**
     * Gets the lookbackWindow value for this DfaSite.
     * 
     * @return lookbackWindow
     */
    public com.google.api.ads.dfa.axis.v1_20.LookbackWindow getLookbackWindow() {
        return lookbackWindow;
    }


    /**
     * Sets the lookbackWindow value for this DfaSite.
     * 
     * @param lookbackWindow
     */
    public void setLookbackWindow(com.google.api.ads.dfa.axis.v1_20.LookbackWindow lookbackWindow) {
        this.lookbackWindow = lookbackWindow;
    }


    /**
     * Gets the networkId value for this DfaSite.
     * 
     * @return networkId
     */
    public long getNetworkId() {
        return networkId;
    }


    /**
     * Sets the networkId value for this DfaSite.
     * 
     * @param networkId
     */
    public void setNetworkId(long networkId) {
        this.networkId = networkId;
    }


    /**
     * Gets the newCookiesDisabled value for this DfaSite.
     * 
     * @return newCookiesDisabled
     */
    public boolean isNewCookiesDisabled() {
        return newCookiesDisabled;
    }


    /**
     * Sets the newCookiesDisabled value for this DfaSite.
     * 
     * @param newCookiesDisabled
     */
    public void setNewCookiesDisabled(boolean newCookiesDisabled) {
        this.newCookiesDisabled = newCookiesDisabled;
    }


    /**
     * Gets the richMediaSettings value for this DfaSite.
     * 
     * @return richMediaSettings
     */
    public com.google.api.ads.dfa.axis.v1_20.SiteRichMediaSettings getRichMediaSettings() {
        return richMediaSettings;
    }


    /**
     * Sets the richMediaSettings value for this DfaSite.
     * 
     * @param richMediaSettings
     */
    public void setRichMediaSettings(com.google.api.ads.dfa.axis.v1_20.SiteRichMediaSettings richMediaSettings) {
        this.richMediaSettings = richMediaSettings;
    }


    /**
     * Gets the siteDirectorySiteId value for this DfaSite.
     * 
     * @return siteDirectorySiteId
     */
    public long getSiteDirectorySiteId() {
        return siteDirectorySiteId;
    }


    /**
     * Sets the siteDirectorySiteId value for this DfaSite.
     * 
     * @param siteDirectorySiteId
     */
    public void setSiteDirectorySiteId(long siteDirectorySiteId) {
        this.siteDirectorySiteId = siteDirectorySiteId;
    }


    /**
     * Gets the subnetworkId value for this DfaSite.
     * 
     * @return subnetworkId
     */
    public long getSubnetworkId() {
        return subnetworkId;
    }


    /**
     * Sets the subnetworkId value for this DfaSite.
     * 
     * @param subnetworkId
     */
    public void setSubnetworkId(long subnetworkId) {
        this.subnetworkId = subnetworkId;
    }


    /**
     * Gets the tagSettings value for this DfaSite.
     * 
     * @return tagSettings
     */
    public com.google.api.ads.dfa.axis.v1_20.SiteTagSettings getTagSettings() {
        return tagSettings;
    }


    /**
     * Sets the tagSettings value for this DfaSite.
     * 
     * @param tagSettings
     */
    public void setTagSettings(com.google.api.ads.dfa.axis.v1_20.SiteTagSettings tagSettings) {
        this.tagSettings = tagSettings;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DfaSite)) return false;
        DfaSite other = (DfaSite) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.approved == other.isApproved() &&
            this.countryId == other.getCountryId() &&
            ((this.dfaSiteContact==null && other.getDfaSiteContact()==null) || 
             (this.dfaSiteContact!=null &&
              java.util.Arrays.equals(this.dfaSiteContact, other.getDfaSiteContact()))) &&
            this.displayAlternateTextBelowRichMediaCreatives == other.isDisplayAlternateTextBelowRichMediaCreatives() &&
            this.existingCookiesIgnored == other.isExistingCookiesIgnored() &&
            this.explicitApprovalNeeded == other.isExplicitApprovalNeeded() &&
            ((this.keyname==null && other.getKeyname()==null) || 
             (this.keyname!=null &&
              this.keyname.equals(other.getKeyname()))) &&
            ((this.lookbackWindow==null && other.getLookbackWindow()==null) || 
             (this.lookbackWindow!=null &&
              this.lookbackWindow.equals(other.getLookbackWindow()))) &&
            this.networkId == other.getNetworkId() &&
            this.newCookiesDisabled == other.isNewCookiesDisabled() &&
            ((this.richMediaSettings==null && other.getRichMediaSettings()==null) || 
             (this.richMediaSettings!=null &&
              this.richMediaSettings.equals(other.getRichMediaSettings()))) &&
            this.siteDirectorySiteId == other.getSiteDirectorySiteId() &&
            this.subnetworkId == other.getSubnetworkId() &&
            ((this.tagSettings==null && other.getTagSettings()==null) || 
             (this.tagSettings!=null &&
              this.tagSettings.equals(other.getTagSettings())));
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
        _hashCode += (isApproved() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getCountryId()).hashCode();
        if (getDfaSiteContact() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDfaSiteContact());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDfaSiteContact(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isDisplayAlternateTextBelowRichMediaCreatives() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isExistingCookiesIgnored() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isExplicitApprovalNeeded() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getKeyname() != null) {
            _hashCode += getKeyname().hashCode();
        }
        if (getLookbackWindow() != null) {
            _hashCode += getLookbackWindow().hashCode();
        }
        _hashCode += new Long(getNetworkId()).hashCode();
        _hashCode += (isNewCookiesDisabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRichMediaSettings() != null) {
            _hashCode += getRichMediaSettings().hashCode();
        }
        _hashCode += new Long(getSiteDirectorySiteId()).hashCode();
        _hashCode += new Long(getSubnetworkId()).hashCode();
        if (getTagSettings() != null) {
            _hashCode += getTagSettings().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DfaSite.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "DfaSite"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approved");
        elemField.setXmlName(new javax.xml.namespace.QName("", "approved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dfaSiteContact");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dfaSiteContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "DfaSiteContact"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayAlternateTextBelowRichMediaCreatives");
        elemField.setXmlName(new javax.xml.namespace.QName("", "displayAlternateTextBelowRichMediaCreatives"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("existingCookiesIgnored");
        elemField.setXmlName(new javax.xml.namespace.QName("", "existingCookiesIgnored"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("explicitApprovalNeeded");
        elemField.setXmlName(new javax.xml.namespace.QName("", "explicitApprovalNeeded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "keyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lookbackWindow");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lookbackWindow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "LookbackWindow"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "networkId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newCookiesDisabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newCookiesDisabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("richMediaSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "richMediaSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "SiteRichMediaSettings"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteDirectorySiteId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "siteDirectorySiteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subnetworkId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subnetworkId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tagSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tagSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "SiteTagSettings"));
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
