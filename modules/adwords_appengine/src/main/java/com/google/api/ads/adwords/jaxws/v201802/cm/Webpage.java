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
 *             Criterion for targeting webpages of an advertiser's website. The
 *             website domain name is specified at the campaign level.
 *             <span class="constraint AdxEnabled">This is disabled for AdX when it is contained within Operators: ADD, SET.</span>
 *           
 * 
 * <p>Java class for Webpage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Webpage">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}Criterion">
 *       &lt;sequence>
 *         &lt;element name="parameter" type="{https://adwords.google.com/api/adwords/cm/v201802}WebpageParameter" minOccurs="0"/>
 *         &lt;element name="criteriaCoverage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="criteriaSamples" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Webpage", propOrder = {
    "parameter",
    "criteriaCoverage",
    "criteriaSamples"
})
public class Webpage
    extends Criterion
{

    protected WebpageParameter parameter;
    protected Double criteriaCoverage;
    protected List<String> criteriaSamples;

    /**
     * Gets the value of the parameter property.
     * 
     * @return
     *     possible object is
     *     {@link WebpageParameter }
     *     
     */
    public WebpageParameter getParameter() {
        return parameter;
    }

    /**
     * Sets the value of the parameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebpageParameter }
     *     
     */
    public void setParameter(WebpageParameter value) {
        this.parameter = value;
    }

    /**
     * Gets the value of the criteriaCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCriteriaCoverage() {
        return criteriaCoverage;
    }

    /**
     * Sets the value of the criteriaCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCriteriaCoverage(Double value) {
        this.criteriaCoverage = value;
    }

    /**
     * Gets the value of the criteriaSamples property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criteriaSamples property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriteriaSamples().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCriteriaSamples() {
        if (criteriaSamples == null) {
            criteriaSamples = new ArrayList<String>();
        }
        return this.criteriaSamples;
    }

}
