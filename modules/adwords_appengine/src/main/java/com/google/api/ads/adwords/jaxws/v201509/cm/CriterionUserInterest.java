
package com.google.api.ads.adwords.jaxws.v201509.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             User Interest represents a particular interest-based vertical to be targeted.
 *             <span class="constraint AdxEnabled">This is enabled for AdX.</span>
 *           
 * 
 * <p>Java class for CriterionUserInterest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CriterionUserInterest">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201509}Criterion">
 *       &lt;sequence>
 *         &lt;element name="userInterestId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="userInterestParentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="userInterestName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CriterionUserInterest", propOrder = {
    "userInterestId",
    "userInterestParentId",
    "userInterestName"
})
public class CriterionUserInterest
    extends Criterion
{

    protected Long userInterestId;
    protected Long userInterestParentId;
    protected String userInterestName;

    /**
     * Gets the value of the userInterestId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUserInterestId() {
        return userInterestId;
    }

    /**
     * Sets the value of the userInterestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUserInterestId(Long value) {
        this.userInterestId = value;
    }

    /**
     * Gets the value of the userInterestParentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUserInterestParentId() {
        return userInterestParentId;
    }

    /**
     * Sets the value of the userInterestParentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUserInterestParentId(Long value) {
        this.userInterestParentId = value;
    }

    /**
     * Gets the value of the userInterestName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserInterestName() {
        return userInterestName;
    }

    /**
     * Sets the value of the userInterestName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserInterestName(String value) {
        this.userInterestName = value;
    }

}
