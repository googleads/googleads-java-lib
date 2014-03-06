
package com.google.api.ads.dfp.jaxws.v201208;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Updates the specified {@link UserTeamAssociation}.
 *             
 *             @param userTeamAssociation the user team association to update
 *             @return the updated user team association
 *           
 * 
 * <p>Java class for updateUserTeamAssociation element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="updateUserTeamAssociation">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="userTeamAssociation" type="{https://www.google.com/apis/ads/publisher/v201208}UserTeamAssociation" minOccurs="0"/>
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
    "userTeamAssociation"
})
@XmlRootElement(name = "updateUserTeamAssociation")
public class UserTeamAssociationServiceInterfaceupdateUserTeamAssociation {

    protected UserTeamAssociation userTeamAssociation;

    /**
     * Gets the value of the userTeamAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link UserTeamAssociation }
     *     
     */
    public UserTeamAssociation getUserTeamAssociation() {
        return userTeamAssociation;
    }

    /**
     * Sets the value of the userTeamAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserTeamAssociation }
     *     
     */
    public void setUserTeamAssociation(UserTeamAssociation value) {
        this.userTeamAssociation = value;
    }

}
