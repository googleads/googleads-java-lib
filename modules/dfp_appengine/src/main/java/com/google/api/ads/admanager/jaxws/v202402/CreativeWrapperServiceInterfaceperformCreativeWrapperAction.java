// Copyright 2024 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202402;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Performs actions on {@link CreativeWrapper} objects that match the given {@link
 *             Statement#query}.
 *           
 * 
 * <p>Java class for performCreativeWrapperAction element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="performCreativeWrapperAction"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="creativeWrapperAction" type="{https://www.google.com/apis/ads/publisher/v202402}CreativeWrapperAction" minOccurs="0"/&gt;
 *           &lt;element name="filterStatement" type="{https://www.google.com/apis/ads/publisher/v202402}Statement" minOccurs="0"/&gt;
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
    "creativeWrapperAction",
    "filterStatement"
})
@XmlRootElement(name = "performCreativeWrapperAction")
public class CreativeWrapperServiceInterfaceperformCreativeWrapperAction {

    protected CreativeWrapperAction creativeWrapperAction;
    protected Statement filterStatement;

    /**
     * Gets the value of the creativeWrapperAction property.
     * 
     * @return
     *     possible object is
     *     {@link CreativeWrapperAction }
     *     
     */
    public CreativeWrapperAction getCreativeWrapperAction() {
        return creativeWrapperAction;
    }

    /**
     * Sets the value of the creativeWrapperAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreativeWrapperAction }
     *     
     */
    public void setCreativeWrapperAction(CreativeWrapperAction value) {
        this.creativeWrapperAction = value;
    }

    /**
     * Gets the value of the filterStatement property.
     * 
     * @return
     *     possible object is
     *     {@link Statement }
     *     
     */
    public Statement getFilterStatement() {
        return filterStatement;
    }

    /**
     * Sets the value of the filterStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement }
     *     
     */
    public void setFilterStatement(Statement value) {
        this.filterStatement = value;
    }

}
