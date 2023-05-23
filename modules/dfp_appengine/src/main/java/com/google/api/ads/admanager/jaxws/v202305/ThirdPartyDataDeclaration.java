// Copyright 2023 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202305;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a set of declarations about what (if any) third party companies are associated with a
 *             given creative.
 *             
 *             <p>This can be set at the network level, as a default for all creatives, or overridden for a
 *             particular creative.
 *           
 * 
 * <p>Java class for ThirdPartyDataDeclaration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThirdPartyDataDeclaration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="declarationType" type="{https://www.google.com/apis/ads/publisher/v202305}DeclarationType" minOccurs="0"/>
 *         &lt;element name="thirdPartyCompanyIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThirdPartyDataDeclaration", propOrder = {
    "declarationType",
    "thirdPartyCompanyIds"
})
public class ThirdPartyDataDeclaration {

    @XmlSchemaType(name = "string")
    protected DeclarationType declarationType;
    @XmlElement(type = Long.class)
    protected List<Long> thirdPartyCompanyIds;

    /**
     * Gets the value of the declarationType property.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationType }
     *     
     */
    public DeclarationType getDeclarationType() {
        return declarationType;
    }

    /**
     * Sets the value of the declarationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationType }
     *     
     */
    public void setDeclarationType(DeclarationType value) {
        this.declarationType = value;
    }

    /**
     * Gets the value of the thirdPartyCompanyIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the thirdPartyCompanyIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThirdPartyCompanyIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getThirdPartyCompanyIds() {
        if (thirdPartyCompanyIds == null) {
            thirdPartyCompanyIds = new ArrayList<Long>();
        }
        return this.thirdPartyCompanyIds;
    }

}
