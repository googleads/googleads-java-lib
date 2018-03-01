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
 *             Applies the list of mutate operations (ie. add, set, remove):
 *             <p>Add - Creates a new {@linkplain AdGroupAd ad group ad}. The
 *             {@code adGroupId} must
 *             reference an existing ad group. The child {@code Ad} must be sufficiently
 *             specified by constructing a concrete ad type (such as {@code TextAd})
 *             and setting its fields accordingly.</p>
 *             <p>Set - Updates an ad group ad. Except for {@code status},
 *             ad group ad fields are not mutable. Status updates are
 *             straightforward - the status of the ad group ad is updated as
 *             specified. If any other field has changed, it will be ignored. If
 *             you want to change any of the fields other than status, you must
 *             make a new ad and then remove the old one.</p>
 *             <p>Remove - Removes the link between the specified AdGroup and
 *             Ad.</p>
 *             @param operations The operations to apply.
 *             @return A list of AdGroupAds where each entry in the list is the result of
 *             applying the operation in the input list with the same index. For an
 *             add/set operation, the return AdGroupAd will be what is saved to the db.
 *             In the case of the remove operation, the return AdGroupAd will simply be
 *             an AdGroupAd containing an Ad with the id set to the Ad being removed from
 *             the AdGroup.
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
 *           &lt;element name="operations" type="{https://adwords.google.com/api/adwords/cm/v201802}AdGroupAdOperation" maxOccurs="unbounded" minOccurs="0"/>
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
public class AdGroupAdServiceInterfacemutate {

    protected List<AdGroupAdOperation> operations;

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
     * {@link AdGroupAdOperation }
     * 
     * 
     */
    public List<AdGroupAdOperation> getOperations() {
        if (operations == null) {
            operations = new ArrayList<AdGroupAdOperation>();
        }
        return this.operations;
    }

}
