// Copyright 2022 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202211;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code CmsMetadataCriteria} object is used to target {@code CmsMetadataValue} objects.
 *           
 * 
 * <p>Java class for CmsMetadataCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CmsMetadataCriteria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v202211}CustomCriteriaLeaf"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="operator" type="{https://www.google.com/apis/ads/publisher/v202211}CmsMetadataCriteria.ComparisonOperator" minOccurs="0"/&gt;
 *         &lt;element name="cmsMetadataValueIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CmsMetadataCriteria", propOrder = {
    "operator",
    "cmsMetadataValueIds"
})
public class CmsMetadataCriteria
    extends CustomCriteriaLeaf
{

    @XmlSchemaType(name = "string")
    protected CmsMetadataCriteriaComparisonOperator operator;
    @XmlElement(type = Long.class)
    protected List<Long> cmsMetadataValueIds;

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link CmsMetadataCriteriaComparisonOperator }
     *     
     */
    public CmsMetadataCriteriaComparisonOperator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmsMetadataCriteriaComparisonOperator }
     *     
     */
    public void setOperator(CmsMetadataCriteriaComparisonOperator value) {
        this.operator = value;
    }

    /**
     * Gets the value of the cmsMetadataValueIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cmsMetadataValueIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCmsMetadataValueIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getCmsMetadataValueIds() {
        if (cmsMetadataValueIds == null) {
            cmsMetadataValueIds = new ArrayList<Long>();
        }
        return this.cmsMetadataValueIds;
    }

}
