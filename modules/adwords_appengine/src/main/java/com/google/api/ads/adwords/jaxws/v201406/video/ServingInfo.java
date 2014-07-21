
package com.google.api.ads.adwords.jaxws.v201406.video;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             ServingInfo has all information relative to how an entity (e.g. Campaign, VideoAd,...)
 *             serves ads. This includes the {ServingStatus} and optionally a set of {ServingIssue}s.
 *             {@link ServingStatus#IMPROVABLE} and {@link ServingStatus#BROKEN} must have a set of issues.
 *             When returning from an API service such as VideoAdService, the ServingInfo will always be set
 *             to {@link #UNDEFINED}. Only the ServingIssuesService will create real ServingInfo objects.
 *           
 * 
 * <p>Java class for ServingInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServingInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="issues" type="{https://adwords.google.com/api/adwords/video/v201406}ServingIssue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="servingStatus" type="{https://adwords.google.com/api/adwords/video/v201406}ServingStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServingInfo", propOrder = {
    "issues",
    "servingStatus"
})
public class ServingInfo {

    protected List<ServingIssue> issues;
    protected ServingStatus servingStatus;

    /**
     * Gets the value of the issues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServingIssue }
     * 
     * 
     */
    public List<ServingIssue> getIssues() {
        if (issues == null) {
            issues = new ArrayList<ServingIssue>();
        }
        return this.issues;
    }

    /**
     * Gets the value of the servingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ServingStatus }
     *     
     */
    public ServingStatus getServingStatus() {
        return servingStatus;
    }

    /**
     * Sets the value of the servingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServingStatus }
     *     
     */
    public void setServingStatus(ServingStatus value) {
        this.servingStatus = value;
    }

}
