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
 *             Represents a Message extension.
 *           
 * 
 * <p>Java class for MessageFeedItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageFeedItem">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}ExtensionFeedItem">
 *       &lt;sequence>
 *         &lt;element name="messageBusinessName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messagePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageExtensionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageFeedItem", propOrder = {
    "messageBusinessName",
    "messageCountryCode",
    "messagePhoneNumber",
    "messageExtensionText",
    "messageText"
})
public class MessageFeedItem
    extends ExtensionFeedItem
{

    protected String messageBusinessName;
    protected String messageCountryCode;
    protected String messagePhoneNumber;
    protected String messageExtensionText;
    protected String messageText;

    /**
     * Gets the value of the messageBusinessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageBusinessName() {
        return messageBusinessName;
    }

    /**
     * Sets the value of the messageBusinessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageBusinessName(String value) {
        this.messageBusinessName = value;
    }

    /**
     * Gets the value of the messageCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageCountryCode() {
        return messageCountryCode;
    }

    /**
     * Sets the value of the messageCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageCountryCode(String value) {
        this.messageCountryCode = value;
    }

    /**
     * Gets the value of the messagePhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessagePhoneNumber() {
        return messagePhoneNumber;
    }

    /**
     * Sets the value of the messagePhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessagePhoneNumber(String value) {
        this.messagePhoneNumber = value;
    }

    /**
     * Gets the value of the messageExtensionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageExtensionText() {
        return messageExtensionText;
    }

    /**
     * Sets the value of the messageExtensionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageExtensionText(String value) {
        this.messageExtensionText = value;
    }

    /**
     * Gets the value of the messageText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageText() {
        return messageText;
    }

    /**
     * Sets the value of the messageText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageText(String value) {
        this.messageText = value;
    }

}
