
package com.google.api.ads.adwords.jaxws.v201309.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a mobile ad.
 *             
 *             <p>
 *             A mobile ad can contain a click-to-call phone number, a link to a website,
 *             or both.  You specify which features you want by setting certain fields, as
 *             shown in the following table.  For example, to create a click-to-call mobile
 *             ad, set the fields in the <b>Click-to-call</b> column. A hyphen indicates
 *             that you should not set the corresponding field.
 *             </p>
 *             <p>
 *             For more information, see
 *             <a href="//support.google.com/adwords/bin/answer.py?answer=2472720">
 *             Create a mobile ad</a>.
 *             </p>
 *             
 *             <table summary="" style="clear: none">
 *             <tr> <th scope="col"> Click-to-call </th>
 *             <th scope="col"> Website       </th>
 *             <th scope="col"> Both          </th></tr>
 *             <tr> <td> headline        <br />
 *             description     <br />
 *             mobileCarriers  <br />
 *             phoneNumber     <br />
 *             countryCode     <br />
 *             businessName    <br />
 *             -               <br />
 *             -               <br />
 *             -               <br />
 *             </td>
 *             <td> headline        <br />
 *             description     <br />
 *             mobileCarriers  <br />
 *             -               <br />
 *             -               <br />
 *             -               <br />
 *             displayUrl      <br />
 *             destinationUrl  <br />
 *             markupLanguages <br />
 *             </td>
 *             <td> headline        <br />
 *             description     <br />
 *             mobileCarriers  <br />
 *             phoneNumber     <br />
 *             countryCode     <br />
 *             businessName    <br />
 *             displayUrl      <br />
 *             destinationUrl  <br />
 *             markupLanguages <br />
 *             </td></tr>
 *             </table>
 *             <span class="constraint AdxEnabled">This is disabled for AdX when it is contained within Operators: ADD, SET.</span>
 *           
 * 
 * <p>Java class for MobileAd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobileAd">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201309}Ad">
 *       &lt;sequence>
 *         &lt;element name="headline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="markupLanguages" type="{https://adwords.google.com/api/adwords/cm/v201309}MarkupLanguageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="mobileCarriers" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="businessName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileAd", propOrder = {
    "headline",
    "description",
    "markupLanguages",
    "mobileCarriers",
    "businessName",
    "countryCode",
    "phoneNumber"
})
public class MobileAd
    extends Ad
{

    protected String headline;
    protected String description;
    protected List<MarkupLanguageType> markupLanguages;
    protected List<String> mobileCarriers;
    protected String businessName;
    protected String countryCode;
    protected String phoneNumber;

    /**
     * Gets the value of the headline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadline() {
        return headline;
    }

    /**
     * Sets the value of the headline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadline(String value) {
        this.headline = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the markupLanguages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the markupLanguages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarkupLanguages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarkupLanguageType }
     * 
     * 
     */
    public List<MarkupLanguageType> getMarkupLanguages() {
        if (markupLanguages == null) {
            markupLanguages = new ArrayList<MarkupLanguageType>();
        }
        return this.markupLanguages;
    }

    /**
     * Gets the value of the mobileCarriers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mobileCarriers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMobileCarriers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMobileCarriers() {
        if (mobileCarriers == null) {
            mobileCarriers = new ArrayList<String>();
        }
        return this.mobileCarriers;
    }

    /**
     * Gets the value of the businessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Sets the value of the businessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessName(String value) {
        this.businessName = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

}
