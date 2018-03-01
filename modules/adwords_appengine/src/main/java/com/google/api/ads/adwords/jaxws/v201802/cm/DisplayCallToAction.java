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
 *             Represents display-call-to-action specific data.
 *           
 * 
 * <p>Java class for DisplayCallToAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisplayCallToAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisplayCallToAction", propOrder = {
    "text",
    "textColor",
    "urlId"
})
public class DisplayCallToAction {

    protected String text;
    protected String textColor;
    protected String urlId;

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the textColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextColor() {
        return textColor;
    }

    /**
     * Sets the value of the textColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextColor(String value) {
        this.textColor = value;
    }

    /**
     * Gets the value of the urlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlId() {
        return urlId;
    }

    /**
     * Sets the value of the urlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlId(String value) {
        this.urlId = value;
    }

}
