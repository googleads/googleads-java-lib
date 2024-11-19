// Copyright 2024 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202411;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             {@code GrpSettings} contains information for a line item that will have a target demographic when
 *             serving. This information will be used to set up tracking and enable reporting on the demographic
 *             information.
 *           
 * 
 * <p>Java class for GrpSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrpSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="minTargetAge" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="maxTargetAge" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="targetGender" type="{https://www.google.com/apis/ads/publisher/v202411}GrpTargetGender" minOccurs="0"/&gt;
 *         &lt;element name="provider" type="{https://www.google.com/apis/ads/publisher/v202411}GrpProvider" minOccurs="0"/&gt;
 *         &lt;element name="inTargetRatioEstimateMilliPercent" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="nielsenCtvPacingType" type="{https://www.google.com/apis/ads/publisher/v202411}NielsenCtvPacingType" minOccurs="0"/&gt;
 *         &lt;element name="pacingDeviceCategorizationType" type="{https://www.google.com/apis/ads/publisher/v202411}PacingDeviceCategorizationType" minOccurs="0"/&gt;
 *         &lt;element name="applyTrueCoview" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrpSettings", propOrder = {
    "minTargetAge",
    "maxTargetAge",
    "targetGender",
    "provider",
    "inTargetRatioEstimateMilliPercent",
    "nielsenCtvPacingType",
    "pacingDeviceCategorizationType",
    "applyTrueCoview"
})
public class GrpSettings {

    protected Long minTargetAge;
    protected Long maxTargetAge;
    @XmlSchemaType(name = "string")
    protected GrpTargetGender targetGender;
    @XmlSchemaType(name = "string")
    protected GrpProvider provider;
    protected Long inTargetRatioEstimateMilliPercent;
    @XmlSchemaType(name = "string")
    protected NielsenCtvPacingType nielsenCtvPacingType;
    @XmlSchemaType(name = "string")
    protected PacingDeviceCategorizationType pacingDeviceCategorizationType;
    protected Boolean applyTrueCoview;

    /**
     * Gets the value of the minTargetAge property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMinTargetAge() {
        return minTargetAge;
    }

    /**
     * Sets the value of the minTargetAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMinTargetAge(Long value) {
        this.minTargetAge = value;
    }

    /**
     * Gets the value of the maxTargetAge property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxTargetAge() {
        return maxTargetAge;
    }

    /**
     * Sets the value of the maxTargetAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxTargetAge(Long value) {
        this.maxTargetAge = value;
    }

    /**
     * Gets the value of the targetGender property.
     * 
     * @return
     *     possible object is
     *     {@link GrpTargetGender }
     *     
     */
    public GrpTargetGender getTargetGender() {
        return targetGender;
    }

    /**
     * Sets the value of the targetGender property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrpTargetGender }
     *     
     */
    public void setTargetGender(GrpTargetGender value) {
        this.targetGender = value;
    }

    /**
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link GrpProvider }
     *     
     */
    public GrpProvider getProvider() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrpProvider }
     *     
     */
    public void setProvider(GrpProvider value) {
        this.provider = value;
    }

    /**
     * Gets the value of the inTargetRatioEstimateMilliPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInTargetRatioEstimateMilliPercent() {
        return inTargetRatioEstimateMilliPercent;
    }

    /**
     * Sets the value of the inTargetRatioEstimateMilliPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInTargetRatioEstimateMilliPercent(Long value) {
        this.inTargetRatioEstimateMilliPercent = value;
    }

    /**
     * Gets the value of the nielsenCtvPacingType property.
     * 
     * @return
     *     possible object is
     *     {@link NielsenCtvPacingType }
     *     
     */
    public NielsenCtvPacingType getNielsenCtvPacingType() {
        return nielsenCtvPacingType;
    }

    /**
     * Sets the value of the nielsenCtvPacingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NielsenCtvPacingType }
     *     
     */
    public void setNielsenCtvPacingType(NielsenCtvPacingType value) {
        this.nielsenCtvPacingType = value;
    }

    /**
     * Gets the value of the pacingDeviceCategorizationType property.
     * 
     * @return
     *     possible object is
     *     {@link PacingDeviceCategorizationType }
     *     
     */
    public PacingDeviceCategorizationType getPacingDeviceCategorizationType() {
        return pacingDeviceCategorizationType;
    }

    /**
     * Sets the value of the pacingDeviceCategorizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PacingDeviceCategorizationType }
     *     
     */
    public void setPacingDeviceCategorizationType(PacingDeviceCategorizationType value) {
        this.pacingDeviceCategorizationType = value;
    }

    /**
     * Gets the value of the applyTrueCoview property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplyTrueCoview() {
        return applyTrueCoview;
    }

    /**
     * Sets the value of the applyTrueCoview property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplyTrueCoview(Boolean value) {
        this.applyTrueCoview = value;
    }

}
