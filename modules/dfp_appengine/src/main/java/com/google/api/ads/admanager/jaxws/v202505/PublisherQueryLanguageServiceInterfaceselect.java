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


package com.google.api.ads.admanager.jaxws.v202505;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Retrieves rows of data that satisfy the given {@link Statement#query} from the system.
 *           
 * 
 * <p>Java class for select element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="select"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="selectStatement" type="{https://www.google.com/apis/ads/publisher/v202505}Statement" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *     &lt;/complexContent&gt;
 *   &lt;/complexType&gt;
 * &lt;/element&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "selectStatement"
})
@XmlRootElement(name = "select")
public class PublisherQueryLanguageServiceInterfaceselect {

    protected Statement selectStatement;

    /**
     * Gets the value of the selectStatement property.
     * 
     * @return
     *     possible object is
     *     {@link Statement }
     *     
     */
    public Statement getSelectStatement() {
        return selectStatement;
    }

    /**
     * Sets the value of the selectStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement }
     *     
     */
    public void setSelectStatement(Statement value) {
        this.selectStatement = value;
    }

}
