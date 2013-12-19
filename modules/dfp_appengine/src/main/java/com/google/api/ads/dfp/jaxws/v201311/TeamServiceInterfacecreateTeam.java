
package com.google.api.ads.dfp.jaxws.v201311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Creates a new {@code Team}.
 *             
 *             The following fields are required:
 *             <ul>
 *             <li>{@link Team#name}</li>
 *             </ul>
 *             
 *             @param team the team to create
 *             @return the team with its ID filled in
 *           
 * 
 * <p>Java class for createTeam element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="createTeam">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="team" type="{https://www.google.com/apis/ads/publisher/v201311}Team" minOccurs="0"/>
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
    "team"
})
@XmlRootElement(name = "createTeam")
public class TeamServiceInterfacecreateTeam {

    protected Team team;

    /**
     * Gets the value of the team property.
     * 
     * @return
     *     possible object is
     *     {@link Team }
     *     
     */
    public Team getTeam() {
        return team;
    }

    /**
     * Sets the value of the team property.
     * 
     * @param value
     *     allowed object is
     *     {@link Team }
     *     
     */
    public void setTeam(Team value) {
        this.team = value;
    }

}
