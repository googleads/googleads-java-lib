
package com.google.api.ads.dfp.jaxws.v201605;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Creates new {@link LiveStreamEvent} objects.
 *             
 *             The following fields are required:
 *             <ul>
 *             <li>{@link LiveStreamEvent#name}</li>
 *             <li>{@link LiveStreamEvent#startDateTime}</li>
 *             <li>{@link LiveStreamEvent#endDateTime}</li>
 *             <li>{@link LiveStreamEvent#contentUrls}</li>
 *             <li>{@link LiveStreamEvent#adTags}</li>
 *             </ul>
 *             
 *             @param liveStreamEvents the live stream events to create
 *             @return the created live stream events with their IDs filled in
 *           
 * 
 * <p>Java class for createLiveStreamEvents element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="createLiveStreamEvents">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="liveStreamEvents" type="{https://www.google.com/apis/ads/publisher/v201605}LiveStreamEvent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "liveStreamEvents"
})
@XmlRootElement(name = "createLiveStreamEvents")
public class LiveStreamEventServiceInterfacecreateLiveStreamEvents {

    protected List<LiveStreamEvent> liveStreamEvents;

    /**
     * Gets the value of the liveStreamEvents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the liveStreamEvents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLiveStreamEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LiveStreamEvent }
     * 
     * 
     */
    public List<LiveStreamEvent> getLiveStreamEvents() {
        if (liveStreamEvents == null) {
            liveStreamEvents = new ArrayList<LiveStreamEvent>();
        }
        return this.liveStreamEvents;
    }

}
