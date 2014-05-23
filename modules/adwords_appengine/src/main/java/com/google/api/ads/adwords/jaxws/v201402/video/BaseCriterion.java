
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a criterion (such as a keyword, videos, or vertical).
 *           
 * 
 * <p>Java class for BaseCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseCriterion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="BaseCriterion.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseCriterion", propOrder = {
    "id",
    "baseCriterionType"
})
@XmlSeeAlso({
    AudienceAge.class,
    Channel.class,
    MobileAppCategoryVideoCriterion.class,
    YouTubePlacement.class,
    PlatformVideoCriterion.class,
    RunOfYoutube.class,
    AudienceGender.class,
    OperatingSystemVersionVideoCriterion.class,
    LocationVideoCriterion.class,
    CarrierVideoCriterion.class,
    MobileDeviceVideoCriterion.class,
    AudienceUserList.class,
    Topic.class,
    ContentCategoryLabel.class,
    AdScheduleVideoCriterion.class,
    MobileApplicationVideoCriterion.class,
    WebSite.class,
    AudienceInterest.class,
    LanguageVideoCriterion.class,
    BaseKeyword.class,
    VideoCriterion.class
})
public abstract class BaseCriterion {

    protected Long id;
    @XmlElement(name = "BaseCriterion.Type")
    protected String baseCriterionType;

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
     * Gets the value of the baseCriterionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCriterionType() {
        return baseCriterionType;
    }

    /**
     * Sets the value of the baseCriterionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseCriterionType(String value) {
        this.baseCriterionType = value;
    }

}
