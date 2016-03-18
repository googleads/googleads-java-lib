
package com.google.api.ads.dfp.jaxws.v201511;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code ContentMetadataKeyHierarchyLevel} represents one level in a
 *             {@link ContentMetadataKeyHierarchy}. The level consists of a {@link CustomTargetingKey}
 *             and an integer that represents the level's position in the hierarchy.
 *           
 * 
 * <p>Java class for ContentMetadataKeyHierarchyLevel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentMetadataKeyHierarchyLevel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customTargetingKeyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="hierarchyLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentMetadataKeyHierarchyLevel", propOrder = {
    "customTargetingKeyId",
    "hierarchyLevel"
})
public class ContentMetadataKeyHierarchyLevel {

    protected Long customTargetingKeyId;
    protected Integer hierarchyLevel;

    /**
     * Gets the value of the customTargetingKeyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomTargetingKeyId() {
        return customTargetingKeyId;
    }

    /**
     * Sets the value of the customTargetingKeyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomTargetingKeyId(Long value) {
        this.customTargetingKeyId = value;
    }

    /**
     * Gets the value of the hierarchyLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHierarchyLevel() {
        return hierarchyLevel;
    }

    /**
     * Sets the value of the hierarchyLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHierarchyLevel(Integer value) {
        this.hierarchyLevel = value;
    }

}
