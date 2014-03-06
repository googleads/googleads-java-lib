
package com.google.api.ads.dfp.jaxws.v201308;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the actions that can be performed on {@link UserTeamAssociation}
 *             objects.
 *           
 * 
 * <p>Java class for UserTeamAssociationAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserTeamAssociationAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserTeamAssociationAction.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserTeamAssociationAction", propOrder = {
    "userTeamAssociationActionType"
})
@XmlSeeAlso({
    DeleteUserTeamAssociations.class
})
public abstract class UserTeamAssociationAction {

    @XmlElement(name = "UserTeamAssociationAction.Type")
    protected String userTeamAssociationActionType;

    /**
     * Gets the value of the userTeamAssociationActionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserTeamAssociationActionType() {
        return userTeamAssociationActionType;
    }

    /**
     * Sets the value of the userTeamAssociationActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserTeamAssociationActionType(String value) {
        this.userTeamAssociationActionType = value;
    }

}
