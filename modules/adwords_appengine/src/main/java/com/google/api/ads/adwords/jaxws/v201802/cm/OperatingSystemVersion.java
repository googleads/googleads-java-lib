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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents an Operating System Version Criterion.
 *             <a href="/adwords/api/docs/appendix/mobileplatforms">View the complete
 *             list of available mobile platforms</a>. You can also get the list from
 *             {@link ConstantDataService#getOperatingSystemVersionCriterion ConstantDataService}.
 *             <p>A criterion of this type can only be created using an ID. A criterion of this type can be either targeted or excluded.
 *             <span class="constraint AdxEnabled">This is enabled for AdX.</span>
 *           
 * 
 * <p>Java class for OperatingSystemVersion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperatingSystemVersion">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}Criterion">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="osMajorVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="osMinorVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="operatorType" type="{https://adwords.google.com/api/adwords/cm/v201802}OperatingSystemVersion.OperatorType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatingSystemVersion", propOrder = {
    "name",
    "osMajorVersion",
    "osMinorVersion",
    "operatorType"
})
public class OperatingSystemVersion
    extends Criterion
{

    protected String name;
    protected Integer osMajorVersion;
    protected Integer osMinorVersion;
    @XmlSchemaType(name = "string")
    protected OperatingSystemVersionOperatorType operatorType;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the osMajorVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOsMajorVersion() {
        return osMajorVersion;
    }

    /**
     * Sets the value of the osMajorVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOsMajorVersion(Integer value) {
        this.osMajorVersion = value;
    }

    /**
     * Gets the value of the osMinorVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOsMinorVersion() {
        return osMinorVersion;
    }

    /**
     * Sets the value of the osMinorVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOsMinorVersion(Integer value) {
        this.osMinorVersion = value;
    }

    /**
     * Gets the value of the operatorType property.
     * 
     * @return
     *     possible object is
     *     {@link OperatingSystemVersionOperatorType }
     *     
     */
    public OperatingSystemVersionOperatorType getOperatorType() {
        return operatorType;
    }

    /**
     * Sets the value of the operatorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingSystemVersionOperatorType }
     *     
     */
    public void setOperatorType(OperatingSystemVersionOperatorType value) {
        this.operatorType = value;
    }

}
