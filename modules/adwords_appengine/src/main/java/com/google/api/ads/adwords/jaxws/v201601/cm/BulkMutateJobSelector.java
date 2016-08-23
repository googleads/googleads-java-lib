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


package com.google.api.ads.adwords.jaxws.v201601.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Specifies additional criteria for selecting bulk mutate jobs.
 *           
 * 
 * <p>Java class for BulkMutateJobSelector complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BulkMutateJobSelector">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201601}JobSelector">
 *       &lt;sequence>
 *         &lt;element name="jobIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="resultPartIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BulkMutateJobSelector", propOrder = {
    "jobIds",
    "resultPartIndex"
})
public class BulkMutateJobSelector
    extends JobSelector
{

    @XmlElement(type = Long.class)
    protected List<Long> jobIds;
    protected Integer resultPartIndex;

    /**
     * Gets the value of the jobIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getJobIds() {
        if (jobIds == null) {
            jobIds = new ArrayList<Long>();
        }
        return this.jobIds;
    }

    /**
     * Gets the value of the resultPartIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResultPartIndex() {
        return resultPartIndex;
    }

    /**
     * Sets the value of the resultPartIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResultPartIndex(Integer value) {
        this.resultPartIndex = value;
    }

}
