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
 *             CustomParameters holds a list of CustomParameters to be treated as a map.
 *             It has a special field used to indicate that the current map should be cleared and replaced
 *             with this new map.
 *           
 * 
 * <p>Java class for CustomParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parameters" type="{https://adwords.google.com/api/adwords/cm/v201802}CustomParameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="doReplace" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomParameters", propOrder = {
    "parameters",
    "doReplace"
})
public class CustomParameters {

    protected List<CustomParameter> parameters;
    protected Boolean doReplace;

    /**
     * Gets the value of the parameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomParameter }
     * 
     * 
     */
    public List<CustomParameter> getParameters() {
        if (parameters == null) {
            parameters = new ArrayList<CustomParameter>();
        }
        return this.parameters;
    }

    /**
     * Gets the value of the doReplace property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDoReplace() {
        return doReplace;
    }

    /**
     * Sets the value of the doReplace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDoReplace(Boolean value) {
        this.doReplace = value;
    }

}
