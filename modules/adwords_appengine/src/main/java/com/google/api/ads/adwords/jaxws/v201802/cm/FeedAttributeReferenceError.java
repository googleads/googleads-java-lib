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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             An error indicating a problem with a reference to a feed attribute in an ad.
 *           
 * 
 * <p>Java class for FeedAttributeReferenceError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeedAttributeReferenceError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://adwords.google.com/api/adwords/cm/v201802}FeedAttributeReferenceError.Reason" minOccurs="0"/>
 *         &lt;element name="feedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feedAttributeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeedAttributeReferenceError", propOrder = {
    "reason",
    "feedName",
    "feedAttributeName"
})
public class FeedAttributeReferenceError
    extends ApiError
{

    @XmlSchemaType(name = "string")
    protected FeedAttributeReferenceErrorReason reason;
    protected String feedName;
    protected String feedAttributeName;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link FeedAttributeReferenceErrorReason }
     *     
     */
    public FeedAttributeReferenceErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedAttributeReferenceErrorReason }
     *     
     */
    public void setReason(FeedAttributeReferenceErrorReason value) {
        this.reason = value;
    }

    /**
     * Gets the value of the feedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedName() {
        return feedName;
    }

    /**
     * Sets the value of the feedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedName(String value) {
        this.feedName = value;
    }

    /**
     * Gets the value of the feedAttributeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedAttributeName() {
        return feedAttributeName;
    }

    /**
     * Sets the value of the feedAttributeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedAttributeName(String value) {
        this.feedAttributeName = value;
    }

}
