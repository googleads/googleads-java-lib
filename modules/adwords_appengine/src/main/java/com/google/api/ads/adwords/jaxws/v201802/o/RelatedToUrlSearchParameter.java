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
 *             A {@link SearchParameter} that specifies a set of URLs that results should
 *             in some way be related to. For example, keyword results would be
 *             similar to content keywords found on the related URLs.
 *             <p>This element is supported by following {@link IdeaType}s: KEYWORD.
 *             <p>This element is supported by following {@link RequestType}s: IDEAS.
 *           
 * 
 * <p>Java class for RelatedToUrlSearchParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedToUrlSearchParameter">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/o/v201802}SearchParameter">
 *       &lt;sequence>
 *         &lt;element name="urls" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="includeSubUrls" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedToUrlSearchParameter", propOrder = {
    "urls",
    "includeSubUrls"
})
public class RelatedToUrlSearchParameter
    extends SearchParameter
{

    protected List<String> urls;
    protected Boolean includeSubUrls;

    /**
     * Gets the value of the urls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the urls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUrls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUrls() {
        if (urls == null) {
            urls = new ArrayList<String>();
        }
        return this.urls;
    }

    /**
     * Gets the value of the includeSubUrls property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeSubUrls() {
        return includeSubUrls;
    }

    /**
     * Sets the value of the includeSubUrls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeSubUrls(Boolean value) {
        this.includeSubUrls = value;
    }

}
