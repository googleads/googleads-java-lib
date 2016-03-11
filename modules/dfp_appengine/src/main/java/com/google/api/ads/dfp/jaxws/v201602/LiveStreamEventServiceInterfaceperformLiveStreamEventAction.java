
package com.google.api.ads.dfp.jaxws.v201602;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Performs actions on {@link LiveStreamEvent} objects that match the given
 *             {@link Statement#query}.
 *             
 *             @param liveStreamEventAction the action to perform
 *             @param filterStatement a Publisher Query Language statement used to filter
 *             a set of live stream events
 *             @return the result of the action performed
 *           
 * 
 * <p>Java class for performLiveStreamEventAction element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="performLiveStreamEventAction">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="liveStreamEventAction" type="{https://www.google.com/apis/ads/publisher/v201602}LiveStreamEventAction" minOccurs="0"/>
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
    "liveStreamEventAction",
    "filterStatement"
})
@XmlRootElement(name = "performLiveStreamEventAction")
public class LiveStreamEventServiceInterfaceperformLiveStreamEventAction {

    protected LiveStreamEventAction liveStreamEventAction;
    protected Statement filterStatement;

    /**
     * Gets the value of the liveStreamEventAction property.
     * 
     * @return
     *     possible object is
     *     {@link LiveStreamEventAction }
     *     
     */
    public LiveStreamEventAction getLiveStreamEventAction() {
        return liveStreamEventAction;
    }

    /**
     * Sets the value of the liveStreamEventAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiveStreamEventAction }
     *     
     */
    public void setLiveStreamEventAction(LiveStreamEventAction value) {
        this.liveStreamEventAction = value;
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
