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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The result of a single mutate operation. Contains either the resulting Operand
 *             or the error(s) that occurred when attempting the mutate.
 *           
 * 
 * <p>Java class for MutateResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MutateResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{https://adwords.google.com/api/adwords/cm/v201802}Operand" minOccurs="0"/>
 *         &lt;element name="errorList" type="{https://adwords.google.com/api/adwords/cm/v201802}ErrorList" minOccurs="0"/>
 *         &lt;element name="index" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MutateResult", propOrder = {
    "result",
    "errorList",
    "index"
})
public class MutateResult {

    protected Operand result;
    protected ErrorList errorList;
    protected Long index;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link Operand }
     *     
     */
    public Operand getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operand }
     *     
     */
    public void setResult(Operand value) {
        this.result = value;
    }

    /**
     * Gets the value of the errorList property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorList }
     *     
     */
    public ErrorList getErrorList() {
        return errorList;
    }

    /**
     * Sets the value of the errorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorList }
     *     
     */
    public void setErrorList(ErrorList value) {
        this.errorList = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIndex(Long value) {
        this.index = value;
    }

}
