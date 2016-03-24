
package com.google.api.ads.adwords.jaxws.v201603.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a callout extension.
 *           
 * 
 * <p>Java class for CalloutFeedItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalloutFeedItem">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201603}ExtensionFeedItem">
 *       &lt;sequence>
 *         &lt;element name="calloutText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalloutFeedItem", propOrder = {
    "calloutText"
})
public class CalloutFeedItem
    extends ExtensionFeedItem
{

    protected String calloutText;

    /**
     * Gets the value of the calloutText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalloutText() {
        return calloutText;
    }

    /**
     * Sets the value of the calloutText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalloutText(String value) {
        this.calloutText = value;
    }

}
