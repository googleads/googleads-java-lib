
package com.google.api.ads.adwords.jaxws.v201402.video;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             YouTube video call-to-action overlay.
 *             
 *             <p>A call-to-action is composed of creative data (headline, description lines, etc) that is
 *             displayed as an overlay on a YouTube video. Each YouTube video can have at most one
 *             call-to-action that is always displayed when a user views the video on the YouTube site.
 *             
 *             <p>The call-to-action also contains url data: a display url that is displayed as a part of the
 *             overlay and a destination url that determines where the user is redirected if they click on the
 *             call-to-action.
 *           
 * 
 * <p>Java class for CallToAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CallToAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creative" type="{https://adwords.google.com/api/adwords/video/v201402}CallToAction.Creative" minOccurs="0"/>
 *         &lt;element name="isEnabledOnMobile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="status" type="{https://adwords.google.com/api/adwords/video/v201402}CallToAction.Status" minOccurs="0"/>
 *         &lt;element name="policyViolations" type="{https://adwords.google.com/api/adwords/video/v201402}CallToAction.PolicyViolation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallToAction", propOrder = {
    "creative",
    "isEnabledOnMobile",
    "status",
    "policyViolations"
})
public class CallToAction {

    protected CallToActionCreative creative;
    protected Boolean isEnabledOnMobile;
    protected CallToActionStatus status;
    protected List<CallToActionPolicyViolation> policyViolations;

    /**
     * Gets the value of the creative property.
     * 
     * @return
     *     possible object is
     *     {@link CallToActionCreative }
     *     
     */
    public CallToActionCreative getCreative() {
        return creative;
    }

    /**
     * Sets the value of the creative property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallToActionCreative }
     *     
     */
    public void setCreative(CallToActionCreative value) {
        this.creative = value;
    }

    /**
     * Gets the value of the isEnabledOnMobile property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEnabledOnMobile() {
        return isEnabledOnMobile;
    }

    /**
     * Sets the value of the isEnabledOnMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEnabledOnMobile(Boolean value) {
        this.isEnabledOnMobile = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CallToActionStatus }
     *     
     */
    public CallToActionStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallToActionStatus }
     *     
     */
    public void setStatus(CallToActionStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the policyViolations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policyViolations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicyViolations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CallToActionPolicyViolation }
     * 
     * 
     */
    public List<CallToActionPolicyViolation> getPolicyViolations() {
        if (policyViolations == null) {
            policyViolations = new ArrayList<CallToActionPolicyViolation>();
        }
        return this.policyViolations;
    }

}
