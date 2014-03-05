
package com.google.api.ads.dfp.jaxws.v201211;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Creates a new {@code UserTeamAssociation}.
 *             
 *             The following fields are required:
 *             <ul>
 *             <li>{@link UserTeamAssociation#teamId}</li>
 *             <li>{@link UserTeamAssociation#userId}</li>
 *             </ul>
 *             
 *             @param userTeamAssociation the user team association to create
 *             @return the user team association with its ID filled in
 *           
 * 
 * <p>Java class for createUserTeamAssociation element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="createUserTeamAssociation">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="userTeamAssociation" type="{https://www.google.com/apis/ads/publisher/v201211}UserTeamAssociation" minOccurs="0"/>
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
@XmlRootElement(name = "createUserTeamAssociation")
public class UserTeamAssociationServiceInterfacecreateUserTeamAssociation {

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
