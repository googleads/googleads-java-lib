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


package com.google.api.ads.admanager.jaxws.v202311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SdkMediationSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SdkMediationSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v202311}AbstractDisplaySettings"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parameters" type="{https://www.google.com/apis/ads/publisher/v202311}YieldParameter_StringMapEntry" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="yieldIntegrationType" type="{https://www.google.com/apis/ads/publisher/v202311}YieldIntegrationType" minOccurs="0"/&gt;
 *         &lt;element name="platform" type="{https://www.google.com/apis/ads/publisher/v202311}YieldPlatform" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SdkMediationSettings", propOrder = {
    "parameters",
    "yieldIntegrationType",
    "platform"
})
public class SdkMediationSettings
    extends AbstractDisplaySettings
{

    protected List<YieldParameterStringMapEntry> parameters;
    @XmlSchemaType(name = "string")
    protected YieldIntegrationType yieldIntegrationType;
    @XmlSchemaType(name = "string")
    protected YieldPlatform platform;

    /**
     * Gets the value of the parameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link YieldParameterStringMapEntry }
     * 
     * 
     */
    public List<YieldParameterStringMapEntry> getParameters() {
        if (parameters == null) {
            parameters = new ArrayList<YieldParameterStringMapEntry>();
        }
        return this.parameters;
    }

    /**
     * Gets the value of the yieldIntegrationType property.
     * 
     * @return
     *     possible object is
     *     {@link YieldIntegrationType }
     *     
     */
    public YieldIntegrationType getYieldIntegrationType() {
        return yieldIntegrationType;
    }

    /**
     * Sets the value of the yieldIntegrationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link YieldIntegrationType }
     *     
     */
    public void setYieldIntegrationType(YieldIntegrationType value) {
        this.yieldIntegrationType = value;
    }

    /**
     * Gets the value of the platform property.
     * 
     * @return
     *     possible object is
     *     {@link YieldPlatform }
     *     
     */
    public YieldPlatform getPlatform() {
        return platform;
    }

    /**
     * Sets the value of the platform property.
     * 
     * @param value
     *     allowed object is
     *     {@link YieldPlatform }
     *     
     */
    public void setPlatform(YieldPlatform value) {
        this.platform = value;
    }

}
