
package com.google.api.ads.dfp.jaxws.v201408;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the actions that can be performed on {@link ContentMetadataKeyHierarchy} objects.
 *           
 * 
 * <p>Java class for ContentMetadataKeyHierarchyAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentMetadataKeyHierarchyAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContentMetadataKeyHierarchyAction.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentMetadataKeyHierarchyAction", propOrder = {
    "contentMetadataKeyHierarchyActionType"
})
@XmlSeeAlso({
    DeleteContentMetadataKeyHierarchies.class
})
public abstract class ContentMetadataKeyHierarchyAction {

    @XmlElement(name = "ContentMetadataKeyHierarchyAction.Type")
    protected String contentMetadataKeyHierarchyActionType;

    /**
     * Gets the value of the contentMetadataKeyHierarchyActionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentMetadataKeyHierarchyActionType() {
        return contentMetadataKeyHierarchyActionType;
    }

    /**
     * Sets the value of the contentMetadataKeyHierarchyActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentMetadataKeyHierarchyActionType(String value) {
        this.contentMetadataKeyHierarchyActionType = value;
    }

}
