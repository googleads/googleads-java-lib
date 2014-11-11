
package com.google.api.ads.dfp.jaxws.v201411;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code Creative} that is created by a Rich Media Studio. You cannot create this creative,
 *             but you can update some fields of this creative.
 *           
 * 
 * <p>Java class for RichMediaStudioCreative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RichMediaStudioCreative">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201411}BaseRichMediaStudioCreative">
 *       &lt;sequence>
 *         &lt;element name="lockedOrientation" type="{https://www.google.com/apis/ads/publisher/v201411}LockedOrientation" minOccurs="0"/>
 *         &lt;element name="isInterstitial" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RichMediaStudioCreative", propOrder = {
    "lockedOrientation",
    "isInterstitial"
})
public class RichMediaStudioCreative
    extends BaseRichMediaStudioCreative
{

    protected LockedOrientation lockedOrientation;
    protected Boolean isInterstitial;

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

    /**
     * Gets the value of the isInterstitial property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInterstitial() {
        return isInterstitial;
    }

    /**
     * Sets the value of the isInterstitial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInterstitial(Boolean value) {
        this.isInterstitial = value;
    }

}
