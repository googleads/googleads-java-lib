
package com.google.api.ads.adwords.jaxws.v201402.video;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a collection of {@link VideoAdNetwork}s, potentially {@code null}.
 *             
 *             Wrapper around a list of networks which preserves {@code null}
 *             (i.e. not specified) value during grubby serialization/deserialization.
 *             Grubby translates lists into repeated fields in the protocol message and,
 *             therefore, cannot restore a {@code null} list.
 *           
 * 
 * <p>Java class for VideoAdNetworks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoAdNetworks">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="networks" type="{https://adwords.google.com/api/adwords/video/v201402}VideoAdNetwork" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoAdNetworks", propOrder = {
    "networks"
})
public class VideoAdNetworks {

    protected List<VideoAdNetwork> networks;

    /**
     * Gets the value of the networks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the networks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetworks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoAdNetwork }
     * 
     * 
     */
    public List<VideoAdNetwork> getNetworks() {
        if (networks == null) {
            networks = new ArrayList<VideoAdNetwork>();
        }
        return this.networks;
    }

}
