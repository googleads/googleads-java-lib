
package com.google.api.ads.dfp.jaxws.v201505;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Contains data used to display information synchronized with Canoe for set-top box enabled
 *             {@link LineItem line items}.
 *           
 * 
 * <p>Java class for SetTopBoxInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetTopBoxInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="syncStatus" type="{https://www.google.com/apis/ads/publisher/v201505}SetTopBoxSyncStatus" minOccurs="0"/>
 *         &lt;element name="lastSyncResult" type="{https://www.google.com/apis/ads/publisher/v201505}CanoeSyncResult" minOccurs="0"/>
 *         &lt;element name="lastSyncCanoeResponseMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nielsenProductCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetTopBoxInfo", propOrder = {
    "syncStatus",
    "lastSyncResult",
    "lastSyncCanoeResponseMessage",
    "nielsenProductCategoryCode"
})
public class SetTopBoxInfo {

    protected SetTopBoxSyncStatus syncStatus;
    protected CanoeSyncResult lastSyncResult;
    protected String lastSyncCanoeResponseMessage;
    protected String nielsenProductCategoryCode;

    /**
     * Gets the value of the syncStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SetTopBoxSyncStatus }
     *     
     */
    public SetTopBoxSyncStatus getSyncStatus() {
        return syncStatus;
    }

    /**
     * Sets the value of the syncStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetTopBoxSyncStatus }
     *     
     */
    public void setSyncStatus(SetTopBoxSyncStatus value) {
        this.syncStatus = value;
    }

    /**
     * Gets the value of the lastSyncResult property.
     * 
     * @return
     *     possible object is
     *     {@link CanoeSyncResult }
     *     
     */
    public CanoeSyncResult getLastSyncResult() {
        return lastSyncResult;
    }

    /**
     * Sets the value of the lastSyncResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CanoeSyncResult }
     *     
     */
    public void setLastSyncResult(CanoeSyncResult value) {
        this.lastSyncResult = value;
    }

    /**
     * Gets the value of the lastSyncCanoeResponseMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastSyncCanoeResponseMessage() {
        return lastSyncCanoeResponseMessage;
    }

    /**
     * Sets the value of the lastSyncCanoeResponseMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastSyncCanoeResponseMessage(String value) {
        this.lastSyncCanoeResponseMessage = value;
    }

    /**
     * Gets the value of the nielsenProductCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNielsenProductCategoryCode() {
        return nielsenProductCategoryCode;
    }

    /**
     * Sets the value of the nielsenProductCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNielsenProductCategoryCode(String value) {
        this.nielsenProductCategoryCode = value;
    }

}
