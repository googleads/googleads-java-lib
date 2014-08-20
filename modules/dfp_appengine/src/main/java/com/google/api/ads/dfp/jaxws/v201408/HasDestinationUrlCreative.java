
package com.google.api.ads.dfp.jaxws.v201408;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code Creative} that has a destination url
 *           
 * 
 * <p>Java class for HasDestinationUrlCreative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HasDestinationUrlCreative">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201408}Creative">
 *       &lt;sequence>
 *         &lt;element name="destinationUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HasDestinationUrlCreative", propOrder = {
    "destinationUrl"
})
@XmlSeeAlso({
    CustomCreative.class,
    VpaidLinearCreative.class,
    AspectRatioImageCreative.class,
    LegacyDfpMobileCreative.class,
    VpaidLinearRedirectCreative.class,
    BaseFlashCreative.class,
    BaseFlashRedirectCreative.class,
    BaseImageRedirectCreative.class,
    BaseVideoCreative.class,
    BaseImageCreative.class
})
public abstract class HasDestinationUrlCreative
    extends Creative
{

    protected String destinationUrl;

    /**
     * Gets the value of the destinationUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationUrl() {
        return destinationUrl;
    }

    /**
     * Sets the value of the destinationUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationUrl(String value) {
        this.destinationUrl = value;
    }

}
