
package com.google.api.ads.adwords.jaxws.v201406.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Improved exact and phrase match option includes misspellings, plurals,
 *             and other close variants of your keywords.
 *             
 *             Default value set to {@code true} to include close variants. For more
 *             information, see the article
 *             <a href="https://support.google.com/adwords/bin/answer.py?answer=6100">
 *             What are keyword matching options?</a>.
 *             
 *             This setting is required when creating new campaigns.
 *           
 * 
 * <p>Java class for KeywordMatchSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeywordMatchSetting">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201406}Setting">
 *       &lt;sequence>
 *         &lt;element name="optIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeywordMatchSetting", propOrder = {
    "optIn"
})
public class KeywordMatchSetting
    extends Setting
{

    protected Boolean optIn;

    /**
     * Gets the value of the optIn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptIn() {
        return optIn;
    }

    /**
     * Sets the value of the optIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptIn(Boolean value) {
        this.optIn = value;
    }

}
