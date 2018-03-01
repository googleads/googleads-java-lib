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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Information about countries that were targeted that caused a policy finding. If a
 *             CountryConstraint has 0 targeted countries and an empty list of constrained countries, it means
 *             that the constraint applies globally.
 *           
 * 
 * <p>Java class for CountryConstraint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountryConstraint">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}PolicyTopicConstraint">
 *       &lt;sequence>
 *         &lt;element name="constrainedCountries" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="totalTargetedCountries" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountryConstraint", propOrder = {
    "constrainedCountries",
    "totalTargetedCountries"
})
@XmlSeeAlso({
    CertificateDomainMismatchInCountryConstraint.class,
    CertificateMissingInCountryConstraint.class
})
public class CountryConstraint
    extends PolicyTopicConstraint
{

    @XmlElement(type = Long.class)
    protected List<Long> constrainedCountries;
    protected Integer totalTargetedCountries;

    /**
     * Gets the value of the constrainedCountries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constrainedCountries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstrainedCountries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getConstrainedCountries() {
        if (constrainedCountries == null) {
            constrainedCountries = new ArrayList<Long>();
        }
        return this.constrainedCountries;
    }

    /**
     * Gets the value of the totalTargetedCountries property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalTargetedCountries() {
        return totalTargetedCountries;
    }

    /**
     * Sets the value of the totalTargetedCountries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalTargetedCountries(Integer value) {
        this.totalTargetedCountries = value;
    }

}
