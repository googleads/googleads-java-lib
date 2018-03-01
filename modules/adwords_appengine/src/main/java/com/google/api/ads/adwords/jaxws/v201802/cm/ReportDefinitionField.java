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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the fields that can be used to create a ReportDefinition.
 *             This class allows the user to query the list of fields applicable to a
 *             given report type. Consumers of reports will be able use the retrieved
 *             fields through the {@link ReportDefinitionService#getReportFields}
 *             api and run the corresponding reports.
 *           
 * 
 * <p>Java class for ReportDefinitionField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportDefinitionField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayFieldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xmlAttributeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldBehavior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enumValues" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="canSelect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="canFilter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isEnumType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isBeta" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isZeroRowCompatible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enumValuePairs" type="{https://adwords.google.com/api/adwords/cm/v201802}EnumValuePair" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="exclusiveFields" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportDefinitionField", propOrder = {
    "fieldName",
    "displayFieldName",
    "xmlAttributeName",
    "fieldType",
    "fieldBehavior",
    "enumValues",
    "canSelect",
    "canFilter",
    "isEnumType",
    "isBeta",
    "isZeroRowCompatible",
    "enumValuePairs",
    "exclusiveFields"
})
public class ReportDefinitionField {

    protected String fieldName;
    protected String displayFieldName;
    protected String xmlAttributeName;
    protected String fieldType;
    protected String fieldBehavior;
    protected List<String> enumValues;
    protected Boolean canSelect;
    protected Boolean canFilter;
    protected Boolean isEnumType;
    protected Boolean isBeta;
    protected Boolean isZeroRowCompatible;
    protected List<EnumValuePair> enumValuePairs;
    protected List<String> exclusiveFields;

    /**
     * Gets the value of the fieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    /**
     * Gets the value of the displayFieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayFieldName() {
        return displayFieldName;
    }

    /**
     * Sets the value of the displayFieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayFieldName(String value) {
        this.displayFieldName = value;
    }

    /**
     * Gets the value of the xmlAttributeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlAttributeName() {
        return xmlAttributeName;
    }

    /**
     * Sets the value of the xmlAttributeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlAttributeName(String value) {
        this.xmlAttributeName = value;
    }

    /**
     * Gets the value of the fieldType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldType() {
        return fieldType;
    }

    /**
     * Sets the value of the fieldType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldType(String value) {
        this.fieldType = value;
    }

    /**
     * Gets the value of the fieldBehavior property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldBehavior() {
        return fieldBehavior;
    }

    /**
     * Sets the value of the fieldBehavior property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldBehavior(String value) {
        this.fieldBehavior = value;
    }

    /**
     * Gets the value of the enumValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enumValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnumValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEnumValues() {
        if (enumValues == null) {
            enumValues = new ArrayList<String>();
        }
        return this.enumValues;
    }

    /**
     * Gets the value of the canSelect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanSelect() {
        return canSelect;
    }

    /**
     * Sets the value of the canSelect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanSelect(Boolean value) {
        this.canSelect = value;
    }

    /**
     * Gets the value of the canFilter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanFilter() {
        return canFilter;
    }

    /**
     * Sets the value of the canFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanFilter(Boolean value) {
        this.canFilter = value;
    }

    /**
     * Gets the value of the isEnumType property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEnumType() {
        return isEnumType;
    }

    /**
     * Sets the value of the isEnumType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEnumType(Boolean value) {
        this.isEnumType = value;
    }

    /**
     * Gets the value of the isBeta property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBeta() {
        return isBeta;
    }

    /**
     * Sets the value of the isBeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBeta(Boolean value) {
        this.isBeta = value;
    }

    /**
     * Gets the value of the isZeroRowCompatible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsZeroRowCompatible() {
        return isZeroRowCompatible;
    }

    /**
     * Sets the value of the isZeroRowCompatible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsZeroRowCompatible(Boolean value) {
        this.isZeroRowCompatible = value;
    }

    /**
     * Gets the value of the enumValuePairs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enumValuePairs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnumValuePairs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnumValuePair }
     * 
     * 
     */
    public List<EnumValuePair> getEnumValuePairs() {
        if (enumValuePairs == null) {
            enumValuePairs = new ArrayList<EnumValuePair>();
        }
        return this.enumValuePairs;
    }

    /**
     * Gets the value of the exclusiveFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exclusiveFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExclusiveFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExclusiveFields() {
        if (exclusiveFields == null) {
            exclusiveFields = new ArrayList<String>();
        }
        return this.exclusiveFields;
    }

}
