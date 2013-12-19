
package com.google.api.ads.dfp.jaxws.v201308;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             An additional, user-created field on an entity.
 *           
 * 
 * <p>Java class for CustomField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="entityType" type="{https://www.google.com/apis/ads/publisher/v201308}CustomFieldEntityType" minOccurs="0"/>
 *         &lt;element name="dataType" type="{https://www.google.com/apis/ads/publisher/v201308}CustomFieldDataType" minOccurs="0"/>
 *         &lt;element name="visibility" type="{https://www.google.com/apis/ads/publisher/v201308}CustomFieldVisibility" minOccurs="0"/>
 *         &lt;element name="CustomField.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomField", propOrder = {
    "id",
    "name",
    "description",
    "isActive",
    "entityType",
    "dataType",
    "visibility",
    "customFieldType"
})
@XmlSeeAlso({
    DropDownCustomField.class
})
public class CustomField {

    protected Long id;
    protected String name;
    protected String description;
    protected Boolean isActive;
    protected CustomFieldEntityType entityType;
    protected CustomFieldDataType dataType;
    protected CustomFieldVisibility visibility;
    @XmlElement(name = "CustomField.Type")
    protected String customFieldType;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldEntityType }
     *     
     */
    public CustomFieldEntityType getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldEntityType }
     *     
     */
    public void setEntityType(CustomFieldEntityType value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldDataType }
     *     
     */
    public CustomFieldDataType getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldDataType }
     *     
     */
    public void setDataType(CustomFieldDataType value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldVisibility }
     *     
     */
    public CustomFieldVisibility getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldVisibility }
     *     
     */
    public void setVisibility(CustomFieldVisibility value) {
        this.visibility = value;
    }

    /**
     * Gets the value of the customFieldType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomFieldType() {
        return customFieldType;
    }

    /**
     * Sets the value of the customFieldType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomFieldType(String value) {
        this.customFieldType = value;
    }

}
