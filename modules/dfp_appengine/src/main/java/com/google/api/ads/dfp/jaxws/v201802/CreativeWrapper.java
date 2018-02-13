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


package com.google.api.ads.dfp.jaxws.v201802;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code CreativeWrapper} allows the wrapping of HTML snippets to be
 *             served along with {@code Creative} objects.
 *             <p>
 *             Creative wrappers must be associated with a
 *             {@link LabelType#CREATIVE_WRAPPER} label and applied to ad units by
 *             {@link AdUnit#appliedLabels}.
 *           
 * 
 * <p>Java class for CreativeWrapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreativeWrapper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="labelId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="htmlHeader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="htmlFooter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ampHead" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ampBody" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ordering" type="{https://www.google.com/apis/ads/publisher/v201802}CreativeWrapperOrdering" minOccurs="0"/>
 *         &lt;element name="status" type="{https://www.google.com/apis/ads/publisher/v201802}CreativeWrapperStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreativeWrapper", propOrder = {
    "id",
    "labelId",
    "htmlHeader",
    "htmlFooter",
    "ampHead",
    "ampBody",
    "ordering",
    "status"
})
public class CreativeWrapper {

    protected Long id;
    protected Long labelId;
    protected String htmlHeader;
    protected String htmlFooter;
    protected String ampHead;
    protected String ampBody;
    @XmlSchemaType(name = "string")
    protected CreativeWrapperOrdering ordering;
    @XmlSchemaType(name = "string")
    protected CreativeWrapperStatus status;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the labelId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLabelId() {
        return labelId;
    }

    /**
     * Sets the value of the labelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLabelId(Long value) {
        this.labelId = value;
    }

    /**
     * Gets the value of the htmlHeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtmlHeader() {
        return htmlHeader;
    }

    /**
     * Sets the value of the htmlHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtmlHeader(String value) {
        this.htmlHeader = value;
    }

    /**
     * Gets the value of the htmlFooter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtmlFooter() {
        return htmlFooter;
    }

    /**
     * Sets the value of the htmlFooter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtmlFooter(String value) {
        this.htmlFooter = value;
    }

    /**
     * Gets the value of the ampHead property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmpHead() {
        return ampHead;
    }

    /**
     * Sets the value of the ampHead property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmpHead(String value) {
        this.ampHead = value;
    }

    /**
     * Gets the value of the ampBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmpBody() {
        return ampBody;
    }

    /**
     * Sets the value of the ampBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmpBody(String value) {
        this.ampBody = value;
    }

    /**
     * Gets the value of the ordering property.
     * 
     * @return
     *     possible object is
     *     {@link CreativeWrapperOrdering }
     *     
     */
    public CreativeWrapperOrdering getOrdering() {
        return ordering;
    }

    /**
     * Sets the value of the ordering property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreativeWrapperOrdering }
     *     
     */
    public void setOrdering(CreativeWrapperOrdering value) {
        this.ordering = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CreativeWrapperStatus }
     *     
     */
    public CreativeWrapperStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreativeWrapperStatus }
     *     
     */
    public void setStatus(CreativeWrapperStatus value) {
        this.status = value;
    }

}
