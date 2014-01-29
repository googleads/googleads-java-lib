
package com.google.api.ads.dfp.jaxws.v201308;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Returns the {@link UserTeamAssociation} uniquely identified by the given
 *             user and team IDs.
 *             
 *             @param teamId the ID of the team, which must already exist
 *             @param userId the ID of the user, which must already exist
 *             @return the {@code UserTeamAssociation} uniquely identified by the
 *             user and team IDs
 *           
 * 
 * <p>Java class for getUserTeamAssociation element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getUserTeamAssociation">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="teamId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *           &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
    "teamId",
    "userId"
})
@XmlRootElement(name = "getUserTeamAssociation")
public class UserTeamAssociationServiceInterfacegetUserTeamAssociation {

    protected Long teamId;
    protected Long userId;

    /**
     * Gets the value of the teamId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTeamId() {
        return teamId;
    }

    /**
     * Sets the value of the teamId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTeamId(Long value) {
        this.teamId = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUserId(Long value) {
        this.userId = value;
    }

}
