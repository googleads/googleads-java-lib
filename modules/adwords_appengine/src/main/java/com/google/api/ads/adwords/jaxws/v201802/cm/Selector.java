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
 *             A generic selector to specify the type of information to return.
 *           
 * 
 * <p>Java class for Selector complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Selector">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fields" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="predicates" type="{https://adwords.google.com/api/adwords/cm/v201802}Predicate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dateRange" type="{https://adwords.google.com/api/adwords/cm/v201802}DateRange" minOccurs="0"/>
 *         &lt;element name="ordering" type="{https://adwords.google.com/api/adwords/cm/v201802}OrderBy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="paging" type="{https://adwords.google.com/api/adwords/cm/v201802}Paging" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Selector", propOrder = {
    "fields",
    "predicates",
    "dateRange",
    "ordering",
    "paging"
})
public class Selector {

    protected List<String> fields;
    protected List<Predicate> predicates;
    protected DateRange dateRange;
    protected List<OrderBy> ordering;
    protected Paging paging;

    /**
     * Gets the value of the fields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFields() {
        if (fields == null) {
            fields = new ArrayList<String>();
        }
        return this.fields;
    }

    /**
     * Gets the value of the predicates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the predicates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPredicates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Predicate }
     * 
     * 
     */
    public List<Predicate> getPredicates() {
        if (predicates == null) {
            predicates = new ArrayList<Predicate>();
        }
        return this.predicates;
    }

    /**
     * Gets the value of the dateRange property.
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    public DateRange getDateRange() {
        return dateRange;
    }

    /**
     * Sets the value of the dateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    public void setDateRange(DateRange value) {
        this.dateRange = value;
    }

    /**
     * Gets the value of the ordering property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ordering property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrdering().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderBy }
     * 
     * 
     */
    public List<OrderBy> getOrdering() {
        if (ordering == null) {
            ordering = new ArrayList<OrderBy>();
        }
        return this.ordering;
    }

    /**
     * Gets the value of the paging property.
     * 
     * @return
     *     possible object is
     *     {@link Paging }
     *     
     */
    public Paging getPaging() {
        return paging;
    }

    /**
     * Sets the value of the paging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paging }
     *     
     */
    public void setPaging(Paging value) {
        this.paging = value;
    }

}
