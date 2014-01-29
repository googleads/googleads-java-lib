
package com.google.api.ads.dfp.jaxws.v201302;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A simple plain text-based {@code Creative}. This creative is only available to small business
 *             networks.
 *             
 *             Starting in version v201306 this will be returned as a {@link TemplateCreative}
 *             identified with a {@link TemplateCreative#creativeTemplateId} of {@code 10000440}.
 *           
 * 
 * <p>Java class for TextAdCreative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TextAdCreative">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201302}HasDestinationUrlCreative">
 *       &lt;sequence>
 *         &lt;element name="hoverText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetWindow" type="{https://www.google.com/apis/ads/publisher/v201302}TargetWindow" minOccurs="0"/>
 *         &lt;element name="linkColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="linkTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextAdCreative", propOrder = {
    "hoverText",
    "targetWindow",
    "linkColor",
    "linkTitle",
    "text",
    "textColor"
})
public class TextAdCreative
    extends HasDestinationUrlCreative
{

    protected String hoverText;
    protected TargetWindow targetWindow;
    protected String linkColor;
    protected String linkTitle;
    protected String text;
    protected String textColor;

    /**
     * Gets the value of the hoverText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoverText() {
        return hoverText;
    }

    /**
     * Sets the value of the hoverText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoverText(String value) {
        this.hoverText = value;
    }

    /**
     * Gets the value of the targetWindow property.
     * 
     * @return
     *     possible object is
     *     {@link TargetWindow }
     *     
     */
    public TargetWindow getTargetWindow() {
        return targetWindow;
    }

    /**
     * Sets the value of the targetWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetWindow }
     *     
     */
    public void setTargetWindow(TargetWindow value) {
        this.targetWindow = value;
    }

    /**
     * Gets the value of the linkColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkColor() {
        return linkColor;
    }

    /**
     * Sets the value of the linkColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkColor(String value) {
        this.linkColor = value;
    }

    /**
     * Gets the value of the linkTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkTitle() {
        return linkTitle;
    }

    /**
     * Sets the value of the linkTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkTitle(String value) {
        this.linkTitle = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the textColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextColor() {
        return textColor;
    }

    /**
     * Sets the value of the textColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextColor(String value) {
        this.textColor = value;
    }

}
