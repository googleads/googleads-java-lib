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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Applies the list of mutate operations such as adding or updating conversion trackers.
 *             <p class="note"><b>Note:</b> {@link ConversionTrackerOperation} does not support the
 *             <code>REMOVE</code> operator. In order to 'disable' a conversion type, send a
 *             <code>SET</code> operation for the conversion tracker with the <code>status</code>
 *             property set to <code>DISABLED</code></p>
 *             
 *             <p>You can mutate any ConversionTracker that belongs to your account. You may not
 *             mutate a ConversionTracker that belongs to some other account. You may not directly
 *             mutate a system-defined ConversionTracker, but you can create a mutable copy of it
 *             in your account by sending a mutate request with an ADD operation specifying
 *             an originalConversionTypeId matching a system-defined conversion tracker's ID. That new
 *             ADDed ConversionTracker will inherit the statistics and properties
 *             of the system-defined type, but will be editable as usual.</p>
 *             
 *             @param operations A list of mutate operations to perform.
 *             @return The list of the conversion trackers as they appear after mutation,
 *             in the same order as they appeared in the list of operations.
 *             @throws com.google.ads.api.services.common.error.ApiException if problems
 *             occurred while updating the data.
 *           
 * 
 * <p>Java class for mutate element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="mutate">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="operations" type="{https://adwords.google.com/api/adwords/cm/v201802}ConversionTrackerOperation" maxOccurs="unbounded" minOccurs="0"/>
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
    "operations"
})
@XmlRootElement(name = "mutate")
public class ConversionTrackerServiceInterfacemutate {

    protected List<ConversionTrackerOperation> operations;

    /**
     * Gets the value of the operations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConversionTrackerOperation }
     * 
     * 
     */
    public List<ConversionTrackerOperation> getOperations() {
        if (operations == null) {
            operations = new ArrayList<ConversionTrackerOperation>();
        }
        return this.operations;
    }

}
