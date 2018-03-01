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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Product partition (product group) in a shopping campaign. Depending on its type, a product
 *             partition subdivides products along some product dimension, specifies a bid for products, or
 *             excludes products from bidding.
 *             
 *             <p>Inner nodes of a product partition hierarchy are always subdivisions. Each child is linked to
 *             the subdivision via the {@code parentCriterionId} and defines a {@code caseValue}. For all
 *             children of the same subdivision, the {@code caseValue}s must be mutually different but
 *             instances of the same class.
 *             
 *             To create a subdivision and child node in the same API request, they should refer to each other
 *             using temporary criterion IDs in the {@code parentCriterionId} of the child, and ID field of the
 *             subdivision. Temporary IDs are specified by using any negative integer. Temporary IDs only exist
 *             within the scope of a single API request. The API will assign real criterion IDs, and replace
 *             the temporary values, and the API response will reflect this.
 *             <span class="constraint AdxEnabled">This is disabled for AdX when it is contained within Operators: ADD, SET.</span>
 *           
 * 
 * <p>Java class for ProductPartition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductPartition">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}Criterion">
 *       &lt;sequence>
 *         &lt;element name="partitionType" type="{https://adwords.google.com/api/adwords/cm/v201802}ProductPartitionType" minOccurs="0"/>
 *         &lt;element name="parentCriterionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="caseValue" type="{https://adwords.google.com/api/adwords/cm/v201802}ProductDimension" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductPartition", propOrder = {
    "partitionType",
    "parentCriterionId",
    "caseValue"
})
public class ProductPartition
    extends Criterion
{

    @XmlSchemaType(name = "string")
    protected ProductPartitionType partitionType;
    protected Long parentCriterionId;
    protected ProductDimension caseValue;

    /**
     * Gets the value of the partitionType property.
     * 
     * @return
     *     possible object is
     *     {@link ProductPartitionType }
     *     
     */
    public ProductPartitionType getPartitionType() {
        return partitionType;
    }

    /**
     * Sets the value of the partitionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductPartitionType }
     *     
     */
    public void setPartitionType(ProductPartitionType value) {
        this.partitionType = value;
    }

    /**
     * Gets the value of the parentCriterionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentCriterionId() {
        return parentCriterionId;
    }

    /**
     * Sets the value of the parentCriterionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentCriterionId(Long value) {
        this.parentCriterionId = value;
    }

    /**
     * Gets the value of the caseValue property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDimension }
     *     
     */
    public ProductDimension getCaseValue() {
        return caseValue;
    }

    /**
     * Sets the value of the caseValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDimension }
     *     
     */
    public void setCaseValue(ProductDimension value) {
        this.caseValue = value;
    }

}
