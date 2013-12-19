/**
 * FloatingFlashCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201208;


/**
 * A floating flash creative. This creative is an interstitial creative,
 * and its {@link #size} must be 1x1.
 *             <p>
 *             This creative will not work with iframe ad tags.
 *             <p>
 *             This creative is only available to small business networks.
 * 
 *             Starting in version v201306 this will be returned as a
 * {@link TemplateCreative}
 *             identified with a {@link TemplateCreative#creativeTemplateId}
 * of {@code 10000560}.
 */
public class FloatingFlashCreative  extends com.google.api.ads.dfp.axis.v201208.HasDestinationUrlCreative  implements java.io.Serializable {
    /* The file name of the Flash asset. This attribute is required
     * when
     *                     creating a new asset (e.g. when flashByteArray
     * is not null). */
    private java.lang.String flashName;

    /* The content of the Flash asset as a byte array. This attribute
     * is required when
     *                     creating a new {@code FloatingFlashCreative}.
     *                     <p/>
     *                     When updating the content, pass a new byte array,
     * and set {@link flashAssetId} to
     *                     null. Otherwise, this field can be null and will
     * not be updated.
     *                     <p/>
     *                     The {@link flashByteArray} will be {@code null}
     * when the
     *                     {@code FloatingFlashCreative} is retrieved. */
    private byte[] flashByteArray;

    /* The ID of the Flash asset. This attribute is read-only and
     * is populated by Google. */
    private java.lang.Long flashAssetId;

    /* The file name of the fallback image asset. This attribute is
     * required when
     *                     creating a new asset (e.g. when fallbackImageByteArray
     * is not null). */
    private java.lang.String fallbackImageName;

    /* The content of the fallback image asset as a byte array. This
     * attribute is required when
     *                     creating a new {@code FloatingFlashCreative}.
     *                     <p/>
     *                     When updating the content, pass a new byte array,
     * and set {@link fallbackImageAssetId} to
     *                     null. Otherwise, this field can be null and will
     * not be updated.
     *                     <p/>
     *                     The {@link fallbackImageByteArray} will be {@code
     * null} when the
     *                     {@code FloatingFlashCreative} is retrieved. */
    private byte[] fallbackImageByteArray;

    /* The ID of the fallback image asset. This attribute is read-only
     * and is populated by Google. */
    private java.lang.Long fallbackImageAssetId;

    /* The minimum version of Flash player required to properly display
     * the flash file.
     *                     This attribute is optional and defaults to 8. */
    private java.lang.Integer requiredFlashVersion;

    /* The width of the Flash in pixels when this creative is shown.
     * This attribute is required. */
    private java.lang.Integer width;

    /* The height of the Flash in pixels when this creative is shown.
     * This attribute is required. */
    private java.lang.Integer height;

    /* The position of the creative, in pixels, from the top edge
     * of your web page (e.g. "100"),
     *                     or "centered" to center the creative. This attribute
     * is optional and defaults to "centered". */
    private java.lang.String topPosition;

    /* The position of the creative, in pixels, from the left edge
     * of your web page (e.g. "100"),
     *                     or "centered" to center the creative. This attribute
     * is optional and defaults to "centered". */
    private java.lang.String leftPosition;

    /* Indicates how long the creative should remain visible, in seconds.
     * This attribute is
     *                     optional and defaults to 60 seconds. */
    private java.lang.Integer displayTimeInSecond;

    /* Third party impression tracking URL. This URL can call an image
     * or HTML code.
     *                     This attribute is optional. */
    private java.lang.String thirdPartyImpressionTracker;

    public FloatingFlashCreative() {
    }

    public FloatingFlashCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201208.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.dfp.axis.v201208.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.axis.v201208.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.axis.v201208.BaseCustomFieldValue[] customFieldValues,
           java.lang.String creativeType,
           java.lang.String destinationUrl,
           java.lang.String flashName,
           byte[] flashByteArray,
           java.lang.Long flashAssetId,
           java.lang.String fallbackImageName,
           byte[] fallbackImageByteArray,
           java.lang.Long fallbackImageAssetId,
           java.lang.Integer requiredFlashVersion,
           java.lang.Integer width,
           java.lang.Integer height,
           java.lang.String topPosition,
           java.lang.String leftPosition,
           java.lang.Integer displayTimeInSecond,
           java.lang.String thirdPartyImpressionTracker) {
        super(
            advertiserId,
            id,
            name,
            size,
            previewUrl,
            appliedLabels,
            lastModifiedDateTime,
            customFieldValues,
            creativeType,
            destinationUrl);
        this.flashName = flashName;
        this.flashByteArray = flashByteArray;
        this.flashAssetId = flashAssetId;
        this.fallbackImageName = fallbackImageName;
        this.fallbackImageByteArray = fallbackImageByteArray;
        this.fallbackImageAssetId = fallbackImageAssetId;
        this.requiredFlashVersion = requiredFlashVersion;
        this.width = width;
        this.height = height;
        this.topPosition = topPosition;
        this.leftPosition = leftPosition;
        this.displayTimeInSecond = displayTimeInSecond;
        this.thirdPartyImpressionTracker = thirdPartyImpressionTracker;
    }


    /**
     * Gets the flashName value for this FloatingFlashCreative.
     * 
     * @return flashName   * The file name of the Flash asset. This attribute is required
     * when
     *                     creating a new asset (e.g. when flashByteArray
     * is not null).
     */
    public java.lang.String getFlashName() {
        return flashName;
    }


    /**
     * Sets the flashName value for this FloatingFlashCreative.
     * 
     * @param flashName   * The file name of the Flash asset. This attribute is required
     * when
     *                     creating a new asset (e.g. when flashByteArray
     * is not null).
     */
    public void setFlashName(java.lang.String flashName) {
        this.flashName = flashName;
    }


    /**
     * Gets the flashByteArray value for this FloatingFlashCreative.
     * 
     * @return flashByteArray   * The content of the Flash asset as a byte array. This attribute
     * is required when
     *                     creating a new {@code FloatingFlashCreative}.
     *                     <p/>
     *                     When updating the content, pass a new byte array,
     * and set {@link flashAssetId} to
     *                     null. Otherwise, this field can be null and will
     * not be updated.
     *                     <p/>
     *                     The {@link flashByteArray} will be {@code null}
     * when the
     *                     {@code FloatingFlashCreative} is retrieved.
     */
    public byte[] getFlashByteArray() {
        return flashByteArray;
    }


    /**
     * Sets the flashByteArray value for this FloatingFlashCreative.
     * 
     * @param flashByteArray   * The content of the Flash asset as a byte array. This attribute
     * is required when
     *                     creating a new {@code FloatingFlashCreative}.
     *                     <p/>
     *                     When updating the content, pass a new byte array,
     * and set {@link flashAssetId} to
     *                     null. Otherwise, this field can be null and will
     * not be updated.
     *                     <p/>
     *                     The {@link flashByteArray} will be {@code null}
     * when the
     *                     {@code FloatingFlashCreative} is retrieved.
     */
    public void setFlashByteArray(byte[] flashByteArray) {
        this.flashByteArray = flashByteArray;
    }


    /**
     * Gets the flashAssetId value for this FloatingFlashCreative.
     * 
     * @return flashAssetId   * The ID of the Flash asset. This attribute is read-only and
     * is populated by Google.
     */
    public java.lang.Long getFlashAssetId() {
        return flashAssetId;
    }


    /**
     * Sets the flashAssetId value for this FloatingFlashCreative.
     * 
     * @param flashAssetId   * The ID of the Flash asset. This attribute is read-only and
     * is populated by Google.
     */
    public void setFlashAssetId(java.lang.Long flashAssetId) {
        this.flashAssetId = flashAssetId;
    }


    /**
     * Gets the fallbackImageName value for this FloatingFlashCreative.
     * 
     * @return fallbackImageName   * The file name of the fallback image asset. This attribute is
     * required when
     *                     creating a new asset (e.g. when fallbackImageByteArray
     * is not null).
     */
    public java.lang.String getFallbackImageName() {
        return fallbackImageName;
    }


    /**
     * Sets the fallbackImageName value for this FloatingFlashCreative.
     * 
     * @param fallbackImageName   * The file name of the fallback image asset. This attribute is
     * required when
     *                     creating a new asset (e.g. when fallbackImageByteArray
     * is not null).
     */
    public void setFallbackImageName(java.lang.String fallbackImageName) {
        this.fallbackImageName = fallbackImageName;
    }


    /**
     * Gets the fallbackImageByteArray value for this FloatingFlashCreative.
     * 
     * @return fallbackImageByteArray   * The content of the fallback image asset as a byte array. This
     * attribute is required when
     *                     creating a new {@code FloatingFlashCreative}.
     *                     <p/>
     *                     When updating the content, pass a new byte array,
     * and set {@link fallbackImageAssetId} to
     *                     null. Otherwise, this field can be null and will
     * not be updated.
     *                     <p/>
     *                     The {@link fallbackImageByteArray} will be {@code
     * null} when the
     *                     {@code FloatingFlashCreative} is retrieved.
     */
    public byte[] getFallbackImageByteArray() {
        return fallbackImageByteArray;
    }


    /**
     * Sets the fallbackImageByteArray value for this FloatingFlashCreative.
     * 
     * @param fallbackImageByteArray   * The content of the fallback image asset as a byte array. This
     * attribute is required when
     *                     creating a new {@code FloatingFlashCreative}.
     *                     <p/>
     *                     When updating the content, pass a new byte array,
     * and set {@link fallbackImageAssetId} to
     *                     null. Otherwise, this field can be null and will
     * not be updated.
     *                     <p/>
     *                     The {@link fallbackImageByteArray} will be {@code
     * null} when the
     *                     {@code FloatingFlashCreative} is retrieved.
     */
    public void setFallbackImageByteArray(byte[] fallbackImageByteArray) {
        this.fallbackImageByteArray = fallbackImageByteArray;
    }


    /**
     * Gets the fallbackImageAssetId value for this FloatingFlashCreative.
     * 
     * @return fallbackImageAssetId   * The ID of the fallback image asset. This attribute is read-only
     * and is populated by Google.
     */
    public java.lang.Long getFallbackImageAssetId() {
        return fallbackImageAssetId;
    }


    /**
     * Sets the fallbackImageAssetId value for this FloatingFlashCreative.
     * 
     * @param fallbackImageAssetId   * The ID of the fallback image asset. This attribute is read-only
     * and is populated by Google.
     */
    public void setFallbackImageAssetId(java.lang.Long fallbackImageAssetId) {
        this.fallbackImageAssetId = fallbackImageAssetId;
    }


    /**
     * Gets the requiredFlashVersion value for this FloatingFlashCreative.
     * 
     * @return requiredFlashVersion   * The minimum version of Flash player required to properly display
     * the flash file.
     *                     This attribute is optional and defaults to 8.
     */
    public java.lang.Integer getRequiredFlashVersion() {
        return requiredFlashVersion;
    }


    /**
     * Sets the requiredFlashVersion value for this FloatingFlashCreative.
     * 
     * @param requiredFlashVersion   * The minimum version of Flash player required to properly display
     * the flash file.
     *                     This attribute is optional and defaults to 8.
     */
    public void setRequiredFlashVersion(java.lang.Integer requiredFlashVersion) {
        this.requiredFlashVersion = requiredFlashVersion;
    }


    /**
     * Gets the width value for this FloatingFlashCreative.
     * 
     * @return width   * The width of the Flash in pixels when this creative is shown.
     * This attribute is required.
     */
    public java.lang.Integer getWidth() {
        return width;
    }


    /**
     * Sets the width value for this FloatingFlashCreative.
     * 
     * @param width   * The width of the Flash in pixels when this creative is shown.
     * This attribute is required.
     */
    public void setWidth(java.lang.Integer width) {
        this.width = width;
    }


    /**
     * Gets the height value for this FloatingFlashCreative.
     * 
     * @return height   * The height of the Flash in pixels when this creative is shown.
     * This attribute is required.
     */
    public java.lang.Integer getHeight() {
        return height;
    }


    /**
     * Sets the height value for this FloatingFlashCreative.
     * 
     * @param height   * The height of the Flash in pixels when this creative is shown.
     * This attribute is required.
     */
    public void setHeight(java.lang.Integer height) {
        this.height = height;
    }


    /**
     * Gets the topPosition value for this FloatingFlashCreative.
     * 
     * @return topPosition   * The position of the creative, in pixels, from the top edge
     * of your web page (e.g. "100"),
     *                     or "centered" to center the creative. This attribute
     * is optional and defaults to "centered".
     */
    public java.lang.String getTopPosition() {
        return topPosition;
    }


    /**
     * Sets the topPosition value for this FloatingFlashCreative.
     * 
     * @param topPosition   * The position of the creative, in pixels, from the top edge
     * of your web page (e.g. "100"),
     *                     or "centered" to center the creative. This attribute
     * is optional and defaults to "centered".
     */
    public void setTopPosition(java.lang.String topPosition) {
        this.topPosition = topPosition;
    }


    /**
     * Gets the leftPosition value for this FloatingFlashCreative.
     * 
     * @return leftPosition   * The position of the creative, in pixels, from the left edge
     * of your web page (e.g. "100"),
     *                     or "centered" to center the creative. This attribute
     * is optional and defaults to "centered".
     */
    public java.lang.String getLeftPosition() {
        return leftPosition;
    }


    /**
     * Sets the leftPosition value for this FloatingFlashCreative.
     * 
     * @param leftPosition   * The position of the creative, in pixels, from the left edge
     * of your web page (e.g. "100"),
     *                     or "centered" to center the creative. This attribute
     * is optional and defaults to "centered".
     */
    public void setLeftPosition(java.lang.String leftPosition) {
        this.leftPosition = leftPosition;
    }


    /**
     * Gets the displayTimeInSecond value for this FloatingFlashCreative.
     * 
     * @return displayTimeInSecond   * Indicates how long the creative should remain visible, in seconds.
     * This attribute is
     *                     optional and defaults to 60 seconds.
     */
    public java.lang.Integer getDisplayTimeInSecond() {
        return displayTimeInSecond;
    }


    /**
     * Sets the displayTimeInSecond value for this FloatingFlashCreative.
     * 
     * @param displayTimeInSecond   * Indicates how long the creative should remain visible, in seconds.
     * This attribute is
     *                     optional and defaults to 60 seconds.
     */
    public void setDisplayTimeInSecond(java.lang.Integer displayTimeInSecond) {
        this.displayTimeInSecond = displayTimeInSecond;
    }


    /**
     * Gets the thirdPartyImpressionTracker value for this FloatingFlashCreative.
     * 
     * @return thirdPartyImpressionTracker   * Third party impression tracking URL. This URL can call an image
     * or HTML code.
     *                     This attribute is optional.
     */
    public java.lang.String getThirdPartyImpressionTracker() {
        return thirdPartyImpressionTracker;
    }


    /**
     * Sets the thirdPartyImpressionTracker value for this FloatingFlashCreative.
     * 
     * @param thirdPartyImpressionTracker   * Third party impression tracking URL. This URL can call an image
     * or HTML code.
     *                     This attribute is optional.
     */
    public void setThirdPartyImpressionTracker(java.lang.String thirdPartyImpressionTracker) {
        this.thirdPartyImpressionTracker = thirdPartyImpressionTracker;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FloatingFlashCreative)) return false;
        FloatingFlashCreative other = (FloatingFlashCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.flashName==null && other.getFlashName()==null) || 
             (this.flashName!=null &&
              this.flashName.equals(other.getFlashName()))) &&
            ((this.flashByteArray==null && other.getFlashByteArray()==null) || 
             (this.flashByteArray!=null &&
              java.util.Arrays.equals(this.flashByteArray, other.getFlashByteArray()))) &&
            ((this.flashAssetId==null && other.getFlashAssetId()==null) || 
             (this.flashAssetId!=null &&
              this.flashAssetId.equals(other.getFlashAssetId()))) &&
            ((this.fallbackImageName==null && other.getFallbackImageName()==null) || 
             (this.fallbackImageName!=null &&
              this.fallbackImageName.equals(other.getFallbackImageName()))) &&
            ((this.fallbackImageByteArray==null && other.getFallbackImageByteArray()==null) || 
             (this.fallbackImageByteArray!=null &&
              java.util.Arrays.equals(this.fallbackImageByteArray, other.getFallbackImageByteArray()))) &&
            ((this.fallbackImageAssetId==null && other.getFallbackImageAssetId()==null) || 
             (this.fallbackImageAssetId!=null &&
              this.fallbackImageAssetId.equals(other.getFallbackImageAssetId()))) &&
            ((this.requiredFlashVersion==null && other.getRequiredFlashVersion()==null) || 
             (this.requiredFlashVersion!=null &&
              this.requiredFlashVersion.equals(other.getRequiredFlashVersion()))) &&
            ((this.width==null && other.getWidth()==null) || 
             (this.width!=null &&
              this.width.equals(other.getWidth()))) &&
            ((this.height==null && other.getHeight()==null) || 
             (this.height!=null &&
              this.height.equals(other.getHeight()))) &&
            ((this.topPosition==null && other.getTopPosition()==null) || 
             (this.topPosition!=null &&
              this.topPosition.equals(other.getTopPosition()))) &&
            ((this.leftPosition==null && other.getLeftPosition()==null) || 
             (this.leftPosition!=null &&
              this.leftPosition.equals(other.getLeftPosition()))) &&
            ((this.displayTimeInSecond==null && other.getDisplayTimeInSecond()==null) || 
             (this.displayTimeInSecond!=null &&
              this.displayTimeInSecond.equals(other.getDisplayTimeInSecond()))) &&
            ((this.thirdPartyImpressionTracker==null && other.getThirdPartyImpressionTracker()==null) || 
             (this.thirdPartyImpressionTracker!=null &&
              this.thirdPartyImpressionTracker.equals(other.getThirdPartyImpressionTracker())));
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
        if (getFlashName() != null) {
            _hashCode += getFlashName().hashCode();
        }
        if (getFlashByteArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFlashByteArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFlashByteArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFlashAssetId() != null) {
            _hashCode += getFlashAssetId().hashCode();
        }
        if (getFallbackImageName() != null) {
            _hashCode += getFallbackImageName().hashCode();
        }
        if (getFallbackImageByteArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFallbackImageByteArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFallbackImageByteArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFallbackImageAssetId() != null) {
            _hashCode += getFallbackImageAssetId().hashCode();
        }
        if (getRequiredFlashVersion() != null) {
            _hashCode += getRequiredFlashVersion().hashCode();
        }
        if (getWidth() != null) {
            _hashCode += getWidth().hashCode();
        }
        if (getHeight() != null) {
            _hashCode += getHeight().hashCode();
        }
        if (getTopPosition() != null) {
            _hashCode += getTopPosition().hashCode();
        }
        if (getLeftPosition() != null) {
            _hashCode += getLeftPosition().hashCode();
        }
        if (getDisplayTimeInSecond() != null) {
            _hashCode += getDisplayTimeInSecond().hashCode();
        }
        if (getThirdPartyImpressionTracker() != null) {
            _hashCode += getThirdPartyImpressionTracker().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FloatingFlashCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "FloatingFlashCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flashName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "flashName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flashByteArray");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "flashByteArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flashAssetId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "flashAssetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fallbackImageName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "fallbackImageName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fallbackImageByteArray");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "fallbackImageByteArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fallbackImageAssetId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "fallbackImageAssetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requiredFlashVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "requiredFlashVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("width");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "width"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("height");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "height"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "topPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leftPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "leftPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayTimeInSecond");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "displayTimeInSecond"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyImpressionTracker");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "thirdPartyImpressionTracker"));
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
