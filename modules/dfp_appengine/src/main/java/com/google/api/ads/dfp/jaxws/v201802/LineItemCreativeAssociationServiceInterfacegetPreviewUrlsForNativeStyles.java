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


package com.google.api.ads.dfp.jaxws.v201802;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Returns a list of URLs that reference the specified site URL with the specified creative from
 *             the association served to it. For Creative Set previewing you may specify the master creative
 *             Id. Each URL corresponds to one available native style for previewing the specified creative.
 *             
 *             @param lineItemId the ID of the line item, which must already exist
 *             @param creativeId the ID of the creative, which must already exist and must be a native
 *             creative
 *             @param siteUrl the URL of the site that the creative should be previewed in
 *             @return the URLs that references the specified site URL and can be used to preview the
 *             specified creative with the available native styles
 *           
 * 
 * <p>Java class for getPreviewUrlsForNativeStyles element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getPreviewUrlsForNativeStyles">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="lineItemId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *           &lt;element name="creativeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *           &lt;element name="siteUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "lineItemId",
    "creativeId",
    "siteUrl"
})
@XmlRootElement(name = "getPreviewUrlsForNativeStyles")
public class LineItemCreativeAssociationServiceInterfacegetPreviewUrlsForNativeStyles {

    protected Long lineItemId;
    protected Long creativeId;
    protected String siteUrl;

    /**
     * Gets the value of the lineItemId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLineItemId() {
        return lineItemId;
    }

    /**
     * Sets the value of the lineItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLineItemId(Long value) {
        this.lineItemId = value;
    }

    /**
     * Gets the value of the creativeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreativeId() {
        return creativeId;
    }

    /**
     * Sets the value of the creativeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreativeId(Long value) {
        this.creativeId = value;
    }

    /**
     * Gets the value of the siteUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteUrl() {
        return siteUrl;
    }

    /**
     * Sets the value of the siteUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteUrl(String value) {
        this.siteUrl = value;
    }

}
