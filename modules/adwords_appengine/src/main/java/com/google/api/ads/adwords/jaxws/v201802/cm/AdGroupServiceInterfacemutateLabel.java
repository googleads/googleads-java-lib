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
 *             Adds labels to the {@linkplain AdGroup ad group} or removes {@linkplain Label label}s from the
 *             {@linkplain AdGroup ad group}.
 *             <p>{@code ADD} -- Apply an existing label to an existing {@linkplain AdGroup ad group}.
 *             The {@code adGroupId} must reference an existing {@linkplain AdGroup ad group}. The
 *             {@code labelId} must reference an existing {@linkplain Label label}.
 *             <p>{@code REMOVE} -- Removes the link between the specified {@linkplain AdGroup ad group}
 *             and a {@linkplain Label label}.</p>
 *             
 *             @param operations the operations to apply.
 *             @return a list of {@linkplain AdGroupLabel}s where each entry in the list is the result of
 *             applying the operation in the input list with the same index. For an
 *             add operation, the returned AdGroupLabel contains the AdGroupId and the LabelId.
 *             In the case of a remove operation, the returned AdGroupLabel will only have AdGroupId.
 *             @throws ApiException when there are one or more errors with the request.
 *           
 * 
 * <p>Java class for mutateLabel element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="mutateLabel">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="operations" type="{https://adwords.google.com/api/adwords/cm/v201802}AdGroupLabelOperation" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlRootElement(name = "mutateLabel")
public class AdGroupServiceInterfacemutateLabel {

    protected List<AdGroupLabelOperation> operations;

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
     * {@link AdGroupLabelOperation }
     * 
     * 
     */
    public List<AdGroupLabelOperation> getOperations() {
        if (operations == null) {
            operations = new ArrayList<AdGroupLabelOperation>();
        }
        return this.operations;
    }

}
