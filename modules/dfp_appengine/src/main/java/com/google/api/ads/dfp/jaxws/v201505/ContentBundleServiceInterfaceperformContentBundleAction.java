
package com.google.api.ads.dfp.jaxws.v201505;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Performs actions on {@link ContentBundle} objects that match the given
 *             {@link Statement#query}.
 *             
 *             @param contentBundleAction the action to perform
 *             @param filterStatement a Publisher Query Language statement used to filter
 *             a set of content bundles
 *             @return the result of the action performed
 *           
 * 
 * <p>Java class for performContentBundleAction element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="performContentBundleAction">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="contentBundleAction" type="{https://www.google.com/apis/ads/publisher/v201505}ContentBundleAction" minOccurs="0"/>
 *           &lt;element name="filterStatement" type="{https://www.google.com/apis/ads/publisher/v201505}Statement" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "contentBundleAction",
    "filterStatement"
})
@XmlRootElement(name = "performContentBundleAction")
public class ContentBundleServiceInterfaceperformContentBundleAction {

    protected ContentBundleAction contentBundleAction;
    protected Statement filterStatement;

    /**
     * Gets the value of the contentBundleAction property.
     * 
     * @return
     *     possible object is
     *     {@link ContentBundleAction }
     *     
     */
    public ContentBundleAction getContentBundleAction() {
        return contentBundleAction;
    }

    /**
     * Sets the value of the contentBundleAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentBundleAction }
     *     
     */
    public void setContentBundleAction(ContentBundleAction value) {
        this.contentBundleAction = value;
    }

    /**
     * Gets the value of the filterStatement property.
     * 
     * @return
     *     possible object is
     *     {@link Statement }
     *     
     */
    public Statement getFilterStatement() {
        return filterStatement;
    }

    /**
     * Sets the value of the filterStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement }
     *     
     */
    public void setFilterStatement(Statement value) {
        this.filterStatement = value;
    }

}
