// Copyright 2025 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.admanager.jaxws.v202505;

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
 *             <p>The following fields are required:
 *             
 *             <ul>
 *             <li>{@link LiveStreamEvent#name}
 *             <li>{@link LiveStreamEvent#startDateTime}
 *             <li>{@link LiveStreamEvent#endDateTime}
 *             <li>{@link LiveStreamEvent#contentUrls}
 *             <li>{@link LiveStreamEvent#adTags}
 *             </ul>
 *           
 * 
 * <p>Java class for createLiveStreamEvents element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="createLiveStreamEvents"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="liveStreamEvents" type="{https://www.google.com/apis/ads/publisher/v202505}LiveStreamEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *     &lt;/complexContent&gt;
 *   &lt;/complexType&gt;
 * &lt;/element&gt;
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
