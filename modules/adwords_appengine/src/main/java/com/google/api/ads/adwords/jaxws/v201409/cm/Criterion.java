
package com.google.api.ads.adwords.jaxws.v201409.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201409.express.KeywordGroup;
import com.google.api.ads.adwords.jaxws.v201409.express.KeywordSet;
import com.google.api.ads.adwords.jaxws.v201409.express.NegativeCriterion;
import com.google.api.ads.adwords.jaxws.v201409.express.ProductService;


/**
 * 
 *             Represents a criterion (such as a keyword, placement, or vertical).
 *             <span class="constraint AdxEnabled">This is disabled for AdX when it is contained within Operators: ADD, SET.</span>
 *           
 * 
 * <p>Java class for Criterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Criterion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="type" type="{https://adwords.google.com/api/adwords/cm/v201409}Criterion.Type" minOccurs="0"/>
 *         &lt;element name="Criterion.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Criterion", propOrder = {
    "id",
    "type",
    "criterionType"
})
@XmlSeeAlso({
    Platform.class,
    Placement.class,
    CriterionUserList.class,
    MobileAppCategory.class,
    ProductScope.class,
    OperatingSystemVersion.class,
    Webpage.class,
    AppPaymentModel.class,
    LocationGroups.class,
    Proximity.class,
    Product.class,
    Location.class,
    CriterionUserInterest.class,
    MobileDevice.class,
    ContentLabel.class,
    Language.class,
    ProductPartition.class,
    Gender.class,
    AgeRange.class,
    Carrier.class,
    Vertical.class,
    AdSchedule.class,
    IpBlock.class,
    MobileApplication.class,
    KeywordGroup.class,
    NegativeCriterion.class,
    Keyword.class,
    ProductService.class,
    KeywordSet.class
})
public class Criterion {

    protected Long id;
    protected CriterionType type;
    @XmlElement(name = "Criterion.Type")
    protected String criterionType;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CriterionType }
     *     
     */
    public CriterionType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriterionType }
     *     
     */
    public void setType(CriterionType value) {
        this.type = value;
    }

    /**
     * Gets the value of the criterionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriterionType() {
        return criterionType;
    }

    /**
     * Sets the value of the criterionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriterionType(String value) {
        this.criterionType = value;
    }

}
