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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Contains validation error details for a set of feed attributes.
 *           
 * 
 * <p>Java class for FeedItemAttributeError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeedItemAttributeError">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="feedAttributeIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="validationErrorCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="errorInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeedItemAttributeError", propOrder = {
    "feedAttributeIds",
    "validationErrorCode",
    "errorInformation"
})
public class FeedItemAttributeError {

    @XmlElement(type = Long.class)
    protected List<Long> feedAttributeIds;
    protected Integer validationErrorCode;
    protected String errorInformation;

    /**
     * Gets the value of the feedAttributeIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feedAttributeIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeedAttributeIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getFeedAttributeIds() {
        if (feedAttributeIds == null) {
            feedAttributeIds = new ArrayList<Long>();
        }
        return this.feedAttributeIds;
    }

    /**
     * Gets the value of the validationErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValidationErrorCode() {
        return validationErrorCode;
    }

    /**
     * Sets the value of the validationErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValidationErrorCode(Integer value) {
        this.validationErrorCode = value;
    }

    /**
     * Gets the value of the errorInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorInformation() {
        return errorInformation;
    }

    /**
     * Sets the value of the errorInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorInformation(String value) {
        this.errorInformation = value;
    }

}
