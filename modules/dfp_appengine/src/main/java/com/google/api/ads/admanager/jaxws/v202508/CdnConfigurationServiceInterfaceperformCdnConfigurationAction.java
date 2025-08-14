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


package com.google.api.ads.admanager.jaxws.v202508;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Performs actions on {@link CdnConfiguration} objects that match the given {@link
 *             Statement#query}.
 *           
 * 
 * <p>Java class for performCdnConfigurationAction element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="performCdnConfigurationAction"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="cdnConfigurationAction" type="{https://www.google.com/apis/ads/publisher/v202508}CdnConfigurationAction" minOccurs="0"/&gt;
 *           &lt;element name="filterStatement" type="{https://www.google.com/apis/ads/publisher/v202508}Statement" minOccurs="0"/&gt;
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
    "cdnConfigurationAction",
    "filterStatement"
})
@XmlRootElement(name = "performCdnConfigurationAction")
public class CdnConfigurationServiceInterfaceperformCdnConfigurationAction {

    protected CdnConfigurationAction cdnConfigurationAction;
    protected Statement filterStatement;

    /**
     * Gets the value of the cdnConfigurationAction property.
     * 
     * @return
     *     possible object is
     *     {@link CdnConfigurationAction }
     *     
     */
    public CdnConfigurationAction getCdnConfigurationAction() {
        return cdnConfigurationAction;
    }

    /**
     * Sets the value of the cdnConfigurationAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link CdnConfigurationAction }
     *     
     */
    public void setCdnConfigurationAction(CdnConfigurationAction value) {
        this.cdnConfigurationAction = value;
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
