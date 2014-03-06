
package com.google.api.ads.dfp.jaxws.v201208;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code Creative} intended for mobile platforms that displays an image,
 *             whose {@link LineItem#creativePlaceholders size} is defined as an
 *             {@link CreativeSizeType#ASPECT_RATIO aspect ratio}, i.e.
 *             {@link Size#isAspectRatio}. It can have multiple images whose dimensions
 *             conform to that aspect ratio.
 *           
 * 
 * <p>Java class for AspectRatioImageCreative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AspectRatioImageCreative">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201208}HasDestinationUrlCreative">
 *       &lt;sequence>
 *         &lt;element name="imageAssets" type="{https://www.google.com/apis/ads/publisher/v201208}CreativeAsset" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fallbackText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AspectRatioImageCreative", propOrder = {
    "imageAssets",
    "fallbackText"
})
public class AspectRatioImageCreative
    extends HasDestinationUrlCreative
{

    protected List<CreativeAsset> imageAssets;
    protected String fallbackText;

    /**
     * Gets the value of the imageAssets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imageAssets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImageAssets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreativeAsset }
     * 
     * 
     */
    public List<CreativeAsset> getImageAssets() {
        if (imageAssets == null) {
            imageAssets = new ArrayList<CreativeAsset>();
        }
        return this.imageAssets;
    }

    /**
     * Gets the value of the fallbackText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFallbackText() {
        return fallbackText;
    }

    /**
     * Sets the value of the fallbackText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFallbackText(String value) {
        this.fallbackText = value;
    }

}
