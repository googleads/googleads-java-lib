
package com.google.api.ads.dfp.jaxws.v201208;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A floating flash creative. This creative is an interstitial creative,
 *             and its {@link #size} must be 1x1.
 *             <p>
 *             This creative will not work with iframe ad tags.
 *             <p>
 *             This creative is only available to small business networks.
 *             
 *             Starting in version v201306 this will be returned as a {@link TemplateCreative}
 *             identified with a {@link TemplateCreative#creativeTemplateId} of {@code 10000560}.
 *           
 * 
 * <p>Java class for FloatingFlashCreative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FloatingFlashCreative">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201208}HasDestinationUrlCreative">
 *       &lt;sequence>
 *         &lt;element name="flashName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flashByteArray" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="flashAssetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="fallbackImageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fallbackImageByteArray" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="fallbackImageAssetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="requiredFlashVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="topPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="leftPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayTimeInSecond" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="thirdPartyImpressionTracker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FloatingFlashCreative", propOrder = {
    "flashName",
    "flashByteArray",
    "flashAssetId",
    "fallbackImageName",
    "fallbackImageByteArray",
    "fallbackImageAssetId",
    "requiredFlashVersion",
    "width",
    "height",
    "topPosition",
    "leftPosition",
    "displayTimeInSecond",
    "thirdPartyImpressionTracker"
})
public class FloatingFlashCreative
    extends HasDestinationUrlCreative
{

    protected String flashName;
    protected byte[] flashByteArray;
    protected Long flashAssetId;
    protected String fallbackImageName;
    protected byte[] fallbackImageByteArray;
    protected Long fallbackImageAssetId;
    protected Integer requiredFlashVersion;
    protected Integer width;
    protected Integer height;
    protected String topPosition;
    protected String leftPosition;
    protected Integer displayTimeInSecond;
    protected String thirdPartyImpressionTracker;

    /**
     * Gets the value of the flashName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlashName() {
        return flashName;
    }

    /**
     * Sets the value of the flashName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlashName(String value) {
        this.flashName = value;
    }

    /**
     * Gets the value of the flashByteArray property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFlashByteArray() {
        return flashByteArray;
    }

    /**
     * Sets the value of the flashByteArray property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFlashByteArray(byte[] value) {
        this.flashByteArray = value;
    }

    /**
     * Gets the value of the flashAssetId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFlashAssetId() {
        return flashAssetId;
    }

    /**
     * Sets the value of the flashAssetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFlashAssetId(Long value) {
        this.flashAssetId = value;
    }

    /**
     * Gets the value of the fallbackImageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFallbackImageName() {
        return fallbackImageName;
    }

    /**
     * Sets the value of the fallbackImageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFallbackImageName(String value) {
        this.fallbackImageName = value;
    }

    /**
     * Gets the value of the fallbackImageByteArray property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFallbackImageByteArray() {
        return fallbackImageByteArray;
    }

    /**
     * Sets the value of the fallbackImageByteArray property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFallbackImageByteArray(byte[] value) {
        this.fallbackImageByteArray = value;
    }

    /**
     * Gets the value of the fallbackImageAssetId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFallbackImageAssetId() {
        return fallbackImageAssetId;
    }

    /**
     * Sets the value of the fallbackImageAssetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFallbackImageAssetId(Long value) {
        this.fallbackImageAssetId = value;
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
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHeight(Integer value) {
        this.height = value;
    }

    /**
     * Gets the value of the topPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopPosition() {
        return topPosition;
    }

    /**
     * Sets the value of the topPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopPosition(String value) {
        this.topPosition = value;
    }

    /**
     * Gets the value of the leftPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeftPosition() {
        return leftPosition;
    }

    /**
     * Sets the value of the leftPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeftPosition(String value) {
        this.leftPosition = value;
    }

    /**
     * Gets the value of the displayTimeInSecond property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplayTimeInSecond() {
        return displayTimeInSecond;
    }

    /**
     * Sets the value of the displayTimeInSecond property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisplayTimeInSecond(Integer value) {
        this.displayTimeInSecond = value;
    }

    /**
     * Gets the value of the thirdPartyImpressionTracker property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyImpressionTracker() {
        return thirdPartyImpressionTracker;
    }

    /**
     * Sets the value of the thirdPartyImpressionTracker property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyImpressionTracker(String value) {
        this.thirdPartyImpressionTracker = value;
    }

}
