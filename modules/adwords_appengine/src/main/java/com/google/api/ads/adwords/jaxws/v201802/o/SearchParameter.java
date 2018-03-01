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


package com.google.api.ads.adwords.jaxws.v201802.o;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A set of {@link SearchParameter}s is supplied to the {@link TargetingIdeaSelector} to specify how
 *             the user wants to filter the set of all possible {@link TargetingIdea}s.
 *             
 *             <p>There is a {@link SearchParameter} for each type of input.
 *             {@link SearchParameter}s can conceptually be broken down into two types.</p>
 *             
 *             <ul>
 *             <li>Input {@link SearchParameter}s provide the seed information from which
 *             ideas or stats are to be generated (e.g., {@link RelatedToQuerySearchParameter},
 *             {@link RelatedToUrlSearchParameter}, etc.). This type of {@link SearchParameters}
 *             is required in requests.
 *             <li>Filter {@link SearchParameter}s (e.g., {@link CompetitionSearchParameter}, etc.)
 *             are used to trim down the results based on {@link Attribute}-related information.
 *             </ul>
 *             
 *             <p>A request should only contain one instance of each {@link SearchParameter}.
 *             Requests containing multiple instances of the same search parameter will be
 *             rejected.</p>
 *             <p>One or more of the following {@link SearchParameter}s are required:<br/>
 * <ul><li>{@link CategoryProductsAndServicesSearchParameter}</li>
 * <li>{@link LocationSearchParameter}</li>
 * <li>{@link RelatedToQuerySearchParameter}</li>
 * <li>{@link RelatedToUrlSearchParameter}</li>
 * <li>{@link SeedAdGroupIdSearchParameter}</li>
 * </ul><p>
 * <p><b>{@link IdeaType} KEYWORD supports following {@link SearchParameter}s:</b><br/>
 * <ul>
 * <li>{@link CategoryProductsAndServicesSearchParameter}</li>
 * <li>{@link CompetitionSearchParameter}</li>
 * <li>{@link IdeaTextFilterSearchParameter}</li>
 * <li>{@link IncludeAdultContentSearchParameter}</li>
 * <li>{@link LanguageSearchParameter}</li>
 * <li>{@link LocationSearchParameter}</li>
 * <li>{@link NetworkSearchParameter}</li>
 * <li>{@link RelatedToQuerySearchParameter}</li>
 * <li>{@link RelatedToUrlSearchParameter}</li>
 * <li>{@link SearchVolumeSearchParameter}</li>
 * <li>{@link SeedAdGroupIdSearchParameter}</li>
 * </ul><p>
 *           
 * 
 * <p>Java class for SearchParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchParameter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchParameter.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchParameter", propOrder = {
    "searchParameterType"
})
@XmlSeeAlso({
    SeedAdGroupIdSearchParameter.class,
    CategoryProductsAndServicesSearchParameter.class,
    IdeaTextFilterSearchParameter.class,
    RelatedToUrlSearchParameter.class,
    LanguageSearchParameter.class,
    CompetitionSearchParameter.class,
    SearchVolumeSearchParameter.class,
    LocationSearchParameter.class,
    NetworkSearchParameter.class,
    IncludeAdultContentSearchParameter.class,
    RelatedToQuerySearchParameter.class
})
public abstract class SearchParameter {

    @XmlElement(name = "SearchParameter.Type")
    protected String searchParameterType;

    /**
     * Gets the value of the searchParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchParameterType() {
        return searchParameterType;
    }

    /**
     * Sets the value of the searchParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchParameterType(String value) {
        this.searchParameterType = value;
    }

}
