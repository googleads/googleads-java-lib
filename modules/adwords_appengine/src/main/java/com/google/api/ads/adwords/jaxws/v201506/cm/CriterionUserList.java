
package com.google.api.ads.adwords.jaxws.v201506.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             UserList - represents a user list that is defined by the advertiser to be targeted.
 *             <span class="constraint AdxEnabled">This is enabled for AdX.</span>
 *           
 * 
 * <p>Java class for CriterionUserList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CriterionUserList">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201506}Criterion">
 *       &lt;sequence>
 *         &lt;element name="userListId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="userListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userListMembershipStatus" type="{https://adwords.google.com/api/adwords/cm/v201506}CriterionUserList.MembershipStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CriterionUserList", propOrder = {
    "userListId",
    "userListName",
    "userListMembershipStatus"
})
public class CriterionUserList
    extends Criterion
{

    protected Long userListId;
    protected String userListName;
    protected CriterionUserListMembershipStatus userListMembershipStatus;

    /**
     * Gets the value of the userListId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUserListId() {
        return userListId;
    }

    /**
     * Sets the value of the userListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUserListId(Long value) {
        this.userListId = value;
    }

    /**
     * Gets the value of the userListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserListName() {
        return userListName;
    }

    /**
     * Sets the value of the userListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserListName(String value) {
        this.userListName = value;
    }

    /**
     * Gets the value of the userListMembershipStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CriterionUserListMembershipStatus }
     *     
     */
    public CriterionUserListMembershipStatus getUserListMembershipStatus() {
        return userListMembershipStatus;
    }

    /**
     * Sets the value of the userListMembershipStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriterionUserListMembershipStatus }
     *     
     */
    public void setUserListMembershipStatus(CriterionUserListMembershipStatus value) {
        this.userListMembershipStatus = value;
    }

}
