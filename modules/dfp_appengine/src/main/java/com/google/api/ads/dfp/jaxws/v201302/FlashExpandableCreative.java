
package com.google.api.ads.dfp.jaxws.v201302;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             An expandable {@code Creative} where the collapsed size is a Flash SWF file and
 *             the expanded size is another Flash SWF file. If Flash isn't supported in the browser,
 *             the fallback image will be used.
 *             <p>
 *             This creative will not work with iframe ad tags.
 *             <p>
 *             This creative is only available to small business networks.
 *             
 *             Starting in version v201306 this will be returned as a {@link TemplateCreative}
 *             identified with a {@link TemplateCreative#creativeTemplateId} of {@code 10001160}.
 *           
 * 
 * <p>Java class for FlashExpandableCreative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlashExpandableCreative">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201302}HasDestinationUrlCreative">
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
 *         &lt;element name="collapsedWidth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="collapsedHeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="expandedWidth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="expandedHeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="expandDirection" type="{https://www.google.com/apis/ads/publisher/v201302}FlashExpandableCreative.ExpandDirection" minOccurs="0"/>
 *         &lt;element name="expandOnMouseOver" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="javascriptFunctionForExpand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "FlashExpandableCreative", propOrder = {
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
    "collapsedWidth",
    "collapsedHeight",
    "expandedWidth",
    "expandedHeight",
    "expandDirection",
    "expandOnMouseOver",
    "javascriptFunctionForExpand",
    "collapseOnMouseOut",
    "javascriptFunctionForCollapse"
})
public class FlashExpandableCreative
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
    protected Integer collapsedWidth;
    protected Integer collapsedHeight;
    protected Integer expandedWidth;
    protected Integer expandedHeight;
    protected FlashExpandableCreativeExpandDirection expandDirection;
    protected Boolean expandOnMouseOver;
    protected String javascriptFunctionForExpand;
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
     * Gets the value of the collapsedWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCollapsedWidth() {
        return collapsedWidth;
    }

    /**
     * Sets the value of the collapsedWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCollapsedWidth(Integer value) {
        this.collapsedWidth = value;
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
     * Gets the value of the expandedWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExpandedWidth() {
        return expandedWidth;
    }

    /**
     * Sets the value of the expandedWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExpandedWidth(Integer value) {
        this.expandedWidth = value;
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
     * Gets the value of the expandDirection property.
     * 
     * @return
     *     possible object is
     *     {@link FlashExpandableCreativeExpandDirection }
     *     
     */
    public FlashExpandableCreativeExpandDirection getExpandDirection() {
        return expandDirection;
    }

    /**
     * Sets the value of the expandDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlashExpandableCreativeExpandDirection }
     *     
     */
    public void setExpandDirection(FlashExpandableCreativeExpandDirection value) {
        this.expandDirection = value;
    }

    /**
     * Gets the value of the expandOnMouseOver property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpandOnMouseOver() {
        return expandOnMouseOver;
    }

    /**
     * Sets the value of the expandOnMouseOver property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpandOnMouseOver(Boolean value) {
        this.expandOnMouseOver = value;
    }

    /**
     * Gets the value of the javascriptFunctionForExpand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJavascriptFunctionForExpand() {
        return javascriptFunctionForExpand;
    }

    /**
     * Sets the value of the javascriptFunctionForExpand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJavascriptFunctionForExpand(String value) {
        this.javascriptFunctionForExpand = value;
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
