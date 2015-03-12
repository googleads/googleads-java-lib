
package com.google.api.ads.adwords.jaxws.v201502.o;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             HTML-specific options for display ads are contained within
 *             this class.
 *           
 * 
 * <p>Java class for HtmlDisplayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HtmlDisplayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="htmlOption" type="{https://adwords.google.com/api/adwords/o/v201502}HtmlDisplayType.HtmlOption" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HtmlDisplayType", propOrder = {
    "htmlOption"
})
public class HtmlDisplayType {

    protected HtmlDisplayTypeHtmlOption htmlOption;

    /**
     * Gets the value of the htmlOption property.
     * 
     * @return
     *     possible object is
     *     {@link HtmlDisplayTypeHtmlOption }
     *     
     */
    public HtmlDisplayTypeHtmlOption getHtmlOption() {
        return htmlOption;
    }

    /**
     * Sets the value of the htmlOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link HtmlDisplayTypeHtmlOption }
     *     
     */
    public void setHtmlOption(HtmlDisplayTypeHtmlOption value) {
        this.htmlOption = value;
    }

}
