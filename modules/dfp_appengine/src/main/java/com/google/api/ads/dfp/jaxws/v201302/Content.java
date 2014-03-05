
package com.google.api.ads.dfp.jaxws.v201302;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code Content} represents video metadata from a publisher's
 *             Content Management System (CMS) that has been synced to DFP.
 *             <p>
 *             Video line items can be targeted to {@code Content}
 *             to indicate what ads should match when the {@code Content} is being played.
 *           
 * 
 * <p>Java class for Content complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Content">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{https://www.google.com/apis/ads/publisher/v201302}ContentStatus" minOccurs="0"/>
 *         &lt;element name="statusDefinedBy" type="{https://www.google.com/apis/ads/publisher/v201302}ContentStatusDefinedBy" minOccurs="0"/>
 *         &lt;element name="cmsSources" type="{https://www.google.com/apis/ads/publisher/v201302}CmsContent" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Content", propOrder = {
    "id",
    "name",
    "status",
    "statusDefinedBy",
    "cmsSources"
})
public class Content {

    protected Long id;
    protected String name;
    protected ContentStatus status;
    protected ContentStatusDefinedBy statusDefinedBy;
    protected List<CmsContent> cmsSources;

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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ContentStatus }
     *     
     */
    public ContentStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentStatus }
     *     
     */
    public void setStatus(ContentStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusDefinedBy property.
     * 
     * @return
     *     possible object is
     *     {@link ContentStatusDefinedBy }
     *     
     */
    public ContentStatusDefinedBy getStatusDefinedBy() {
        return statusDefinedBy;
    }

    /**
     * Sets the value of the statusDefinedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentStatusDefinedBy }
     *     
     */
    public void setStatusDefinedBy(ContentStatusDefinedBy value) {
        this.statusDefinedBy = value;
    }

    /**
     * Gets the value of the cmsSources property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cmsSources property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCmsSources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CmsContent }
     * 
     * 
     */
    public List<CmsContent> getCmsSources() {
        if (cmsSources == null) {
            cmsSources = new ArrayList<CmsContent>();
        }
        return this.cmsSources;
    }

}
