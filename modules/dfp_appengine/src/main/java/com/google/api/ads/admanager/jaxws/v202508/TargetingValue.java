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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Contains a {@link Targeting} value.
 *             
 *             <p><b>This object is experimental! <code>TargetingValue</code> is an experimental, innovative,
 *             and rapidly changing new feature for Ad Manager. Unfortunately, being on the bleeding edge means
 *             that we may make backwards-incompatible changes to <code>TargetingValue</code>. We will inform
 *             the community when this feature is no longer experimental.</b>
 *           
 * 
 * <p>Java class for TargetingValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetingValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v202508}ObjectValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="value" type="{https://www.google.com/apis/ads/publisher/v202508}Targeting" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetingValue", propOrder = {
    "value"
})
public class TargetingValue
    extends ObjectValue
{

    protected Targeting value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Targeting }
     *     
     */
    public Targeting getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Targeting }
     *     
     */
    public void setValue(Targeting value) {
        this.value = value;
    }

}
