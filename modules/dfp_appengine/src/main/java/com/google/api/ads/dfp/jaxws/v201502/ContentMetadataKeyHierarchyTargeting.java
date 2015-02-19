
package com.google.api.ads.dfp.jaxws.v201502;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents one or more {@link CustomTargetingValue custom targeting values} from different
 *             {@link CustomTargetingKey custom targeting keys} ANDed together.
 *           
 * 
 * <p>Java class for ContentMetadataKeyHierarchyTargeting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentMetadataKeyHierarchyTargeting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customTargetingValueIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentMetadataKeyHierarchyTargeting", propOrder = {
    "customTargetingValueIds"
})
public class ContentMetadataKeyHierarchyTargeting {

    @XmlElement(type = Long.class)
    protected List<Long> customTargetingValueIds;

    /**
     * Gets the value of the customTargetingValueIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customTargetingValueIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomTargetingValueIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getCustomTargetingValueIds() {
        if (customTargetingValueIds == null) {
            customTargetingValueIds = new ArrayList<Long>();
        }
        return this.customTargetingValueIds;
    }

}
