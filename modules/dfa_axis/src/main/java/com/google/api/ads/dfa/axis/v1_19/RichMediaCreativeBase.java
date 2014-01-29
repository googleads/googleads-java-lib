/**
 * RichMediaCreativeBase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public abstract class RichMediaCreativeBase  extends com.google.api.ads.dfa.axis.v1_19.CreativeBase  implements java.io.Serializable {
    private java.lang.String actionScriptVersion;

    private java.lang.String adRequestKeys;

    private java.lang.String authoringApplication;

    private com.google.api.ads.dfa.axis.v1_19.RichMediaAsset[] childAssets;

    private java.lang.String comments;

    private com.google.api.ads.dfa.axis.v1_19.RichMediaCounterEvent[] counterEvents;

    private java.util.Calendar createdDate;

    private java.lang.String[] creativeAttributes;

    private java.lang.String customKeyValues;

    private com.google.api.ads.dfa.axis.v1_19.RichMediaExitEvent[] exitEvents;

    private boolean flashInFlash;

    private boolean interstitial;

    private java.lang.String metaData;

    private java.lang.String mode;

    private int placementHeight;

    private int placementWidth;

    private java.lang.String requiredFlashPlayerVersion;

    private java.lang.String surveyUrl;

    private java.lang.String thirdPartyBackupImageImpressionUrl;

    private java.lang.String thirdPartyClickUrl;

    private java.lang.String thirdPartyFlashImpressionUrl;

    private java.lang.String thirdPartyImpressionUrl;

    private com.google.api.ads.dfa.axis.v1_19.RichMediaTimerEvent[] timerEvent;

    private int totalFileSize;

    private java.lang.String type;

    private long videoLength;

    public RichMediaCreativeBase() {
    }

    public RichMediaCreativeBase(
           long id,
           java.lang.String name,
           boolean active,
           long advertiserId,
           boolean archived,
           com.google.api.ads.dfa.axis.v1_19.CreativeFieldAssignment[] creativeFieldAssignments,
           long sizeId,
           long typeId,
           int version,
           java.lang.String actionScriptVersion,
           java.lang.String adRequestKeys,
           java.lang.String authoringApplication,
           com.google.api.ads.dfa.axis.v1_19.RichMediaAsset[] childAssets,
           java.lang.String comments,
           com.google.api.ads.dfa.axis.v1_19.RichMediaCounterEvent[] counterEvents,
           java.util.Calendar createdDate,
           java.lang.String[] creativeAttributes,
           java.lang.String customKeyValues,
           com.google.api.ads.dfa.axis.v1_19.RichMediaExitEvent[] exitEvents,
           boolean flashInFlash,
           boolean interstitial,
           java.lang.String metaData,
           java.lang.String mode,
           int placementHeight,
           int placementWidth,
           java.lang.String requiredFlashPlayerVersion,
           java.lang.String surveyUrl,
           java.lang.String thirdPartyBackupImageImpressionUrl,
           java.lang.String thirdPartyClickUrl,
           java.lang.String thirdPartyFlashImpressionUrl,
           java.lang.String thirdPartyImpressionUrl,
           com.google.api.ads.dfa.axis.v1_19.RichMediaTimerEvent[] timerEvent,
           int totalFileSize,
           java.lang.String type,
           long videoLength) {
        super(
            id,
            name,
            active,
            advertiserId,
            archived,
            creativeFieldAssignments,
            sizeId,
            typeId,
            version);
        this.actionScriptVersion = actionScriptVersion;
        this.adRequestKeys = adRequestKeys;
        this.authoringApplication = authoringApplication;
        this.childAssets = childAssets;
        this.comments = comments;
        this.counterEvents = counterEvents;
        this.createdDate = createdDate;
        this.creativeAttributes = creativeAttributes;
        this.customKeyValues = customKeyValues;
        this.exitEvents = exitEvents;
        this.flashInFlash = flashInFlash;
        this.interstitial = interstitial;
        this.metaData = metaData;
        this.mode = mode;
        this.placementHeight = placementHeight;
        this.placementWidth = placementWidth;
        this.requiredFlashPlayerVersion = requiredFlashPlayerVersion;
        this.surveyUrl = surveyUrl;
        this.thirdPartyBackupImageImpressionUrl = thirdPartyBackupImageImpressionUrl;
        this.thirdPartyClickUrl = thirdPartyClickUrl;
        this.thirdPartyFlashImpressionUrl = thirdPartyFlashImpressionUrl;
        this.thirdPartyImpressionUrl = thirdPartyImpressionUrl;
        this.timerEvent = timerEvent;
        this.totalFileSize = totalFileSize;
        this.type = type;
        this.videoLength = videoLength;
    }


    /**
     * Gets the actionScriptVersion value for this RichMediaCreativeBase.
     * 
     * @return actionScriptVersion
     */
    public java.lang.String getActionScriptVersion() {
        return actionScriptVersion;
    }


    /**
     * Sets the actionScriptVersion value for this RichMediaCreativeBase.
     * 
     * @param actionScriptVersion
     */
    public void setActionScriptVersion(java.lang.String actionScriptVersion) {
        this.actionScriptVersion = actionScriptVersion;
    }


    /**
     * Gets the adRequestKeys value for this RichMediaCreativeBase.
     * 
     * @return adRequestKeys
     */
    public java.lang.String getAdRequestKeys() {
        return adRequestKeys;
    }


    /**
     * Sets the adRequestKeys value for this RichMediaCreativeBase.
     * 
     * @param adRequestKeys
     */
    public void setAdRequestKeys(java.lang.String adRequestKeys) {
        this.adRequestKeys = adRequestKeys;
    }


    /**
     * Gets the authoringApplication value for this RichMediaCreativeBase.
     * 
     * @return authoringApplication
     */
    public java.lang.String getAuthoringApplication() {
        return authoringApplication;
    }


    /**
     * Sets the authoringApplication value for this RichMediaCreativeBase.
     * 
     * @param authoringApplication
     */
    public void setAuthoringApplication(java.lang.String authoringApplication) {
        this.authoringApplication = authoringApplication;
    }


    /**
     * Gets the childAssets value for this RichMediaCreativeBase.
     * 
     * @return childAssets
     */
    public com.google.api.ads.dfa.axis.v1_19.RichMediaAsset[] getChildAssets() {
        return childAssets;
    }


    /**
     * Sets the childAssets value for this RichMediaCreativeBase.
     * 
     * @param childAssets
     */
    public void setChildAssets(com.google.api.ads.dfa.axis.v1_19.RichMediaAsset[] childAssets) {
        this.childAssets = childAssets;
    }


    /**
     * Gets the comments value for this RichMediaCreativeBase.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this RichMediaCreativeBase.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the counterEvents value for this RichMediaCreativeBase.
     * 
     * @return counterEvents
     */
    public com.google.api.ads.dfa.axis.v1_19.RichMediaCounterEvent[] getCounterEvents() {
        return counterEvents;
    }


    /**
     * Sets the counterEvents value for this RichMediaCreativeBase.
     * 
     * @param counterEvents
     */
    public void setCounterEvents(com.google.api.ads.dfa.axis.v1_19.RichMediaCounterEvent[] counterEvents) {
        this.counterEvents = counterEvents;
    }


    /**
     * Gets the createdDate value for this RichMediaCreativeBase.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this RichMediaCreativeBase.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the creativeAttributes value for this RichMediaCreativeBase.
     * 
     * @return creativeAttributes
     */
    public java.lang.String[] getCreativeAttributes() {
        return creativeAttributes;
    }


    /**
     * Sets the creativeAttributes value for this RichMediaCreativeBase.
     * 
     * @param creativeAttributes
     */
    public void setCreativeAttributes(java.lang.String[] creativeAttributes) {
        this.creativeAttributes = creativeAttributes;
    }


    /**
     * Gets the customKeyValues value for this RichMediaCreativeBase.
     * 
     * @return customKeyValues
     */
    public java.lang.String getCustomKeyValues() {
        return customKeyValues;
    }


    /**
     * Sets the customKeyValues value for this RichMediaCreativeBase.
     * 
     * @param customKeyValues
     */
    public void setCustomKeyValues(java.lang.String customKeyValues) {
        this.customKeyValues = customKeyValues;
    }


    /**
     * Gets the exitEvents value for this RichMediaCreativeBase.
     * 
     * @return exitEvents
     */
    public com.google.api.ads.dfa.axis.v1_19.RichMediaExitEvent[] getExitEvents() {
        return exitEvents;
    }


    /**
     * Sets the exitEvents value for this RichMediaCreativeBase.
     * 
     * @param exitEvents
     */
    public void setExitEvents(com.google.api.ads.dfa.axis.v1_19.RichMediaExitEvent[] exitEvents) {
        this.exitEvents = exitEvents;
    }


    /**
     * Gets the flashInFlash value for this RichMediaCreativeBase.
     * 
     * @return flashInFlash
     */
    public boolean isFlashInFlash() {
        return flashInFlash;
    }


    /**
     * Sets the flashInFlash value for this RichMediaCreativeBase.
     * 
     * @param flashInFlash
     */
    public void setFlashInFlash(boolean flashInFlash) {
        this.flashInFlash = flashInFlash;
    }


    /**
     * Gets the interstitial value for this RichMediaCreativeBase.
     * 
     * @return interstitial
     */
    public boolean isInterstitial() {
        return interstitial;
    }


    /**
     * Sets the interstitial value for this RichMediaCreativeBase.
     * 
     * @param interstitial
     */
    public void setInterstitial(boolean interstitial) {
        this.interstitial = interstitial;
    }


    /**
     * Gets the metaData value for this RichMediaCreativeBase.
     * 
     * @return metaData
     */
    public java.lang.String getMetaData() {
        return metaData;
    }


    /**
     * Sets the metaData value for this RichMediaCreativeBase.
     * 
     * @param metaData
     */
    public void setMetaData(java.lang.String metaData) {
        this.metaData = metaData;
    }


    /**
     * Gets the mode value for this RichMediaCreativeBase.
     * 
     * @return mode
     */
    public java.lang.String getMode() {
        return mode;
    }


    /**
     * Sets the mode value for this RichMediaCreativeBase.
     * 
     * @param mode
     */
    public void setMode(java.lang.String mode) {
        this.mode = mode;
    }


    /**
     * Gets the placementHeight value for this RichMediaCreativeBase.
     * 
     * @return placementHeight
     */
    public int getPlacementHeight() {
        return placementHeight;
    }


    /**
     * Sets the placementHeight value for this RichMediaCreativeBase.
     * 
     * @param placementHeight
     */
    public void setPlacementHeight(int placementHeight) {
        this.placementHeight = placementHeight;
    }


    /**
     * Gets the placementWidth value for this RichMediaCreativeBase.
     * 
     * @return placementWidth
     */
    public int getPlacementWidth() {
        return placementWidth;
    }


    /**
     * Sets the placementWidth value for this RichMediaCreativeBase.
     * 
     * @param placementWidth
     */
    public void setPlacementWidth(int placementWidth) {
        this.placementWidth = placementWidth;
    }


    /**
     * Gets the requiredFlashPlayerVersion value for this RichMediaCreativeBase.
     * 
     * @return requiredFlashPlayerVersion
     */
    public java.lang.String getRequiredFlashPlayerVersion() {
        return requiredFlashPlayerVersion;
    }


    /**
     * Sets the requiredFlashPlayerVersion value for this RichMediaCreativeBase.
     * 
     * @param requiredFlashPlayerVersion
     */
    public void setRequiredFlashPlayerVersion(java.lang.String requiredFlashPlayerVersion) {
        this.requiredFlashPlayerVersion = requiredFlashPlayerVersion;
    }


    /**
     * Gets the surveyUrl value for this RichMediaCreativeBase.
     * 
     * @return surveyUrl
     */
    public java.lang.String getSurveyUrl() {
        return surveyUrl;
    }


    /**
     * Sets the surveyUrl value for this RichMediaCreativeBase.
     * 
     * @param surveyUrl
     */
    public void setSurveyUrl(java.lang.String surveyUrl) {
        this.surveyUrl = surveyUrl;
    }


    /**
     * Gets the thirdPartyBackupImageImpressionUrl value for this RichMediaCreativeBase.
     * 
     * @return thirdPartyBackupImageImpressionUrl
     */
    public java.lang.String getThirdPartyBackupImageImpressionUrl() {
        return thirdPartyBackupImageImpressionUrl;
    }


    /**
     * Sets the thirdPartyBackupImageImpressionUrl value for this RichMediaCreativeBase.
     * 
     * @param thirdPartyBackupImageImpressionUrl
     */
    public void setThirdPartyBackupImageImpressionUrl(java.lang.String thirdPartyBackupImageImpressionUrl) {
        this.thirdPartyBackupImageImpressionUrl = thirdPartyBackupImageImpressionUrl;
    }


    /**
     * Gets the thirdPartyClickUrl value for this RichMediaCreativeBase.
     * 
     * @return thirdPartyClickUrl
     */
    public java.lang.String getThirdPartyClickUrl() {
        return thirdPartyClickUrl;
    }


    /**
     * Sets the thirdPartyClickUrl value for this RichMediaCreativeBase.
     * 
     * @param thirdPartyClickUrl
     */
    public void setThirdPartyClickUrl(java.lang.String thirdPartyClickUrl) {
        this.thirdPartyClickUrl = thirdPartyClickUrl;
    }


    /**
     * Gets the thirdPartyFlashImpressionUrl value for this RichMediaCreativeBase.
     * 
     * @return thirdPartyFlashImpressionUrl
     */
    public java.lang.String getThirdPartyFlashImpressionUrl() {
        return thirdPartyFlashImpressionUrl;
    }


    /**
     * Sets the thirdPartyFlashImpressionUrl value for this RichMediaCreativeBase.
     * 
     * @param thirdPartyFlashImpressionUrl
     */
    public void setThirdPartyFlashImpressionUrl(java.lang.String thirdPartyFlashImpressionUrl) {
        this.thirdPartyFlashImpressionUrl = thirdPartyFlashImpressionUrl;
    }


    /**
     * Gets the thirdPartyImpressionUrl value for this RichMediaCreativeBase.
     * 
     * @return thirdPartyImpressionUrl
     */
    public java.lang.String getThirdPartyImpressionUrl() {
        return thirdPartyImpressionUrl;
    }


    /**
     * Sets the thirdPartyImpressionUrl value for this RichMediaCreativeBase.
     * 
     * @param thirdPartyImpressionUrl
     */
    public void setThirdPartyImpressionUrl(java.lang.String thirdPartyImpressionUrl) {
        this.thirdPartyImpressionUrl = thirdPartyImpressionUrl;
    }


    /**
     * Gets the timerEvent value for this RichMediaCreativeBase.
     * 
     * @return timerEvent
     */
    public com.google.api.ads.dfa.axis.v1_19.RichMediaTimerEvent[] getTimerEvent() {
        return timerEvent;
    }


    /**
     * Sets the timerEvent value for this RichMediaCreativeBase.
     * 
     * @param timerEvent
     */
    public void setTimerEvent(com.google.api.ads.dfa.axis.v1_19.RichMediaTimerEvent[] timerEvent) {
        this.timerEvent = timerEvent;
    }


    /**
     * Gets the totalFileSize value for this RichMediaCreativeBase.
     * 
     * @return totalFileSize
     */
    public int getTotalFileSize() {
        return totalFileSize;
    }


    /**
     * Sets the totalFileSize value for this RichMediaCreativeBase.
     * 
     * @param totalFileSize
     */
    public void setTotalFileSize(int totalFileSize) {
        this.totalFileSize = totalFileSize;
    }


    /**
     * Gets the type value for this RichMediaCreativeBase.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this RichMediaCreativeBase.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the videoLength value for this RichMediaCreativeBase.
     * 
     * @return videoLength
     */
    public long getVideoLength() {
        return videoLength;
    }


    /**
     * Sets the videoLength value for this RichMediaCreativeBase.
     * 
     * @param videoLength
     */
    public void setVideoLength(long videoLength) {
        this.videoLength = videoLength;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RichMediaCreativeBase)) return false;
        RichMediaCreativeBase other = (RichMediaCreativeBase) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.actionScriptVersion==null && other.getActionScriptVersion()==null) || 
             (this.actionScriptVersion!=null &&
              this.actionScriptVersion.equals(other.getActionScriptVersion()))) &&
            ((this.adRequestKeys==null && other.getAdRequestKeys()==null) || 
             (this.adRequestKeys!=null &&
              this.adRequestKeys.equals(other.getAdRequestKeys()))) &&
            ((this.authoringApplication==null && other.getAuthoringApplication()==null) || 
             (this.authoringApplication!=null &&
              this.authoringApplication.equals(other.getAuthoringApplication()))) &&
            ((this.childAssets==null && other.getChildAssets()==null) || 
             (this.childAssets!=null &&
              java.util.Arrays.equals(this.childAssets, other.getChildAssets()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.counterEvents==null && other.getCounterEvents()==null) || 
             (this.counterEvents!=null &&
              java.util.Arrays.equals(this.counterEvents, other.getCounterEvents()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.creativeAttributes==null && other.getCreativeAttributes()==null) || 
             (this.creativeAttributes!=null &&
              java.util.Arrays.equals(this.creativeAttributes, other.getCreativeAttributes()))) &&
            ((this.customKeyValues==null && other.getCustomKeyValues()==null) || 
             (this.customKeyValues!=null &&
              this.customKeyValues.equals(other.getCustomKeyValues()))) &&
            ((this.exitEvents==null && other.getExitEvents()==null) || 
             (this.exitEvents!=null &&
              java.util.Arrays.equals(this.exitEvents, other.getExitEvents()))) &&
            this.flashInFlash == other.isFlashInFlash() &&
            this.interstitial == other.isInterstitial() &&
            ((this.metaData==null && other.getMetaData()==null) || 
             (this.metaData!=null &&
              this.metaData.equals(other.getMetaData()))) &&
            ((this.mode==null && other.getMode()==null) || 
             (this.mode!=null &&
              this.mode.equals(other.getMode()))) &&
            this.placementHeight == other.getPlacementHeight() &&
            this.placementWidth == other.getPlacementWidth() &&
            ((this.requiredFlashPlayerVersion==null && other.getRequiredFlashPlayerVersion()==null) || 
             (this.requiredFlashPlayerVersion!=null &&
              this.requiredFlashPlayerVersion.equals(other.getRequiredFlashPlayerVersion()))) &&
            ((this.surveyUrl==null && other.getSurveyUrl()==null) || 
             (this.surveyUrl!=null &&
              this.surveyUrl.equals(other.getSurveyUrl()))) &&
            ((this.thirdPartyBackupImageImpressionUrl==null && other.getThirdPartyBackupImageImpressionUrl()==null) || 
             (this.thirdPartyBackupImageImpressionUrl!=null &&
              this.thirdPartyBackupImageImpressionUrl.equals(other.getThirdPartyBackupImageImpressionUrl()))) &&
            ((this.thirdPartyClickUrl==null && other.getThirdPartyClickUrl()==null) || 
             (this.thirdPartyClickUrl!=null &&
              this.thirdPartyClickUrl.equals(other.getThirdPartyClickUrl()))) &&
            ((this.thirdPartyFlashImpressionUrl==null && other.getThirdPartyFlashImpressionUrl()==null) || 
             (this.thirdPartyFlashImpressionUrl!=null &&
              this.thirdPartyFlashImpressionUrl.equals(other.getThirdPartyFlashImpressionUrl()))) &&
            ((this.thirdPartyImpressionUrl==null && other.getThirdPartyImpressionUrl()==null) || 
             (this.thirdPartyImpressionUrl!=null &&
              this.thirdPartyImpressionUrl.equals(other.getThirdPartyImpressionUrl()))) &&
            ((this.timerEvent==null && other.getTimerEvent()==null) || 
             (this.timerEvent!=null &&
              java.util.Arrays.equals(this.timerEvent, other.getTimerEvent()))) &&
            this.totalFileSize == other.getTotalFileSize() &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            this.videoLength == other.getVideoLength();
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
        if (getActionScriptVersion() != null) {
            _hashCode += getActionScriptVersion().hashCode();
        }
        if (getAdRequestKeys() != null) {
            _hashCode += getAdRequestKeys().hashCode();
        }
        if (getAuthoringApplication() != null) {
            _hashCode += getAuthoringApplication().hashCode();
        }
        if (getChildAssets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChildAssets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChildAssets(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getCounterEvents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCounterEvents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCounterEvents(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getCreativeAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreativeAttributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreativeAttributes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomKeyValues() != null) {
            _hashCode += getCustomKeyValues().hashCode();
        }
        if (getExitEvents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExitEvents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExitEvents(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isFlashInFlash() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isInterstitial() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMetaData() != null) {
            _hashCode += getMetaData().hashCode();
        }
        if (getMode() != null) {
            _hashCode += getMode().hashCode();
        }
        _hashCode += getPlacementHeight();
        _hashCode += getPlacementWidth();
        if (getRequiredFlashPlayerVersion() != null) {
            _hashCode += getRequiredFlashPlayerVersion().hashCode();
        }
        if (getSurveyUrl() != null) {
            _hashCode += getSurveyUrl().hashCode();
        }
        if (getThirdPartyBackupImageImpressionUrl() != null) {
            _hashCode += getThirdPartyBackupImageImpressionUrl().hashCode();
        }
        if (getThirdPartyClickUrl() != null) {
            _hashCode += getThirdPartyClickUrl().hashCode();
        }
        if (getThirdPartyFlashImpressionUrl() != null) {
            _hashCode += getThirdPartyFlashImpressionUrl().hashCode();
        }
        if (getThirdPartyImpressionUrl() != null) {
            _hashCode += getThirdPartyImpressionUrl().hashCode();
        }
        if (getTimerEvent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTimerEvent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTimerEvent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getTotalFileSize();
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        _hashCode += new Long(getVideoLength()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RichMediaCreativeBase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "RichMediaCreativeBase"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionScriptVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionScriptVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adRequestKeys");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adRequestKeys"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authoringApplication");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authoringApplication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childAssets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "childAssets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "RichMediaAsset"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("counterEvents");
        elemField.setXmlName(new javax.xml.namespace.QName("", "counterEvents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "RichMediaCounterEvent"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creativeAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customKeyValues");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customKeyValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exitEvents");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exitEvents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "RichMediaExitEvent"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flashInFlash");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flashInFlash"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interstitial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "interstitial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metaData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "metaData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placementHeight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "placementHeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placementWidth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "placementWidth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requiredFlashPlayerVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requiredFlashPlayerVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surveyUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "surveyUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyBackupImageImpressionUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "thirdPartyBackupImageImpressionUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyClickUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "thirdPartyClickUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyFlashImpressionUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "thirdPartyFlashImpressionUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyImpressionUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "thirdPartyImpressionUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timerEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timerEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "RichMediaTimerEvent"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalFileSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalFileSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "videoLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
