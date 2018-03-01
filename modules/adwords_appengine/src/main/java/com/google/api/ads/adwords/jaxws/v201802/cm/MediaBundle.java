// Copyright 2018 Google Inc. All Rights Reserved.
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


package com.google.api.ads.adwords.jaxws.v201802.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a ZIP archive media the content of which contains HTML5 assets.
 *           
 * 
 * <p>Java class for MediaBundle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaBundle">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}Media">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="mediaBundleUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entryPoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaBundle", propOrder = {
    "data",
    "mediaBundleUrl",
    "entryPoint"
})
public class MediaBundle
    extends Media
{

    protected byte[] data;
    protected String mediaBundleUrl;
    protected String entryPoint;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setData(byte[] value) {
        this.data = value;
    }

    /**
     * Gets the value of the mediaBundleUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaBundleUrl() {
        return mediaBundleUrl;
    }

    /**
     * Sets the value of the mediaBundleUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaBundleUrl(String value) {
        this.mediaBundleUrl = value;
    }

    /**
     * Gets the value of the entryPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryPoint() {
        return entryPoint;
    }

    /**
     * Sets the value of the entryPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryPoint(String value) {
        this.entryPoint = value;
    }

}
