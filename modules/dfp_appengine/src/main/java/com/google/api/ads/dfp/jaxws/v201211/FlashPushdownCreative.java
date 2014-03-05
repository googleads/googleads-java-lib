
package com.google.api.ads.dfp.jaxws.v201211;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             {@code Creative} that pushes page content down when the creative expands.
 *             The collapsed size is one Flash SWF file and the expanded size is another Flash SWF file.
 *             <p>
 *             This creative will not work with iframe ad tags.
 *             <p>
 *             This creative is only available to small business networks.
 *             
 *             Starting in version v201306 this will be returned as a {@link TemplateCreative}
 *             identified with a {@link TemplateCreative#creativeTemplateId} of {@code 10001400}.
 *           
 * 
 * <p>Java class for FlashPushdownCreative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlashPushdownCreative">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201211}HasDestinationUrlCreative">
 *       &lt;sequence>
 *         &lt;element name="collapsedFlashAssetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="collapsedFlashAssetByteArray" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="collapsedFlashFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="collapsedFallbackImageAssetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="collapsedFallbackImageAssetByteArray" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="collapsedFallbackImageFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expandedFlashAssetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="expandedFlashAssetByteArray" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="expandedFlashFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requiredFlashVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="collapsedHeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="expandedHeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pushdownOnMouseOver" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="javascriptFunctionForPushdown" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="collapseOnMouseOut" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="javascriptFunctionForCollapse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlashPushdownCreative", propOrder = {
    "collapsedFlashAssetId",
    "collapsedFlashAssetByteArray",
    "collapsedFlashFileName",
    "collapsedFallbackImageAssetId",
    "collapsedFallbackImageAssetByteArray",
    "collapsedFallbackImageFileName",
    "expandedFlashAssetId",
    "expandedFlashAssetByteArray",
    "expandedFlashFileName",
    "requiredFlashVersion",
    "width",
    "collapsedHeight",
    "expandedHeight",
    "pushdownOnMouseOver",
    "javascriptFunctionForPushdown",
    "collapseOnMouseOut",
    "javascriptFunctionForCollapse"
})
public class FlashPushdownCreative
    extends HasDestinationUrlCreative
{

    protected Long collapsedFlashAssetId;
    protected byte[] collapsedFlashAssetByteArray;
    protected String collapsedFlashFileName;
    protected Long collapsedFallbackImageAssetId;
    protected byte[] collapsedFallbackImageAssetByteArray;
    protected String collapsedFallbackImageFileName;
    protected Long expandedFlashAssetId;
    protected byte[] expandedFlashAssetByteArray;
    protected String expandedFlashFileName;
    protected Integer requiredFlashVersion;
    protected Integer width;
    protected Integer collapsedHeight;
    protected Integer expandedHeight;
    protected Boolean pushdownOnMouseOver;
    protected String javascriptFunctionForPushdown;
    protected Boolean collapseOnMouseOut;
    protected String javascriptFunctionForCollapse;

    /**
     * Gets the value of the collapsedFlashAssetId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCollapsedFlashAssetId() {
        return collapsedFlashAssetId;
    }

    /**
     * Sets the value of the collapsedFlashAssetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCollapsedFlashAssetId(Long value) {
        this.collapsedFlashAssetId = value;
    }

    /**
     * Gets the value of the collapsedFlashAssetByteArray property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCollapsedFlashAssetByteArray() {
        return collapsedFlashAssetByteArray;
    }

    /**
     * Sets the value of the collapsedFlashAssetByteArray property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCollapsedFlashAssetByteArray(byte[] value) {
        this.collapsedFlashAssetByteArray = value;
    }

    /**
     * Gets the value of the collapsedFlashFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollapsedFlashFileName() {
        return collapsedFlashFileName;
    }

    /**
     * Sets the value of the collapsedFlashFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollapsedFlashFileName(String value) {
        this.collapsedFlashFileName = value;
    }

    /**
     * Gets the value of the collapsedFallbackImageAssetId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCollapsedFallbackImageAssetId() {
        return collapsedFallbackImageAssetId;
    }

    /**
     * Sets the value of the collapsedFallbackImageAssetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCollapsedFallbackImageAssetId(Long value) {
        this.collapsedFallbackImageAssetId = value;
    }

    /**
     * Gets the value of the collapsedFallbackImageAssetByteArray property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCollapsedFallbackImageAssetByteArray() {
        return collapsedFallbackImageAssetByteArray;
    }

    /**
     * Sets the value of the collapsedFallbackImageAssetByteArray property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCollapsedFallbackImageAssetByteArray(byte[] value) {
        this.collapsedFallbackImageAssetByteArray = value;
    }

    /**
     * Gets the value of the collapsedFallbackImageFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollapsedFallbackImageFileName() {
        return collapsedFallbackImageFileName;
    }

    /**
     * Sets the value of the collapsedFallbackImageFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollapsedFallbackImageFileName(String value) {
        this.collapsedFallbackImageFileName = value;
    }

    /**
     * Gets the value of the expandedFlashAssetId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExpandedFlashAssetId() {
        return expandedFlashAssetId;
    }

    /**
     * Sets the value of the expandedFlashAssetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExpandedFlashAssetId(Long value) {
        this.expandedFlashAssetId = value;
    }

    /**
     * Gets the value of the expandedFlashAssetByteArray property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getExpandedFlashAssetByteArray() {
        return expandedFlashAssetByteArray;
    }

    /**
     * Sets the value of the expandedFlashAssetByteArray property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setExpandedFlashAssetByteArray(byte[] value) {
        this.expandedFlashAssetByteArray = value;
    }

    /**
     * Gets the value of the expandedFlashFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpandedFlashFileName() {
        return expandedFlashFileName;
    }

    /**
     * Sets the value of the expandedFlashFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpandedFlashFileName(String value) {
        this.expandedFlashFileName = value;
    }

    /**
     * Gets the value of the requiredFlashVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRequiredFlashVersion() {
        return requiredFlashVersion;
    }

    /**
     * Sets the value of the requiredFlashVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRequiredFlashVersion(Integer value) {
        this.requiredFlashVersion = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWidth(Integer value) {
        this.width = value;
    }

    /**
     * Gets the value of the collapsedHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCollapsedHeight() {
        return collapsedHeight;
    }

    /**
     * Sets the value of the collapsedHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCollapsedHeight(Integer value) {
        this.collapsedHeight = value;
    }

    /**
     * Gets the value of the expandedHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExpandedHeight() {
        return expandedHeight;
    }

    /**
     * Sets the value of the expandedHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExpandedHeight(Integer value) {
        this.expandedHeight = value;
    }

    /**
     * Gets the value of the pushdownOnMouseOver property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPushdownOnMouseOver() {
        return pushdownOnMouseOver;
    }

    /**
     * Sets the value of the pushdownOnMouseOver property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPushdownOnMouseOver(Boolean value) {
        this.pushdownOnMouseOver = value;
    }

    /**
     * Gets the value of the javascriptFunctionForPushdown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJavascriptFunctionForPushdown() {
        return javascriptFunctionForPushdown;
    }

    /**
     * Sets the value of the javascriptFunctionForPushdown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJavascriptFunctionForPushdown(String value) {
        this.javascriptFunctionForPushdown = value;
    }

    /**
     * Gets the value of the collapseOnMouseOut property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCollapseOnMouseOut() {
        return collapseOnMouseOut;
    }

    /**
     * Sets the value of the collapseOnMouseOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCollapseOnMouseOut(Boolean value) {
        this.collapseOnMouseOut = value;
    }

    /**
     * Gets the value of the javascriptFunctionForCollapse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJavascriptFunctionForCollapse() {
        return javascriptFunctionForCollapse;
    }

    /**
     * Sets the value of the javascriptFunctionForCollapse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJavascriptFunctionForCollapse(String value) {
        this.javascriptFunctionForCollapse = value;
    }

}
