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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Use verticals to target or exclude placements in the Google Display Network
 *             based on the category into which the placement falls (for example, "Pets &amp;
 *             Animals/Pets/Dogs").
 *             <a href="/adwords/api/docs/appendix/verticals">View the complete list
 *             of available vertical categories.</a>
 *             <span class="constraint AdxEnabled">This is enabled for AdX.</span>
 *           
 * 
 * <p>Java class for Vertical complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Vertical">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}Criterion">
 *       &lt;sequence>
 *         &lt;element name="verticalId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="verticalParentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="path" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vertical", propOrder = {
    "verticalId",
    "verticalParentId",
    "path"
})
public class Vertical
    extends Criterion
{

    protected Long verticalId;
    protected Long verticalParentId;
    protected List<String> path;

    /**
     * Gets the value of the verticalId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVerticalId() {
        return verticalId;
    }

    /**
     * Sets the value of the verticalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVerticalId(Long value) {
        this.verticalId = value;
    }

    /**
     * Gets the value of the verticalParentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVerticalParentId() {
        return verticalParentId;
    }

    /**
     * Sets the value of the verticalParentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVerticalParentId(Long value) {
        this.verticalParentId = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the path property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPath().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPath() {
        if (path == null) {
            path = new ArrayList<String>();
        }
        return this.path;
    }

}
