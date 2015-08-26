/**
 * FlashInpageCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class FlashInpageCreative  extends com.google.api.ads.dfa.axis.v1_20.HTMLCreativeBase  implements java.io.Serializable {
    private com.google.api.ads.dfa.axis.v1_20.FSCommand FSCommand;

    private com.google.api.ads.dfa.axis.v1_20.HTMLCreativeFlashAsset[] additionalFlashAssets;

    private com.google.api.ads.dfa.axis.v1_20.HTMLCreativeAsset[] additionalImageAssets;

    private boolean allowScriptAccess;

    private java.lang.String backgroundColor;

    private java.lang.String backupImageAlternateText;

    private com.google.api.ads.dfa.axis.v1_20.HTMLCreativeAsset backupImageAsset;

    private java.lang.String backupImageClickThroughUrl;

    private com.google.api.ads.dfa.axis.v1_20.TargetWindow backupImageTargetWindow;

    private com.google.api.ads.dfa.axis.v1_20.FlashClickTag[] clickTags;

    private boolean codeLocked;

    private com.google.api.ads.dfa.axis.v1_20.HTMLCreativeFlashAsset parentFlashAsset;

    private java.lang.String surveyUrl;

    private java.lang.String wmode;

    public FlashInpageCreative() {
    }

    public FlashInpageCreative(
           long id,
           java.lang.String name,
           boolean active,
           long advertiserId,
           boolean archived,
           com.google.api.ads.dfa.axis.v1_20.CreativeFieldAssignment[] creativeFieldAssignments,
           java.util.Calendar modifiedDate,
           long renderingId,
           long sizeId,
           long typeId,
           int version,
           java.lang.String HTMLCode,
           com.google.api.ads.dfa.axis.v1_20.HTMLCreativeAsset[] creativeAssets,
           com.google.api.ads.dfa.axis.v1_20.FSCommand FSCommand,
           com.google.api.ads.dfa.axis.v1_20.HTMLCreativeFlashAsset[] additionalFlashAssets,
           com.google.api.ads.dfa.axis.v1_20.HTMLCreativeAsset[] additionalImageAssets,
           boolean allowScriptAccess,
           java.lang.String backgroundColor,
           java.lang.String backupImageAlternateText,
           com.google.api.ads.dfa.axis.v1_20.HTMLCreativeAsset backupImageAsset,
           java.lang.String backupImageClickThroughUrl,
           com.google.api.ads.dfa.axis.v1_20.TargetWindow backupImageTargetWindow,
           com.google.api.ads.dfa.axis.v1_20.FlashClickTag[] clickTags,
           boolean codeLocked,
           com.google.api.ads.dfa.axis.v1_20.HTMLCreativeFlashAsset parentFlashAsset,
           java.lang.String surveyUrl,
           java.lang.String wmode) {
        super(
            id,
            name,
            active,
            advertiserId,
            archived,
            creativeFieldAssignments,
            modifiedDate,
            renderingId,
            sizeId,
            typeId,
            version,
            HTMLCode,
            creativeAssets);
        this.FSCommand = FSCommand;
        this.additionalFlashAssets = additionalFlashAssets;
        this.additionalImageAssets = additionalImageAssets;
        this.allowScriptAccess = allowScriptAccess;
        this.backgroundColor = backgroundColor;
        this.backupImageAlternateText = backupImageAlternateText;
        this.backupImageAsset = backupImageAsset;
        this.backupImageClickThroughUrl = backupImageClickThroughUrl;
        this.backupImageTargetWindow = backupImageTargetWindow;
        this.clickTags = clickTags;
        this.codeLocked = codeLocked;
        this.parentFlashAsset = parentFlashAsset;
        this.surveyUrl = surveyUrl;
        this.wmode = wmode;
    }


    /**
     * Gets the FSCommand value for this FlashInpageCreative.
     * 
     * @return FSCommand
     */
    public com.google.api.ads.dfa.axis.v1_20.FSCommand getFSCommand() {
        return FSCommand;
    }


    /**
     * Sets the FSCommand value for this FlashInpageCreative.
     * 
     * @param FSCommand
     */
    public void setFSCommand(com.google.api.ads.dfa.axis.v1_20.FSCommand FSCommand) {
        this.FSCommand = FSCommand;
    }


    /**
     * Gets the additionalFlashAssets value for this FlashInpageCreative.
     * 
     * @return additionalFlashAssets
     */
    public com.google.api.ads.dfa.axis.v1_20.HTMLCreativeFlashAsset[] getAdditionalFlashAssets() {
        return additionalFlashAssets;
    }


    /**
     * Sets the additionalFlashAssets value for this FlashInpageCreative.
     * 
     * @param additionalFlashAssets
     */
    public void setAdditionalFlashAssets(com.google.api.ads.dfa.axis.v1_20.HTMLCreativeFlashAsset[] additionalFlashAssets) {
        this.additionalFlashAssets = additionalFlashAssets;
    }


    /**
     * Gets the additionalImageAssets value for this FlashInpageCreative.
     * 
     * @return additionalImageAssets
     */
    public com.google.api.ads.dfa.axis.v1_20.HTMLCreativeAsset[] getAdditionalImageAssets() {
        return additionalImageAssets;
    }


    /**
     * Sets the additionalImageAssets value for this FlashInpageCreative.
     * 
     * @param additionalImageAssets
     */
    public void setAdditionalImageAssets(com.google.api.ads.dfa.axis.v1_20.HTMLCreativeAsset[] additionalImageAssets) {
        this.additionalImageAssets = additionalImageAssets;
    }


    /**
     * Gets the allowScriptAccess value for this FlashInpageCreative.
     * 
     * @return allowScriptAccess
     */
    public boolean isAllowScriptAccess() {
        return allowScriptAccess;
    }


    /**
     * Sets the allowScriptAccess value for this FlashInpageCreative.
     * 
     * @param allowScriptAccess
     */
    public void setAllowScriptAccess(boolean allowScriptAccess) {
        this.allowScriptAccess = allowScriptAccess;
    }


    /**
     * Gets the backgroundColor value for this FlashInpageCreative.
     * 
     * @return backgroundColor
     */
    public java.lang.String getBackgroundColor() {
        return backgroundColor;
    }


    /**
     * Sets the backgroundColor value for this FlashInpageCreative.
     * 
     * @param backgroundColor
     */
    public void setBackgroundColor(java.lang.String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }


    /**
     * Gets the backupImageAlternateText value for this FlashInpageCreative.
     * 
     * @return backupImageAlternateText
     */
    public java.lang.String getBackupImageAlternateText() {
        return backupImageAlternateText;
    }


    /**
     * Sets the backupImageAlternateText value for this FlashInpageCreative.
     * 
     * @param backupImageAlternateText
     */
    public void setBackupImageAlternateText(java.lang.String backupImageAlternateText) {
        this.backupImageAlternateText = backupImageAlternateText;
    }


    /**
     * Gets the backupImageAsset value for this FlashInpageCreative.
     * 
     * @return backupImageAsset
     */
    public com.google.api.ads.dfa.axis.v1_20.HTMLCreativeAsset getBackupImageAsset() {
        return backupImageAsset;
    }


    /**
     * Sets the backupImageAsset value for this FlashInpageCreative.
     * 
     * @param backupImageAsset
     */
    public void setBackupImageAsset(com.google.api.ads.dfa.axis.v1_20.HTMLCreativeAsset backupImageAsset) {
        this.backupImageAsset = backupImageAsset;
    }


    /**
     * Gets the backupImageClickThroughUrl value for this FlashInpageCreative.
     * 
     * @return backupImageClickThroughUrl
     */
    public java.lang.String getBackupImageClickThroughUrl() {
        return backupImageClickThroughUrl;
    }


    /**
     * Sets the backupImageClickThroughUrl value for this FlashInpageCreative.
     * 
     * @param backupImageClickThroughUrl
     */
    public void setBackupImageClickThroughUrl(java.lang.String backupImageClickThroughUrl) {
        this.backupImageClickThroughUrl = backupImageClickThroughUrl;
    }


    /**
     * Gets the backupImageTargetWindow value for this FlashInpageCreative.
     * 
     * @return backupImageTargetWindow
     */
    public com.google.api.ads.dfa.axis.v1_20.TargetWindow getBackupImageTargetWindow() {
        return backupImageTargetWindow;
    }


    /**
     * Sets the backupImageTargetWindow value for this FlashInpageCreative.
     * 
     * @param backupImageTargetWindow
     */
    public void setBackupImageTargetWindow(com.google.api.ads.dfa.axis.v1_20.TargetWindow backupImageTargetWindow) {
        this.backupImageTargetWindow = backupImageTargetWindow;
    }


    /**
     * Gets the clickTags value for this FlashInpageCreative.
     * 
     * @return clickTags
     */
    public com.google.api.ads.dfa.axis.v1_20.FlashClickTag[] getClickTags() {
        return clickTags;
    }


    /**
     * Sets the clickTags value for this FlashInpageCreative.
     * 
     * @param clickTags
     */
    public void setClickTags(com.google.api.ads.dfa.axis.v1_20.FlashClickTag[] clickTags) {
        this.clickTags = clickTags;
    }


    /**
     * Gets the codeLocked value for this FlashInpageCreative.
     * 
     * @return codeLocked
     */
    public boolean isCodeLocked() {
        return codeLocked;
    }


    /**
     * Sets the codeLocked value for this FlashInpageCreative.
     * 
     * @param codeLocked
     */
    public void setCodeLocked(boolean codeLocked) {
        this.codeLocked = codeLocked;
    }


    /**
     * Gets the parentFlashAsset value for this FlashInpageCreative.
     * 
     * @return parentFlashAsset
     */
    public com.google.api.ads.dfa.axis.v1_20.HTMLCreativeFlashAsset getParentFlashAsset() {
        return parentFlashAsset;
    }


    /**
     * Sets the parentFlashAsset value for this FlashInpageCreative.
     * 
     * @param parentFlashAsset
     */
    public void setParentFlashAsset(com.google.api.ads.dfa.axis.v1_20.HTMLCreativeFlashAsset parentFlashAsset) {
        this.parentFlashAsset = parentFlashAsset;
    }


    /**
     * Gets the surveyUrl value for this FlashInpageCreative.
     * 
     * @return surveyUrl
     */
    public java.lang.String getSurveyUrl() {
        return surveyUrl;
    }


    /**
     * Sets the surveyUrl value for this FlashInpageCreative.
     * 
     * @param surveyUrl
     */
    public void setSurveyUrl(java.lang.String surveyUrl) {
        this.surveyUrl = surveyUrl;
    }


    /**
     * Gets the wmode value for this FlashInpageCreative.
     * 
     * @return wmode
     */
    public java.lang.String getWmode() {
        return wmode;
    }


    /**
     * Sets the wmode value for this FlashInpageCreative.
     * 
     * @param wmode
     */
    public void setWmode(java.lang.String wmode) {
        this.wmode = wmode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlashInpageCreative)) return false;
        FlashInpageCreative other = (FlashInpageCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.FSCommand==null && other.getFSCommand()==null) || 
             (this.FSCommand!=null &&
              this.FSCommand.equals(other.getFSCommand()))) &&
            ((this.additionalFlashAssets==null && other.getAdditionalFlashAssets()==null) || 
             (this.additionalFlashAssets!=null &&
              java.util.Arrays.equals(this.additionalFlashAssets, other.getAdditionalFlashAssets()))) &&
            ((this.additionalImageAssets==null && other.getAdditionalImageAssets()==null) || 
             (this.additionalImageAssets!=null &&
              java.util.Arrays.equals(this.additionalImageAssets, other.getAdditionalImageAssets()))) &&
            this.allowScriptAccess == other.isAllowScriptAccess() &&
            ((this.backgroundColor==null && other.getBackgroundColor()==null) || 
             (this.backgroundColor!=null &&
              this.backgroundColor.equals(other.getBackgroundColor()))) &&
            ((this.backupImageAlternateText==null && other.getBackupImageAlternateText()==null) || 
             (this.backupImageAlternateText!=null &&
              this.backupImageAlternateText.equals(other.getBackupImageAlternateText()))) &&
            ((this.backupImageAsset==null && other.getBackupImageAsset()==null) || 
             (this.backupImageAsset!=null &&
              this.backupImageAsset.equals(other.getBackupImageAsset()))) &&
            ((this.backupImageClickThroughUrl==null && other.getBackupImageClickThroughUrl()==null) || 
             (this.backupImageClickThroughUrl!=null &&
              this.backupImageClickThroughUrl.equals(other.getBackupImageClickThroughUrl()))) &&
            ((this.backupImageTargetWindow==null && other.getBackupImageTargetWindow()==null) || 
             (this.backupImageTargetWindow!=null &&
              this.backupImageTargetWindow.equals(other.getBackupImageTargetWindow()))) &&
            ((this.clickTags==null && other.getClickTags()==null) || 
             (this.clickTags!=null &&
              java.util.Arrays.equals(this.clickTags, other.getClickTags()))) &&
            this.codeLocked == other.isCodeLocked() &&
            ((this.parentFlashAsset==null && other.getParentFlashAsset()==null) || 
             (this.parentFlashAsset!=null &&
              this.parentFlashAsset.equals(other.getParentFlashAsset()))) &&
            ((this.surveyUrl==null && other.getSurveyUrl()==null) || 
             (this.surveyUrl!=null &&
              this.surveyUrl.equals(other.getSurveyUrl()))) &&
            ((this.wmode==null && other.getWmode()==null) || 
             (this.wmode!=null &&
              this.wmode.equals(other.getWmode())));
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
        if (getFSCommand() != null) {
            _hashCode += getFSCommand().hashCode();
        }
        if (getAdditionalFlashAssets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalFlashAssets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdditionalFlashAssets(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdditionalImageAssets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalImageAssets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdditionalImageAssets(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isAllowScriptAccess() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getBackgroundColor() != null) {
            _hashCode += getBackgroundColor().hashCode();
        }
        if (getBackupImageAlternateText() != null) {
            _hashCode += getBackupImageAlternateText().hashCode();
        }
        if (getBackupImageAsset() != null) {
            _hashCode += getBackupImageAsset().hashCode();
        }
        if (getBackupImageClickThroughUrl() != null) {
            _hashCode += getBackupImageClickThroughUrl().hashCode();
        }
        if (getBackupImageTargetWindow() != null) {
            _hashCode += getBackupImageTargetWindow().hashCode();
        }
        if (getClickTags() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClickTags());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClickTags(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isCodeLocked() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getParentFlashAsset() != null) {
            _hashCode += getParentFlashAsset().hashCode();
        }
        if (getSurveyUrl() != null) {
            _hashCode += getSurveyUrl().hashCode();
        }
        if (getWmode() != null) {
            _hashCode += getWmode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlashInpageCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "FlashInpageCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FSCommand");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FSCommand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "FSCommand"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalFlashAssets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "additionalFlashAssets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "HTMLCreativeFlashAsset"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalImageAssets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "additionalImageAssets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "HTMLCreativeAsset"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowScriptAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allowScriptAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backgroundColor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "backgroundColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backupImageAlternateText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "backupImageAlternateText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backupImageAsset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "backupImageAsset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "HTMLCreativeAsset"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backupImageClickThroughUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "backupImageClickThroughUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backupImageTargetWindow");
        elemField.setXmlName(new javax.xml.namespace.QName("", "backupImageTargetWindow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "TargetWindow"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clickTags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clickTags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "FlashClickTag"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeLocked");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codeLocked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentFlashAsset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentFlashAsset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "HTMLCreativeFlashAsset"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surveyUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "surveyUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wmode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wmode"));
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
