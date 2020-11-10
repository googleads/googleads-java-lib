// Copyright 2020 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202011;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             {@link LiveStream} settings that are specific to the HTTP live streaming (HLS) protocol.
 *           
 * 
 * <p>Java class for HlsSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HlsSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="playlistType" type="{https://www.google.com/apis/ads/publisher/v202011}PlaylistType" minOccurs="0"/>
 *         &lt;element name="masterPlaylistSettings" type="{https://www.google.com/apis/ads/publisher/v202011}MasterPlaylistSettings" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HlsSettings", propOrder = {
    "playlistType",
    "masterPlaylistSettings"
})
public class HlsSettings {

    @XmlSchemaType(name = "string")
    protected PlaylistType playlistType;
    protected MasterPlaylistSettings masterPlaylistSettings;

    /**
     * Gets the value of the playlistType property.
     * 
     * @return
     *     possible object is
     *     {@link PlaylistType }
     *     
     */
    public PlaylistType getPlaylistType() {
        return playlistType;
    }

    /**
     * Sets the value of the playlistType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaylistType }
     *     
     */
    public void setPlaylistType(PlaylistType value) {
        this.playlistType = value;
    }

    /**
     * Gets the value of the masterPlaylistSettings property.
     * 
     * @return
     *     possible object is
     *     {@link MasterPlaylistSettings }
     *     
     */
    public MasterPlaylistSettings getMasterPlaylistSettings() {
        return masterPlaylistSettings;
    }

    /**
     * Sets the value of the masterPlaylistSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterPlaylistSettings }
     *     
     */
    public void setMasterPlaylistSettings(MasterPlaylistSettings value) {
        this.masterPlaylistSettings = value;
    }

}
