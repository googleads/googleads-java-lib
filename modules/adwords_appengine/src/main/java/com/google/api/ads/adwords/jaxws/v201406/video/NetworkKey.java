
package com.google.api.ads.adwords.jaxws.v201406.video;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A SegmentKey for segmenting by {@link VideoAdNetwork}.
 *           
 * 
 * <p>Java class for NetworkKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkKey">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="network" type="{https://adwords.google.com/api/adwords/video/v201406}VideoAdNetwork" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkKey", propOrder = {
    "network"
})
public class NetworkKey {

    protected VideoAdNetwork network;

    /**
     * Gets the value of the network property.
     * 
     * @return
     *     possible object is
     *     {@link VideoAdNetwork }
     *     
     */
    public VideoAdNetwork getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoAdNetwork }
     *     
     */
    public void setNetwork(VideoAdNetwork value) {
        this.network = value;
    }

}
