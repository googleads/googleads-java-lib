// Copyright 2017 Google Inc. All Rights Reserved.
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


package com.google.api.ads.dfp.jaxws.v201711;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Captures the {@code WHERE}, {@code ORDER BY} and {@code LIMIT} clauses of a
 *             PQL query. Statements are typically used to retrieve objects of a predefined
 *             domain type, which makes SELECT clause unnecessary.
 *             <p>
 *             An example query text might be {@code "WHERE status = 'ACTIVE' ORDER BY id
 *             LIMIT 30"}.
 *             </p>
 *             <p>
 *             Statements support bind variables. These are substitutes for literals
 *             and can be thought of as input parameters to a PQL query.
 *             </p>
 *             <p>
 *             An example of such a query might be {@code "WHERE id = :idValue"}.
 *             </p>
 *             <p>
 *             Statements also support use of the LIKE keyword. This provides partial and
 *             wildcard string matching.
 *             </p>
 *             <p>
 *             An example of such a query might be {@code "WHERE name LIKE 'startswith%'"}.
 *             </p>
 *             The value for the variable idValue must then be set with an object of type
 *             {@link Value}, e.g., {@link NumberValue}, {@link TextValue} or
 *             {@link BooleanValue}.
 *           
 * 
 * <p>Java class for Statement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Statement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="query" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="values" type="{https://www.google.com/apis/ads/publisher/v201711}String_ValueMapEntry" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Statement", propOrder = {
    "query",
    "values"
})
public class Statement {

    protected String query;
    protected List<StringValueMapEntry> values;

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuery(String value) {
        this.query = value;
    }

    /**
     * Gets the value of the values property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the values property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringValueMapEntry }
     * 
     * 
     */
    public List<StringValueMapEntry> getValues() {
        if (values == null) {
            values = new ArrayList<StringValueMapEntry>();
        }
        return this.values;
    }

}
