// Copyright 2022 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202205;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Updates the specified {@link DaiAuthenticationKey} objects.
 *             
 *             @param daiAuthenticationKeys the video DAI authentication keys to update
 *             @return the updated DAI authentication keys
 *             @throws ApiException if there is an error updating the DAI authentication keys
 *           
 * 
 * <p>Java class for updateDaiAuthenticationKeys element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="updateDaiAuthenticationKeys">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="daiAuthenticationKeys" type="{https://www.google.com/apis/ads/publisher/v202205}DaiAuthenticationKey" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "daiAuthenticationKeys"
})
@XmlRootElement(name = "updateDaiAuthenticationKeys")
public class DaiAuthenticationKeyServiceInterfaceupdateDaiAuthenticationKeys {

    protected List<DaiAuthenticationKey> daiAuthenticationKeys;

    /**
     * Gets the value of the daiAuthenticationKeys property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the daiAuthenticationKeys property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDaiAuthenticationKeys().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DaiAuthenticationKey }
     * 
     * 
     */
    public List<DaiAuthenticationKey> getDaiAuthenticationKeys() {
        if (daiAuthenticationKeys == null) {
            daiAuthenticationKeys = new ArrayList<DaiAuthenticationKey>();
        }
        return this.daiAuthenticationKeys;
    }

}
