// Copyright 2023 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202305;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Gets a {@link CreativeReviewPage} of {@link CreativeReview} objects that satisfy the given
 *             {@link Statement#query}. This will allow you to review creatives that have displayed (or could
 *             have displayed) on your pages or apps in the last 30 days. To ensure that you are always
 *             reviewing the most important creatives first, the {@link CreativeReview} objects are ranked
 *             according to the number of impressions that they've received.
 *             
 *             <p>This feature is not yet openly available. Publishers will need to apply for access for this
 *             feature through their account managers.
 *           
 * 
 * <p>Java class for getCreativeReviewsByStatement element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getCreativeReviewsByStatement"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="statement" type="{https://www.google.com/apis/ads/publisher/v202305}Statement" minOccurs="0"/&gt;
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
    "statement"
})
@XmlRootElement(name = "getCreativeReviewsByStatement")
public class CreativeReviewServiceInterfacegetCreativeReviewsByStatement {

    protected Statement statement;

    /**
     * Gets the value of the statement property.
     * 
     * @return
     *     possible object is
     *     {@link Statement }
     *     
     */
    public Statement getStatement() {
        return statement;
    }

    /**
     * Sets the value of the statement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement }
     *     
     */
    public void setStatement(Statement value) {
        this.statement = value;
    }

}
