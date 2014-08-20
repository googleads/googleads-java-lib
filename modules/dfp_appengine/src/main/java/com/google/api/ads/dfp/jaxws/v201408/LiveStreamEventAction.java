
package com.google.api.ads.dfp.jaxws.v201408;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the actions that can be performed on {@link LiveStreamEvent}
 *             objects.
 *           
 * 
 * <p>Java class for LiveStreamEventAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LiveStreamEventAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LiveStreamEventAction.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiveStreamEventAction", propOrder = {
    "liveStreamEventActionType"
})
@XmlSeeAlso({
    ActivateLiveStreamEvents.class,
    ArchiveLiveStreamEvents.class,
    PauseLiveStreamEvents.class,
    PauseLiveStreamEventAds.class
})
public abstract class LiveStreamEventAction {

    @XmlElement(name = "LiveStreamEventAction.Type")
    protected String liveStreamEventActionType;

    /**
     * Gets the value of the liveStreamEventActionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiveStreamEventActionType() {
        return liveStreamEventActionType;
    }

    /**
     * Sets the value of the liveStreamEventActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiveStreamEventActionType(String value) {
        this.liveStreamEventActionType = value;
    }

}
