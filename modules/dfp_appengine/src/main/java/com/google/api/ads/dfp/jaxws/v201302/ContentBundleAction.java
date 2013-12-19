
package com.google.api.ads.dfp.jaxws.v201302;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the actions that can be performed on {@link ContentBundle} objects.
 *           
 * 
 * <p>Java class for ContentBundleAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentBundleAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContentBundleAction.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentBundleAction", propOrder = {
    "contentBundleActionType"
})
@XmlSeeAlso({
    ActivateContentBundles.class,
    ExcludeContentFromContentBundle.class,
    DeactivateContentBundles.class,
    IncludeContentInContentBundle.class
})
public abstract class ContentBundleAction {

    @XmlElement(name = "ContentBundleAction.Type")
    protected String contentBundleActionType;

    /**
     * Gets the value of the contentBundleActionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentBundleActionType() {
        return contentBundleActionType;
    }

    /**
     * Sets the value of the contentBundleActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentBundleActionType(String value) {
        this.contentBundleActionType = value;
    }

}
