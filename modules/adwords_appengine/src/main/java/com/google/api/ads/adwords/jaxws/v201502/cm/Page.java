
package com.google.api.ads.adwords.jaxws.v201502.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201502.billing.BudgetOrderPage;
import com.google.api.ads.adwords.jaxws.v201502.mcm.ManagedCustomerPage;
import com.google.api.ads.adwords.jaxws.v201502.rm.UserListPage;


/**
 * 
 *             Contains the results from a get call.
 *           
 * 
 * <p>Java class for Page complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Page">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="totalNumEntries" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Page.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Page", propOrder = {
    "totalNumEntries",
    "pageType"
})
@XmlSeeAlso({
    CampaignExtensionSettingPage.class,
    AdGroupExtensionSettingPage.class,
    AdCustomizerFeedPage.class,
    DomainCategoryPage.class,
    AdGroupCriterionPage.class,
    CustomerExtensionSettingPage.class,
    AdGroupPage.class,
    AdGroupAdPage.class,
    BudgetPage.class,
    ExperimentPage.class,
    SharedCriterionPage.class,
    CampaignCriterionPage.class,
    NullStatsPage.class,
    AdGroupBidModifierPage.class,
    com.google.api.ads.adwords.jaxws.v201502.cm.NoStatsPage.class,
    CampaignPage.class,
    BiddingStrategyPage.class,
    UserListPage.class,
    BudgetOrderPage.class,
    com.google.api.ads.adwords.jaxws.v201502.express.NoStatsPage.class,
    ManagedCustomerPage.class
})
public abstract class Page {

    protected Integer totalNumEntries;
    @XmlElement(name = "Page.Type")
    protected String pageType;

    /**
     * Gets the value of the totalNumEntries property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalNumEntries() {
        return totalNumEntries;
    }

    /**
     * Sets the value of the totalNumEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalNumEntries(Integer value) {
        this.totalNumEntries = value;
    }

    /**
     * Gets the value of the pageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageType() {
        return pageType;
    }

    /**
     * Sets the value of the pageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageType(String value) {
        this.pageType = value;
    }

}
