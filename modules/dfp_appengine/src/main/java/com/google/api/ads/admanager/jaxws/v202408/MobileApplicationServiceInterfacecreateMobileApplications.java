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


package com.google.api.ads.admanager.jaxws.v202408;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Creates and claims {@link MobileApplication mobile applications} to be used for targeting in
 *             the network.
 *           
 * 
 * <p>Java class for createMobileApplications element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="createMobileApplications"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="mobileApplications" type="{https://www.google.com/apis/ads/publisher/v202408}MobileApplication" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "mobileApplications"
})
@XmlRootElement(name = "createMobileApplications")
public class MobileApplicationServiceInterfacecreateMobileApplications {

    protected List<MobileApplication> mobileApplications;

    /**
     * Gets the value of the mobileApplications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mobileApplications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMobileApplications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MobileApplication }
     * 
     * 
     */
    public List<MobileApplication> getMobileApplications() {
        if (mobileApplications == null) {
            mobileApplications = new ArrayList<MobileApplication>();
        }
        return this.mobileApplications;
    }

}
