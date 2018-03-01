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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             UserList of CRM users provided by the advertiser.
 *           
 * 
 * <p>Java class for CrmBasedUserList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrmBasedUserList">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/rm/v201802}UserList">
 *       &lt;sequence>
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uploadKeyType" type="{https://adwords.google.com/api/adwords/rm/v201802}CustomerMatchUploadKeyType" minOccurs="0"/>
 *         &lt;element name="dataSourceType" type="{https://adwords.google.com/api/adwords/rm/v201802}CrmDataSourceType" minOccurs="0"/>
 *         &lt;element name="dataUploadResult" type="{https://adwords.google.com/api/adwords/rm/v201802}DataUploadResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrmBasedUserList", propOrder = {
    "appId",
    "uploadKeyType",
    "dataSourceType",
    "dataUploadResult"
})
public class CrmBasedUserList
    extends UserList
{

    protected String appId;
    @XmlSchemaType(name = "string")
    protected CustomerMatchUploadKeyType uploadKeyType;
    @XmlSchemaType(name = "string")
    protected CrmDataSourceType dataSourceType;
    protected DataUploadResult dataUploadResult;

    /**
     * Gets the value of the appId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppId() {
        return appId;
    }

    /**
     * Sets the value of the appId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppId(String value) {
        this.appId = value;
    }

    /**
     * Gets the value of the uploadKeyType property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerMatchUploadKeyType }
     *     
     */
    public CustomerMatchUploadKeyType getUploadKeyType() {
        return uploadKeyType;
    }

    /**
     * Sets the value of the uploadKeyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerMatchUploadKeyType }
     *     
     */
    public void setUploadKeyType(CustomerMatchUploadKeyType value) {
        this.uploadKeyType = value;
    }

    /**
     * Gets the value of the dataSourceType property.
     * 
     * @return
     *     possible object is
     *     {@link CrmDataSourceType }
     *     
     */
    public CrmDataSourceType getDataSourceType() {
        return dataSourceType;
    }

    /**
     * Sets the value of the dataSourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrmDataSourceType }
     *     
     */
    public void setDataSourceType(CrmDataSourceType value) {
        this.dataSourceType = value;
    }

    /**
     * Gets the value of the dataUploadResult property.
     * 
     * @return
     *     possible object is
     *     {@link DataUploadResult }
     *     
     */
    public DataUploadResult getDataUploadResult() {
        return dataUploadResult;
    }

    /**
     * Sets the value of the dataUploadResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataUploadResult }
     *     
     */
    public void setDataUploadResult(DataUploadResult value) {
        this.dataUploadResult = value;
    }

}
