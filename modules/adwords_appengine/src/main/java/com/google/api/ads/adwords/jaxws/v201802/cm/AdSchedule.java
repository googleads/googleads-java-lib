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
 *             Represents an AdSchedule Criterion.
 *             AdSchedule is specified as day and time of the week criteria to target
 *             the Ads.
 *             <p><b>Note:</b> An AdSchedule may not have more than <b>six</b> intervals
 *             in a day.</p>
 *             <span class="constraint AdxEnabled">This is enabled for AdX.</span>
 *           
 * 
 * <p>Java class for AdSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdSchedule">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}Criterion">
 *       &lt;sequence>
 *         &lt;element name="dayOfWeek" type="{https://adwords.google.com/api/adwords/cm/v201802}DayOfWeek" minOccurs="0"/>
 *         &lt;element name="startHour" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="startMinute" type="{https://adwords.google.com/api/adwords/cm/v201802}MinuteOfHour" minOccurs="0"/>
 *         &lt;element name="endHour" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="endMinute" type="{https://adwords.google.com/api/adwords/cm/v201802}MinuteOfHour" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdSchedule", propOrder = {
    "dayOfWeek",
    "startHour",
    "startMinute",
    "endHour",
    "endMinute"
})
public class AdSchedule
    extends Criterion
{

    @XmlSchemaType(name = "string")
    protected DayOfWeek dayOfWeek;
    protected Integer startHour;
    @XmlSchemaType(name = "string")
    protected MinuteOfHour startMinute;
    protected Integer endHour;
    @XmlSchemaType(name = "string")
    protected MinuteOfHour endMinute;

    /**
     * Gets the value of the dayOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeek }
     *     
     */
    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * Sets the value of the dayOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeek }
     *     
     */
    public void setDayOfWeek(DayOfWeek value) {
        this.dayOfWeek = value;
    }

    /**
     * Gets the value of the startHour property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartHour() {
        return startHour;
    }

    /**
     * Sets the value of the startHour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartHour(Integer value) {
        this.startHour = value;
    }

    /**
     * Gets the value of the startMinute property.
     * 
     * @return
     *     possible object is
     *     {@link MinuteOfHour }
     *     
     */
    public MinuteOfHour getStartMinute() {
        return startMinute;
    }

    /**
     * Sets the value of the startMinute property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinuteOfHour }
     *     
     */
    public void setStartMinute(MinuteOfHour value) {
        this.startMinute = value;
    }

    /**
     * Gets the value of the endHour property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEndHour() {
        return endHour;
    }

    /**
     * Sets the value of the endHour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEndHour(Integer value) {
        this.endHour = value;
    }

    /**
     * Gets the value of the endMinute property.
     * 
     * @return
     *     possible object is
     *     {@link MinuteOfHour }
     *     
     */
    public MinuteOfHour getEndMinute() {
        return endMinute;
    }

    /**
     * Sets the value of the endMinute property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinuteOfHour }
     *     
     */
    public void setEndMinute(MinuteOfHour value) {
        this.endMinute = value;
    }

}
