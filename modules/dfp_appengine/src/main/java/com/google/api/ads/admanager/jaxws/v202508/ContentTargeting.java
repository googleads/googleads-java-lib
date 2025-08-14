// Copyright 2025 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202508;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Used to target {@link LineItem}s to specific videos on a publisher's site.
 *           
 * 
 * <p>Java class for ContentTargeting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentTargeting"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="targetedContentIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="excludedContentIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="targetedVideoContentBundleIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="excludedVideoContentBundleIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentTargeting", propOrder = {
    "targetedContentIds",
    "excludedContentIds",
    "targetedVideoContentBundleIds",
    "excludedVideoContentBundleIds"
})
public class ContentTargeting {

    @XmlElement(type = Long.class)
    protected List<Long> targetedContentIds;
    @XmlElement(type = Long.class)
    protected List<Long> excludedContentIds;
    @XmlElement(type = Long.class)
    protected List<Long> targetedVideoContentBundleIds;
    @XmlElement(type = Long.class)
    protected List<Long> excludedVideoContentBundleIds;

    /**
     * Gets the value of the targetedContentIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetedContentIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetedContentIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getTargetedContentIds() {
        if (targetedContentIds == null) {
            targetedContentIds = new ArrayList<Long>();
        }
        return this.targetedContentIds;
    }

    /**
     * Gets the value of the excludedContentIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excludedContentIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcludedContentIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getExcludedContentIds() {
        if (excludedContentIds == null) {
            excludedContentIds = new ArrayList<Long>();
        }
        return this.excludedContentIds;
    }

    /**
     * Gets the value of the targetedVideoContentBundleIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetedVideoContentBundleIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetedVideoContentBundleIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getTargetedVideoContentBundleIds() {
        if (targetedVideoContentBundleIds == null) {
            targetedVideoContentBundleIds = new ArrayList<Long>();
        }
        return this.targetedVideoContentBundleIds;
    }

    /**
     * Gets the value of the excludedVideoContentBundleIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excludedVideoContentBundleIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcludedVideoContentBundleIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getExcludedVideoContentBundleIds() {
        if (excludedVideoContentBundleIds == null) {
            excludedVideoContentBundleIds = new ArrayList<Long>();
        }
        return this.excludedVideoContentBundleIds;
    }

}
