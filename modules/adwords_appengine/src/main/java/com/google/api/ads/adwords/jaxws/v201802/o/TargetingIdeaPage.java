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


package com.google.api.ads.adwords.jaxws.v201802.o;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Contains a subset of {@link TargetingIdea}s from the search criteria
 *             specified by a {@link TargetingIdeaSelector}.
 *           
 * 
 * <p>Java class for TargetingIdeaPage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetingIdeaPage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="totalNumEntries" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="entries" type="{https://adwords.google.com/api/adwords/o/v201802}TargetingIdea" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetingIdeaPage", propOrder = {
    "totalNumEntries",
    "entries"
})
public class TargetingIdeaPage {

    protected Integer totalNumEntries;
    protected List<TargetingIdea> entries;

    /**
     * Gets the value of the totalNumEntries property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalNumEntries() {
        return totalNumEntries;
    }

    /**
     * Sets the value of the totalNumEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalNumEntries(Integer value) {
        this.totalNumEntries = value;
    }

    /**
     * Gets the value of the entries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TargetingIdea }
     * 
     * 
     */
    public List<TargetingIdea> getEntries() {
        if (entries == null) {
            entries = new ArrayList<TargetingIdea>();
        }
        return this.entries;
    }

}
