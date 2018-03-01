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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Describes the behavior of elements in a list. Instances of ListOperations will always be defined
 *             alongside some list in an API POJO. The number of operators in the ListOperations must be
 *             equal to the number of elements in the POJO list. Each operator, together with its corresponding
 *             list element, describe an intended change.
 *             
 *             <p>For example, if in a request Campaign.selectiveOptimization contains 2 conversionTypeIds,
 *             and the conversionTypeIdsOps is non-null, it must contain 2 operators. If those operators are
 *             {PUT, REMOVE} then the API will add the first conversionTypeId (if it doesn't
 *             already exist) and remove the second conversionTypeId (if it exists).
 *           
 * 
 * <p>Java class for ListOperations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOperations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clear" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="operators" type="{https://adwords.google.com/api/adwords/cm/v201802}ListOperations.ListOperator" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOperations", propOrder = {
    "clear",
    "operators"
})
public class ListOperations {

    protected Boolean clear;
    @XmlSchemaType(name = "string")
    protected List<ListOperationsListOperator> operators;

    /**
     * Gets the value of the clear property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClear() {
        return clear;
    }

    /**
     * Sets the value of the clear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClear(Boolean value) {
        this.clear = value;
    }

    /**
     * Gets the value of the operators property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operators property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperators().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListOperationsListOperator }
     * 
     * 
     */
    public List<ListOperationsListOperator> getOperators() {
        if (operators == null) {
            operators = new ArrayList<ListOperationsListOperator>();
        }
        return this.operators;
    }

}
