// Copyright 2016 Google Inc. All Rights Reserved.
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


package com.google.api.ads.adwords.jaxws.v201607.express;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201607.cm.Criterion;


/**
 * 
 *             A negative criterion. It wraps a {@link Criterion} and will be associated with an ad group as a
 *             {@code NegativeAdGroupCriterion}.
 *             <span class="constraint AdxEnabled">This is disabled for AdX when it is contained within Operators: ADD, SET.</span>
 *           
 * 
 * <p>Java class for NegativeCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NegativeCriterion">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201607}Criterion">
 *       &lt;sequence>
 *         &lt;element name="criterion" type="{https://adwords.google.com/api/adwords/cm/v201607}Criterion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NegativeCriterion", propOrder = {
    "criterion"
})
public class NegativeCriterion
    extends Criterion
{

    protected Criterion criterion;

    /**
     * Gets the value of the criterion property.
     * 
     * @return
     *     possible object is
     *     {@link Criterion }
     *     
     */
    public Criterion getCriterion() {
        return criterion;
    }

    /**
     * Sets the value of the criterion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Criterion }
     *     
     */
    public void setCriterion(Criterion value) {
        this.criterion = value;
    }

}
