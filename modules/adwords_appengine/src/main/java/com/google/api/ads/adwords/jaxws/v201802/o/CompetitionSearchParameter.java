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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@link SearchParameter} for {@code KEYWORD} {@link IdeaType}s used to
 *             filter the results by the amount of competition (eg: LOW, MEDIUM, HIGH).
 *             <p>This element is supported by following {@link IdeaType}s: KEYWORD.
 *             <p>This element is supported by following {@link RequestType}s: IDEAS, STATS.
 *           
 * 
 * <p>Java class for CompetitionSearchParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompetitionSearchParameter">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/o/v201802}SearchParameter">
 *       &lt;sequence>
 *         &lt;element name="levels" type="{https://adwords.google.com/api/adwords/o/v201802}CompetitionSearchParameter.Level" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompetitionSearchParameter", propOrder = {
    "levels"
})
public class CompetitionSearchParameter
    extends SearchParameter
{

    @XmlSchemaType(name = "string")
    protected List<CompetitionSearchParameterLevel> levels;

    /**
     * Gets the value of the levels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the levels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLevels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompetitionSearchParameterLevel }
     * 
     * 
     */
    public List<CompetitionSearchParameterLevel> getLevels() {
        if (levels == null) {
            levels = new ArrayList<CompetitionSearchParameterLevel>();
        }
        return this.levels;
    }

}
