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


package com.google.api.ads.adwords.jaxws.v201802.rm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Applies a list of mutate operations (i.e. add, set) to offline data upload:
 *             
 *             <p>Add - uploads offline data for each entry in operations. Some operations can fail for upload
 *             level errors like invalid {@code UploadMetadata}. Check {@code OfflineDataUploadReturnValue}
 *             for partial failure list.
 *             
 *             <p>Set - updates the upload result for each upload. It is for internal use only.
 *             
 *             <p><b>Note:</b> For AdWords API, one ADD request can have at most 2000 operations.
 *             
 *             <p><b>Note:</b> Add operation might possibly succeed even with errors in {@code OfflineData}.
 *             Data errors are reported in {@link OfflineDataUpload#partialDataErrors}
 *             
 *             <p><b>Note:</b> Supports only the {@code ADD} operator. {@code SET} operator is internally used
 *             only.({@code REMOVE} is not supported).
 *             
 *             @param operations A list of offline data upload operations.
 *             @return The list of offline data upload results in the same order as operations.
 *             @throws {@link ApiException} if problems occur.
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
 *           &lt;element name="operations" type="{https://adwords.google.com/api/adwords/rm/v201802}OfflineDataUploadOperation" maxOccurs="unbounded" minOccurs="0"/>
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
public class OfflineDataUploadServiceInterfacemutate {

    protected List<OfflineDataUploadOperation> operations;

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
     * {@link OfflineDataUploadOperation }
     * 
     * 
     */
    public List<OfflineDataUploadOperation> getOperations() {
        if (operations == null) {
            operations = new ArrayList<OfflineDataUploadOperation>();
        }
        return this.operations;
    }

}
