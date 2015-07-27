
package com.google.api.ads.dfp.jaxws.v201405;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code Creative} that is served by a 3rd-party vendor.
 *           
 * 
 * <p>Java class for ThirdPartyCreative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThirdPartyCreative">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201405}Creative">
 *       &lt;sequence>
 *         &lt;element name="snippet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expandedSnippet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lockedOrientation" type="{https://www.google.com/apis/ads/publisher/v201405}LockedOrientation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThirdPartyCreative", propOrder = {
    "snippet",
    "expandedSnippet",
    "lockedOrientation"
})
public class ThirdPartyCreative
    extends Creative
{

    protected String snippet;
    protected String expandedSnippet;
    @XmlSchemaType(name = "string")
    protected LockedOrientation lockedOrientation;

    /**
     * Gets the value of the snippet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnippet() {
        return snippet;
    }

    /**
     * Sets the value of the snippet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnippet(String value) {
        this.snippet = value;
    }

    /**
     * Gets the value of the expandedSnippet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpandedSnippet() {
        return expandedSnippet;
    }

    /**
     * Sets the value of the expandedSnippet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpandedSnippet(String value) {
        this.expandedSnippet = value;
    }

    /**
     * Gets the value of the lockedOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link LockedOrientation }
     *     
     */
    public LockedOrientation getLockedOrientation() {
        return lockedOrientation;
    }

    /**
     * Sets the value of the lockedOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LockedOrientation }
     *     
     */
    public void setLockedOrientation(LockedOrientation value) {
        this.lockedOrientation = value;
    }

}
