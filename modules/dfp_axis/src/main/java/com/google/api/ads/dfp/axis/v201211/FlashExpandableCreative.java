/**
 * FlashExpandableCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201211;


/**
 * An expandable {@code Creative} where the collapsed size is a Flash
 * SWF file and
 *             the expanded size is another Flash SWF file. If Flash
 * isn't supported in the browser,
 *             the fallback image will be used.
 *             <p>
 *             This creative will not work with iframe ad tags.
 *             <p>
 *             This creative is only available to small business networks.
 * 
 *             Starting in version v201306 this will be returned as a
 * {@link TemplateCreative}
 *             identified with a {@link TemplateCreative#creativeTemplateId}
 * of {@code 10001160}.
 */
public class FlashExpandableCreative  extends com.google.api.ads.dfp.axis.v201211.HasDestinationUrlCreative  implements java.io.Serializable {
    /* The ID of the collapsed Flash asset. This attribute is read-only
     * and is populated by Google. */
    private java.lang.Long collapsedFlashAssetId;

    /* The content of the collapsed Flash asset as a byte array. This
     * attribute is required when
     *                     creating a new {@code FlashExpandableCreative}.
     * <p/>
     *                     When updating the content, pass a new byte array,
     * and set {@link collapsedFlashAssetId} to
     *                     null. Otherwise, this field can be null and will
     * not be updated.
     *                     <p/>
     *                     The {@link collapsedFlashAssetByteArray} will
     * be {@code null} when the
     *                     {@code FlashExpandableCreative} is retrieved. */
    private byte[] collapsedFlashAssetByteArray;

    /* The file name of the collapsed Flash asset. This attribute
     * is required when
     *                     creating a new asset (e.g. when collapsedFlashAssetByteArray
     * is not null). */
    private java.lang.String collapsedFlashFileName;

    /* The ID of the fallback image asset. This attribute is read-only
     * and is populated by Google. */
    private java.lang.Long collapsedFallbackImageAssetId;

    /* The content of the collapsed fallback image as a byte array.
     * This attribute is required when
     *                     creating a new {@code FlashExpandableCreative}.
     * <p/>
     *                     When updating the content, pass a new byte array,
     * and set {@link collapsedFallbackImageAssetId}
     *                     to null. Otherwise, this field can be null and
     * will not be updated.
     *                     <p/>
     *                     The {@link collapsedFallbackImageAssetByteArray}
     * will be {@code null} when the
     *                     {@code FlashExpandableCreative} is retrieved. */
    private byte[] collapsedFallbackImageAssetByteArray;

    /* The file name of the collapse fallback image asset. This attribute
     * is required when
     *                     creating a new asset (e.g. when collapsedFallbackImageAssetByteArray
     * is not null). */
    private java.lang.String collapsedFallbackImageFileName;

    /* The ID of the expanded Flash asset. This attribute is read-only
     * and is populated by Google. */
    private java.lang.Long expandedFlashAssetId;

    /* The content of the expanded Flash as a byte array. This attribute
     * is required when
     *                     creating a new {@code FlashExpandableCreative}.
     * <p/>
     *                     When updating the content, pass a new byte array,
     * and set {@code collapsedFallbackImageAssetId}
     *                     to null. Otherwise, this field can be null and
     * will not be updated.
     *                     <p/>
     *                     The {@code expandedFlashAssetByteArray} will be
     * {@code null} when the
     *                     {@code FlashExpandableCreative} is retrieved. */
    private byte[] expandedFlashAssetByteArray;

    /* The file name of the expanded Flash asset. This attribute is
     * required when
     *                     creating a new asset (e.g. when expandedFlashAssetByteArray
     * is not null). */
    private java.lang.String expandedFlashFileName;

    /* The minimum version of Flash player required to properly display
     * the flash file.
     *                     This attribute is optional and defaults to 8. */
    private java.lang.Integer requiredFlashVersion;

    /* The collapsed width of the creative in pixels. This attribute
     * is required. */
    private java.lang.Integer collapsedWidth;

    /* The collapsed height of the creative in pixels. This attribute
     * is required. */
    private java.lang.Integer collapsedHeight;

    /* The expanded width of the creative in pixels. This attribute
     * is required. */
    private java.lang.Integer expandedWidth;

    /* The expanded height of the creative in pixels. This attribute
     * is required. */
    private java.lang.Integer expandedHeight;

    /* The direction in which the creative will expand. This attribute
     * is required. */
    private com.google.api.ads.dfp.axis.v201211.FlashExpandableCreativeExpandDirection expandDirection;

    /* Whether or not the creative should expand when the mouse moves
     * over the collapsed state.
     *                     This attribute is optional and defaults to {@code
     * true}. */
    private java.lang.Boolean expandOnMouseOver;

    /* The name of javascript function needed in the SWF code to expand
     * creative if
     *                     the expandOnMouseOver is false. This attribute
     * is optional and defaults to "dclk_show()". */
    private java.lang.String javascriptFunctionForExpand;

    /* Whether or not the creative should collapse when the mouse
     * moves off the expanded state.
     *                     This attribute is optional and defaults to {@code
     * true}. */
    private java.lang.Boolean collapseOnMouseOut;

    /* The name of javascript function needed in the SWF code to collapse
     * creative if
     *                     the collapseOnMouseOut is false. This attribute
     * is optional and defaults to "dclk_hide()". */
    private java.lang.String javascriptFunctionForCollapse;

    public FlashExpandableCreative() {
    }

    public FlashExpandableCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201211.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.dfp.axis.v201211.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.axis.v201211.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.axis.v201211.BaseCustomFieldValue[] customFieldValues,
           java.lang.String creativeType,
           java.lang.String destinationUrl,
           java.lang.Long collapsedFlashAssetId,
           byte[] collapsedFlashAssetByteArray,
           java.lang.String collapsedFlashFileName,
           java.lang.Long collapsedFallbackImageAssetId,
           byte[] collapsedFallbackImageAssetByteArray,
           java.lang.String collapsedFallbackImageFileName,
           java.lang.Long expandedFlashAssetId,
           byte[] expandedFlashAssetByteArray,
           java.lang.String expandedFlashFileName,
           java.lang.Integer requiredFlashVersion,
           java.lang.Integer collapsedWidth,
           java.lang.Integer collapsedHeight,
           java.lang.Integer expandedWidth,
           java.lang.Integer expandedHeight,
           com.google.api.ads.dfp.axis.v201211.FlashExpandableCreativeExpandDirection expandDirection,
           java.lang.Boolean expandOnMouseOver,
           java.lang.String javascriptFunctionForExpand,
           java.lang.Boolean collapseOnMouseOut,
           java.lang.String javascriptFunctionForCollapse) {
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
        this.collapsedFlashAssetId = collapsedFlashAssetId;
        this.collapsedFlashAssetByteArray = collapsedFlashAssetByteArray;
        this.collapsedFlashFileName = collapsedFlashFileName;
        this.collapsedFallbackImageAssetId = collapsedFallbackImageAssetId;
        this.collapsedFallbackImageAssetByteArray = collapsedFallbackImageAssetByteArray;
        this.collapsedFallbackImageFileName = collapsedFallbackImageFileName;
        this.expandedFlashAssetId = expandedFlashAssetId;
        this.expandedFlashAssetByteArray = expandedFlashAssetByteArray;
        this.expandedFlashFileName = expandedFlashFileName;
        this.requiredFlashVersion = requiredFlashVersion;
        this.collapsedWidth = collapsedWidth;
        this.collapsedHeight = collapsedHeight;
        this.expandedWidth = expandedWidth;
        this.expandedHeight = expandedHeight;
        this.expandDirection = expandDirection;
        this.expandOnMouseOver = expandOnMouseOver;
        this.javascriptFunctionForExpand = javascriptFunctionForExpand;
        this.collapseOnMouseOut = collapseOnMouseOut;
        this.javascriptFunctionForCollapse = javascriptFunctionForCollapse;
    }


    /**
     * Gets the collapsedFlashAssetId value for this FlashExpandableCreative.
     * 
     * @return collapsedFlashAssetId   * The ID of the collapsed Flash asset. This attribute is read-only
     * and is populated by Google.
     */
    public java.lang.Long getCollapsedFlashAssetId() {
        return collapsedFlashAssetId;
    }


    /**
     * Sets the collapsedFlashAssetId value for this FlashExpandableCreative.
     * 
     * @param collapsedFlashAssetId   * The ID of the collapsed Flash asset. This attribute is read-only
     * and is populated by Google.
     */
    public void setCollapsedFlashAssetId(java.lang.Long collapsedFlashAssetId) {
        this.collapsedFlashAssetId = collapsedFlashAssetId;
    }


    /**
     * Gets the collapsedFlashAssetByteArray value for this FlashExpandableCreative.
     * 
     * @return collapsedFlashAssetByteArray   * The content of the collapsed Flash asset as a byte array. This
     * attribute is required when
     *                     creating a new {@code FlashExpandableCreative}.
     * <p/>
     *                     When updating the content, pass a new byte array,
     * and set {@link collapsedFlashAssetId} to
     *                     null. Otherwise, this field can be null and will
     * not be updated.
     *                     <p/>
     *                     The {@link collapsedFlashAssetByteArray} will
     * be {@code null} when the
     *                     {@code FlashExpandableCreative} is retrieved.
     */
    public byte[] getCollapsedFlashAssetByteArray() {
        return collapsedFlashAssetByteArray;
    }


    /**
     * Sets the collapsedFlashAssetByteArray value for this FlashExpandableCreative.
     * 
     * @param collapsedFlashAssetByteArray   * The content of the collapsed Flash asset as a byte array. This
     * attribute is required when
     *                     creating a new {@code FlashExpandableCreative}.
     * <p/>
     *                     When updating the content, pass a new byte array,
     * and set {@link collapsedFlashAssetId} to
     *                     null. Otherwise, this field can be null and will
     * not be updated.
     *                     <p/>
     *                     The {@link collapsedFlashAssetByteArray} will
     * be {@code null} when the
     *                     {@code FlashExpandableCreative} is retrieved.
     */
    public void setCollapsedFlashAssetByteArray(byte[] collapsedFlashAssetByteArray) {
        this.collapsedFlashAssetByteArray = collapsedFlashAssetByteArray;
    }


    /**
     * Gets the collapsedFlashFileName value for this FlashExpandableCreative.
     * 
     * @return collapsedFlashFileName   * The file name of the collapsed Flash asset. This attribute
     * is required when
     *                     creating a new asset (e.g. when collapsedFlashAssetByteArray
     * is not null).
     */
    public java.lang.String getCollapsedFlashFileName() {
        return collapsedFlashFileName;
    }


    /**
     * Sets the collapsedFlashFileName value for this FlashExpandableCreative.
     * 
     * @param collapsedFlashFileName   * The file name of the collapsed Flash asset. This attribute
     * is required when
     *                     creating a new asset (e.g. when collapsedFlashAssetByteArray
     * is not null).
     */
    public void setCollapsedFlashFileName(java.lang.String collapsedFlashFileName) {
        this.collapsedFlashFileName = collapsedFlashFileName;
    }


    /**
     * Gets the collapsedFallbackImageAssetId value for this FlashExpandableCreative.
     * 
     * @return collapsedFallbackImageAssetId   * The ID of the fallback image asset. This attribute is read-only
     * and is populated by Google.
     */
    public java.lang.Long getCollapsedFallbackImageAssetId() {
        return collapsedFallbackImageAssetId;
    }


    /**
     * Sets the collapsedFallbackImageAssetId value for this FlashExpandableCreative.
     * 
     * @param collapsedFallbackImageAssetId   * The ID of the fallback image asset. This attribute is read-only
     * and is populated by Google.
     */
    public void setCollapsedFallbackImageAssetId(java.lang.Long collapsedFallbackImageAssetId) {
        this.collapsedFallbackImageAssetId = collapsedFallbackImageAssetId;
    }


    /**
     * Gets the collapsedFallbackImageAssetByteArray value for this FlashExpandableCreative.
     * 
     * @return collapsedFallbackImageAssetByteArray   * The content of the collapsed fallback image as a byte array.
     * This attribute is required when
     *                     creating a new {@code FlashExpandableCreative}.
     * <p/>
     *                     When updating the content, pass a new byte array,
     * and set {@link collapsedFallbackImageAssetId}
     *                     to null. Otherwise, this field can be null and
     * will not be updated.
     *                     <p/>
     *                     The {@link collapsedFallbackImageAssetByteArray}
     * will be {@code null} when the
     *                     {@code FlashExpandableCreative} is retrieved.
     */
    public byte[] getCollapsedFallbackImageAssetByteArray() {
        return collapsedFallbackImageAssetByteArray;
    }


    /**
     * Sets the collapsedFallbackImageAssetByteArray value for this FlashExpandableCreative.
     * 
     * @param collapsedFallbackImageAssetByteArray   * The content of the collapsed fallback image as a byte array.
     * This attribute is required when
     *                     creating a new {@code FlashExpandableCreative}.
     * <p/>
     *                     When updating the content, pass a new byte array,
     * and set {@link collapsedFallbackImageAssetId}
     *                     to null. Otherwise, this field can be null and
     * will not be updated.
     *                     <p/>
     *                     The {@link collapsedFallbackImageAssetByteArray}
     * will be {@code null} when the
     *                     {@code FlashExpandableCreative} is retrieved.
     */
    public void setCollapsedFallbackImageAssetByteArray(byte[] collapsedFallbackImageAssetByteArray) {
        this.collapsedFallbackImageAssetByteArray = collapsedFallbackImageAssetByteArray;
    }


    /**
     * Gets the collapsedFallbackImageFileName value for this FlashExpandableCreative.
     * 
     * @return collapsedFallbackImageFileName   * The file name of the collapse fallback image asset. This attribute
     * is required when
     *                     creating a new asset (e.g. when collapsedFallbackImageAssetByteArray
     * is not null).
     */
    public java.lang.String getCollapsedFallbackImageFileName() {
        return collapsedFallbackImageFileName;
    }


    /**
     * Sets the collapsedFallbackImageFileName value for this FlashExpandableCreative.
     * 
     * @param collapsedFallbackImageFileName   * The file name of the collapse fallback image asset. This attribute
     * is required when
     *                     creating a new asset (e.g. when collapsedFallbackImageAssetByteArray
     * is not null).
     */
    public void setCollapsedFallbackImageFileName(java.lang.String collapsedFallbackImageFileName) {
        this.collapsedFallbackImageFileName = collapsedFallbackImageFileName;
    }


    /**
     * Gets the expandedFlashAssetId value for this FlashExpandableCreative.
     * 
     * @return expandedFlashAssetId   * The ID of the expanded Flash asset. This attribute is read-only
     * and is populated by Google.
     */
    public java.lang.Long getExpandedFlashAssetId() {
        return expandedFlashAssetId;
    }


    /**
     * Sets the expandedFlashAssetId value for this FlashExpandableCreative.
     * 
     * @param expandedFlashAssetId   * The ID of the expanded Flash asset. This attribute is read-only
     * and is populated by Google.
     */
    public void setExpandedFlashAssetId(java.lang.Long expandedFlashAssetId) {
        this.expandedFlashAssetId = expandedFlashAssetId;
    }


    /**
     * Gets the expandedFlashAssetByteArray value for this FlashExpandableCreative.
     * 
     * @return expandedFlashAssetByteArray   * The content of the expanded Flash as a byte array. This attribute
     * is required when
     *                     creating a new {@code FlashExpandableCreative}.
     * <p/>
     *                     When updating the content, pass a new byte array,
     * and set {@code collapsedFallbackImageAssetId}
     *                     to null. Otherwise, this field can be null and
     * will not be updated.
     *                     <p/>
     *                     The {@code expandedFlashAssetByteArray} will be
     * {@code null} when the
     *                     {@code FlashExpandableCreative} is retrieved.
     */
    public byte[] getExpandedFlashAssetByteArray() {
        return expandedFlashAssetByteArray;
    }


    /**
     * Sets the expandedFlashAssetByteArray value for this FlashExpandableCreative.
     * 
     * @param expandedFlashAssetByteArray   * The content of the expanded Flash as a byte array. This attribute
     * is required when
     *                     creating a new {@code FlashExpandableCreative}.
     * <p/>
     *                     When updating the content, pass a new byte array,
     * and set {@code collapsedFallbackImageAssetId}
     *                     to null. Otherwise, this field can be null and
     * will not be updated.
     *                     <p/>
     *                     The {@code expandedFlashAssetByteArray} will be
     * {@code null} when the
     *                     {@code FlashExpandableCreative} is retrieved.
     */
    public void setExpandedFlashAssetByteArray(byte[] expandedFlashAssetByteArray) {
        this.expandedFlashAssetByteArray = expandedFlashAssetByteArray;
    }


    /**
     * Gets the expandedFlashFileName value for this FlashExpandableCreative.
     * 
     * @return expandedFlashFileName   * The file name of the expanded Flash asset. This attribute is
     * required when
     *                     creating a new asset (e.g. when expandedFlashAssetByteArray
     * is not null).
     */
    public java.lang.String getExpandedFlashFileName() {
        return expandedFlashFileName;
    }


    /**
     * Sets the expandedFlashFileName value for this FlashExpandableCreative.
     * 
     * @param expandedFlashFileName   * The file name of the expanded Flash asset. This attribute is
     * required when
     *                     creating a new asset (e.g. when expandedFlashAssetByteArray
     * is not null).
     */
    public void setExpandedFlashFileName(java.lang.String expandedFlashFileName) {
        this.expandedFlashFileName = expandedFlashFileName;
    }


    /**
     * Gets the requiredFlashVersion value for this FlashExpandableCreative.
     * 
     * @return requiredFlashVersion   * The minimum version of Flash player required to properly display
     * the flash file.
     *                     This attribute is optional and defaults to 8.
     */
    public java.lang.Integer getRequiredFlashVersion() {
        return requiredFlashVersion;
    }


    /**
     * Sets the requiredFlashVersion value for this FlashExpandableCreative.
     * 
     * @param requiredFlashVersion   * The minimum version of Flash player required to properly display
     * the flash file.
     *                     This attribute is optional and defaults to 8.
     */
    public void setRequiredFlashVersion(java.lang.Integer requiredFlashVersion) {
        this.requiredFlashVersion = requiredFlashVersion;
    }


    /**
     * Gets the collapsedWidth value for this FlashExpandableCreative.
     * 
     * @return collapsedWidth   * The collapsed width of the creative in pixels. This attribute
     * is required.
     */
    public java.lang.Integer getCollapsedWidth() {
        return collapsedWidth;
    }


    /**
     * Sets the collapsedWidth value for this FlashExpandableCreative.
     * 
     * @param collapsedWidth   * The collapsed width of the creative in pixels. This attribute
     * is required.
     */
    public void setCollapsedWidth(java.lang.Integer collapsedWidth) {
        this.collapsedWidth = collapsedWidth;
    }


    /**
     * Gets the collapsedHeight value for this FlashExpandableCreative.
     * 
     * @return collapsedHeight   * The collapsed height of the creative in pixels. This attribute
     * is required.
     */
    public java.lang.Integer getCollapsedHeight() {
        return collapsedHeight;
    }


    /**
     * Sets the collapsedHeight value for this FlashExpandableCreative.
     * 
     * @param collapsedHeight   * The collapsed height of the creative in pixels. This attribute
     * is required.
     */
    public void setCollapsedHeight(java.lang.Integer collapsedHeight) {
        this.collapsedHeight = collapsedHeight;
    }


    /**
     * Gets the expandedWidth value for this FlashExpandableCreative.
     * 
     * @return expandedWidth   * The expanded width of the creative in pixels. This attribute
     * is required.
     */
    public java.lang.Integer getExpandedWidth() {
        return expandedWidth;
    }


    /**
     * Sets the expandedWidth value for this FlashExpandableCreative.
     * 
     * @param expandedWidth   * The expanded width of the creative in pixels. This attribute
     * is required.
     */
    public void setExpandedWidth(java.lang.Integer expandedWidth) {
        this.expandedWidth = expandedWidth;
    }


    /**
     * Gets the expandedHeight value for this FlashExpandableCreative.
     * 
     * @return expandedHeight   * The expanded height of the creative in pixels. This attribute
     * is required.
     */
    public java.lang.Integer getExpandedHeight() {
        return expandedHeight;
    }


    /**
     * Sets the expandedHeight value for this FlashExpandableCreative.
     * 
     * @param expandedHeight   * The expanded height of the creative in pixels. This attribute
     * is required.
     */
    public void setExpandedHeight(java.lang.Integer expandedHeight) {
        this.expandedHeight = expandedHeight;
    }


    /**
     * Gets the expandDirection value for this FlashExpandableCreative.
     * 
     * @return expandDirection   * The direction in which the creative will expand. This attribute
     * is required.
     */
    public com.google.api.ads.dfp.axis.v201211.FlashExpandableCreativeExpandDirection getExpandDirection() {
        return expandDirection;
    }


    /**
     * Sets the expandDirection value for this FlashExpandableCreative.
     * 
     * @param expandDirection   * The direction in which the creative will expand. This attribute
     * is required.
     */
    public void setExpandDirection(com.google.api.ads.dfp.axis.v201211.FlashExpandableCreativeExpandDirection expandDirection) {
        this.expandDirection = expandDirection;
    }


    /**
     * Gets the expandOnMouseOver value for this FlashExpandableCreative.
     * 
     * @return expandOnMouseOver   * Whether or not the creative should expand when the mouse moves
     * over the collapsed state.
     *                     This attribute is optional and defaults to {@code
     * true}.
     */
    public java.lang.Boolean getExpandOnMouseOver() {
        return expandOnMouseOver;
    }


    /**
     * Sets the expandOnMouseOver value for this FlashExpandableCreative.
     * 
     * @param expandOnMouseOver   * Whether or not the creative should expand when the mouse moves
     * over the collapsed state.
     *                     This attribute is optional and defaults to {@code
     * true}.
     */
    public void setExpandOnMouseOver(java.lang.Boolean expandOnMouseOver) {
        this.expandOnMouseOver = expandOnMouseOver;
    }


    /**
     * Gets the javascriptFunctionForExpand value for this FlashExpandableCreative.
     * 
     * @return javascriptFunctionForExpand   * The name of javascript function needed in the SWF code to expand
     * creative if
     *                     the expandOnMouseOver is false. This attribute
     * is optional and defaults to "dclk_show()".
     */
    public java.lang.String getJavascriptFunctionForExpand() {
        return javascriptFunctionForExpand;
    }


    /**
     * Sets the javascriptFunctionForExpand value for this FlashExpandableCreative.
     * 
     * @param javascriptFunctionForExpand   * The name of javascript function needed in the SWF code to expand
     * creative if
     *                     the expandOnMouseOver is false. This attribute
     * is optional and defaults to "dclk_show()".
     */
    public void setJavascriptFunctionForExpand(java.lang.String javascriptFunctionForExpand) {
        this.javascriptFunctionForExpand = javascriptFunctionForExpand;
    }


    /**
     * Gets the collapseOnMouseOut value for this FlashExpandableCreative.
     * 
     * @return collapseOnMouseOut   * Whether or not the creative should collapse when the mouse
     * moves off the expanded state.
     *                     This attribute is optional and defaults to {@code
     * true}.
     */
    public java.lang.Boolean getCollapseOnMouseOut() {
        return collapseOnMouseOut;
    }


    /**
     * Sets the collapseOnMouseOut value for this FlashExpandableCreative.
     * 
     * @param collapseOnMouseOut   * Whether or not the creative should collapse when the mouse
     * moves off the expanded state.
     *                     This attribute is optional and defaults to {@code
     * true}.
     */
    public void setCollapseOnMouseOut(java.lang.Boolean collapseOnMouseOut) {
        this.collapseOnMouseOut = collapseOnMouseOut;
    }


    /**
     * Gets the javascriptFunctionForCollapse value for this FlashExpandableCreative.
     * 
     * @return javascriptFunctionForCollapse   * The name of javascript function needed in the SWF code to collapse
     * creative if
     *                     the collapseOnMouseOut is false. This attribute
     * is optional and defaults to "dclk_hide()".
     */
    public java.lang.String getJavascriptFunctionForCollapse() {
        return javascriptFunctionForCollapse;
    }


    /**
     * Sets the javascriptFunctionForCollapse value for this FlashExpandableCreative.
     * 
     * @param javascriptFunctionForCollapse   * The name of javascript function needed in the SWF code to collapse
     * creative if
     *                     the collapseOnMouseOut is false. This attribute
     * is optional and defaults to "dclk_hide()".
     */
    public void setJavascriptFunctionForCollapse(java.lang.String javascriptFunctionForCollapse) {
        this.javascriptFunctionForCollapse = javascriptFunctionForCollapse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlashExpandableCreative)) return false;
        FlashExpandableCreative other = (FlashExpandableCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.collapsedFlashAssetId==null && other.getCollapsedFlashAssetId()==null) || 
             (this.collapsedFlashAssetId!=null &&
              this.collapsedFlashAssetId.equals(other.getCollapsedFlashAssetId()))) &&
            ((this.collapsedFlashAssetByteArray==null && other.getCollapsedFlashAssetByteArray()==null) || 
             (this.collapsedFlashAssetByteArray!=null &&
              java.util.Arrays.equals(this.collapsedFlashAssetByteArray, other.getCollapsedFlashAssetByteArray()))) &&
            ((this.collapsedFlashFileName==null && other.getCollapsedFlashFileName()==null) || 
             (this.collapsedFlashFileName!=null &&
              this.collapsedFlashFileName.equals(other.getCollapsedFlashFileName()))) &&
            ((this.collapsedFallbackImageAssetId==null && other.getCollapsedFallbackImageAssetId()==null) || 
             (this.collapsedFallbackImageAssetId!=null &&
              this.collapsedFallbackImageAssetId.equals(other.getCollapsedFallbackImageAssetId()))) &&
            ((this.collapsedFallbackImageAssetByteArray==null && other.getCollapsedFallbackImageAssetByteArray()==null) || 
             (this.collapsedFallbackImageAssetByteArray!=null &&
              java.util.Arrays.equals(this.collapsedFallbackImageAssetByteArray, other.getCollapsedFallbackImageAssetByteArray()))) &&
            ((this.collapsedFallbackImageFileName==null && other.getCollapsedFallbackImageFileName()==null) || 
             (this.collapsedFallbackImageFileName!=null &&
              this.collapsedFallbackImageFileName.equals(other.getCollapsedFallbackImageFileName()))) &&
            ((this.expandedFlashAssetId==null && other.getExpandedFlashAssetId()==null) || 
             (this.expandedFlashAssetId!=null &&
              this.expandedFlashAssetId.equals(other.getExpandedFlashAssetId()))) &&
            ((this.expandedFlashAssetByteArray==null && other.getExpandedFlashAssetByteArray()==null) || 
             (this.expandedFlashAssetByteArray!=null &&
              java.util.Arrays.equals(this.expandedFlashAssetByteArray, other.getExpandedFlashAssetByteArray()))) &&
            ((this.expandedFlashFileName==null && other.getExpandedFlashFileName()==null) || 
             (this.expandedFlashFileName!=null &&
              this.expandedFlashFileName.equals(other.getExpandedFlashFileName()))) &&
            ((this.requiredFlashVersion==null && other.getRequiredFlashVersion()==null) || 
             (this.requiredFlashVersion!=null &&
              this.requiredFlashVersion.equals(other.getRequiredFlashVersion()))) &&
            ((this.collapsedWidth==null && other.getCollapsedWidth()==null) || 
             (this.collapsedWidth!=null &&
              this.collapsedWidth.equals(other.getCollapsedWidth()))) &&
            ((this.collapsedHeight==null && other.getCollapsedHeight()==null) || 
             (this.collapsedHeight!=null &&
              this.collapsedHeight.equals(other.getCollapsedHeight()))) &&
            ((this.expandedWidth==null && other.getExpandedWidth()==null) || 
             (this.expandedWidth!=null &&
              this.expandedWidth.equals(other.getExpandedWidth()))) &&
            ((this.expandedHeight==null && other.getExpandedHeight()==null) || 
             (this.expandedHeight!=null &&
              this.expandedHeight.equals(other.getExpandedHeight()))) &&
            ((this.expandDirection==null && other.getExpandDirection()==null) || 
             (this.expandDirection!=null &&
              this.expandDirection.equals(other.getExpandDirection()))) &&
            ((this.expandOnMouseOver==null && other.getExpandOnMouseOver()==null) || 
             (this.expandOnMouseOver!=null &&
              this.expandOnMouseOver.equals(other.getExpandOnMouseOver()))) &&
            ((this.javascriptFunctionForExpand==null && other.getJavascriptFunctionForExpand()==null) || 
             (this.javascriptFunctionForExpand!=null &&
              this.javascriptFunctionForExpand.equals(other.getJavascriptFunctionForExpand()))) &&
            ((this.collapseOnMouseOut==null && other.getCollapseOnMouseOut()==null) || 
             (this.collapseOnMouseOut!=null &&
              this.collapseOnMouseOut.equals(other.getCollapseOnMouseOut()))) &&
            ((this.javascriptFunctionForCollapse==null && other.getJavascriptFunctionForCollapse()==null) || 
             (this.javascriptFunctionForCollapse!=null &&
              this.javascriptFunctionForCollapse.equals(other.getJavascriptFunctionForCollapse())));
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
        if (getCollapsedFlashAssetId() != null) {
            _hashCode += getCollapsedFlashAssetId().hashCode();
        }
        if (getCollapsedFlashAssetByteArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCollapsedFlashAssetByteArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCollapsedFlashAssetByteArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCollapsedFlashFileName() != null) {
            _hashCode += getCollapsedFlashFileName().hashCode();
        }
        if (getCollapsedFallbackImageAssetId() != null) {
            _hashCode += getCollapsedFallbackImageAssetId().hashCode();
        }
        if (getCollapsedFallbackImageAssetByteArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCollapsedFallbackImageAssetByteArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCollapsedFallbackImageAssetByteArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCollapsedFallbackImageFileName() != null) {
            _hashCode += getCollapsedFallbackImageFileName().hashCode();
        }
        if (getExpandedFlashAssetId() != null) {
            _hashCode += getExpandedFlashAssetId().hashCode();
        }
        if (getExpandedFlashAssetByteArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExpandedFlashAssetByteArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExpandedFlashAssetByteArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExpandedFlashFileName() != null) {
            _hashCode += getExpandedFlashFileName().hashCode();
        }
        if (getRequiredFlashVersion() != null) {
            _hashCode += getRequiredFlashVersion().hashCode();
        }
        if (getCollapsedWidth() != null) {
            _hashCode += getCollapsedWidth().hashCode();
        }
        if (getCollapsedHeight() != null) {
            _hashCode += getCollapsedHeight().hashCode();
        }
        if (getExpandedWidth() != null) {
            _hashCode += getExpandedWidth().hashCode();
        }
        if (getExpandedHeight() != null) {
            _hashCode += getExpandedHeight().hashCode();
        }
        if (getExpandDirection() != null) {
            _hashCode += getExpandDirection().hashCode();
        }
        if (getExpandOnMouseOver() != null) {
            _hashCode += getExpandOnMouseOver().hashCode();
        }
        if (getJavascriptFunctionForExpand() != null) {
            _hashCode += getJavascriptFunctionForExpand().hashCode();
        }
        if (getCollapseOnMouseOut() != null) {
            _hashCode += getCollapseOnMouseOut().hashCode();
        }
        if (getJavascriptFunctionForCollapse() != null) {
            _hashCode += getJavascriptFunctionForCollapse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlashExpandableCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "FlashExpandableCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collapsedFlashAssetId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "collapsedFlashAssetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collapsedFlashAssetByteArray");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "collapsedFlashAssetByteArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collapsedFlashFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "collapsedFlashFileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collapsedFallbackImageAssetId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "collapsedFallbackImageAssetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collapsedFallbackImageAssetByteArray");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "collapsedFallbackImageAssetByteArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collapsedFallbackImageFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "collapsedFallbackImageFileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expandedFlashAssetId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "expandedFlashAssetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expandedFlashAssetByteArray");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "expandedFlashAssetByteArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expandedFlashFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "expandedFlashFileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requiredFlashVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "requiredFlashVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collapsedWidth");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "collapsedWidth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collapsedHeight");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "collapsedHeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expandedWidth");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "expandedWidth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expandedHeight");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "expandedHeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expandDirection");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "expandDirection"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "FlashExpandableCreative.ExpandDirection"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expandOnMouseOver");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "expandOnMouseOver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("javascriptFunctionForExpand");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "javascriptFunctionForExpand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collapseOnMouseOut");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "collapseOnMouseOut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("javascriptFunctionForCollapse");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "javascriptFunctionForCollapse"));
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
