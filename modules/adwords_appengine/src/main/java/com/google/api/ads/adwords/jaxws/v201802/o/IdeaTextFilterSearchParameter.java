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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@link SearchParameter} for {@code KEYWORD} {@link IdeaType}s that
 *             specifies a collection of strings by which the results should be
 *             constrained. This guarantees that each idea in the result will match
 *             at least one of the {@code included} values.
 *             
 *             For this {@link SearchParameter}, excluded items will always take
 *             priority over included ones.
 *             
 *             This can handle a maximum of 200 (included + excluded) elements.
 *             <p>This element is supported by following {@link IdeaType}s: KEYWORD.
 *             <p>This element is supported by following {@link RequestType}s: IDEAS, STATS.
 *           
 * 
 * <p>Java class for IdeaTextFilterSearchParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdeaTextFilterSearchParameter">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/o/v201802}SearchParameter">
 *       &lt;sequence>
 *         &lt;element name="included" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="excluded" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdeaTextFilterSearchParameter", propOrder = {
    "included",
    "excluded"
})
public class IdeaTextFilterSearchParameter
    extends SearchParameter
{

    protected List<String> included;
    protected List<String> excluded;

    /**
     * Gets the value of the included property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the included property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncluded().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIncluded() {
        if (included == null) {
            included = new ArrayList<String>();
        }
        return this.included;
    }

    /**
     * Gets the value of the excluded property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excluded property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcluded().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExcluded() {
        if (excluded == null) {
            excluded = new ArrayList<String>();
        }
        return this.excluded;
    }

}
