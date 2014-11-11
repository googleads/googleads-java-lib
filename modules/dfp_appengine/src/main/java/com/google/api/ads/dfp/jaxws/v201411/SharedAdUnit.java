
package com.google.api.ads.dfp.jaxws.v201411;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             An ad unit that is shared from a distributor network.
 *           
 * 
 * <p>Java class for SharedAdUnit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SharedAdUnit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distributorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contentProviderAdUnitId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="status" type="{https://www.google.com/apis/ads/publisher/v201411}SharedAdUnitStatus" minOccurs="0"/>
 *         &lt;element name="targetPlatform" type="{https://www.google.com/apis/ads/publisher/v201411}TargetPlatform" minOccurs="0"/>
 *         &lt;element name="targetWindow" type="{https://www.google.com/apis/ads/publisher/v201411}AdUnit.TargetWindow" minOccurs="0"/>
 *         &lt;element name="adUnitSizes" type="{https://www.google.com/apis/ads/publisher/v201411}AdUnitSize" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SharedAdUnit", propOrder = {
    "id",
    "name",
    "distributorName",
    "contentProviderAdUnitId",
    "status",
    "targetPlatform",
    "targetWindow",
    "adUnitSizes"
})
public class SharedAdUnit {

    protected Long id;
    protected String name;
    protected String distributorName;
    protected Long contentProviderAdUnitId;
    protected SharedAdUnitStatus status;
    protected TargetPlatform targetPlatform;
    protected AdUnitTargetWindow targetWindow;
    protected List<AdUnitSize> adUnitSizes;

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
     * Gets the value of the distributorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistributorName() {
        return distributorName;
    }

    /**
     * Sets the value of the distributorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistributorName(String value) {
        this.distributorName = value;
    }

    /**
     * Gets the value of the contentProviderAdUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContentProviderAdUnitId() {
        return contentProviderAdUnitId;
    }

    /**
     * Sets the value of the contentProviderAdUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContentProviderAdUnitId(Long value) {
        this.contentProviderAdUnitId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link SharedAdUnitStatus }
     *     
     */
    public SharedAdUnitStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharedAdUnitStatus }
     *     
     */
    public void setStatus(SharedAdUnitStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the targetPlatform property.
     * 
     * @return
     *     possible object is
     *     {@link TargetPlatform }
     *     
     */
    public TargetPlatform getTargetPlatform() {
        return targetPlatform;
    }

    /**
     * Sets the value of the targetPlatform property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetPlatform }
     *     
     */
    public void setTargetPlatform(TargetPlatform value) {
        this.targetPlatform = value;
    }

    /**
     * Gets the value of the targetWindow property.
     * 
     * @return
     *     possible object is
     *     {@link AdUnitTargetWindow }
     *     
     */
    public AdUnitTargetWindow getTargetWindow() {
        return targetWindow;
    }

    /**
     * Sets the value of the targetWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdUnitTargetWindow }
     *     
     */
    public void setTargetWindow(AdUnitTargetWindow value) {
        this.targetWindow = value;
    }

    /**
     * Gets the value of the adUnitSizes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adUnitSizes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdUnitSizes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdUnitSize }
     * 
     * 
     */
    public List<AdUnitSize> getAdUnitSizes() {
        if (adUnitSizes == null) {
            adUnitSizes = new ArrayList<AdUnitSize>();
        }
        return this.adUnitSizes;
    }

}
