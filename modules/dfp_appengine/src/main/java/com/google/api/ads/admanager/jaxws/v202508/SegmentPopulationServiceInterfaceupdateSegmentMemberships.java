// Copyright 2025 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202508;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Updates identifiers in an audience segment.
 *             
 *             <p>The returned {@link SegmentPopulationRequest#batchUploadId} can be used in subsequent
 *             requests to group them together as part of the same batch. The identifiers associated with a
 *             batch will not be processed until {@link #performSegmentPopulationAction} is called with a
 *             ProcessAction. The batch will expire if ProcessAction is not called within the TTL of 5 days.
 *           
 * 
 * <p>Java class for updateSegmentMemberships element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="updateSegmentMemberships"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="updateRequest" type="{https://www.google.com/apis/ads/publisher/v202508}SegmentPopulationRequest" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *     &lt;/complexContent&gt;
 *   &lt;/complexType&gt;
 * &lt;/element&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "updateRequest"
})
@XmlRootElement(name = "updateSegmentMemberships")
public class SegmentPopulationServiceInterfaceupdateSegmentMemberships {

    protected SegmentPopulationRequest updateRequest;

    /**
     * Gets the value of the updateRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentPopulationRequest }
     *     
     */
    public SegmentPopulationRequest getUpdateRequest() {
        return updateRequest;
    }

    /**
     * Sets the value of the updateRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentPopulationRequest }
     *     
     */
    public void setUpdateRequest(SegmentPopulationRequest value) {
        this.updateRequest = value;
    }

}
