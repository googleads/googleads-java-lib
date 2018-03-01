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
 *             Represents a Review extension.
 *           
 * 
 * <p>Java class for ReviewFeedItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReviewFeedItem">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}ExtensionFeedItem">
 *       &lt;sequence>
 *         &lt;element name="reviewText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reviewSourceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reviewSourceUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reviewTextExactlyQuoted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReviewFeedItem", propOrder = {
    "reviewText",
    "reviewSourceName",
    "reviewSourceUrl",
    "reviewTextExactlyQuoted"
})
public class ReviewFeedItem
    extends ExtensionFeedItem
{

    protected String reviewText;
    protected String reviewSourceName;
    protected String reviewSourceUrl;
    protected Boolean reviewTextExactlyQuoted;

    /**
     * Gets the value of the reviewText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewText() {
        return reviewText;
    }

    /**
     * Sets the value of the reviewText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewText(String value) {
        this.reviewText = value;
    }

    /**
     * Gets the value of the reviewSourceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewSourceName() {
        return reviewSourceName;
    }

    /**
     * Sets the value of the reviewSourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewSourceName(String value) {
        this.reviewSourceName = value;
    }

    /**
     * Gets the value of the reviewSourceUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewSourceUrl() {
        return reviewSourceUrl;
    }

    /**
     * Sets the value of the reviewSourceUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewSourceUrl(String value) {
        this.reviewSourceUrl = value;
    }

    /**
     * Gets the value of the reviewTextExactlyQuoted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReviewTextExactlyQuoted() {
        return reviewTextExactlyQuoted;
    }

    /**
     * Sets the value of the reviewTextExactlyQuoted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReviewTextExactlyQuoted(Boolean value) {
        this.reviewTextExactlyQuoted = value;
    }

}
