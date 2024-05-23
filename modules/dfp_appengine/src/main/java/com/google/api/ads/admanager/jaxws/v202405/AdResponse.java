// Copyright 2024 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202405;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="requestUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isVmapRequest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="responseBody" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="redirectResponses" type="{https://www.google.com/apis/ads/publisher/v202405}AdResponse" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="samError" type="{https://www.google.com/apis/ads/publisher/v202405}SamError" minOccurs="0"/&gt;
 *         &lt;element name="adErrors" type="{https://www.google.com/apis/ads/publisher/v202405}SamError" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdResponse", propOrder = {
    "requestUrl",
    "isVmapRequest",
    "responseBody",
    "redirectResponses",
    "samError",
    "adErrors"
})
public class AdResponse {

    protected String requestUrl;
    protected Boolean isVmapRequest;
    protected String responseBody;
    protected List<AdResponse> redirectResponses;
    protected SamError samError;
    protected List<SamError> adErrors;

    /**
     * Gets the value of the requestUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestUrl() {
        return requestUrl;
    }

    /**
     * Sets the value of the requestUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestUrl(String value) {
        this.requestUrl = value;
    }

    /**
     * Gets the value of the isVmapRequest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsVmapRequest() {
        return isVmapRequest;
    }

    /**
     * Sets the value of the isVmapRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsVmapRequest(Boolean value) {
        this.isVmapRequest = value;
    }

    /**
     * Gets the value of the responseBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseBody() {
        return responseBody;
    }

    /**
     * Sets the value of the responseBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseBody(String value) {
        this.responseBody = value;
    }

    /**
     * Gets the value of the redirectResponses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the redirectResponses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRedirectResponses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdResponse }
     * 
     * 
     */
    public List<AdResponse> getRedirectResponses() {
        if (redirectResponses == null) {
            redirectResponses = new ArrayList<AdResponse>();
        }
        return this.redirectResponses;
    }

    /**
     * Gets the value of the samError property.
     * 
     * @return
     *     possible object is
     *     {@link SamError }
     *     
     */
    public SamError getSamError() {
        return samError;
    }

    /**
     * Sets the value of the samError property.
     * 
     * @param value
     *     allowed object is
     *     {@link SamError }
     *     
     */
    public void setSamError(SamError value) {
        this.samError = value;
    }

    /**
     * Gets the value of the adErrors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adErrors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SamError }
     * 
     * 
     */
    public List<SamError> getAdErrors() {
        if (adErrors == null) {
            adErrors = new ArrayList<SamError>();
        }
        return this.adErrors;
    }

}
