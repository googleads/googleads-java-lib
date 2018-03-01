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
 *             Represents an ad parameter.  Use ad parameters to update numeric values
 *             (such as prices or inventory levels) in any line of a text ad, including
 *             the destination URL. You can set two <code>AdParam</code> objects
 *             (one for each value of {@link #paramIndex}) per ad group
 *             <a href="AdGroupCriterionService.Keyword.html">Keyword</a>
 *             criterion.
 *             <p>When setting or removing an <code>AdParam</code>, it is uniquely
 *             identified by the combination of these three fields:</p>
 *             <ul>
 *             <li><code>adGroupId</code></li>
 *             <li><code>criterionId</code></li>
 *             <li><code>paramIndex</code></li>
 *             </ul>
 *           
 * 
 * <p>Java class for AdParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdParam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="criterionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="insertionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paramIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdParam", propOrder = {
    "adGroupId",
    "criterionId",
    "insertionText",
    "paramIndex"
})
public class AdParam {

    protected Long adGroupId;
    protected Long criterionId;
    protected String insertionText;
    protected Integer paramIndex;

    /**
     * Gets the value of the adGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdGroupId() {
        return adGroupId;
    }

    /**
     * Sets the value of the adGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdGroupId(Long value) {
        this.adGroupId = value;
    }

    /**
     * Gets the value of the criterionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCriterionId() {
        return criterionId;
    }

    /**
     * Sets the value of the criterionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCriterionId(Long value) {
        this.criterionId = value;
    }

    /**
     * Gets the value of the insertionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsertionText() {
        return insertionText;
    }

    /**
     * Sets the value of the insertionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsertionText(String value) {
        this.insertionText = value;
    }

    /**
     * Gets the value of the paramIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParamIndex() {
        return paramIndex;
    }

    /**
     * Sets the value of the paramIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParamIndex(Integer value) {
        this.paramIndex = value;
    }

}
