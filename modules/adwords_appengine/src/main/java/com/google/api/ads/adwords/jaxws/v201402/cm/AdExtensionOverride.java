
package com.google.api.ads.adwords.jaxws.v201402.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents an ad level ad extension override. An ad extension override
 *             specifies the ad extension that must be used if the ad is served with
 *             any ad extension data.
 *           
 * 
 * <p>Java class for AdExtensionOverride complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdExtensionOverride">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="adExtension" type="{https://adwords.google.com/api/adwords/cm/v201402}AdExtension" minOccurs="0"/>
 *         &lt;element name="overrideInfo" type="{https://adwords.google.com/api/adwords/cm/v201402}OverrideInfo" minOccurs="0"/>
 *         &lt;element name="status" type="{https://adwords.google.com/api/adwords/cm/v201402}AdExtensionOverride.Status" minOccurs="0"/>
 *         &lt;element name="approvalStatus" type="{https://adwords.google.com/api/adwords/cm/v201402}AdExtensionOverride.ApprovalStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdExtensionOverride", propOrder = {
    "adId",
    "adExtension",
    "overrideInfo",
    "status",
    "approvalStatus"
})
public class AdExtensionOverride {

    protected Long adId;
    protected AdExtension adExtension;
    protected OverrideInfo overrideInfo;
    protected AdExtensionOverrideStatus status;
    protected AdExtensionOverrideApprovalStatus approvalStatus;

    /**
     * Gets the value of the adId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdId() {
        return adId;
    }

    /**
     * Sets the value of the adId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdId(Long value) {
        this.adId = value;
    }

    /**
     * Gets the value of the adExtension property.
     * 
     * @return
     *     possible object is
     *     {@link AdExtension }
     *     
     */
    public AdExtension getAdExtension() {
        return adExtension;
    }

    /**
     * Sets the value of the adExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdExtension }
     *     
     */
    public void setAdExtension(AdExtension value) {
        this.adExtension = value;
    }

    /**
     * Gets the value of the overrideInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OverrideInfo }
     *     
     */
    public OverrideInfo getOverrideInfo() {
        return overrideInfo;
    }

    /**
     * Sets the value of the overrideInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverrideInfo }
     *     
     */
    public void setOverrideInfo(OverrideInfo value) {
        this.overrideInfo = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link AdExtensionOverrideStatus }
     *     
     */
    public AdExtensionOverrideStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdExtensionOverrideStatus }
     *     
     */
    public void setStatus(AdExtensionOverrideStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the approvalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AdExtensionOverrideApprovalStatus }
     *     
     */
    public AdExtensionOverrideApprovalStatus getApprovalStatus() {
        return approvalStatus;
    }

    /**
     * Sets the value of the approvalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdExtensionOverrideApprovalStatus }
     *     
     */
    public void setApprovalStatus(AdExtensionOverrideApprovalStatus value) {
        this.approvalStatus = value;
    }

}
