
package com.google.api.ads.dfp.jaxws.v201602;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Performs the given {@link AudienceSegmentAction} on the set of segments identified by the given
 *             statement.
 *             
 *             @param action {@link AudienceSegmentAction} to perform
 *             @param filterStatement a Publisher Query Language statement used to filter a set of audience
 *             segments
 *             @return {@link UpdateResult} indicating the result
 *           
 * 
 * <p>Java class for performAudienceSegmentAction element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="performAudienceSegmentAction">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="action" type="{https://www.google.com/apis/ads/publisher/v201602}AudienceSegmentAction" minOccurs="0"/>
 *           &lt;element name="filterStatement" type="{https://www.google.com/apis/ads/publisher/v201602}Statement" minOccurs="0"/>
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
    "action",
    "filterStatement"
})
@XmlRootElement(name = "performAudienceSegmentAction")
public class AudienceSegmentServiceInterfaceperformAudienceSegmentAction {

    protected AudienceSegmentAction action;
    protected Statement filterStatement;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link AudienceSegmentAction }
     *     
     */
    public AudienceSegmentAction getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudienceSegmentAction }
     *     
     */
    public void setAction(AudienceSegmentAction value) {
        this.action = value;
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
