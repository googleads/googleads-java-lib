
package com.google.api.ads.dfp.jaxws.v201508;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             An externally-hosted video asset.
 *           
 * 
 * <p>Java class for VideoRedirectAsset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoRedirectAsset">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201508}RedirectAsset">
 *       &lt;sequence>
 *         &lt;element name="metadata" type="{https://www.google.com/apis/ads/publisher/v201508}VideoMetadata" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoRedirectAsset", propOrder = {
    "metadata"
})
public class VideoRedirectAsset
    extends RedirectAsset
{

    protected VideoMetadata metadata;

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link VideoMetadata }
     *     
     */
    public VideoMetadata getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoMetadata }
     *     
     */
    public void setMetadata(VideoMetadata value) {
        this.metadata = value;
    }

}
