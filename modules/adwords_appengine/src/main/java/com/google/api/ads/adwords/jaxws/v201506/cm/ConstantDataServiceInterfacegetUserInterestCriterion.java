
package com.google.api.ads.adwords.jaxws.v201506.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Returns a list of user interests.
 *             
 *             @param userInterestTaxonomyType The type of taxonomy to use when requesting user interests.
 *             @return A list of user interests.
 *             @throws ApiException when there is at least one error with the request.
 *           
 * 
 * <p>Java class for getUserInterestCriterion element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getUserInterestCriterion">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="userInterestTaxonomyType" type="{https://adwords.google.com/api/adwords/cm/v201506}ConstantDataService.UserInterestTaxonomyType" minOccurs="0"/>
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
    "userInterestTaxonomyType"
})
@XmlRootElement(name = "getUserInterestCriterion")
public class ConstantDataServiceInterfacegetUserInterestCriterion {

    protected ConstantDataServiceUserInterestTaxonomyType userInterestTaxonomyType;

    /**
     * Gets the value of the userInterestTaxonomyType property.
     * 
     * @return
     *     possible object is
     *     {@link ConstantDataServiceUserInterestTaxonomyType }
     *     
     */
    public ConstantDataServiceUserInterestTaxonomyType getUserInterestTaxonomyType() {
        return userInterestTaxonomyType;
    }

    /**
     * Sets the value of the userInterestTaxonomyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstantDataServiceUserInterestTaxonomyType }
     *     
     */
    public void setUserInterestTaxonomyType(ConstantDataServiceUserInterestTaxonomyType value) {
        this.userInterestTaxonomyType = value;
    }

}
